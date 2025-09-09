import sys

input = sys.stdin.readline
write = sys.stdout.write

N, M = map(int, input().split())

path = []
result = []


def dfs(depth):
    if depth == M:
        result.append(' '.join(map(str, path)))
        return
    for i in range(1, N + 1):
        path.append(i)
        dfs(depth + 1)
        path.pop()


dfs(0)
write('\n'.join(result))
