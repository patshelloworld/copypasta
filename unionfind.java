//UnionFind

class UnionFind{
        int[] parent;
        public UnionFind(int size){
            parent = new int[size];
            for(int i = 0; i < size; i++){
                parent[i] = i;
            }
        }

        public int find(int x){
            if(parent[x] != x){
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public void union(int x, int y){
            parent[find(x)] = find(y);
        }
}

//Union Find by Rank
class UnionFind {
        private int[] root;
        private int[] rank;
        
        public UnionFind(int size) {
            root = new int[size];
            rank = new int[size];
            for (int i = 0; i < size; i++) {
                root[i] = i;
                rank[i] = 1; 
            }
        }
        
        public int find(int x) {
            while (x != root[x]) {
                x = root[x];
            }
            return x;
        }
        
        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                if (rank[rootX] > rank[rootY]) {
                    root[rootY] = rootX;
                } else if (rank[rootX] < rank[rootY]) {
                    root[rootX] = rootY;
                } else {
                    root[rootY] = rootX;
                    rank[rootX] += 1;
                }
            }
        }
        
        public boolean connected(int x, int y) {
            return find(x) == find(y);
        }
}
