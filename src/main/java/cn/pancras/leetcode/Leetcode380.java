package cn.pancras.leetcode;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2024/4/22
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode380 {

    private final RandomizedSet randomizedSet = new RandomizedSet();

    public void solution() {
        randomizedSet.insert(0);
        randomizedSet.insert(1);
        randomizedSet.remove(0);
        randomizedSet.insert(2);
        randomizedSet.remove(1);
        int random = randomizedSet.getRandom();
    }

    static class RandomizedSet {

        private final List<Integer> randomList;
        private final Map<Integer, Integer> randomMap;

        private final Random random;

        private static final Integer nullNumber = -1;

        public RandomizedSet() {
            randomList = new ArrayList<>();
            randomMap = new HashMap<>();
            random = new Random();
        }

        public boolean insert(int val) {
            int index = this.contains(val);
            if (index == nullNumber) {
                index = randomList.size();
                randomList.add(val);
                randomMap.put(val, index);
                return true;
            }
            return false;
        }

        /**
         * remove 逻辑
         * 1。 首先判断是否存在该元素，若不存在则返回false
         * 2. 如果存在该元素，要移除该元素，并将hashmap的索引更新
         * 3. 由于数组在非结尾移除元素，之后的元素的索引都需要变更，
         * 所以我们将最后的元素移至需要删除的位置，之后只需要做三个操作
         * 一是更新最后元素的索引
         * 二是删除最后一个元素
         * 三是删除移除元素索引
         * @param val
         * @return
         */
        public boolean remove(int val) {
            int index = this.contains(val);
            if (index != -1) {
                Integer last = randomList.getLast();
                randomList.set(index, last);
                randomMap.put(last, index);

                randomList.removeLast();
                randomMap.remove(val);
                return true;
            }

            return false;
        }

        public int getRandom() {
            int randomIndex = random.nextInt(randomList.size());
            return randomList.get(randomIndex);
        }

        private int contains(int val) {
            Integer index = randomMap.get(val);
            if (Objects.isNull(index)) {
                return nullNumber;
            } else {
                return index;
            }

        }
    }
}
