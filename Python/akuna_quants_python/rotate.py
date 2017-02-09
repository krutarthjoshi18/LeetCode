def rotate(A):
    m = len(A)
    n = len(A[0])
    zeros2 = [0 for x in range(m)]
    res = [zeros2[:] for x in range(n)]
    for i in range(0, m):
        for j in range(0, n):
            res[n - 1 - j][i] = A[i][j]
    return res


def main():
    A = [[1, 2, 3], [4, 5, 6]]
    print(rotate(A))


main()
