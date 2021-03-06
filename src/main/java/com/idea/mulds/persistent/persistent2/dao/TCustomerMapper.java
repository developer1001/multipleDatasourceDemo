package com.idea.mulds.persistent.persistent2.dao;

import com.idea.mulds.persistent.persistent2.entity.TCustomer;
import com.idea.mulds.persistent.persistent2.entity.TCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustomerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer
     *
     * @mbg.generated
     */
    long countByExample(TCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer
     *
     * @mbg.generated
     */
    int deleteByExample(TCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String customerid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer
     *
     * @mbg.generated
     */
    int insert(TCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer
     *
     * @mbg.generated
     */
    int insertSelective(TCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer
     *
     * @mbg.generated
     */
    List<TCustomer> selectByExample(TCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer
     *
     * @mbg.generated
     */
    TCustomer selectByPrimaryKey(String customerid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCustomer record, @Param("example") TCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCustomer record, @Param("example") TCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCustomer record);
}