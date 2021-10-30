package builder;

public class User {
    private String firstName; // mandetory
    private String lastName; // mandetory
    private String email; // mandetory
    private int age; // optional
    private String address; // optional

    private User(UserBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this. age = builder.age;
        this.address = builder.address;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
    
    public String getEmail(){
        return this.email;
    }

    public int getAge(){
        return this.age;
    }

    public String getAddress(){
        return this.address;
    }

    @Override
    public String toString(){
        return String.format("%s\n%s\n%s\n%d\n%s",this.firstName, this.lastName, this.email,this.age,this.address);
    }

    public static class UserBuilder{
        private String firstName; // mandetory in parent
        private String lastName; // mandetory in parent
        private String email; // mandetory in parent
        private int age; // optional in parent
        private String address; // optional in parent
        
        public UserBuilder(String firstName, String lastName, String email){
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        public UserBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public UserBuilder setAddress(String address){
            this.address = address;
            return this;
        }

        public User build(){
            // if any validation is needed do it here before returning the object
            return new User(this);
        }

    }

}
