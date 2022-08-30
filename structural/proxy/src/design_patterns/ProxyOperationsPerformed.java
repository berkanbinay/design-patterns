package design_patterns;

public class ProxyOperationsPerformed implements OperationsPerformed {
    private String userName;
    private RealOperationsPerformed  realOperationsPerformed;

    public ProxyOperationsPerformed(String userName){
        this.userName = userName;
    }

    @Override
    public void view() {
        if (getRole(userName).equals("ADMIN") ||
                getRole(userName).equals("USER")) {
            realOperationsPerformed = new RealOperationsPerformed();
            realOperationsPerformed.view();
        }
        else {
            System.out.println("You can not view this record.");
        }
    }

    @Override
    public void edit() {
        if (getRole(userName).equals("ADMIN")) {
            realOperationsPerformed = new RealOperationsPerformed();
            realOperationsPerformed.edit();
        }
        else {
            System.out.println("You can not edit this record.");
        }
    }

    public String getRole(String userName) {
        //Get user role by username
        return "ADMIN";
    }
}