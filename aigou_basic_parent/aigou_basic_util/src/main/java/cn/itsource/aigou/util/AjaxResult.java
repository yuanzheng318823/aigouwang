package cn.itsource.aigou.util;

public class AjaxResult {
    private boolean success=true;//操作是否成功

    private  String msg="操作成功";//返回文本字符串的信息
    private Object object;

    public static AjaxResult me(){
        return new AjaxResult();
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public AjaxResult(String msg) {
        this.success = false;
        this.msg = msg;
    }

    public AjaxResult() {
    }

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}
