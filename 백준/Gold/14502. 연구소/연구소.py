import sys
from collections import deque
from itertools import combinations

input = sys.stdin.readline

n, m = map(int, input().split())
original_map = [list(map(int, input().split())) for _ in range(n)]

empty = []
virus = []

# 1. 초기 좌표 저장
for i in range(n):
    for j in range(m):
        if original_map[i][j] == 0:
            empty.append((i, j))
        elif original_map[i][j] == 2:
            virus.append((i, j))


def spread_virus(board):
    q = deque(virus)
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]

    while q:
        x, y = q.popleft()
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if 0 <= nx < n and 0 <= ny < m:
                if board[nx][ny] == 0:
                    board[nx][ny] = 2
                    q.append((nx, ny))


def get_safe_area(board):
    # 피드백 2: 파이썬 스타일로 0 개수 세기
    return sum(row.count(0) for row in board)


res = 0

# 2. 벽 3개 세우기 (조합)
for walls in combinations(empty, 3):
    # 맵 복사
    temp_map = [row[:] for row in original_map]

    # 벽 세우기
    for r, c in walls:
        temp_map[r][c] = 1

    # 바이러스 퍼뜨리기
    spread_virus(temp_map)

    # 피드백 1: 리턴값 받아서 갱신
    res = max(res, get_safe_area(temp_map))

print(res)
