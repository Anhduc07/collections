package collections.kethua;

public class Admin extends User {
   public Admin(String name, String email) {
       super(name, email);
   }
    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}