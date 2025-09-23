import sys

input = sys.stdin.readline

board = [list(map(int, input().split())) for _ in range(9)]

# 사용 여부 테이블 (1~9 사용, 인덱스 0은 버림)
rows = [[False] * 10 for _ in range(9)]
cols = [[False] * 10 for _ in range(9)]
boxes = [[False] * 10 for _ in range(9)]

blanks = []
for r in range(9):
    for c in range(9):
        v = board[r][c]
        if v == 0:
            blanks.append((r, c))
        else:
            rows[r][v] = True
            cols[c][v] = True
            boxes[(r // 3) * 3 + (c // 3)][v] = True


def dfs(idx: int) -> bool:
    if idx == len(blanks):  # 모든 빈칸 채움
        # 정답 출력
        out = []
        for r in range(9):
            out.append(' '.join(map(str, board[r])))
        print('\n'.join(out))
        return True

    r, c = blanks[idx]
    b = (r // 3) * 3 + (c // 3)
    for d in range(1, 10):
        if not rows[r][d] and not cols[c][d] and not boxes[b][d]:
            # 배치
            board[r][c] = d
            rows[r][d] = cols[c][d] = boxes[b][d] = True

            if dfs(idx + 1):
                return True

            # 되돌리기
            board[r][c] = 0
            rows[r][d] = cols[c][d] = boxes[b][d] = False

    return False


dfs(0)
