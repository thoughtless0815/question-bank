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
import spl.question.bank.database.model.LearningOutcome;
import spl.question.bank.database.model.LearningOutcomeExample;

public interface LearningOutcomeMapper extends MapperMarker {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table learning_outcome
     *
     * @mbg.generated Thu Jun 27 18:56:46 BDT 2019
     */
    @SelectProvider(type=LearningOutcomeSqlProvider.class, method="countByExample")
    long countByExample(LearningOutcomeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table learning_outcome
     *
     * @mbg.generated Thu Jun 27 18:56:46 BDT 2019
     */
    @DeleteProvider(type=LearningOutcomeSqlProvider.class, method="deleteByExample")
    int deleteByExample(LearningOutcomeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table learning_outcome
     *
     * @mbg.generated Thu Jun 27 18:56:46 BDT 2019
     */
    @Delete({
        "delete from learning_outcome",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table learning_outcome
     *
     * @mbg.generated Thu Jun 27 18:56:46 BDT 2019
     */
    @Insert({
        "insert into learning_outcome (outcome, chapter_id)",
        "values (#{outcome,jdbcType=VARCHAR}, #{chapterId,jdbcType=INTEGER})"
    })
    @SelectKey(statement="select currval('learning_outcome_id_seq')", keyProperty="id", before=false, resultType=Integer.class)
    int insert(LearningOutcome record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table learning_outcome
     *
     * @mbg.generated Thu Jun 27 18:56:46 BDT 2019
     */
    @InsertProvider(type=LearningOutcomeSqlProvider.class, method="insertSelective")
    @SelectKey(statement="select currval('learning_outcome_id_seq')", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(LearningOutcome record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table learning_outcome
     *
     * @mbg.generated Thu Jun 27 18:56:46 BDT 2019
     */
    @SelectProvider(type=LearningOutcomeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="outcome", property="outcome", jdbcType=JdbcType.VARCHAR),
        @Result(column="chapter_id", property="chapterId", jdbcType=JdbcType.INTEGER)
    })
    List<LearningOutcome> selectByExample(LearningOutcomeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table learning_outcome
     *
     * @mbg.generated Thu Jun 27 18:56:46 BDT 2019
     */
    @Select({
        "select",
        "id, outcome, chapter_id",
        "from learning_outcome",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="outcome", property="outcome", jdbcType=JdbcType.VARCHAR),
        @Result(column="chapter_id", property="chapterId", jdbcType=JdbcType.INTEGER)
    })
    LearningOutcome selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table learning_outcome
     *
     * @mbg.generated Thu Jun 27 18:56:46 BDT 2019
     */
    @UpdateProvider(type=LearningOutcomeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") LearningOutcome record, @Param("example") LearningOutcomeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table learning_outcome
     *
     * @mbg.generated Thu Jun 27 18:56:46 BDT 2019
     */
    @UpdateProvider(type=LearningOutcomeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") LearningOutcome record, @Param("example") LearningOutcomeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table learning_outcome
     *
     * @mbg.generated Thu Jun 27 18:56:46 BDT 2019
     */
    @UpdateProvider(type=LearningOutcomeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LearningOutcome record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table learning_outcome
     *
     * @mbg.generated Thu Jun 27 18:56:46 BDT 2019
     */
    @Update({
        "update learning_outcome",
        "set outcome = #{outcome,jdbcType=VARCHAR},",
          "chapter_id = #{chapterId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LearningOutcome record);
}