package com.github.jhinor.authority.bean;

import javax.persistence.*;

/**
 * @author shiyu.long
 */
@Table
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true)
    private String url;
    @Column(nullable = false, unique = true)
    private String name;
    @ManyToOne
    private Menu parent;
    @OneToOne
    @JoinColumn(unique = true, nullable = false)
    private Permission permission;

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
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menu getParent() {
        return parent;
    }

    public void setParent(Menu parent) {
        this.parent = parent;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }
}
