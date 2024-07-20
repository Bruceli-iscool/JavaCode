package effective;

public class test {
    public static void main(String args[]) {
        
    };
};
// testing enums
enum weekDays {
    MONDAY,
    TUESDAY, 
    WENDSDAY, 
    THURSDAY,
    FRIDAY
}; 

class Bank {
    private int password = 1034244;
    private String username = "John8978";
    // method
    public int get() {
        return getPassWord();
    }
    // getters
    public String getUserName() {
        return username;
    } public int getPassWord() {
        return password;
    }
    // setters
    public void changeUserName(String change) {
        username = change;
    } public void changePassWord(int change) {
        password = change;
    }
}
