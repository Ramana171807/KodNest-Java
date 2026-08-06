public class second prd {

    public static void main(String[] args) {

        
        int first = 12;
        int second = 5;

        
        int[] choice = {1, 6, 8, 9, 10};

        int i = 0;
        int menu;

        System.out.println("First Number : " + first);
        System.out.println("Second Number: " + second);

        do {

            menu = choice[i];

            switch (menu) {

                case 1:
                    System.out.println("\nAddition");
                    System.out.println("Result = " + (first + second));
                    break;

                case 2:
                    System.out.println("\nSubtraction");
                    System.out.println("Result = " + (first - second));
                    break;

                case 3:
                    System.out.println("\nMultiplication");
                    System.out.println("Result = " + (first * second));
                    break;

                case 4:
                    System.out.println("\nDivision");
                    if (second != 0)
                        System.out.println("Result = " + (first / second));
                    else
                        System.out.println("Cannot divide by zero");
                    break;

                case 5:
                    System.out.println("\nRemainder");
                    if (second != 0)
                        System.out.println("Result = " + (first % second));
                    else
                        System.out.println("Cannot divide by zero");
                    break;

                case 6:
                    System.out.println("\nIncrement First Number");
                    first++;
                    System.out.println("First Number = " + first);
                    break;

                case 7:
                    System.out.println("\nDecrement Second Number");
                    second--;
                    System.out.println("Second Number = " + second);
                    break;

                case 8:
                    System.out.println("\nCompare Numbers");

                    String result = (first > second)
                            ? "First number is greater"
                            : (first < second)
                            ? "Second number is greater"
                            : "Both are equal";

                    System.out.println(result);
                    break;

                case 9:
                    System.out.println("\nChange Sign");
                    first = -first;   
                    second = +second; // Unary plus
                    System.out.println("First Number = " + first);
                    System.out.println("Second Number = " + second);
                    break;

                case 10:
                    System.out.println("\nExit");
                    System.out.println("Operator Explorer Closed.");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

            i++;

        } while (menu != 10);

    }
}