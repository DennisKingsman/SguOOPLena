package entity;

import java.math.BigDecimal;

public class Broadcast {

    private String broadcastName;
    private int broadcastPriority;
    private BigDecimal minuteCost;

    public Broadcast() {
    }

    public Broadcast(String broadcastName, int broadcastPriority, BigDecimal minuteCost) {
        this.broadcastName = broadcastName;
        this.broadcastPriority = broadcastPriority;
        this.minuteCost = minuteCost;
    }

    public String getBroadcastName() {
        return broadcastName;
    }

    public void setBroadcastName(String broadcastName) {
        this.broadcastName = broadcastName;
    }

    public int getBroadcastPriority() {
        return broadcastPriority;
    }

    public void setBroadcastPriority(int broadcastPriority) {
        this.broadcastPriority = broadcastPriority;
    }

    public BigDecimal getMinuteCost() {
        return minuteCost;
    }

    public void setMinuteCost(BigDecimal minuteCost) {
        this.minuteCost = minuteCost;
    }

    @Override
    public String toString() {
        return "Broadcast: " + "broadcastName " + broadcastName + " "
                + "broadcastPriority " + broadcastPriority + " "
                + "minuteCost " + minuteCost + ". ";
    }

}
