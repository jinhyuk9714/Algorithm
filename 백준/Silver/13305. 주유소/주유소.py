import sys

input = sys.stdin.readline

N = int(input())
dist = list(map(int, input().split()))
price = list(map(int, input().split()))

min_price = price[0]
total = 0

for i in range(N - 1):  # 마지막 도시는 주유 불필요
    if price[i] < min_price:
        min_price = price[i]
    total += min_price * dist[i]

print(total)
