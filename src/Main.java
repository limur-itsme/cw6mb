import java.util.Scanner;
import java.util.Random;



void main(String[] args) {
    int someValue = 4;
    int factorial = 1;
    while(someValue > 1) {


        factorial *= someValue;
        someValue--;
    }
    System.out.println(factorial);




    int iVal = 5;
    do {
        System.out.print(iVal);
        System.out.print("*2=");
        iVal *= 2;
        System.out.println(iVal);
    } while(iVal < 25);

    System.out.println("Next program-------------------------------------------------------------------------------");
    //1
    int i = 1;
    while(i <= 1000) {
        System.out.println(i);
        i *= 10;
    }
    //2
    System.out.println("Next------------------------------------------");

    for(int j = 1;j <= 1000;){

        System.out.println(j);
        j *= 10;
    }

    //3
    Scanner scanner = new Scanner(System.in);
    int g = scanner.nextInt();
    int o = 1;
    do {
        System.out.print(o);
        o += 1;
        System.out.println();
    } while(o < g);

    //4
    //int l  = 1;
    //do {
      //  System.out.println(l);
        //l += 1;
    //} while(l > 0);


    //5
     int evenLimit = scanner.nextInt();
     int even1 = 2;
     do {
         System.out.println(even1);
         even1 += 2;
     } while(even1 <= evenLimit);


     for(int even2 = 2; even2 <= evenLimit; even2 += 2) {
         System.out.println(even2);
     }
    int even3 = 2;
     while(even3 <= evenLimit) {
         System.out.println(even3);
         even3 += 2;
     }
    //6
    int oddLImit = scanner.nextInt();
    int odd1 = 1;
    do {
        System.out.println(odd1);
        odd1 += 2;
    } while(odd1 <= oddLImit);


    for(int odd2 = 1; odd2 <= oddLImit; odd2 += 2) {
        System.out.println(odd2);
    }
    int odd3 = 1;
    while(odd3 <= oddLImit) {
        System.out.println(odd3);
        odd3 += 2;
    }


    //7
    for(int FB = 1; FB <= 20; FB++) {
        if(FB%3==0 && FB%5==0){
            System.out.println(FB + "FizzBuzz");
        }
        else if(FB%3==0) {
            System.out.println(FB + "Fizz");
        }
        else if(FB%5==0) {
            System.out.println(FB + "Buzz");
        }
    }
    Scanner ATMInput = new Scanner(System.in);
    int ATMCorrect = 8765;
    for(int attempt = 3; attempt > 0; attempt--) {
        System.out.println("U have " + attempt + "attempt(s)");
        System.out.println("Enter card PIN-code: ");
        int ATMVer = ATMInput.nextInt();
        if(ATMVer == ATMCorrect) {
            System.out.println("PIN-code is correct!");
            break;
        }
        else{
            System.out.println("Something is wrong!");
        }

    }

    Random random = new Random();
    Scanner scannerForGuess = new Scanner(System.in);
    int secretNumber = random.nextInt(100) + 1;
    boolean isGuessed = false;
    for(int guessAttempt  = 5; guessAttempt > 0; guessAttempt--) {
        System.out.println("Enter your guess: ");
        int usersGuess = scannerForGuess.nextInt();
        if(usersGuess == secretNumber) {
            System.out.println("Correct! Secret number is " + secretNumber);
            System.out.println("You needed " + (6 - guessAttempt) + " attempt(s)");
            isGuessed = true;
        }
        else if(usersGuess > secretNumber) {
            System.out.println("Too high!");
        }
        else if(usersGuess < secretNumber) {
            System.out.println("Too low!");
        }
        else {
            System.out.println("Something wrong!");
        }

    }
    if(isGuessed != true) {
        System.out.println("Game Over!\nThe secret number was " + secretNumber );
    }

    Scanner scannerForStat = new Scanner(System.in);
    int statAttempts = 10;
    int numNum = 1;
    int posNum = 0;
    int negNum = 0;
    int zeros = 0;
    int evenNum = 0;
    int oddNum = 0;
    while(statAttempts > 0) {
        System.out.println("Enter number " + numNum + ":");
        int statNum = scannerForStat.nextInt();
        if(statNum > 0) {
            posNum++;
        }
        else if(statNum < 0) {
            negNum++;
        }
        if(statNum == 0) {
            zeros++;
        }
        if(statNum%2 == 0) {
            evenNum++;
        }
        if(statNum%2 != 0) {
            oddNum++;
        }
        statAttempts--;
        numNum++;

    }
    System.out.println("Positive numbers " + posNum); System.out.println("Negative numbers " + negNum); System.out.println("Zeros " + zeros); System.out.println("Even numbers " + evenNum); System.out.println("Odd numbers " + oddNum);

}