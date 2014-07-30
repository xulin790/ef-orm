package org.easyframe.tutorial.lessona.entity;

import java.util.Date;

import javax.persistence.Entity;

import jef.database.DataObject;
import jef.database.KeyFunction;
import jef.database.annotation.PartitionKey;
import jef.database.annotation.PartitionTable;
import jef.database.partition.ModulusFunction;

@Entity
@PartitionTable(key = {
		@PartitionKey(field = "createDate",function=KeyFunction.YEAR_MONTH),
		@PartitionKey(field = "customerNo",functionClass=ModulusFunction.class,
				  functionConstructorParams="3",isDbName=true,filler='D',length=2)
})
public class Customer extends DataObject {

	/**
	 * 客户端编号
	 */
    private int customerNo;
    /**
     * 出生日期
     */
    private Date DOB;
    /**
     * 死亡日期
     */
    private Date DOD;
    /**
     * 名
     */
    private String firstName;
    /**
     * 姓
     */
    private String lastName;
    /**
     * 电子邮件
     */
    private String email;
    /**
     * 记录创建日期
     */
    private Date createDate;

    public enum Field implements jef.database.Field {
        customerNo, DOB, DOD, firstName, lastName, email, createDate
    }
    
    public int getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date dOB) {
        DOB = dOB;
    }

    public Date getDOD() {
        return DOD;
    }

    public void setDOD(Date dOD) {
        DOD = dOD;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}