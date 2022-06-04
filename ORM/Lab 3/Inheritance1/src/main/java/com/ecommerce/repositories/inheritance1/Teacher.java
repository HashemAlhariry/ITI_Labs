package com.ecommerce.repositories.inheritance1;
// default package
// Generated Mar 31, 2022, 12:59:11 PM by Hibernate Tools 6.0.0.Beta2


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Teacher generated by hbm2java
 */

@Entity
@Table(name="teacher"
    ,catalog="inheritance1"
)
public class Teacher extends Person {


    private Integer id;
    private Date hireDate;

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, Date hireDate) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.hireDate = hireDate;
    }
   
    @Id @GeneratedValue(strategy=IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="first_name", nullable=false, length=50)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="last_name", nullable=false, length=50)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="hire_date", nullable=false, length=10)
    public Date getHireDate() {
        return this.hireDate;
    }
    
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }




}


