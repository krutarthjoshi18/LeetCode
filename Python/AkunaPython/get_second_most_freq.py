def get_second_most_freq(the_list):
    dict = {}
    for item in the_list:
        if not item in dict:
            dict[item] = 1
        else:
            dict[item] += 1
    # print(dict)
    max = 0
    for k, v in dict.items():
        if v > max:
            second_max = max
            max = v
        elif v > second_max:
            second_max = v

    sec_freq = []
    for k, v in dict.items():
        if v == second_max:
            sec_freq.append(k)
    sorted(sec_freq)
    return sec_freq[0] if len(sec_freq) > 0 else 0


def main():
    the_list = [3, 3, 3, 3, 2, 2, 1, 1, 1]
    print(get_second_most_freq(the_list))


main()
