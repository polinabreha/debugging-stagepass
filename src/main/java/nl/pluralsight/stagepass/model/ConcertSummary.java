package nl.pluralsight.stagepass.model;

import java.math.BigDecimal;

public class ConcertSummary {
    private Long concertId;
    private String concertTitle;
    private int seatsBooked;
    private int availableSeats;
    private BigDecimal totalRevenue;
    private int totalSeats;

    public ConcertSummary(Long concertId, String concertTitle, int seatsBooked, int availableSeats, BigDecimal totalRevenue, int totalSeats) {
        this.concertId = concertId;
        this.concertTitle = concertTitle;
        this.seatsBooked = seatsBooked;
        this.availableSeats = availableSeats;
        this.totalRevenue = totalRevenue;
        this.totalSeats = totalSeats;
    }

    public Long getConcertId() {
        return concertId;
    }

    public String getConcertTitle() {
        return concertTitle;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public BigDecimal getTotalRevenue() {
        return totalRevenue;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setConcertId(Long concertId) {
        this.concertId = concertId;
    }

    public void setConcertTitle(String concertTitle) {
        this.concertTitle = concertTitle;
    }

    public void setSeatsBooked(int seatsBooked) {
        this.seatsBooked = seatsBooked;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void setTotalRevenue(BigDecimal totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }
}
