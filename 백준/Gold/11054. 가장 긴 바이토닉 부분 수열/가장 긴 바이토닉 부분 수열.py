import sys

input = sys.stdin.readline

n = int(input().strip())
arr = list(map(int, input().split()))

# 1) 왼쪽에서 오는 증가 LIS (i에서 끝남)
inc = [1] * n
for i in range(n):
    for j in range(i):
        if arr[j] < arr[i]:
            inc[i] = max(inc[i], inc[j] + 1)

# 2) 오른쪽으로 가는 감소 LDS (i에서 시작)
dec = [1] * n
for i in range(n - 1, -1, -1):
    for j in range(i + 1, n):
        if arr[j] < arr[i]:
            dec[i] = max(dec[i], dec[j] + 1)

# 3) 각 i를 정점으로 한 바이토닉 길이
ans = 0
for i in range(n):
    ans = max(ans, inc[i] + dec[i] - 1)

print(ans)
