import sys
from collections import deque

input = sys.stdin.readline

n, k = map(int, input().split())

MAX = 100001
dist = [0] * MAX


def bfs():
    queue = deque()
    queue.append(n)

    while queue:
        current = queue.popleft()

        if current == k:
            print(dist[current])
            return

        for next_pos in (current - 1, current + 1, current * 2):
            if 0 <= next_pos < MAX and dist[next_pos] == 0:
                dist[next_pos] = dist[current] + 1
                queue.append(next_pos)


bfs()