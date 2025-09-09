import sys

input = sys.stdin.readline
write = sys.stdout.write

N, M = map(int, input().split())

path = []
result = []


def dfs(start, depth):
    if depth == M:
        result.append(' '.join(map(str, path)))
        return
    for i in range(start, N + 1):
        path.append(i)
        dfs(i, depth + 1)
        path.pop()


dfs(1, 0)
write('\n'.join(result))
