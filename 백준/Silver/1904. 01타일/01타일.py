import sys

input = sys.stdin.readline

MOD = 15746
n = int(input().strip())

if n == 1:
    print(1)
elif n == 2:
    print(2)
else:
    a, b = 1, 2  # a=dp[1], b=dp[2]
    for _ in range(3, n + 1):
        a, b = b, (a + b) % MOD
    print(b)
