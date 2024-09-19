
//kadanaes algorithm is used to solve the MAX_SUBARRAY types of problems

class HelloWorld {
    public static void main(String[] args) {
        int[] arr={1,-3,5,4,-2,1,5};
        int count=0;
        int maxele=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            count+=arr[i];
            int maxm=Math.max(count,maxele);
            if(count<0){
                count=0;
            }
        }
        System.out.println(count);
    }
}
