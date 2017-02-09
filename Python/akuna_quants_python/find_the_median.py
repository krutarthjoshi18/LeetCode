def binary_search(arr, val, cmp):
    l = -1
    r = len(arr)
    while r - l > 1:
        e = (l + r) >> 1
        if cmp(arr[e], val):
            l = e
        else:
            r = e
    return r


def subarray_median(arr, k):
    ind = binary_search(arr, k, lambda x, y: x > y)
    for i in range(ind, len(arr)):
        if arr[i] == k:
            ind = i
        else:
            break
    arr_new = arr[0: ind + 1]
    if len(arr_new) % 2 == 0:
        return (arr_new[ind // 2] + arr_new[ind // 2 + 1]) / 2
    else:
        return arr_new[ind // 2]


def main():
    arr = [6, 6, 5, 5]
    print(subarray_median(arr, 5))


main()
