package com.supermarket.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FreshGoodsExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public FreshGoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
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

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andFdidIsNull() {
            addCriterion("fdid is null");
            return (Criteria) this;
        }

        public Criteria andFdidIsNotNull() {
            addCriterion("fdid is not null");
            return (Criteria) this;
        }

        public Criteria andFdidEqualTo(String value) {
            addCriterion("fdid =", value, "fdid");
            return (Criteria) this;
        }

        public Criteria andFdidNotEqualTo(String value) {
            addCriterion("fdid <>", value, "fdid");
            return (Criteria) this;
        }

        public Criteria andFdidGreaterThan(String value) {
            addCriterion("fdid >", value, "fdid");
            return (Criteria) this;
        }

        public Criteria andFdidGreaterThanOrEqualTo(String value) {
            addCriterion("fdid >=", value, "fdid");
            return (Criteria) this;
        }

        public Criteria andFdidLessThan(String value) {
            addCriterion("fdid <", value, "fdid");
            return (Criteria) this;
        }

        public Criteria andFdidLessThanOrEqualTo(String value) {
            addCriterion("fdid <=", value, "fdid");
            return (Criteria) this;
        }

        public Criteria andFdidLike(String value) {
            addCriterion("fdid like", value, "fdid");
            return (Criteria) this;
        }

        public Criteria andFdidNotLike(String value) {
            addCriterion("fdid not like", value, "fdid");
            return (Criteria) this;
        }

        public Criteria andFdidIn(List<String> values) {
            addCriterion("fdid in", values, "fdid");
            return (Criteria) this;
        }

        public Criteria andFdidNotIn(List<String> values) {
            addCriterion("fdid not in", values, "fdid");
            return (Criteria) this;
        }

        public Criteria andFdidBetween(String value1, String value2) {
            addCriterion("fdid between", value1, value2, "fdid");
            return (Criteria) this;
        }

        public Criteria andFdidNotBetween(String value1, String value2) {
            addCriterion("fdid not between", value1, value2, "fdid");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNull() {
            addCriterion("good_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNotNull() {
            addCriterion("good_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNameEqualTo(String value) {
            addCriterion("good_name =", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotEqualTo(String value) {
            addCriterion("good_name <>", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThan(String value) {
            addCriterion("good_name >", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("good_name >=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThan(String value) {
            addCriterion("good_name <", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThanOrEqualTo(String value) {
            addCriterion("good_name <=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLike(String value) {
            addCriterion("good_name like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotLike(String value) {
            addCriterion("good_name not like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameIn(List<String> values) {
            addCriterion("good_name in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotIn(List<String> values) {
            addCriterion("good_name not in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameBetween(String value1, String value2) {
            addCriterion("good_name between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotBetween(String value1, String value2) {
            addCriterion("good_name not between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGtidIsNull() {
            addCriterion("gtid is null");
            return (Criteria) this;
        }

        public Criteria andGtidIsNotNull() {
            addCriterion("gtid is not null");
            return (Criteria) this;
        }

        public Criteria andGtidEqualTo(Integer value) {
            addCriterion("gtid =", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidNotEqualTo(Integer value) {
            addCriterion("gtid <>", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidGreaterThan(Integer value) {
            addCriterion("gtid >", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gtid >=", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidLessThan(Integer value) {
            addCriterion("gtid <", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidLessThanOrEqualTo(Integer value) {
            addCriterion("gtid <=", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidIn(List<Integer> values) {
            addCriterion("gtid in", values, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidNotIn(List<Integer> values) {
            addCriterion("gtid not in", values, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidBetween(Integer value1, Integer value2) {
            addCriterion("gtid between", value1, value2, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidNotBetween(Integer value1, Integer value2) {
            addCriterion("gtid not between", value1, value2, "gtid");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Integer value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Integer value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Integer value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Integer value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Integer> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Integer> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Integer value1, Integer value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andPreferenceIsNull() {
            addCriterion("preference is null");
            return (Criteria) this;
        }

        public Criteria andPreferenceIsNotNull() {
            addCriterion("preference is not null");
            return (Criteria) this;
        }

        public Criteria andPreferenceEqualTo(Integer value) {
            addCriterion("preference =", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceNotEqualTo(Integer value) {
            addCriterion("preference <>", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceGreaterThan(Integer value) {
            addCriterion("preference >", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("preference >=", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceLessThan(Integer value) {
            addCriterion("preference <", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceLessThanOrEqualTo(Integer value) {
            addCriterion("preference <=", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceIn(List<Integer> values) {
            addCriterion("preference in", values, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceNotIn(List<Integer> values) {
            addCriterion("preference not in", values, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceBetween(Integer value1, Integer value2) {
            addCriterion("preference between", value1, value2, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceNotBetween(Integer value1, Integer value2) {
            addCriterion("preference not between", value1, value2, "preference");
            return (Criteria) this;
        }

        public Criteria andIfPromotionIsNull() {
            addCriterion("if_promotion is null");
            return (Criteria) this;
        }

        public Criteria andIfPromotionIsNotNull() {
            addCriterion("if_promotion is not null");
            return (Criteria) this;
        }

        public Criteria andIfPromotionEqualTo(Integer value) {
            addCriterion("if_promotion =", value, "ifPromotion");
            return (Criteria) this;
        }

        public Criteria andIfPromotionNotEqualTo(Integer value) {
            addCriterion("if_promotion <>", value, "ifPromotion");
            return (Criteria) this;
        }

        public Criteria andIfPromotionGreaterThan(Integer value) {
            addCriterion("if_promotion >", value, "ifPromotion");
            return (Criteria) this;
        }

        public Criteria andIfPromotionGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_promotion >=", value, "ifPromotion");
            return (Criteria) this;
        }

        public Criteria andIfPromotionLessThan(Integer value) {
            addCriterion("if_promotion <", value, "ifPromotion");
            return (Criteria) this;
        }

        public Criteria andIfPromotionLessThanOrEqualTo(Integer value) {
            addCriterion("if_promotion <=", value, "ifPromotion");
            return (Criteria) this;
        }

        public Criteria andIfPromotionIn(List<Integer> values) {
            addCriterion("if_promotion in", values, "ifPromotion");
            return (Criteria) this;
        }

        public Criteria andIfPromotionNotIn(List<Integer> values) {
            addCriterion("if_promotion not in", values, "ifPromotion");
            return (Criteria) this;
        }

        public Criteria andIfPromotionBetween(Integer value1, Integer value2) {
            addCriterion("if_promotion between", value1, value2, "ifPromotion");
            return (Criteria) this;
        }

        public Criteria andIfPromotionNotBetween(Integer value1, Integer value2) {
            addCriterion("if_promotion not between", value1, value2, "ifPromotion");
            return (Criteria) this;
        }

        public Criteria andLastSalesIsNull() {
            addCriterion("last_sales is null");
            return (Criteria) this;
        }

        public Criteria andLastSalesIsNotNull() {
            addCriterion("last_sales is not null");
            return (Criteria) this;
        }

        public Criteria andLastSalesEqualTo(Integer value) {
            addCriterion("last_sales =", value, "lastSales");
            return (Criteria) this;
        }

        public Criteria andLastSalesNotEqualTo(Integer value) {
            addCriterion("last_sales <>", value, "lastSales");
            return (Criteria) this;
        }

        public Criteria andLastSalesGreaterThan(Integer value) {
            addCriterion("last_sales >", value, "lastSales");
            return (Criteria) this;
        }

        public Criteria andLastSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_sales >=", value, "lastSales");
            return (Criteria) this;
        }

        public Criteria andLastSalesLessThan(Integer value) {
            addCriterion("last_sales <", value, "lastSales");
            return (Criteria) this;
        }

        public Criteria andLastSalesLessThanOrEqualTo(Integer value) {
            addCriterion("last_sales <=", value, "lastSales");
            return (Criteria) this;
        }

        public Criteria andLastSalesIn(List<Integer> values) {
            addCriterion("last_sales in", values, "lastSales");
            return (Criteria) this;
        }

        public Criteria andLastSalesNotIn(List<Integer> values) {
            addCriterion("last_sales not in", values, "lastSales");
            return (Criteria) this;
        }

        public Criteria andLastSalesBetween(Integer value1, Integer value2) {
            addCriterion("last_sales between", value1, value2, "lastSales");
            return (Criteria) this;
        }

        public Criteria andLastSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("last_sales not between", value1, value2, "lastSales");
            return (Criteria) this;
        }

        public Criteria andCurrentSalesIsNull() {
            addCriterion("current_sales is null");
            return (Criteria) this;
        }

        public Criteria andCurrentSalesIsNotNull() {
            addCriterion("current_sales is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentSalesEqualTo(Integer value) {
            addCriterion("current_sales =", value, "currentSales");
            return (Criteria) this;
        }

        public Criteria andCurrentSalesNotEqualTo(Integer value) {
            addCriterion("current_sales <>", value, "currentSales");
            return (Criteria) this;
        }

        public Criteria andCurrentSalesGreaterThan(Integer value) {
            addCriterion("current_sales >", value, "currentSales");
            return (Criteria) this;
        }

        public Criteria andCurrentSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_sales >=", value, "currentSales");
            return (Criteria) this;
        }

        public Criteria andCurrentSalesLessThan(Integer value) {
            addCriterion("current_sales <", value, "currentSales");
            return (Criteria) this;
        }

        public Criteria andCurrentSalesLessThanOrEqualTo(Integer value) {
            addCriterion("current_sales <=", value, "currentSales");
            return (Criteria) this;
        }

        public Criteria andCurrentSalesIn(List<Integer> values) {
            addCriterion("current_sales in", values, "currentSales");
            return (Criteria) this;
        }

        public Criteria andCurrentSalesNotIn(List<Integer> values) {
            addCriterion("current_sales not in", values, "currentSales");
            return (Criteria) this;
        }

        public Criteria andCurrentSalesBetween(Integer value1, Integer value2) {
            addCriterion("current_sales between", value1, value2, "currentSales");
            return (Criteria) this;
        }

        public Criteria andCurrentSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("current_sales not between", value1, value2, "currentSales");
            return (Criteria) this;
        }

        public Criteria andCountSalesIsNull() {
            addCriterion("count_sales is null");
            return (Criteria) this;
        }

        public Criteria andCountSalesIsNotNull() {
            addCriterion("count_sales is not null");
            return (Criteria) this;
        }

        public Criteria andCountSalesEqualTo(Integer value) {
            addCriterion("count_sales =", value, "countSales");
            return (Criteria) this;
        }

        public Criteria andCountSalesNotEqualTo(Integer value) {
            addCriterion("count_sales <>", value, "countSales");
            return (Criteria) this;
        }

        public Criteria andCountSalesGreaterThan(Integer value) {
            addCriterion("count_sales >", value, "countSales");
            return (Criteria) this;
        }

        public Criteria andCountSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_sales >=", value, "countSales");
            return (Criteria) this;
        }

        public Criteria andCountSalesLessThan(Integer value) {
            addCriterion("count_sales <", value, "countSales");
            return (Criteria) this;
        }

        public Criteria andCountSalesLessThanOrEqualTo(Integer value) {
            addCriterion("count_sales <=", value, "countSales");
            return (Criteria) this;
        }

        public Criteria andCountSalesIn(List<Integer> values) {
            addCriterion("count_sales in", values, "countSales");
            return (Criteria) this;
        }

        public Criteria andCountSalesNotIn(List<Integer> values) {
            addCriterion("count_sales not in", values, "countSales");
            return (Criteria) this;
        }

        public Criteria andCountSalesBetween(Integer value1, Integer value2) {
            addCriterion("count_sales between", value1, value2, "countSales");
            return (Criteria) this;
        }

        public Criteria andCountSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("count_sales not between", value1, value2, "countSales");
            return (Criteria) this;
        }

        public Criteria andSummeryIsNull() {
            addCriterion("summery is null");
            return (Criteria) this;
        }

        public Criteria andSummeryIsNotNull() {
            addCriterion("summery is not null");
            return (Criteria) this;
        }

        public Criteria andSummeryEqualTo(String value) {
            addCriterion("summery =", value, "summery");
            return (Criteria) this;
        }

        public Criteria andSummeryNotEqualTo(String value) {
            addCriterion("summery <>", value, "summery");
            return (Criteria) this;
        }

        public Criteria andSummeryGreaterThan(String value) {
            addCriterion("summery >", value, "summery");
            return (Criteria) this;
        }

        public Criteria andSummeryGreaterThanOrEqualTo(String value) {
            addCriterion("summery >=", value, "summery");
            return (Criteria) this;
        }

        public Criteria andSummeryLessThan(String value) {
            addCriterion("summery <", value, "summery");
            return (Criteria) this;
        }

        public Criteria andSummeryLessThanOrEqualTo(String value) {
            addCriterion("summery <=", value, "summery");
            return (Criteria) this;
        }

        public Criteria andSummeryLike(String value) {
            addCriterion("summery like", value, "summery");
            return (Criteria) this;
        }

        public Criteria andSummeryNotLike(String value) {
            addCriterion("summery not like", value, "summery");
            return (Criteria) this;
        }

        public Criteria andSummeryIn(List<String> values) {
            addCriterion("summery in", values, "summery");
            return (Criteria) this;
        }

        public Criteria andSummeryNotIn(List<String> values) {
            addCriterion("summery not in", values, "summery");
            return (Criteria) this;
        }

        public Criteria andSummeryBetween(String value1, String value2) {
            addCriterion("summery between", value1, value2, "summery");
            return (Criteria) this;
        }

        public Criteria andSummeryNotBetween(String value1, String value2) {
            addCriterion("summery not between", value1, value2, "summery");
            return (Criteria) this;
        }

        public Criteria andAttr1IsNull() {
            addCriterion("attr1 is null");
            return (Criteria) this;
        }

        public Criteria andAttr1IsNotNull() {
            addCriterion("attr1 is not null");
            return (Criteria) this;
        }

        public Criteria andAttr1EqualTo(String value) {
            addCriterion("attr1 =", value, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr1NotEqualTo(String value) {
            addCriterion("attr1 <>", value, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr1GreaterThan(String value) {
            addCriterion("attr1 >", value, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr1GreaterThanOrEqualTo(String value) {
            addCriterion("attr1 >=", value, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr1LessThan(String value) {
            addCriterion("attr1 <", value, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr1LessThanOrEqualTo(String value) {
            addCriterion("attr1 <=", value, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr1Like(String value) {
            addCriterion("attr1 like", value, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr1NotLike(String value) {
            addCriterion("attr1 not like", value, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr1In(List<String> values) {
            addCriterion("attr1 in", values, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr1NotIn(List<String> values) {
            addCriterion("attr1 not in", values, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr1Between(String value1, String value2) {
            addCriterion("attr1 between", value1, value2, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr1NotBetween(String value1, String value2) {
            addCriterion("attr1 not between", value1, value2, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr2IsNull() {
            addCriterion("attr2 is null");
            return (Criteria) this;
        }

        public Criteria andAttr2IsNotNull() {
            addCriterion("attr2 is not null");
            return (Criteria) this;
        }

        public Criteria andAttr2EqualTo(String value) {
            addCriterion("attr2 =", value, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr2NotEqualTo(String value) {
            addCriterion("attr2 <>", value, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr2GreaterThan(String value) {
            addCriterion("attr2 >", value, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr2GreaterThanOrEqualTo(String value) {
            addCriterion("attr2 >=", value, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr2LessThan(String value) {
            addCriterion("attr2 <", value, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr2LessThanOrEqualTo(String value) {
            addCriterion("attr2 <=", value, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr2Like(String value) {
            addCriterion("attr2 like", value, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr2NotLike(String value) {
            addCriterion("attr2 not like", value, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr2In(List<String> values) {
            addCriterion("attr2 in", values, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr2NotIn(List<String> values) {
            addCriterion("attr2 not in", values, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr2Between(String value1, String value2) {
            addCriterion("attr2 between", value1, value2, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr2NotBetween(String value1, String value2) {
            addCriterion("attr2 not between", value1, value2, "attr2");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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