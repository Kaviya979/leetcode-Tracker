// Last updated: 09/07/2026, 15:07:48
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n =isConnected.length;
        boolean[] visit = new boolean[n];
        int count = 0;
        for(int i = 0; i<n;i++){
        if(visit[i] == false){
            count++;
            bfs(i,isConnected,visit,n);
        }
     }
     return count;
  }

  void bfs(int sv,int[][]isConnected,boolean[] visit,int n){
    Queue<Integer> q = new LinkedList<>();
    q.add(sv);
    visit[sv] = true;
    while(q.size() > 0){
        int curr = q.poll();
    for(int i = 0;i < n;i++){
        if(isConnected[curr][i] == 1 && visit[i] == false){
            visit[i] = true;
            q.add(i);
              }
           }
        }
     }
 }

 