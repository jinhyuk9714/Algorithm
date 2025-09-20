import sys

input = sys.stdin.readline

N, M = map(int, input().split())
A = list(map(int, input().split()))

freq = [0] * M
s = 0
ans = 0

freq[0] = 1

for x in A:
    s = (s + x) % M
    ans += freq[s]
    freq[s] += 1

print(ans)
