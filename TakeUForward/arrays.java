import java.util.*;

public class arrays {
    public static void main(String[] args) {

        // int[] arr = { 3, 8, 1, 4, 6, 2 };
        // int res = findSecondLargest(arr);
        // System.out.println(res);

        // int[] dup = { 0, 1, 1, 2, 2, 2, 3, 3, 4 };
        // int[] numberOfUniqueEl = removeDuplicates(dup);
        // System.out.println(Arrays.toString(numberOfUniqueEl));

        // int places = 4;
        // int[] arr = { 1, 2, 3, 4, 5, 6 };
        // System.out.print(Arrays.toString(leftRotate(arr, places)));
        // System.out.print(Arrays.toString(rightRotate(arr, places)));

        // int[] arr = { 1, 3, 0, 3, 0, 4, 5, 0, 6 };
        // System.out.println(Arrays.toString(moveZeroes(arr)));

        // int[] arr = { 3, 1, 1, 1, 4, 5, 1, 1, 8, 1, 1, 0, 1, 6 };
        // System.out.println(maxConsecutiveOnes(arr));

        // int[] arr1 = { 1, 2, 3, 4, 5 };
        // int[] arr2 = { 2, 3, 4, 5, 6, 7 };
        // System.out.println(unionOfArrays(arr1, arr2));

        // int[] arr = { 1, 2, 3 };
        // subarraySum(arr, 3);

        // int[][] matrixArray = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        // int[][] matrixArray = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        // setZeroes(matrixArray);

        // int[] arr = { 1, 4, 5, 3, 2, 8, 4 };
        // System.out.print(Arrays.toString(twoSum(arr, 122)));

        // int n = 3;
        // int[][] queries = { { 0, 0, 1 }, { 1, 2, 2 }, { 0, 2, 3 }, { 1, 0, 4 } };
        // int[][] queries = { { 0, 0, 4 }, { 0, 1, 2 }, { 1, 0, 1 }, { 0, 2, 3 }, { 1,
        // 2, 1 } };
        // System.out.println(matrixSumQueries(n, queries));

    }

    static long matrixSumQueries(int n, int[][] queries) {
        long sum = 0;

        // Init anwer
        int[][] temp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j] = 0;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < queries[i].length; j++) {
                Map<Integer, Integer> rowMap = new HashMap<>();
                Map<Integer, Integer> colMap = new HashMap<>();
                if (queries[i][0] == 0) {
                    rowMap.put(queries[i][1], queries[i][2]);
                    changeMatix(temp, n, rowMap, colMap);
                } else if (queries[i][0] == 1) {
                    colMap.put(queries[i][1], queries[i][2]);
                    changeMatix(temp, n, rowMap, colMap);
                }
            }
        }

        // Calculate sum
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(temp[i][j]);
                sum += temp[i][j];
            }
            System.out.println("");
        }
        return sum;
    }

    static void changeMatix(int[][] temp, int n, Map<Integer, Integer> rowMap, Map<Integer, Integer> colMap) {
        for (Map.Entry<Integer, Integer> entry : rowMap.entrySet()) {
            int rowValue = entry.getKey();
            int rowValueToPut = rowMap.get(entry.getKey());
            for (int i = rowValue; i <= rowValue; i++) {
                for (int j = 0; j < n; j++) {
                    temp[i][j] = rowValueToPut;
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : colMap.entrySet()) {
            int colValue = entry.getKey();
            int colValueToPut = colMap.get(entry.getKey());
            for (int i = 0; i < n; i++) {
                for (int j = colValue; j <= colValue; j++) {
                    temp[i][j] = colValueToPut;
                }
            }
        }
    }

    static int[] twoSum(int[] arr, int target) {

        // Brute
        // int[] res = new int[2];
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] + arr[j] == target) {
        // res[0] = i;
        // res[1] = j;
        // }
        // }
        // }
        // return res;

        // Optimized
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int remainder = target - arr[i];
            if (map.containsKey(remainder)) {
                res[0] = map.get(remainder);
                res[1] = i;
            } else {
                map.put(arr[i], i);
            }
        }
        return res;
    }

    static void setZeroes(int[][] arr) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> index = new ArrayList<>();
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    index.add(j);
                    map.put(i, index);
                }
            }
        }

        for (int name : map.keySet()) {
            String value = map.get(name).toString();
            System.out.println(name + " : " + value);
        }

        // Rows to zero

        // Cols to zero
        // System.out.println(Arrays.asList(index));

        for (int name : map.keySet()) {
            String value = map.get(name).toString();
            System.out.println(name + " : " + value);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }

    static void subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int l = i; l <= j; l++) {
                    sum += nums[l];
                }
                if (sum == k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    static int findSecondLargest(int[] arr) {
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest)
                secondLargest = arr[i];
        }
        return secondLargest;
    }

    static int[] removeDuplicates(int[] arr) {
        int[] res = new int[arr.length];
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        for (int k = 0; k < i + 1; k++) {
            res[k] = arr[k];
        }
        return res;
    }

    static int[] leftRotate(int[] arr, int places) {
        places = places % arr.length;
        reverseArray(arr, 0, places - 1);
        reverseArray(arr, places, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);

        return arr;
    }

    static int[] rightRotate(int[] arr, int places) {
        places = places % arr.length;
        reverseArray(arr, 0, places);
        reverseArray(arr, places + 1, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);
        return arr;
    }

    static void reverseArray(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static int[] moveZeroes(int[] arr) {
        int firstZero = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                firstZero = i;
                break;
            }
        }
        for (int j = firstZero + 1; j < arr.length; j++) {
            if (arr[j] != 0) {
                int temp = arr[firstZero];
                arr[firstZero] = arr[j];
                arr[j] = temp;
                firstZero++;
            }
        }
        return arr;
    }

    static int maxConsecutiveOnes(int[] arr) {
        int res = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > res)
                    res = count;
            } else {
                count = 0;
            }
        }
        return res;
    }

    static int[] unionOfArrays(int[] arr1, int[] arr2) {
        int[] union = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int unionIndex = 0;
        while (i < arr1.length && j < arr2.length) {
            unionIndex++;
            if (union[unionIndex] == Math.min(arr1[i], arr2[j])) {
                i++;
            }
            union[unionIndex] = Math.min(arr1[i], arr2[j]);
        }

        return union;
    }

}
