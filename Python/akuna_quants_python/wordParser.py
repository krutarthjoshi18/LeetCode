from string import ascii_lowercase


def wordparser(input_lines):
    words = []
    for line in input_lines:
        for word in line.split():
            if word.isalpha():
                words.append(word)

    dict1 = {}
    for word in words:
        if word.isalpha() and word not in dict1.keys():
            dict1[word] = 1
        elif word.isalpha():
            dict1[word] += 1

    dict2 = fill_char_dict()
    for line in input_lines:
        for c in words:
            if c.isalpha() and c not in dict2.keys():
                dict2[c] = 1
            elif c.isalpha():
                dict2[c] += 1

    sd1 = sorted(dict1.items())
    sd2 = sorted(dict2.items())

    result = str(len(words)) + "\n" + "words"
    for k, v in sd1:
        result += "\n" + str(k) + " " + str(v)
    result += "\n" + "letters"

    for k, v in sd2:
        result += "\n" + str(k) + " " + str(v)

    return result


def fill_char_dict():
    dict = {}
    for c in ascii_lowercase:
        dict[c] = 0
    return dict
