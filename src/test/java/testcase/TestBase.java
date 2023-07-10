package testcase;


/*
... 'TC-1' waiting...
... 'TC-5' waiting...
*** 'TC-2' FINISHED work.
'TC-2' Semaphore UP.
End 'TC-2'.

::: TC-1 ::: Semaphore DOWN.    <=======  NOT working properly.. primitive boolean is not good for sync !!!
Starting 'TC-1.
--- Outside WHILE..
*** 'TC-1' WORKING ***

::: TC-5 ::: Semaphore DOWN.    <========
Starting 'TC-5.
--- Outside WHILE..
*** 'TC-5' WORKING ***
... 'TC-4' waiting...
 */
public class TestBase {
    protected static boolean semaphore = true;
}
