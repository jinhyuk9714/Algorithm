import sys

sys.setrecursionlimit(1_000_000)
input = sys.stdin.readline

N, K = map(int, input().split())
A = list(map(int, input().split()))

cnt = 0
ans = -1


def merge(s, m, e):
    global cnt, ans
    i, j = s, m + 1
    tmp = []

    # 두 부분(정렬된 상태)을 병합
    while i <= m and j <= e:
        if A[i] <= A[j]:
            tmp.append(A[i])
            i += 1
        else:
            tmp.append(A[j])
            j += 1

    while i <= m:
        tmp.append(A[i])
        i += 1
    while j <= e:
        tmp.append(A[j])
        j += 1

    # 원본 배열로 다시 복사(이 순간을 카운트)
    t = 0
    for idx in range(s, e + 1):
        A[idx] = tmp[t]
        t += 1
        cnt += 1
        if cnt == K:
            ans = A[idx]


def merge_sort(s, e):
    if s >= e:
        return
    m = (s + e) // 2
    merge_sort(s, m)
    merge_sort(m + 1, e)
    merge(s, m, e)


merge_sort(0, N - 1)
print(ans)
