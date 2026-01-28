import sys

input = sys.stdin.readline

n = int(input())
m = int(input())

graph = [[] for _ in range(n + 1)]

for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

visited = [False] * (n + 1)
count = 0


def dfs(cur_node):
    global count
    visited[cur_node] = True

    for next_node in graph[cur_node]:
        if not visited[next_node]:
            count += 1
            dfs(next_node)


dfs(1)

print(count)
