import sys

input = sys.stdin.readline

N = int(input())
board = [list(map(int, input().split())) for _ in range(N)]


def count_colors(y, x, n):
    first = board[y][x]
    # 이 영역이 단색인지 검사
    for i in range(y, y + n):
        for j in range(x, x + n):
            if board[i][j] != first:
                half = n // 2
                w1, b1 = count_colors(y, x, half)
                w2, b2 = count_colors(y, x + half, half)
                w3, b3 = count_colors(y + half, x, half)
                w4, b4 = count_colors(y + half, x + half, half)
                return (w1 + w2 + w3 + w4, b1 + b2 + b3 + b4)
    # 단색인 경우
    return (1, 0) if first == 0 else (0, 1)


white, blue = count_colors(0, 0, N)
print(white)
print(blue)
