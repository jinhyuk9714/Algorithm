import sys

input = sys.stdin.readline


def Cantor(n):
    if n == 1:
        return "-"

    left = Cantor(n // 3)
    center = " " * (n // 3)
    return left + center + left


while True:
    try:
        n = int(input())
        print(Cantor(3 ** n))
    except:
        break
