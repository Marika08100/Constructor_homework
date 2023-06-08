public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022);
        System.out.println(myCar.getBrand()); // Output: Toyota

        Car defaultCar = new Car();
        System.out.println(defaultCar.getModel()); // Output: Unknown


        BankAccount account3 = new BankAccount("RO14266265798615", "Lady Gaga",565545.4554);
        System.out.println("Our client " + account3.getAccountHolder() + " with this account number " + account3.getAccountNumber() + " and this is the balance " + account3.getBalance());

    }
}
