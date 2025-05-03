int n = /* some value */;
boolean[] isPrime = new boolean[n + 1];
Arrays.fill(isPrime, true);
if (n >= 0) isPrime[0] = false;
if (n >= 1) isPrime[1] = false;

for (int i = 2; i <= n; i++) {
    if (isPrime[i] && (long)(i) * i <= n) {
        for (int j = i * i; j <= n; j += i) {
            isPrime[j] = false;
        }
    }
}
