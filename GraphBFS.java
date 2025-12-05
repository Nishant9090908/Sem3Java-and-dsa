//import java.util.*;
//
//public class GraphBFS {
//    class Solution{
//        public ArrayList<Integer> bfsofgraph(int vis, ArrayList<ArrayList<Integer>> adj){
//            ArrayList<Integer> bfs = new ArrayList<>();
//            boolean visited[] = new boolean[vis];
//            Queue<Integer> q = new LinkedList<>();
//
//            q.add(0);
//            visited[0] = true;
//            while (!q.isEmpty()){
//                Integer node = q.poll();
//                bfs.add(node);
//
//                for (Integer it : adj.get(node)){
//                    if(visited[it] == false){
//                        visited[it] = true;
//                        q.add(it);
//                    }
//                }
//            }
//            return bfs;
//        }
//    }
//    public static void main(String[]args){
//
//    }
//}