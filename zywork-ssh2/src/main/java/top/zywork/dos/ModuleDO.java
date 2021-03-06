package top.zywork.dos;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * 模块DO<br />
 * 创建于2017-09-11
 *
 * @author 王振宇
 * @version 1.0
 */
@Entity
@Table(name = "t_module")
public class ModuleDO extends BaseDO {
    private static final long serialVersionUID = 7446402517629565141L;

    private Long id;
    private String title;
    private String description;
    private Date createTime;
    private Integer isActive;

    /**
     * 一个模块包含有多个权限
     */
    private Set<PermissionDO> permissionDOSet;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "create_time")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Column(name = "is_active")
    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    @OneToMany
    @JoinColumn(name = "module_id")
    public Set<PermissionDO> getPermissionDOSet() {
        return permissionDOSet;
    }

    public void setPermissionDOSet(Set<PermissionDO> permissionDOSet) {
        this.permissionDOSet = permissionDOSet;
    }
}
