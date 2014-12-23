package com.shinowit.dao.mapper;

import com.shinowit.model.TeaInfo;
import com.shinowit.model.TeaInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeaInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tea_info
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    int countByExample(TeaInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tea_info
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    int deleteByExample(TeaInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tea_info
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    int deleteByPrimaryKey(String teaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tea_info
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    int insert(TeaInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tea_info
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    int insertSelective(TeaInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tea_info
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    List<TeaInfo> selectByExample(TeaInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tea_info
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    TeaInfo selectByPrimaryKey(String teaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tea_info
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    int updateByExampleSelective(@Param("record") TeaInfo record, @Param("example") TeaInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tea_info
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    int updateByExample(@Param("record") TeaInfo record, @Param("example") TeaInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tea_info
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    int updateByPrimaryKeySelective(TeaInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tea_info
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    int updateByPrimaryKey(TeaInfo record);

    List<TeaInfo> selectPage(TeaInfoExample example);

    String selectMaxPrimaryKeyValue();
}