for T in range(1, 11):
    a = int(input())
    arr = []
    for i in range(8):
        arr.append(list(input()))
    count = 0

    for i in range(8):
        for j in range(0, 9 - a):
            isPalin = True
            for now in range(a >> 1):
                if arr[i][j + now] != arr[i][j + a - 1 - now]:
                    isPalin = False
                    break
            if isPalin:
                count += 1

    for i in range(0, 9 - a):
        for j in range(8):
            isPalin = True
            for now in range(a >> 1):
                if arr[i + now][j] != arr[i + a - 1 - now][j]:
                    isPalin = False
                    break
            if isPalin:
                count += 1

    print(f"#{T} {count}")
