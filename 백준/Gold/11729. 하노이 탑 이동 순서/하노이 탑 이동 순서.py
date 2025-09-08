import sys

input = sys.stdin.readline
write = sys.stdout.write


def hanoi(k, a, b, c):
    if k:
        hanoi(k - 1, a, c, b)
        write(f"{a} {c}\n")
        hanoi(k - 1, b, a, c)


k = int(input().strip())
write(str((1 << k) - 1) + "\n")
hanoi(k, 1, 2, 3)
