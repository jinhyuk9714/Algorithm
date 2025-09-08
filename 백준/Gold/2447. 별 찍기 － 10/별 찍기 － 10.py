import sys

input = sys.stdin.readline


def star(n):
    if n == 1:
        return "*"

    sub = star(n // 3)
    space = " " * (n // 3)

    top = [row * 3 for row in sub]
    mid = [row + space + row for row in sub]
    bot = top[:]

    return top + mid + bot


n = int(input().strip())
print("\n".join(star(n)))
