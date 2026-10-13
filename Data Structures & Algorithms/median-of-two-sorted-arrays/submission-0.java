class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;

        int curr = 0; 
        int prev = 0;

        int p1 = 0, p2 = 0;

        for(int i = 0; i < (n+m)/2 +1; i++){
            prev = curr;
            if(p1 < n && (p2 >= m || nums1[p1] < nums2[p2])){
                curr = nums1[p1];
                p1++;
            }
            else{  
                curr = nums2[p2];
                p2++;
            }
        }

        return (n+m)%2 == 0 ? (curr+prev)/2.0 : (double)curr;
        
    }
}
