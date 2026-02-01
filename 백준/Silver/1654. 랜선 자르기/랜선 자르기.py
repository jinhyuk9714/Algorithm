import sys

input = sys.stdin.readline

k, n = map(int, input().split())
cables = [int(input()) for _ in range(k)]

start = 1
end = max(cables)

while start <= end:
    mid = (start + end) // 2

    count = 0
    for cable in cables:
        count += cable // mid

    if count >= n:
        start = mid + 1
    else:
        end = mid - 1

print(end)