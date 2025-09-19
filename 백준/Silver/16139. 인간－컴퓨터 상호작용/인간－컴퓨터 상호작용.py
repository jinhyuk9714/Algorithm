import sys

input = sys.stdin.readline

S = input().strip()
q = int(input())

queries = []
for _ in range(q):
    c, l, r = input().split()
    l = int(l)
    r = int(r)
    queries.append((c, l, r))

P = [[0] * (len(S) + 1) for _ in range(26)]

for i, ch in enumerate(S):
    idx = ord(ch) - ord('a')
    for k in range(26):
        P[k][i + 1] = P[k][i]
    P[idx][i + 1] += 1

out = []
for c, l, r in queries:
    k = ord(c) - ord('a')
    out.append(str(P[k][r + 1] - P[k][l]))
print('\n'.join(out))
