package net.hnjd.pojo;

import java.util.List;

/**
 * @author simba@onlying.cn
 * @date 2020/10/21 21:39
 */
public class PageResult<T> {

    private int code;//0success 1error
    private String msg;//错误信息
    private int count;//总记录数:30000
    private List<T> data;

    public static <T> PageResult success(int count) {
        PageResult<T> pageResult = new PageResult<>();
        pageResult.setCode(0);
        pageResult.setMsg("成功");
        pageResult.setCount(count);
        return pageResult;
    }

    public static <T> PageResult error(int count){
        PageResult<T> pageResult = new PageResult<>();
        pageResult.setCode(1);
        pageResult.setMsg("错误");
        pageResult.setCount(count);
        return pageResult;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
