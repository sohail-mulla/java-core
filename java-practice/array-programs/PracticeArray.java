public class PracticeArray {

    //------------ Array practice questions -------------------------

    public class ArrayPrograms {


        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 20, 10};

            printArray(arr);
            findLength(arr);
            sumArray(arr);
            averageArray(arr);
            maxElement(arr);
            minElement(arr);
            searchElement(arr, 20);
            countEvenOdd(arr);
            reverseArray(arr);
            sortAsc(arr.clone());
            sortDesc(arr.clone());
            findDuplicates(arr);
            removeDuplicates(arr);
            frequency(arr);
            secondLargest(arr);
            secondSmallest(arr);

            int[] arr2 = {60, 70};
            int[] merged = mergeArrays(arr, arr2);
            printArray(merged);

            isPalindrome(arr);
        }




    }

        //  Declare and initialize
        static void declareArray() {
            int[] arr = {10, 20, 30, 40, 50};
            System.out.println("Array declared.");
        }

        //  Print elements
        static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        //  Find length
        static void findLength(int[] arr) {
            System.out.println("Length = " + arr.length);
        }

        //  Sum of elements
        static void sumArray(int[] arr) {
            int sum = 0;
            for (int num : arr) sum += num;
            System.out.println("Sum = " + sum);
        }

        //  Average
        static void averageArray(int[] arr) {
            int sum = 0;
            for (int num : arr) sum += num;
            System.out.println("Average = " + (sum / arr.length));
        }

        //  Maximum
        static void maxElement(int[] arr) {
            int max = arr[0];
            for (int num : arr) {
                if (num > max) max = num;
            }
            System.out.println("Max = " + max);
        }

        //  Minimum
        static void minElement(int[] arr) {
            int min = arr[0];
            for (int num : arr) {
                if (num < min) min = num;
            }
            System.out.println("Min = " + min);
        }

        //  Searching  element
        static void searchElement(int[] arr, int key) {
            for (int num : arr) {
                if (num == key) {
                    System.out.println("Element found");
                    return;
                }
            }
            System.out.println("Element not found");
        }

        //  Counting  even and odd
        static void countEvenOdd(int[] arr) {
            int even = 0, odd = 0;
            for (int num : arr) {
                if (num % 2 == 0) even++;
                else odd++;
            }
            System.out.println("Even = " + even + ", Odd = " + odd);
        }

        //  Copy array
        static int[] copyArray(int[] arr) {
            int[] copy = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                copy[i] = arr[i];
            }
            return copy;
        }

        //  Reverse array
        static void reverseArray(int[] arr) {
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        //  Sort ascending
        static void sortAsc(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            printArray(arr);
        }

        //  Sort descending
        static void sortDesc(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            printArray(arr);
        }

        //  Find duplicates
        static void findDuplicates(int[] arr) {
            System.out.print("Duplicates: ");
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.print(arr[i] + " ");
                        break;
                    }
                }
            }
            System.out.println();
        }

        //  Remove duplicates
        static void removeDuplicates(int[] arr) {
            System.out.print("Unique elements: ");
            for (int i = 0; i < arr.length; i++) {
                boolean isDuplicate = false;
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

        //  Frequency of elements
        static void frequency(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                int count = 1;
                boolean visited = false;

                for (int k = 0; k < i; k++) {
                    if (arr[i] == arr[k]) {
                        visited = true;
                        break;
                    }
                }
                if (visited) continue;

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) count++;
                }
                System.out.println(arr[i] + " -> " + count);
            }
        }

        //  Second largest
        static void secondLargest(int[] arr) {
            int first = Integer.MIN_VALUE;

            int second = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > first) {
                    second = first;
                    first = num;
                } else if (num > second && num != first) {
                    second = num;
                }
            }
            System.out.println("Second Largest = " + second);
        }

        //  Second smallest
        static void secondSmallest(int[] arr) {
            int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

            for (int num : arr) {
                if (num < first) {
                    second = first;
                    first = num;
                } else if (num < second && num != first) {
                    second = num;
                }
            }
            System.out.println("Second Smallest = " + second);
        }

        //  Merge two arrays
        static int[] mergeArrays(int[] a, int[] b) {
            int[] merged = new int[a.length + b.length];

            for (int i = 0; i < a.length; i++) {
                merged[i] = a[i];
            }
            for (int i = 0; i < b.length; i++) {
                merged[a.length + i] = b[i];
            }
            return merged;
        }

        //  Check if array palindrome
        static void isPalindrome(int[] arr) {
            boolean isPal = true;

            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[i] != arr[arr.length - 1 - i]) {
                    isPal = false;
                    break;
                }
            }

            if (isPal) System.out.println("Palindrome");
            else System.out.println("Not Palindrome");
        }


}


