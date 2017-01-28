def isReflected(points):
    """
    :type points: List[List[int]]
    :rtype: bool
    """
    import itertools as it
    points.sort()
    points = list(points for points, _ in it.groupby(points))
    center = 0
    x = points[0][1]
    for point in points:
        if point[1] != x:
            return False
        center += point[0]
    y = center / len(points)
    diff = 0
    for point in points:
        diff += y - point[0]
    return diff == 0


def main():
    points = [[0, 0], [1, 0]]
    print(isReflected(points))


main()
