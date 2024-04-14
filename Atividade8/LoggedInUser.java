public class LoggedInUser {
    private User user;
    private String strVerifycode;
    
    public LoggedInUser(User user, String strVerifycode) {
        this.user = user;
        this.strVerifycode = strVerifycode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStrVerifycode() {
        return strVerifycode;
    }

    public void setStrVerifycode(String strVerifycode) {
        this.strVerifycode = strVerifycode;
    }

    
}
