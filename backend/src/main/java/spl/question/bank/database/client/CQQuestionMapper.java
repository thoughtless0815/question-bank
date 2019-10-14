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
import spl.question.bank.database.model.CQQuestion;
import spl.question.bank.database.model.CQQuestionExample;

public interface CQQuestionMapper extends MapperMarker {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cq_question
     *
     * @mbg.generated Mon Oct 14 12:58:51 BDT 2019
     */
    @SelectProvider(type=CQQuestionSqlProvider.class, method="countByExample")
    long countByExample(CQQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cq_question
     *
     * @mbg.generated Mon Oct 14 12:58:51 BDT 2019
     */
    @DeleteProvider(type=CQQuestionSqlProvider.class, method="deleteByExample")
    int deleteByExample(CQQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cq_question
     *
     * @mbg.generated Mon Oct 14 12:58:51 BDT 2019
     */
    @Delete({
        "delete from cq_question",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cq_question
     *
     * @mbg.generated Mon Oct 14 12:58:51 BDT 2019
     */
    @Insert({
        "insert into cq_question (stem, knowledge_based, ",
        "understanding_based, application_based, ",
        "higher_ability, weight, ",
        "created_by, subject_id, ",
        "chapter_id, created_at, ",
        "approved_at, approved_by, ",
        "status)",
        "values (#{stem,jdbcType=VARCHAR}, #{knowledgeBased,jdbcType=VARCHAR}, ",
        "#{understandingBased,jdbcType=VARCHAR}, #{applicationBased,jdbcType=VARCHAR}, ",
        "#{higherAbility,jdbcType=VARCHAR}, #{weight,jdbcType=INTEGER}, ",
        "#{createdBy,jdbcType=INTEGER}, #{subjectId,jdbcType=INTEGER}, ",
        "#{chapterId,jdbcType=INTEGER}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{approvedAt,jdbcType=TIMESTAMP}, #{approvedBy,jdbcType=INTEGER}, ",
        "#{status,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="select currval('cq_question_id_seq')", keyProperty="id", before=false, resultType=Integer.class)
    int insert(CQQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cq_question
     *
     * @mbg.generated Mon Oct 14 12:58:51 BDT 2019
     */
    @InsertProvider(type=CQQuestionSqlProvider.class, method="insertSelective")
    @SelectKey(statement="select currval('cq_question_id_seq')", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(CQQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cq_question
     *
     * @mbg.generated Mon Oct 14 12:58:51 BDT 2019
     */
    @SelectProvider(type=CQQuestionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="stem", property="stem", jdbcType=JdbcType.VARCHAR),
        @Result(column="knowledge_based", property="knowledgeBased", jdbcType=JdbcType.VARCHAR),
        @Result(column="understanding_based", property="understandingBased", jdbcType=JdbcType.VARCHAR),
        @Result(column="application_based", property="applicationBased", jdbcType=JdbcType.VARCHAR),
        @Result(column="higher_ability", property="higherAbility", jdbcType=JdbcType.VARCHAR),
        @Result(column="weight", property="weight", jdbcType=JdbcType.INTEGER),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.INTEGER),
        @Result(column="subject_id", property="subjectId", jdbcType=JdbcType.INTEGER),
        @Result(column="chapter_id", property="chapterId", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="approved_at", property="approvedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="approved_by", property="approvedBy", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR)
    })
    List<CQQuestion> selectByExample(CQQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cq_question
     *
     * @mbg.generated Mon Oct 14 12:58:51 BDT 2019
     */
    @Select({
        "select",
        "id, stem, knowledge_based, understanding_based, application_based, higher_ability, ",
        "weight, created_by, subject_id, chapter_id, created_at, approved_at, approved_by, ",
        "status",
        "from cq_question",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="stem", property="stem", jdbcType=JdbcType.VARCHAR),
        @Result(column="knowledge_based", property="knowledgeBased", jdbcType=JdbcType.VARCHAR),
        @Result(column="understanding_based", property="understandingBased", jdbcType=JdbcType.VARCHAR),
        @Result(column="application_based", property="applicationBased", jdbcType=JdbcType.VARCHAR),
        @Result(column="higher_ability", property="higherAbility", jdbcType=JdbcType.VARCHAR),
        @Result(column="weight", property="weight", jdbcType=JdbcType.INTEGER),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.INTEGER),
        @Result(column="subject_id", property="subjectId", jdbcType=JdbcType.INTEGER),
        @Result(column="chapter_id", property="chapterId", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="approved_at", property="approvedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="approved_by", property="approvedBy", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR)
    })
    CQQuestion selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cq_question
     *
     * @mbg.generated Mon Oct 14 12:58:51 BDT 2019
     */
    @UpdateProvider(type=CQQuestionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CQQuestion record, @Param("example") CQQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cq_question
     *
     * @mbg.generated Mon Oct 14 12:58:51 BDT 2019
     */
    @UpdateProvider(type=CQQuestionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CQQuestion record, @Param("example") CQQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cq_question
     *
     * @mbg.generated Mon Oct 14 12:58:51 BDT 2019
     */
    @UpdateProvider(type=CQQuestionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CQQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cq_question
     *
     * @mbg.generated Mon Oct 14 12:58:51 BDT 2019
     */
    @Update({
        "update cq_question",
        "set stem = #{stem,jdbcType=VARCHAR},",
          "knowledge_based = #{knowledgeBased,jdbcType=VARCHAR},",
          "understanding_based = #{understandingBased,jdbcType=VARCHAR},",
          "application_based = #{applicationBased,jdbcType=VARCHAR},",
          "higher_ability = #{higherAbility,jdbcType=VARCHAR},",
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
    int updateByPrimaryKey(CQQuestion record);
}