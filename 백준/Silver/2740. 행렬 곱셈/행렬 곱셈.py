import sys

input = sys.stdin.readline

N, M = map(int, input().split())
A = [list(map(int, input().split())) for _ in range(N)]

M2, K = map(int, input().split())
B = [list(map(int, input().split())) for _ in range(M2)]

Bt = list(zip(*B))  # *B = [1, 2, 3] [4, 5, 6] -> [(1, 4), (2, 5), (3, 6)]

C = [
    [sum(a * b for a, b in zip(A[i], Bt[k]))  # C[i][k]  (A의 i행 · B의 k열 내적)
     for k in range(K)]  # k: 0..K-1 (열 인덱스)
    for i in range(N)  # i: 0..N-1 (행 인덱스)
]

for row in C:
    print(*row)
