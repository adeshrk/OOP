public class Main {
    public static void main(String[] args) {
        Bank adesh=new Bank();

        adesh.setAcno(123456789);
        adesh.setMob(940307666);
        adesh.setEmail("adeshrk@gmail.com");
        adesh.setName("Adesh Kauthale");
        adesh.setBal(0);

        System.out.printf("Hello %s%n", adesh.getName());
        System.out.println("Your account number is - "+adesh.getAcno());
        System.out.println("Mobile is - "+adesh.getMob());
        System.out.println("Email is - "+adesh.getEmail());

        adesh.deposit(5908756);
        adesh.withdraw(65248);
        adesh.withdraw(908756);


    }





}
