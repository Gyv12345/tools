package cn.yt4j.tool.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 请求DTO类
 * @author yang tool for java
 */
@Data
@ApiModel("分页请求对象")
public class PageDTO<T> implements Serializable {

    private static final long serialVersionUID = 5799505573612410204L;
    @ApiModelProperty(value = "当前页数")
    private Integer page;
    @ApiModelProperty(value = "显示条数")
    private Integer limit;
    @ApiModelProperty("查询参数")
    private T data;
}
