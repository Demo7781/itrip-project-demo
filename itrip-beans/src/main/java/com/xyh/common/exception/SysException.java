package com.xyh.common.exception;

import com.xyh.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author xyh
 * @Dare 2020/11/7 9:11
 * @description:
 * @Version 1.0
 */
public class SysException extends RuntimeException {

    @ApiModelProperty(value = "异常编码")
    private String errorCode;

    public SysException(String message,String errorCode) {
        super(message); this.errorCode = errorCode;
    }

    public SysException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMsg()); this.errorCode = errorCodeEnum.getErrorCode();
    }
    
}
