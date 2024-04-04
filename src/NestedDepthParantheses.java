public class NestedDepthParantheses {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(s);
        int result = maxDepth(s);
        System.out.println(result+" : result");
    }

    public static int maxDepth(String s) {
        int count =0;
        int maxD =0;
        for(char c : s.toCharArray()) {
            if(c=='('){
                count++;
            } else if(c==')') {
                if(count>maxD){
                    maxD=count;

                }
                count--;
            }
        }
        return maxD;
    }
}
