package com.hi.problems;

import java.util.*;

public class FindIndexof2NumbersForTargetSum {
    public static void main(String[] args) {
        int num[] = new int[]{2, 5, 3, 71, 4, 1};
        int target = 9;

        int[] indices = findTwoSum2(num, target);
        System.out.println(java.util.Arrays.toString(num));
        //Arrays.stream(num).forEach(System.out::print);
        if (indices.length == 2) {
            System.out.println(indices[0] + " " + indices[1]);
        } else {
            System.out.println("No solution found!");
        }

    }

   // Time complexity: O(n^2)
    private static int[] findTwoSum_BruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    // Time complexity: O(n)
    private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    // This approach is called the two-pointer approach. It is a very common pattern for solving array related problems.

    // Time complexity: O(n*log(n))

    // Time complexity: O(n*log(n))
    private static int[] findTwoSum_Sorting(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                return new int[]{nums[left], nums[right]};
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }

    private static int[] findTwoSum1(int[] nums, int target) {
        Integer[] list1 = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, list1);

        int index = 0;

        for (int i : list) {
            if (i > target) {
                continue;
            } else if (list.contains(target - i)) {
                return new int[]{index, list.indexOf(target - i)};
            }
            index++;
        }
        return new int[]{};
    }

    private static int[] findTwoSum2(int[] nums, int target) {
        Map map = new java.util.HashMap<Integer, Integer>();
        Integer[] inputIntegerArray =
                Arrays.stream(nums).boxed().toArray(Integer[]::new);
        List<Integer> inputIntegerList = new ArrayList<>();
        Collections.addAll(inputIntegerList, inputIntegerArray);
        System.out.println(inputIntegerList);
        int index = 0;
        for (int i : inputIntegerList) {
            map.put(index, i);
            index++;
        }

        //System.out.println(map);
        Map<Integer, Long> map1 = Arrays
                .stream(nums)
                .boxed() // this
                .collect(java.util.stream.Collectors.groupingBy(e -> e, java.util.stream.Collectors.counting()));
        //System.out.println(map1);

        Map<Integer, Integer> map2 = Arrays
                .stream(nums)
                .boxed()
                .collect(java.util.stream.Collectors.groupingBy(e -> e,
                        java.util.stream.Collectors.reducing(0, e -> 1, Integer::sum)));

        Map<Integer, Integer> map3 = Arrays
                .stream(nums)
                .boxed()
                .collect(java.util.stream.Collectors.toMap(e -> e, v -> 1,
                        Integer::sum));

        //System.out.println(map3);
        index = 0;
        Iterator<Integer> iterator = map3.keySet().iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (value > target) {
                continue;
            } else if (map.containsValue(target - value)) {
                System.out.println(inputIntegerList);
                return new int[]{inputIntegerList.indexOf(target - value),
                        inputIntegerList.indexOf(value)};
            }
            index++;
        }
        return new int[]{};
    }


}
