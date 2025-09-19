import sys

input = sys.stdin.readline

N, M = map(int, input().split())

A = list(map(int, input().split()))

# 누적합 P[i] = A[0] ~ A[i-1]의 합 (길이 N+1, P[0]=0)
P = [0] * (N + 1)
for i in range(1, N + 1):
    P[i] = P[i - 1] + A[i - 1]

# M개의 질의 (i, j): i~j 합 출력 (1-indexed)
out = []
for _ in range(M):
    i, j = map(int, input().split())
    out.append(str(P[j] - P[i - 1]))

print('\n'.join(out))
