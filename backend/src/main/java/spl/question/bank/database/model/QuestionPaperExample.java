package spl.question.bank.database.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionPaperExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    public QuestionPaperExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Integer value) {
            addCriterion("subject_id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Integer value) {
            addCriterion("subject_id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Integer value) {
            addCriterion("subject_id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Integer value) {
            addCriterion("subject_id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Integer> values) {
            addCriterion("subject_id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Integer> values) {
            addCriterion("subject_id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andGeneratedByIsNull() {
            addCriterion("generated_by is null");
            return (Criteria) this;
        }

        public Criteria andGeneratedByIsNotNull() {
            addCriterion("generated_by is not null");
            return (Criteria) this;
        }

        public Criteria andGeneratedByEqualTo(Integer value) {
            addCriterion("generated_by =", value, "generatedBy");
            return (Criteria) this;
        }

        public Criteria andGeneratedByNotEqualTo(Integer value) {
            addCriterion("generated_by <>", value, "generatedBy");
            return (Criteria) this;
        }

        public Criteria andGeneratedByGreaterThan(Integer value) {
            addCriterion("generated_by >", value, "generatedBy");
            return (Criteria) this;
        }

        public Criteria andGeneratedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("generated_by >=", value, "generatedBy");
            return (Criteria) this;
        }

        public Criteria andGeneratedByLessThan(Integer value) {
            addCriterion("generated_by <", value, "generatedBy");
            return (Criteria) this;
        }

        public Criteria andGeneratedByLessThanOrEqualTo(Integer value) {
            addCriterion("generated_by <=", value, "generatedBy");
            return (Criteria) this;
        }

        public Criteria andGeneratedByIn(List<Integer> values) {
            addCriterion("generated_by in", values, "generatedBy");
            return (Criteria) this;
        }

        public Criteria andGeneratedByNotIn(List<Integer> values) {
            addCriterion("generated_by not in", values, "generatedBy");
            return (Criteria) this;
        }

        public Criteria andGeneratedByBetween(Integer value1, Integer value2) {
            addCriterion("generated_by between", value1, value2, "generatedBy");
            return (Criteria) this;
        }

        public Criteria andGeneratedByNotBetween(Integer value1, Integer value2) {
            addCriterion("generated_by not between", value1, value2, "generatedBy");
            return (Criteria) this;
        }

        public Criteria andExamTypeIsNull() {
            addCriterion("exam_type is null");
            return (Criteria) this;
        }

        public Criteria andExamTypeIsNotNull() {
            addCriterion("exam_type is not null");
            return (Criteria) this;
        }

        public Criteria andExamTypeEqualTo(String value) {
            addCriterion("exam_type =", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeNotEqualTo(String value) {
            addCriterion("exam_type <>", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeGreaterThan(String value) {
            addCriterion("exam_type >", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeGreaterThanOrEqualTo(String value) {
            addCriterion("exam_type >=", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeLessThan(String value) {
            addCriterion("exam_type <", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeLessThanOrEqualTo(String value) {
            addCriterion("exam_type <=", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeLike(String value) {
            addCriterion("exam_type like", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeNotLike(String value) {
            addCriterion("exam_type not like", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeIn(List<String> values) {
            addCriterion("exam_type in", values, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeNotIn(List<String> values) {
            addCriterion("exam_type not in", values, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeBetween(String value1, String value2) {
            addCriterion("exam_type between", value1, value2, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeNotBetween(String value1, String value2) {
            addCriterion("exam_type not between", value1, value2, "examType");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(String value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(String value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(String value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(String value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(String value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(String value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLike(String value) {
            addCriterion("duration like", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotLike(String value) {
            addCriterion("duration not like", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<String> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<String> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(String value1, String value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(String value1, String value2) {
            addCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andInstituteNameIsNull() {
            addCriterion("institute_name is null");
            return (Criteria) this;
        }

        public Criteria andInstituteNameIsNotNull() {
            addCriterion("institute_name is not null");
            return (Criteria) this;
        }

        public Criteria andInstituteNameEqualTo(String value) {
            addCriterion("institute_name =", value, "instituteName");
            return (Criteria) this;
        }

        public Criteria andInstituteNameNotEqualTo(String value) {
            addCriterion("institute_name <>", value, "instituteName");
            return (Criteria) this;
        }

        public Criteria andInstituteNameGreaterThan(String value) {
            addCriterion("institute_name >", value, "instituteName");
            return (Criteria) this;
        }

        public Criteria andInstituteNameGreaterThanOrEqualTo(String value) {
            addCriterion("institute_name >=", value, "instituteName");
            return (Criteria) this;
        }

        public Criteria andInstituteNameLessThan(String value) {
            addCriterion("institute_name <", value, "instituteName");
            return (Criteria) this;
        }

        public Criteria andInstituteNameLessThanOrEqualTo(String value) {
            addCriterion("institute_name <=", value, "instituteName");
            return (Criteria) this;
        }

        public Criteria andInstituteNameLike(String value) {
            addCriterion("institute_name like", value, "instituteName");
            return (Criteria) this;
        }

        public Criteria andInstituteNameNotLike(String value) {
            addCriterion("institute_name not like", value, "instituteName");
            return (Criteria) this;
        }

        public Criteria andInstituteNameIn(List<String> values) {
            addCriterion("institute_name in", values, "instituteName");
            return (Criteria) this;
        }

        public Criteria andInstituteNameNotIn(List<String> values) {
            addCriterion("institute_name not in", values, "instituteName");
            return (Criteria) this;
        }

        public Criteria andInstituteNameBetween(String value1, String value2) {
            addCriterion("institute_name between", value1, value2, "instituteName");
            return (Criteria) this;
        }

        public Criteria andInstituteNameNotBetween(String value1, String value2) {
            addCriterion("institute_name not between", value1, value2, "instituteName");
            return (Criteria) this;
        }

        public Criteria andTotalMarksIsNull() {
            addCriterion("total_marks is null");
            return (Criteria) this;
        }

        public Criteria andTotalMarksIsNotNull() {
            addCriterion("total_marks is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMarksEqualTo(Integer value) {
            addCriterion("total_marks =", value, "totalMarks");
            return (Criteria) this;
        }

        public Criteria andTotalMarksNotEqualTo(Integer value) {
            addCriterion("total_marks <>", value, "totalMarks");
            return (Criteria) this;
        }

        public Criteria andTotalMarksGreaterThan(Integer value) {
            addCriterion("total_marks >", value, "totalMarks");
            return (Criteria) this;
        }

        public Criteria andTotalMarksGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_marks >=", value, "totalMarks");
            return (Criteria) this;
        }

        public Criteria andTotalMarksLessThan(Integer value) {
            addCriterion("total_marks <", value, "totalMarks");
            return (Criteria) this;
        }

        public Criteria andTotalMarksLessThanOrEqualTo(Integer value) {
            addCriterion("total_marks <=", value, "totalMarks");
            return (Criteria) this;
        }

        public Criteria andTotalMarksIn(List<Integer> values) {
            addCriterion("total_marks in", values, "totalMarks");
            return (Criteria) this;
        }

        public Criteria andTotalMarksNotIn(List<Integer> values) {
            addCriterion("total_marks not in", values, "totalMarks");
            return (Criteria) this;
        }

        public Criteria andTotalMarksBetween(Integer value1, Integer value2) {
            addCriterion("total_marks between", value1, value2, "totalMarks");
            return (Criteria) this;
        }

        public Criteria andTotalMarksNotBetween(Integer value1, Integer value2) {
            addCriterion("total_marks not between", value1, value2, "totalMarks");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table question_paper
     *
     * @mbg.generated do_not_delete_during_merge Mon Dec 16 23:28:16 BDT 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table question_paper
     *
     * @mbg.generated Mon Dec 16 23:28:16 BDT 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}