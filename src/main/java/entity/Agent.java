package entity;

import java.math.BigDecimal;
import java.util.List;

public class Agent {

    private Long agentId;
    private List<Advertising> responsibleAdvertising;
    private BigDecimal agentPayment;
    private List<Long> responsibleAdvertisingId;

    public Agent() {
    }

    public Agent(Long agentId, List<Advertising> responsibleAdvertising, BigDecimal agentPayment, List<Long> responsibleAdvertisingId) {
        this.agentId = agentId;
        this.responsibleAdvertising = responsibleAdvertising;
        this.agentPayment = agentPayment;
        this.responsibleAdvertisingId = responsibleAdvertisingId;
    }

    public List<Long> getResponsibleAdvertisingId() {
        return responsibleAdvertisingId;
    }

    public void setResponsibleAdvertisingId(List<Long> responsibleAdvertisingId) {
        this.responsibleAdvertisingId = responsibleAdvertisingId;
    }

    public List<Advertising> getResponsibleAdvertising() {
        return responsibleAdvertising;
    }

    public void setResponsibleAdvertising(List<Advertising> responsibleAdvertising) {
        this.responsibleAdvertising = responsibleAdvertising;
    }

    public BigDecimal getAgentPayment() {
        return agentPayment;
    }

    public void setAgentPayment(BigDecimal agentPayment) {
        this.agentPayment = agentPayment;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Agent :").append(' ');
        stringBuilder.append(agentId).append(' ');
        for (Advertising a: responsibleAdvertising) {
            stringBuilder.append(a.toString()).append(' ');
        }
        stringBuilder.append(agentPayment).append('.');
        return stringBuilder.toString();
    }

}
