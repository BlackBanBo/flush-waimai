package cn.enilu.flash.bean.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;



/**
 * Created  on 2019/1/8 0002.
 *
 * @author enilu
 */
@MappedSuperclass
@Data
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @CreatedDate // 创建时间
    @Column(name = "create_time",columnDefinition="DATETIME COMMENT '创建时间/注册时间'")
    private Date createTime;
    @Column(name = "create_by",columnDefinition="bigint COMMENT '创建人'")
    @CreatedBy // 创建用户字段
    private Long createBy;
    @LastModifiedDate // 最后修改的时间
    @Column(name = "modify_time",columnDefinition="DATETIME COMMENT '最后更新时间'")
    private Date modifyTime;
    @LastModifiedBy // 最后修改的用户
    @Column(name = "modify_by",columnDefinition="bigint COMMENT '最后更新人'")
    private Long modifyBy;
}
