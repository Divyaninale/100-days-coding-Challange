import java.util.*;
import java.util.LinkedList;
public class Graph_BFS
{
    static class Edge
    {
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w)
        {
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void creategraph(ArrayList<Edge>graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        //0 vertex
       graph[0].add(new Edge(0,1,1));
       graph[1].add(new Edge(1,0,1));
       graph[1].add(new Edge(1,2,1));
       graph[1].add(new Edge(1,3,1));
       graph[2].add(new Edge(2,1,1));
       graph[2].add(new Edge(2,3,1));
       graph[2].add(new Edge(2,4,1));
       graph[3].add(new Edge(3,1,1));
       graph[3].add(new Edge(3,2,1));
       graph[4].add(new Edge(4,2,1));
    }

    public static void BFS(ArrayList<Edge>graph[])
    {
        Queue<Integer>q=new LinkedList<>();
        boolean visited[]=new boolean[graph.length];
        q.add(0);

        while(!q.isEmpty())
        {
            int curr=q.remove();
            if(!visited[curr])
            {
                System.out.println(curr);
                visited[curr]=true;
                for(int i=0;i<graph[curr].size();i++)
                {
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }

            }
        }
    }
    public static void main(String args[])
    {
       int v=5;
       ArrayList<Edge>graph[]=new ArrayList[v];
       creategraph(graph);
       BFS(graph);

    }
}