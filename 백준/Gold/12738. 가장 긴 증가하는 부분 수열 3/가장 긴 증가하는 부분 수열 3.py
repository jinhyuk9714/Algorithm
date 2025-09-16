import sys
from bisect import bisect_left

input = sys.stdin.readline

n = int(input().strip())
arr = list(map(int, input().split()))

tails = []
for x in arr:
    i = bisect_left(tails, x)
    if i == len(tails):
        tails.append(x)
    else:
        tails[i] = x

print(len(tails))
