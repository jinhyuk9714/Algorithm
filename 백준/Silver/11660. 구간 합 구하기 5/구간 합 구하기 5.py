import sys

input = sys.stdin.readline

N, M = map(int, input().split())
# A는 1-based로 다루기 위해 앞에 0 하나 더 붙임
A = [[0] * (N + 1)]
for _ in range(N):
    A.append([0] + list(map(int, input().split())))

# 2D 누적합 S[y][x] = A[1..y][1..x] 합
S = [[0] * (N + 1) for _ in range(N + 1)]
for y in range(1, N + 1):
    row_sum = 0
    for x in range(1, N + 1):
        row_sum += A[y][x]  # 행 내 누적
        S[y][x] = S[y - 1][x] + row_sum  # 위쪽 누적 더하기

out = []
for _ in range(M):
    y1, x1, y2, x2 = map(int, input().split())
    res = S[y2][x2] - S[y1 - 1][x2] - S[y2][x1 - 1] + S[y1 - 1][x1 - 1]
    out.append(str(res))

print('\n'.join(out))
