"""
    N -> multiple of 5 print buzz
        multiple of 3 print fizz
        multiple of 3 and 5 print fizzbuzz

"""


class Node:
    def __init__(self):
        self.d = {}
        self.isWord = False

    def __repr__(self):
        return str(self.d) + str(self.isWord)


class Trie:
    def __repr__(self):
        return str(self.node)

    def __init__(self):
        self.node = Node()

    def addRange(self, li):
        li.sort(key=lambda x: (len(x), x))
        for word in li:
            self.add(word)

    def add(self, word):
        if not self.search(word) and len(word) > 0:
            n = self.node
            i = 0
            while i < len(word):
                if word[i] in n.d:
                    n = n.d[word[i]]
                else:
                    break
                i += 1
            while i < len(word):
                x = Node()
                n.d[word[i]] = x
                n = x
                i += 1
            n.isWord = True

    def search(self, word):
        li = [(self.node, 0, False)]
        while len(li) > 0:
            x = li.pop()
            if x[0].isWord and not x[2]:
                if x[1] == len(word):
                    return True
                li.append((x[0], x[1], True))
                li.append((self.node, x[1]))
            elif word[x[1]] in x[0].d:
                li.append((x[0].d[word[x[1]]], x[1] + 1, False))
        return False


t = Trie()
li = ['so', 'son', 'person', 'personified', 'per', 'ever', 'whatsoever', 'what']
t.addRange(li)
