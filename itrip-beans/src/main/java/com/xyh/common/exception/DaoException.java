package com.xyh.common.exception;

import com.xyh.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author xyh
 * @Dare 2020/11/7 9:06
 * @description: Dao 层异常
 * @Version 1.0
 */
@Data
@ApiModel(value = "自定义Dao层异常")
public class DaoException extends RuntimeException {

    @ApiModelProperty(value = "异常状态码")
    private String errorCode;

    public DaoException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public DaoException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMsg());
        this.errorCode = errorCodeEnum.getErrorCode();
    }
}
