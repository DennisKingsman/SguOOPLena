package entity;

import java.time.LocalDate;

public class Advertising {

    private Long advertisingId;
    private Long responsibleAgentId;
    private Broadcast broadcast;
    private Customer customer;
    private String responsibleBroadcastName;
    private String responsibleCustomerName;
    private LocalDate advertisingDate;
    private int advertisingDuration;

    public Advertising() {
    }

    public Advertising(Long advertisingId, Long responsibleAgentId, Broadcast broadcast, Customer customer, String responsibleBroadcastName, String responsibleCustomerName, LocalDate advertisingDate, int advertisingDuration) {
        this.advertisingId = advertisingId;
        this.responsibleAgentId = responsibleAgentId;
        this.broadcast = broadcast;
        this.customer = customer;
        this.responsibleBroadcastName = responsibleBroadcastName;
        this.responsibleCustomerName = responsibleCustomerName;
        this.advertisingDate = advertisingDate;
        this.advertisingDuration = advertisingDuration;
    }

    public Long getAdvertisingId() {
        return advertisingId;
    }

    public void setAdvertisingId(Long advertisingId) {
        this.advertisingId = advertisingId;
    }

    public Long getResponsibleAgentId() {
        return responsibleAgentId;
    }

    public void setResponsibleAgentId(Long responsibleAgentId) {
        this.responsibleAgentId = responsibleAgentId;
    }

    public Broadcast getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(Broadcast broadcast) {
        this.broadcast = broadcast;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getResponsibleBroadcastName() {
        return responsibleBroadcastName;
    }

    public void setResponsibleBroadcastName(String responsibleBroadcastName) {
        this.responsibleBroadcastName = responsibleBroadcastName;
    }

    public String getResponsibleCustomerName() {
        return responsibleCustomerName;
    }

    public void setResponsibleCustomerName(String responsibleCustomerName) {
        this.responsibleCustomerName = responsibleCustomerName;
    }

    public LocalDate getAdvertisingDate() {
        return advertisingDate;
    }

    public void setAdvertisingDate(LocalDate advertisingDate) {
        this.advertisingDate = advertisingDate;
    }

    public int getAdvertisingDuration() {
        return advertisingDuration;
    }

    public void setAdvertisingDuration(int advertisingDuration) {
        this.advertisingDuration = advertisingDuration;
    }

    @Override
    public String toString() {
        return "Advertising : " + "id " + advertisingId + " "
                + customer + "; "
                + broadcast + "; "
                + "advertisingDate " + advertisingDate + "; "
                + "advertisingDuration" + advertisingDuration + ". ";
    }

}
