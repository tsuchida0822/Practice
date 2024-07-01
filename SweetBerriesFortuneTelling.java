public class SweetBerriesFortuneTelling{
 public static void main(String[] args){
  System.out.println("すいべり相性診断");
  System.out.println("あなたの手を取るすいべりメンバーは誰でしょう");
  System.out.println("あなたの名前を入力してね>");
  String name = new java.util.Scanner(System.in).nextLine();
  System.out.println("あなたの誕生日を入力してね(yyyy/mm/dd)>");
  int birthDay = new java.util.Scanner(System.in).nextInt();
  System.out.print("あなたの手を取るのは、");
  int fortune = new java.util.Random().nextInt(6000) + 1;
  int shindan = (fortune + birthDay) % 6;
  switch (shindan) {
   case 1 -> {
    System.out.print("灯莉 彩葉");
   }
   case 2 -> {
    System.out.print("恋瀬 慧倫");
   }
   case 3 -> {
    System.out.print("津奈木 類");
   }
   case 4 -> {
    System.out.print("百瀬 聡");
   }
   case 5 -> {
    System.out.print("近江 遼葵");
   }
   case 0 -> {
    System.out.print("柏 真琴");
   }
  }
 }
}