import sys

input = sys.stdin.readline
MOD = 1000

N, B = map(int, input().split())
A = [list(map(lambda x: int(x) % MOD, input().split())) for _ in range(N)]


def mat_mul(X, Y):  # 네 스타일(전치+zip) 버전
    Yt = [tuple(col) for col in zip(*Y)]
    n = len(X)
    return [
        [sum((x * y) % MOD for x, y in zip(X[i], Yt[j])) % MOD
         for j in range(n)]
        for i in range(n)
    ]


def mat_pow(base, e):
    # 항등행렬
    n = len(base)
    res = [[0] * n for _ in range(n)]
    for i in range(n): res[i][i] = 1

    cur = [row[:] for row in base]
    while e > 0:
        if e & 1:
            res = mat_mul(res, cur)
        cur = mat_mul(cur, cur)
        e >>= 1
    return res


C = mat_pow(A, B)
for row in C:
    print(*row)
