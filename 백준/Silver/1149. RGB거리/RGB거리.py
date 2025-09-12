import sys

input = sys.stdin.readline

n = int(input().strip())
a = [list(map(int, input().split())) for _ in range(n)]  # a[i] = [R,G,B] 비용

for i in range(1, n):
    a[i][0] += min(a[i - 1][1], a[i - 1][2])  # R
    a[i][1] += min(a[i - 1][0], a[i - 1][2])  # G
    a[i][2] += min(a[i - 1][0], a[i - 1][1])  # B

print(min(a[-1]))
