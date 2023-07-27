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
    @Column(name="vldValue", nullable = false)
    private Double vldValue  ;
    @Column(name="oldValue", nullable = false)
    private Double oldValue;
    @Column(name="grossWeight", nullable = false)
    private Double grossWeight;
    @Column(name="tareWeight", nullable = false)
    private Double tareWeight;
    @Column(name="vldResultFlag", nullable = false)
    private Integer vldResultFlag;
    @Column(name="oldResultFlag", nullable = false)
    private Integer oldResultFlag;
    @Column(name="grossWeightResultFlag", nullable = false)
    private Integer grossWeightResultFlag;
    @Column(name="carousel", nullable = false)
    private Integer carousel;
    @Column(name="resultFlag", nullable = false)
    private Integer resultFlag;
    @Column(name="stDueDate", nullable = false)
    private String stDueDate;
    @Column(name="remark", nullable = false) 
    private String remark; 
    
    public Cylinder(){
        
    }
    public Cylinder(Timestamp ts,Double timeVal, String serialNo, Integer cylinderType, Double vldValue, Double oldValue, Double grossWeight, Double tareWeight, Integer vldResultFlag, Integer oldResultFlag, Integer grossWeightResultFlag, Integer carousel, Integer resultFlag, String stDueDate, String remark) {
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
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Timestamp: ").append(ts).append("\n");
        sb.append("Time Value: ").append(timeVal).append("\n");
        sb.append("Serial Number: ").append(serialNo).append("\n");
        sb.append("Cylinder Type: ").append(cylinderType).append("\n");
        sb.append("VLD Value: ").append(vldValue).append("\n");
        sb.append("Old Value: ").append(oldValue).append("\n");
        sb.append("Gross Weight: ").append(grossWeight).append("\n");
        sb.append("Tare Weight: ").append(tareWeight).append("\n");
        sb.append("VLD Result Flag: ").append(vldResultFlag).append("\n");
        sb.append("Old Result Flag: ").append(oldResultFlag).append("\n");
        sb.append("Gross Weight Result Flag: ").append(grossWeightResultFlag).append("\n");
        sb.append("Carousel: ").append(carousel).append("\n");
        sb.append("Result Flag: ").append(resultFlag).append("\n");
        sb.append("ST Due Date: ").append(stDueDate).append("\n");
        sb.append("Remark: ").append(remark).append("\n");
        return sb.toString();
    }
}
