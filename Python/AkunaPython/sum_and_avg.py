def find_sum_and_avg(ints):
    sum = 0
    count = 0
    for i in range(0, len(ints), 2):
        sum += ints[i]
        count += 1
    return sum, sum // count


def main():
    ints = [1, 2, 3, 4, 5]
    print(find_sum_and_avg(ints))


main()
