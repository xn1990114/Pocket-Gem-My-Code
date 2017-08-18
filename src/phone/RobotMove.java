package phone;
/*
 * 给一个Robot class, 有moveUp()等向4个方向移动的function。给一个boolean matrix 表示迷宫，T表示可以走，
 * F表示墙。再输入两个int作为起始坐标。要求调用robot的移动function使得Robot把能去的地方全部去一遍
e.g. 迷宫          1 T F. 
                  0 T T
                  S 0 1
起始位置（0，0）
那么一种解法可以是 →，←，↑。另一种解法可以是↑，↓，→。
任意完成一种解法就行
 */
public class RobotMove {
	public String findPath(boolean[][] room,int[] start){
		StringBuilder sb=new StringBuilder();
		boolean[][] visited=new boolean[room.length][room[0].length];
		dfs(start[0],start[1],room,visited,sb,new StringBuilder());
		return sb.toString();
	}
	public void dfs(int r,int c,boolean[][] room,boolean[][] visited,StringBuilder sb,StringBuilder moveback){
		if(visited[r][c]||!room[r][c]){
			return ;
		}
		visited[r][c]=true;
		if(r-1>=0&&room[r-1][c]&&!visited[r-1][c]){
			sb.append(moveback);
			moveback.delete(0, moveback.length());
			sb.append('U');
			dfs(r-1,c,room,visited,sb,moveback);
			moveback.append('D');
		}
		if(r+1<room.length&&room[r+1][c]&&!visited[r+1][c]){
			sb.append(moveback);
			moveback.delete(0, moveback.length());
			sb.append('D');
			dfs(r+1,c,room,visited,sb,moveback);
			moveback.append('U');
		}
		if(c-1>=0&&room[r][c-1]&&!visited[r][c-1]){
			sb.append(moveback);
			moveback.delete(0, moveback.length());
			sb.append('L');
			dfs(r,c-1,room,visited,sb,moveback);
			moveback.append('R');
		}
		if(c+1<room[0].length&&room[r][c+1]&&!visited[r][c+1]){
			sb.append(moveback);
			moveback.delete(0, moveback.length());
			sb.append('R');
			dfs(r,c+1,room,visited,sb,moveback);
			moveback.append('L');
		}
	}
}
