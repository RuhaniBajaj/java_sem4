public class towerofhanoi {
    static void toh(int n, char src, char helper, char dest){
        if(n==0) return;
        toh(n-1,src,dest,helper);
        System.out.println("Move disc "+n+" from "+src+" to " +dest);
        toh(n-1, helper,src,dest);
    }
    public static void main(String[] args){
         toh(3,'A','B','C');
    }
}
