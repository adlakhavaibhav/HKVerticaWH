package org.apache.jsp.skins.default_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("mde:getString", com.manydesigns.elements.configuration.CommonsConfigurationFunctions.class, "getString", new Class[] {org.apache.commons.configuration.Configuration.class, java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tags/buttons.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flayout_002ddefinition;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmde_005fsessionMessages_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fbeanclass;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005ftext_0026_005fname_005fid_005fclass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fid_005fbeanclass;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fstripes_005flayout_002ddefinition = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmde_005fsessionMessages_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fbeanclass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005ftext_0026_005fname_005fid_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fid_005fbeanclass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fstripes_005flayout_002ddefinition.release();
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fstripes_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.release();
    _005fjspx_005ftagPool_005fmde_005fsessionMessages_005fnobody.release();
    _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fbeanclass.release();
    _005fjspx_005ftagPool_005fstripes_005ftext_0026_005fname_005fid_005fclass_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fid_005fbeanclass.release();
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
      out.write("        <!-- Simple OpenID Selector -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"");
      if (_jspx_meth_stripes_005furl_005f0(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
        return true;
      out.write("\" />\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #openid_form { width: auto; }\n");
      out.write("            #openid_username { margin-right: .5em; }\n");
      out.write("            div#openid_highlight { padding: 0; }\n");
      out.write("        </style>\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      if (_jspx_meth_stripes_005furl_005f1(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
        return true;
      out.write("\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      if (_jspx_meth_stripes_005furl_005f2(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
        return true;
      out.write("\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                openid.img_path = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/openid-selector/images/';\n");
      out.write("                openid.useInputBox = function(provider) {\n");
      out.write("                    var input_area = $('#openid_input_area');\n");
      out.write("                    var html = '';\n");
      out.write("                    var id = 'openid_username';\n");
      out.write("                    var value = '';\n");
      out.write("                    var label = provider['label'];\n");
      out.write("                    var style = '';\n");
      out.write("                    if (label) {\n");
      out.write("                        html = '<p>' + label + '</p>';\n");
      out.write("                    }\n");
      out.write("                    if (provider['name'] == 'OpenID') {\n");
      out.write("                        id = this.input_id;\n");
      out.write("                        value = 'http://';\n");
      out.write("                        style = 'background: #FFF url(' + openid.img_path + 'openid-inputicon.gif) no-repeat scroll 0 50%; padding-left:18px;';\n");
      out.write("                    }\n");
      out.write("                    html += '<input id=\"' + id + '\" type=\"text\" style=\"' + style + '\" name=\"' + id + '\" value=\"' + value + '\" />' +\n");
      out.write("                            '<button id=\"openid_submit\" type=\"submit\" class=\"ui-button ui-widget ui-state-default ui-corner-all portletButton ui-button-text-only\">' +\n");
      out.write("                            '<span class=\"ui-button-text\">' + openid.signin_text + '</span></button>';\n");
      out.write("                    input_area.empty();\n");
      out.write("                    input_area.append(html);\n");
      out.write("                    $('#' + id).focus();\n");
      out.write("                };\n");
      out.write("                openid.init('openid_identifier');\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!-- /Simple OpenID Selector -->\n");
      out.write("        ");
      com.manydesigns.portofino.model.Model model = null;
      synchronized (request) {
        model = (com.manydesigns.portofino.model.Model) _jspx_page_context.getAttribute("model", PageContext.REQUEST_SCOPE);
        if (model == null){
          throw new java.lang.InstantiationException("bean model not found within scope");
        }
      }
      out.write("\n");
      out.write("        ");
      com.manydesigns.portofino.application.Application app = null;
      synchronized (request) {
        app = (com.manydesigns.portofino.application.Application) _jspx_page_context.getAttribute("app", PageContext.REQUEST_SCOPE);
        if (app == null){
          throw new java.lang.InstantiationException("bean app not found within scope");
        }
      }
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_005fset_005f0(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("        <title>");
      if (_jspx_meth_fmt_005fmessage_005f0(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
        return true;
      out.write(' ');
      if (_jspx_meth_c_005fout_005f0(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
        return true;
      out.write("</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div id=\"doc3\">\n");
      out.write("        <div id=\"hd\"></div>\n");
      out.write("        <div id=\"bd\">\n");
      out.write("        ");
      com.manydesigns.portofino.actions.user.LoginAction actionBean = null;
      synchronized (request) {
        actionBean = (com.manydesigns.portofino.actions.user.LoginAction) _jspx_page_context.getAttribute("actionBean", PageContext.REQUEST_SCOPE);
        if (actionBean == null){
          throw new java.lang.InstantiationException("bean actionBean not found within scope");
        }
      }
      out.write("\n");
      out.write("        <div id=\"content-login\">\n");
      out.write("            <div class=\"contentBody\">\n");
      out.write("                <div class=\"portletWrapper noSpacing\">\n");
      out.write("                    <div class=\"portlet\">\n");
      out.write("                        <div class=\"portletHeader\">\n");
      out.write("                            <div>\n");
      out.write("                                <div class=\"portletTitle\">\n");
      out.write("                                    <h1>");
      if (_jspx_meth_fmt_005fmessage_005f1(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
        return true;
      out.write(':');
      out.write(' ');
      if (_jspx_meth_c_005fout_005f1(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
        return true;
      out.write("</h1>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"portletHeaderButtons\">\n");
      out.write("                                    ");
      if (_jspx_meth_stripes_005flayout_002dcomponent_005f1(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"portletHeaderSeparator\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"portletBody\">\n");
      out.write("                            ");
      if (_jspx_meth_stripes_005flayout_002dcomponent_005f2(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"portletFooter\" style=\"border-top: 1px solid #ddd; padding-top: 0.5em\">\n");
      out.write("                                ");
      org.apache.commons.configuration.Configuration portofinoConfiguration = null;
      synchronized (application) {
        portofinoConfiguration = (org.apache.commons.configuration.Configuration) _jspx_page_context.getAttribute("portofinoConfiguration", PageContext.APPLICATION_SCOPE);
        if (portofinoConfiguration == null){
          throw new java.lang.InstantiationException("bean portofinoConfiguration not found within scope");
        }
      }
      out.write("\n");
      out.write("                                Powered by <a href=\"http://www.manydesigns.com/\">Portofino</a>\n");
      out.write("                                ");
      if (_jspx_meth_c_005fout_005f2(_jspx_th_stripes_005flayout_002ddefinition_005f0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                $('#userName').focus();\n");
      out.write("            </script>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write(" </body>\n");
      out.write("</html>\n");
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
    // /skins/default/login.jsp(12,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f0.setName("customScripts");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f0 = _jspx_th_stripes_005flayout_002dcomponent_005f0.doStartTag();
    if (_jspx_th_stripes_005flayout_002dcomponent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f0);
    return false;
  }

  private boolean _jspx_meth_stripes_005furl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002ddefinition_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:url
    net.sourceforge.stripes.tag.UrlTag _jspx_th_stripes_005furl_005f0 = (net.sourceforge.stripes.tag.UrlTag) _005fjspx_005ftagPool_005fstripes_005furl_0026_005fvalue_005fnobody.get(net.sourceforge.stripes.tag.UrlTag.class);
    _jspx_th_stripes_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005furl_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
    // /skins/default/login.jsp(14,53) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005furl_005f0.setValue("/openid-selector/css/openid.css");
    int _jspx_eval_stripes_005furl_005f0 = _jspx_th_stripes_005furl_005f0.doStartTag();
    if (_jspx_th_stripes_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_stripes_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_stripes_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_stripes_005furl_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002ddefinition_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:url
    net.sourceforge.stripes.tag.UrlTag _jspx_th_stripes_005furl_005f1 = (net.sourceforge.stripes.tag.UrlTag) _005fjspx_005ftagPool_005fstripes_005furl_0026_005fvalue_005fnobody.get(net.sourceforge.stripes.tag.UrlTag.class);
    _jspx_th_stripes_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005furl_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
    // /skins/default/login.jsp(20,44) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005furl_005f1.setValue("/openid-selector/js/openid-jquery.js");
    int _jspx_eval_stripes_005furl_005f1 = _jspx_th_stripes_005furl_005f1.doStartTag();
    if (_jspx_th_stripes_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_stripes_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_stripes_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_stripes_005furl_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002ddefinition_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:url
    net.sourceforge.stripes.tag.UrlTag _jspx_th_stripes_005furl_005f2 = (net.sourceforge.stripes.tag.UrlTag) _005fjspx_005ftagPool_005fstripes_005furl_0026_005fvalue_005fnobody.get(net.sourceforge.stripes.tag.UrlTag.class);
    _jspx_th_stripes_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005furl_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
    // /skins/default/login.jsp(21,44) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005furl_005f2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/skins/${skin}/openid-custom.js", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_stripes_005furl_005f2 = _jspx_th_stripes_005furl_005f2.doStartTag();
    if (_jspx_th_stripes_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_stripes_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_stripes_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002ddefinition_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
    // /skins/default/login.jsp(55,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("applicationName");
    // /skins/default/login.jsp(55,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002ddefinition_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.el.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.el.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.el.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
    // /skins/default/login.jsp(56,15) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f0.setKey("skins.default.login.login_to");
    int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
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
    // /skins/default/login.jsp(56,65) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${applicationName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002ddefinition_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.el.fmt.MessageTag _jspx_th_fmt_005fmessage_005f1 = (org.apache.taglibs.standard.tag.el.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.el.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
    // /skins/default/login.jsp(70,40) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f1.setKey("skins.default.login.login_to");
    int _jspx_eval_fmt_005fmessage_005f1 = _jspx_th_fmt_005fmessage_005f1.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002ddefinition_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
    // /skins/default/login.jsp(70,91) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${applicationName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
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
    // /skins/default/login.jsp(73,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f1.setName("portletHeaderButtons");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f1 = _jspx_th_stripes_005flayout_002dcomponent_005f1.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("                                    ");
    }
    if (_jspx_th_stripes_005flayout_002dcomponent_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f1);
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
    // /skins/default/login.jsp(80,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f2.setName("portletBody");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f2 = _jspx_th_stripes_005flayout_002dcomponent_005f2.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_mde_005fsessionMessages_005f0(_jspx_th_stripes_005flayout_002dcomponent_005f2, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_stripes_005fform_005f0(_jspx_th_stripes_005flayout_002dcomponent_005f2, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_005fif_005f1(_jspx_th_stripes_005flayout_002dcomponent_005f2, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("                                ");
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

  private boolean _jspx_meth_stripes_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:form
    net.sourceforge.stripes.tag.FormTag _jspx_th_stripes_005fform_005f0 = (net.sourceforge.stripes.tag.FormTag) _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fbeanclass.get(net.sourceforge.stripes.tag.FormTag.class);
    _jspx_th_stripes_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f2);
    // /skins/default/login.jsp(82,32) name = beanclass type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fform_005f0.setBeanclass(new String("com.manydesigns.portofino.actions.user.LoginAction"));
    // /skins/default/login.jsp(82,32) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fform_005f0.setMethod("post");
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
          out.write("                                    <input type=\"hidden\" name=\"cancelReturnUrl\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.cancelReturnUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" />\n");
          out.write("                                    <table class=\"mde-form-table loginTable\">\n");
          out.write("                                        <tbody>\n");
          out.write("                                        <tr>\n");
          out.write("                                            <th><label class=\"mde-field-label\" for=\"userName\">");
          if (_jspx_meth_fmt_005fmessage_005f2(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write(":</label></th>\n");
          out.write("                                            <td>");
          if (_jspx_meth_stripes_005ftext_005f0(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("</td>\n");
          out.write("                                        </tr>\n");
          out.write("                                        <tr>\n");
          out.write("                                            <th><label class=\"mde-field-label\" for=\"pwd\">Password:</label></th>\n");
          out.write("                                            <td><input type=\"password\" name=\"pwd\" id=\"pwd\" class=\"mde-text-field\" /></td>\n");
          out.write("                                        </tr>\n");
          out.write("                                        <tr>\n");
          out.write("                                            <th></th>\n");
          out.write("                                            <td>\n");
          out.write("                                                ");
          if (_jspx_meth_portofino_005fbuttons_005f0(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("                                            </td>\n");
          out.write("                                        </tr>\n");
          out.write("                                        <!--");
          if (_jspx_meth_c_005fif_005f0(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("-->\n");
          out.write("                                        </tbody>\n");
          out.write("                                    </table>\n");
          out.write("                                    ");
          if (_jspx_meth_stripes_005fhidden_005f0(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("                                ");
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
      _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fbeanclass.reuse(_jspx_th_stripes_005fform_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.el.fmt.MessageTag _jspx_th_fmt_005fmessage_005f2 = (org.apache.taglibs.standard.tag.el.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.el.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /skins/default/login.jsp(87,94) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f2.setKey("skins.default.login.username");
    int _jspx_eval_fmt_005fmessage_005f2 = _jspx_th_fmt_005fmessage_005f2.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f2);
    return false;
  }

  private boolean _jspx_meth_stripes_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:text
    net.sourceforge.stripes.tag.InputTextTag _jspx_th_stripes_005ftext_005f0 = (net.sourceforge.stripes.tag.InputTextTag) _005fjspx_005ftagPool_005fstripes_005ftext_0026_005fname_005fid_005fclass_005fnobody.get(net.sourceforge.stripes.tag.InputTextTag.class);
    _jspx_th_stripes_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /skins/default/login.jsp(88,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005ftext_005f0.setName("userName");
    // /skins/default/login.jsp(88,48) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005ftext_005f0.setId("userName");
    // /skins/default/login.jsp(88,48) name = class type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005ftext_005f0.setCssClass("mde-text-field");
    int[] _jspx_push_body_count_stripes_005ftext_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005ftext_005f0 = _jspx_th_stripes_005ftext_005f0.doStartTag();
      if (_jspx_th_stripes_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005ftext_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005ftext_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005ftext_005f0.doFinally();
      _005fjspx_005ftagPool_005fstripes_005ftext_0026_005fname_005fid_005fclass_005fnobody.reuse(_jspx_th_stripes_005ftext_005f0);
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
    // /skins/default/login.jsp(97,48) name = list type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_portofino_005fbuttons_005f0.setList("login-buttons");
    // /skins/default/login.jsp(97,48) name = cssClass type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_portofino_005fbuttons_005f0.setCssClass("portletButton");
    _jspx_th_portofino_005fbuttons_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_portofino_005fbuttons_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /skins/default/login.jsp(100,44) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(false);
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <tr>\n");
        out.write("                                                <td colspan=\"2\">\n");
        out.write("                                                    ");
        if (_jspx_meth_fmt_005fmessage_005f3(_jspx_th_c_005fif_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
          return true;
        out.write(" <a href=\"PwdRecovery.action\">");
        if (_jspx_meth_fmt_005fmessage_005f4(_jspx_th_c_005fif_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
          return true;
        out.write("</a>\n");
        out.write("                                                </td>\n");
        out.write("                                            </tr>\n");
        out.write("                                        ");
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

  private boolean _jspx_meth_fmt_005fmessage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.el.fmt.MessageTag _jspx_th_fmt_005fmessage_005f3 = (org.apache.taglibs.standard.tag.el.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.el.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /skins/default/login.jsp(103,52) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f3.setKey("skins.default.login.forgot_pwd");
    int _jspx_eval_fmt_005fmessage_005f3 = _jspx_th_fmt_005fmessage_005f3.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f3);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.el.fmt.MessageTag _jspx_th_fmt_005fmessage_005f4 = (org.apache.taglibs.standard.tag.el.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.el.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /skins/default/login.jsp(103,133) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f4.setKey("skins.default.login.retrieve_pwd");
    int _jspx_eval_fmt_005fmessage_005f4 = _jspx_th_fmt_005fmessage_005f4.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f4);
    return false;
  }

  private boolean _jspx_meth_stripes_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:hidden
    net.sourceforge.stripes.tag.InputHiddenTag _jspx_th_stripes_005fhidden_005f0 = (net.sourceforge.stripes.tag.InputHiddenTag) _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputHiddenTag.class);
    _jspx_th_stripes_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /skins/default/login.jsp(109,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fhidden_005f0.setName("returnUrl");
    int[] _jspx_push_body_count_stripes_005fhidden_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fhidden_005f0 = _jspx_th_stripes_005fhidden_005f0.doStartTag();
      if (_jspx_th_stripes_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fhidden_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fhidden_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fhidden_005f0.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_stripes_005fhidden_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f2);
    // /skins/default/login.jsp(111,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.openIdEnabled}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <div style=\"border-top: 1px solid #ddd; padding-top: 0.5em\">\n");
        out.write("                                        ");
        if (_jspx_meth_fmt_005fmessage_005f5(_jspx_th_c_005fif_005f1, _jspx_page_context))
          return true;
        out.write(":\n");
        out.write("                                        ");
        if (_jspx_meth_stripes_005fform_005f1(_jspx_th_c_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    </div>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.el.fmt.MessageTag _jspx_th_fmt_005fmessage_005f5 = (org.apache.taglibs.standard.tag.el.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.el.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    // /skins/default/login.jsp(113,40) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f5.setKey("skins.default.login.openId");
    int _jspx_eval_fmt_005fmessage_005f5 = _jspx_th_fmt_005fmessage_005f5.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f5);
    return false;
  }

  private boolean _jspx_meth_stripes_005fform_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:form
    net.sourceforge.stripes.tag.FormTag _jspx_th_stripes_005fform_005f1 = (net.sourceforge.stripes.tag.FormTag) _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fid_005fbeanclass.get(net.sourceforge.stripes.tag.FormTag.class);
    _jspx_th_stripes_005fform_005f1.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fform_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    // /skins/default/login.jsp(114,40) name = beanclass type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fform_005f1.setBeanclass(new String("com.manydesigns.portofino.actions.user.LoginAction"));
    // /skins/default/login.jsp(114,40) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fform_005f1.setMethod("post");
    // /skins/default/login.jsp(114,40) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fform_005f1.setId("openid_form");
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
          out.write("                                            ");
          if (_jspx_meth_stripes_005fhidden_005f1(_jspx_th_stripes_005fform_005f1, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f1))
            return true;
          out.write("\n");
          out.write("                                            <input type=\"hidden\" name=\"cancelReturnUrl\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.cancelReturnUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" />\n");
          out.write("                                            <input type=\"hidden\" name=\"showOpenIDForm\" value=\"do\" />\n");
          out.write("                                            <div id=\"openid_choice\">\n");
          out.write("                                                <div id=\"openid_btns\"></div>\n");
          out.write("                                            </div>\n");
          out.write("                                            <div id=\"openid_input_area\">\n");
          out.write("                                                <input id=\"openid_identifier\" name=\"openIdUrl\" type=\"text\" value=\"http://\" />\n");
          out.write("                                                <button id=\"openid_submit\" type=\"submit\"\n");
          out.write("                                                        class=\"ui-button ui-widget ui-state-default ui-corner-all portletButton ui-button-text-only\">\n");
          out.write("                                                    <span class=\"ui-button-text\">Sign in</span>\n");
          out.write("                                                </button>\n");
          out.write("                                            </div>\n");
          out.write("                                        ");
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
      _005fjspx_005ftagPool_005fstripes_005fform_0026_005fmethod_005fid_005fbeanclass.reuse(_jspx_th_stripes_005fform_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:hidden
    net.sourceforge.stripes.tag.InputHiddenTag _jspx_th_stripes_005fhidden_005f1 = (net.sourceforge.stripes.tag.InputHiddenTag) _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputHiddenTag.class);
    _jspx_th_stripes_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f1);
    // /skins/default/login.jsp(116,44) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fhidden_005f1.setName("returnUrl");
    int[] _jspx_push_body_count_stripes_005fhidden_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fhidden_005f1 = _jspx_th_stripes_005fhidden_005f1.doStartTag();
      if (_jspx_th_stripes_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fhidden_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fhidden_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fhidden_005f1.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_stripes_005fhidden_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002ddefinition_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002ddefinition_005f0);
    // /skins/default/login.jsp(138,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mde:getString(portofinoConfiguration, 'portofino.version')}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }
}
