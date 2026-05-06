public class Solution {
    public int countComponents(int n, int[][] edges) {

        List<List<Integer>> graph = new ArrayList<>();
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        int count = 0;

        for (int node = 0; node < n; node++) {
            if (!visited[node]) {
                bfs(graph, visited, node);
                count++;
            }
        }

        return count;
    }

    private void bfs(List<List<Integer>> graph, boolean[] visited, int start) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int neighbour : graph.get(cur)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.offer(neighbour);
                }
            }
        }
    }
}