public class subsequence {
    static void subseq(String s, String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        char ch= s.charAt(0);
        String rest=s.substring(1);

        subseq(rest,ans);
        subseq(rest,ans+ch);
    }
    public static void main(String[] args){
        subseq("ab","");
    }
}
