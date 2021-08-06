package com.cormen.bim.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmsEquMaintenanceTaskPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmsEquMaintenanceTaskPlanExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
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

        public Criteria andEqumentIdIsNull() {
            addCriterion("EQUMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andEqumentIdIsNotNull() {
            addCriterion("EQUMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEqumentIdEqualTo(Integer value) {
            addCriterion("EQUMENT_ID =", value, "equmentId");
            return (Criteria) this;
        }

        public Criteria andEqumentIdNotEqualTo(Integer value) {
            addCriterion("EQUMENT_ID <>", value, "equmentId");
            return (Criteria) this;
        }

        public Criteria andEqumentIdGreaterThan(Integer value) {
            addCriterion("EQUMENT_ID >", value, "equmentId");
            return (Criteria) this;
        }

        public Criteria andEqumentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EQUMENT_ID >=", value, "equmentId");
            return (Criteria) this;
        }

        public Criteria andEqumentIdLessThan(Integer value) {
            addCriterion("EQUMENT_ID <", value, "equmentId");
            return (Criteria) this;
        }

        public Criteria andEqumentIdLessThanOrEqualTo(Integer value) {
            addCriterion("EQUMENT_ID <=", value, "equmentId");
            return (Criteria) this;
        }

        public Criteria andEqumentIdIn(List<Integer> values) {
            addCriterion("EQUMENT_ID in", values, "equmentId");
            return (Criteria) this;
        }

        public Criteria andEqumentIdNotIn(List<Integer> values) {
            addCriterion("EQUMENT_ID not in", values, "equmentId");
            return (Criteria) this;
        }

        public Criteria andEqumentIdBetween(Integer value1, Integer value2) {
            addCriterion("EQUMENT_ID between", value1, value2, "equmentId");
            return (Criteria) this;
        }

        public Criteria andEqumentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EQUMENT_ID not between", value1, value2, "equmentId");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("TASK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("TASK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("TASK_NAME =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("TASK_NAME <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("TASK_NAME >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_NAME >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("TASK_NAME <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("TASK_NAME <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("TASK_NAME like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("TASK_NAME not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("TASK_NAME in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("TASK_NAME not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("TASK_NAME between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("TASK_NAME not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Long value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Long value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Long value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Long value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Long value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Long> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Long> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Long value1, Long value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Long value1, Long value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("CREATED_TIME =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("CREATED_TIME <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("CREATED_TIME >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("CREATED_TIME <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("CREATED_TIME in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("CREATED_TIME not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("UPDATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("UPDATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(Long value) {
            addCriterion("UPDATED_BY =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(Long value) {
            addCriterion("UPDATED_BY <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(Long value) {
            addCriterion("UPDATED_BY >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(Long value) {
            addCriterion("UPDATED_BY >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(Long value) {
            addCriterion("UPDATED_BY <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(Long value) {
            addCriterion("UPDATED_BY <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<Long> values) {
            addCriterion("UPDATED_BY in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<Long> values) {
            addCriterion("UPDATED_BY not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(Long value1, Long value2) {
            addCriterion("UPDATED_BY between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(Long value1, Long value2) {
            addCriterion("UPDATED_BY not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("UPDATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("UPDATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("UPDATED_TIME =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("UPDATED_TIME <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("UPDATED_TIME >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATED_TIME >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("UPDATED_TIME <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATED_TIME <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("UPDATED_TIME in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("UPDATED_TIME not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATED_TIME between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATED_TIME not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
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

        public Criteria andFundsIsNull() {
            addCriterion("FUNDS is null");
            return (Criteria) this;
        }

        public Criteria andFundsIsNotNull() {
            addCriterion("FUNDS is not null");
            return (Criteria) this;
        }

        public Criteria andFundsEqualTo(BigDecimal value) {
            addCriterion("FUNDS =", value, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsNotEqualTo(BigDecimal value) {
            addCriterion("FUNDS <>", value, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsGreaterThan(BigDecimal value) {
            addCriterion("FUNDS >", value, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FUNDS >=", value, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsLessThan(BigDecimal value) {
            addCriterion("FUNDS <", value, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FUNDS <=", value, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsIn(List<BigDecimal> values) {
            addCriterion("FUNDS in", values, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsNotIn(List<BigDecimal> values) {
            addCriterion("FUNDS not in", values, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUNDS between", value1, value2, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUNDS not between", value1, value2, "funds");
            return (Criteria) this;
        }

        public Criteria andInspectionIsNull() {
            addCriterion("INSPECTION is null");
            return (Criteria) this;
        }

        public Criteria andInspectionIsNotNull() {
            addCriterion("INSPECTION is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionEqualTo(Integer value) {
            addCriterion("INSPECTION =", value, "inspection");
            return (Criteria) this;
        }

        public Criteria andInspectionNotEqualTo(Integer value) {
            addCriterion("INSPECTION <>", value, "inspection");
            return (Criteria) this;
        }

        public Criteria andInspectionGreaterThan(Integer value) {
            addCriterion("INSPECTION >", value, "inspection");
            return (Criteria) this;
        }

        public Criteria andInspectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("INSPECTION >=", value, "inspection");
            return (Criteria) this;
        }

        public Criteria andInspectionLessThan(Integer value) {
            addCriterion("INSPECTION <", value, "inspection");
            return (Criteria) this;
        }

        public Criteria andInspectionLessThanOrEqualTo(Integer value) {
            addCriterion("INSPECTION <=", value, "inspection");
            return (Criteria) this;
        }

        public Criteria andInspectionIn(List<Integer> values) {
            addCriterion("INSPECTION in", values, "inspection");
            return (Criteria) this;
        }

        public Criteria andInspectionNotIn(List<Integer> values) {
            addCriterion("INSPECTION not in", values, "inspection");
            return (Criteria) this;
        }

        public Criteria andInspectionBetween(Integer value1, Integer value2) {
            addCriterion("INSPECTION between", value1, value2, "inspection");
            return (Criteria) this;
        }

        public Criteria andInspectionNotBetween(Integer value1, Integer value2) {
            addCriterion("INSPECTION not between", value1, value2, "inspection");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andMainpointIsNull() {
            addCriterion("MAINPOINT is null");
            return (Criteria) this;
        }

        public Criteria andMainpointIsNotNull() {
            addCriterion("MAINPOINT is not null");
            return (Criteria) this;
        }

        public Criteria andMainpointEqualTo(String value) {
            addCriterion("MAINPOINT =", value, "mainpoint");
            return (Criteria) this;
        }

        public Criteria andMainpointNotEqualTo(String value) {
            addCriterion("MAINPOINT <>", value, "mainpoint");
            return (Criteria) this;
        }

        public Criteria andMainpointGreaterThan(String value) {
            addCriterion("MAINPOINT >", value, "mainpoint");
            return (Criteria) this;
        }

        public Criteria andMainpointGreaterThanOrEqualTo(String value) {
            addCriterion("MAINPOINT >=", value, "mainpoint");
            return (Criteria) this;
        }

        public Criteria andMainpointLessThan(String value) {
            addCriterion("MAINPOINT <", value, "mainpoint");
            return (Criteria) this;
        }

        public Criteria andMainpointLessThanOrEqualTo(String value) {
            addCriterion("MAINPOINT <=", value, "mainpoint");
            return (Criteria) this;
        }

        public Criteria andMainpointLike(String value) {
            addCriterion("MAINPOINT like", value, "mainpoint");
            return (Criteria) this;
        }

        public Criteria andMainpointNotLike(String value) {
            addCriterion("MAINPOINT not like", value, "mainpoint");
            return (Criteria) this;
        }

        public Criteria andMainpointIn(List<String> values) {
            addCriterion("MAINPOINT in", values, "mainpoint");
            return (Criteria) this;
        }

        public Criteria andMainpointNotIn(List<String> values) {
            addCriterion("MAINPOINT not in", values, "mainpoint");
            return (Criteria) this;
        }

        public Criteria andMainpointBetween(String value1, String value2) {
            addCriterion("MAINPOINT between", value1, value2, "mainpoint");
            return (Criteria) this;
        }

        public Criteria andMainpointNotBetween(String value1, String value2) {
            addCriterion("MAINPOINT not between", value1, value2, "mainpoint");
            return (Criteria) this;
        }

        public Criteria andTaskStartdateIsNull() {
            addCriterion("TASK_STARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andTaskStartdateIsNotNull() {
            addCriterion("TASK_STARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStartdateEqualTo(Date value) {
            addCriterionForJDBCDate("TASK_STARTDATE =", value, "taskStartdate");
            return (Criteria) this;
        }

        public Criteria andTaskStartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("TASK_STARTDATE <>", value, "taskStartdate");
            return (Criteria) this;
        }

        public Criteria andTaskStartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("TASK_STARTDATE >", value, "taskStartdate");
            return (Criteria) this;
        }

        public Criteria andTaskStartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TASK_STARTDATE >=", value, "taskStartdate");
            return (Criteria) this;
        }

        public Criteria andTaskStartdateLessThan(Date value) {
            addCriterionForJDBCDate("TASK_STARTDATE <", value, "taskStartdate");
            return (Criteria) this;
        }

        public Criteria andTaskStartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TASK_STARTDATE <=", value, "taskStartdate");
            return (Criteria) this;
        }

        public Criteria andTaskStartdateIn(List<Date> values) {
            addCriterionForJDBCDate("TASK_STARTDATE in", values, "taskStartdate");
            return (Criteria) this;
        }

        public Criteria andTaskStartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("TASK_STARTDATE not in", values, "taskStartdate");
            return (Criteria) this;
        }

        public Criteria andTaskStartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TASK_STARTDATE between", value1, value2, "taskStartdate");
            return (Criteria) this;
        }

        public Criteria andTaskStartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TASK_STARTDATE not between", value1, value2, "taskStartdate");
            return (Criteria) this;
        }

        public Criteria andTaskEnddateIsNull() {
            addCriterion("TASK_ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andTaskEnddateIsNotNull() {
            addCriterion("TASK_ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskEnddateEqualTo(String value) {
            addCriterion("TASK_ENDDATE =", value, "taskEnddate");
            return (Criteria) this;
        }

        public Criteria andTaskEnddateNotEqualTo(String value) {
            addCriterion("TASK_ENDDATE <>", value, "taskEnddate");
            return (Criteria) this;
        }

        public Criteria andTaskEnddateGreaterThan(String value) {
            addCriterion("TASK_ENDDATE >", value, "taskEnddate");
            return (Criteria) this;
        }

        public Criteria andTaskEnddateGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ENDDATE >=", value, "taskEnddate");
            return (Criteria) this;
        }

        public Criteria andTaskEnddateLessThan(String value) {
            addCriterion("TASK_ENDDATE <", value, "taskEnddate");
            return (Criteria) this;
        }

        public Criteria andTaskEnddateLessThanOrEqualTo(String value) {
            addCriterion("TASK_ENDDATE <=", value, "taskEnddate");
            return (Criteria) this;
        }

        public Criteria andTaskEnddateLike(String value) {
            addCriterion("TASK_ENDDATE like", value, "taskEnddate");
            return (Criteria) this;
        }

        public Criteria andTaskEnddateNotLike(String value) {
            addCriterion("TASK_ENDDATE not like", value, "taskEnddate");
            return (Criteria) this;
        }

        public Criteria andTaskEnddateIn(List<String> values) {
            addCriterion("TASK_ENDDATE in", values, "taskEnddate");
            return (Criteria) this;
        }

        public Criteria andTaskEnddateNotIn(List<String> values) {
            addCriterion("TASK_ENDDATE not in", values, "taskEnddate");
            return (Criteria) this;
        }

        public Criteria andTaskEnddateBetween(String value1, String value2) {
            addCriterion("TASK_ENDDATE between", value1, value2, "taskEnddate");
            return (Criteria) this;
        }

        public Criteria andTaskEnddateNotBetween(String value1, String value2) {
            addCriterion("TASK_ENDDATE not between", value1, value2, "taskEnddate");
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