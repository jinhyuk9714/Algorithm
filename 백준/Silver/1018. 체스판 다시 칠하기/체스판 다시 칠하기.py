import sys

input = sys.stdin.readline

N, M = map(int, input().split())
board = [input().strip() for _ in range(N)]

ans = 64

for sy in range(N - 8 + 1):
    for sx in range(M - 8 + 1):
        missW = 0
        missB = 0
        for dy in range(8):
            for dx in range(8):
                cur = board[sy + dy][sx + dx]
                if (dy + dx) % 2 == 0:
                    if cur != 'W': missW += 1
                    if cur != 'B': missB += 1
                else:
                    if cur != 'B': missW += 1
                    if cur != 'W': missB += 1
        ans = min(ans, missW, missB)

print(ans)
