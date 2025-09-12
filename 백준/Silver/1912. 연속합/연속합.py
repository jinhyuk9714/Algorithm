import sys

input = sys.stdin.readline

n = int(input().strip())
arr = []
while len(arr) < n:  # 숫자가 여러 줄로 들어와도 안전
    arr += list(map(int, input().split()))

cur = ans = arr[0]  # 모두 음수일 수 있으니 첫 값으로 초기화
for x in arr[1:]:
    cur = max(x, cur + x)  # dp[i] = max(a[i], dp[i-1] + a[i])
    ans = max(ans, cur)

print(ans)
