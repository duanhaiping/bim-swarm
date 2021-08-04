package com.cormen.bim.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmsEquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmsEquipmentExample() {
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

        public Criteria andRegionIsNull() {
            addCriterion("REGION is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("REGION is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(Integer value) {
            addCriterion("REGION =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(Integer value) {
            addCriterion("REGION <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(Integer value) {
            addCriterion("REGION >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(Integer value) {
            addCriterion("REGION >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(Integer value) {
            addCriterion("REGION <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(Integer value) {
            addCriterion("REGION <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<Integer> values) {
            addCriterion("REGION in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<Integer> values) {
            addCriterion("REGION not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(Integer value1, Integer value2) {
            addCriterion("REGION between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(Integer value1, Integer value2) {
            addCriterion("REGION not between", value1, value2, "region");
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

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
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

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("State like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("State not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCycleIsNull() {
            addCriterion("MAINTENANCE_CYCLE is null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCycleIsNotNull() {
            addCriterion("MAINTENANCE_CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCycleEqualTo(String value) {
            addCriterion("MAINTENANCE_CYCLE =", value, "maintenanceCycle");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCycleNotEqualTo(String value) {
            addCriterion("MAINTENANCE_CYCLE <>", value, "maintenanceCycle");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCycleGreaterThan(String value) {
            addCriterion("MAINTENANCE_CYCLE >", value, "maintenanceCycle");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCycleGreaterThanOrEqualTo(String value) {
            addCriterion("MAINTENANCE_CYCLE >=", value, "maintenanceCycle");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCycleLessThan(String value) {
            addCriterion("MAINTENANCE_CYCLE <", value, "maintenanceCycle");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCycleLessThanOrEqualTo(String value) {
            addCriterion("MAINTENANCE_CYCLE <=", value, "maintenanceCycle");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCycleLike(String value) {
            addCriterion("MAINTENANCE_CYCLE like", value, "maintenanceCycle");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCycleNotLike(String value) {
            addCriterion("MAINTENANCE_CYCLE not like", value, "maintenanceCycle");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCycleIn(List<String> values) {
            addCriterion("MAINTENANCE_CYCLE in", values, "maintenanceCycle");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCycleNotIn(List<String> values) {
            addCriterion("MAINTENANCE_CYCLE not in", values, "maintenanceCycle");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCycleBetween(String value1, String value2) {
            addCriterion("MAINTENANCE_CYCLE between", value1, value2, "maintenanceCycle");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCycleNotBetween(String value1, String value2) {
            addCriterion("MAINTENANCE_CYCLE not between", value1, value2, "maintenanceCycle");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("WEIGHT =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("WEIGHT >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("WEIGHT <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("WEIGHT in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("WEIGHT not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andBimModelCodeIsNull() {
            addCriterion("BIM_MODEL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBimModelCodeIsNotNull() {
            addCriterion("BIM_MODEL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBimModelCodeEqualTo(String value) {
            addCriterion("BIM_MODEL_CODE =", value, "bimModelCode");
            return (Criteria) this;
        }

        public Criteria andBimModelCodeNotEqualTo(String value) {
            addCriterion("BIM_MODEL_CODE <>", value, "bimModelCode");
            return (Criteria) this;
        }

        public Criteria andBimModelCodeGreaterThan(String value) {
            addCriterion("BIM_MODEL_CODE >", value, "bimModelCode");
            return (Criteria) this;
        }

        public Criteria andBimModelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BIM_MODEL_CODE >=", value, "bimModelCode");
            return (Criteria) this;
        }

        public Criteria andBimModelCodeLessThan(String value) {
            addCriterion("BIM_MODEL_CODE <", value, "bimModelCode");
            return (Criteria) this;
        }

        public Criteria andBimModelCodeLessThanOrEqualTo(String value) {
            addCriterion("BIM_MODEL_CODE <=", value, "bimModelCode");
            return (Criteria) this;
        }

        public Criteria andBimModelCodeLike(String value) {
            addCriterion("BIM_MODEL_CODE like", value, "bimModelCode");
            return (Criteria) this;
        }

        public Criteria andBimModelCodeNotLike(String value) {
            addCriterion("BIM_MODEL_CODE not like", value, "bimModelCode");
            return (Criteria) this;
        }

        public Criteria andBimModelCodeIn(List<String> values) {
            addCriterion("BIM_MODEL_CODE in", values, "bimModelCode");
            return (Criteria) this;
        }

        public Criteria andBimModelCodeNotIn(List<String> values) {
            addCriterion("BIM_MODEL_CODE not in", values, "bimModelCode");
            return (Criteria) this;
        }

        public Criteria andBimModelCodeBetween(String value1, String value2) {
            addCriterion("BIM_MODEL_CODE between", value1, value2, "bimModelCode");
            return (Criteria) this;
        }

        public Criteria andBimModelCodeNotBetween(String value1, String value2) {
            addCriterion("BIM_MODEL_CODE not between", value1, value2, "bimModelCode");
            return (Criteria) this;
        }

        public Criteria andModelPositionIsNull() {
            addCriterion("MODEL_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andModelPositionIsNotNull() {
            addCriterion("MODEL_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andModelPositionEqualTo(String value) {
            addCriterion("MODEL_POSITION =", value, "modelPosition");
            return (Criteria) this;
        }

        public Criteria andModelPositionNotEqualTo(String value) {
            addCriterion("MODEL_POSITION <>", value, "modelPosition");
            return (Criteria) this;
        }

        public Criteria andModelPositionGreaterThan(String value) {
            addCriterion("MODEL_POSITION >", value, "modelPosition");
            return (Criteria) this;
        }

        public Criteria andModelPositionGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL_POSITION >=", value, "modelPosition");
            return (Criteria) this;
        }

        public Criteria andModelPositionLessThan(String value) {
            addCriterion("MODEL_POSITION <", value, "modelPosition");
            return (Criteria) this;
        }

        public Criteria andModelPositionLessThanOrEqualTo(String value) {
            addCriterion("MODEL_POSITION <=", value, "modelPosition");
            return (Criteria) this;
        }

        public Criteria andModelPositionLike(String value) {
            addCriterion("MODEL_POSITION like", value, "modelPosition");
            return (Criteria) this;
        }

        public Criteria andModelPositionNotLike(String value) {
            addCriterion("MODEL_POSITION not like", value, "modelPosition");
            return (Criteria) this;
        }

        public Criteria andModelPositionIn(List<String> values) {
            addCriterion("MODEL_POSITION in", values, "modelPosition");
            return (Criteria) this;
        }

        public Criteria andModelPositionNotIn(List<String> values) {
            addCriterion("MODEL_POSITION not in", values, "modelPosition");
            return (Criteria) this;
        }

        public Criteria andModelPositionBetween(String value1, String value2) {
            addCriterion("MODEL_POSITION between", value1, value2, "modelPosition");
            return (Criteria) this;
        }

        public Criteria andModelPositionNotBetween(String value1, String value2) {
            addCriterion("MODEL_POSITION not between", value1, value2, "modelPosition");
            return (Criteria) this;
        }

        public Criteria andIsactivityIsNull() {
            addCriterion("ISACTIVITY is null");
            return (Criteria) this;
        }

        public Criteria andIsactivityIsNotNull() {
            addCriterion("ISACTIVITY is not null");
            return (Criteria) this;
        }

        public Criteria andIsactivityEqualTo(String value) {
            addCriterion("ISACTIVITY =", value, "isactivity");
            return (Criteria) this;
        }

        public Criteria andIsactivityNotEqualTo(String value) {
            addCriterion("ISACTIVITY <>", value, "isactivity");
            return (Criteria) this;
        }

        public Criteria andIsactivityGreaterThan(String value) {
            addCriterion("ISACTIVITY >", value, "isactivity");
            return (Criteria) this;
        }

        public Criteria andIsactivityGreaterThanOrEqualTo(String value) {
            addCriterion("ISACTIVITY >=", value, "isactivity");
            return (Criteria) this;
        }

        public Criteria andIsactivityLessThan(String value) {
            addCriterion("ISACTIVITY <", value, "isactivity");
            return (Criteria) this;
        }

        public Criteria andIsactivityLessThanOrEqualTo(String value) {
            addCriterion("ISACTIVITY <=", value, "isactivity");
            return (Criteria) this;
        }

        public Criteria andIsactivityLike(String value) {
            addCriterion("ISACTIVITY like", value, "isactivity");
            return (Criteria) this;
        }

        public Criteria andIsactivityNotLike(String value) {
            addCriterion("ISACTIVITY not like", value, "isactivity");
            return (Criteria) this;
        }

        public Criteria andIsactivityIn(List<String> values) {
            addCriterion("ISACTIVITY in", values, "isactivity");
            return (Criteria) this;
        }

        public Criteria andIsactivityNotIn(List<String> values) {
            addCriterion("ISACTIVITY not in", values, "isactivity");
            return (Criteria) this;
        }

        public Criteria andIsactivityBetween(String value1, String value2) {
            addCriterion("ISACTIVITY between", value1, value2, "isactivity");
            return (Criteria) this;
        }

        public Criteria andIsactivityNotBetween(String value1, String value2) {
            addCriterion("ISACTIVITY not between", value1, value2, "isactivity");
            return (Criteria) this;
        }

        public Criteria andUseDateIsNull() {
            addCriterion("USE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUseDateIsNotNull() {
            addCriterion("USE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUseDateEqualTo(Date value) {
            addCriterionForJDBCDate("USE_DATE =", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("USE_DATE <>", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("USE_DATE >", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("USE_DATE >=", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateLessThan(Date value) {
            addCriterionForJDBCDate("USE_DATE <", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("USE_DATE <=", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateIn(List<Date> values) {
            addCriterionForJDBCDate("USE_DATE in", values, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("USE_DATE not in", values, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("USE_DATE between", value1, value2, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("USE_DATE not between", value1, value2, "useDate");
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

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("CREATED_BY like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("CREATED_BY not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
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

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("UPDATED_BY =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("UPDATED_BY <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("UPDATED_BY >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATED_BY >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("UPDATED_BY <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("UPDATED_BY <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("UPDATED_BY like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("UPDATED_BY not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("UPDATED_BY in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("UPDATED_BY not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("UPDATED_BY between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
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