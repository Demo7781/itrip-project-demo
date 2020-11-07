package com.xyh.common.vo;

import com.xyh.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author xyh
 * @Dare 2020/11/6 15:52
 * @description: 统一返回结果集
 * @Version 1.0
 */
@Data
@ApiModel(description = "统一返回结果实体类")
@NoArgsConstructor
public class ReturnResult implements Serializable {
    private static final long serialVersionUID = -7449049908359379762L;

    @ApiModelProperty("是否成功")
    private boolean success;
    @ApiModelProperty("错误码")
    private String errorCode;
    @ApiModelProperty("返回消息")
    private String msg;
    @ApiModelProperty("返回数据")
    private Object data;


    public static ReturnResult error(){
        return error(ErrorCodeEnum.FAILED);
    }

    /**
     * 操作失败,指定错误码枚举对象
     * @param errorCodeEnum 错误码枚举对象
     * @return
     */
    public static ReturnResult error(ErrorCodeEnum errorCodeEnum){
        return error(errorCodeEnum.getErrorCode(),errorCodeEnum.getMsg(),null);
    }

    /**
     * 操作失败,指定错误码,响应信息,响应数据
     * @param errorCode 错误码
     * @param msg 响应信息
     * @param data 响应数据
     * @return
     */
    public static ReturnResult error(String errorCode,String msg,Object data){
        return new ReturnResult(false,errorCode,msg,data);
    }

    /**
     * 操作成功,无响应数据
     * @return
     */
    public static ReturnResult ok (){
        return ok(null);
    }

    /**
     * 操作成功,指定返回数据
     * @param data 响应数据
     * @return
     */
    public static ReturnResult ok(Object data){
        return ok(ErrorCodeEnum.OK.getMsg(),data);
    }

    /**
     * 操作成功,指定返回信息和数据
     * @param msg 信息
     * @param data 数据
     * @return
     */
    public static ReturnResult ok(String msg,Object data){
       return new ReturnResult(true, ErrorCodeEnum.OK.getErrorCode(),msg,data);
    }

    private ReturnResult(boolean success, String errorCode, String msg, Object data) {
        this.success = success;
        this.errorCode = errorCode;
        this.msg = msg;
        this.data = data;
    }
}
