package cn.yt4j.tool.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author yang tool for java
 * @param <T>
 */
@Data
@ApiModel(description = "分页返回")
public class PageVO<T> implements Serializable {

    private static final long serialVersionUID = -7837873337335528451L;
    @ApiModelProperty("总条数")
    private Long total;
    @ApiModelProperty("总页数")
    private Integer pages;
    @ApiModelProperty("当前页")
    private Integer currPage;
    @ApiModelProperty("显示数据")
    private List<T> list;

    public PageVO(Long total, Integer pages, Integer currPage, List<T> list) {
        this.total = total;
        this.pages = pages;
        this.currPage = currPage;
        this.list = list;
    }
}
