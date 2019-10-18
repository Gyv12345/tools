package cn.yt4j.tool.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yang tool for java
 */
@Data
@ApiModel(description = "请求响应对象")
public class ResponseVO<T> implements Serializable {


    private static final long serialVersionUID = -4973135011114558626L;
    private Integer code;
    private String message;
    private T data;

    public ResponseVO() {
    }

    public ResponseVO(int code, String msg) {
        this.code = code;
        this.message = msg;
    }

    public ResponseVO(int code, String msg, T data) {
        this.code = code;
        this.message = msg;
        this.data = data;
    }
}
