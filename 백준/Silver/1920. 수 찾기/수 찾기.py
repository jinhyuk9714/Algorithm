import sys
from bisect import bisect_left

input = sys.stdin.readline

n = int(input())
n_list = sorted(list(map(int, input().split())))

m = int(input())
targets = list(map(int, input().split()))

for t in targets:
    idx = bisect_left(n_list, t)

    if idx < n and n_list[idx] == t:
        print(1)
    else:
        print(0)
