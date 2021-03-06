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
import spl.question.bank.database.model.QuestionPaper;
import spl.question.bank.database.model.QuestionPaperExample;

public interface QuestionPaperMapper extends MapperMarker {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    @SelectProvider(type=QuestionPaperSqlProvider.class, method="countByExample")
    long countByExample(QuestionPaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    @DeleteProvider(type=QuestionPaperSqlProvider.class, method="deleteByExample")
    int deleteByExample(QuestionPaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    @Delete({
        "delete from question_paper",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    @Insert({
        "insert into question_paper (type, subject_id, ",
        "created_at, generated_by, ",
        "exam_type, duration, ",
        "institute_name, total_marks)",
        "values (#{type,jdbcType=VARCHAR}, #{subjectId,jdbcType=INTEGER}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{generatedBy,jdbcType=INTEGER}, ",
        "#{examType,jdbcType=VARCHAR}, #{duration,jdbcType=VARCHAR}, ",
        "#{instituteName,jdbcType=VARCHAR}, #{totalMarks,jdbcType=INTEGER})"
    })
    @SelectKey(statement="select currval('question_paper_id_seq')", keyProperty="id", before=false, resultType=Integer.class)
    int insert(QuestionPaper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    @InsertProvider(type=QuestionPaperSqlProvider.class, method="insertSelective")
    @SelectKey(statement="select currval('question_paper_id_seq')", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(QuestionPaper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    @SelectProvider(type=QuestionPaperSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="subject_id", property="subjectId", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="generated_by", property="generatedBy", jdbcType=JdbcType.INTEGER),
        @Result(column="exam_type", property="examType", jdbcType=JdbcType.VARCHAR),
        @Result(column="duration", property="duration", jdbcType=JdbcType.VARCHAR),
        @Result(column="institute_name", property="instituteName", jdbcType=JdbcType.VARCHAR),
        @Result(column="total_marks", property="totalMarks", jdbcType=JdbcType.INTEGER)
    })
    List<QuestionPaper> selectByExample(QuestionPaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    @Select({
        "select",
        "id, type, subject_id, created_at, generated_by, exam_type, duration, institute_name, ",
        "total_marks",
        "from question_paper",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="subject_id", property="subjectId", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="generated_by", property="generatedBy", jdbcType=JdbcType.INTEGER),
        @Result(column="exam_type", property="examType", jdbcType=JdbcType.VARCHAR),
        @Result(column="duration", property="duration", jdbcType=JdbcType.VARCHAR),
        @Result(column="institute_name", property="instituteName", jdbcType=JdbcType.VARCHAR),
        @Result(column="total_marks", property="totalMarks", jdbcType=JdbcType.INTEGER)
    })
    QuestionPaper selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    @UpdateProvider(type=QuestionPaperSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") QuestionPaper record, @Param("example") QuestionPaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    @UpdateProvider(type=QuestionPaperSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") QuestionPaper record, @Param("example") QuestionPaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    @UpdateProvider(type=QuestionPaperSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(QuestionPaper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    @Update({
        "update question_paper",
        "set type = #{type,jdbcType=VARCHAR},",
          "subject_id = #{subjectId,jdbcType=INTEGER},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "generated_by = #{generatedBy,jdbcType=INTEGER},",
          "exam_type = #{examType,jdbcType=VARCHAR},",
          "duration = #{duration,jdbcType=VARCHAR},",
          "institute_name = #{instituteName,jdbcType=VARCHAR},",
          "total_marks = #{totalMarks,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(QuestionPaper record);
}