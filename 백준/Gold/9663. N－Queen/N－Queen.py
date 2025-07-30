n = int(input())
result = 0

col_used = [False] * n
diag1 = [False] * (2 * n)  # ↘: row + col
diag2 = [False] * (2 * n)  # ↙: row - col + n

def dfs(row):
    global result
    if row == n:
        result += 1
        return
    for col in range(n):
        if not col_used[col] and not diag1[row + col] and not diag2[row - col + n]:
            col_used[col] = diag1[row + col] = diag2[row - col + n] = True
            dfs(row + 1)
            col_used[col] = diag1[row + col] = diag2[row - col + n] = False

dfs(0)
print(result)
