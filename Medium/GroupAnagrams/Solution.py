class Solution:
    def anagram_sort(self, s):
        s_sorted = sorted(s)
        return "".join(s_sorted)

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hmap = {}
        for s in strs:
            a_sort = self.anagram_sort(s) 
            if a_sort in hmap:
                hmap[a_sort].append(s)
            else:
                hmap[a_sort] = [s]
        
        return [v for v in hmap.values()]