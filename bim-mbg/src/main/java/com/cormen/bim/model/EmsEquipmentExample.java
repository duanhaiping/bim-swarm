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

        public Criteria andMaterialIsNull() {
            addCriterion("MATERIAL is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNotNull() {
            addCriterion("MATERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialEqualTo(String value) {
            addCriterion("MATERIAL =", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotEqualTo(String value) {
            addCriterion("MATERIAL <>", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThan(String value) {
            addCriterion("MATERIAL >", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIAL >=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThan(String value) {
            addCriterion("MATERIAL <", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThanOrEqualTo(String value) {
            addCriterion("MATERIAL <=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLike(String value) {
            addCriterion("MATERIAL like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotLike(String value) {
            addCriterion("MATERIAL not like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialIn(List<String> values) {
            addCriterion("MATERIAL in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotIn(List<String> values) {
            addCriterion("MATERIAL not in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialBetween(String value1, String value2) {
            addCriterion("MATERIAL between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotBetween(String value1, String value2) {
            addCriterion("MATERIAL not between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andPlacementIsNull() {
            addCriterion("PLACEMENT is null");
            return (Criteria) this;
        }

        public Criteria andPlacementIsNotNull() {
            addCriterion("PLACEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andPlacementEqualTo(String value) {
            addCriterion("PLACEMENT =", value, "placement");
            return (Criteria) this;
        }

        public Criteria andPlacementNotEqualTo(String value) {
            addCriterion("PLACEMENT <>", value, "placement");
            return (Criteria) this;
        }

        public Criteria andPlacementGreaterThan(String value) {
            addCriterion("PLACEMENT >", value, "placement");
            return (Criteria) this;
        }

        public Criteria andPlacementGreaterThanOrEqualTo(String value) {
            addCriterion("PLACEMENT >=", value, "placement");
            return (Criteria) this;
        }

        public Criteria andPlacementLessThan(String value) {
            addCriterion("PLACEMENT <", value, "placement");
            return (Criteria) this;
        }

        public Criteria andPlacementLessThanOrEqualTo(String value) {
            addCriterion("PLACEMENT <=", value, "placement");
            return (Criteria) this;
        }

        public Criteria andPlacementLike(String value) {
            addCriterion("PLACEMENT like", value, "placement");
            return (Criteria) this;
        }

        public Criteria andPlacementNotLike(String value) {
            addCriterion("PLACEMENT not like", value, "placement");
            return (Criteria) this;
        }

        public Criteria andPlacementIn(List<String> values) {
            addCriterion("PLACEMENT in", values, "placement");
            return (Criteria) this;
        }

        public Criteria andPlacementNotIn(List<String> values) {
            addCriterion("PLACEMENT not in", values, "placement");
            return (Criteria) this;
        }

        public Criteria andPlacementBetween(String value1, String value2) {
            addCriterion("PLACEMENT between", value1, value2, "placement");
            return (Criteria) this;
        }

        public Criteria andPlacementNotBetween(String value1, String value2) {
            addCriterion("PLACEMENT not between", value1, value2, "placement");
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

        public Criteria andInstallTimeIsNull() {
            addCriterion("INSTALL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInstallTimeIsNotNull() {
            addCriterion("INSTALL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInstallTimeEqualTo(Date value) {
            addCriterionForJDBCDate("INSTALL_TIME =", value, "installTime");
            return (Criteria) this;
        }

        public Criteria andInstallTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("INSTALL_TIME <>", value, "installTime");
            return (Criteria) this;
        }

        public Criteria andInstallTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("INSTALL_TIME >", value, "installTime");
            return (Criteria) this;
        }

        public Criteria andInstallTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INSTALL_TIME >=", value, "installTime");
            return (Criteria) this;
        }

        public Criteria andInstallTimeLessThan(Date value) {
            addCriterionForJDBCDate("INSTALL_TIME <", value, "installTime");
            return (Criteria) this;
        }

        public Criteria andInstallTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INSTALL_TIME <=", value, "installTime");
            return (Criteria) this;
        }

        public Criteria andInstallTimeIn(List<Date> values) {
            addCriterionForJDBCDate("INSTALL_TIME in", values, "installTime");
            return (Criteria) this;
        }

        public Criteria andInstallTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("INSTALL_TIME not in", values, "installTime");
            return (Criteria) this;
        }

        public Criteria andInstallTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INSTALL_TIME between", value1, value2, "installTime");
            return (Criteria) this;
        }

        public Criteria andInstallTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INSTALL_TIME not between", value1, value2, "installTime");
            return (Criteria) this;
        }

        public Criteria andScrapDateIsNull() {
            addCriterion("SCRAP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andScrapDateIsNotNull() {
            addCriterion("SCRAP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andScrapDateEqualTo(Date value) {
            addCriterionForJDBCDate("SCRAP_DATE =", value, "scrapDate");
            return (Criteria) this;
        }

        public Criteria andScrapDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SCRAP_DATE <>", value, "scrapDate");
            return (Criteria) this;
        }

        public Criteria andScrapDateGreaterThan(Date value) {
            addCriterionForJDBCDate("SCRAP_DATE >", value, "scrapDate");
            return (Criteria) this;
        }

        public Criteria andScrapDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SCRAP_DATE >=", value, "scrapDate");
            return (Criteria) this;
        }

        public Criteria andScrapDateLessThan(Date value) {
            addCriterionForJDBCDate("SCRAP_DATE <", value, "scrapDate");
            return (Criteria) this;
        }

        public Criteria andScrapDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SCRAP_DATE <=", value, "scrapDate");
            return (Criteria) this;
        }

        public Criteria andScrapDateIn(List<Date> values) {
            addCriterionForJDBCDate("SCRAP_DATE in", values, "scrapDate");
            return (Criteria) this;
        }

        public Criteria andScrapDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SCRAP_DATE not in", values, "scrapDate");
            return (Criteria) this;
        }

        public Criteria andScrapDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SCRAP_DATE between", value1, value2, "scrapDate");
            return (Criteria) this;
        }

        public Criteria andScrapDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SCRAP_DATE not between", value1, value2, "scrapDate");
            return (Criteria) this;
        }

        public Criteria andLifeUsefulIsNull() {
            addCriterion("LIFE_USEFUL is null");
            return (Criteria) this;
        }

        public Criteria andLifeUsefulIsNotNull() {
            addCriterion("LIFE_USEFUL is not null");
            return (Criteria) this;
        }

        public Criteria andLifeUsefulEqualTo(Integer value) {
            addCriterion("LIFE_USEFUL =", value, "lifeUseful");
            return (Criteria) this;
        }

        public Criteria andLifeUsefulNotEqualTo(Integer value) {
            addCriterion("LIFE_USEFUL <>", value, "lifeUseful");
            return (Criteria) this;
        }

        public Criteria andLifeUsefulGreaterThan(Integer value) {
            addCriterion("LIFE_USEFUL >", value, "lifeUseful");
            return (Criteria) this;
        }

        public Criteria andLifeUsefulGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIFE_USEFUL >=", value, "lifeUseful");
            return (Criteria) this;
        }

        public Criteria andLifeUsefulLessThan(Integer value) {
            addCriterion("LIFE_USEFUL <", value, "lifeUseful");
            return (Criteria) this;
        }

        public Criteria andLifeUsefulLessThanOrEqualTo(Integer value) {
            addCriterion("LIFE_USEFUL <=", value, "lifeUseful");
            return (Criteria) this;
        }

        public Criteria andLifeUsefulIn(List<Integer> values) {
            addCriterion("LIFE_USEFUL in", values, "lifeUseful");
            return (Criteria) this;
        }

        public Criteria andLifeUsefulNotIn(List<Integer> values) {
            addCriterion("LIFE_USEFUL not in", values, "lifeUseful");
            return (Criteria) this;
        }

        public Criteria andLifeUsefulBetween(Integer value1, Integer value2) {
            addCriterion("LIFE_USEFUL between", value1, value2, "lifeUseful");
            return (Criteria) this;
        }

        public Criteria andLifeUsefulNotBetween(Integer value1, Integer value2) {
            addCriterion("LIFE_USEFUL not between", value1, value2, "lifeUseful");
            return (Criteria) this;
        }

        public Criteria andMonthsUsedIsNull() {
            addCriterion("MONTHS_USED is null");
            return (Criteria) this;
        }

        public Criteria andMonthsUsedIsNotNull() {
            addCriterion("MONTHS_USED is not null");
            return (Criteria) this;
        }

        public Criteria andMonthsUsedEqualTo(Integer value) {
            addCriterion("MONTHS_USED =", value, "monthsUsed");
            return (Criteria) this;
        }

        public Criteria andMonthsUsedNotEqualTo(Integer value) {
            addCriterion("MONTHS_USED <>", value, "monthsUsed");
            return (Criteria) this;
        }

        public Criteria andMonthsUsedGreaterThan(Integer value) {
            addCriterion("MONTHS_USED >", value, "monthsUsed");
            return (Criteria) this;
        }

        public Criteria andMonthsUsedGreaterThanOrEqualTo(Integer value) {
            addCriterion("MONTHS_USED >=", value, "monthsUsed");
            return (Criteria) this;
        }

        public Criteria andMonthsUsedLessThan(Integer value) {
            addCriterion("MONTHS_USED <", value, "monthsUsed");
            return (Criteria) this;
        }

        public Criteria andMonthsUsedLessThanOrEqualTo(Integer value) {
            addCriterion("MONTHS_USED <=", value, "monthsUsed");
            return (Criteria) this;
        }

        public Criteria andMonthsUsedIn(List<Integer> values) {
            addCriterion("MONTHS_USED in", values, "monthsUsed");
            return (Criteria) this;
        }

        public Criteria andMonthsUsedNotIn(List<Integer> values) {
            addCriterion("MONTHS_USED not in", values, "monthsUsed");
            return (Criteria) this;
        }

        public Criteria andMonthsUsedBetween(Integer value1, Integer value2) {
            addCriterion("MONTHS_USED between", value1, value2, "monthsUsed");
            return (Criteria) this;
        }

        public Criteria andMonthsUsedNotBetween(Integer value1, Integer value2) {
            addCriterion("MONTHS_USED not between", value1, value2, "monthsUsed");
            return (Criteria) this;
        }

        public Criteria andRepairTimesIsNull() {
            addCriterion("REPAIR_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andRepairTimesIsNotNull() {
            addCriterion("REPAIR_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andRepairTimesEqualTo(Integer value) {
            addCriterion("REPAIR_TIMES =", value, "repairTimes");
            return (Criteria) this;
        }

        public Criteria andRepairTimesNotEqualTo(Integer value) {
            addCriterion("REPAIR_TIMES <>", value, "repairTimes");
            return (Criteria) this;
        }

        public Criteria andRepairTimesGreaterThan(Integer value) {
            addCriterion("REPAIR_TIMES >", value, "repairTimes");
            return (Criteria) this;
        }

        public Criteria andRepairTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("REPAIR_TIMES >=", value, "repairTimes");
            return (Criteria) this;
        }

        public Criteria andRepairTimesLessThan(Integer value) {
            addCriterion("REPAIR_TIMES <", value, "repairTimes");
            return (Criteria) this;
        }

        public Criteria andRepairTimesLessThanOrEqualTo(Integer value) {
            addCriterion("REPAIR_TIMES <=", value, "repairTimes");
            return (Criteria) this;
        }

        public Criteria andRepairTimesIn(List<Integer> values) {
            addCriterion("REPAIR_TIMES in", values, "repairTimes");
            return (Criteria) this;
        }

        public Criteria andRepairTimesNotIn(List<Integer> values) {
            addCriterion("REPAIR_TIMES not in", values, "repairTimes");
            return (Criteria) this;
        }

        public Criteria andRepairTimesBetween(Integer value1, Integer value2) {
            addCriterion("REPAIR_TIMES between", value1, value2, "repairTimes");
            return (Criteria) this;
        }

        public Criteria andRepairTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("REPAIR_TIMES not between", value1, value2, "repairTimes");
            return (Criteria) this;
        }

        public Criteria andMaintainTimesIsNull() {
            addCriterion("MAINTAIN_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andMaintainTimesIsNotNull() {
            addCriterion("MAINTAIN_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainTimesEqualTo(Integer value) {
            addCriterion("MAINTAIN_TIMES =", value, "maintainTimes");
            return (Criteria) this;
        }

        public Criteria andMaintainTimesNotEqualTo(Integer value) {
            addCriterion("MAINTAIN_TIMES <>", value, "maintainTimes");
            return (Criteria) this;
        }

        public Criteria andMaintainTimesGreaterThan(Integer value) {
            addCriterion("MAINTAIN_TIMES >", value, "maintainTimes");
            return (Criteria) this;
        }

        public Criteria andMaintainTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAINTAIN_TIMES >=", value, "maintainTimes");
            return (Criteria) this;
        }

        public Criteria andMaintainTimesLessThan(Integer value) {
            addCriterion("MAINTAIN_TIMES <", value, "maintainTimes");
            return (Criteria) this;
        }

        public Criteria andMaintainTimesLessThanOrEqualTo(Integer value) {
            addCriterion("MAINTAIN_TIMES <=", value, "maintainTimes");
            return (Criteria) this;
        }

        public Criteria andMaintainTimesIn(List<Integer> values) {
            addCriterion("MAINTAIN_TIMES in", values, "maintainTimes");
            return (Criteria) this;
        }

        public Criteria andMaintainTimesNotIn(List<Integer> values) {
            addCriterion("MAINTAIN_TIMES not in", values, "maintainTimes");
            return (Criteria) this;
        }

        public Criteria andMaintainTimesBetween(Integer value1, Integer value2) {
            addCriterion("MAINTAIN_TIMES between", value1, value2, "maintainTimes");
            return (Criteria) this;
        }

        public Criteria andMaintainTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("MAINTAIN_TIMES not between", value1, value2, "maintainTimes");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNull() {
            addCriterion("ORIGINAL_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNotNull() {
            addCriterion("ORIGINAL_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceEqualTo(Integer value) {
            addCriterion("ORIGINAL_PRICE =", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotEqualTo(Integer value) {
            addCriterion("ORIGINAL_PRICE <>", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThan(Integer value) {
            addCriterion("ORIGINAL_PRICE >", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORIGINAL_PRICE >=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThan(Integer value) {
            addCriterion("ORIGINAL_PRICE <", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThanOrEqualTo(Integer value) {
            addCriterion("ORIGINAL_PRICE <=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIn(List<Integer> values) {
            addCriterion("ORIGINAL_PRICE in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotIn(List<Integer> values) {
            addCriterion("ORIGINAL_PRICE not in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceBetween(Integer value1, Integer value2) {
            addCriterion("ORIGINAL_PRICE between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("ORIGINAL_PRICE not between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceIsNull() {
            addCriterion("OLD_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andOldPriceIsNotNull() {
            addCriterion("OLD_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andOldPriceEqualTo(Integer value) {
            addCriterion("OLD_PRICE =", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceNotEqualTo(Integer value) {
            addCriterion("OLD_PRICE <>", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceGreaterThan(Integer value) {
            addCriterion("OLD_PRICE >", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("OLD_PRICE >=", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceLessThan(Integer value) {
            addCriterion("OLD_PRICE <", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceLessThanOrEqualTo(Integer value) {
            addCriterion("OLD_PRICE <=", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceIn(List<Integer> values) {
            addCriterion("OLD_PRICE in", values, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceNotIn(List<Integer> values) {
            addCriterion("OLD_PRICE not in", values, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceBetween(Integer value1, Integer value2) {
            addCriterion("OLD_PRICE between", value1, value2, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("OLD_PRICE not between", value1, value2, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andEquityIsNull() {
            addCriterion("EQUITY is null");
            return (Criteria) this;
        }

        public Criteria andEquityIsNotNull() {
            addCriterion("EQUITY is not null");
            return (Criteria) this;
        }

        public Criteria andEquityEqualTo(Integer value) {
            addCriterion("EQUITY =", value, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityNotEqualTo(Integer value) {
            addCriterion("EQUITY <>", value, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityGreaterThan(Integer value) {
            addCriterion("EQUITY >", value, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityGreaterThanOrEqualTo(Integer value) {
            addCriterion("EQUITY >=", value, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityLessThan(Integer value) {
            addCriterion("EQUITY <", value, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityLessThanOrEqualTo(Integer value) {
            addCriterion("EQUITY <=", value, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityIn(List<Integer> values) {
            addCriterion("EQUITY in", values, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityNotIn(List<Integer> values) {
            addCriterion("EQUITY not in", values, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityBetween(Integer value1, Integer value2) {
            addCriterion("EQUITY between", value1, value2, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityNotBetween(Integer value1, Integer value2) {
            addCriterion("EQUITY not between", value1, value2, "equity");
            return (Criteria) this;
        }

        public Criteria andRepairOrganizationIsNull() {
            addCriterion("REPAIR_ORGANIZATION is null");
            return (Criteria) this;
        }

        public Criteria andRepairOrganizationIsNotNull() {
            addCriterion("REPAIR_ORGANIZATION is not null");
            return (Criteria) this;
        }

        public Criteria andRepairOrganizationEqualTo(String value) {
            addCriterion("REPAIR_ORGANIZATION =", value, "repairOrganization");
            return (Criteria) this;
        }

        public Criteria andRepairOrganizationNotEqualTo(String value) {
            addCriterion("REPAIR_ORGANIZATION <>", value, "repairOrganization");
            return (Criteria) this;
        }

        public Criteria andRepairOrganizationGreaterThan(String value) {
            addCriterion("REPAIR_ORGANIZATION >", value, "repairOrganization");
            return (Criteria) this;
        }

        public Criteria andRepairOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("REPAIR_ORGANIZATION >=", value, "repairOrganization");
            return (Criteria) this;
        }

        public Criteria andRepairOrganizationLessThan(String value) {
            addCriterion("REPAIR_ORGANIZATION <", value, "repairOrganization");
            return (Criteria) this;
        }

        public Criteria andRepairOrganizationLessThanOrEqualTo(String value) {
            addCriterion("REPAIR_ORGANIZATION <=", value, "repairOrganization");
            return (Criteria) this;
        }

        public Criteria andRepairOrganizationLike(String value) {
            addCriterion("REPAIR_ORGANIZATION like", value, "repairOrganization");
            return (Criteria) this;
        }

        public Criteria andRepairOrganizationNotLike(String value) {
            addCriterion("REPAIR_ORGANIZATION not like", value, "repairOrganization");
            return (Criteria) this;
        }

        public Criteria andRepairOrganizationIn(List<String> values) {
            addCriterion("REPAIR_ORGANIZATION in", values, "repairOrganization");
            return (Criteria) this;
        }

        public Criteria andRepairOrganizationNotIn(List<String> values) {
            addCriterion("REPAIR_ORGANIZATION not in", values, "repairOrganization");
            return (Criteria) this;
        }

        public Criteria andRepairOrganizationBetween(String value1, String value2) {
            addCriterion("REPAIR_ORGANIZATION between", value1, value2, "repairOrganization");
            return (Criteria) this;
        }

        public Criteria andRepairOrganizationNotBetween(String value1, String value2) {
            addCriterion("REPAIR_ORGANIZATION not between", value1, value2, "repairOrganization");
            return (Criteria) this;
        }

        public Criteria andRepairTelIsNull() {
            addCriterion("REPAIR_TEL is null");
            return (Criteria) this;
        }

        public Criteria andRepairTelIsNotNull() {
            addCriterion("REPAIR_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andRepairTelEqualTo(String value) {
            addCriterion("REPAIR_TEL =", value, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairTelNotEqualTo(String value) {
            addCriterion("REPAIR_TEL <>", value, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairTelGreaterThan(String value) {
            addCriterion("REPAIR_TEL >", value, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairTelGreaterThanOrEqualTo(String value) {
            addCriterion("REPAIR_TEL >=", value, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairTelLessThan(String value) {
            addCriterion("REPAIR_TEL <", value, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairTelLessThanOrEqualTo(String value) {
            addCriterion("REPAIR_TEL <=", value, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairTelLike(String value) {
            addCriterion("REPAIR_TEL like", value, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairTelNotLike(String value) {
            addCriterion("REPAIR_TEL not like", value, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairTelIn(List<String> values) {
            addCriterion("REPAIR_TEL in", values, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairTelNotIn(List<String> values) {
            addCriterion("REPAIR_TEL not in", values, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairTelBetween(String value1, String value2) {
            addCriterion("REPAIR_TEL between", value1, value2, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairTelNotBetween(String value1, String value2) {
            addCriterion("REPAIR_TEL not between", value1, value2, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairAddressIsNull() {
            addCriterion("REPAIR_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andRepairAddressIsNotNull() {
            addCriterion("REPAIR_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andRepairAddressEqualTo(String value) {
            addCriterion("REPAIR_ADDRESS =", value, "repairAddress");
            return (Criteria) this;
        }

        public Criteria andRepairAddressNotEqualTo(String value) {
            addCriterion("REPAIR_ADDRESS <>", value, "repairAddress");
            return (Criteria) this;
        }

        public Criteria andRepairAddressGreaterThan(String value) {
            addCriterion("REPAIR_ADDRESS >", value, "repairAddress");
            return (Criteria) this;
        }

        public Criteria andRepairAddressGreaterThanOrEqualTo(String value) {
            addCriterion("REPAIR_ADDRESS >=", value, "repairAddress");
            return (Criteria) this;
        }

        public Criteria andRepairAddressLessThan(String value) {
            addCriterion("REPAIR_ADDRESS <", value, "repairAddress");
            return (Criteria) this;
        }

        public Criteria andRepairAddressLessThanOrEqualTo(String value) {
            addCriterion("REPAIR_ADDRESS <=", value, "repairAddress");
            return (Criteria) this;
        }

        public Criteria andRepairAddressLike(String value) {
            addCriterion("REPAIR_ADDRESS like", value, "repairAddress");
            return (Criteria) this;
        }

        public Criteria andRepairAddressNotLike(String value) {
            addCriterion("REPAIR_ADDRESS not like", value, "repairAddress");
            return (Criteria) this;
        }

        public Criteria andRepairAddressIn(List<String> values) {
            addCriterion("REPAIR_ADDRESS in", values, "repairAddress");
            return (Criteria) this;
        }

        public Criteria andRepairAddressNotIn(List<String> values) {
            addCriterion("REPAIR_ADDRESS not in", values, "repairAddress");
            return (Criteria) this;
        }

        public Criteria andRepairAddressBetween(String value1, String value2) {
            addCriterion("REPAIR_ADDRESS between", value1, value2, "repairAddress");
            return (Criteria) this;
        }

        public Criteria andRepairAddressNotBetween(String value1, String value2) {
            addCriterion("REPAIR_ADDRESS not between", value1, value2, "repairAddress");
            return (Criteria) this;
        }

        public Criteria andRepairByIsNull() {
            addCriterion("REPAIR_BY is null");
            return (Criteria) this;
        }

        public Criteria andRepairByIsNotNull() {
            addCriterion("REPAIR_BY is not null");
            return (Criteria) this;
        }

        public Criteria andRepairByEqualTo(Long value) {
            addCriterion("REPAIR_BY =", value, "repairBy");
            return (Criteria) this;
        }

        public Criteria andRepairByNotEqualTo(Long value) {
            addCriterion("REPAIR_BY <>", value, "repairBy");
            return (Criteria) this;
        }

        public Criteria andRepairByGreaterThan(Long value) {
            addCriterion("REPAIR_BY >", value, "repairBy");
            return (Criteria) this;
        }

        public Criteria andRepairByGreaterThanOrEqualTo(Long value) {
            addCriterion("REPAIR_BY >=", value, "repairBy");
            return (Criteria) this;
        }

        public Criteria andRepairByLessThan(Long value) {
            addCriterion("REPAIR_BY <", value, "repairBy");
            return (Criteria) this;
        }

        public Criteria andRepairByLessThanOrEqualTo(Long value) {
            addCriterion("REPAIR_BY <=", value, "repairBy");
            return (Criteria) this;
        }

        public Criteria andRepairByIn(List<Long> values) {
            addCriterion("REPAIR_BY in", values, "repairBy");
            return (Criteria) this;
        }

        public Criteria andRepairByNotIn(List<Long> values) {
            addCriterion("REPAIR_BY not in", values, "repairBy");
            return (Criteria) this;
        }

        public Criteria andRepairByBetween(Long value1, Long value2) {
            addCriterion("REPAIR_BY between", value1, value2, "repairBy");
            return (Criteria) this;
        }

        public Criteria andRepairByNotBetween(Long value1, Long value2) {
            addCriterion("REPAIR_BY not between", value1, value2, "repairBy");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("MANUFACTURER is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("MANUFACTURER is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("MANUFACTURER =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("MANUFACTURER <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("MANUFACTURER >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("MANUFACTURER <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("MANUFACTURER like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("MANUFACTURER not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("MANUFACTURER in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("MANUFACTURER not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("MANUFACTURER between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("MANUFACTURER not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressIsNull() {
            addCriterion("MANUFACTURER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressIsNotNull() {
            addCriterion("MANUFACTURER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressEqualTo(String value) {
            addCriterion("MANUFACTURER_ADDRESS =", value, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressNotEqualTo(String value) {
            addCriterion("MANUFACTURER_ADDRESS <>", value, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressGreaterThan(String value) {
            addCriterion("MANUFACTURER_ADDRESS >", value, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER_ADDRESS >=", value, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressLessThan(String value) {
            addCriterion("MANUFACTURER_ADDRESS <", value, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressLessThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER_ADDRESS <=", value, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressLike(String value) {
            addCriterion("MANUFACTURER_ADDRESS like", value, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressNotLike(String value) {
            addCriterion("MANUFACTURER_ADDRESS not like", value, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressIn(List<String> values) {
            addCriterion("MANUFACTURER_ADDRESS in", values, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressNotIn(List<String> values) {
            addCriterion("MANUFACTURER_ADDRESS not in", values, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressBetween(String value1, String value2) {
            addCriterion("MANUFACTURER_ADDRESS between", value1, value2, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressNotBetween(String value1, String value2) {
            addCriterion("MANUFACTURER_ADDRESS not between", value1, value2, "manufacturerAddress");
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