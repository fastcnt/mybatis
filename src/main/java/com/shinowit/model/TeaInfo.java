package com.shinowit.model;

import java.io.Serializable;

public class TeaInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tea_info.tea_id
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    private String teaId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tea_info.tea_name
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    private String teaName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tea_info
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tea_info.tea_id
     *
     * @return the value of tea_info.tea_id
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    public String getTeaId() {
        return teaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tea_info.tea_id
     *
     * @param teaId the value for tea_info.tea_id
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    public void setTeaId(String teaId) {
        this.teaId = teaId == null ? null : teaId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tea_info.tea_name
     *
     * @return the value of tea_info.tea_name
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    public String getTeaName() {
        return teaName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tea_info.tea_name
     *
     * @param teaName the value for tea_info.tea_name
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    public void setTeaName(String teaName) {
        this.teaName = teaName == null ? null : teaName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tea_info
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TeaInfo other = (TeaInfo) that;
        return (this.getTeaId() == null ? other.getTeaId() == null : this.getTeaId().equals(other.getTeaId()))
            && (this.getTeaName() == null ? other.getTeaName() == null : this.getTeaName().equals(other.getTeaName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tea_info
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTeaId() == null) ? 0 : getTeaId().hashCode());
        result = prime * result + ((getTeaName() == null) ? 0 : getTeaName().hashCode());
        return result;
    }
}