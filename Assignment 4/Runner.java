/**
 * Created by mike on 11/21/2014.
 */
public class Runner {
    String name = "";
    String country = "";
    double time = 0;

    public Runner(String name, String country, double time) {
        this.name = name;
        this.country = country;
        this.time = time;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }


}
