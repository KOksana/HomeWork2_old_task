
package arrays;

import java.util.Scanner;

public class ArrayProcessor {

    static int[] createArray(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100 - 50);
        }

        return arr;
    }

    static void printArray(int[] arr, boolean isReverse) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (isReverse == false) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[length - i - 1] + " ");
            }
        }
        System.out.println();

    }

    static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of elements: " + sum);
    }

    static void maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max element: " + max);
    }

    static void minElement(int[] arr) {
        int min = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("Min element: " + min + "; index: " + minIndex);
    }

    static void evenElements(int[] arr) {
        int numberOfEven = 0;
        int sumOfEven = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                numberOfEven++;
                sumOfEven += arr[i];

            }
        }

        System.out.println("Number of even elements " + numberOfEven + "; sum of even elements " + sumOfEven);

    }

    static void evenElementsRange(int[] arr) {
        int numberOfEven = 0;
        int sumOfEven = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= 20) && (arr[i] <= 30) && (arr[i] % 2 == 0)) {
                numberOfEven++;
                sumOfEven += arr[i];

            }
        }

        System.out.println("Number of even elements in range [20;30]: " + numberOfEven + "; sum of even elements " + sumOfEven);

    }

    static void maxEvenMinOdd(int[] arr) {
        int maxEven = Integer.MIN_VALUE;
        int minOdd = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] > maxEven) {
                    maxEven = arr[i];
                }
            } else if (arr[i] < minOdd) {
                minOdd = arr[i];
            }

        }
        if (maxEven == Integer.MIN_VALUE) {
            System.out.println("There are no even elements in array");
        } else {
            System.out.println("Max even element: " + maxEven);
        }
        if (minOdd == Integer.MAX_VALUE) {
            System.out.println("There are no odd elements in array");
        } else {
            System.out.println("Min odd element: " + minOdd);
        }

    }

    static void changeNegative(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = -arr[i];
            }

        }
        System.out.print("Changed array: ");
        printArray(arr, false);
    }

    static void modifyElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i]--;
            } else {
                arr[i]++;
            }

        }
        System.out.print("Changed array: ");
        printArray(arr, false);
    }

    static void average(int[] arr) {
        int sum = 0;
        double average;
        int numberOfElements = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = (double) sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                numberOfElements++;
            }

        }
        System.out.println("Average: " + average + "; Number of bigger elements: " + numberOfElements);
    }

    static void sumOfArrays(int[] arr1, int[] arr2) {
        int[] arrSum = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arrSum[i] = arr1[i] + arr2[i];
        }
        System.out.print("Sum of arrays: ");
        printArray(arrSum, false);

    }

    static void concatenationOfArrays(int[] arr1, int[] arr2) {
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int[] arrConcat = new int[arr1Length + arr2Length];

        for (int i = 0; i < arr1Length; i++) {
            arrConcat[i] = arr1[i];
        }
        for (int i = 0; i < arr2Length; i++) {
            arrConcat[i + arr1Length] = arr2[i];
        }

        System.out.print("Concatenation of arrays: ");
        printArray(arrConcat, false);

    }

    static void swapMaxMin(int[] arr) {
        int maxIndex = 0;
        int minIndex = 0;
        int maxElem = arr[0];
        int minElem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElem) {
                maxIndex = i;
                maxElem = arr[i];
            }
            if (arr[i] < minElem) {
                minIndex = i;
                minElem = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (i == maxIndex) {
                arr[i] = minElem;
            }
            if (i == minIndex) {
                arr[i] = maxElem;
            }
        }
        System.out.print("Changed array: ");
        printArray(arr, false);

    }

    static void delMaxMin(int[] arr) {
        int maxIndex = 0;
        int minIndex = 0;
        int maxElem = arr[0];
        int minElem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElem) {
                maxIndex = i;
                maxElem = arr[i];
            }
            if (arr[i] < minElem) {
                minIndex = i;
                minElem = arr[i];
            }

        }

        int[] newArr = new int[arr.length - 2];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != maxIndex && i != minIndex) {
                newArr[j] = arr[i];
                j++;
            }

        }
        System.out.print("Changed array: ");
        printArray(newArr, false);

    }

    static void devideArray(int[] arr) {
        int negativeNumber = 0;
        int positiveNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negativeNumber++;
            } else {
                positiveNumber++;
            }
        }

        int[] negativeArray = new int[negativeNumber];
        int[] positiveArray = new int[positiveNumber];

        for (int i = 0, j = 0, k = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negativeArray[j] = arr[i];
                j++;
            } else {
                positiveArray[k] = arr[i];
                k++;
            }
        }
        System.out.print("Negative array: ");
        printArray(negativeArray, false);
        System.out.print("Positive array: ");
        printArray(positiveArray, false);

    }

    static void oddArray(int[] arr1, int[] arr2) {
        int numberOfElements = 0;

        for (int i = 0; i < arr1.length; i++) {
            if ((arr1[i] % 2 != 0) && (arr2[i] % 2 != 0)) {
                numberOfElements += 2;
            }
        }

        int[] newArr = new int[numberOfElements];

        for (int i = 0, j = 0; i < arr1.length; i++) {
            if ((arr1[i] % 2 != 0) && (arr2[i] % 2 != 0)) {
                newArr[j] = arr1[i];
                newArr[j + 1] = arr2[i];
                j += 2;
            }
        }
        System.out.print("New array: ");
        printArray(newArr, false);

    }

    static void delMaxMinDuplicates(int[] arr) {
        int numberToDelete = 0;
        int maxElem = arr[0];
        int minElem = arr[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElem) {
                maxElem = arr[i];
                maxIndex = i;
            }
            if (arr[i] < minElem) {
                minElem = arr[i];
                minIndex = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] == maxElem && i != maxIndex) || (arr[i] == minElem && i != minIndex)) {
                numberToDelete++;
            }
        }

        int[] newArr = new int[arr.length - numberToDelete];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if ((arr[i] != maxElem || i == maxIndex) && (arr[i] != minElem || i == minIndex)) {
                newArr[j] = arr[i];
                j++;
            }
        }
        System.out.print("Changed array: ");
        printArray(newArr, false);

        if (numberToDelete == 0) {
            System.out.println("There are no dublicates of Max or Min elements");
        }

    }

    static void averageArray(int[] arr1, int[] arr2) {
        double avg1;
        double avg2;
        int sum1 = 0;
        int sum2 = 0;
        int newLength = 0;

        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }

        avg1 = (double) sum1 / arr1.length;
        avg2 = (double) sum2 / arr2.length;

        System.out.println("Average of first array: " + avg1);
        System.out.println("Average of second array: " + avg2);

        for (int i = 0; i < arr1.length; i++) {
            if ((arr1[i] > avg1 && arr1[i] < avg2) || (arr1[i] > avg2 && arr1[i] < avg1)) {
                newLength++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if ((arr2[i] > avg1 && arr2[i] < avg2) || (arr2[i] > avg2 && arr2[i] < avg1)) {
                newLength++;
            }
        }

        int[] newArr = new int[newLength];

        int j = 0;

        for (int i = 0; i < arr1.length; i++) {
            if ((arr1[i] > avg1 && arr1[i] < avg2) || (arr1[i] > avg2 && arr1[i] < avg1)) {
                newArr[j] = arr1[i];
                j++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if ((arr2[i] > avg1 && arr2[i] < avg2) || (arr2[i] > avg2 && arr2[i] < avg1)) {
                newArr[j] = arr2[i];
                j++;
            }
        }
        System.out.print("New array: ");
        printArray(newArr, false);
    }

    public static void main(String[] args) {
        int[] arr;

        Scanner in = new Scanner(System.in);
        String task = "";

        boolean exit = false;

        do {
            System.out.println("\u001B[33m" + "************************************************************************" + "\u001B[0m");
            System.out.println("Enter task number from " + "\u001B[34m" + "1" + "\u001B[0m" + " to " + "\u001B[34m" + "18" + "\u001B[0m");
            System.out.println("Enter " + "\u001B[34m" + "0" + "\u001B[0m" + " to print all results");
            System.out.println("Enter " + "\u001B[34m" + "e" + "\u001B[0m" + " to exit");
            task = in.next();

            switch (task) {
                case "1": {
                    System.out.println("\u001B[32m" + "---- Task 1 ----" + "\u001B[0m");
                    System.out.print("Enter length of array ");
                    int arrayLength = in.nextInt();
                    arr = createArray(arrayLength);

                    System.out.print("Array in direct order:\t");
                    printArray(arr, false);
                    System.out.print("Array in reverse order:\t");
                    printArray(arr, true);

                    break;
                }

                case "2": {
                    System.out.println("\u001B[32m" + "---- Task 2 ----" + "\u001B[0m");
                    System.out.print("Enter length of array ");
                    int arrayLength = in.nextInt();
                    arr = createArray(arrayLength);

                    printArray(arr, false);
                    sum(arr);

                    break;
                }

                case "3": {
                    System.out.println("\u001B[32m" + "---- Task 3 ----" + "\u001B[0m");
                    System.out.print("Enter length of array ");
                    int arrayLength = in.nextInt();
                    arr = createArray(arrayLength);
                    printArray(arr, false);
                    maxElement(arr);

                    break;
                }

                case "4": {
                    System.out.println("\u001B[32m" + "---- Task 4 ----" + "\u001B[0m");
                    System.out.print("Enter length of array ");
                    int arrayLength = in.nextInt();
                    arr = createArray(arrayLength);
                    printArray(arr, false);
                    minElement(arr);

                    break;
                }

                case "5": {
                    System.out.println("\u001B[32m" + "---- Task 5 ----" + "\u001B[0m");
                    System.out.print("Enter length of array ");
                    int arrayLength = in.nextInt();
                    arr = createArray(arrayLength);
                    printArray(arr, false);
                    evenElements(arr);

                    break;
                }

                case "6": {
                    System.out.println("\u001B[32m" + "---- Task 6 ----" + "\u001B[0m");
                    System.out.print("Enter length of array ");
                    int arrayLength = in.nextInt();
                    arr = createArray(arrayLength);
                    printArray(arr, false);
                    evenElementsRange(arr);

                    break;
                }

                case "7": {
                    System.out.println("\u001B[32m" + "---- Task 7 ----" + "\u001B[0m");
                    System.out.print("Enter length of array ");
                    int arrayLength = in.nextInt();
                    arr = createArray(arrayLength);
                    printArray(arr, false);
                    maxEvenMinOdd(arr);

                    break;
                }
                case "8": {
                    System.out.println("\u001B[32m" + "---- Task 8 ----" + "\u001B[0m");
                    System.out.print("Enter length of array ");
                    int arrayLength = in.nextInt();
                    arr = createArray(arrayLength);
                    System.out.print("Original array: ");
                    printArray(arr, false);
                    changeNegative(arr);

                    break;
                }
                case "9": {
                    System.out.println("\u001B[32m" + "---- Task 9 ----" + "\u001B[0m");
                    System.out.print("Enter length of array ");
                    int arrayLength = in.nextInt();
                    arr = createArray(arrayLength);
                    System.out.print("Original array: ");
                    printArray(arr, false);
                    modifyElements(arr);

                    break;
                }

                case "10": {
                    System.out.println("\u001B[32m" + "---- Task 10 ----" + "\u001B[0m");
                    System.out.print("Enter length of array ");
                    int arrayLength = in.nextInt();
                    arr = createArray(arrayLength);
                    printArray(arr, false);
                    average(arr);

                    break;
                }

                case "11": {
                    System.out.println("\u001B[32m" + "---- Task 11 ----" + "\u001B[0m");
                    System.out.print("Enter length of arrays ");
                    int arrayLength = in.nextInt();

                    int[] arr1 = createArray(arrayLength);
                    int[] arr2 = createArray(arrayLength);
                    printArray(arr1, false);
                    printArray(arr2, false);

                    sumOfArrays(arr1, arr2);

                    break;
                }

                case "12": {
                    System.out.println("\u001B[32m" + "---- Task 12 ----" + "\u001B[0m");
                    System.out.print("Enter length of first array ");
                    int arrayLength1 = in.nextInt();
                    System.out.print("Enter length of second array ");
                    int arrayLength2 = in.nextInt();

                    int[] arr1 = createArray(arrayLength1);
                    int[] arr2 = createArray(arrayLength2);
                    printArray(arr1, false);
                    printArray(arr2, false);

                    concatenationOfArrays(arr1, arr2);

                    break;
                }

                case "13": {
                    System.out.println("\u001B[32m" + "---- Task 13 ----" + "\u001B[0m");
                    System.out.print("Enter length of array ");
                    int arrayLength = in.nextInt();
                    arr = createArray(arrayLength);
                    System.out.print("Original array: ");
                    printArray(arr, false);
                    swapMaxMin(arr);

                    break;
                }
                case "14": {
                    System.out.println("\u001B[32m" + "---- Task 14 ----" + "\u001B[0m");
                    System.out.print("Enter length of array ");
                    int arrayLength = in.nextInt();
                    arr = createArray(arrayLength);
                    System.out.print("Original array: ");
                    printArray(arr, false);
                    delMaxMin(arr);

                    break;
                }

                case "15": {
                    System.out.println("\u001B[32m" + "---- Task 15 ----" + "\u001B[0m");
                    System.out.print("Enter length of array ");
                    int arrayLength = in.nextInt();
                    arr = createArray(arrayLength);
                    System.out.print("Original array: ");
                    printArray(arr, false);
                    devideArray(arr);

                    break;
                }

                case "16": {
                    System.out.println("\u001B[32m" + "---- Task 16 ----" + "\u001B[0m");
                    System.out.print("Enter length of arrays ");
                    int arrayLength = in.nextInt();

                    int[] arr1 = createArray(arrayLength);
                    int[] arr2 = createArray(arrayLength);
                    printArray(arr1, false);
                    printArray(arr2, false);

                    oddArray(arr1, arr2);

                    break;
                }

                case "17": {
                    System.out.println("\u001B[32m" + "---- Task 17 ----" + "\u001B[0m");
                    System.out.print("Enter length of array ");
                    int arrayLength = in.nextInt();
                    arr = createArray(arrayLength);
                    System.out.print("Original array: ");
                    printArray(arr, false);
                    delMaxMinDuplicates(arr);

                    break;
                }

                case "18": {
                    System.out.println("\u001B[32m" + "---- Task 18 ----" + "\u001B[0m");
                    System.out.print("Enter length of first array ");
                    int arrayLength1 = in.nextInt();
                    System.out.print("Enter length of second array ");
                    int arrayLength2 = in.nextInt();

                    int[] arr1 = createArray(arrayLength1);
                    int[] arr2 = createArray(arrayLength2);
                    System.out.print("First array: ");
                    printArray(arr1, false);
                    System.out.print("Second array: ");
                    printArray(arr2, false);

                    averageArray(arr1, arr2);

                    break;
                }

                case "0": {
                    // ----------- Task 1 ------------
                    System.out.println("\u001B[32m" + "---- Task 1 ----" + "\u001B[0m");

                    int arrayLength = 10;
                    arr = createArray(arrayLength);

                    System.out.print("Array in direct order:\t");
                    printArray(arr, false);
                    System.out.print("Array in reverse order:\t");
                    printArray(arr, true);

                    // ----------- Task 2 ------------
                    System.out.println("\u001B[32m" + "---- Task 2 ----" + "\u001B[0m");
                    printArray(arr, false);
                    sum(arr);

                    // ----------- Task 3 ------------
                    System.out.println("\u001B[32m" + "---- Task 3 ----" + "\u001B[0m");
                    printArray(arr, false);
                    maxElement(arr);

                    // ----------- Task 4 ------------
                    System.out.println("\u001B[32m" + "---- Task 4 ----" + "\u001B[0m");
                    printArray(arr, false);
                    minElement(arr);

                    // ----------- Task 5 ------------
                    System.out.println("\u001B[32m" + "---- Task 5 ----" + "\u001B[0m");
                    printArray(arr, false);
                    evenElements(arr);

                    // ----------- Task 6 ------------
                    System.out.println("\u001B[32m" + "---- Task 6 ----" + "\u001B[0m");
                    printArray(arr, false);
                    evenElementsRange(arr);

                    // ----------- Task 7 ------------
                    System.out.println("\u001B[32m" + "---- Task 7 ----" + "\u001B[0m");
                    printArray(arr, false);
                    maxEvenMinOdd(arr);

                    // ----------- Task 8 ------------
                    System.out.println("\u001B[32m" + "---- Task 8 ----" + "\u001B[0m");
                    System.out.print("Original array: ");
                    printArray(arr, false);
                    changeNegative(arr);

                    // ----------- Task 9 ------------
                    System.out.println("\u001B[32m" + "---- Task 9 ----" + "\u001B[0m");
                    arr = createArray(arrayLength);
                    System.out.print("Original array: ");
                    printArray(arr, false);
                    modifyElements(arr);

                    // ----------- Task 10 ------------
                    System.out.println("\u001B[32m" + "---- Task 10 ----" + "\u001B[0m");
                    arr = createArray(arrayLength);
                    printArray(arr, false);
                    average(arr);

                    // ----------- Task 11 ------------
                    System.out.println("\u001B[32m" + "---- Task 11 ----" + "\u001B[0m");
                    int[] arr1 = createArray(arrayLength);
                    int[] arr2 = createArray(arrayLength);
                    printArray(arr1, false);
                    printArray(arr2, false);
                    sumOfArrays(arr1, arr2);

                    // ----------- Task 12 ------------
                    System.out.println("\u001B[32m" + "---- Task 12 ----" + "\u001B[0m");
                    int arrayLength1 = 4;
                    int arrayLength2 = 5;
                    arr1 = createArray(arrayLength1);
                    arr2 = createArray(arrayLength2);
                    printArray(arr1, false);
                    printArray(arr2, false);

                    concatenationOfArrays(arr1, arr2);

                    // ----------- Task 13 ------------
                    System.out.println("\u001B[32m" + "---- Task 13 ----" + "\u001B[0m");
                    arr = createArray(arrayLength);
                    System.out.print("Original array: ");
                    printArray(arr, false);
                    swapMaxMin(arr);

                    // ----------- Task 14 ------------
                    System.out.println("\u001B[32m" + "---- Task 14 ----" + "\u001B[0m");
                    arr = createArray(arrayLength);
                    System.out.print("Original array: ");
                    printArray(arr, false);
                    delMaxMin(arr);

                    // ----------- Task 15 ------------
                    System.out.println("\u001B[32m" + "---- Task 15 ----" + "\u001B[0m");
                    arr = createArray(arrayLength);
                    System.out.print("Original array: ");
                    printArray(arr, false);
                    devideArray(arr);

                    // ----------- Task 16 ------------
                    System.out.println("\u001B[32m" + "---- Task 16 ----" + "\u001B[0m");
                    arr1 = createArray(arrayLength);
                    arr2 = createArray(arrayLength);
                    printArray(arr1, false);
                    printArray(arr2, false);
                    oddArray(arr1, arr2);

                    // ----------- Task 17 ------------
                    System.out.println("\u001B[32m" + "---- Task 17 ----" + "\u001B[0m");
                    arr = createArray(arrayLength);
                    System.out.print("Original array: ");
                    printArray(arr, false);
                    delMaxMinDuplicates(arr);

                    // ----------- Task 18 ------------
                    System.out.println("\u001B[32m" + "---- Task 18 ----" + "\u001B[0m");
                    arrayLength1 = 8;
                    arrayLength2 = 9;
                    arr1 = createArray(arrayLength1);
                    arr2 = createArray(arrayLength2);
                    System.out.print("First array: ");
                    printArray(arr1, false);
                    System.out.print("Second array: ");
                    printArray(arr2, false);
                    averageArray(arr1, arr2);

                    break;
                }
                case "e": {
                    exit = true;
                    break;
                }
                default:
                    break;

            }
        } while (!exit);

    }
}