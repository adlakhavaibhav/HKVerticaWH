package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.manydesigns.portofino.logic.SecurityLogic;
import com.manydesigns.portofino.security.AccessLevel;
import org.apache.shiro.SecurityUtils;

public final class page_002ddelete_002dbutton_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) config.getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(JspContext.class,jspContext);

    try {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      com.manydesigns.portofino.pageactions.AbstractPageAction actionBean = null;
      synchronized (request) {
        actionBean = (com.manydesigns.portofino.pageactions.AbstractPageAction) _jspx_page_context.getAttribute("actionBean", PageContext.REQUEST_SCOPE);
        if (actionBean == null){
          throw new java.lang.InstantiationException("bean actionBean not found within scope");
        }
      }
      out.write('\n');
 if(SecurityLogic.hasPermissions(actionBean.getPageInstance(), SecurityUtils.getSubject(), AccessLevel.EDIT)) { 
      out.write("\n");
      out.write("<button name=\"deletePage\"\n");
      out.write("        onclick=\"confirmDeletePage(\n");
      out.write("                    '");
      out.print( actionBean.getDispatch().getLastPageInstance().getPathFromRoot() );
      out.write("',\n");
      out.write("                    '");
      out.print( request.getContextPath() );
      out.write("');\n");
      out.write("                return false;\"\n");
      out.write("        type=\"submit\"\n");
      out.write("        class=\"minusthick ui-button ui-widget ui-state-default ui-corner-all ui-button-icon-only\"\n");
      out.write("        role=\"button\" aria-disabled=\"false\"\n");
      out.write("        title=\"Delete page\">\n");
      out.write("    <span class=\"ui-button-icon-primary ui-icon ui-icon-minusthick\"></span>\n");
      out.write("    <span class=\"ui-button-text\">Delete page</span>\n");
      out.write("</button>\n");
 } 
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      jspContext.getELContext().putContext(JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }
}
