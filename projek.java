package academy.devonline.java.basic.section01_setup.section05_setup;

import java.util.Random;
import java.util.Scanner;

public class projek {
    public static void main(String[] args) {
        System.out.println("Ведите с 1 до 13 класса: ");
        System.out.println("        1.While: \n" +
                "        2.whichp: \n" +
                "        3.SumFrolm : \n" +
                "        4.NumberReverse : \n" +
                "        5.LoopWitthProblem: \n" +
                "        6.infiniteLoopProblem : \n" +
                "        7.ForExamples :\n" +
                "        8.For :\n" +
                "        9.doWhile : \n" +
                "        10.DisplayNumbersFrom100to1From0to50:  \n" +
                "        11.DisplayNumbersFrom100To1: \n" +
                "        12.DisplayEvenNumbersFrom0To500 : \n" +
                "        13.DisplayEvenNUmbersFrom0To50 : \n"+
                "        14.InfiniteLoopExample             \n"+
                "        15.InfiniteLoopPorblem             \n"+
                "        16.GuessTheNumer             \n"+
                "        17.BreakValidUsage \n" +
                "        18.Factorial\n" +
                "        19.InfinititeLongCycle \n" +
                "        20.Continue \n"+
                "        21.NestedCycles \n"+
                "        22.MultiplicationTabeCase1 \n"+
                "        23.MultiplicationTableCase2 \n"+
                "        24.MultiplicationTableCase3 \n"+

                "\n"+
                "        Ведите цыфр: ");
        var user  = new Scanner(System.in).nextInt();
        var While = 1;
        var whichP= 2;
        var SumFrolm = 3;
        var NumberReverse = 4;
        var LoopWitthProblem= 5;
        var infiniteLoopProblem = 6;
        var ForExamples = 7;
        var For = 8;
        var doWhile = 9;
        var DisplayNumbersFrom100to1From0to50 = 10;
        var DisplayNumbersFrom100To1 =11;
        var DisplayEvenNumbersFrom0To500 =12;
        var DisplayEvenNUmbersFrom0To50 = 13;
        var InfiniteLoopExample = 14;
        var InfiniteLoopPorblem = 15;
        var GuessTheNumer = 16;
        var BreakValidUsage = 17;
        var Factorial= 18;
        var InfinititeLongCycle = 19;
        var Continue = 20;
        var NestedCycles = 21;
        var MultiplicationTabeCase1 = 22;
        var MultiplicationTableCase2 = 23;
        var MultiplicationTableCase3 = 24;

        if (user==1){
            ////Первый класс1
            System.out.println("Ведите первое чесло с 1 до ...: ");
            var wil1= new Scanner(System.in).nextInt();
            System.out.println("Ведите второе чесло с 1 до ...: ");
            var wil2= new Scanner(System.in).nextInt();
            var cols = 10;
            for (int whil = wil1; whil<=wil2; whil++){
                System.out.print(whil+"\t");
                if (wil2 > 10){
                    if (whil % cols ==0){
                        System.out.println();
                    } else if (wil2<5) {
                        System.out.println();
                    }
                }
            }
            ////конец
        } else if (user == 2) {
            ////Первый класс2
            System.out.println("Ведите страку");
            var whistr  = new Scanner(System.in).nextLine();
            System.out.println("Ведите повторение: ");
            var whiint1 = new Scanner(System.in).nextInt();
            var whilp= whistr;
            var whp = 1;
            var whip2 = whp;
            for (var whil3 = whp; whil3 <= whiint1;whil3++){
                System.out.println(whistr);
            }
            ////конец
        } else if (user==3) {
            ////Первый класс3
            var sum1a = 100;
            var sum2b = 1;
            var sum3s = 0;

            for (var sumi = sum2b; sumi<=sum1a; sumi++){
                sum3s+=sumi;

            }
            System.out.println(sum3s);
            ////конец

        } else if (user == 4) {
            ////Первый класс4
            var nub1 = 123456789;
            var nub2= 0;
            var nub3= nub1;
            while (nub3!=0){
                var dr = nub3 % 10;
                nub2= nub2 *10+dr;
                nub3/=10;
            }
            System.out.println(nub2);
            ////конец
            
        } else if (user==5) {
            ////Первый класс5
            for (var lo = 0;lo<=5;lo++){
                lo--;
                ////конец
            }
        } else if (user == 6) {
            ////Первый класс6
            var in = new Scanner(System.in).nextLine();
            var in1 = new Scanner(System.in).nextInt();
            var in3 = 1;
            var e = in;
            var dr= in;
            for ( var i = in3; i<=in1; i++){
                System.out.println(e+" ");
                ////конец

            }

        } else if (user==7) {

            ////Первый класс7
            for (int a = 1; a<=5;a++){
                System.out.print(a+" ");
            }
            System.out.println();
            for (int i= 5; i>=1; i--){
                System.out.print(i+" ");
            }
            System.out.println();
            for (int i= 0; i<5 ;i++){
                System.out.print( 5 - i+" ");
            }
            System.out.println();

            for (int o = 50; o<=100 ; o+=5){
                System.out.print(o + " ");
            }
            ////конец
            
            
        } else if (user==8) {
            ////Первый класс8
            System.out.println("Before for ");
            for (int i = 0; i<=5;i++){
                System.out.println(i);
            }
            System.out.println("After for");
            ////конец

        } else if (user == 9) {
            ////Первый класс9
                int n = -1;
                for (var i = n;i<n;i++){
                    System.out.println("For ->"+i);
                }
                int i = 0;
                while (i<n){
                    System.out.println("while -> "+ i++);
                }
                i = 0;
                do {
                System.out.println("do -> "+ i++);
                }while (i<n); 
                ////конец
                

        } else if (user == 10) {
            ////Первый класс10

            var a = 100;
            var b = 0;
            var s = 1;
            int i = a;
            do {
                System.out.print("\t"+i--);
                if (i % 10 == 0){
                    System.out.println();

                }
            }while (b<i);
            System.out.println();


            var e = 50;
            var f = 2;
            var t = 0;
            var p = t;
            do {
                System.out.print(p+" ");
                p+=f;
                if (p % 10 == 0){
                    System.out.println();
                }
            }while (p<=e);
            System.out.println();


            ////конец
            
        } else if (user == 11) {
            ////Первый класс11
            System.out.println("Ведите с 1 до 100 чесло: ");
            var a = new Scanner(System.in).nextInt();
            System.out.println("Ведите с 1 до 100 чесло: ");
            var b =new Scanner(System.in).nextInt();
           if (a == 1){
               for (int i = a; i<=b;i++){
                   System.out.print(i +" ");
               }
           } else if (a == 100) {
               for (int i = a; i>=b ; i--){
                   System.out.print(i+1+" ");
           }

            }






            ////конец
        } else if (user == 12) {
            ////Первый класс12
            var a =100;

            var s= 1;
            var cols = 10;
            for (int i= s; i<=a;i++){
                System.out.print(i+"\t");
                if ( i%cols==0){
                    System.out.println(i);
                }
            }
            ////конец
        } else if (user == 13) {
            ////Первый класс13
            var a  = 50;
            var b = 0;
            var s = 2;
            var cols = 10;
            for ( int i = b;i<=50;i+=s){
                System.out.print(i+"\t");
                if (i%cols==0){
                    System.out.println();
                }
            }
            ////конец
        } else if (user == 14) {
            ////Первый класс14
            while (true){
                var number = new Scanner(System.in).nextInt();
                var result = number*number;
                System.out.println(result);
                if (number == 0){
                    System.out.println("ошыбка");
                    break;
                }
            }

            ////конец
        }
        else if (user == 15) {
            ////Первый класс15
            for (; ;){
                System.out.println("helo world");
            }
            ////конец
        }else if (user == 16) {
            ////Первый класс16
            System.out.println("Ведите цыфр:");
            var number = new Random().nextInt(10);
            while (true){
                var use = new Scanner(System.in).nextInt();
                if (use > number){
                    System.out.println("Менше : "+use);
                } else if (use<number) {
                    System.out.println("Болше:"+use);
                }else {
                    System.out.println("Вы угадали поздравляю:"+use);
                    break;
                }
            }
            ////конец
        } else if (user==17) {
            ////Первый класс17
            var number = new Random().nextInt(10);
            var ues = false;
            for (int i = 0;  i<3 ;i++){
                var re = new Scanner(System.in).nextInt();
                if (re >number){
                    System.out.println("Менше : "+re);
                } else if (re <number) {
                    System.out.println("Болше:"+re);

                }else {
                    ues =true;
                    System.out.println("Вы угадали поздравляю:"+re);
                    break;
                }

                } if (!ues){
                    System.out.println("Лимит закончисля :");
            }
            ////конец
        }
        else if (user==18) {
            ////Первый класс18
          var value = 5;


        String FinalResult;
        if (value < 0){
            FinalResult = "Больше или равно >=0";

        }else {
            var resut = 1;
            for (var i = 1; i<=value;i++){
                var oldResult = resut;
                resut*=i;
                if (oldResult!=resut/i){
                    resut = 0;
                    break;
                }

            }
            FinalResult = resut == 0?"Int overflow":String.valueOf(resut);

        }

        System.out.println(FinalResult);

            ////конец
        }
        else if (user==19) {
            ////Первый класс19
            long time = System.nanoTime();
            for (int i = 0;i<Integer.MAX_VALUE;i++){
                System.currentTimeMillis();
                if (i%1_000_000==0){
                    System.out.println(i);
                }
            }
            long result = System.nanoTime()-time;
            ////конец
        }
        else if (user==20) {
            ////Первый класс20
            for (int i = 0; i<=10;i++){
                if (i>=3&&i<=6){
                    System.out.println(i+" ");
                }
                System.out.println();
                for (int p = 0;p<=10;p++){
                    if (p<3||p>6){
                        System.out.println(p+" ");
                    }
                }
            }
            ////конец

        } else if (user == 21) {
            ////Первый класс20
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    var res = i*10+j+1;
                    System.out.print(res+"\t");
                }
                System.out.println();
            }


            ////конец
        }else if (user == 22) {
            ////Первый класс20
                var to = 9;
            for (int i = 1; i < to; i++) {
                for (int j = 1; j <to; j++) {
                    var res =i*j;
                    System.out.print((res == 1?"":res)+"\t");
                }
                System.out.println();
            }
            ////конец
        }else if (user == 23) {
            ////Первый класс20
                var to = 9;
            for (int i = 2; i <=to; i++) {
                for (int j = 2; j <=5; j++) {
                    var res = j+" * "+i+" = "+i*j;
                    System.out.print(res+"\t");
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 2; i <=to; i++) {
                for (int j = 6; j <=to; j++) {
                    var res = j+" * "+i+" = "+i*j;
                    System.out.print(res+"\t");
                }
                System.out.println();
            }

            ////конец
        }else if (user == 24) {
            ////Первый класс20

            var to =9;
            var cols = 4;
            for (int i = 2; i < to; i+=4) {
                for (int j = 2; j < to; j++) {
                    for (int k = i; k <i+cols&&i<=to; k++) {
                        var res =  k+" * "+j+" = "+k*j;
                        System.out.print(res+"\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            ////конец
        }















        else {
            System.out.println("Нету тогого чесло");
        }


    }
}
