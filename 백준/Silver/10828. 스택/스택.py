import sys

input = sys.stdin.readline

n = int(input())
stack = []

for _ in range(n):
    command = input().split()  # 공백을 기준으로 명령어 분리 (예: ['push', '1'])

    if command[0] == 'push':
        stack.append(command[1])

    elif command[0] == 'pop':
        if len(stack) == 0:
            print(-1)
        else:
            print(stack.pop())

    elif command[0] == 'size':
        print(len(stack))

    elif command[0] == 'empty':
        if len(stack) == 0:
            print(1)
        else:
            print(0)

    elif command[0] == 'top':
        if len(stack) == 0:
            print(-1)
        else:
            print(stack[-1])
