import sys
from itertools import permutations

input = sys.stdin.readline

n, m = map(int, input().split())
arr = list(map(int, input().split()))

arr.sort()

# for seq in permutations(arr, m):
#     print(*(seq))

visited = [False] * n
result = []


def backtrack(depth):
    if depth == m:
        print(*(result))
        return

    for i in range(n):
        if not visited[i]:
            visited[i] = True
            result.append(arr[i])

            backtrack(depth + 1)

            visited[i] = False
            result.pop()


backtrack(0)
