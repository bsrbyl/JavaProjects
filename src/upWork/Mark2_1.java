package upWork;

public class Mark2_1 {

    /* Prerequisite: You need to have Junit installed and configured to run in your IDE. Preferably, Eclipse. Also review Module 7 lectures and examples posted.
    Submission: submit the PDF version of  the completed “H4_SubmissionTemplate” document.
    Q1.[] Consider the following insertionSort method given */
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];               int i = j-1;
        while ( (i> -1) && ( array [i] > key ) ) {
            array [i+1] = array [i];                   i--;               }
        array[i+1] = key;
    }
    }
   /* a)	[] Draw the control-flow graph, identify independent paths and design test cases to perform basic path testing.

            Note: You can hand-draw the control flow graph scan and submit the PDF version.

            b)	[] Implement Junit code to run test cases for each path. Upload the Junit test cases into your google drive and include the link in H4 SubmissionTemplatedocuument.
*/



   // Q2.[] Consider the following modified sortStr method given
    public static String sortStr(String str)
    {
        char char_array[] = str.toCharArray();
        char temp;

        int i = 0;
        while (i<char_array.length) {
            int j = i + 1;
            while (j<char_array.length) {
                if (char_array[j] <char_array[i]) {
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
  /*  a)	[] Draw the control-flow graph, independent paths and design test cases to perform basic path testing

    Note: You can hand-draw the control flow graph scan and submit the PDF version.

            b)	[] Implement Junit test cases to run test cases for each path. Upload the Junit test cases into your google drive and include the link in HW_4 SubmissionTemplatedocuument.


    c)	[] Implement Parameterized Junit test case file that tests sortStrmethod using parameterized Junit testing. Also review lecture and the
    example given that discussed parameterized testing. Upload the Junit test cases into your google drive and include the link in HW_4 SubmissionTemplatedocuument.


    d)	[] Implement TestNG test cases to run test cases for each path. As we have discussed during lectures, TestNG test cases can be executed in parallel with multi-threading. Study the parallel TestNG testcases example project given and now configure your TestNG test case project run test cases in parallel. Upload the Junit test cases into your google drive and include the links for the TestNG testcases and methods-test-testing.xml in HW_4 SubmissionTemplatedocuument.

    Final Submission Instructions

    Submit the PDF version of  the completed “H4 SubmissionTemplate” document that contains answers to all the question in Q1 and Q2..
*/
}
