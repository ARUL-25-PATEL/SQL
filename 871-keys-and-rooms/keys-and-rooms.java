class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> r) {
        int n = r.size();
        boolean[] visited = new boolean[n];

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int key = q.poll();

            for (int j : r.get(key)) {

                if (!visited[j]) {
                    visited[j] = true;
                    q.add(j);
                }
            }

        }
        for (boolean x : visited)
            if (!x)
                return x;
        return true;

    }
}