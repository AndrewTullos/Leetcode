class Solution:
    def repeatedCharacter(self, s: str) -> str:
        seen = {}
        for i, char in enumerate(s):
            if char in seen:
                return char
            seen[char] = i
        return ""  