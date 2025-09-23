import sys

input = sys.stdin.readline

N = int(input())
board = [input().strip() for _ in range(N)]


def compress(y, x, n):
    first = board[y][x]
    # 이 영역이 단색인지 확인
    same = True
    for i in range(y, y + n):
        # 한 행에서 한 번에 비교(속도/가독성)
        if board[i][x:x + n] != first * n:
            same = False
            break
    if same:
        return first  # '0' 또는 '1'

    # 단색이 아니면 4등분
    half = n // 2
    ul = compress(y, x, half)  # 왼쪽 위
    ur = compress(y, x + half, half)  # 오른쪽 위
    dl = compress(y + half, x, half)  # 왼쪽 아래
    dr = compress(y + half, x + half, half)  # 오른쪽 아래
    return '(' + ul + ur + dl + dr + ')'


print(compress(0, 0, N))
