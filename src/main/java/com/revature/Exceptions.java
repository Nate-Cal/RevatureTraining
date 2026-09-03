package com.revature;

import com.revature.exceptions.MyCheckedExceptions;
import com.revature.exceptions.MyUncheckedException;

public class Exceptions {

    public static void main(String[] args) {
//        throwsOurUncheckedException();
        throwsOurCheckedExceptionAndHandlesIt();
        // Not Handled Exception
//        throwsOurCheckedExceptionAndDoesNotHandleIt();

        try {
            throwsOurCheckedExceptionAndDoesNotHandleIt();
        } catch (MyCheckedExceptions exception) {
            exception.printStackTrace();
        }
        System.out.println("This is after the stack trace");
    }

    public static void throwsOurUncheckedException() {
        throw new MyUncheckedException("This message is stored in the exception");
    }

    public static void throwsOurCheckedExceptionAndHandlesIt() {
        try {
            throw new MyCheckedExceptions("This message is stored in my checked exception");
        } catch (MyCheckedExceptions exception) {
            System.out.println(exception.getMessage());
        }
    }

    // Not Handled Checked Exception
    public static void throwsOurCheckedExceptionAndDoesNotHandleIt() throws MyCheckedExceptions {
        throw new MyCheckedExceptions("This message is in my checked exception that is not handled immediately");
    }


}
