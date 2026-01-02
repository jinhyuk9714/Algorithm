import sys
from collections import Counter
from re import split

input = sys.stdin.readline

N = int(input().strip())

cards = list(map(int, input().split()))

# 카드 값별 개수 세기 (딕셔너리 형태로 저장)
cnt = Counter(cards) # 예: cnt[10] = 3, cnt[-10] = 2

M = int(input().strip())

queries = list(map(int, input().split()))

ans = [str(cnt[q]) for q in queries]

print(" ".join(ans))
