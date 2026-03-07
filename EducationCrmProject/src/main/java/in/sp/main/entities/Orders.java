package in.sp.main.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_id")
    private String  courseId;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_amount")
    private Long courseAmount;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "date_of_purchase")
    private String dateOfPurchase;

    @Column(name = "rzp_payment_id")
    private String rzpPaymentId;

    @Column(name = "order_id")
    private String orderId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getCourseAmount() {
        return courseAmount;
    }

    public void setCourseAmount(Long courseAmount) {
        this.courseAmount = courseAmount;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getRzpPaymentId() {
        return rzpPaymentId;
    }

    public void setRzpPaymentId(String rzpPaymentId) {
        this.rzpPaymentId = rzpPaymentId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    
}
