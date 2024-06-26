package fanfan.chara;
public class Character{
 public static void character(){

   //誰と行くか
   int character = new java.util.Random().nextInt(6) + 1; 
   switch (character) {
    case 1 -> {
     System.out.print("初音ミク");
    }
    case 2 -> {
     System.out.print("鏡音リン");
    }
    case 3 -> {
     System.out.print("鏡音レン");
    }
    case 4 -> {
     System.out.print("巡音ルカ");
    }
    case 5 -> {
     System.out.print("KAITO");
    }
    case 6 -> {
     System.out.print("MEIKO");
    }
   }
  System.out.print("と一緒に行きましょう。");
 }

}