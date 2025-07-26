def solution(board, moves):
    stack = []
    result = 0
    for move in moves:
        for i in range(len(board)):
            cur = board[i][move - 1]
            if cur != 0:
                if stack:
                    if stack[-1] == cur:
                        stack.pop()
                        result += 2
                    else:
                        stack.append(cur)
                else:
                    stack.append(cur)
                board[i][move - 1] = 0
                break
    return result