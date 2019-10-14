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
import spl.question.bank.database.handler.JsonTypeHandler;
import spl.question.bank.database.model.MCQQuestion;
import spl.question.bank.database.model.MCQQuestionExample;

public interface MCQQuestionMapper extends MapperMarker {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mcq_question
     *
     * @mbg.generated Mon Oct 14 12:58:51 BDT 2019
     */
    @SelectProvider(type=MCQQuestionSqlProvider.class, method="countByExample")
    long countByExample(MCQQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mcq_question
     *
     * @mbg.generated Mon Oct 14 12:58:51 BDT 2019
     */
    @DeleteProvider(type=MCQQuestionSqlProvider.class, method="deleteByExample")
    int deleteByExample(MCQQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mcq_question
     *
     * @mbg.generated Mon Oct 14 12:58:51 BDT 2019
     */
    @Delete({
        "delete from mcq_question",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mcq_question
     *
     * @mbg.generated Mon Oct 14 12:58:51 BDT 2019
     */
    @Insert({
        "insert into mcq_question (type, base_question, ",
        "weight, created_by, ",
        "subject_id, chapter_id, ",
        "created_at, approved_at, ",
        "approved_by, status)",
        "values (#{type,jdbcType=VARCHAR}, #{baseQuestion,jdbcType=OTHER,typeHandler=spl.question.bank.database.handler.JsonTypeHandler}, ",
        "#{weight,jdbcType=INTEGER}, #{createdBy,jdbcType=INTEGER}, ",
        "#{subjectId,jdbcType=INTEGER}, #{chapterId,jdbcType=INTEGER}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{approvedAt,jdbcType=TIMESTAMP}, ",
        "#{approvedBy,jdbcType=INTEGER}, #{status,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="select currval('mcq_question_id_seq')", keyProperty="id", before=false, resultType=Integer.class)
    int insert(MCQQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mcq_question
     *
     * @mbg.generated Mon Oct 14 12:58:51 BDT 2019
     */
    @InsertProvider(type=MCQQuestionSqlProvider.class, method="insertSelective")
    @SelectKey(statement="select currval('mcq_question_id_seq')", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(MCQQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mcq_question
     *
     * @mbg.generated Mon Oct 14 12:58:51 BDT 2019
     */
    @SelectProvider(type=MCQQuestionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="base_question", property="baseQuestion", typeHandler=JsonTypeHandler.class, jdbcType=JdbcType.OTHER),
        @Result(column="weight", property="weight", jdbcType=JdbcType.INTEGER),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.INTEGER),
        @Result(column="subject_id", property="subjectId", jdbcType=JdbcType.INTEGER),
        @Result(column="chapter_id", property="chapterId", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="approved_at", property="approvedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="approved_by", property="approvedBy", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR)
    })
    List<MCQQuestion> selectByExample(MCQQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mcq_question
     *
     * @mbg.generated Mon Oct 14 12:58:51 BDT 2019
     */
    @Select({
        "select",
        "id, type, base_question, weight, created_by, subject_id, chapter_id, created_at, ",
        "approved_at, approved_by, status",
        "from mcq_question",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="base_question", property="baseQuestion", typeHandler=JsonTypeHandler.class, jdbcType=JdbcType.OTHER),
        @Result(column="weight", property="weight", jdbcType=JdbcType.INTEGER),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.INTEGER),
        @Result(column="subject_id", property="subjectId", jdbcType=JdbcType.INTEGER),
        @Result(column="chapter_id", property="chapterId", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="approved_at", property="approvedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="approved_by", property="approvedBy", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR)
    })
    MCQQuestion selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mcq_question
     *
     * @mbg.generated Mon Oct 14 12:58:51 BDT 2019
     */
    @UpdateProvider(type=MCQQuestionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MCQQuestion record, @Param("example") MCQQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mcq_question
     *
     * @mbg.generated Mon Oct 14 12:58:51 BDT 2019
     */
    @UpdateProvider(type=MCQQuestionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MCQQuestion record, @Param("example") MCQQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mcq_question
     *
     * @mbg.generated Mon Oct 14 12:58:51 BDT 2019
     */
    @UpdateProvider(type=MCQQuestionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MCQQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mcq_question
     *
     * @mbg.generated Mon Oct 14 12:58:51 BDT 2019
     */
    @Update({
        "update mcq_question",
        "set type = #{type,jdbcType=VARCHAR},",
          "base_question = #{baseQuestion,jdbcType=OTHER,typeHandler=spl.question.bank.database.handler.JsonTypeHandler},",
          "weight = #{weight,jdbcType=INTEGER},",
          "created_by = #{createdBy,jdbcType=INTEGER},",
          "subject_id = #{subjectId,jdbcType=INTEGER},",
          "chapter_id = #{chapterId,jdbcType=INTEGER},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "approved_at = #{approvedAt,jdbcType=TIMESTAMP},",
          "approved_by = #{approvedBy,jdbcType=INTEGER},",
          "status = #{status,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MCQQuestion record);
}