import sys

input = sys.stdin.readline

n, m = map(int, input().split())

a = {input().strip() for _ in range(n)}
b = {input().strip() for _ in range(n)}

ans = sorted(a & b)

print(len(ans))
print("\n".join(ans))
