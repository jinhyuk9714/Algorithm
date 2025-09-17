import sys

input = sys.stdin.readline

n = int(input().strip())
pairs = [tuple(map(int, input().split())) for _ in range(n)]
pairs.sort(key=lambda x: x[0])
b = [y for _, y in pairs]

dp = [1] * n

for i in range(n):
    for j in range(i):
        if b[i] > b[j]:
            dp[i] = max(dp[i], dp[j] + 1)

print(n - max(dp))
