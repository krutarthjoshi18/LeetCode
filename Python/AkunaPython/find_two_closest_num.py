import sys


def find_two_closest_and_sum(int_list, target_num):
    firstMin = sys.maxsize
    secondMin = sys.maxsize
    for i in range(0, len(int_list)):
        if firstMin > max(target_num - int_list[i], int_list[i] - target_num):
            secondMin = firstMin
            firstMin = max(target_num - int_list[i], int_list[i] - target_num)
    return firstMin + secondMin


def main():
    inp = [-15, -14, -9, -28, -17, 0, 6, 7, -6, -29]
    find_two_closest_and_sum(inp, 5)


main()
