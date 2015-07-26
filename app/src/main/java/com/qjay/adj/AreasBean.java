package com.qjay.adj;

import java.util.List;

/**
 * Created by 仇杰 on 2015/7/25.
 * Description:
 */
public class AreasBean {
    /**
     * level : 1
     * parent_id : 1
     * name : 北京
     * postcode :
     * id : 110000
     * subarea : [{"level":"2","parent_id":"110000","name":"北京市","postcode":"100000","id":"110100","subarea":[{"level":"3","parent_id":"110100","name":"东城区","postcode":"100010","id":"110101","subarea":[]},{"level":"3","parent_id":"110100","name":"西城区","postcode":"100032","id":"110102","subarea":[]},{"level":"3","parent_id":"110100","name":"崇文区","postcode":"100061","id":"110103","subarea":[]},{"level":"3","parent_id":"110100","name":"宣武区","postcode":"100054","id":"110104","subarea":[]},{"level":"3","parent_id":"110100","name":"朝阳区","postcode":"100011","id":"110105","subarea":[]},{"level":"3","parent_id":"110100","name":"丰台区","postcode":"100071","id":"110106","subarea":[]},{"level":"3","parent_id":"110100","name":"石景山区","postcode":"100071","id":"110107","subarea":[]},{"level":"3","parent_id":"110100","name":"海淀区","postcode":"100091","id":"110108","subarea":[]},{"level":"3","parent_id":"110100","name":"门头沟区","postcode":"102300","id":"110109","subarea":[]},{"level":"3","parent_id":"110100","name":"房山区","postcode":"102488","id":"110111","subarea":[]},{"level":"3","parent_id":"110100","name":"通州区","postcode":"101100","id":"110112","subarea":[]},{"level":"3","parent_id":"110100","name":"顺义区","postcode":"101300","id":"110113","subarea":[]},{"level":"3","parent_id":"110100","name":"昌平区","postcode":"102200","id":"110114","subarea":[]},{"level":"3","parent_id":"110100","name":"大兴区","postcode":"102600","id":"110115","subarea":[]},{"level":"3","parent_id":"110100","name":"怀柔区","postcode":"101400","id":"110116","subarea":[]},{"level":"3","parent_id":"110100","name":"平谷区","postcode":"101200","id":"110117","subarea":[]},{"level":"3","parent_id":"110100","name":"密云县","postcode":"101500","id":"110228","subarea":[]},{"level":"3","parent_id":"110100","name":"延庆县","postcode":"102100","id":"110229","subarea":[]},{"level":"3","parent_id":"110100","name":"其它区","postcode":"","id":"110230","subarea":[]}]}]
     */
    private String level;
    private String parent_id;
    private String name;
    private String postcode;
    private String id;
    private List<AreasBean> subarea;

    public void setLevel(String level) {
        this.level = level;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSubarea(List<AreasBean> subarea) {
        this.subarea = subarea;
    }

    public String getLevel() {
        return level;
    }

    public String getParent_id() {
        return parent_id;
    }

    public String getName() {
        return name;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getId() {
        return id;
    }

    public List<AreasBean> getSubarea() {
        return subarea;
    }
}
