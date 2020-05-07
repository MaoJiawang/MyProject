package com.xp.entity;

/**
 * @Author Yz
 * @Date 2020/4/28 15:00
 * @Company Atu
 * @Version 1.0
 **/

public class testBean {

    private String 编码;
    private String 名称;
    private String 短名;

    public testBean() {
        this.编码 = 编码;
        this.名称 = 名称;
        this.短名 = 短名;
    }


    public String get编码() {
        return 编码;
    }

    public void set编码(String 编码) {
        this.编码 = 编码;
    }

    public String get名称() {
        return 名称;
    }

    public void set名称(String 名称) {
        this.名称 = 名称;
    }

    public String get短名() {
        return 短名;
    }

    public void set短名(String 短名) {
        this.短名 = 短名;
    }

    @Override
    public String toString() {
        return "testBean{" +
                "编码='" + 编码 + '\'' +
                ", 名称='" + 名称 + '\'' +
                ", 短名='" + 短名 + '\'' +
                '}';
    }
}
