class CalculateCalender {
    public static void main(String[] args) {
        String[] calender = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int count = 0;
        int j = 2;  // Assuming you want to start from Tuesday
        while (count <=15) {
             if(count==15){
                
                System.out.println("The day is: " + calender[j]);
            }
            j++;
           if(j==calender.length){
                j=0;
            }
            count++;
        }
    }
}
