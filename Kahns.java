 //Kahn's algo begins here 
public int[] kahns(List<List<Integer>> graph){
        int[] indegree = new int[n];

        for(List<Integer> g: graph){
            for(int i:g){
                indegree[i]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < indegree.length; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        int index = 0;
        int[] order = new int[n];
        while(!q.isEmpty()){
            int at = q.poll();
            order[index++] = at;

            for(int edge: graph.get(at)){
                indegree[edge]--;
                if(indegree[edge] == 0){
                    q.add(edge);
                }
            }
        }

        if(index != n){
            return new int[0];
        }
    return order
}
