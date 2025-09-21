import sys

input = sys.stdin.readline

expr = input().strip()
blocks = expr.split('-')

vals = [sum(map(int, b.split('+'))) for b in blocks]
answer = vals[0] - sum(vals[1:])

print(answer)
