import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))

sorted_arr = sorted(list(set(arr)))

rank_dic = {value: index for index, value in enumerate(sorted_arr)}

for i in arr:
    print(rank_dic[i], end=' ')