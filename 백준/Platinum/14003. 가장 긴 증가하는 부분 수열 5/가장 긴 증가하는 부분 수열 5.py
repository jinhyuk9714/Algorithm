import sys
from bisect import bisect_left

input = sys.stdin.readline

n = int(input().strip())
arr = list(map(int, input().split()))

tails_val = []
tails_idx = []
prev = [-1] * n

for i, x in enumerate(arr):     # 인덱스, 값 반환
    pos = bisect_left(tails_val, x)     # 가장 왼쪽 위치

    if pos == len(tails_val):
        tails_val.append(x)
        tails_idx.append(i)
    else:
        tails_val[pos] = x
        tails_idx[pos] = i

    if pos > 0:
        prev[i] = tails_idx[pos - 1]

L = len(tails_val)

idx = tails_idx[-1]
seq = []
while idx != -1:
    seq.append(arr[idx])
    idx = prev[idx]
seq.reverse()

print(L)
print(*seq)
