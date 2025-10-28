
class ThrowExceptionNew extends Exception {
    ThrowExceptionNew(String message) {
        super(message); // pass exception message to the parent class
    }
}

class ThrowMemberShipException extends Exception {
    ThrowMemberShipException(String member) {
        super(member); // pass exception message to the parent class
    }
}

class ThrowExample {
    public void CheckNum(int num, String member) throws Exception { // if throw Exception in function , need to throws
                                                                    // Exception here
        // here throw exception but not handel here , need to handel inside the main
        // method using try_catch block
        if (member.isEmpty()) {
            throw new ThrowMemberShipException("member is in inValid ");
        } else {
            System.out.println("successfull , member is valid");
        }

        if (num > 3) {
            throw new ThrowExceptionNew("number is invalid, Exception is occure");
        } else {
            System.out.println("successfull , number is valid.....");
        }
    }
}

public class ThrowsAndThrowKeyword {

    public static void main(String[] args) {
        ThrowExample obj = new ThrowExample();

        try {
            obj.CheckNum(2, "john");
        } catch (Exception e) {
            // control here Exception
            System.out.println("Exception is occure : " + e.getMessage());
        }

    }
}
