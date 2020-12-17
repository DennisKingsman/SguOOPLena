package entity;

public class Customer {

    private String customerName;
    private String bankRequisites;
    private String customerPhoneNumber;
    private String contactPerson;

    public Customer() {
    }

    public Customer(String customerName, String bankRequisites, String customerPhoneNumber, String contactPerson) {
        this.customerName = customerName;
        this.bankRequisites = bankRequisites;
        this.customerPhoneNumber = customerPhoneNumber;
        this.contactPerson = contactPerson;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBankRequisites() {
        return bankRequisites;
    }

    public void setBankRequisites(String bankRequisites) {
        this.bankRequisites = bankRequisites;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    @Override
    public String toString() {
        return "Customer : " + "customerName " + customerName + " "
                + "bankRequisites " + bankRequisites + " "
                + "customerPhoneNumber " + customerPhoneNumber + " "
                + "contactPerson " + contactPerson + ". ";
    }

}
