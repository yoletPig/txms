package com.ict.txms.model;

public class Menu {
    private Integer id;

    private String url;

    private String path;

    private String component;

    private String name;

    private String icocls;

    private Integer requireauth;

    private Integer parentid;

    private Integer enabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component == null ? null : component.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIcocls() {
        return icocls;
    }

    public void setIcocls(String icocls) {
        this.icocls = icocls == null ? null : icocls.trim();
    }

    public Integer getRequireauth() {
        return requireauth;
    }

    public void setRequireauth(Integer requireauth) {
        this.requireauth = requireauth;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}