package cn.itsource.aigou.controller;

import cn.itsource.aigou.domain.Employee;
import cn.itsource.aigou.util.AjaxResult;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @RequestMapping(value="/login",method = RequestMethod.POST)
    public AjaxResult getResult(@RequestBody Employee employee){
        if("admin".equals(employee.getName())&&"admin".equals(employee.getPassword())){
            return AjaxResult.me().setMsg("恭喜登录成功").setSuccess(true);
        }else{
            return AjaxResult.me().setSuccess(false).setMsg("登录失败");
        }
    }

}
