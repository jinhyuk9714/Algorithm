import sys

input = sys.stdin.readline
MOD = 1_000_000_007

n, k = map(int, input().split())

k = min(k, n - k)

num = 1  # (n-k+1) ~ n
den = 1  # 1 ~ k
for i in range(1, k + 1):
    num = (num * (n - k + i)) % MOD
    den = (den * i) % MOD

# 분모의 모듈러 역원: den^(MOD-2) mod MOD  ← pow가 내부적으로 분할정복
ans = num * pow(den, MOD - 2, MOD) % MOD
print(ans)
