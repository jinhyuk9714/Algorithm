import sys

input = sys.stdin.readline

n = int(input())
words = set()

for _ in range(n):
    words.add(input().strip())

words_list = list(words)

words_list.sort(key=lambda x: (len(x), x))

for w in words_list:
    print(w)
   