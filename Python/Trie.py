compList = []


class Node(object):
    def __init__(self):
        self.d = {}
        self.isWord = False

    def __repr__(self):
        return str(self.d) + str(self.isWord)


class Trie(object):
    def __repr__(self):
        return str(self.node)

    def __init__(self):
        self.node = Node()

    def addRange(self, li):
        li.sort(key=lambda x: (len(x), x))
        # print(li)
        for word in li:
            self.add(word, compList)

    def add(self, word, compList):
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
        else:
            compList.append(word)

    def search(self, word):
        li = [(self.node, 0, False)]
        while len(li) > 0:
            x = li.pop()
            if x[0].isWord and not x[2]:
                if x[1] == len(word):
                    return True
                li.append((x[0], x[1], True))
                li.append((self.node, x[1], False))
                print("x1: " + str(x[1]))
                print(word[x[1]])
                print(x[0].d)
            elif word[x[1]] in x[0].d:
                print("Doesthis work" + str(x[0]))
                print(x[0].d[word[x[1]]])
                li.append((x[0].d[word[x[1]]], x[1] + 1, False))
        return False


t = Trie()
# li = ['aaaaabababaaabbbababbbaaab', 'ababbabaa', 'baaaabbbbabbaabbbaababba', 'baabaaabaaaaabaaabaaaabbbabbb', 'aabbb',
#       'ababbbaaabaaaaabbbbabaababbbbbabb', 'bbabbbab', 'baaa', 'aabba', 'aaaaaabaaa', 'aabaabbbbabbbaabaaaaaaaaaaaa',
#       'aaaba', 'aaababbbabbabaa', 'aaabb', 'bbabb', 'bbabaababaabb', 'bbbbaabaabaaa', 'bbaaaaaaa', 'baab',
#       'ababbbabaaaaaa', 'aabbabbbabbbbabbaaaabaaaba', 'baaabbbbb', 'babaababbbabb', 'bbab', 'abbbba', 'bbaa',
#       'bbbabbaaaabbbbabbaaabababb', 'abbbbbabaa', 'abbabbaaab', 'babbaabbaaabbbaaaababaaabaaabbba',
#       'aaaaaabbbababaaabbb', 'abbaaaaab', 'baaabbbbbaabbbaabaaabbbaaaab', 'abbaaaaabaaabbbaaa', 'bbaabb',
#       'bbbabbaaababaabaabaaababbaabbaa', 'ababbba', 'aaabaaaaa', 'baaaabbbbbaabbbab', 'aababbababaabbbaab', 'baabb',
#       'ababaabababbaabbaa', 'abbbbababaabbaaaabbb', 'aaaaa', 'baaaabb', 'baaaaba', 'abbbaab', 'abbaababb',
#       'bbababaababaaabababbba', 'aaabaaaabaabbbbbbaaaaaaa', 'ababb', 'aaab', 'aaaa', 'aaaaaababbbaaaababbaababb',
#       'abaa', 'bb', 'baaabbababaabbbabaaaababaababaab', 'bbababa', 'aaabaabbabbbbaaaaabbb', 'aabbaabbbabbaababbaabbb',
#       'baaabbbbbaabaa', 'abaaaaaba', 'abaab', 'abbb', 'bbaaabaa', 'bbabaab', 'bbbbbbbaaa', 'abbbaabbbbbab',
#       'aabbabbbab', 'abbabbbaabaabb', 'bbbbbaaaabbbabaaaabbabbbababbab', 'aaabaa', 'bbababaab', 'baaaabbbb',
#       'abbbaabbbabbbababaabaaabaabbababaab', 'baaaababa', 'aabaabbbb', 'ba', 'baaaabbbbbbababbabaa', 'abbbaaaab',
#       'abbbaababbbbaaababbabaaababbbaaab', 'aababba', 'baaaabbbabaaaaababbababaabba', 'baabbbabbababaaa',
#       'aaaaabbabbaaab', 'aa', 'ab', 'abbbaaaabbababaaaaabbabbbabaaaaaaaaaaab', 'abbabbbbabba', 'aba', 'abb',
#       'baaabbbbbaaaaaaabaabbbaab', 'bbbabaababbababbaaaababaab', 'bba', 'bbb', 'baaaabbbbaabbababba', 'bbaabbaabb',
#       'bbbbaabbabbbabaababbabaabaa', 'aab', 'bbaabbbba', 'bbbabbaaaaaaababaababbababaaabbababaab',
#       'aaabaaaaabaaaabaabbab', 'baabbbab', 'baaaba', 'babbaaabab', 'abbabbabbaaabababbbabbababaab', 'baa', 'abaabbbaab',
#       'bab', 'baaaabbbbbaabaaaabbaaabbbbbbbbaaa', 'abbbaababbabbbab', 'aabaabaaabbbabba', 'baababaab', 'aabaabaaa',
#       'aaaaaab', 'abbabaabaabbbbaaabbabbbaab', 'abbaababbababbbabbaaabaaabbbbb', 'aababbabaa',
#       'abaaaaabaabaaaabaabbbbbbaabbbbbabaa', 'ababaaaabbb', 'babbaaaabbb', 'abaabaaababbababaab',
#       'aabaabbbbaabaaaabbbbaaaa', 'abbbbabab', 'abbababba', 'aaaaaaaaaabba', 'aababbbaababba', 'abaaab',
#       'aababbaabbabbaaabaaaaaaababbabaaaa', 'ababbaabbabbbabaabbabbbabbaaaaa', 'ababaaba', 'aaabaabababaaa', 'baaaabbb',
#       'aaaaaa', 'bbababaaaab', 'baaaabbbaabbabbaabbaaabbaaaaab', 'ababbbaabbbaabbaaabaaaaab', 'abbab', 'aaaaaaaaaa',
#       'aabaabbbbabbaaaaaabaaabbbbb', 'aabaa', 'abbbaaabbaaaabbbbbab', 'ababaabaababbabbabbabaa', 'abbbababbbabbbababa',
#       'abaabbb', 'aaabbbabaa', 'baabbababbbabaab', 'bbbabaababbbbaaabaabbbbbbbaaab', 'abbba', 'babbaabbaa', 'bbaabaabb',
#       'babaabab', 'ababbabb', 'bbbabba', 'babaabba', 'aaaaaaaaaaabbabbbab', 'bbbaaabbabbaaaaababbabaaabbbabaa',
#       'bbaabbaa', 'babbb', 'bbaaaaabaaaaaaaabbbabaa', 'bbbaaab', 'aaababbb', 'ababbbab', 'bbabbbabaabaabbbb',
#       'babbbabbababaababbb', 'aabaaababbbabaabaabaa', 'baabbaababbaaababaaabbbababa', 'babaab', 'bababaaa',
#       'abbaaaaaabbaaba', 'bbabbabaa', 'bbbbba', 'aabbbabaababbabbaaab', 'ababbbaaab', 'ababbbabababbaabbababaababbb',
#       'abaabbaababbaaabb', 'aabbabbbabbaabbbabbabaabbbababa', 'aababbabababaaabbbaaababbab', 'babaababbb',
#       'aaababbbaaaabbbaaabbbaab', 'aaababbbbaabbbab']
li = ['sss', 'ss']
la = li.copy()
t.addRange(li)
# print(la)
# print(compList)
result = []
for word in la:
    if word not in compList:
        result.append(word)
print(result)
