import sys

input = sys.stdin.readline

t = int(input().strip())
ns = [int(input().strip()) for _ in range(t)]
max_n = max(ns)

dp = [0] * (max_n + 1)
if max_n >= 1: dp[1] = 1
if max_n >= 2: dp[2] = 1
if max_n >= 3: dp[3] = 1
if max_n >= 4: dp[4] = 2
if max_n >= 5: dp[5] = 2

for i in range(6, max_n + 1):
    dp[i] = dp[i - 1] + dp[i - 5]

print("\n".join(str(dp[n]) for n in ns))
