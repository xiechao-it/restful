package com.bestpay.spring.vo;

import java.io.Serializable;

/**
 * Desc:功能性描述
 * User: xiechao
 * Date: 14-6-5
 * Time: 下午2:11
 * 版权所有 中国电信天翼电子商务有限公司
 */
public class User implements Serializable {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private String sex;
    private String age;
    private String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString(){
       return "id:"+id+" name:"+name +" age:"+age+" sex:"+sex+" title:"+title;
    }
}
