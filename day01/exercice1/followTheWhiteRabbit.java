package day01.exercice1;

import java.util.Random;

public class followTheWhiteRabbit {

  static int jet;
  static boolean meteo = true;
  static boolean recommencer=true;
  static int result = 0;

 public int jeterLeDe(){
  Random random =  new Random();
  return random.nextInt(37) + 1;
 }

 static boolean multipleDe11(int jet){
  if(jet % 11 == 0){
    return true;
  }
  return false;
 }

 public static void main(String[] args){

  followTheWhiteRabbit followTheWhiteRabbit = new followTheWhiteRabbit();


  while (recommencer) {

    System.out.println("Alice jette le dé");

    jet = followTheWhiteRabbit.jeterLeDe();
    result += jet;

    System.out.println("le resultat est " + jet);

    if(result > 421){
      System.out.println("RABBIT !");
      break;
    }

    if(result % 8 == 0){
      System.out.println("Backward");
    }

    if(jet == 23){
      System.out.println("Tea time");
    }

    if(multipleDe11(jet) && meteo){
      System.out.println("Nap");
    }

    if(jet == 37) {
      System.out.println("RABBIT !");
      recommencer = false;
      break;
    }

    if(jet > 24){
      if(jet * 3 == 146){
        System.out.println("Backward");
      }
    }

    if(jet == 4 || jet == 5 || jet == 6 || jet == 17 || jet == 28){
      System.out.println("Left");
    }

    if(jet == 15){
      System.out.println("forward");
    }

    if(jet == 13 || jet >= 34){
      System.out.println("Right");
    }

    if(jet == 1){
      System.out.println("look up !");
    }
  }
 }

}
