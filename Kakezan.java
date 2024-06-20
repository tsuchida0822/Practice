public class Kakezan{
 public static void main(String[] args){
  kuku();
 }

 private static void kuku(){
  for (int i = 1; i <= 9; i++){
   for (int j = 1; j <= 9; j++){
    if (j == 9){
     System.out.print(i * j + "\n");
    } else {
     System.out.print(i * j + " ");
    }
   }
  }
 }
}