package com.cormen.bim.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PmsPatrolPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsPatrolPlanExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNull() {
            addCriterion("REGION_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNotNull() {
            addCriterion("REGION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegionIdEqualTo(Integer value) {
            addCriterion("REGION_ID =", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotEqualTo(Integer value) {
            addCriterion("REGION_ID <>", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThan(Integer value) {
            addCriterion("REGION_ID >", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("REGION_ID >=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThan(Integer value) {
            addCriterion("REGION_ID <", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThanOrEqualTo(Integer value) {
            addCriterion("REGION_ID <=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIn(List<Integer> values) {
            addCriterion("REGION_ID in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotIn(List<Integer> values) {
            addCriterion("REGION_ID not in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdBetween(Integer value1, Integer value2) {
            addCriterion("REGION_ID between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("REGION_ID not between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andStaetDateIsNull() {
            addCriterion("STAET_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStaetDateIsNotNull() {
            addCriterion("STAET_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStaetDateEqualTo(Date value) {
            addCriterionForJDBCDate("STAET_DATE =", value, "staetDate");
            return (Criteria) this;
        }

        public Criteria andStaetDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("STAET_DATE <>", value, "staetDate");
            return (Criteria) this;
        }

        public Criteria andStaetDateGreaterThan(Date value) {
            addCriterionForJDBCDate("STAET_DATE >", value, "staetDate");
            return (Criteria) this;
        }

        public Criteria andStaetDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STAET_DATE >=", value, "staetDate");
            return (Criteria) this;
        }

        public Criteria andStaetDateLessThan(Date value) {
            addCriterionForJDBCDate("STAET_DATE <", value, "staetDate");
            return (Criteria) this;
        }

        public Criteria andStaetDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STAET_DATE <=", value, "staetDate");
            return (Criteria) this;
        }

        public Criteria andStaetDateIn(List<Date> values) {
            addCriterionForJDBCDate("STAET_DATE in", values, "staetDate");
            return (Criteria) this;
        }

        public Criteria andStaetDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("STAET_DATE not in", values, "staetDate");
            return (Criteria) this;
        }

        public Criteria andStaetDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STAET_DATE between", value1, value2, "staetDate");
            return (Criteria) this;
        }

        public Criteria andStaetDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STAET_DATE not between", value1, value2, "staetDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andPathIdIsNull() {
            addCriterion("PATH_ID is null");
            return (Criteria) this;
        }

        public Criteria andPathIdIsNotNull() {
            addCriterion("PATH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPathIdEqualTo(Integer value) {
            addCriterion("PATH_ID =", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdNotEqualTo(Integer value) {
            addCriterion("PATH_ID <>", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdGreaterThan(Integer value) {
            addCriterion("PATH_ID >", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PATH_ID >=", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdLessThan(Integer value) {
            addCriterion("PATH_ID <", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdLessThanOrEqualTo(Integer value) {
            addCriterion("PATH_ID <=", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdIn(List<Integer> values) {
            addCriterion("PATH_ID in", values, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdNotIn(List<Integer> values) {
            addCriterion("PATH_ID not in", values, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdBetween(Integer value1, Integer value2) {
            addCriterion("PATH_ID between", value1, value2, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PATH_ID not between", value1, value2, "pathId");
            return (Criteria) this;
        }

        public Criteria andFrequencyTypeIsNull() {
            addCriterion("FREQUENCY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyTypeIsNotNull() {
            addCriterion("FREQUENCY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyTypeEqualTo(String value) {
            addCriterion("FREQUENCY_TYPE =", value, "frequencyType");
            return (Criteria) this;
        }

        public Criteria andFrequencyTypeNotEqualTo(String value) {
            addCriterion("FREQUENCY_TYPE <>", value, "frequencyType");
            return (Criteria) this;
        }

        public Criteria andFrequencyTypeGreaterThan(String value) {
            addCriterion("FREQUENCY_TYPE >", value, "frequencyType");
            return (Criteria) this;
        }

        public Criteria andFrequencyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FREQUENCY_TYPE >=", value, "frequencyType");
            return (Criteria) this;
        }

        public Criteria andFrequencyTypeLessThan(String value) {
            addCriterion("FREQUENCY_TYPE <", value, "frequencyType");
            return (Criteria) this;
        }

        public Criteria andFrequencyTypeLessThanOrEqualTo(String value) {
            addCriterion("FREQUENCY_TYPE <=", value, "frequencyType");
            return (Criteria) this;
        }

        public Criteria andFrequencyTypeLike(String value) {
            addCriterion("FREQUENCY_TYPE like", value, "frequencyType");
            return (Criteria) this;
        }

        public Criteria andFrequencyTypeNotLike(String value) {
            addCriterion("FREQUENCY_TYPE not like", value, "frequencyType");
            return (Criteria) this;
        }

        public Criteria andFrequencyTypeIn(List<String> values) {
            addCriterion("FREQUENCY_TYPE in", values, "frequencyType");
            return (Criteria) this;
        }

        public Criteria andFrequencyTypeNotIn(List<String> values) {
            addCriterion("FREQUENCY_TYPE not in", values, "frequencyType");
            return (Criteria) this;
        }

        public Criteria andFrequencyTypeBetween(String value1, String value2) {
            addCriterion("FREQUENCY_TYPE between", value1, value2, "frequencyType");
            return (Criteria) this;
        }

        public Criteria andFrequencyTypeNotBetween(String value1, String value2) {
            addCriterion("FREQUENCY_TYPE not between", value1, value2, "frequencyType");
            return (Criteria) this;
        }

        public Criteria andBimPathIsNull() {
            addCriterion("BIM_PATH is null");
            return (Criteria) this;
        }

        public Criteria andBimPathIsNotNull() {
            addCriterion("BIM_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andBimPathEqualTo(String value) {
            addCriterion("BIM_PATH =", value, "bimPath");
            return (Criteria) this;
        }

        public Criteria andBimPathNotEqualTo(String value) {
            addCriterion("BIM_PATH <>", value, "bimPath");
            return (Criteria) this;
        }

        public Criteria andBimPathGreaterThan(String value) {
            addCriterion("BIM_PATH >", value, "bimPath");
            return (Criteria) this;
        }

        public Criteria andBimPathGreaterThanOrEqualTo(String value) {
            addCriterion("BIM_PATH >=", value, "bimPath");
            return (Criteria) this;
        }

        public Criteria andBimPathLessThan(String value) {
            addCriterion("BIM_PATH <", value, "bimPath");
            return (Criteria) this;
        }

        public Criteria andBimPathLessThanOrEqualTo(String value) {
            addCriterion("BIM_PATH <=", value, "bimPath");
            return (Criteria) this;
        }

        public Criteria andBimPathLike(String value) {
            addCriterion("BIM_PATH like", value, "bimPath");
            return (Criteria) this;
        }

        public Criteria andBimPathNotLike(String value) {
            addCriterion("BIM_PATH not like", value, "bimPath");
            return (Criteria) this;
        }

        public Criteria andBimPathIn(List<String> values) {
            addCriterion("BIM_PATH in", values, "bimPath");
            return (Criteria) this;
        }

        public Criteria andBimPathNotIn(List<String> values) {
            addCriterion("BIM_PATH not in", values, "bimPath");
            return (Criteria) this;
        }

        public Criteria andBimPathBetween(String value1, String value2) {
            addCriterion("BIM_PATH between", value1, value2, "bimPath");
            return (Criteria) this;
        }

        public Criteria andBimPathNotBetween(String value1, String value2) {
            addCriterion("BIM_PATH not between", value1, value2, "bimPath");
            return (Criteria) this;
        }

        public Criteria andAgentIsNull() {
            addCriterion("AGENT is null");
            return (Criteria) this;
        }

        public Criteria andAgentIsNotNull() {
            addCriterion("AGENT is not null");
            return (Criteria) this;
        }

        public Criteria andAgentEqualTo(Long value) {
            addCriterion("AGENT =", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotEqualTo(Long value) {
            addCriterion("AGENT <>", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThan(Long value) {
            addCriterion("AGENT >", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThanOrEqualTo(Long value) {
            addCriterion("AGENT >=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThan(Long value) {
            addCriterion("AGENT <", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThanOrEqualTo(Long value) {
            addCriterion("AGENT <=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentIn(List<Long> values) {
            addCriterion("AGENT in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotIn(List<Long> values) {
            addCriterion("AGENT not in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentBetween(Long value1, Long value2) {
            addCriterion("AGENT between", value1, value2, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotBetween(Long value1, Long value2) {
            addCriterion("AGENT not between", value1, value2, "agent");
            return (Criteria) this;
        }

        public Criteria andFrequencyNumberIsNull() {
            addCriterion("FREQUENCY_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyNumberIsNotNull() {
            addCriterion("FREQUENCY_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyNumberEqualTo(Integer value) {
            addCriterion("FREQUENCY_NUMBER =", value, "frequencyNumber");
            return (Criteria) this;
        }

        public Criteria andFrequencyNumberNotEqualTo(Integer value) {
            addCriterion("FREQUENCY_NUMBER <>", value, "frequencyNumber");
            return (Criteria) this;
        }

        public Criteria andFrequencyNumberGreaterThan(Integer value) {
            addCriterion("FREQUENCY_NUMBER >", value, "frequencyNumber");
            return (Criteria) this;
        }

        public Criteria andFrequencyNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("FREQUENCY_NUMBER >=", value, "frequencyNumber");
            return (Criteria) this;
        }

        public Criteria andFrequencyNumberLessThan(Integer value) {
            addCriterion("FREQUENCY_NUMBER <", value, "frequencyNumber");
            return (Criteria) this;
        }

        public Criteria andFrequencyNumberLessThanOrEqualTo(Integer value) {
            addCriterion("FREQUENCY_NUMBER <=", value, "frequencyNumber");
            return (Criteria) this;
        }

        public Criteria andFrequencyNumberIn(List<Integer> values) {
            addCriterion("FREQUENCY_NUMBER in", values, "frequencyNumber");
            return (Criteria) this;
        }

        public Criteria andFrequencyNumberNotIn(List<Integer> values) {
            addCriterion("FREQUENCY_NUMBER not in", values, "frequencyNumber");
            return (Criteria) this;
        }

        public Criteria andFrequencyNumberBetween(Integer value1, Integer value2) {
            addCriterion("FREQUENCY_NUMBER between", value1, value2, "frequencyNumber");
            return (Criteria) this;
        }

        public Criteria andFrequencyNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("FREQUENCY_NUMBER not between", value1, value2, "frequencyNumber");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

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