import sys

input = sys.stdin.readline

N = int(input())
board = [list(map(int, input().split())) for _ in range(N)]


def count_colors(y, x, n):
    first = board[y][x]

    # 이 블록이 단색인지 확인
    uniform = True
    for i in range(y, y + n):
        for j in range(x, x + n):
            if board[i][j] != first:
                uniform = False
                break
        if not uniform:
            break

    if uniform:
        if first == -1:
            return 1, 0, 0
        elif first == 0:
            return 0, 1, 0
        else:  # first == 1
            return 0, 0, 1

    # 단색이 아니면 3x3 분할
    t = n // 3
    m = z = p = 0
    for dy in (0, t, 2 * t):
        for dx in (0, t, 2 * t):
            a, b, c = count_colors(y + dy, x + dx, t)
            m += a
            z += b
            p += c
    return m, z, p


minus, zero, plus = count_colors(0, 0, N)
print(minus)
print(zero)
print(plus)
