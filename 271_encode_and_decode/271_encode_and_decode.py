class Solution:

    def encode(self, strs: List[str]) -> str:
        res = []
        for string in strs:
            # res += str(len(string)) + "#" + string
            res.append(str(len(string)) + "#" + string)
        return "".join(res)

    def decode(self, s: str) -> List[str]:
        res = []
        i = 0
        while i < len(s):
            j = i
            while s[j] != "#":
                j += 1
            word_length = int(s[i:j])
            word_start = j + 1
            word_end = word_start + word_length
            res.append(s[word_start:word_end])
            i = word_end

        return res

