package upWork;

public class Mark3 {
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }

    /*

Q1.
    a.
1.	[4 Pts] Clearly labeled insertionSort  method




2.	[10 Pts] Control Flow Graph for the insertionSort   above and independent paths




3.	[6 Pts] Test cases to perform basic path testing for the independent paths identified above.




b.
            1. [12 Pts] Copy and paste Junit test program
(Note: Google drive link in part 2 is needed to get points for part 1)



            2. [8 Pts] Google drive link for the Junit files






*/


    public static String sortStr(String str)
    {
        char char_array[] = str.toCharArray();
        char temp;

        int i = 0;
        while (i < char_array.length) {
            int j = i + 1;
            while (j < char_array.length) {
                if (char_array[j] < char_array[i]) {
                    temp = char_array[i];
                    char_array[i] = char_array[j];
                    char_array[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
        String returnStr = String.valueOf(char_array);
        return returnStr;
    }

/*
Q2.
a.
1.	[4 Pts] Clearly labeled insertionSort  method




2.	[10 Pts] Control Flow Graph for the insertionSort   above and independent paths




3.	[6 Pts] Test cases to perform basic path testing for the independent paths identified above.




b.
            1.[6 Pts] Copy and paste Junit test program
                            (Note: Google drive link in part 2 is needed to get points for part 1)


             2. [4 Pts] Google drive link for the Junit files






c.
1. [12 Pts] Copy and paste the parameterized Junit test case
    (Google drive link in part 2 is needed to get points for part 1)


2. [8 Pts] Google drive link for the Junit files




d.         (Part 3 is needed to get points for part 1 and 2)
           1. [5 Pts] Copy and paste the TestNG test cases to run test cases for each path


          2. [3 Pts] copy and paste methods-test-testing.xml file to run TestNG test cases in
parallel



          3. [2 Pts] Google drive link for the Junit files





     */
}
