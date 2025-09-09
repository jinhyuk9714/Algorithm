import sys

input = sys.stdin.readline
write = sys.stdout.write

N = int(input().strip())
A = list(map(int, input().split()))
add, sub, mul, div = map(int, input().split())
ops = [add, sub, mul, div]

maxv = -10 ** 12
minv = 10 ** 12


def dfs(idx: int, cur: int) -> None:
    global maxv, minv
    if idx == N:  # 숫자를 모두 사용했으면 갱신
        if cur > maxv: maxv = cur
        if cur < minv: minv = cur
        return

    x = A[idx]
    if ops[0] > 0:  # +
        ops[0] -= 1
        dfs(idx + 1, cur + x)
        ops[0] += 1
    if ops[1] > 0:  # -
        ops[1] -= 1
        dfs(idx + 1, cur - x)
        ops[1] += 1
    if ops[2] > 0:  # *
        ops[2] -= 1
        dfs(idx + 1, cur * x)
        ops[2] += 1
    if ops[3] > 0:  # /  (0 쪽으로 버림)
        ops[3] -= 1
        dfs(idx + 1, int(cur / x))
        ops[3] += 1


dfs(1, A[0])
write(f"{maxv}\n{minv}\n")
