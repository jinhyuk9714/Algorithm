import sys

input = sys.stdin.readline

N, M, K = map(int, input().split())
board = [input().strip() for _ in range(N)]

# S[y][x]: misW의 2D 누적합 (1-based)
S = [[0] * (M + 1) for _ in range(N + 1)]

for y in range(1, N + 1):
    row_sum = 0
    for x in range(1, M + 1):
        # W 시작 체스판에서의 기대색
        expect = 'W' if (y + x) % 2 == 0 else 'B'
        mismatch = 1 if board[y - 1][x - 1] != expect else 0

        row_sum += mismatch
        S[y][x] = S[y - 1][x] + row_sum

ans = K * K  # 최대로 칠하는 경우가 K*K
for y in range(K, N + 1):
    for x in range(K, M + 1):
        w = S[y][x] - S[y - K][x] - S[y][x - K] + S[y - K][x - K]  # W-시작 불일치 수
        repaint = w if w < K * K - w else K * K - w  # 두 패턴 중 최소
        if repaint < ans:
            ans = repaint

print(ans)
