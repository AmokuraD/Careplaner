package com.whu.util;

public class ResultUtil 
{
	//异常情况
 	public static Result error(int code, String msg) 
 	{
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(null);
        return result;
 	}
 
 	//正常有返回对象
    public static Result success(Object obj) 
    {
        Result result = new Result();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(obj);
        return result;
    }

    //正常无返回对象
    public static Result success() 
    {
        Result result = new Result();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(null);
        return result;
    }
}
