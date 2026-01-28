import sys
from collections import deque

input = sys.stdin.readline

n, m, v = map(int, input().split())

graph = [[] for _ in range(n + 1)]

for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)  # 양방향 연결

# 문제 조건: "번호가 작은 것부터 방문" -> 정렬 필수
for i in range(1, n + 1):
    graph[i].sort()

# --- DFS 구현 (재귀) ---
visited_dfs = [False] * (n + 1)


def dfs(cur_node):
    visited_dfs[cur_node] = True
    print(cur_node, end=' ')

    for next_node in graph[cur_node]:
        if not visited_dfs[next_node]:
            dfs(next_node)


# --- BFS 구현 (큐) ---
visited_bfs = [False] * (n + 1)


def bfs(start_node):
    queue = deque([start_node])
    visited_bfs[start_node] = True

    while queue:
        cur_node = queue.popleft()
        print(cur_node, end=' ')

        for next_node in graph[cur_node]:
            if not visited_bfs[next_node]:
                visited_bfs[next_node] = True
                queue.append(next_node)


dfs(v)
print()
bfs(v)