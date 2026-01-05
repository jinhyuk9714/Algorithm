import sys
from collections import deque
from itertools import combinations

input = sys.stdin.readline

n, m = map(int, input().split())

original_map = [list(map(int, input().split())) for _ in range(n)]

empty = []
virus = []

# 0, 2 위치 구하기
for i in range(n):
    for j in range(m):
        if original_map[i][j] == 0:
            empty.append((i, j))
        elif original_map[i][j] == 2:
            virus.append((i, j))


def spread_virus(board):
    q = deque(virus)  # 처음에 찾아둔 바이러스 좌표 다 넣기

    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]

    while q:
        x, y = q.popleft()

        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]

            # 맵 범위 안이고, 빈칸(0)이라면 바이러스 퍼짐
            if 0 <= nx < n and 0 <= ny < m:
                if board[nx][ny] == 0:
                    board[nx][ny] = 2  # 감염!
                    q.append((nx, ny))


def get_safe_area(board):
    global sum_res

    for i in range(n):
        for j in range(m):
            if board[i][j] == 0:
                sum_res += 1


res = 0
for walls in combinations(empty, 3):
    temp_map = [row[:] for row in original_map]

    for r, c in walls:
        temp_map[r][c] = 1

    spread_virus(temp_map)

    sum_res = 0
    get_safe_area(temp_map)
    res = max(res, sum_res)

print(res)
