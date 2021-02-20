package cn.enilu.flash.bean.entity.system;

import cn.enilu.flash.bean.entity.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Transient;

@Data
@Entity(name="t_sys_file_info")
@Table(appliesTo = "t_sys_file_info",comment = "文件")
@EntityListeners(AuditingEntityListener.class)
public class FileInfo extends BaseEntity {
    @Column(name = "original_file_name",columnDefinition = "VARCHAR(255) COMMENT '原文件名'")
    private String originalFileName;
    @Column(name = "real_file_name",columnDefinition = "VARCHAR(255) COMMENT '实际文件名'")
    private String realFileName;
    @Transient // 该字段并非数据库表的映射字段，ORM框架生成表时将忽略该属性
    private String ablatePath;

}
