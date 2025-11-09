// // public class Main {
// //  public static void main(String[] args) {
// //  System.out.println("Hello, World!")
// //  }
// // }

// public class Main {
//  public static void main(String[] args) {
//  System.out.println("Hello, World!");
//  }
// }

//q2

// public class Main {
//  public void greet() {
//  System.out.println("Hello");
//  }
//  greet();
// }

// public class Main {
//     public static void greet() {
//         System.out.println("Hello");
//     }

//     public static void main(String[] args) {

//         greet();
//     }
// }

// q3

// public class Main {
//  public static void main(String[] args) {
//  int number = "10";
//  System.out.println("The number is: " + number);
//  }
// }

// public class Main {
//  public static void main(String[] args) {
//  int number = 10;
//  System.out.println("The number is: " + number);
//  }
// }

// q4

// public class Main {
//     public static void main(String[] args) {
//         int[] numbers = { 1, 2, 3, 4 };
//         System.out.println("The fifth element is: " + numbers[4]);
//     }
// }//out of bounds error !

// public class Main {
//  public static void main(String[] args) {
//  int[] numbers = {1, 2, 3, 4};
//  System.out.println("The fourth element is: " + numbers[3]);
//  }
// }

//q5

// public class Main {
//     public static void main(String[] args) {
//         int result = addNumbers(5, 10);
//         System.out.println("Result: " + result);
//     }

//     public int addNumbers(int a, int b) {
//         return a + b;
//     }
// }

// public class Main {
//  public static void main(String[] args) {
//  int result = addNumbers(5, 10);
//  System.out.println("Result: " + result);
//  }

//  public  static int addNumbers(int a, int b) {
//  return a + b;
//  }
// }

//q6

// public class Main {
//  public static void main(String[] args) {
//  int age;
//  if (age >= 18) {
//  System.out.println("You are eligible to vote.");
//  }
//  }
// } // variable age is not assigned with proper value

// public class Main {
//  public static void main(String[] args) {
//  int age=90;
//  if (age >= 18) {
//  System.out.println("You are eligible to vote.");
//  }
//  }
// }

//q7

// public class Main {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Number: " + i);
//         }
//         i++;
//         System.out.println("Outside loop: " + i);
//     }
// }
// out of scope error ,i is not accessable

// public class Main {
//     public static void main(String[] args) {
//         int i;
//         for (i = 0; i < 5; i++) {
//             System.out.println("Number: " + i);
//         }
//         i++;
//         System.out.println("Outside loop: " + i);
//     }
// }

//q8

// public class Main {
//  public static void main(String[] args) {
//  while count < 10 {
//  System.out.println("Count: " + count);
//  count++;
//  }
//  }
// } count is not defined and missing paratheisis

public class Main {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println("Count: " + count);
            count++;
        }
    }
}