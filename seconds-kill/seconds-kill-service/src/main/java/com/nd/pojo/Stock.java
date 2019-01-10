package com.nd.pojo;

import java.io.Serializable;

/**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date : ${date} ${time}
 * @author : 新梦想IT教育.陈超
 * @version V1.0
 */
public class Stock implements Serializable{
    private static final long serialVersionUID = -8437012513227627973L;
    private Integer id;

    private String name;

    private Integer count;

    private Integer sale;

    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}