package org.apache.jsp.skins.default_.templates.default_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;

public final class normal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(9);
    _jspx_dependants.add("/WEB-INF/tags/page-layout-button.tag");
    _jspx_dependants.add("/WEB-INF/tags/page-children-button.tag");
    _jspx_dependants.add("/WEB-INF/tags/page-permissions-button.tag");
    _jspx_dependants.add("/WEB-INF/tags/page-copy-button.tag");
    _jspx_dependants.add("/WEB-INF/tags/page-new-button.tag");
    _jspx_dependants.add("/WEB-INF/tags/page-delete-button.tag");
    _jspx_dependants.add("/WEB-INF/tags/page-move-button.tag");
    _jspx_dependants.add("/WEB-INF/tags/result-set-navigation.tag");
    _jspx_dependants.add("/WEB-INF/tags/portlets.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flayout_002ddefinition;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fid_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmde_005fsessionMessages_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fstripes_005flayout_002ddefinition = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fid_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmde_005fsessionMessages_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fstripes_005flayout_002ddefinition.release();
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.release();
    _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fid_005faction.release();
    _005fjspx_005ftagPool_005fmde_005fsessionMessages_005fnobody.release();
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

      //  stripes:layout-definition
      net.sourceforge.stripes.tag.layout.LayoutDefinitionTag _jspx_th_stripes_005flayout_002ddefinition_005f0 = (net.sourceforge.stripes.tag.layout.LayoutDefinitionTag) _005fjspx_005ftagPool_005fstripes_005flayout_002ddefinition.get(net.sourceforge.stripes.tag.layout.LayoutDefinitionTag.class);
      _jspx_th_stripes_005flayout_002ddefinition_005f0.setPageContext(_jspx_page_context);
      _jspx_th_stripes_005flayout_002ddefinition_005f0.setParent(null);
      int _jspx_eval_stripes_005flayout_002ddefinition_005f0 = _jspx_th_stripes_005flayout_002ddefinition_005f0.doStartTag();
      if (_jspx_eval_stripes_005flayout_002ddefinition_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("<!DOCTYPE html>\n");
        out.write("    <html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\">\n");
        out.write("    <head>\n");
        out.write("        ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../head.jsp", out, false);
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_stripes_005flayout_002dcomponent_005f0(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
          return;
        out.write("\n");
        out.write("        ");
        com.manydesigns.portofino.pageactions.AbstractPageAction actionBean = null;
        synchronized (request) {
          actionBean = (com.manydesigns.portofino.pageactions.AbstractPageAction) _jspx_page_context.getAttribute("actionBean", PageContext.REQUEST_SCOPE);
          if (actionBean == null){
            throw new java.lang.InstantiationException("bean actionBean not found within scope");
          }
        }
        out.write("\n");
        out.write("        <title>");
        if (_jspx_meth_c_005fout_005f0(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
          return;
        out.write("</title>\n");
        out.write("    </head>\n");
        out.write("    <body class=\"yui-skin-sam\">\n");
        out.write("    <div id=\"doc3\" class=\"yui-t2\">\n");
        out.write("        <div id=\"hd\">\n");
        out.write("            ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../header.jsp", out, false);
        out.write("\n");
        out.write("        </div>\n");
        out.write("        <div id=\"bd\">\n");
        out.write("            <div id=\"yui-main\">\n");
        out.write("                <div id=\"content\" class=\"yui-b\">\n");
        out.write("                    <div class=\"contentHeader\">\n");
        out.write("                        ");
        //  stripes:layout-component
        net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f1 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
        _jspx_th_stripes_005flayout_002dcomponent_005f1.setPageContext(_jspx_page_context);
        _jspx_th_stripes_005flayout_002dcomponent_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
        // /skins/default/templates/default/normal.jsp(26,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_stripes_005flayout_002dcomponent_005f1.setName("contentHeader");
        int _jspx_eval_stripes_005flayout_002dcomponent_005f1 = _jspx_th_stripes_005flayout_002dcomponent_005f1.doStartTag();
        if (_jspx_eval_stripes_005flayout_002dcomponent_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("                            <div class=\"yui-g\">\n");
          out.write("                                <div class=\"contentBarLeft\">\n");
          out.write("                                    ");
          //  stripes:form
          net.sourceforge.stripes.tag.FormTag _jspx_th_stripes_005fform_005f0 = (net.sourceforge.stripes.tag.FormTag) _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fenctype_005faction.get(net.sourceforge.stripes.tag.FormTag.class);
          _jspx_th_stripes_005fform_005f0.setPageContext(_jspx_page_context);
          _jspx_th_stripes_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f1);
          // /skins/default/templates/default/normal.jsp(29,36) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_stripes_005fform_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.dispatch.originalPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          // /skins/default/templates/default/normal.jsp(29,36) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_stripes_005fform_005f0.setMethod("post");
          // /skins/default/templates/default/normal.jsp(29,36) name = enctype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
                out.write("                                        ");
                //  c:if
                org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
                _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
                // /skins/default/templates/default/normal.jsp(30,40) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty actionBean.returnToParentTarget}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
                if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\n");
                    out.write("                                            <button type=\"submit\"\n");
                    out.write("                                                    name=\"returnToParent\"\n");
                    out.write("                                                    class=\"contentButton\">\n");
                    out.write("                                                <span class=\"ui-button-text\">&lt;&lt; ");
                    out.print( actionBean.getMessage("commons.returnToParent", actionBean.returnToParentTarget) );
                    out.write("</span>\n");
                    out.write("                                            </button>\n");
                    out.write("                                            ");
 for(Map.Entry<String, String> param : actionBean.getReturnToParentParams().entrySet()) { 
                    out.write("\n");
                    out.write("                                                <input type=\"hidden\" name=\"");
                    out.print( param.getKey() );
                    out.write("\" value=\"");
                    out.print( param.getValue() );
                    out.write("\" />\n");
                    out.write("                                            ");
 } 
                    out.write("\n");
                    out.write("                                        ");
                    int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
                  return;
                }
                _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
                out.write("\n");
                out.write("                                        ");
                org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../breadcrumbs.jsp", out, false);
                out.write("\n");
                out.write("                                    ");
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
              return;
            }
          } catch (Throwable _jspx_exception) {
            while (_jspx_push_body_count_stripes_005fform_005f0[0]-- > 0)
              out = _jspx_page_context.popBody();
            _jspx_th_stripes_005fform_005f0.doCatch(_jspx_exception);
          } finally {
            _jspx_th_stripes_005fform_005f0.doFinally();
            _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fenctype_005faction.reuse(_jspx_th_stripes_005fform_005f0);
          }
          out.write("\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"contentBarRight\">\n");
          out.write("                                    ");
          if (_jspx_meth_stripes_005fform_005f1(_jspx_th_stripes_005flayout_002dcomponent_005f1, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    <!-- End admin buttons -->\n");
          out.write("                                    ");
          if (_jspx_meth_portofino_005fresult_002dset_002dnavigation_005f0(_jspx_th_stripes_005flayout_002dcomponent_005f1, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        ");
        }
        if (_jspx_th_stripes_005flayout_002dcomponent_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f1);
          return;
        }
        _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f1);
        out.write("\n");
        out.write("                    </div>\n");
        out.write("                    <div class=\"contentBody\">\n");
        out.write("                        ");
        if (_jspx_meth_stripes_005flayout_002dcomponent_005f2(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
          return;
        out.write("\n");
        out.write("                    </div>\n");
        out.write("                    <div class=\"contentFooter\">\n");
        out.write("                        ");
        if (_jspx_meth_stripes_005flayout_002dcomponent_005f3(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
          return;
        out.write("\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("            </div>\n");
        out.write("            <div id=\"sidebar\" class=\"yui-b\">\n");
        out.write("                ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../navigation.jsp", out, false);
        out.write("\n");
        out.write("            </div>\n");
        out.write("            <script type=\"text/javascript\">\n");
        out.write("                fixSideBar();\n");
        out.write("            </script>\n");
        out.write("        </div>\n");
        out.write("        <div id=\"ft\">\n");
        out.write("            ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../footer.jsp", out, false);
        out.write("\n");
        out.write("        </div>\n");
        out.write("    </div>\n");
        out.write("    </body>\n");
        out.write("    </html>\n");
      }
      if (_jspx_th_stripes_005flayout_002ddefinition_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fstripes_005flayout_002ddefinition.reuse(_jspx_th_stripes_005flayout_002ddefinition_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fstripes_005flayout_002ddefinition.reuse(_jspx_th_stripes_005flayout_002ddefinition_005f0);
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

  private boolean _jspx_meth_stripes_005flayout_002dcomponent_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002ddefinition_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f0 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_stripes_005flayout_002dcomponent_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002dcomponent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
    // /skins/default/templates/default/normal.jsp(12,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f0.setName("customScripts");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f0 = _jspx_th_stripes_005flayout_002dcomponent_005f0.doStartTag();
    if (_jspx_th_stripes_005flayout_002dcomponent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002ddefinition_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
    // /skins/default/templates/default/normal.jsp(15,15) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.dispatch.lastPageInstance.page.description}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_stripes_005fform_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:form
    net.sourceforge.stripes.tag.FormTag _jspx_th_stripes_005fform_005f1 = (net.sourceforge.stripes.tag.FormTag) _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fid_005faction.get(net.sourceforge.stripes.tag.FormTag.class);
    _jspx_th_stripes_005fform_005f1.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fform_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f1);
    // /skins/default/templates/default/normal.jsp(44,36) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fform_005f1.setAction("/actions/admin/page");
    // /skins/default/templates/default/normal.jsp(44,36) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fform_005f1.setMethod("post");
    // /skins/default/templates/default/normal.jsp(44,36) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fform_005f1.setId("pageAdminForm");
    int[] _jspx_push_body_count_stripes_005fform_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fform_005f1 = _jspx_th_stripes_005fform_005f1.doStartTag();
      if (_jspx_eval_stripes_005fform_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_stripes_005fform_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_stripes_005fform_005f1[0]++;
          _jspx_th_stripes_005fform_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_stripes_005fform_005f1.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                                        <input type=\"hidden\" name=\"originalPath\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.dispatch.originalPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" />\n");
          out.write("                                        <!-- Admin buttons -->\n");
          out.write("                                        <div class=\"contentBarButtons\">\n");
          out.write("                                            ");
          if (_jspx_meth_portofino_005fpage_002dlayout_002dbutton_005f0(_jspx_th_stripes_005fform_005f1, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f1))
            return true;
          out.write("\n");
          out.write("                                            ");
          if (_jspx_meth_portofino_005fpage_002dchildren_002dbutton_005f0(_jspx_th_stripes_005fform_005f1, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f1))
            return true;
          out.write("\n");
          out.write("                                            ");
          if (_jspx_meth_portofino_005fpage_002dpermissions_002dbutton_005f0(_jspx_th_stripes_005fform_005f1, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f1))
            return true;
          out.write("\n");
          out.write("                                            ");
          if (_jspx_meth_portofino_005fpage_002dcopy_002dbutton_005f0(_jspx_th_stripes_005fform_005f1, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f1))
            return true;
          out.write("\n");
          out.write("                                            ");
          if (_jspx_meth_portofino_005fpage_002dnew_002dbutton_005f0(_jspx_th_stripes_005fform_005f1, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f1))
            return true;
          out.write("\n");
          out.write("                                            ");
          if (_jspx_meth_portofino_005fpage_002ddelete_002dbutton_005f0(_jspx_th_stripes_005fform_005f1, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f1))
            return true;
          out.write("\n");
          out.write("                                            ");
          if (_jspx_meth_portofino_005fpage_002dmove_002dbutton_005f0(_jspx_th_stripes_005fform_005f1, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f1))
            return true;
          out.write("\n");
          out.write("                                        </div>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_stripes_005fform_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_stripes_005fform_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_stripes_005fform_005f1[0]--;
        }
      }
      if (_jspx_th_stripes_005fform_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fform_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fform_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fform_005f1.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fid_005faction.reuse(_jspx_th_stripes_005fform_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_portofino_005fpage_002dlayout_002dbutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portofino:page-layout-button
    org.apache.jsp.tag.web.page_002dlayout_002dbutton_tag _jspx_th_portofino_005fpage_002dlayout_002dbutton_005f0 = new org.apache.jsp.tag.web.page_002dlayout_002dbutton_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_portofino_005fpage_002dlayout_002dbutton_005f0);
    _jspx_th_portofino_005fpage_002dlayout_002dbutton_005f0.setJspContext(_jspx_page_context);
    _jspx_th_portofino_005fpage_002dlayout_002dbutton_005f0.setParent(_jspx_th_stripes_005fform_005f1);
    _jspx_th_portofino_005fpage_002dlayout_002dbutton_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_portofino_005fpage_002dlayout_002dbutton_005f0);
    return false;
  }

  private boolean _jspx_meth_portofino_005fpage_002dchildren_002dbutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portofino:page-children-button
    org.apache.jsp.tag.web.page_002dchildren_002dbutton_tag _jspx_th_portofino_005fpage_002dchildren_002dbutton_005f0 = new org.apache.jsp.tag.web.page_002dchildren_002dbutton_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_portofino_005fpage_002dchildren_002dbutton_005f0);
    _jspx_th_portofino_005fpage_002dchildren_002dbutton_005f0.setJspContext(_jspx_page_context);
    _jspx_th_portofino_005fpage_002dchildren_002dbutton_005f0.setParent(_jspx_th_stripes_005fform_005f1);
    _jspx_th_portofino_005fpage_002dchildren_002dbutton_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_portofino_005fpage_002dchildren_002dbutton_005f0);
    return false;
  }

  private boolean _jspx_meth_portofino_005fpage_002dpermissions_002dbutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portofino:page-permissions-button
    org.apache.jsp.tag.web.page_002dpermissions_002dbutton_tag _jspx_th_portofino_005fpage_002dpermissions_002dbutton_005f0 = new org.apache.jsp.tag.web.page_002dpermissions_002dbutton_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_portofino_005fpage_002dpermissions_002dbutton_005f0);
    _jspx_th_portofino_005fpage_002dpermissions_002dbutton_005f0.setJspContext(_jspx_page_context);
    _jspx_th_portofino_005fpage_002dpermissions_002dbutton_005f0.setParent(_jspx_th_stripes_005fform_005f1);
    _jspx_th_portofino_005fpage_002dpermissions_002dbutton_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_portofino_005fpage_002dpermissions_002dbutton_005f0);
    return false;
  }

  private boolean _jspx_meth_portofino_005fpage_002dcopy_002dbutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portofino:page-copy-button
    org.apache.jsp.tag.web.page_002dcopy_002dbutton_tag _jspx_th_portofino_005fpage_002dcopy_002dbutton_005f0 = new org.apache.jsp.tag.web.page_002dcopy_002dbutton_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_portofino_005fpage_002dcopy_002dbutton_005f0);
    _jspx_th_portofino_005fpage_002dcopy_002dbutton_005f0.setJspContext(_jspx_page_context);
    _jspx_th_portofino_005fpage_002dcopy_002dbutton_005f0.setParent(_jspx_th_stripes_005fform_005f1);
    _jspx_th_portofino_005fpage_002dcopy_002dbutton_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_portofino_005fpage_002dcopy_002dbutton_005f0);
    return false;
  }

  private boolean _jspx_meth_portofino_005fpage_002dnew_002dbutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portofino:page-new-button
    org.apache.jsp.tag.web.page_002dnew_002dbutton_tag _jspx_th_portofino_005fpage_002dnew_002dbutton_005f0 = new org.apache.jsp.tag.web.page_002dnew_002dbutton_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_portofino_005fpage_002dnew_002dbutton_005f0);
    _jspx_th_portofino_005fpage_002dnew_002dbutton_005f0.setJspContext(_jspx_page_context);
    _jspx_th_portofino_005fpage_002dnew_002dbutton_005f0.setParent(_jspx_th_stripes_005fform_005f1);
    _jspx_th_portofino_005fpage_002dnew_002dbutton_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_portofino_005fpage_002dnew_002dbutton_005f0);
    return false;
  }

  private boolean _jspx_meth_portofino_005fpage_002ddelete_002dbutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portofino:page-delete-button
    org.apache.jsp.tag.web.page_002ddelete_002dbutton_tag _jspx_th_portofino_005fpage_002ddelete_002dbutton_005f0 = new org.apache.jsp.tag.web.page_002ddelete_002dbutton_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_portofino_005fpage_002ddelete_002dbutton_005f0);
    _jspx_th_portofino_005fpage_002ddelete_002dbutton_005f0.setJspContext(_jspx_page_context);
    _jspx_th_portofino_005fpage_002ddelete_002dbutton_005f0.setParent(_jspx_th_stripes_005fform_005f1);
    _jspx_th_portofino_005fpage_002ddelete_002dbutton_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_portofino_005fpage_002ddelete_002dbutton_005f0);
    return false;
  }

  private boolean _jspx_meth_portofino_005fpage_002dmove_002dbutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portofino:page-move-button
    org.apache.jsp.tag.web.page_002dmove_002dbutton_tag _jspx_th_portofino_005fpage_002dmove_002dbutton_005f0 = new org.apache.jsp.tag.web.page_002dmove_002dbutton_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_portofino_005fpage_002dmove_002dbutton_005f0);
    _jspx_th_portofino_005fpage_002dmove_002dbutton_005f0.setJspContext(_jspx_page_context);
    _jspx_th_portofino_005fpage_002dmove_002dbutton_005f0.setParent(_jspx_th_stripes_005fform_005f1);
    _jspx_th_portofino_005fpage_002dmove_002dbutton_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_portofino_005fpage_002dmove_002dbutton_005f0);
    return false;
  }

  private boolean _jspx_meth_portofino_005fresult_002dset_002dnavigation_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portofino:result-set-navigation
    org.apache.jsp.tag.web.result_002dset_002dnavigation_tag _jspx_th_portofino_005fresult_002dset_002dnavigation_005f0 = new org.apache.jsp.tag.web.result_002dset_002dnavigation_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_portofino_005fresult_002dset_002dnavigation_005f0);
    _jspx_th_portofino_005fresult_002dset_002dnavigation_005f0.setJspContext(_jspx_page_context);
    _jspx_th_portofino_005fresult_002dset_002dnavigation_005f0.setParent(_jspx_th_stripes_005flayout_002dcomponent_005f1);
    _jspx_th_portofino_005fresult_002dset_002dnavigation_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_portofino_005fresult_002dset_002dnavigation_005f0);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002dcomponent_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002ddefinition_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f2 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_stripes_005flayout_002dcomponent_005f2.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002dcomponent_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
    // /skins/default/templates/default/normal.jsp(64,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f2.setName("contentBody");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f2 = _jspx_th_stripes_005flayout_002dcomponent_005f2.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_mde_005fsessionMessages_005f0(_jspx_th_stripes_005flayout_002dcomponent_005f2, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_portofino_005fportlets_005f0(_jspx_th_stripes_005flayout_002dcomponent_005f2, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("                            <div class=\"yui-g\">\n");
      out.write("                                ");
      if (_jspx_meth_portofino_005fportlets_005f1(_jspx_th_stripes_005flayout_002dcomponent_005f2, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_portofino_005fportlets_005f2(_jspx_th_stripes_005flayout_002dcomponent_005f2, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            ");
      if (_jspx_meth_portofino_005fportlets_005f3(_jspx_th_stripes_005flayout_002dcomponent_005f2, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("                        ");
    }
    if (_jspx_th_stripes_005flayout_002dcomponent_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f2);
    return false;
  }

  private boolean _jspx_meth_mde_005fsessionMessages_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mde:sessionMessages
    com.manydesigns.elements.servlet.SessionMessagesTag _jspx_th_mde_005fsessionMessages_005f0 = (com.manydesigns.elements.servlet.SessionMessagesTag) _005fjspx_005ftagPool_005fmde_005fsessionMessages_005fnobody.get(com.manydesigns.elements.servlet.SessionMessagesTag.class);
    _jspx_th_mde_005fsessionMessages_005f0.setPageContext(_jspx_page_context);
    _jspx_th_mde_005fsessionMessages_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f2);
    int _jspx_eval_mde_005fsessionMessages_005f0 = _jspx_th_mde_005fsessionMessages_005f0.doStartTag();
    if (_jspx_th_mde_005fsessionMessages_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmde_005fsessionMessages_005fnobody.reuse(_jspx_th_mde_005fsessionMessages_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fmde_005fsessionMessages_005fnobody.reuse(_jspx_th_mde_005fsessionMessages_005f0);
    return false;
  }

  private boolean _jspx_meth_portofino_005fportlets_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portofino:portlets
    org.apache.jsp.tag.web.portlets_tag _jspx_th_portofino_005fportlets_005f0 = new org.apache.jsp.tag.web.portlets_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_portofino_005fportlets_005f0);
    _jspx_th_portofino_005fportlets_005f0.setJspContext(_jspx_page_context);
    _jspx_th_portofino_005fportlets_005f0.setParent(_jspx_th_stripes_005flayout_002dcomponent_005f2);
    // /skins/default/templates/default/normal.jsp(66,28) name = list type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_portofino_005fportlets_005f0.setList("default");
    _jspx_th_portofino_005fportlets_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_portofino_005fportlets_005f0);
    return false;
  }

  private boolean _jspx_meth_portofino_005fportlets_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portofino:portlets
    org.apache.jsp.tag.web.portlets_tag _jspx_th_portofino_005fportlets_005f1 = new org.apache.jsp.tag.web.portlets_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_portofino_005fportlets_005f1);
    _jspx_th_portofino_005fportlets_005f1.setJspContext(_jspx_page_context);
    _jspx_th_portofino_005fportlets_005f1.setParent(_jspx_th_stripes_005flayout_002dcomponent_005f2);
    // /skins/default/templates/default/normal.jsp(68,32) name = list type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_portofino_005fportlets_005f1.setList("contentLayoutLeft");
    // /skins/default/templates/default/normal.jsp(68,32) name = cssClass type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_portofino_005fportlets_005f1.setCssClass("yui-u first");
    _jspx_th_portofino_005fportlets_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_portofino_005fportlets_005f1);
    return false;
  }

  private boolean _jspx_meth_portofino_005fportlets_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portofino:portlets
    org.apache.jsp.tag.web.portlets_tag _jspx_th_portofino_005fportlets_005f2 = new org.apache.jsp.tag.web.portlets_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_portofino_005fportlets_005f2);
    _jspx_th_portofino_005fportlets_005f2.setJspContext(_jspx_page_context);
    _jspx_th_portofino_005fportlets_005f2.setParent(_jspx_th_stripes_005flayout_002dcomponent_005f2);
    // /skins/default/templates/default/normal.jsp(69,32) name = list type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_portofino_005fportlets_005f2.setList("contentLayoutRight");
    // /skins/default/templates/default/normal.jsp(69,32) name = cssClass type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_portofino_005fportlets_005f2.setCssClass("yui-u");
    _jspx_th_portofino_005fportlets_005f2.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_portofino_005fportlets_005f2);
    return false;
  }

  private boolean _jspx_meth_portofino_005fportlets_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portofino:portlets
    org.apache.jsp.tag.web.portlets_tag _jspx_th_portofino_005fportlets_005f3 = new org.apache.jsp.tag.web.portlets_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_portofino_005fportlets_005f3);
    _jspx_th_portofino_005fportlets_005f3.setJspContext(_jspx_page_context);
    _jspx_th_portofino_005fportlets_005f3.setParent(_jspx_th_stripes_005flayout_002dcomponent_005f2);
    // /skins/default/templates/default/normal.jsp(71,28) name = list type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_portofino_005fportlets_005f3.setList("contentLayoutBottom");
    _jspx_th_portofino_005fportlets_005f3.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_portofino_005fportlets_005f3);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002dcomponent_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002ddefinition_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f3 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_stripes_005flayout_002dcomponent_005f3.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002dcomponent_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
    // /skins/default/templates/default/normal.jsp(75,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f3.setName("contentFooter");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f3 = _jspx_th_stripes_005flayout_002dcomponent_005f3.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("                        ");
    }
    if (_jspx_th_stripes_005flayout_002dcomponent_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f3);
    return false;
  }
}
