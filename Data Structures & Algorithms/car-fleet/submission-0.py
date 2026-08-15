class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:

        # Combine position and speed
        cars = list(zip(position, speed))

        # Sort cars from closest to target to farthest
        cars.sort(reverse=True)

        stack = []

        for pos, spd in cars:

            # Time required for this car to reach target
            time = (target - pos) / spd

            # If this car takes longer than the fleet ahead,
            # it cannot catch that fleet -> new fleet.
            if not stack or time > stack[-1]:
                stack.append(time)

            # If time <= stack[-1],
            # this car catches the fleet ahead -> same fleet.

        return len(stack)