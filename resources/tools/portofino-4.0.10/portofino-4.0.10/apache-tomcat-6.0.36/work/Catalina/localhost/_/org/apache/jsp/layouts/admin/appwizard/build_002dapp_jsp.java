package org.apache.jsp.layouts.admin.appwizard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class build_002dapp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tags/buttons.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmde_005fsessionMessages_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmde_005fsessionMessages_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005fname.release();
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.release();
    _005fjspx_005ftagPool_005fmde_005fsessionMessages_005fnobody.release();
    _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
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

      out.write('\n');
      //  stripes:layout-render
      net.sourceforge.stripes.tag.layout.LayoutRenderTag _jspx_th_stripes_005flayout_002drender_005f0 = (net.sourceforge.stripes.tag.layout.LayoutRenderTag) _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutRenderTag.class);
      _jspx_th_stripes_005flayout_002drender_005f0.setPageContext(_jspx_page_context);
      _jspx_th_stripes_005flayout_002drender_005f0.setParent(null);
      // /layouts/admin/appwizard/build-app.jsp(8,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_stripes_005flayout_002drender_005f0.setName("/skins/default/admin-page.jsp");
      int _jspx_eval_stripes_005flayout_002drender_005f0 = _jspx_th_stripes_005flayout_002drender_005f0.doStartTag();
      if (_jspx_eval_stripes_005flayout_002drender_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_stripes_005flayout_002drender_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_stripes_005flayout_002drender_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_stripes_005flayout_002drender_005f0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("    ");
          com.manydesigns.portofino.actions.admin.appwizard.ApplicationWizard actionBean = null;
          synchronized (request) {
            actionBean = (com.manydesigns.portofino.actions.admin.appwizard.ApplicationWizard) _jspx_page_context.getAttribute("actionBean", PageContext.REQUEST_SCOPE);
            if (actionBean == null){
              throw new java.lang.InstantiationException("bean actionBean not found within scope");
            }
          }
          out.write("\n");
          out.write("    ");
          //  stripes:layout-component
          net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f0 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
          _jspx_th_stripes_005flayout_002dcomponent_005f0.setPageContext(_jspx_page_context);
          _jspx_th_stripes_005flayout_002dcomponent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002drender_005f0);
          // /layouts/admin/appwizard/build-app.jsp(10,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_stripes_005flayout_002dcomponent_005f0.setName("pageTitle");
          int _jspx_eval_stripes_005flayout_002dcomponent_005f0 = _jspx_th_stripes_005flayout_002dcomponent_005f0.doStartTag();
          if (_jspx_eval_stripes_005flayout_002dcomponent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("        ");
            out.print( actionBean.getMessage("appwizard.step5.title") );
            out.write("\n");
            out.write("    ");
          }
          if (_jspx_th_stripes_005flayout_002dcomponent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f0);
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_stripes_005flayout_002dcomponent_005f1(_jspx_th_stripes_005flayout_002drender_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    ");
          //  stripes:layout-component
          net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f2 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
          _jspx_th_stripes_005flayout_002dcomponent_005f2.setPageContext(_jspx_page_context);
          _jspx_th_stripes_005flayout_002dcomponent_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002drender_005f0);
          // /layouts/admin/appwizard/build-app.jsp(16,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_stripes_005flayout_002dcomponent_005f2.setName("portletTitle");
          int _jspx_eval_stripes_005flayout_002dcomponent_005f2 = _jspx_th_stripes_005flayout_002dcomponent_005f2.doStartTag();
          if (_jspx_eval_stripes_005flayout_002dcomponent_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("        ");
            out.print( actionBean.getMessage("appwizard.step5.title") );
            out.write("\n");
            out.write("    ");
          }
          if (_jspx_th_stripes_005flayout_002dcomponent_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f2);
          out.write("\n");
          out.write("    ");
          //  stripes:layout-component
          net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f3 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
          _jspx_th_stripes_005flayout_002dcomponent_005f3.setPageContext(_jspx_page_context);
          _jspx_th_stripes_005flayout_002dcomponent_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002drender_005f0);
          // /layouts/admin/appwizard/build-app.jsp(19,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_stripes_005flayout_002dcomponent_005f3.setName("portletBody");
          int _jspx_eval_stripes_005flayout_002dcomponent_005f3 = _jspx_th_stripes_005flayout_002dcomponent_005f3.doStartTag();
          if (_jspx_eval_stripes_005flayout_002dcomponent_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("        ");
            if (_jspx_meth_mde_005fsessionMessages_005f0(_jspx_th_stripes_005flayout_002dcomponent_005f3, _jspx_page_context))
              return;
            out.write("\n");
            out.write("        ");
            out.print( actionBean.getMessage("appwizard.finish.text") );
            out.write("\n");
            out.write("        <div style=\"display: none;\">\n");
            out.write("            <input type=\"hidden\" name=\"generateCalendar\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.generateCalendar}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\" />\n");
            out.write("            <input type=\"hidden\" name=\"generationStrategy\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.generationStrategy}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\" />\n");
            out.write("            ");
            if (_jspx_meth_mde_005fwrite_005f0(_jspx_th_stripes_005flayout_002dcomponent_005f3, _jspx_page_context))
              return;
            out.write("\n");
            out.write("            ");
            if (_jspx_meth_c_005fif_005f0(_jspx_th_stripes_005flayout_002dcomponent_005f3, _jspx_page_context))
              return;
            out.write("\n");
            out.write("            ");
            if (_jspx_meth_mde_005fwrite_005f2(_jspx_th_stripes_005flayout_002dcomponent_005f3, _jspx_page_context))
              return;
            out.write("\n");
            out.write("            ");
            if (_jspx_meth_mde_005fwrite_005f3(_jspx_th_stripes_005flayout_002dcomponent_005f3, _jspx_page_context))
              return;
            out.write("\n");
            out.write("            <input type=\"hidden\" name=\"connectionProviderType\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.connectionProviderType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\" />\n");
            out.write("            ");
            if (_jspx_meth_mde_005fwrite_005f4(_jspx_th_stripes_005flayout_002dcomponent_005f3, _jspx_page_context))
              return;
            out.write("\n");
            out.write("            ");
            if (_jspx_meth_mde_005fwrite_005f5(_jspx_th_stripes_005flayout_002dcomponent_005f3, _jspx_page_context))
              return;
            out.write("\n");
            out.write("            ");
            if (_jspx_meth_mde_005fwrite_005f6(_jspx_th_stripes_005flayout_002dcomponent_005f3, _jspx_page_context))
              return;
            out.write("\n");
            out.write("        </div>\n");
            out.write("    ");
          }
          if (_jspx_th_stripes_005flayout_002dcomponent_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f3);
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_stripes_005flayout_002dcomponent_005f4(_jspx_th_stripes_005flayout_002drender_005f0, _jspx_page_context))
            return;
          out.write('\n');
          int evalDoAfterBody = _jspx_th_stripes_005flayout_002drender_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_stripes_005flayout_002drender_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_stripes_005flayout_002drender_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005fname.reuse(_jspx_th_stripes_005flayout_002drender_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005fname.reuse(_jspx_th_stripes_005flayout_002drender_005f0);
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

  private boolean _jspx_meth_stripes_005flayout_002dcomponent_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002drender_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  stripes:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f1 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_stripes_005flayout_002dcomponent_005f1.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002dcomponent_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002drender_005f0);
    // /layouts/admin/appwizard/build-app.jsp(13,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f1.setName("contentHeaderContainer");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f1 = _jspx_th_stripes_005flayout_002dcomponent_005f1.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/skins/default/wizard-content-header.jsp", out, false);
      out.write("\n");
      out.write("    ");
    }
    if (_jspx_th_stripes_005flayout_002dcomponent_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f1);
    return false;
  }

  private boolean _jspx_meth_mde_005fsessionMessages_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mde:sessionMessages
    com.manydesigns.elements.servlet.SessionMessagesTag _jspx_th_mde_005fsessionMessages_005f0 = (com.manydesigns.elements.servlet.SessionMessagesTag) _005fjspx_005ftagPool_005fmde_005fsessionMessages_005fnobody.get(com.manydesigns.elements.servlet.SessionMessagesTag.class);
    _jspx_th_mde_005fsessionMessages_005f0.setPageContext(_jspx_page_context);
    _jspx_th_mde_005fsessionMessages_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f3);
    int _jspx_eval_mde_005fsessionMessages_005f0 = _jspx_th_mde_005fsessionMessages_005f0.doStartTag();
    if (_jspx_th_mde_005fsessionMessages_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmde_005fsessionMessages_005fnobody.reuse(_jspx_th_mde_005fsessionMessages_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fmde_005fsessionMessages_005fnobody.reuse(_jspx_th_mde_005fsessionMessages_005f0);
    return false;
  }

  private boolean _jspx_meth_mde_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mde:write
    com.manydesigns.elements.servlet.WriteTag _jspx_th_mde_005fwrite_005f0 = (com.manydesigns.elements.servlet.WriteTag) _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody.get(com.manydesigns.elements.servlet.WriteTag.class);
    _jspx_th_mde_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_mde_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f3);
    // /layouts/admin/appwizard/build-app.jsp(25,12) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_mde_005fwrite_005f0.setName("actionBean");
    // /layouts/admin/appwizard/build-app.jsp(25,12) name = property type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_mde_005fwrite_005f0.setProperty("rootsForm");
    int _jspx_eval_mde_005fwrite_005f0 = _jspx_th_mde_005fwrite_005f0.doStartTag();
    if (_jspx_th_mde_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_mde_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_mde_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f3);
    // /layouts/admin/appwizard/build-app.jsp(26,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty actionBean.userManagementSetupForm}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_mde_005fwrite_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_mde_005fwrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mde:write
    com.manydesigns.elements.servlet.WriteTag _jspx_th_mde_005fwrite_005f1 = (com.manydesigns.elements.servlet.WriteTag) _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody.get(com.manydesigns.elements.servlet.WriteTag.class);
    _jspx_th_mde_005fwrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_mde_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /layouts/admin/appwizard/build-app.jsp(27,16) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_mde_005fwrite_005f1.setName("actionBean");
    // /layouts/admin/appwizard/build-app.jsp(27,16) name = property type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_mde_005fwrite_005f1.setProperty("userManagementSetupForm");
    int _jspx_eval_mde_005fwrite_005f1 = _jspx_th_mde_005fwrite_005f1.doStartTag();
    if (_jspx_th_mde_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_mde_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_mde_005fwrite_005f1);
    return false;
  }

  private boolean _jspx_meth_mde_005fwrite_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mde:write
    com.manydesigns.elements.servlet.WriteTag _jspx_th_mde_005fwrite_005f2 = (com.manydesigns.elements.servlet.WriteTag) _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody.get(com.manydesigns.elements.servlet.WriteTag.class);
    _jspx_th_mde_005fwrite_005f2.setPageContext(_jspx_page_context);
    _jspx_th_mde_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f3);
    // /layouts/admin/appwizard/build-app.jsp(29,12) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_mde_005fwrite_005f2.setName("actionBean");
    // /layouts/admin/appwizard/build-app.jsp(29,12) name = property type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_mde_005fwrite_005f2.setProperty("userAndGroupTablesForm");
    int _jspx_eval_mde_005fwrite_005f2 = _jspx_th_mde_005fwrite_005f2.doStartTag();
    if (_jspx_th_mde_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_mde_005fwrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_mde_005fwrite_005f2);
    return false;
  }

  private boolean _jspx_meth_mde_005fwrite_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mde:write
    com.manydesigns.elements.servlet.WriteTag _jspx_th_mde_005fwrite_005f3 = (com.manydesigns.elements.servlet.WriteTag) _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody.get(com.manydesigns.elements.servlet.WriteTag.class);
    _jspx_th_mde_005fwrite_005f3.setPageContext(_jspx_page_context);
    _jspx_th_mde_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f3);
    // /layouts/admin/appwizard/build-app.jsp(30,12) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_mde_005fwrite_005f3.setName("actionBean");
    // /layouts/admin/appwizard/build-app.jsp(30,12) name = property type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_mde_005fwrite_005f3.setProperty("schemasForm");
    int _jspx_eval_mde_005fwrite_005f3 = _jspx_th_mde_005fwrite_005f3.doStartTag();
    if (_jspx_th_mde_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_mde_005fwrite_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_mde_005fwrite_005f3);
    return false;
  }

  private boolean _jspx_meth_mde_005fwrite_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mde:write
    com.manydesigns.elements.servlet.WriteTag _jspx_th_mde_005fwrite_005f4 = (com.manydesigns.elements.servlet.WriteTag) _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody.get(com.manydesigns.elements.servlet.WriteTag.class);
    _jspx_th_mde_005fwrite_005f4.setPageContext(_jspx_page_context);
    _jspx_th_mde_005fwrite_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f3);
    // /layouts/admin/appwizard/build-app.jsp(32,12) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_mde_005fwrite_005f4.setName("actionBean");
    // /layouts/admin/appwizard/build-app.jsp(32,12) name = property type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_mde_005fwrite_005f4.setProperty("connectionProviderField");
    int _jspx_eval_mde_005fwrite_005f4 = _jspx_th_mde_005fwrite_005f4.doStartTag();
    if (_jspx_th_mde_005fwrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_mde_005fwrite_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_mde_005fwrite_005f4);
    return false;
  }

  private boolean _jspx_meth_mde_005fwrite_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mde:write
    com.manydesigns.elements.servlet.WriteTag _jspx_th_mde_005fwrite_005f5 = (com.manydesigns.elements.servlet.WriteTag) _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody.get(com.manydesigns.elements.servlet.WriteTag.class);
    _jspx_th_mde_005fwrite_005f5.setPageContext(_jspx_page_context);
    _jspx_th_mde_005fwrite_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f3);
    // /layouts/admin/appwizard/build-app.jsp(33,12) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_mde_005fwrite_005f5.setName("actionBean");
    // /layouts/admin/appwizard/build-app.jsp(33,12) name = property type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_mde_005fwrite_005f5.setProperty("jndiCPForm");
    int _jspx_eval_mde_005fwrite_005f5 = _jspx_th_mde_005fwrite_005f5.doStartTag();
    if (_jspx_th_mde_005fwrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_mde_005fwrite_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_mde_005fwrite_005f5);
    return false;
  }

  private boolean _jspx_meth_mde_005fwrite_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mde:write
    com.manydesigns.elements.servlet.WriteTag _jspx_th_mde_005fwrite_005f6 = (com.manydesigns.elements.servlet.WriteTag) _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody.get(com.manydesigns.elements.servlet.WriteTag.class);
    _jspx_th_mde_005fwrite_005f6.setPageContext(_jspx_page_context);
    _jspx_th_mde_005fwrite_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f3);
    // /layouts/admin/appwizard/build-app.jsp(34,12) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_mde_005fwrite_005f6.setName("actionBean");
    // /layouts/admin/appwizard/build-app.jsp(34,12) name = property type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_mde_005fwrite_005f6.setProperty("jdbcCPForm");
    int _jspx_eval_mde_005fwrite_005f6 = _jspx_th_mde_005fwrite_005f6.doStartTag();
    if (_jspx_th_mde_005fwrite_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_mde_005fwrite_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fmde_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_mde_005fwrite_005f6);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002dcomponent_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002drender_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f4 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_stripes_005flayout_002dcomponent_005f4.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002dcomponent_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002drender_005f0);
    // /layouts/admin/appwizard/build-app.jsp(37,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f4.setName("contentFooter");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f4 = _jspx_th_stripes_005flayout_002dcomponent_005f4.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(function() {\n");
      out.write("                var buttons = $(\".contentFooter button\");\n");
      out.write("                buttons.click(function() {\n");
      out.write("                    buttons.unbind(\"click\");\n");
      out.write("                    buttons.click(function() {\n");
      out.write("                        alert(\"");
      if (_jspx_meth_fmt_005fmessage_005f0(_jspx_th_stripes_005flayout_002dcomponent_005f4, _jspx_page_context))
        return true;
      out.write("\");\n");
      out.write("                        return false;\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        ");
      if (_jspx_meth_portofino_005fbuttons_005f0(_jspx_th_stripes_005flayout_002dcomponent_005f4, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("    ");
    }
    if (_jspx_th_stripes_005flayout_002dcomponent_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f4);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f4);
    // /layouts/admin/appwizard/build-app.jsp(44,31) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f0.setKey("commons.waitOperation");
    int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_portofino_005fbuttons_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portofino:buttons
    org.apache.jsp.tag.web.buttons_tag _jspx_th_portofino_005fbuttons_005f0 = new org.apache.jsp.tag.web.buttons_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_portofino_005fbuttons_005f0);
    _jspx_th_portofino_005fbuttons_005f0.setJspContext(_jspx_page_context);
    _jspx_th_portofino_005fbuttons_005f0.setParent(_jspx_th_stripes_005flayout_002dcomponent_005f4);
    // /layouts/admin/appwizard/build-app.jsp(50,8) name = list type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_portofino_005fbuttons_005f0.setList("build-app");
    // /layouts/admin/appwizard/build-app.jsp(50,8) name = cssClass type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_portofino_005fbuttons_005f0.setCssClass("contentButton");
    _jspx_th_portofino_005fbuttons_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_portofino_005fbuttons_005f0);
    return false;
  }
}
