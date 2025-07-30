n = int(input())
chess_map = [0] * n  # chess_map[row] = col: row행에 col열에 퀸을 뒀다는 의미
result = 0


def is_safe(row):
    for i in range(row):
        # 같은 열이거나, 같은 ↘ / ↙ 대각선에 퀸이 있다면 False
        if (chess_map[i] == chess_map[row]) or \
           (abs(chess_map[i] - chess_map[row]) == abs(i - row)):
            return False
    return True


def queen(row):
    global result
    if row == n:
        result += 1
        return
    for col in range(n):
        chess_map[row] = col
        if is_safe(row):
            queen(row + 1)  # 다음 행으로 진행


queen(0)
print(result)
