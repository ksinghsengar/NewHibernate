import javax.persistence.*;

/**
 * Created by krishan on 7/8/2017.
 */
@Entity
@Embeddable
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int streetNo;
    String location;
    String state;

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
