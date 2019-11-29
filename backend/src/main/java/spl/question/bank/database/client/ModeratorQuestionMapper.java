package spl.question.bank.database.client;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import spl.question.bank.database.MapperMarker;
import spl.question.bank.database.model.ModeratorQuestion;
import spl.question.bank.database.model.ModeratorQuestionExample;

public interface ModeratorQuestionMapper extends MapperMarker {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table moderator_question
     *
     * @mbg.generated Fri Nov 29 22:44:46 BDT 2019
     */
    @SelectProvider(type=ModeratorQuestionSqlProvider.class, method="countByExample")
    long countByExample(ModeratorQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table moderator_question
     *
     * @mbg.generated Fri Nov 29 22:44:46 BDT 2019
     */
    @DeleteProvider(type=ModeratorQuestionSqlProvider.class, method="deleteByExample")
    int deleteByExample(ModeratorQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table moderator_question
     *
     * @mbg.generated Fri Nov 29 22:44:46 BDT 2019
     */
    @Delete({
        "delete from moderator_question",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table moderator_question
     *
     * @mbg.generated Fri Nov 29 22:44:46 BDT 2019
     */
    @Insert({
        "insert into moderator_question (question_id, question_type, ",
        "moderator_id, assigned_date)",
        "values (#{questionId,jdbcType=INTEGER}, #{questionType,jdbcType=VARCHAR}, ",
        "#{moderatorId,jdbcType=INTEGER}, #{assignedDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="select currval('moderator_question_id_seq')", keyProperty="id", before=false, resultType=Integer.class)
    int insert(ModeratorQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table moderator_question
     *
     * @mbg.generated Fri Nov 29 22:44:46 BDT 2019
     */
    @InsertProvider(type=ModeratorQuestionSqlProvider.class, method="insertSelective")
    @SelectKey(statement="select currval('moderator_question_id_seq')", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(ModeratorQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table moderator_question
     *
     * @mbg.generated Fri Nov 29 22:44:46 BDT 2019
     */
    @SelectProvider(type=ModeratorQuestionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="question_id", property="questionId", jdbcType=JdbcType.INTEGER),
        @Result(column="question_type", property="questionType", jdbcType=JdbcType.VARCHAR),
        @Result(column="moderator_id", property="moderatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="assigned_date", property="assignedDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ModeratorQuestion> selectByExample(ModeratorQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table moderator_question
     *
     * @mbg.generated Fri Nov 29 22:44:46 BDT 2019
     */
    @Select({
        "select",
        "id, question_id, question_type, moderator_id, assigned_date",
        "from moderator_question",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="question_id", property="questionId", jdbcType=JdbcType.INTEGER),
        @Result(column="question_type", property="questionType", jdbcType=JdbcType.VARCHAR),
        @Result(column="moderator_id", property="moderatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="assigned_date", property="assignedDate", jdbcType=JdbcType.TIMESTAMP)
    })
    ModeratorQuestion selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table moderator_question
     *
     * @mbg.generated Fri Nov 29 22:44:46 BDT 2019
     */
    @UpdateProvider(type=ModeratorQuestionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ModeratorQuestion record, @Param("example") ModeratorQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table moderator_question
     *
     * @mbg.generated Fri Nov 29 22:44:46 BDT 2019
     */
    @UpdateProvider(type=ModeratorQuestionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ModeratorQuestion record, @Param("example") ModeratorQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table moderator_question
     *
     * @mbg.generated Fri Nov 29 22:44:46 BDT 2019
     */
    @UpdateProvider(type=ModeratorQuestionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ModeratorQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table moderator_question
     *
     * @mbg.generated Fri Nov 29 22:44:46 BDT 2019
     */
    @Update({
        "update moderator_question",
        "set question_id = #{questionId,jdbcType=INTEGER},",
          "question_type = #{questionType,jdbcType=VARCHAR},",
          "moderator_id = #{moderatorId,jdbcType=INTEGER},",
          "assigned_date = #{assignedDate,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ModeratorQuestion record);
}