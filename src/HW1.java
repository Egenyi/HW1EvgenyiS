 public class HW1 {

     public static void main(String[] args) {
         // Task 6 (Test Task 2 - Task 5)
         printThreeWords();
         checkSumSign();
         printColor();
         compareNumbers();
     }

         //Task 2
         public static void printThreeWords() {
             System.out.println("Orange");
             System.out.println("Banana");
             System.out.println("Apple");
         }

         // Task 3
         public static void checkSumSign() {
             int a = 5, b = 14;
             int sum = a + b;

             if (sum >= 0) {
                 System.out.println("Сумма положительная");
             } if (sum < 0) {
                 System.out.println("Сумма отрицательная");
             }
         }
         // Task 4
         public static void printColor() {
             int value = 55;

             if (value <= 0) {
                 System.out.println("Красный");
             } else if (value > 0 & value <= 100) {
                 System.out.println("Желтый");
             } else {
                 System.out.println("Зеленый");
             }
         }

         // Task 5
         public static void compareNumbers() {
             int a = 8, b = 17;

             if (a >= b) {
                 System.out.println("a >= b");
             } else {
                 System.out.println("a < b");
             }
         }
     }

