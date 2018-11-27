package com.qfedu.shop.utils;

import com.qfedu.shop.vo.ResponseVo;

public class VoUtil {
    public static ResponseVo setOK(String msg){
        return new ResponseVo(1000,msg,null);
    }
    public static ResponseVo setERROR(String msg){
        return new ResponseVo(2000,msg,null);
    }

}
