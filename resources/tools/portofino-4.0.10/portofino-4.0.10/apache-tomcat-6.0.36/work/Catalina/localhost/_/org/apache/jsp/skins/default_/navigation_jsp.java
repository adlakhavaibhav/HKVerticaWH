package org.apache.jsp.skins.default_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.manydesigns.elements.xml.XhtmlBuffer;
import com.manydesigns.portofino.dispatcher.Dispatch;
import com.manydesigns.portofino.dispatcher.DispatcherUtil;
import com.manydesigns.portofino.dispatcher.PageAction;
import com.manydesigns.portofino.logic.SecurityLogic;
import com.manydesigns.portofino.navigation.Navigation;
import com.manydesigns.portofino.navigation.NavigationItem;
import org.apache.shiro.SecurityUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class navigation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      com.manydesigns.portofino.application.Application app = null;
      synchronized (request) {
        app = (com.manydesigns.portofino.application.Application) _jspx_page_context.getAttribute("app", PageContext.REQUEST_SCOPE);
        if (app == null){
          throw new java.lang.InstantiationException("bean app not found within scope");
        }
      }
      out.write('\n');
      net.sourceforge.stripes.action.ActionBean actionBean = null;
      synchronized (request) {
        actionBean = (net.sourceforge.stripes.action.ActionBean) _jspx_page_context.getAttribute("actionBean", PageContext.REQUEST_SCOPE);
        if (actionBean == null){
          throw new java.lang.InstantiationException("bean actionBean not found within scope");
        }
      }
      out.write('\n');

    Dispatch dispatch = DispatcherUtil.getDispatch(request, actionBean);
    boolean admin = SecurityLogic.isAdministrator(request);
    int startingLevel = 0;
    int maxLevel = 10000;
    String param = request.getParameter("navigation.startingLevel");
    if(param != null) {
        startingLevel = Integer.parseInt(param);
    }
    param = request.getParameter("navigation.maxLevel");
    if(param != null) {
        maxLevel = Integer.parseInt(param);
    }

    Navigation navigation = new Navigation(app, dispatch, SecurityUtils.getSubject(), admin);
    List<NavigationItem> navigationItems;
    NavigationItem rootNavigationItem = navigation.getRootNavigationItem();
    if (rootNavigationItem.isGhost() && !rootNavigationItem.isSelected()) {
        navigationItems = rootNavigationItem.getChildNavigationItems();
    } else {
        navigationItems = new ArrayList<NavigationItem>(1);
        navigationItems.add(rootNavigationItem);
    }
    boolean first = true;
    int level = 0;
    while (!navigationItems.isEmpty()) {
        NavigationItem nextNavigationItem = null;
        if(level >= startingLevel) {
            if (first) {
                first = false;
            } else {
                
      out.write("<hr>");

            }
            
      out.write("<ul>");

        }
        for (NavigationItem current : navigationItems) {
            XhtmlBuffer xb = new XhtmlBuffer(out);
            if(level >= startingLevel) {
                xb.openElement("li");
                if (current.isInPath()) {
                    if (current.isSelected()) {
                        xb.addAttribute("class", "selected");
                    } else {
                        xb.addAttribute("class", "path");
                    }
                    nextNavigationItem = current;
                }
                xb.writeAnchor(current.getPath(), current.getPage().getTitle());
                xb.closeElement("li");
            } else if (current.isInPath()) {
                nextNavigationItem = current;
            }
        }
        if(level >= startingLevel) {
            
      out.write("</ul>");

        }
        if (nextNavigationItem != null && level < maxLevel) {
            navigationItems = nextNavigationItem.getChildNavigationItems();
        } else {
            navigationItems = Collections.EMPTY_LIST;
        }
        level++;
    }

      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
