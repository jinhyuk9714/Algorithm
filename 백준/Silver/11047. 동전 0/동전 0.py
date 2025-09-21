import sys

input = sys.stdin.readline

N, K = map(int, input().split())
coins = [int(input()) for _ in range(N)]

cnt = 0
for c in reversed(coins):
    if c > K:
        continue
    q, K = divmod(K, c)
    cnt += q
    if K == 0:
        break

print(cnt)
