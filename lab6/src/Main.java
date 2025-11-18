import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//public class Main {
//    public static void main(String[] args) {
//        int one;
//        int two;
//        int now;
//        Scanner scan = new Scanner(System.in);
//        one = scan.nextInt();
//        two = scan.nextInt();
//        now = one;
//        one = two;
//        two = now;
//        scan.close();
//        System.out.print(one+" "+two);
//        }
//    }
//
//public class Main {
//    public static void main(String[] args) {
//        char a;
//        Scanner input = new Scanner(System.in);
//        a = input.next().charAt(0);
//        int res = Character.getNumericValue(a);
//        System.out.println(res);
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        for (char c = 'a'; c <= 'z'; c++) {
//            char now = c;
//            int res = Character.getNumericValue(c);
//            System.out.println(now +" "+ res);
//        }
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String line1 = input.nextLine();
//        String line2 = input.nextLine();
//        if (line1.equals(line2)){
//            System.out.println("True");
//        }
//        else{
//            System.out.println("False");
//        }
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String line1 = input.nextLine();
//        int res = 0;
//        for (int i = 0; i < line1.length(); i++) {
//            if (line1.charAt(i) == 'a' || line1.charAt(i) == 'e' || line1.charAt(i) == 'i' ||  line1.charAt(i) == 'o' || line1.charAt(i) == 'u') {
//                res++;
//            }
//        }
//        System.out.print(res);
//
//    }
//}
//class Time{
//    int hour;
//    int minute;
//    int second;
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Time time1 = new Time();
//        time1.hour = input.nextInt();
//        time1.minute = input.nextInt();
//        time1.second = input.nextInt();
//        Time time2 = new Time();
//        time2.hour = input.nextInt();
//        time2.minute = input.nextInt();
//        time2.second = input.nextInt();
//        int difference1 = Math.abs(time1.hour - time2.hour);
//        int difference2 = Math.abs(time1.minute - time2.minute);
//        int difference3 = Math.abs(time1.second - time2.second);
//        System.out.printf("Hours difference: %d\n", difference1);
//        System.out.printf("Minutes difference: %d\n", difference2);
//        System.out.printf("Seconds difference: %d\n", difference3);
//
//
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        float celsius = scan.nextFloat();
//        float fahrenheit;
//        fahrenheit = celsius * 5.0f / 9.0f + 32.0f;
//        System.out.println("Celsius : " + fahrenheit);
//        System.out.println("Fahrenheit : " + fahrenheit);
//
//    }
//}


public class Main {
    public static void to_feed(Animal animal) {
        int food = 2;
        animal.eat(food);
        animal.say();
    }
    public static void main(String[] args) {
        Dog dog1 = new Dog("RECS", 14, 22, "black");
        Cat cat1 = new Cat("TOM", 7, 9, "black");
        cat1.eat(12);
        cat1.say();
        dog1.say();
        dog1.eat(12);
        dog1.say();
        dog1.nam();
        to_feed(cat1);
    }



}