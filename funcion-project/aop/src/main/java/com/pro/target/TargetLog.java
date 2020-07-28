package com.pro.target;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetLog {

    // descption 描述方法的实际作用
    String description()  default "";

}
