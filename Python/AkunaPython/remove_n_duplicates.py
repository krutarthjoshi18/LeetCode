def remove_n_duplicates(n, array):
    array = sorted(array)
    i = 0
    while i <= len(array) - n:
        print(i)
        if array[i] == array[i + n - 1]:
            if i + n == len(array) or array[i] != array[i + n]:
                array = array[0:i] + array[i + n:len(array)]
            else:
                i += n + 1
        else:
            i += 1
    return array


def main():
    inp = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
    print(remove_n_duplicates(2, inp))


main()
