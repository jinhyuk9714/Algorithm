def solution(s):
    if len(s) == 1:
        return 1  # 예외 처리

    min_length = len(s)

    for unit in range(1, len(s) + 1):
        compressed = []
        prev = s[0:unit]
        count = 1

        for i in range(unit, len(s), unit):
            curr = s[i:i+unit]
            if curr == prev:
                count += 1
            else:
                if count > 1:
                    compressed.append(str(count))
                compressed.append(prev)
                prev = curr
                count = 1

        if count > 1:
            compressed.append(str(count))
        compressed.append(prev)

        compressed_str = ''.join(compressed)
        min_length = min(min_length, len(compressed_str))

    return min_length
