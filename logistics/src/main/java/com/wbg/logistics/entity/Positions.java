package com.wbg.logistics.entity;

import java.util.Date;

public class Positions {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column positions.pos_id
     *
     * @mbg.generated
     */
    private Integer posId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column positions.waybill_no
     *
     * @mbg.generated
     */
    private String waybillNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column positions.p_time
     *
     * @mbg.generated
     */
    private Date pTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column positions.p_position
     *
     * @mbg.generated
     */
    private String pPosition;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column positions.pos_id
     *
     * @return the value of positions.pos_id
     *
     * @mbg.generated
     */
    public Integer getPosId() {
        return posId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column positions.pos_id
     *
     * @param posId the value for positions.pos_id
     *
     * @mbg.generated
     */
    public void setPosId(Integer posId) {
        this.posId = posId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column positions.waybill_no
     *
     * @return the value of positions.waybill_no
     *
     * @mbg.generated
     */
    public String getWaybillNo() {
        return waybillNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column positions.waybill_no
     *
     * @param waybillNo the value for positions.waybill_no
     *
     * @mbg.generated
     */
    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo == null ? null : waybillNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column positions.p_time
     *
     * @return the value of positions.p_time
     *
     * @mbg.generated
     */
    public Date getpTime() {
        return pTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column positions.p_time
     *
     * @param pTime the value for positions.p_time
     *
     * @mbg.generated
     */
    public void setpTime(Date pTime) {
        this.pTime = pTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column positions.p_position
     *
     * @return the value of positions.p_position
     *
     * @mbg.generated
     */
    public String getpPosition() {
        return pPosition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column positions.p_position
     *
     * @param pPosition the value for positions.p_position
     *
     * @mbg.generated
     */
    public void setpPosition(String pPosition) {
        this.pPosition = pPosition == null ? null : pPosition.trim();
    }
}