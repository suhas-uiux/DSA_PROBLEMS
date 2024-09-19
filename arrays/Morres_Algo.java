//morres algorithm is usually used for calculating the majority elemnt in an array
class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1,12,12,12,12,12,12,2, 2, 2, 2};
        int freq = 0;
        int ans = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (freq == 0) {
                ans = arr[i]; 
            }
             if (ans == arr[i]) {
                freq++; 
                } else {
                freq--; 
            }
        }
        
        System.out.println(ans);
    }
}
