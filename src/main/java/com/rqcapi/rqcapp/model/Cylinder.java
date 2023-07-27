package com.rqcapi.rqcapp.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




import java.sql.Timestamp;



@Entity
@Table(name = "RQCCylinder")
public class Cylinder {
   

    @Id 
    private Timestamp ts; 
    @Column(name="timeVal", nullable = false)
    private Double  timeVal;
    @Column(name="serialNo", nullable = false)
    private String serialNo;
    @Column(name="cylinderType", nullable = false)
    private Integer cylinderType;
    @Column(name="vldValue", nullable = true)
    private Double vldValue  ;
    @Column(name="oldValue", nullable = true)
    private Double oldValue;
    @Column(name="grossWeight", nullable = false)
    private Double grossWeight;
    @Column(name="tareWeight", nullable = false)
    private Double tareWeight;
    @Column(name="vldResultFlag", nullable = true)
    private Integer vldResultFlag;
    @Column(name="oldResultFlag", nullable = true)
    private Integer oldResultFlag;
    @Column(name="grossWeightResultFlag", nullable = true)
    private Integer grossWeightResultFlag;
    @Column(name="carousel", nullable = true)
    private Integer carousel;
    @Column(name="resultFlag", nullable = false)
    private Integer resultFlag;
    @Column(name="stDueDate", nullable = false)
    private String stDueDate;
    @Column(name="remark", nullable = true) 
    private String remark; 

    @Column(name="bungLeak", nullable = true) 
    private Integer bungLeak; 
    
    @Column(name="bodyLeak", nullable = true) 
    private Integer bodyLeak; 
    @Column(name="netWeight", nullable = false) 
    private Double netWeight; 
    
    public Cylinder(){
        
    }
    public Cylinder(Timestamp ts,Double timeVal, String serialNo, Integer cylinderType, Double vldValue, Double oldValue, Double grossWeight, Double tareWeight, Integer vldResultFlag, Integer oldResultFlag, Integer grossWeightResultFlag, Integer carousel, Integer resultFlag, String stDueDate, String remark,Integer bungLeak,Integer bodyLeak,Double netWeight) {
        this.ts=ts;
        this.timeVal = timeVal;
        this.serialNo = serialNo;
        this.cylinderType = cylinderType;
        this.vldValue = vldValue;
        this.oldValue = oldValue;
        this.grossWeight = grossWeight;
        this.tareWeight = tareWeight;
        this.vldResultFlag = vldResultFlag;
        this.oldResultFlag = oldResultFlag;
        this.grossWeightResultFlag = grossWeightResultFlag;
        this.carousel = carousel;
        this.resultFlag = resultFlag;
        this.stDueDate = stDueDate;

        this.remark = remark;
        this.bungLeak=bungLeak;
        this.bodyLeak=bodyLeak;
        this.netWeight=netWeight;
    }
    public void setTimeVal(Double timeVal) {
        this.timeVal = timeVal;
    }
    
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
    
    public void setCylinderType(Integer cylinderType) {
        this.cylinderType = cylinderType;
    }
    
    public void setVldValue(Double vldValue) {
        this.vldValue = vldValue;
    }
    
    public void setOldValue(Double oldValue) {
        this.oldValue =  oldValue;
    }
    
    public void setGrossWeight(Double grossWeight) {
        this.grossWeight =  grossWeight;
    }
    
    public void setTareWeight(Double tareWeight) {
        this.tareWeight = tareWeight;
    }
    
    public void setVldResultFlag(Integer vldResultFlag) {
        this.vldResultFlag =  vldResultFlag;
    }
    
    public void setOldResultFlag(Integer oldResultFlag) {
        this.oldResultFlag = oldResultFlag;
    }
    
    public void setGrossWeightResultFlag(Integer grossWeightResultFlag) {
        this.grossWeightResultFlag = grossWeightResultFlag;
    }
    
    public void setCarousel(Integer carousel) {
        this.carousel = carousel;
    }
    
    public void setResultFlag(Integer resultFlag) {
        this.resultFlag =resultFlag;
    }
    
    public void setStDueDate(String stDueDate) {
        this.stDueDate = stDueDate;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Timestamp getTS() {
        return this.ts;
    }
    
    public Double getTimeVal() {
        return this.timeVal;
    }
    
    public String getSerialNo() {
        return this.serialNo;
    }
    
    public Integer getCylinderType() {
        return this.cylinderType;
    }
    
    public Double getVldValue() {
        return this.vldValue;
    }
    
    public Double getOldValue() {
        return this.oldValue;
    }
    
    public Double getGrossWeight() {
        return this.grossWeight;
    }
    
    public Double getTareWeight() {
        return this.tareWeight;
    }
    
    public Integer getVldResultFlag() {
        return this.vldResultFlag;
    }
    
    public Integer getOldResultFlag() {
        return this.oldResultFlag;
    }
    
    public Integer getGrossWeightResultFlag() {
        return this.grossWeightResultFlag;
    }
    
    public Integer getCarousel() {
        return this.carousel;
    }
    
    public Integer getResultFlag() {
        return this.resultFlag;
    }
    
    public String getStDueDate() {
        return this.stDueDate;
    }
    
    public String getRemark() {
        return this.remark;
    }    
    public Integer getBungLeak() {
        return this.bungLeak;
    }
    public Integer getBodyLeak() {
        return this.bodyLeak;
    }
    public Double getNetWeight() {
        return this.netWeight;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Timestamp: ").append(ts).append(" , ");
        sb.append("Time Value: ").append(timeVal).append(" , ");
        sb.append("Serial Number: ").append(serialNo).append(" , ");
        sb.append("Cylinder Type: ").append(cylinderType).append(" , ");
        sb.append("VLD Value: ").append(vldValue).append(" , ");
        sb.append("Old Value: ").append(oldValue).append(" , ");
        sb.append("Gross Weight: ").append(grossWeight).append(" , ");
        sb.append("Tare Weight: ").append(tareWeight).append(" , ");
        sb.append("VLD Result Flag: ").append(vldResultFlag).append(" , ");
        sb.append("Old Result Flag: ").append(oldResultFlag).append(" , ");
        sb.append("Gross Weight Result Flag: ").append(grossWeightResultFlag).append(" , ");
        sb.append("Carousel: ").append(carousel).append(" , ");
        sb.append("Result Flag: ").append(resultFlag).append(" , ");
        sb.append("ST Due Date: ").append(stDueDate).append(" , ");
        sb.append("Remark: ").append(remark).append(" , ");
        sb.append("Bung Leak: ").append(bungLeak).append(" , ");
        sb.append("Body Leak: ").append(bodyLeak).append(" , ");
        sb.append("Net Weight: ").append(netWeight).append(" , ");
        return sb.toString();
    }
}
