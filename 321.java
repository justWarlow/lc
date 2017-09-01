class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        List<int[]> one = generateList(nums1, nums2, k);
        return compare(one, k);
    }

    public List<int[]> generateList(int[] n1, int[] n2, int k) {
        List<int[]> res = new ArrayList<int[]>();
        if (n1 == null || n2 == null || k == 0) {
            return res;
        }
        for (int i = 0; i <= k; i++) {
            int[] a = helper(n1, i);
            int[] b = helper(n2, k - i);
            if (a != null && b != null) {
                res.add(merge(a, b));
            }
        }
        return res;
    }

    public int[] helper(int[] arr, int k) {
        if (k == 0) {
            return new int[0];
        } else if (k > arr.length) {
            return null;
        } else if (k == arr.length) {
            return arr;
        }

        int[] res = new int[k];
        int ind = 0;
        for (int i = 0; i < k; i++) {
            int max = ind;
            for (int j = ind; j <= arr.length - (k - i); j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            res[i] = arr[max];
            ind = max + 1;
        }
        return res;
    }

    public int[] merge(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int aind = 0, bind = 0;
        while (aind < a.length && bind < b.length) {
            if (a[aind] > b[bind]) {
                res[aind + bind] = a[aind++];
            } else if (a[aind] == b[bind]) {
                int at = aind;
                int bt = bind;
                while (at < a.length && bt < b.length && a[at] == b[bt]) {
                    at++;
                    bt++;
                }
                if (at < a.length && bt < b.length) {
                    if (a[at] < b[bt]) {
                        res[aind + bind] = b[bind++];
                    } else {
                        res[aind + bind] = a[aind++];
                    }
                } else {
                    if (at == a.length) {
                        res[aind + bind] = b[bind++];
                    } else if (bt == b.length) {
                        res[aind + bind] = a[aind++];
                    }
                }
            } else {
                res[aind + bind] = b[bind++];
            }
        }
        while (aind < a.length) {
            res[aind + bind] = a[aind++];
        }
        while (bind < b.length) {
            res[aind + bind] = b[bind++];
        }
        return res;
    }

    public int[] compare(List<int[]> list, int k) {
        for (int i = 0; i < k; i++) {
            int max = list.get(0)[i];
            for (int j = 0; j < list.size(); j++) {
                max = Math.max(list.get(j)[i], max);
            }
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j)[i] != max) {
                    list.remove(j);
                    j--;
                }
                if (list.size() == 1) {
                    break;
                }
            }
        }
        return list.get(0);
    }
}