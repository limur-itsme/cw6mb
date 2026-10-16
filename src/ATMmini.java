import java.util.Scanner;
public class ATMmini {
        public static void main(String[] args){
            System.out.print("=====SYSTEM ATM=====");
            Scanner scanner = new Scanner(System.in);
            System.out.println('\n'+"Enter your PIN: ");
            for(int attempt = 2; attempt >=0; attempt--){
                int pass = scanner.nextInt();
                int rightPass = 1234;
                if(pass != rightPass) {

                    System.out.print("Incorrect Password!" + '\n' + "You have " + attempt + " attempts" + '\n' + "Enter your PIN: ");
                    if(attempt ==0) {
                        System.out.println('\n' + "Card blocked");
                        break;
                    }

                } else if (pass == rightPass) {

                    System.out.print("Access granted!");
                    break;
                }

            }
            int bal = 3000;
            for(int i = 0;;){
                System.out.print('\n'+"=====ATM MENU=====" + '\n' + "1.Check balance" + '\n'+ "2.Deposite money"+ '\n'+"3.Withdraw money"+ '\n'+"4.Exit" + '\n'+ "Choose your options: ");
                int option = scanner.nextInt();
                if (option == 1)
                    System.out.print("Current balance:" + bal + '\n');
                else if(option ==2){
                    for(;;){
                        System.out.print("Enter your deposit amount:");
                        int dep = scanner.nextInt();
                        if (dep<0){
                            System.out.println("Error! Try again");
                        }
                        else if(dep>=0){
                            System.out.println("Deposit successful\nYour new balance is " + (bal += dep));
                            break;
                        }
                    }}
                else if(option ==3){
                    for(;;) {
                        System.out.println("Enter your withdrawal amount:");
                        int with = scanner.nextInt();
                        if(with<=0){
                            System.out.println("Error!\nTry again");
                            break;
                        }
                        else if(with>bal)
                            System.out.println("Error!\nWithdrawal can not be greater than current balance");
                        else if(with>0){
                            System.out.println("Withdrawal successful\nYour new balance:" + (bal-=with));
                            break;
                        }

                    }
                }
                else if(option ==4){
                    break;
                }

            }
        }
    }
