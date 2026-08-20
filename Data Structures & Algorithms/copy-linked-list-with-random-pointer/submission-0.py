"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        if head is None:
            return None

        Map = {}

        # 1. Create a copy of every node
        current = head

        while current:
            Map[current] = Node(current.val)
            current = current.next

        # 2. Connect next and random pointers
        current = head

        while current:
            copy = Map[current]

            copy.next = Map.get(current.next)
            copy.random = Map.get(current.random)

            current = current.next
        return Map[head]









