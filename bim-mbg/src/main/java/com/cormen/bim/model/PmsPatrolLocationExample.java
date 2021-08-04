package com.cormen.bim.model;

import java.util.ArrayList;
import java.util.List;

public class PmsPatrolLocationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsPatrolLocationExample() {
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

        public Criteria andPatrolPointIsNull() {
            addCriterion("PATROL_POINT is null");
            return (Criteria) this;
        }

        public Criteria andPatrolPointIsNotNull() {
            addCriterion("PATROL_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolPointEqualTo(String value) {
            addCriterion("PATROL_POINT =", value, "patrolPoint");
            return (Criteria) this;
        }

        public Criteria andPatrolPointNotEqualTo(String value) {
            addCriterion("PATROL_POINT <>", value, "patrolPoint");
            return (Criteria) this;
        }

        public Criteria andPatrolPointGreaterThan(String value) {
            addCriterion("PATROL_POINT >", value, "patrolPoint");
            return (Criteria) this;
        }

        public Criteria andPatrolPointGreaterThanOrEqualTo(String value) {
            addCriterion("PATROL_POINT >=", value, "patrolPoint");
            return (Criteria) this;
        }

        public Criteria andPatrolPointLessThan(String value) {
            addCriterion("PATROL_POINT <", value, "patrolPoint");
            return (Criteria) this;
        }

        public Criteria andPatrolPointLessThanOrEqualTo(String value) {
            addCriterion("PATROL_POINT <=", value, "patrolPoint");
            return (Criteria) this;
        }

        public Criteria andPatrolPointLike(String value) {
            addCriterion("PATROL_POINT like", value, "patrolPoint");
            return (Criteria) this;
        }

        public Criteria andPatrolPointNotLike(String value) {
            addCriterion("PATROL_POINT not like", value, "patrolPoint");
            return (Criteria) this;
        }

        public Criteria andPatrolPointIn(List<String> values) {
            addCriterion("PATROL_POINT in", values, "patrolPoint");
            return (Criteria) this;
        }

        public Criteria andPatrolPointNotIn(List<String> values) {
            addCriterion("PATROL_POINT not in", values, "patrolPoint");
            return (Criteria) this;
        }

        public Criteria andPatrolPointBetween(String value1, String value2) {
            addCriterion("PATROL_POINT between", value1, value2, "patrolPoint");
            return (Criteria) this;
        }

        public Criteria andPatrolPointNotBetween(String value1, String value2) {
            addCriterion("PATROL_POINT not between", value1, value2, "patrolPoint");
            return (Criteria) this;
        }

        public Criteria andSignTypeIsNull() {
            addCriterion("SIGN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSignTypeIsNotNull() {
            addCriterion("SIGN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSignTypeEqualTo(String value) {
            addCriterion("SIGN_TYPE =", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotEqualTo(String value) {
            addCriterion("SIGN_TYPE <>", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeGreaterThan(String value) {
            addCriterion("SIGN_TYPE >", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_TYPE >=", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLessThan(String value) {
            addCriterion("SIGN_TYPE <", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLessThanOrEqualTo(String value) {
            addCriterion("SIGN_TYPE <=", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLike(String value) {
            addCriterion("SIGN_TYPE like", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotLike(String value) {
            addCriterion("SIGN_TYPE not like", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeIn(List<String> values) {
            addCriterion("SIGN_TYPE in", values, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotIn(List<String> values) {
            addCriterion("SIGN_TYPE not in", values, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeBetween(String value1, String value2) {
            addCriterion("SIGN_TYPE between", value1, value2, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotBetween(String value1, String value2) {
            addCriterion("SIGN_TYPE not between", value1, value2, "signType");
            return (Criteria) this;
        }

        public Criteria andBimPointIsNull() {
            addCriterion("BIM_POINT is null");
            return (Criteria) this;
        }

        public Criteria andBimPointIsNotNull() {
            addCriterion("BIM_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andBimPointEqualTo(String value) {
            addCriterion("BIM_POINT =", value, "bimPoint");
            return (Criteria) this;
        }

        public Criteria andBimPointNotEqualTo(String value) {
            addCriterion("BIM_POINT <>", value, "bimPoint");
            return (Criteria) this;
        }

        public Criteria andBimPointGreaterThan(String value) {
            addCriterion("BIM_POINT >", value, "bimPoint");
            return (Criteria) this;
        }

        public Criteria andBimPointGreaterThanOrEqualTo(String value) {
            addCriterion("BIM_POINT >=", value, "bimPoint");
            return (Criteria) this;
        }

        public Criteria andBimPointLessThan(String value) {
            addCriterion("BIM_POINT <", value, "bimPoint");
            return (Criteria) this;
        }

        public Criteria andBimPointLessThanOrEqualTo(String value) {
            addCriterion("BIM_POINT <=", value, "bimPoint");
            return (Criteria) this;
        }

        public Criteria andBimPointLike(String value) {
            addCriterion("BIM_POINT like", value, "bimPoint");
            return (Criteria) this;
        }

        public Criteria andBimPointNotLike(String value) {
            addCriterion("BIM_POINT not like", value, "bimPoint");
            return (Criteria) this;
        }

        public Criteria andBimPointIn(List<String> values) {
            addCriterion("BIM_POINT in", values, "bimPoint");
            return (Criteria) this;
        }

        public Criteria andBimPointNotIn(List<String> values) {
            addCriterion("BIM_POINT not in", values, "bimPoint");
            return (Criteria) this;
        }

        public Criteria andBimPointBetween(String value1, String value2) {
            addCriterion("BIM_POINT between", value1, value2, "bimPoint");
            return (Criteria) this;
        }

        public Criteria andBimPointNotBetween(String value1, String value2) {
            addCriterion("BIM_POINT not between", value1, value2, "bimPoint");
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