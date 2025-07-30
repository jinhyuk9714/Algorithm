n, m = map(int, input().split())
path = []

def dfs():
    if len(path) == m:
        print(*path)
        return

    for i in range(1, n + 1):
        path.append(i)
        dfs()
        path.pop()

dfs()
