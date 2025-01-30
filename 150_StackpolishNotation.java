class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> container=new Stack<>();
        String op="+-/*";
        for(String i:tokens){
            if(!op.contains(i)){
                container.push(i);
            }
            else{
                int a=Integer.valueOf(container.pop());
                int b=Integer.valueOf(container.pop());
                switch(i){
                    case "+":
                        container.push(String.valueOf(a+b));
                        break;
                    case "-":
                        container.push(String.valueOf(b-a));
                        break;
                    case "/":
                        container.push(String.valueOf(b/a));
                        break;
                    case "*":
                        container.push(String.valueOf(a*b));
                        break;
                }
            }
        }
        return Integer.valueOf(container.pop());
    }
}
