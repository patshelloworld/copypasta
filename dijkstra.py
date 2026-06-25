import heapq
def dijkstra(self, edges:List[List[int]], target:int, source:int):
    adj = defaultdict(list)
    #OR adj = [[] for _ in range(n)]
    for u, v, w in edges:
        adj[u].append([v,w])

    # piton heap is list, then use heapq.heap...
    pq = [[0, source]] #source is starting position

    dist = {}
    
    while pq:
        weight, node = heapq.heappop(pq)
        if dist.get(node, math.inf) != math.inf:
            continue
        dist[node] = weight
        if node == target:
            return weight
            
        for u, w in adj[node]:
            heapq.heappush(pq, [weight+w, u])
    return -1
           
