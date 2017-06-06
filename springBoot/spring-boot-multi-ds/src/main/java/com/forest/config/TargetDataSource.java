package com.forest.config;

import java.lang.annotation.*;

/**在方法上使用,用于指定使用哪个数据源
 * Created by songlin on 01/06/2017.
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {
    String value();
}
