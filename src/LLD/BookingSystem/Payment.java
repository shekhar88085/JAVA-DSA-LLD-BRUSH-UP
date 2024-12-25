package LLD.BookingSystem;

import java.util.Date;

import LLD.BookingSystem.enums.PaymentStatus;
import LLD.BookingSystem.enums.PaymentMethod;

public class Payment {
    private int paymentId;                 // Unique identifier for the payment
    private int bookingId;                 // Associated booking ID
    private double amount;                 // Payment amount
    private Date paymentDate;              // Date of payment
    private PaymentStatus status;          // Status of the payment (SUCCESS, PENDING, FAILED)
    private PaymentMethod method;          // Method of payment (UPI, CARD, CASH, etc.)

    // Constructor
    public Payment(int paymentId, int bookingId, double amount, Date paymentDate, 
                   PaymentStatus status, PaymentMethod method) {
        this.paymentId = paymentId;
        this.bookingId = bookingId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.status = status;
        this.method = method;
    }

    // Getters and Setters
    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public void setMethod(PaymentMethod method) {
        this.method = method;
    }

    // Methods
    public void processPayment() {
        // Logic to process the payment
        // Update payment status based on the result of the transaction
        System.out.println("Processing payment...");
        this.status = PaymentStatus.SUCCESS;
    }

    public void updatePaymentStatus(PaymentStatus status) {
        this.status = status;
    }

    public String getPaymentDetails() {
        return "Payment ID: " + paymentId +
                ", Booking ID: " + bookingId +
                ", Amount: " + amount +
                ", Payment Date: " + paymentDate +
                ", Status: " + status +
                ", Method: " + method;
    }
}