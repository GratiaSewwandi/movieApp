/**
 * Created by gratia on 7/5/18.
 */
public class Test {
    public static void main(String[] args) {
        // Test constructor
        Director director = new Director("James", "Cameron");
        // Test Setters and Getters
        // Crete an object Date to represent the dob
        Date dob = new Date(02,03,2004);
        director.setDob(dob);
        director.setNumDirectedMovie(23);
        System.out.println(director); // toString()
        System.out.println("name is: " + director.getName());
        System.out.println("surname is: " + director.getSurname());
        System.out.println("dob is: " + director.getDob().getDate());
        System.out.println("number of directed movies is: "+director.getNumDirectedMovie());
    }


}
