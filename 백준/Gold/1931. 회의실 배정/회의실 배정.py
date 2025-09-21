import sys

input = sys.stdin.readline

N = int(input())
meetings = [tuple(map(int, input().split())) for _ in range(N)]

# 끝 -> 시작 순으로 정렬
meetings.sort(key=lambda x: (x[1], x[0]))

cnt = 0
last_end = 0
for s, e in meetings:
    if s >= last_end:
        cnt += 1
        last_end = e

print(cnt)
