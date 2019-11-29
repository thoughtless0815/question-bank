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
import spl.question.bank.database.model.QuestionPaperQuestion;
import spl.question.bank.database.model.QuestionPaperQuestionExample;

public interface QuestionPaperQuestionMapper extends MapperMarker {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper_question
     *
     * @mbg.generated Fri Nov 29 22:44:46 BDT 2019
     */
    @SelectProvider(type=QuestionPaperQuestionSqlProvider.class, method="countByExample")
    long countByExample(QuestionPaperQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper_question
     *
     * @mbg.generated Fri Nov 29 22:44:46 BDT 2019
     */
    @DeleteProvider(type=QuestionPaperQuestionSqlProvider.class, method="deleteByExample")
    int deleteByExample(QuestionPaperQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper_question
     *
     * @mbg.generated Fri Nov 29 22:44:46 BDT 2019
     */
    @Delete({
        "delete from question_paper_question",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper_question
     *
     * @mbg.generated Fri Nov 29 22:44:46 BDT 2019
     */
    @Insert({
        "insert into question_paper_question (question_paper_id, question_id)",
        "values (#{questionPaperId,jdbcType=INTEGER}, #{questionId,jdbcType=INTEGER})"
    })
    @SelectKey(statement="select currval('question_paper_question_id_seq')", keyProperty="id", before=false, resultType=Integer.class)
    int insert(QuestionPaperQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper_question
     *
     * @mbg.generated Fri Nov 29 22:44:46 BDT 2019
     */
    @InsertProvider(type=QuestionPaperQuestionSqlProvider.class, method="insertSelective")
    @SelectKey(statement="select currval('question_paper_question_id_seq')", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(QuestionPaperQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper_question
     *
     * @mbg.generated Fri Nov 29 22:44:46 BDT 2019
     */
    @SelectProvider(type=QuestionPaperQuestionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="question_paper_id", property="questionPaperId", jdbcType=JdbcType.INTEGER),
        @Result(column="question_id", property="questionId", jdbcType=JdbcType.INTEGER)
    })
    List<QuestionPaperQuestion> selectByExample(QuestionPaperQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper_question
     *
     * @mbg.generated Fri Nov 29 22:44:46 BDT 2019
     */
    @Select({
        "select",
        "id, question_paper_id, question_id",
        "from question_paper_question",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="question_paper_id", property="questionPaperId", jdbcType=JdbcType.INTEGER),
        @Result(column="question_id", property="questionId", jdbcType=JdbcType.INTEGER)
    })
    QuestionPaperQuestion selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper_question
     *
     * @mbg.generated Fri Nov 29 22:44:46 BDT 2019
     */
    @UpdateProvider(type=QuestionPaperQuestionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") QuestionPaperQuestion record, @Param("example") QuestionPaperQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper_question
     *
     * @mbg.generated Fri Nov 29 22:44:46 BDT 2019
     */
    @UpdateProvider(type=QuestionPaperQuestionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") QuestionPaperQuestion record, @Param("example") QuestionPaperQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper_question
     *
     * @mbg.generated Fri Nov 29 22:44:46 BDT 2019
     */
    @UpdateProvider(type=QuestionPaperQuestionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(QuestionPaperQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper_question
     *
     * @mbg.generated Fri Nov 29 22:44:46 BDT 2019
     */
    @Update({
        "update question_paper_question",
        "set question_paper_id = #{questionPaperId,jdbcType=INTEGER},",
          "question_id = #{questionId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(QuestionPaperQuestion record);
}