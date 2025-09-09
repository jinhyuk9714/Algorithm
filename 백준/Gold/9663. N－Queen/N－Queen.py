import sys

sys.setrecursionlimit(1_000_000)

n = int(sys.stdin.readline().strip())

full = (1 << n) - 1
ans = 0


def dfs(cols, d1, d2):
    global ans
    if cols == full:
        ans += 1
        return
    avail = ~(cols | d1 | d2) & full
    while avail:
        bit = avail & -avail
        avail -= bit
        dfs(cols | bit, (d1 | bit) << 1, (d2 | bit) >> 1)


dfs(0, 0, 0)
print(ans)
