public class printing_n_integers {

    static void print(int a){
        if(a == 0) return;
        System.out.print(a + " ");
        print(a - 1);
    }

    public static void main(String[] args){
        print(10);
    }
}
