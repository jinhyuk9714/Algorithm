import sys

input = sys.stdin.readline

MOD = 1_000_000_000
n = int(input().strip())

dp = [0] * 10
for d in range(1, 10):
    dp[d] = 1

for _ in range(2, n + 1):
    ndp = [0] * 10
    ndp[0] = dp[1] % MOD
    for d in range(1, 9):
        ndp[d] = (dp[d - 1] + dp[d + 1]) % MOD
    ndp[9] = dp[8] % MOD
    dp = ndp

print(sum(dp) % MOD if n > 1 else 9)