import sys

input = sys.stdin.readline

n, m = map(int, input().split())
trees = list(map(int, input().split()))

start = 0
end = max(trees)

while start <= end:
    mid = (start + end) // 2

    wood = 0
    for tree in trees:
        if tree > mid:
            wood += tree - mid

    if wood >= m:
        start = mid + 1
    else:
        end = mid - 1

print(end)