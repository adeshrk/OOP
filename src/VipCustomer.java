/**
 * Created by Adesh on 12-06-2019
 */

public class VipCustomer {
    private String name;
    private String email;
    private long limit;

    public VipCustomer() {
        this("Adesh","gmail");

    }

    public VipCustomer(String name, String email) {
        this.name = name;
        this.email = email;
        System.out.println(name + " "+email+ " ");
    }

    public VipCustomer(String name, String email, long limit) {
        this.name = name;
        this.email = email;
        this.limit = limit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getLimit() {
        return limit;
    }


}
