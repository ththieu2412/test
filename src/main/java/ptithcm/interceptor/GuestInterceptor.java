package ptithcm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import ptithcm.entity.Account;
import ptithcm.utility.DefineAttribute;

public class GuestInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		Account acc = (Account) session.getAttribute(DefineAttribute.UserAttribute);
		if (acc != null) {
			response.sendRedirect(request.getContextPath() + "/index.htm");
			return true;
		}

		return true;

	}
}
