import sys
from itertools import combinations

input = sys.stdin.readline

N = int(input().strip())
S = [list(map(int, input().split())) for _ in range(N)]

# 미리 대칭 합을 저장해두면 합산이 빨라짐
pair = [[0] * N for _ in range(N)]
for i in range(N):
    for j in range(i + 1, N):
        pair[i][j] = S[i][j] + S[j][i]


def team_score(team):
    # team: 길이 N//2인 인덱스 튜플/리스트
    tot = 0
    h = len(team)
    for i in range(h):
        for j in range(i + 1, h):
            a, b = team[i], team[j]
            if a < b:
                tot += pair[a][b]
            else:
                tot += pair[b][a]
    return tot


players = list(range(N))
half = N // 2
best = 10 ** 9

# 0번을 Start에 고정해 대칭 제거
for comb in combinations(range(1, N), half - 1):
    start = (0,) + comb
    start_set = set(start)
    link = [p for p in players if p not in start_set]

    diff = abs(team_score(start) - team_score(link))
    if diff < best:
        best = diff
        if best == 0:  # 더 줄 수 없음 → 조기 종료해도 됨
            break

print(best)
