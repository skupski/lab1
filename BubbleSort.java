public class BubbleSort {
   // swap: перестановка элементов в массиве
   static void swap(int[] arrayTest, int i, int j) {
      int t = arrayTest[i];
      arrayTest[i] = arrayTest[j];
      arrayTest[j] = t;
   }

   // bubbleSort: пузырьковая сортировка
   static void bubbleSort(int[] arrayTest) {
      for (;;) {
         boolean sorted = true;
         for (int i = 0; i < arrayTest.length - 1; i++)
            if (arrayTest[i] > arrayTest[i+1]) {
               sorted = false;
               swap(arrayTest, i, i + 1);
            }
         if (sorted) break;
      }
   }

   static void printArray(int[] arrayTest) {
      for (int i = 0; i < arrayTest.length; i++) {
         if (i%4 == 0) System.out.println();
         System.out.print(arrayTest[i] + " \t");
      }
      System.out.println();
   }

   public static void main(String[] args) {
      int size = Integer.parseInt(args[0]);
      System.out.println("Bubblesort, size = " +
         size);
      int[] r = new int[size];
      for (int i = 0; i < size; i++)
         r[i] = (int)(Math.random()*size*10 + 1);
      long startTime =System.nanoTime();
      bubbleSort(r);
      System.out.println("Затраченное время"+
         (System.nanoTime()-startTime));
      // printArray(r);
   }
}