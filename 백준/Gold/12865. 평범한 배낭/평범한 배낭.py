import sys

input = sys.stdin.readline

N, K = map(int, input().split())
items = [tuple(map(int, input().split())) for _ in range(N)]

dp = [0] * (K + 1)  # dp[w]: 무게 w에서의 최대가치

for w_i, v_i in items:
    # 0/1이라 역순 갱신이 핵심!
    for w in range(K, w_i - 1, -1):
        dp[w] = max(dp[w], dp[w - w_i] + v_i)

print(dp[K])
