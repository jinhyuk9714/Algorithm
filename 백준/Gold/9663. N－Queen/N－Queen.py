import sys
sys.setrecursionlimit(1_000_000)

n = int(sys.stdin.readline().strip())

full = (1 << n) - 1   # 하위 n비트만 1 (열 0..n-1만 유효)
ans = 0

def dfs(cols, d1, d2):
    """
    cols: 이미 사용한 열들 (1=사용)
    d1  : ↘ 대각선 금지(다음 행 기준으로는 왼쪽으로 한 칸 이동 → <<1)
    d2  : ↙ 대각선 금지(다음 행 기준으로는 오른쪽으로 한 칸 이동 → >>1)
    재귀 깊이 = 현재 행 번호 (행마다 퀸 1개)
    """
    global ans
    if cols == full:          # n개의 열이 모두 채워짐 == n행에 모두 배치 완료
        ans += 1
        return

    # 이번 행에서 가능한 열 후보(금지: cols|d1|d2 → 허용: ~, 파이썬 무한비트 보정: &full)
    avail = ~(cols | d1 | d2) & full

    while avail:
        bit = avail & -avail          # 최하위 1비트만 뽑기 = 열 하나 선택
        avail -= bit                  # 그 열 제거(다음 후보로)
        # 다음 행으로 내려가며 상태 갱신:
        # - cols: 그 열 사용 표시
        # - d1:   선택한 열이 다음 행에서 ↘로 한 칸 이동하므로 <<1
        # - d2:   선택한 열이 다음 행에서 ↙로 한 칸 이동하므로 >>1
        dfs(cols | bit, (d1 | bit) << 1, (d2 | bit) >> 1)

dfs(0, 0, 0)
print(ans)
