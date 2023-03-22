package SortingArrays;

public class BubbleSortAlgorithm {
    public void bubbleSort(int[] list) {
        boolean stillSwaping = true;

        while (stillSwaping) {
            stillSwaping=false;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    stillSwaping=true;
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
        printArray(list);

    }

    private static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}