package com.oyj.dao;

import com.oyj.pojo.Notice;

public interface NoticeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice_inf
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice_inf
     *
     * @mbggenerated
     */
    int insert(Notice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice_inf
     *
     * @mbggenerated
     */
    int insertSelective(Notice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice_inf
     *
     * @mbggenerated
     */
    Notice selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice_inf
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Notice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice_inf
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Notice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice_inf
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Notice record);
}