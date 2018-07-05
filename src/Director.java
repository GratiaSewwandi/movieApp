/**
 * Created by gratia on 7/5/18.
 */
public class Director {
    private String name;
    private String surname;
    private int numDirectedMovie;
    private Date Dob;

    public Director(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDob() {
        return Dob;
    }

    public int getNumDirectedMovie() {
        return numDirectedMovie;
    }

    public void setDob(Date Dob) {
        this.Dob = Dob;
    }

    public void setNumDirectedMovie(int numDirectedMovie) {
        this.numDirectedMovie = numDirectedMovie;
    }

    public String toString() {
        return "Director : " + name + " " + surname + " " + Dob.getDate() + " " + numDirectedMovie;
    }
}
