// Last updated: 09/07/2026, 15:06:24
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>>adj = new ArrayList<>();
        for(int i = 0;i<n;i++){
            adj.add(new ArrayList<>());
        }
            int m = edges.length;
            for(int i =0;i < m;i++){
                int sv = edges[i][0];
                int ev = edges[i][1];
                adj.get(sv).add(ev);
                adj.get(ev).add(sv);
            }
            return bfs(n,source,destination,adj);
        }
        boolean bfs(int n,int source,int destination,List<List<Integer>> adj){
            Queue<Integer> q = new LinkedList<>();
            boolean[] visit = new boolean[n];
            q.add(source);
            visit[source] = true;
            while(q.size() > 0){
                int curr = q.poll();
                if(curr == destination)return true;
                int m = adj.get(curr).size();
                for(int i = 0;i<m;i++){
                    int x = adj.get(curr).get(i);
                    if(visit[x] == false){
                    q.add(x);
                    visit[x] = true;
                  }
                }
            }
            return false;
        }
    }
