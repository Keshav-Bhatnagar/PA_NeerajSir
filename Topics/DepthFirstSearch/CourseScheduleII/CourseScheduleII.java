class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
         List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) graph.add(new ArrayList<>());

        int[] indegree = new int[numCourses];
        for (int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]); // p[1] -> p[0]
            indegree[p[0]]++;
        }

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) queue.offer(i);
        }

        int [] ans = new int[numCourses];
        int count = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            ans[count++]=node;

            for (int next : graph.get(node)) {
                if (--indegree[next] == 0) 
                queue.offer(next);
                
            }
        }

        return  (count == numCourses)? ans :new int []{};
    }
}