import sys
from itertools import accumulate

input = sys.stdin.readline

N = int(input())
orders = sorted(map(int, input().split()))
print(sum(accumulate(orders)))
