def has_non_intersecting_path(n, A_x, A_y, B_x, B_y, P_x, P_y, Q_x, Q_y):
    if check_inside(n, A_x, B_x, P_x, Q_x) and check_inside(n, A_y, B_y, P_y, Q_y):
        return True
    check_on_same_line(n, A_x, B_x, P_x, Q_x)
    check_on_same_line(n, A_y, B_y, P_y, Q_y)
    check_corners(n, A_x, B_x, P_x, Q_x)
    check_corners(n, A_y, B_y, P_y, Q_y)
    check_inside(n, A_x, B_x, P_x, Q_x)
    check_inside(n, A_y, B_y, P_y, Q_y)


def check_inside(n, a, b, c, d):
    if check(n, a) and check(n, b) and check(n, c) and check(n, d):
        return True


def check(n, a):
    if 0 < a < n - 1:
        return True


def check_on_same_line(n, a, b, c, d):
    if a == b == c == d == 0 or a == b == c == d == n - 1:
        return False


def check_corners(n, a, b, c, d):
    if min(a, b) == 0 and min(c, d) == 0 and max(a, b) == n - 1 and max(c, d) == n - 1:
        return False


def main():
    has_non_intersecting_path()


main()
