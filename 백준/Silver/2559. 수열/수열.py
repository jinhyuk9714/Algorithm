import sys

input = sys.stdin.readline

n, k = map(int, input().split())

arr = list(map(int, input().split()))

cur = sum(arr[:k])
best = cur

for i in range(k, n):
    cur += arr[i] - arr[i - k]
    if cur > best:
        best = cur

print(best)

# # 누적합
# prefix = [0] * (n + 1)
#
# for i in range(1, n + 1):
#     prefix[i] = prefix[i - 1] + arr[i - 1]
#
# out = []
# for i in range(k, n + 1):
#     out.append(str(prefix[i] - prefix[i - k]))
#
# print("\n".join(out))
