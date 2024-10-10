import java.util.*;
//Lab16_85_86
class Graph{
    private Map<Integer, List<Integer>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addEdge(int u, int v) {
        adjacencyList.putIfAbsent(u, new ArrayList<>());
        adjacencyList.putIfAbsent(v, new ArrayList<>());
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u); // Remove this line if the graph is directed
    }

    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        System.out.print("DFS starting from vertex " + start + ": ");
        dfsUtil(start, visited);
        System.out.println();
    }

    private void dfsUtil(int vertex, Set<Integer> visited) {
        visited.add(vertex);
        System.out.print(vertex + " ");

        for (int neighbor : adjacencyList.getOrDefault(vertex, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        visited.add(start);
        queue.add(start);

        System.out.print("BFS starting from vertex " + start + ": ");

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbor : adjacencyList.getOrDefault(vertex, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 5);

        g.dfs(0);
        g.bfs(0);
    }
}
