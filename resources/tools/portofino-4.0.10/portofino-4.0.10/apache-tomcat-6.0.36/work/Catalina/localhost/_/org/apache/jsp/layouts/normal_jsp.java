package org.apache.jsp.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class normal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005fname_005fnobody.release();
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

      com.manydesigns.portofino.pageactions.AbstractPageAction actionBean = null;
      synchronized (request) {
        actionBean = (com.manydesigns.portofino.pageactions.AbstractPageAction) _jspx_page_context.getAttribute("actionBean", PageContext.REQUEST_SCOPE);
        if (actionBean == null){
          throw new java.lang.InstantiationException("bean actionBean not found within scope");
        }
      }
      if (_jspx_meth_stripes_005flayout_002drender_005f0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_stripes_005flayout_002drender_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-render
    net.sourceforge.stripes.tag.layout.LayoutRenderTag _jspx_th_stripes_005flayout_002drender_005f0 = (net.sourceforge.stripes.tag.layout.LayoutRenderTag) _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005fname_005fnobody.get(net.sourceforge.stripes.tag.layout.LayoutRenderTag.class);
    _jspx_th_stripes_005flayout_002drender_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002drender_005f0.setParent(null);
    // /layouts/normal.jsp(7,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002drender_005f0.setName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/skins/${skin}${actionBean.pageTemplate}/normal.jsp", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_stripes_005flayout_002drender_005f0 = _jspx_th_stripes_005flayout_002drender_005f0.doStartTag();
    if (_jspx_th_stripes_005flayout_002drender_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005fname_005fnobody.reuse(_jspx_th_stripes_005flayout_002drender_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005fname_005fnobody.reuse(_jspx_th_stripes_005flayout_002drender_005f0);
    return false;
  }
}
