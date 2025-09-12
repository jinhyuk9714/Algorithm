import sys

input = sys.stdin.readline

n = int(input().strip())
tri = [list(map(int, input().split())) for _ in range(n)]

for i in range(n - 2, -1, -1):  # n-2, ..., 0
    for j in range(i + 1):  # 0..i
        tri[i][j] += max(tri[i + 1][j], tri[i + 1][j + 1])

print(tri[0][0])
