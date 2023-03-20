package com;

public class Mainq {
    static void func(int n) {
        for(int i=1; i<=n; i++){  // times - n
            System.out.println("upGrade");  // --> O(1)
        }
    }
    // f(5) -> O(1) + O(1) +... 5 times -> 5*O(1) -> O(5) -> O(1)
    // f(50) -> O(1) + ... 50 times -> 50*O(1) -> O(50) constant time algo
    // f(n) -> O(1) + .... n times -> n*O(1) -> O(n) - linear time algo

    // Example - 1
    static void func1(int n){
        for(int i=1 ; i*i<n ; i++){
            System.out.println("upGrad");
        }
    }
    /*
      n = 10^12
      O(n) -> 10^12 cpu cycles
      O(sqrt(n)) -> 10^6 cpu cycles
        i = 1; 1<17 --> print --> i++
        i = 2; 4<17 --> print --> i++
        i = 3; 9<17 --> print --> i++
        i = 4; 16<17 --> print --> i++
        i = 5; 25!<17 --> ends the loops
        sqrt(17) - 4.13231123 - floor(4.1212) = 4
        sqrt(n) times
        O(sqrt(n))

     */


    // Example - 2
    static void func2(int n){
        for(int i=1 ; i<=n ; i++){ // -> O(n)
            for(int j=1 ; j<=n ; j++){  // -> O(n)
                System.out.println("Find my TC"); // -> O(1)
                //break; // -> O(1)
            }
            //break;
        }
    }
    // O(n) * O(n) --> O(n^2)

    // Example - 3
    static void func3(int n){
        for(int i=1 ; i<n ; i=i*2){
            System.out.println("upGrad");
        }
    }
    /*
    i = 1; 1<5 --> print --> i=i*2
    i = 2; 2<5 --> print --> i=i*2
    i = 4; 4<5 --> print --> i=i*2
    i = 8; 8!<5 ends the loop
    O(log2(n))
     */

    // Example - 4
    static void func4(int n){
        for(int i=n ; i>0 ; i=i/2){
            System.out.println("upGrad");
        }
    }

    // Example - 5
    static void func5(int n) {
        if (n == 1) {
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.println("Find my TC");
                    break;
                }
            }
        }
    }

    // Example - 6
    static void func6(int n) {
        int a = 0;
        for(int i=0 ; i< n*n ; i++){
            for(int j=0 ; j< 100000 ; j++){
                a++;
            }
        }
    }

    // Example - 7
    static void func7(int a, int b) {
        int m = 0, n = 0;
        for(int i=0 ; i<a ; i++){
            m++;
        }
        for(int j=0 ; j< b; j++){
            n++;
        }
    }

    // Example - 8
    static void func8(int n) {
        for (double i = n; i >= 0; i /= 2){
            for (double j= 1; j<= n; j+= 2) {
                System.out.println("Hello World!");
            }
            for (double j = 1; j <= n*n; j += 1) {
                System.out.println("Hello World Again!");
            }
            for (double j = 1; j<= n*n*n; j+=2){
                System.out.println("Hello World Again Again!");
            }
        }
    }


    // Example - 9
    public static int[] func9(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while(i<j) {
            int temp =arr[i];
            arr[i] = arr[j];
            arr[i] = temp;
            i++;
            j--;
        }
        return arr;
    }

    // Hands-On Exercise - 1 Time and Space Complexity
    static void func10(int n){
        float x = 0;
        for(int a = 0; a < n; a++)
            for(int b = 0; b < n; b++)
                for(int c = 0; c < 100; c++)
                    x++;
    }

    // Hands-On Exercise - 2 Time and Space Complexity
    static void func11(int n) {
        int j = 1;
        while (j < n){
            j = j*2;
        }
    }

    // Hands-On Exercise - 3 Time and Space Complexity
  /*  public static void countFreq(int arr[], int n)
    {
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);
        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
*/
    public static void main(String[] args) {
//        func(5);
//        func1(5);
//        System.out.println();func2(2);
        System.out.println();func3(5);
       System.out.println();func4(5);
       System.out.println();func5(5);
        System.out.println();func6(5);
       System.out.println();func7(5, 10);
//        System.out.println();func8(2);
//        System.out.println();System.out.println(Arrays.toString(func9(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
    }

}

