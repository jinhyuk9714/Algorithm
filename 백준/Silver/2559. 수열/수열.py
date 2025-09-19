import sys

input = sys.stdin.readline

N, K = map(int, input().split())
A = list(map(int, input().split()))

window = sum(A[:K])
ans = window

# 한 칸씩 미는 동안: 새로 들어온 원소 더하고, 빠진 원소 빼기
for i in range(K, N):
    window += A[i] - A[i - K]
    if window > ans:
        ans = window

print(ans)
