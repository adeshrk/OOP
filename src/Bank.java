public class Bank {
    private long acno;
    private long bal;
    private String name;
    private String email;
    private long mob;


    public long getAcno(){
        return acno;
    }

    public long getBal() {
        return bal;
    }

    public long getMob() {
        return mob;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return this.name;
    }

    public void setAcno(long acno) {
        this.acno = acno;
    }

    public void setBal(long bal) {
        this.bal = bal;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMob(int mob) {
        this.mob = mob;
    }

    public void deposit(double dep){
        this.bal+=dep;
        System.out.println("Your current balance is "+this.bal+" Rs.");
    }

    public void withdraw(long with){
        if(this.bal>with){
            this.bal=this.bal - with;
            System.out.println("Updated balance is = "+this.bal);
        }else {
            System.out.println("Insufficient funds, Your current balance is "+
                    this.bal+"\nAnd your trying to withdraw "+with);
        }
    }

}
