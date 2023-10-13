class Bill {
    int no_Of_Units;
    double charge_per_unit;
    String bill_Id;
    static int count = 0;

    // Default constructor
    public Bill() {
        count++;
    }

    // Parameterized constructor
    public Bill(int no_Of_Units, double charge_per_unit, String bill_Id) {
        this.no_Of_Units = no_Of_Units;
        this.charge_per_unit = charge_per_unit;
        this.bill_Id = bill_Id;
        count++;
    }

    // Copy constructor
    public Bill(Bill b) {
        this.no_Of_Units = b.no_Of_Units;
        this.charge_per_unit = b.charge_per_unit;
        this.bill_Id = b.bill_Id;
        count++;
    }

    public int getno_Of_Units() {
        return no_Of_Units;
    }

    public void setno_Of_Units(int no_Of_Units) {
        this.no_Of_Units = no_Of_Units;
    }

    public double getcharge_per_unit() {
        return charge_per_unit;
    }

    public void setcharge_per_unit(double charge_per_unit) {
        this.charge_per_unit = charge_per_unit;
    }

    public String getbill_Id() {
        return bill_Id;
    }

    public void setbill_Id(String bill_Id) {
        this.bill_Id = bill_Id;
    }

    public double calculateBillAmount() {
        return no_Of_Units * charge_per_unit;
    }

    public static int totalBillCount() {
        return count;
    }

    public void printBillDetails() {
        System.out.println("Bill ID: " + bill_Id);
        System.out.println("No. of Units Consumed: " + no_Of_Units);
        System.out.println("Charge per Unit: $" + charge_per_unit);
    }
}

class ElectricityBill extends Bill {
    public ElectricityBill(int no_Of_Units, double charge_per_unit, String bill_Id) {
        super(no_Of_Units, charge_per_unit, bill_Id);
    }

    @Override
    public double calculateBillAmount() {
        double billAmount = super.calculateBillAmount();
        return billAmount + (0.02 * billAmount);
    }
}

class MilkBill extends Bill {
    private double supplier_Charge;

    public MilkBill(int no_Of_Units, double charge_Per_Unit, String bill_Id, double supplier_Charge) {
        super(no_Of_Units, charge_Per_Unit, bill_Id);
        this.supplier_Charge = supplier_Charge;
    }

    @Override
    public void printBillDetails() {
        super.printBillDetails();
        System.out.println("Supplier Charge: Rs. " + supplier_Charge);
    }

    @Override
    public double calculateBillAmount() {
        double billAmount = super.calculateBillAmount();
        return billAmount + supplier_Charge;
    }
}

public class BillMain {
    public static void main(String[] args) {
        Bill bill_1 = new Bill(100, 0.5, "B001");
        ElectricityBill electricity_Bill = new ElectricityBill(200, 0.6, "E001");
        MilkBill milk_Bill = new MilkBill(50, 2.0, "M001", 5.0);

        // Runtime polymorphism
        Bill polymorphism_Bill = electricity_Bill;
        System.out.println("------------------------------------------------------------------");
        polymorphism_Bill.printBillDetails();
        System.out.println("Bill Amount: $" + polymorphism_Bill.calculateBillAmount());
        System.out.println("------------------------------------------------------------------");

        polymorphism_Bill = milk_Bill;
        polymorphism_Bill.printBillDetails();
        System.out.println("Bill Amount: $" + polymorphism_Bill.calculateBillAmount());
        System.out.println("------------------------------------------------------------------");

        System.out.println("Total Bill Instances Created: " + Bill.totalBillCount());
        System.out.println("------------------------------------------------------------------");
    }
}

