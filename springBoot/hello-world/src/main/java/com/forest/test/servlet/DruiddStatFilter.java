package com.forest.test.servlet;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**druid 过滤器
 * Created by songlin on 16/05/2017.
 */
@WebFilter(filterName = "druidWebStatFilter",urlPatterns = "/*",initParams = {
        @WebInitParam(name = "exclusions",value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")//忽略资源
})
public class DruiddStatFilter extends WebStatFilter{
}
