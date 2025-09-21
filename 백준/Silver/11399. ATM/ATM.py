import sys

input = sys.stdin.readline

N = int(input())
orders = list(map(int, input().split()))
orders.sort()

p = 0
sum = 0

for i in range(N):
    p += orders[i]
    sum += p

print(sum)
