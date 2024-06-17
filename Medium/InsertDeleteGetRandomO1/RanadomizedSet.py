import random 

class RandomizedSet:

    def __init__(self):
        self.valToIndex = {}
        self.values = []

    def insert(self, val: int) -> bool:
        if val in self.valToIndex:
            return False
        self.valToIndex[val] = len(self.values)
        self.values.append(val)
        return True

    def remove(self, val: int) -> bool:
        if val not in self.valToIndex:
            return False

        indexToRemove = self.valToIndex[val]
        lastElement = self.values[-1]

        self.valToIndex[lastElement] = indexToRemove
        self.values[indexToRemove] = lastElement
        self.values[-1] = val

        self.values.pop()

        del self.valToIndex[val]

        return True

    def getRandom(self) -> int:

        randIndex = random.randint(0, len(self.values) - 1)
        return self.values[randIndex]


    
# Your RandomizedSet object will be instantiated and called as such:
# obj = RandomizedSet()
# param_1 = obj.insert(val)
# param_2 = obj.remove(val)
# param_3 = obj.getRandom()