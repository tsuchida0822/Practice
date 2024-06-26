package fanfan.main;
import fanfan.region.HokkaidoTohoku;
import fanfan.region.Kanto;
import fanfan.region.Chubu;
import fanfan.region.Kinki;
import fanfan.region.ShikokuChugoku;
import fanfan.region.Kyushu;
import fanfan.chara.Character;

public class Main{
 public static void main(String[] args){
  System.out.println("あなたが行くべき場所を診断します");
  System.out.println("名前を入力してください");
  String name = new java.util.Scanner(System.in).nextLine();
  System.out.print("あなたが行くべき場所は、");
  
  int fortune = new java.util.Random().nextInt(47) + 1; 
  switch (fortune) {
   case 1 -> {
    HokkaidoTohoku.hokkaido();
    }
   case 2 -> {
    HokkaidoTohoku.aomori();
    }
   case 3 -> {
    HokkaidoTohoku.iwate();
   }
   case 4 -> {
    HokkaidoTohoku.miyagi();
   }
   case 5 -> {
    HokkaidoTohoku.akita();
   }
   case 6 -> {
    HokkaidoTohoku.yamagata();
   }
   case 7 -> {
    HokkaidoTohoku.fukushima();
   }
   case 8 -> {
    Kanto.ibaraki();
   }
   case 9 -> {
    Kanto.tochigi();
   }
   case 10 -> {
    Kanto.gunma();
   }
   case 11 -> {
    Kanto.saitama();
   }
   case 12 -> {
    Kanto.chiba();
   }
   case 13 -> {
    Kanto.tokyo();
   }
   case 14 -> {
    Kanto.kanagawa();
   }
   case 15 -> {
    Chubu.niigata();
   }
   case 16 -> {
    Chubu.toyama();
   }
   case 17 -> {
    Chubu.ishikawa();
   }
   case 18 -> {
    Chubu.fukui();
   }
   case 19 -> {
    Chubu.yamanashi();
   }
   case 20 -> {
    Chubu.nagano();
   }
   case 21 -> {
    Chubu.gifu();
   }
   case 22 -> {
    Chubu.shizuoka();
   }
   case 23 -> {
    Chubu.aichi();
   }
   case 24 -> {
    Kinki.mie();
   }
   case 25 -> {
    Kinki.shiga();
   }
   case 26 -> {
    Kinki.kyoto();
   }
   case 27 -> {
    Kinki.osaka();
   }
   case 28 -> {
    Kinki.hyogo();
   }
   case 29 -> {
    Kinki.nara();
   }
   case 30 -> {
    Kinki.wakayama();
   }
   case 31 -> {
    ShikokuChugoku.tottori();
   }
   case 32 -> {
    ShikokuChugoku.shimane();
   }
   case 33 -> {
    ShikokuChugoku.okayama();
   }
   case 34 -> {
    ShikokuChugoku.hiroshima();
   }
   case 35 -> {
    ShikokuChugoku.yamaguchi();
   }
   case 36 -> {
    ShikokuChugoku.tokushima();
   }
   case 37 -> {
    ShikokuChugoku.kagawa();
   }
   case 38 -> {
    ShikokuChugoku.ehime();
   }
   case 39 -> {
    ShikokuChugoku.kochi();
   }
   case 40 -> {
    Kyushu.fukuoka();
   }
   case 41 -> {
    Kyushu.saga();
   }
   case 42 -> {
    Kyushu.nagasaki();
   }
   case 43 -> {
    Kyushu.kumamoto();
   }
   case 44 -> {
    Kyushu.oita();
   }
   case 45 -> {
    Kyushu.miyazaki();
   }
   case 46 -> {
    Kyushu.kagoshima();
   }
   case 47 -> {
    Kyushu.okinawa();
   } 
  }
   System.out.print("エリアです。");
   Character.character();
 }
}