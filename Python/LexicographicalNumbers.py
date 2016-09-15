def lexicalOrder(n):
    string_list = sorted([str(x) for x in range(1, n + 1)])
    int_list = [int(x) for x in string_list]
    return int_list


def main():
    print(lexicalOrder(49999))


main()
