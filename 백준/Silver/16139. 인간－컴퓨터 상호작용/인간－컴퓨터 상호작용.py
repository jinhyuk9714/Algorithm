import sys

input = sys.stdin.readline

S = input().strip()
q = int(input())

queries = [input().split() for _ in range(q)]  # c, l, r (문자, 문자열, 문자열)

n = len(S)
P = [[0] * 26 for _ in range(n + 1)]  # P[i][k] = S[:i]에서 문자 k의 개수 (k=0..25)

for i, ch in enumerate(S, start=1):  # i: 1..n
    row = P[i - 1][:]  # 이전 행을 통째로 복사 (26개 한 번에)
    row[ord(ch) - 97] += 1  # 이번 글자만 +1
    P[i] = row

out = []
for c, l, r in queries:
    l = int(l)
    r = int(r)
    k = ord(c) - 97
    out.append(str(P[r + 1][k] - P[l][k]))

print('\n'.join(out))
