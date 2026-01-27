import sys
from collections import deque

input = sys.stdin.readline

t = int(input())

for _ in range(t):
    n, m = map(int, input().split())
    priorities = list(map(int, input().split()))

    queue = deque()
    for i in range(n):
        queue.append((priorities[i], i))

    count = 0

    while queue:
        current = queue.popleft()

        if any(current[0] < x[0] for x in queue):
            queue.append(current)
        else:
            count += 1
            if current[1] == m:
                print(count)
                break
