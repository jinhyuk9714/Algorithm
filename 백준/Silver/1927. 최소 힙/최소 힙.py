import heapq
import sys

input = sys.stdin.readline

n = int(input().strip())

out = []
h = []
for _ in range(n):
    num = int(input().strip())
    if num != 0:
        heapq.heappush(h, num)
    else:
        if not h:
            out.append("0")
        else:
            out.append(str(heapq.heappop(h)))

print("\n".join(out))
