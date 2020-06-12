package day04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class day04 {

    public static void main(String[] args) {
        int[] s1 = {1,2,3,7,8,9};
        int[] s2 = {2,5,6};
        //sortArr(s1,3,s2,3);
        sortArr1(s1,3,s2,3);
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }
    }
    public static void sortArr(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> result = new ArrayList();
        for (int i = 0; i < nums1.length; i++) {
            result.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            result.add(nums2[i]);
        }

        result.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        for (int i = 0; i < m + n; i++) {
            nums1[i] = result.get(i);
        }

    }



    public static void sortArr1(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        }
        while (m != 0) {
            if (n > 0 && (nums1[m-1] < nums2[n-1])) {
                nums1[m+n-1] = nums2[n-1];
                n = n - 1;
            } else {
                nums1[m+n-1] = nums1[m-1];
                m = m - 1;
            }
        }
        while (n != 0) {
            nums1[m+n-1] = nums2[n-1];
            n = n - 1;
        }
    }

}
