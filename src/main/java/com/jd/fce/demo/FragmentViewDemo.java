package com.jd.fce.demo;

import com.jd.fce.fragment.core.annotation.ExportMethod;
import com.jd.fce.fragment.core.annotation.ExportService;
import org.springframework.stereotype.Component;

/**
 * Created by mazhihui on 2020/3/3.
 */
@ExportService
@Component
public class FragmentViewDemo {
    private static final int SUCCESS = 1;
    @ExportMethod
    public Result sayHello(User user){
        String msg = "hello," + user.getName() + ",your age is " + user.getAge();
        return new Result(SUCCESS,msg);
    }
}
