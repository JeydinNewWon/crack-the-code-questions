class Solution:
    def isValid(self, s: str) -> bool:
        stack = []

        for l in s:
            if l in '({[':
                stack.append(l)
            else:
                if len(stack) > 0:
                    value = stack.pop()
                    if (l == ')' and value != '(') or (l == '}' and value != '{') or (l == ']' and value != '['):
                        return False
                else:
                    return False

        return len(stack) == 0