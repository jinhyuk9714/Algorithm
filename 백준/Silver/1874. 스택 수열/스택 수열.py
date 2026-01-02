import sys

input = sys.stdin.readline

n = int(input().strip())
seq = [int(input().strip()) for _ in range(n)]

stack = []
ops = []
cur = 1  # 다음에 push할 숫자(1부터 n까지 증가)

for x in seq:
    # x가 나올 때까지 push
    while cur <= x:
        stack.append(cur)
        ops.append("+")
        cur += 1

    # 이제 스택 top이 x여야 pop 가능
    if stack and stack[-1] == x:
        stack.pop()
        ops.append("-")
    else:
        print("NO")
        sys.exit(0)

print("\n".join(ops))
