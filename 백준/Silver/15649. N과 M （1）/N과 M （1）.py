import sys

input = sys.stdin.readline
write = sys.stdout.write

N, M = map(int, input().split())

path = []
visited = [False] * (N + 1)
result = []


def dfs(depth):
    if depth == M:
        result.append(' '.join(map(str, path)))
        return
    for i in range(1, N + 1):
        if visited[i] == False:
            visited[i] = True
            path.append(i)
            dfs(depth + 1)
            path.pop()
            visited[i] = False


dfs(0)
write('\n'.join(result))