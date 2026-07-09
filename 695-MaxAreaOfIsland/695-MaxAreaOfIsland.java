// Last updated: 09/07/2026, 15:07:26
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n; j++){
                if(grid[i][j] == 1 && visited[i][j] == false){
                    ans = Math.max(ans,bfs(i,j,visited,grid,m,n));
                }
            }
        }
        return ans;
    }
     int bfs(int i,int j,boolean[][] visited,int[][] grid,int m,int n){
          Queue<int[]> q = new LinkedList<>();
          q.add(new int[] {i,j});
          visited[i][j] = true;
          int area = 1;
          while(q.size() > 0){
            int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            for(int k = 0;k < 4;k++){
                int nextrow = x + dir[k][0];
                int nextcol = y + dir[k][1]; 
                if (nextrow < m  && nextrow >= 0  && nextcol < n  && nextcol >= 0 &&  visited[nextrow][nextcol] == false && grid[nextrow][nextcol] == 1) {
                    q.add(new int[]{nextrow,nextcol});
                     visited[nextrow][nextcol] = true;
                     area++;
                }
            }
        }
        return area;
    }
}