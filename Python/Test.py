s = "title"
t = "bible"
print([s.find(i) for i in s])
print([t.find(j) for j in t])

a = list("abc")
a[1], a[2] = a[2], a[1]
print(a)

b = ('a', 'b', 'c')
b[1], b[2] = b[2], b[1]
print(b)
