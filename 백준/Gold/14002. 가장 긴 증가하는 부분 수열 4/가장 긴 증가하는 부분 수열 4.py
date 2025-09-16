import sys

input = sys.stdin.readline

n = int(input().strip())
arr = list(map(int, input().split()))

dp = [1] * n
for i in range(n):
    for j in range(i):
        if arr[j] < arr[i]:
            dp[i] = max(dp[i], dp[j] + 1)

max_dp = max(dp)
seq = []

for i in range(n - 1, -1, -1):
    if dp[i] == max_dp:
        seq.append(arr[i])
        max_dp -= 1

print(max(dp))
print(*reversed(seq))
