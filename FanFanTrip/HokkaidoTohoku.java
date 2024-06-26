package fanfan.region;
public class HokkaidoTohoku {

//北海道
 public static void hokkaido() {
  System.out.print("北海道の");
   int area = new java.util.Random().nextInt(16) +1; 
    switch (area) {
     case 1 -> {
      System.out.print("函館");
     }
     case 2 -> {
      System.out.print("松前");
     }
     case 3 -> {
      System.out.print("八雲");
     }
     case 4 -> {
      System.out.print("石狩");
     }
     case 5 -> {
      System.out.print("後志");
     }
     case 6 -> {
      System.out.print("空知");
     }
     case 7 -> {
      System.out.print("胆振");
     }
     case 8 -> {
      System.out.print("日高");
     }
     case 9 -> {
      System.out.print("旭川");
     }
     case 10 -> {
      System.out.print("富良野");
     }
     case 11 -> {
      System.out.print("宗谷");
     }
     case 12 -> {
      System.out.print("留萌");
     }
     case 13 -> {
      System.out.print("網走");
     }
     case 14 -> {
      System.out.print("十勝");
     }
     case 15 -> {
      System.out.print("釧路");
     }
     case 16 -> {
      System.out.print("根室");
     }
    }
 }

//青森
 public static void aomori() {
  System.out.print("青森県の");
   int area = new java.util.Random().nextInt(6) +1;
    switch (area) {
      case 1 -> {
       System.out.print("東青");
      }
      case 2 -> {
       System.out.print("中南");
      }
      case 3 -> {
       System.out.print("西北");
      }
      case 4 -> {
       System.out.print("下北");
      }
      case 5 -> {
       System.out.print("上北");
      }
      case 6 -> {
       System.out.print("三八");
      }
    }
 }

//岩手
 public static void iwate() {
  System.out.print("岩手県の");
   int area = new java.util.Random().nextInt(4) +1; 
     switch (area) {
      case 1 -> {
       System.out.print("県央");
       }
      case 2 -> {
       System.out.print("県南");
       }
      case 3 -> {
       System.out.print("県北");
       }
      case 4 -> {
       System.out.print("沿岸");
       }
     }
 }

//宮城
 public static void miyagi() {
  System.out.print("宮城県の");
   int area = new java.util.Random().nextInt(7) +1; 
     switch (area) {
      case 1 -> {
       System.out.print("仙台");
       }
      case 2 -> {
       System.out.print("仙南");
       }
      case 3 -> {
       System.out.print("大崎");
       }
      case 4 -> {
       System.out.print("栗原");
       }
      case 5 -> {
       System.out.print("登米");
       }
      case 6 -> {
       System.out.print("石巻");
       }
      case 7 -> {
       System.out.print("気仙沼");
      }
     }
 }

//秋田
 public static void akita() {
  System.out.print("秋田県の");
   int area = new java.util.Random().nextInt(8) +1; 
     switch (area) {
      case 1 -> {
       System.out.print("鹿角");
       }
      case 2 -> {
       System.out.print("大館");
       }
      case 3 -> {
       System.out.print("能代");
       }
      case 4 -> {
       System.out.print("秋田");
       }
      case 5 -> {
       System.out.print("大曲");
       }
      case 6 -> {
       System.out.print("湯沢");
       }
      case 7 -> {
       System.out.print("横手");
      }
      case 8 -> {
       System.out.print("本荘");
      }
     }
 }

//山形
 public static void yamagata() {
  System.out.print("岩手県の");
   int area = new java.util.Random().nextInt(7) +1; 
     switch (area) {
      case 1 -> {
       System.out.print("庄内");
       }
      case 2 -> {
       System.out.print("最上");
       }
      case 3 -> {
       System.out.print("村山");
       }
      case 4 -> {
       System.out.print("置賜");
       }
     }
 }

//福島
 public static void fukushima() {
  System.out.print("福島県の");
   int area = new java.util.Random().nextInt(7) +1; 
     switch (area) {
      case 1 -> {
       System.out.print("会津");
       }
      case 2 -> {
       System.out.print("南会津");
       }
      case 3 -> {
       System.out.print("福島安達");
       }
      case 4 -> {
       System.out.print("郡山");
       }
      case 5 -> {
       System.out.print("白河");
       }
      case 6 -> {
       System.out.print("相馬双葉");
       }
      case 7 -> {
       System.out.print("いわき");
      }
     }
 }

}