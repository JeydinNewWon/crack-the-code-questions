package Medium.InsertDeleteGetRandomO1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class RandomizedSet {

    private List<Integer> values;
    private Map<Integer, Integer> valToIndex;
    private Random rand = new Random();

    public RandomizedSet() {
        this.values = new ArrayList<>();
        this.valToIndex = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if (valToIndex.containsKey(val)) {
            return false;
        }

        this.valToIndex.put(val, this.values.size());
        this.values.add(val);

        return true;
    }
    
    public boolean remove(int val) {
        if (!valToIndex.containsKey(val)) {
            return false;
        }

        int indexToRemove = this.valToIndex.get(val);
        int lastElement = this.values.get(this.values.size() - 1);

        this.valToIndex.put(lastElement, indexToRemove);
        this.values.set(indexToRemove, lastElement);
        this.values.set(this.values.size() - 1, val);

        this.values.remove(this.values.size() - 1);
        this.valToIndex.remove(val);

        return true;
    }
    
    public int getRandom() {
        return this.values.get(rand.nextInt(this.values.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
