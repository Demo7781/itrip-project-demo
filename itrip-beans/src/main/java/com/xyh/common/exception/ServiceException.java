package com.xyh.common.exception;

import com.xyh.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author xyh
 * @Dare 2020/11/7 9:09
 * @description: 自定义异常
 * @Version 1.0
 */

@Data
@ApiModel(value = "自定义service层异常")
public class ServiceException extends RuntimeException {

    @ApiModelProperty(value = "异常状态码")
    private String errorCode;

    public ServiceException(String message, String errorCode) {
        super(message); this.errorCode = errorCode;
    }

    public ServiceException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMsg()); this.errorCode = errorCodeEnum.getErrorCode();
    }
}
