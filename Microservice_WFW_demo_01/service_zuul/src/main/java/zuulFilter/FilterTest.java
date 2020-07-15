package zuulFilter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class FilterTest extends ZuulFilter {
    /* 过滤器 类型*/
    @Override
    public String filterType() {
        return "pre";
    }

    /* 过滤器 优先执行顺序 数字越小 优先执行
    * 为了扩展性 我们设置为10 */
    @Override
    public int filterOrder() {
        return 10;
    }

    /* 是否执行run方法 */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /* 过滤器 业务逻辑编辑 */
    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String name = request.getParameter("name");
        if (StringUtils.isBlank(name)){
            //拦截不转发请求
            context.setSendZuulResponse(false);
            context.setResponseBody("error");
        }
        return null;
    }
}
