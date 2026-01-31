// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class lexicographical {
   public lexicographical() {
   }

   public static void main(String[] var0) {
      for(int var1 = 1; var1 <= 9; ++var1) {
         lexico(var1, 13);
      }

   }

   static void lexico(int var0, int var1) {
      if (var0 <= var1) {
         System.out.println("" + var0 + " ");

         for(int var2 = 0; var2 <= 9; ++var2) {
            lexico(var0 * 10 + var2, var1);
         }

      }
   }
}

