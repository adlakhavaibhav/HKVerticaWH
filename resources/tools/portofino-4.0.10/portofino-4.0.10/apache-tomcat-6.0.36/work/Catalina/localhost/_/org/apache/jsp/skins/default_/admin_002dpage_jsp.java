package org.apache.jsp.skins.default_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_002dpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tags/buttons.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flayout_002ddefinition;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmde_005fsessionMessages_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fstripes_005flayout_002ddefinition = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmde_005fsessionMessages_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fstripes_005flayout_002ddefinition.release();
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.release();
    _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005fmde_005fsessionMessages_005fnobody.release();
    _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody.release();
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

      if (_jspx_meth_stripes_005flayout_002ddefinition_005f0(_jspx_page_context))
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

  private boolean _jspx_meth_stripes_005flayout_002ddefinition_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  stripes:layout-definition
    net.sourceforge.stripes.tag.layout.LayoutDefinitionTag _jspx_th_stripes_005flayout_002ddefinition_005f0 = (net.sourceforge.stripes.tag.layout.LayoutDefinitionTag) _005fjspx_005ftagPool_005fstripes_005flayout_002ddefinition.get(net.sourceforge.stripes.tag.layout.LayoutDefinitionTag.class);
    _jspx_th_stripes_005flayout_002ddefinition_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002ddefinition_005f0.setParent(null);
    int _jspx_eval_stripes_005flayout_002ddefinition_005f0 = _jspx_th_stripes_005flayout_002ddefinition_005f0.doStartTag();
    if (_jspx_eval_stripes_005flayout_002ddefinition_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("<!doctype html>\n");
      out.write("    <html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_stripes_005flayout_002dcomponent_005f0(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("        <title>\n");
      out.write("            ");
      if (_jspx_meth_stripes_005flayout_002dcomponent_005f1(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("        </title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"yui-skin-sam\">\n");
      out.write("    <div id=\"doc3\" class=\"yui-t2\">\n");
      out.write("        <div id=\"hd\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"bd\">\n");
      out.write("            <div id=\"yui-main\">\n");
      out.write("                <div id=\"content\" class=\"yui-b\">\n");
      out.write("                    ");
      com.manydesigns.portofino.actions.admin.AdminAction actionBean = null;
      synchronized (request) {
        actionBean = (com.manydesigns.portofino.actions.admin.AdminAction) _jspx_page_context.getAttribute("actionBean", PageContext.REQUEST_SCOPE);
        if (actionBean == null){
          throw new java.lang.InstantiationException("bean actionBean not found within scope");
        }
      }
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_stripes_005fform_005f0(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"sidebar\" class=\"yui-b adminSidebar\">\n");
      out.write("                <ul>\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"navigationHeader\">Security</div>\n");
      out.write("                        <ul>\n");
      out.write("                            ");
      if (_jspx_meth_stripes_005flayout_002drender_005f0(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"navigationHeader\">Configuration</div>\n");
      out.write("                        <ul>\n");
      out.write("                            ");
      if (_jspx_meth_stripes_005flayout_002drender_005f1(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_stripes_005flayout_002drender_005f2(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"navigationHeader\">Data modeling</div>\n");
      out.write("                        <ul>\n");
      out.write("                            ");
      if (_jspx_meth_stripes_005flayout_002drender_005f3(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_stripes_005flayout_002drender_005f4(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_stripes_005flayout_002drender_005f5(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_stripes_005flayout_002drender_005f6(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                fixSideBar();\n");
      out.write("            </script>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"ft\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("    </html>\n");
    }
    if (_jspx_th_stripes_005flayout_002ddefinition_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002ddefinition.reuse(_jspx_th_stripes_005flayout_002ddefinition_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002ddefinition.reuse(_jspx_th_stripes_005flayout_002ddefinition_005f0);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002dcomponent_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002ddefinition_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f0 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_stripes_005flayout_002dcomponent_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002dcomponent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
    // /skins/default/admin-page.jsp(11,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f0.setName("customScripts");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f0 = _jspx_th_stripes_005flayout_002dcomponent_005f0.doStartTag();
    if (_jspx_th_stripes_005flayout_002dcomponent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f0);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002dcomponent_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002ddefinition_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f1 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_stripes_005flayout_002dcomponent_005f1.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002dcomponent_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
    // /skins/default/admin-page.jsp(13,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f1.setName("pageTitle");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f1 = _jspx_th_stripes_005flayout_002dcomponent_005f1.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("                Page title\n");
      out.write("            ");
    }
    if (_jspx_th_stripes_005flayout_002dcomponent_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f1);
    return false;
  }

  private boolean _jspx_meth_stripes_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002ddefinition_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:form
    net.sourceforge.stripes.tag.FormTag _jspx_th_stripes_005fform_005f0 = (net.sourceforge.stripes.tag.FormTag) _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fenctype_005faction.get(net.sourceforge.stripes.tag.FormTag.class);
    _jspx_th_stripes_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
    // /skins/default/admin-page.jsp(27,20) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fform_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.actionPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /skins/default/admin-page.jsp(27,20) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fform_005f0.setMethod("post");
    // /skins/default/admin-page.jsp(27,20) name = enctype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fform_005f0.setEnctype("multipart/form-data");
    int[] _jspx_push_body_count_stripes_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fform_005f0 = _jspx_th_stripes_005fform_005f0.doStartTag();
      if (_jspx_eval_stripes_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_stripes_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_stripes_005fform_005f0[0]++;
          _jspx_th_stripes_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_stripes_005fform_005f0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_stripes_005flayout_002dcomponent_005f2(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("                        <div class=\"contentBody\">\n");
          out.write("                            <div class=\"portletWrapper\">\n");
          out.write("                                <div class=\"portlet\">\n");
          out.write("                                    ");
          if (_jspx_meth_mde_005fsessionMessages_005f0(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("                                    <div class=\"portletHeader\">\n");
          out.write("                                        ");
          if (_jspx_meth_stripes_005flayout_002dcomponent_005f4(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"portletBody\">\n");
          out.write("                                        ");
          if (_jspx_meth_stripes_005flayout_002dcomponent_005f6(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"portletFooter\">\n");
          out.write("                                        ");
          if (_jspx_meth_stripes_005flayout_002dcomponent_005f7(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        ");
          if (_jspx_meth_stripes_005flayout_002dcomponent_005f8(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_stripes_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_stripes_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_stripes_005fform_005f0[0]--;
        }
      }
      if (_jspx_th_stripes_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fenctype_005faction.reuse(_jspx_th_stripes_005fform_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002dcomponent_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f2 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_stripes_005flayout_002dcomponent_005f2.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002dcomponent_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /skins/default/admin-page.jsp(28,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f2.setName("contentHeaderContainer");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f2 = _jspx_th_stripes_005flayout_002dcomponent_005f2.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("                            <div class=\"contentHeader\">\n");
      out.write("                                ");
      if (_jspx_meth_stripes_005flayout_002dcomponent_005f3(_jspx_th_stripes_005flayout_002dcomponent_005f2, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
        return true;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        ");
    }
    if (_jspx_th_stripes_005flayout_002dcomponent_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f2);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002dcomponent_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f3 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_stripes_005flayout_002dcomponent_005f3.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002dcomponent_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f2);
    // /skins/default/admin-page.jsp(30,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f3.setName("contentHeader");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f3 = _jspx_th_stripes_005flayout_002dcomponent_005f3.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("                                    Content header\n");
      out.write("                                ");
    }
    if (_jspx_th_stripes_005flayout_002dcomponent_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f3);
    return false;
  }

  private boolean _jspx_meth_mde_005fsessionMessages_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mde:sessionMessages
    com.manydesigns.elements.servlet.SessionMessagesTag _jspx_th_mde_005fsessionMessages_005f0 = (com.manydesigns.elements.servlet.SessionMessagesTag) _005fjspx_005ftagPool_005fmde_005fsessionMessages_005fnobody.get(com.manydesigns.elements.servlet.SessionMessagesTag.class);
    _jspx_th_mde_005fsessionMessages_005f0.setPageContext(_jspx_page_context);
    _jspx_th_mde_005fsessionMessages_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    int _jspx_eval_mde_005fsessionMessages_005f0 = _jspx_th_mde_005fsessionMessages_005f0.doStartTag();
    if (_jspx_th_mde_005fsessionMessages_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmde_005fsessionMessages_005fnobody.reuse(_jspx_th_mde_005fsessionMessages_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fmde_005fsessionMessages_005fnobody.reuse(_jspx_th_mde_005fsessionMessages_005f0);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002dcomponent_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f4 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_stripes_005flayout_002dcomponent_005f4.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002dcomponent_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /skins/default/admin-page.jsp(40,40) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f4.setName("portletHeader");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f4 = _jspx_th_stripes_005flayout_002dcomponent_005f4.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("                                            <div>\n");
      out.write("                                                <div class=\"portletTitle\">\n");
      out.write("                                                    <h1>\n");
      out.write("                                                    ");
      if (_jspx_meth_stripes_005flayout_002dcomponent_005f5(_jspx_th_stripes_005flayout_002dcomponent_005f4, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
        return true;
      out.write("\n");
      out.write("                                                    </h1>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"portletHeaderButtons\">\n");
      out.write("                                                    ");
      if (_jspx_meth_portofino_005fbuttons_005f0(_jspx_th_stripes_005flayout_002dcomponent_005f4, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
        return true;
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        ");
    }
    if (_jspx_th_stripes_005flayout_002dcomponent_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f4);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002dcomponent_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f5 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_stripes_005flayout_002dcomponent_005f5.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002dcomponent_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f4);
    // /skins/default/admin-page.jsp(44,52) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f5.setName("portletTitle");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f5 = _jspx_th_stripes_005flayout_002dcomponent_005f5.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("                                                        portletTitle\n");
      out.write("                                                    ");
    }
    if (_jspx_th_stripes_005flayout_002dcomponent_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f5);
    return false;
  }

  private boolean _jspx_meth_portofino_005fbuttons_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portofino:buttons
    org.apache.jsp.tag.web.buttons_tag _jspx_th_portofino_005fbuttons_005f0 = new org.apache.jsp.tag.web.buttons_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_portofino_005fbuttons_005f0);
    _jspx_th_portofino_005fbuttons_005f0.setJspContext(_jspx_page_context);
    _jspx_th_portofino_005fbuttons_005f0.setParent(_jspx_th_stripes_005flayout_002dcomponent_005f4);
    // /skins/default/admin-page.jsp(50,52) name = list type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_portofino_005fbuttons_005f0.setList("portletHeaderButtons");
    _jspx_th_portofino_005fbuttons_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_portofino_005fbuttons_005f0);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002dcomponent_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f6 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_stripes_005flayout_002dcomponent_005f6.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002dcomponent_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /skins/default/admin-page.jsp(56,40) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f6.setName("portletBody");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f6 = _jspx_th_stripes_005flayout_002dcomponent_005f6.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("                                            Portlet body\n");
      out.write("                                        ");
    }
    if (_jspx_th_stripes_005flayout_002dcomponent_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f6);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002dcomponent_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f7 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_stripes_005flayout_002dcomponent_005f7.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002dcomponent_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /skins/default/admin-page.jsp(61,40) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f7.setName("portletFooter");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f7 = _jspx_th_stripes_005flayout_002dcomponent_005f7.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("                                        ");
    }
    if (_jspx_th_stripes_005flayout_002dcomponent_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f7);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002dcomponent_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f8 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_stripes_005flayout_002dcomponent_005f8.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002dcomponent_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /skins/default/admin-page.jsp(67,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f8.setName("contentFooterContainer");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f8 = _jspx_th_stripes_005flayout_002dcomponent_005f8.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("                            <div class=\"contentFooter\">\n");
      out.write("                                ");
      if (_jspx_meth_stripes_005flayout_002dcomponent_005f9(_jspx_th_stripes_005flayout_002dcomponent_005f8, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
        return true;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        ");
    }
    if (_jspx_th_stripes_005flayout_002dcomponent_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f8);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002dcomponent_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f8, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f9 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_stripes_005flayout_002dcomponent_005f9.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002dcomponent_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f8);
    // /skins/default/admin-page.jsp(69,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f9.setName("contentFooter");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f9 = _jspx_th_stripes_005flayout_002dcomponent_005f9.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("                                    Content footer\n");
      out.write("                                ");
    }
    if (_jspx_th_stripes_005flayout_002dcomponent_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f9);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002drender_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002ddefinition_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-render
    net.sourceforge.stripes.tag.layout.LayoutRenderTag _jspx_th_stripes_005flayout_002drender_005f0 = (net.sourceforge.stripes.tag.layout.LayoutRenderTag) _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody.get(net.sourceforge.stripes.tag.layout.LayoutRenderTag.class);
    _jspx_th_stripes_005flayout_002drender_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002drender_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
    // /skins/default/admin-page.jsp(96,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002drender_005f0.setName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/skins/${skin}/adminLink.jsp", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /skins/default/admin-page.jsp(96,28) null
    _jspx_th_stripes_005flayout_002drender_005f0.setDynamicAttribute(null, "text", new String("Root permissions"));
    // /skins/default/admin-page.jsp(96,28) null
    _jspx_th_stripes_005flayout_002drender_005f0.setDynamicAttribute(null, "link", new String("/actions/admin/root-page/permissions"));
    int _jspx_eval_stripes_005flayout_002drender_005f0 = _jspx_th_stripes_005flayout_002drender_005f0.doStartTag();
    if (_jspx_th_stripes_005flayout_002drender_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody.reuse(_jspx_th_stripes_005flayout_002drender_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody.reuse(_jspx_th_stripes_005flayout_002drender_005f0);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002drender_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002ddefinition_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-render
    net.sourceforge.stripes.tag.layout.LayoutRenderTag _jspx_th_stripes_005flayout_002drender_005f1 = (net.sourceforge.stripes.tag.layout.LayoutRenderTag) _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody.get(net.sourceforge.stripes.tag.layout.LayoutRenderTag.class);
    _jspx_th_stripes_005flayout_002drender_005f1.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002drender_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
    // /skins/default/admin-page.jsp(104,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002drender_005f1.setName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/skins/${skin}/adminLink.jsp", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /skins/default/admin-page.jsp(104,28) null
    _jspx_th_stripes_005flayout_002drender_005f1.setDynamicAttribute(null, "text", new String("Settings"));
    // /skins/default/admin-page.jsp(104,28) null
    _jspx_th_stripes_005flayout_002drender_005f1.setDynamicAttribute(null, "link", new String("/actions/admin/settings"));
    int _jspx_eval_stripes_005flayout_002drender_005f1 = _jspx_th_stripes_005flayout_002drender_005f1.doStartTag();
    if (_jspx_th_stripes_005flayout_002drender_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody.reuse(_jspx_th_stripes_005flayout_002drender_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody.reuse(_jspx_th_stripes_005flayout_002drender_005f1);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002drender_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002ddefinition_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-render
    net.sourceforge.stripes.tag.layout.LayoutRenderTag _jspx_th_stripes_005flayout_002drender_005f2 = (net.sourceforge.stripes.tag.layout.LayoutRenderTag) _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody.get(net.sourceforge.stripes.tag.layout.LayoutRenderTag.class);
    _jspx_th_stripes_005flayout_002drender_005f2.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002drender_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
    // /skins/default/admin-page.jsp(107,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002drender_005f2.setName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/skins/${skin}/adminLink.jsp", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /skins/default/admin-page.jsp(107,28) null
    _jspx_th_stripes_005flayout_002drender_005f2.setDynamicAttribute(null, "text", new String("Top-level pages"));
    // /skins/default/admin-page.jsp(107,28) null
    _jspx_th_stripes_005flayout_002drender_005f2.setDynamicAttribute(null, "link", new String("/actions/admin/root-page/children"));
    int _jspx_eval_stripes_005flayout_002drender_005f2 = _jspx_th_stripes_005flayout_002drender_005f2.doStartTag();
    if (_jspx_th_stripes_005flayout_002drender_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody.reuse(_jspx_th_stripes_005flayout_002drender_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody.reuse(_jspx_th_stripes_005flayout_002drender_005f2);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002drender_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002ddefinition_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-render
    net.sourceforge.stripes.tag.layout.LayoutRenderTag _jspx_th_stripes_005flayout_002drender_005f3 = (net.sourceforge.stripes.tag.layout.LayoutRenderTag) _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody.get(net.sourceforge.stripes.tag.layout.LayoutRenderTag.class);
    _jspx_th_stripes_005flayout_002drender_005f3.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002drender_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
    // /skins/default/admin-page.jsp(115,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002drender_005f3.setName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/skins/${skin}/adminLink.jsp", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /skins/default/admin-page.jsp(115,28) null
    _jspx_th_stripes_005flayout_002drender_005f3.setDynamicAttribute(null, "text", new String("Wizard"));
    // /skins/default/admin-page.jsp(115,28) null
    _jspx_th_stripes_005flayout_002drender_005f3.setDynamicAttribute(null, "link", new String("/actions/admin/wizard"));
    int _jspx_eval_stripes_005flayout_002drender_005f3 = _jspx_th_stripes_005flayout_002drender_005f3.doStartTag();
    if (_jspx_th_stripes_005flayout_002drender_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody.reuse(_jspx_th_stripes_005flayout_002drender_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody.reuse(_jspx_th_stripes_005flayout_002drender_005f3);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002drender_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002ddefinition_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-render
    net.sourceforge.stripes.tag.layout.LayoutRenderTag _jspx_th_stripes_005flayout_002drender_005f4 = (net.sourceforge.stripes.tag.layout.LayoutRenderTag) _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody.get(net.sourceforge.stripes.tag.layout.LayoutRenderTag.class);
    _jspx_th_stripes_005flayout_002drender_005f4.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002drender_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
    // /skins/default/admin-page.jsp(118,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002drender_005f4.setName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/skins/${skin}/adminLink.jsp", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /skins/default/admin-page.jsp(118,28) null
    _jspx_th_stripes_005flayout_002drender_005f4.setDynamicAttribute(null, "text", new String("Connection providers"));
    // /skins/default/admin-page.jsp(118,28) null
    _jspx_th_stripes_005flayout_002drender_005f4.setDynamicAttribute(null, "link", new String("/actions/admin/connection-providers"));
    int _jspx_eval_stripes_005flayout_002drender_005f4 = _jspx_th_stripes_005flayout_002drender_005f4.doStartTag();
    if (_jspx_th_stripes_005flayout_002drender_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody.reuse(_jspx_th_stripes_005flayout_002drender_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody.reuse(_jspx_th_stripes_005flayout_002drender_005f4);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002drender_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002ddefinition_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-render
    net.sourceforge.stripes.tag.layout.LayoutRenderTag _jspx_th_stripes_005flayout_002drender_005f5 = (net.sourceforge.stripes.tag.layout.LayoutRenderTag) _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody.get(net.sourceforge.stripes.tag.layout.LayoutRenderTag.class);
    _jspx_th_stripes_005flayout_002drender_005f5.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002drender_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
    // /skins/default/admin-page.jsp(121,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002drender_005f5.setName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/skins/${skin}/adminLink.jsp", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /skins/default/admin-page.jsp(121,28) null
    _jspx_th_stripes_005flayout_002drender_005f5.setDynamicAttribute(null, "text", new String("Tables"));
    // /skins/default/admin-page.jsp(121,28) null
    _jspx_th_stripes_005flayout_002drender_005f5.setDynamicAttribute(null, "link", new String("/actions/admin/tables"));
    int _jspx_eval_stripes_005flayout_002drender_005f5 = _jspx_th_stripes_005flayout_002drender_005f5.doStartTag();
    if (_jspx_th_stripes_005flayout_002drender_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody.reuse(_jspx_th_stripes_005flayout_002drender_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody.reuse(_jspx_th_stripes_005flayout_002drender_005f5);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002drender_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002ddefinition_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-render
    net.sourceforge.stripes.tag.layout.LayoutRenderTag _jspx_th_stripes_005flayout_002drender_005f6 = (net.sourceforge.stripes.tag.layout.LayoutRenderTag) _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody.get(net.sourceforge.stripes.tag.layout.LayoutRenderTag.class);
    _jspx_th_stripes_005flayout_002drender_005f6.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002drender_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
    // /skins/default/admin-page.jsp(124,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002drender_005f6.setName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/skins/${skin}/adminLink.jsp", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /skins/default/admin-page.jsp(124,28) null
    _jspx_th_stripes_005flayout_002drender_005f6.setDynamicAttribute(null, "text", new String("Reload model"));
    // /skins/default/admin-page.jsp(124,28) null
    _jspx_th_stripes_005flayout_002drender_005f6.setDynamicAttribute(null, "link", new String("/actions/admin/reload-model"));
    int _jspx_eval_stripes_005flayout_002drender_005f6 = _jspx_th_stripes_005flayout_002drender_005f6.doStartTag();
    if (_jspx_th_stripes_005flayout_002drender_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody.reuse(_jspx_th_stripes_005flayout_002drender_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftext_005fname_005flink_005fnobody.reuse(_jspx_th_stripes_005flayout_002drender_005f6);
    return false;
  }
}
