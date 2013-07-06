package org.apache.jsp.skins.default_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class portlet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tags/buttons.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flayout_002ddefinition;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fstripes_005flayout_002ddefinition = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fstripes_005flayout_002ddefinition.release();
    _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.release();
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
      if (_jspx_meth_stripes_005flayout_002ddefinition_005f0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_stripes_005flayout_002ddefinition_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    //  stripes:layout-definition
    net.sourceforge.stripes.tag.layout.LayoutDefinitionTag _jspx_th_stripes_005flayout_002ddefinition_005f0 = (net.sourceforge.stripes.tag.layout.LayoutDefinitionTag) _005fjspx_005ftagPool_005fstripes_005flayout_002ddefinition.get(net.sourceforge.stripes.tag.layout.LayoutDefinitionTag.class);
    _jspx_th_stripes_005flayout_002ddefinition_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002ddefinition_005f0.setParent(null);
    int _jspx_eval_stripes_005flayout_002ddefinition_005f0 = _jspx_th_stripes_005flayout_002ddefinition_005f0.doStartTag();
    if (_jspx_eval_stripes_005flayout_002ddefinition_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("    ");
      com.manydesigns.portofino.pageactions.AbstractPageAction actionBean = null;
      synchronized (request) {
        actionBean = (com.manydesigns.portofino.pageactions.AbstractPageAction) _jspx_page_context.getAttribute("actionBean", PageContext.REQUEST_SCOPE);
        if (actionBean == null){
          throw new java.lang.InstantiationException("bean actionBean not found within scope");
        }
      }
      out.write("\n");
      out.write("    <div class=\"portlet\" id=\"portlet_");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.pageInstance.page.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("        ");
      if (_jspx_meth_stripes_005fform_005f0(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("    </div>\n");
    }
    if (_jspx_th_stripes_005flayout_002ddefinition_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002ddefinition.reuse(_jspx_th_stripes_005flayout_002ddefinition_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002ddefinition.reuse(_jspx_th_stripes_005flayout_002ddefinition_005f0);
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
    // /skins/default/portlet.jsp(11,8) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fform_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.dispatch.originalPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /skins/default/portlet.jsp(11,8) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fform_005f0.setMethod("post");
    // /skins/default/portlet.jsp(11,8) name = enctype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("            ");
          out.write("\n");
          out.write("            <div class=\"hidden-submit\">");
          if (_jspx_meth_portofino_005fbuttons_005f0(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("</div>\n");
          out.write("            <input type=\"hidden\" name=\"cancelReturnUrl\" value=\"");
          if (_jspx_meth_c_005fout_005f0(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\"/>\n");
          out.write("            <div class=\"portletHeader\">\n");
          out.write("                ");
          if (_jspx_meth_stripes_005flayout_002dcomponent_005f0(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("            </div>\n");
          out.write("            <div class=\"portletBody\">\n");
          out.write("                ");
          if (_jspx_meth_stripes_005flayout_002dcomponent_005f3(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("            </div>\n");
          out.write("            <div class=\"portletFooter\">\n");
          out.write("                ");
          if (_jspx_meth_stripes_005flayout_002dcomponent_005f4(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("            </div>\n");
          out.write("        ");
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

  private boolean _jspx_meth_portofino_005fbuttons_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portofino:buttons
    org.apache.jsp.tag.web.buttons_tag _jspx_th_portofino_005fbuttons_005f0 = new org.apache.jsp.tag.web.buttons_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_portofino_005fbuttons_005f0);
    _jspx_th_portofino_005fbuttons_005f0.setJspContext(_jspx_page_context);
    _jspx_th_portofino_005fbuttons_005f0.setParent(_jspx_th_stripes_005fform_005f0);
    // /skins/default/portlet.jsp(13,39) name = list type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_portofino_005fbuttons_005f0.setList("portlet-default-button");
    _jspx_th_portofino_005fbuttons_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_portofino_005fbuttons_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /skins/default/portlet.jsp(14,63) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.cancelReturnUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002dcomponent_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f0 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_stripes_005flayout_002dcomponent_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002dcomponent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /skins/default/portlet.jsp(16,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f0.setName("portletHeader");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f0 = _jspx_th_stripes_005flayout_002dcomponent_005f0.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        <div class=\"portletTitle\">\n");
      out.write("                            <h1>\n");
      out.write("                            ");
      if (_jspx_meth_stripes_005flayout_002dcomponent_005f1(_jspx_th_stripes_005flayout_002dcomponent_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
        return true;
      out.write("\n");
      out.write("                            </h1>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"portletHeaderButtons\">\n");
      out.write("                            ");
      if (_jspx_meth_stripes_005flayout_002dcomponent_005f2(_jspx_th_stripes_005flayout_002dcomponent_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
        return true;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"portletHeaderSeparator\"></div>\n");
      out.write("                ");
    }
    if (_jspx_th_stripes_005flayout_002dcomponent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f0);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002dcomponent_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f1 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_stripes_005flayout_002dcomponent_005f1.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002dcomponent_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f0);
    // /skins/default/portlet.jsp(20,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f1.setName("portletTitle");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f1 = _jspx_th_stripes_005flayout_002dcomponent_005f1.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("                            ");
    }
    if (_jspx_th_stripes_005flayout_002dcomponent_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f1);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002dcomponent_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f2 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_stripes_005flayout_002dcomponent_005f2.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002dcomponent_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f0);
    // /skins/default/portlet.jsp(25,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f2.setName("portletHeaderButtons");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f2 = _jspx_th_stripes_005flayout_002dcomponent_005f2.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_portofino_005fbuttons_005f1(_jspx_th_stripes_005flayout_002dcomponent_005f2, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
        return true;
      out.write("\n");
      out.write("                            ");
    }
    if (_jspx_th_stripes_005flayout_002dcomponent_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f2);
    return false;
  }

  private boolean _jspx_meth_portofino_005fbuttons_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portofino:buttons
    org.apache.jsp.tag.web.buttons_tag _jspx_th_portofino_005fbuttons_005f1 = new org.apache.jsp.tag.web.buttons_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_portofino_005fbuttons_005f1);
    _jspx_th_portofino_005fbuttons_005f1.setJspContext(_jspx_page_context);
    _jspx_th_portofino_005fbuttons_005f1.setParent(_jspx_th_stripes_005flayout_002dcomponent_005f2);
    // /skins/default/portlet.jsp(26,32) name = list type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_portofino_005fbuttons_005f1.setList("portletHeaderButtons");
    _jspx_th_portofino_005fbuttons_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_portofino_005fbuttons_005f1);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002dcomponent_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f3 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_stripes_005flayout_002dcomponent_005f3.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002dcomponent_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /skins/default/portlet.jsp(34,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f3.setName("portletBody");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f3 = _jspx_th_stripes_005flayout_002dcomponent_005f3.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("                ");
    }
    if (_jspx_th_stripes_005flayout_002dcomponent_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f3);
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
    // /skins/default/portlet.jsp(38,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f4.setName("portletFooter");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f4 = _jspx_th_stripes_005flayout_002dcomponent_005f4.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("                ");
    }
    if (_jspx_th_stripes_005flayout_002dcomponent_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f4);
    return false;
  }
}
