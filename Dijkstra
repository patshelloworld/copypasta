//Dijkstra Algo
    public int[] dijkstra(int n, List<List<Pair<Integer, Integer>>> graph, int i){
        var distance = new int[n];
        var pq = new PriorityQueue<Pair<Integer, Integer>>((a,b) -> a.getValue() - b.getValue());

        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[i] = 0;
        pq.add(new Pair<Integer, Integer>(i, 0));

        while (!pq.isEmpty()) {
            var current = pq.poll();

            if (distance[current.getKey()] < current.getValue())
                continue;  // If a cheaper path has been found already, then skip this node

            for (var next : graph.get(current.getKey())) {
                var newDistance = current.getValue()+ next.getValue();

                if (newDistance < distance[next.getKey()]) {
                    distance[next.getKey()] = newDistance;
                    pq.add(new Pair(next.getKey(), newDistance));
                }
            }
        }
        return distance;
    }
