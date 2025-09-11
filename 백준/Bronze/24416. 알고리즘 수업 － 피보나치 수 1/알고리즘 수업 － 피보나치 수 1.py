n = int(input())
# F(n)
if n <= 2:
    fn = 1
else:
    f = [0] * (n + 1)
    f[1] = f[2] = 1
    for i in range(3, n + 1):
        f[i] = f[i - 1] + f[i - 2]
    fn = f[n]

print(fn, 0 if n <= 2 else n - 2)
