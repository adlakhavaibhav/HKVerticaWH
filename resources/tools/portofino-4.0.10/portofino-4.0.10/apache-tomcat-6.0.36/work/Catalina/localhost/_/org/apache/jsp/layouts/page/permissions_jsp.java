package org.apache.jsp.layouts.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.manydesigns.portofino.dispatcher.PageInstance;
import com.manydesigns.portofino.logic.SecurityLogic;
import com.manydesigns.portofino.pages.Page;
import com.manydesigns.portofino.pages.Permissions;
import com.manydesigns.portofino.security.AccessLevel;
import com.manydesigns.portofino.shiro.GroupPermission;
import com.manydesigns.portofino.shiro.PagePermission;
import java.util.Collections;

public final class permissions_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tags/buttons.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005fname_005fformActionUrl;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fvar_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fparam_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005fname_005fformActionUrl = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fvar_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fparam_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005fname_005fformActionUrl.release();
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fvar_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey.release();
    _005fjspx_005ftagPool_005ffmt_005fparam_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody.release();
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

      //  stripes:layout-render
      net.sourceforge.stripes.tag.layout.LayoutRenderTag _jspx_th_stripes_005flayout_002drender_005f0 = (net.sourceforge.stripes.tag.layout.LayoutRenderTag) _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005fname_005fformActionUrl.get(net.sourceforge.stripes.tag.layout.LayoutRenderTag.class);
      _jspx_th_stripes_005flayout_002drender_005f0.setPageContext(_jspx_page_context);
      _jspx_th_stripes_005flayout_002drender_005f0.setParent(null);
      // /layouts/page/permissions.jsp(16,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_stripes_005flayout_002drender_005f0.setName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/skins/${skin}${actionBean.pageTemplate}/modal.jsp", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      // /layouts/page/permissions.jsp(16,2) null
      _jspx_th_stripes_005flayout_002drender_005f0.setDynamicAttribute(null, "formActionUrl", new String("/actions/admin/page"));
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
          com.manydesigns.portofino.actions.admin.page.PageAdminAction actionBean = null;
          synchronized (request) {
            actionBean = (com.manydesigns.portofino.actions.admin.page.PageAdminAction) _jspx_page_context.getAttribute("actionBean", PageContext.REQUEST_SCOPE);
            if (actionBean == null){
              throw new java.lang.InstantiationException("bean actionBean not found within scope");
            }
          }
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_stripes_005flayout_002dcomponent_005f0(_jspx_th_stripes_005flayout_002drender_005f0, _jspx_page_context))
            return;
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
          // /layouts/page/permissions.jsp(26,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_stripes_005flayout_002dcomponent_005f2.setName("portletBody");
          int _jspx_eval_stripes_005flayout_002dcomponent_005f2 = _jspx_th_stripes_005flayout_002dcomponent_005f2.doStartTag();
          if (_jspx_eval_stripes_005flayout_002dcomponent_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("        <input type=\"hidden\" name=\"originalPath\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.dispatch.originalPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\" />\n");
            out.write("        <div class=\"yui-gc\">\n");
            out.write("            <div class=\"yui-u first\" style=\"width: auto;\">\n");
            out.write("                <table>\n");
            out.write("                ");

                    PageInstance currentPageInstance = actionBean.getPageInstance();
                    Page currentPage = currentPageInstance.getPage();
                    String[] supportedPermissions = actionBean.getSupportedPermissions();
                    if(supportedPermissions != null) {
                
            out.write("\n");
            out.write("                    <tr>\n");
            out.write("                        <th rowspan=\"2\">");
            if (_jspx_meth_fmt_005fmessage_005f1(_jspx_th_stripes_005flayout_002dcomponent_005f2, _jspx_page_context))
              return;
            out.write("</th>\n");
            out.write("                        <th rowspan=\"2\">");
            if (_jspx_meth_fmt_005fmessage_005f2(_jspx_th_stripes_005flayout_002dcomponent_005f2, _jspx_page_context))
              return;
            out.write("</th>\n");
            out.write("                        <th colspan=\"");
            out.print( supportedPermissions.length );
            out.write('"');
            out.write('>');
            if (_jspx_meth_fmt_005fmessage_005f3(_jspx_th_stripes_005flayout_002dcomponent_005f2, _jspx_page_context))
              return;
            out.write("</th>\n");
            out.write("                    </tr>\n");
            out.write("                    <tr>\n");
            out.write("                        ");
            //  c:forEach
            org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
            _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
            _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f2);
            // /layouts/page/permissions.jsp(43,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fforEach_005f0.setVar("perm");
            // /layouts/page/permissions.jsp(43,24) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fforEach_005f0.setItems( supportedPermissions );
            int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
            try {
              int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
              if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("                            <th>");
                  if (_jspx_meth_fmt_005fmessage_005f4(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
                    return;
                  out.write("</th>\n");
                  out.write("                        ");
                  int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_c_005fforEach_005f0.doFinally();
              _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
            }
            out.write("\n");
            out.write("                    </tr>\n");
            out.write("                ");
 } else { 
            out.write("\n");
            out.write("                    <tr>\n");
            out.write("                        <th>");
            if (_jspx_meth_fmt_005fmessage_005f5(_jspx_th_stripes_005flayout_002dcomponent_005f2, _jspx_page_context))
              return;
            out.write("</th>\n");
            out.write("                        <th>");
            if (_jspx_meth_fmt_005fmessage_005f6(_jspx_th_stripes_005flayout_002dcomponent_005f2, _jspx_page_context))
              return;
            out.write("</th>\n");
            out.write("                    </tr>\n");
            out.write("                ");
 } 
            out.write("\n");
            out.write("                    ");
            //  c:forEach
            org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
            _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
            _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f2);
            // /layouts/page/permissions.jsp(53,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fforEach_005f1.setVar("group");
            // /layouts/page/permissions.jsp(53,20) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.groups}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
            int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
            try {
              int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
              if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("                        <tr>\n");
                  out.write("                            ");

                                final String groupId = (String) pageContext.getAttribute("group");
                                GroupPermission groupPermission = new GroupPermission(Collections.singleton(groupId));

                                AccessLevel localAccessLevel = actionBean.getLocalAccessLevel(currentPage, groupId);
                                AccessLevel parentAccessLevel = null;
                                PageInstance parentPageInstance = currentPageInstance.getParent();
                                if(parentPageInstance != null) {
                                    Permissions parentPermissions =
                                            SecurityLogic.calculateActualPermissions(parentPageInstance);
                                    parentAccessLevel = parentPermissions.getActualLevels().get(groupId);
                                }
                                if(parentAccessLevel == null) {
                                    parentAccessLevel = AccessLevel.NONE;
                                }
                                Permissions permissions = SecurityLogic.calculateActualPermissions(currentPageInstance);
                            
                  out.write("\n");
                  out.write("                            <td>\n");
                  out.write("                                ");
                  if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
                    return;
                  out.write("\n");
                  out.write("                            </td>\n");
                  out.write("                            <td>\n");
                  out.write("                                <select name=\"accessLevels[");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${group}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                  out.write("]\"\n");
                  out.write("                                        ");

                                            if(AccessLevel.DENY.equals(parentAccessLevel)) {
                                                out.print("disabled='disabled'");
                                            }
                                        
                  out.write(">\n");
                  out.write("                                    <option value=\"\">\n");
                  out.write("                                        ");
                  //  fmt:message
                  org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fvar_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
                  _jspx_th_fmt_005fmessage_005f7.setPageContext(_jspx_page_context);
                  _jspx_th_fmt_005fmessage_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
                  // /layouts/page/permissions.jsp(83,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_fmt_005fmessage_005f7.setKey( "permissions.level." + parentAccessLevel.name().toLowerCase() );
                  // /layouts/page/permissions.jsp(83,40) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_fmt_005fmessage_005f7.setVar("parentAccessLevelName");
                  int _jspx_eval_fmt_005fmessage_005f7 = _jspx_th_fmt_005fmessage_005f7.doStartTag();
                  if (_jspx_th_fmt_005fmessage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fvar_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f7);
                    return;
                  }
                  _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fvar_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f7);
                  out.write("\n");
                  out.write("                                        ");
                  if (_jspx_meth_fmt_005fmessage_005f8(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
                    return;
                  out.write("\n");
                  out.write("                                    </option>\n");
                  out.write("                                    <option value=\"");
                  out.print( AccessLevel.NONE.name() );
                  out.write("\"\n");
                  out.write("                                            ");

                                                if (AccessLevel.NONE.equals(localAccessLevel)) {
                                                    out.print("selected='selected'");
                                                }
                                            
                  out.write(">\n");
                  out.write("                                        ");
                  if (_jspx_meth_fmt_005fmessage_005f9(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
                    return;
                  out.write("\n");
                  out.write("                                    </option>\n");
                  out.write("                                    <option value=\"");
                  out.print( AccessLevel.VIEW.name() );
                  out.write("\"\n");
                  out.write("                                            ");

                                                if (AccessLevel.VIEW.equals(localAccessLevel)) {
                                                    out.print("selected='selected'");
                                                }
                                            
                  out.write(">\n");
                  out.write("                                        ");
                  if (_jspx_meth_fmt_005fmessage_005f10(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
                    return;
                  out.write("\n");
                  out.write("                                    </option>\n");
                  out.write("                                    <option value=\"");
                  out.print( AccessLevel.EDIT.name() );
                  out.write("\"\n");
                  out.write("                                            ");

                                                if (AccessLevel.EDIT.equals(localAccessLevel)) {
                                                    out.print("selected='selected'");
                                                }
                                            
                  out.write(">\n");
                  out.write("                                        ");
                  if (_jspx_meth_fmt_005fmessage_005f11(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
                    return;
                  out.write("\n");
                  out.write("                                    </option>\n");
                  out.write("                                    <option value=\"");
                  out.print( AccessLevel.DEVELOP.name() );
                  out.write("\"\n");
                  out.write("                                            ");

                                                if (AccessLevel.DEVELOP.equals(localAccessLevel)) {
                                                    out.print("selected='selected'");
                                                }
                                            
                  out.write(">\n");
                  out.write("                                        ");
                  if (_jspx_meth_fmt_005fmessage_005f12(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
                    return;
                  out.write("\n");
                  out.write("                                    </option>\n");
                  out.write("                                    <option value=\"");
                  out.print( AccessLevel.DENY.name() );
                  out.write("\"\n");
                  out.write("                                            ");

                                                if (AccessLevel.DENY.equals(localAccessLevel)) {
                                                    out.print("selected='selected'");
                                                }
                                            
                  out.write(">\n");
                  out.write("                                        ");
                  if (_jspx_meth_fmt_005fmessage_005f13(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
                    return;
                  out.write("\n");
                  out.write("                                    </option>\n");
                  out.write("                                </select>\n");
                  out.write("                            </td>\n");
                  out.write("                            ");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fforEach_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
                  // /layouts/page/permissions.jsp(131,28) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f2.setVar("perm");
                  // /layouts/page/permissions.jsp(131,28) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f2.setItems( supportedPermissions );
                  int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
                    if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\n");
                        out.write("                                <td>\n");
                        out.write("                                    <input type=\"checkbox\" name=\"permissions[");
                        out.print( groupId );
                        out.write("]\"\n");
                        out.write("                                           value=\"");
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                        out.write("\"\n");
                        out.write("                                           ");

                                               String testedPermission = (String) pageContext.getAttribute("perm");
                                               Permissions testConf = new Permissions();
                                               testConf.getActualPermissions()
                                                       .put(groupId, permissions.getActualPermissions().get(groupId));
                                               testConf.getActualLevels().put(groupId, AccessLevel.DEVELOP);
                                               PagePermission pagePermission =
                                                       new PagePermission
                                                               (testConf, AccessLevel.NONE, testedPermission);
                                               if(groupPermission.implies(pagePermission)) {
                                                   out.print("checked='checked'");
                                               }
                                           
                        out.write("/>\n");
                        out.write("                                </td>\n");
                        out.write("                            ");
                        int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_c_005fforEach_005f2.doFinally();
                    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
                  }
                  out.write("\n");
                  out.write("                        </tr>\n");
                  out.write("                    ");
                  int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_c_005fforEach_005f1.doFinally();
              _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
            }
            out.write("\n");
            out.write("                </table>\n");
            out.write("            </div>\n");
            out.write("            <div class=\"yui-u\" style=\"min-width: 20em;\">\n");
            out.write("                <h2 style=\"margin-top: 0;\">");
            if (_jspx_meth_fmt_005fmessage_005f14(_jspx_th_stripes_005flayout_002dcomponent_005f2, _jspx_page_context))
              return;
            out.write("</h2>\n");
            out.write("                <label for=\"testUserIdSelect\">");
            if (_jspx_meth_fmt_005fmessage_005f15(_jspx_th_stripes_005flayout_002dcomponent_005f2, _jspx_page_context))
              return;
            out.write("</label>\n");
            out.write("                ");
            if (_jspx_meth_c_005fif_005f0(_jspx_th_stripes_005flayout_002dcomponent_005f2, _jspx_page_context))
              return;
            out.write("\n");
            out.write("                ");
            if (_jspx_meth_c_005fif_005f2(_jspx_th_stripes_005flayout_002dcomponent_005f2, _jspx_page_context))
              return;
            out.write("\n");
            out.write("                <input type=\"hidden\" name=\"originalPath\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.dispatch.originalPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\" />\n");
            out.write("                ");
            if (_jspx_meth_portofino_005fbuttons_005f1(_jspx_th_stripes_005flayout_002dcomponent_005f2, _jspx_page_context))
              return;
            out.write("\n");
            out.write("                <br /><br />\n");
            out.write("                <table id=\"userPermissionTestResults\">\n");
            out.write("                    ");
            //  c:if
            org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
            _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
            _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f2);
            // /layouts/page/permissions.jsp(173,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty actionBean.testedAccessLevel}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
            int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
            if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("\n");
                out.write("                        <tr>\n");
                out.write("                            <th>");
                if (_jspx_meth_fmt_005fmessage_005f16(_jspx_th_c_005fif_005f3, _jspx_page_context))
                  return;
                out.write(":</th>\n");
                out.write("                            <td>");
                //  fmt:message
                org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f17 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
                _jspx_th_fmt_005fmessage_005f17.setPageContext(_jspx_page_context);
                _jspx_th_fmt_005fmessage_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
                // /layouts/page/permissions.jsp(176,32) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_fmt_005fmessage_005f17.setKey( "permissions.level." + actionBean.getTestedAccessLevel().name().toLowerCase() );
                int _jspx_eval_fmt_005fmessage_005f17 = _jspx_th_fmt_005fmessage_005f17.doStartTag();
                if (_jspx_th_fmt_005fmessage_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f17);
                  return;
                }
                _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f17);
                out.write("</td>\n");
                out.write("                        </tr>\n");
                out.write("                    ");
                int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
              return;
            }
            _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
            out.write("\n");
            out.write("                    ");
            if (_jspx_meth_c_005fif_005f4(_jspx_th_stripes_005flayout_002dcomponent_005f2, _jspx_page_context))
              return;
            out.write("\n");
            out.write("                </table>\n");
            out.write("            </div>\n");
            out.write("        </div>\n");
            out.write("        <input type=\"hidden\" name=\"cancelReturnUrl\" value=\"");
            if (_jspx_meth_c_005fout_005f3(_jspx_th_stripes_005flayout_002dcomponent_005f2, _jspx_page_context))
              return;
            out.write("\"/>\n");
            out.write("    ");
          }
          if (_jspx_th_stripes_005flayout_002dcomponent_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f2);
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_stripes_005flayout_002dcomponent_005f3(_jspx_th_stripes_005flayout_002drender_005f0, _jspx_page_context))
            return;
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
        _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005fname_005fformActionUrl.reuse(_jspx_th_stripes_005flayout_002drender_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005fname_005fformActionUrl.reuse(_jspx_th_stripes_005flayout_002drender_005f0);
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

  private boolean _jspx_meth_stripes_005flayout_002dcomponent_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002drender_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  stripes:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f0 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_stripes_005flayout_002dcomponent_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002dcomponent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002drender_005f0);
    // /layouts/page/permissions.jsp(18,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f0.setName("contentHeader");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f0 = _jspx_th_stripes_005flayout_002dcomponent_005f0.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_portofino_005fbuttons_005f0(_jspx_th_stripes_005flayout_002dcomponent_005f0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/skins/${skin}/breadcrumbs.jsp", java.lang.String.class, (PageContext)_jspx_page_context, null, false), out, false);
      out.write("\n");
      out.write("    ");
    }
    if (_jspx_th_stripes_005flayout_002dcomponent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f0);
    return false;
  }

  private boolean _jspx_meth_portofino_005fbuttons_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portofino:buttons
    org.apache.jsp.tag.web.buttons_tag _jspx_th_portofino_005fbuttons_005f0 = new org.apache.jsp.tag.web.buttons_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_portofino_005fbuttons_005f0);
    _jspx_th_portofino_005fbuttons_005f0.setJspContext(_jspx_page_context);
    _jspx_th_portofino_005fbuttons_005f0.setParent(_jspx_th_stripes_005flayout_002dcomponent_005f0);
    // /layouts/page/permissions.jsp(19,8) name = list type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_portofino_005fbuttons_005f0.setList("page-permissions-edit");
    // /layouts/page/permissions.jsp(19,8) name = cssClass type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_portofino_005fbuttons_005f0.setCssClass("contentButton");
    _jspx_th_portofino_005fbuttons_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_portofino_005fbuttons_005f0);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002dcomponent_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002drender_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f1 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_stripes_005flayout_002dcomponent_005f1.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002dcomponent_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002drender_005f0);
    // /layouts/page/permissions.jsp(22,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f1.setName("portletTitle");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f1 = _jspx_th_stripes_005flayout_002dcomponent_005f1.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_fmt_005fmessage_005f0(_jspx_th_stripes_005flayout_002dcomponent_005f1, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_005fout_005f0(_jspx_th_stripes_005flayout_002dcomponent_005f1, _jspx_page_context))
        return true;
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

  private boolean _jspx_meth_fmt_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f1);
    // /layouts/page/permissions.jsp(23,8) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f0.setKey("layouts.page.permissions.page-permissions-for");
    int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f1);
    // /layouts/page/permissions.jsp(24,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.page.title}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f2);
    // /layouts/page/permissions.jsp(38,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f1.setKey("layouts.page.permissions.group");
    int _jspx_eval_fmt_005fmessage_005f1 = _jspx_th_fmt_005fmessage_005f1.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f2);
    // /layouts/page/permissions.jsp(39,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f2.setKey("layouts.page.permissions.access-level");
    int _jspx_eval_fmt_005fmessage_005f2 = _jspx_th_fmt_005fmessage_005f2.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f2);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f2);
    // /layouts/page/permissions.jsp(40,73) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f3.setKey("layouts.page.permissions.permissions");
    int _jspx_eval_fmt_005fmessage_005f3 = _jspx_th_fmt_005fmessage_005f3.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f3);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /layouts/page/permissions.jsp(44,32) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f4.setKey((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fmessage_005f4 = _jspx_th_fmt_005fmessage_005f4.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f4);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f2);
    // /layouts/page/permissions.jsp(49,28) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f5.setKey("layouts.page.permissions.group");
    int _jspx_eval_fmt_005fmessage_005f5 = _jspx_th_fmt_005fmessage_005f5.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f5);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f2);
    // /layouts/page/permissions.jsp(50,28) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f6.setKey("layouts.page.permissions.access-level");
    int _jspx_eval_fmt_005fmessage_005f6 = _jspx_th_fmt_005fmessage_005f6.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /layouts/page/permissions.jsp(73,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${group}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /layouts/page/permissions.jsp(85,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f8.setKey("permissions.level.inherited");
    int _jspx_eval_fmt_005fmessage_005f8 = _jspx_th_fmt_005fmessage_005f8.doStartTag();
    if (_jspx_eval_fmt_005fmessage_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_fmt_005fmessage_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_005fforEach_005f1[0]++;
        _jspx_th_fmt_005fmessage_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_fmt_005fmessage_005f8.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_fmt_005fparam_005f0(_jspx_th_fmt_005fmessage_005f8, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write("\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_fmt_005fmessage_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_fmt_005fmessage_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_005fforEach_005f1[0]--;
      }
    }
    if (_jspx_th_fmt_005fmessage_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey.reuse(_jspx_th_fmt_005fmessage_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey.reuse(_jspx_th_fmt_005fmessage_005f8);
    return false;
  }

  private boolean _jspx_meth_fmt_005fparam_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fmessage_005f8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:param
    org.apache.taglibs.standard.tag.rt.fmt.ParamTag _jspx_th_fmt_005fparam_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.ParamTag) _005fjspx_005ftagPool_005ffmt_005fparam_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.ParamTag.class);
    _jspx_th_fmt_005fparam_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fmessage_005f8);
    // /layouts/page/permissions.jsp(86,44) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fparam_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${parentAccessLevelName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fparam_005f0 = _jspx_th_fmt_005fparam_005f0.doStartTag();
    if (_jspx_th_fmt_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fparam_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fparam_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f9.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /layouts/page/permissions.jsp(95,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f9.setKey("permissions.level.none");
    int _jspx_eval_fmt_005fmessage_005f9 = _jspx_th_fmt_005fmessage_005f9.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f9);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f10 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f10.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /layouts/page/permissions.jsp(103,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f10.setKey("permissions.level.view");
    int _jspx_eval_fmt_005fmessage_005f10 = _jspx_th_fmt_005fmessage_005f10.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f10);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f11 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f11.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /layouts/page/permissions.jsp(111,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f11.setKey("permissions.level.edit");
    int _jspx_eval_fmt_005fmessage_005f11 = _jspx_th_fmt_005fmessage_005f11.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f11);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f12 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f12.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /layouts/page/permissions.jsp(119,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f12.setKey("permissions.level.develop");
    int _jspx_eval_fmt_005fmessage_005f12 = _jspx_th_fmt_005fmessage_005f12.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f12);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f13 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f13.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /layouts/page/permissions.jsp(127,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f13.setKey("permissions.level.deny");
    int _jspx_eval_fmt_005fmessage_005f13 = _jspx_th_fmt_005fmessage_005f13.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f13);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f14 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f14.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f2);
    // /layouts/page/permissions.jsp(155,43) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f14.setKey("layouts.page.permissions.test-a-user");
    int _jspx_eval_fmt_005fmessage_005f14 = _jspx_th_fmt_005fmessage_005f14.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f14);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f15 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f15.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f2);
    // /layouts/page/permissions.jsp(156,46) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f15.setKey("layouts.page.permissions.select-a-user");
    int _jspx_eval_fmt_005fmessage_005f15 = _jspx_th_fmt_005fmessage_005f15.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f15);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f2);
    // /layouts/page/permissions.jsp(157,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.users != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <select name=\"testUserId\" id=\"testUserIdSelect\">\n");
        out.write("                        ");
        if (_jspx_meth_c_005fforEach_005f3(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    </select>\n");
        out.write("                ");
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

  private boolean _jspx_meth_c_005fforEach_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /layouts/page/permissions.jsp(159,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVar("user");
    // /layouts/page/permissions.jsp(159,24) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.users}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("                                    ");
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
            return true;
          out.write("\n");
          out.write("                                    >");
          if (_jspx_meth_c_005fout_005f2(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
            return true;
          out.write("</option>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f3.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    // /layouts/page/permissions.jsp(161,36) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.testUserId eq user}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected=\"selected\"");
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

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    // /layouts/page/permissions.jsp(162,37) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty user ? '(anonymous)' : user}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f2);
    // /layouts/page/permissions.jsp(166,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.users == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <input name=\"testUserId\" id=\"testUserIdSelect\" type=\"text\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.testUserId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_portofino_005fbuttons_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portofino:buttons
    org.apache.jsp.tag.web.buttons_tag _jspx_th_portofino_005fbuttons_005f1 = new org.apache.jsp.tag.web.buttons_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_portofino_005fbuttons_005f1);
    _jspx_th_portofino_005fbuttons_005f1.setJspContext(_jspx_page_context);
    _jspx_th_portofino_005fbuttons_005f1.setParent(_jspx_th_stripes_005flayout_002dcomponent_005f2);
    // /layouts/page/permissions.jsp(170,16) name = list type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_portofino_005fbuttons_005f1.setList("testUserPermissions");
    // /layouts/page/permissions.jsp(170,16) name = cssClass type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_portofino_005fbuttons_005f1.setCssClass("portletButton");
    _jspx_th_portofino_005fbuttons_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_portofino_005fbuttons_005f1);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f16 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f16.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    // /layouts/page/permissions.jsp(175,32) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f16.setKey("layouts.page.permissions.access-level");
    int _jspx_eval_fmt_005fmessage_005f16 = _jspx_th_fmt_005fmessage_005f16.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f16);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f2);
    // /layouts/page/permissions.jsp(179,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty actionBean.testedPermissions}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <tr>\n");
        out.write("                            <th>");
        if (_jspx_meth_fmt_005fmessage_005f18(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write(":</th>\n");
        out.write("                            <td>\n");
        out.write("                                <ul style=\"margin: 0;\">\n");
        out.write("                                    ");
        if (_jspx_meth_c_005fforEach_005f4(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                </ul>\n");
        out.write("                            </td>\n");
        out.write("                        </tr>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f18 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f18.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /layouts/page/permissions.jsp(181,32) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f18.setKey("layouts.page.permissions.permissions");
    int _jspx_eval_fmt_005fmessage_005f18 = _jspx_th_fmt_005fmessage_005f18.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f18);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /layouts/page/permissions.jsp(184,36) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setVar("perm");
    // /layouts/page/permissions.jsp(184,36) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.testedPermissions}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f4 = _jspx_th_c_005fforEach_005f4.doStartTag();
      if (_jspx_eval_c_005fforEach_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <li>");
          if (_jspx_meth_fmt_005fmessage_005f19(_jspx_th_c_005fforEach_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
            return true;
          out.write("</li>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f4.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f19 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f19.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f4);
    // /layouts/page/permissions.jsp(185,44) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f19.setKey((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fmessage_005f19 = _jspx_th_fmt_005fmessage_005f19.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f19);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f2);
    // /layouts/page/permissions.jsp(194,59) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.cancelReturnUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
    if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
    return false;
  }

  private boolean _jspx_meth_stripes_005flayout_002dcomponent_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002drender_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f3 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_stripes_005flayout_002dcomponent_005f3.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flayout_002dcomponent_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002drender_005f0);
    // /layouts/page/permissions.jsp(196,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f3.setName("portletFooter");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f3 = _jspx_th_stripes_005flayout_002dcomponent_005f3.doStartTag();
    if (_jspx_th_stripes_005flayout_002dcomponent_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname_005fnobody.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f3);
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
    // /layouts/page/permissions.jsp(197,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flayout_002dcomponent_005f4.setName("contentFooter");
    int _jspx_eval_stripes_005flayout_002dcomponent_005f4 = _jspx_th_stripes_005flayout_002dcomponent_005f4.doStartTag();
    if (_jspx_eval_stripes_005flayout_002dcomponent_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_portofino_005fbuttons_005f2(_jspx_th_stripes_005flayout_002dcomponent_005f4, _jspx_page_context))
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

  private boolean _jspx_meth_portofino_005fbuttons_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portofino:buttons
    org.apache.jsp.tag.web.buttons_tag _jspx_th_portofino_005fbuttons_005f2 = new org.apache.jsp.tag.web.buttons_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_portofino_005fbuttons_005f2);
    _jspx_th_portofino_005fbuttons_005f2.setJspContext(_jspx_page_context);
    _jspx_th_portofino_005fbuttons_005f2.setParent(_jspx_th_stripes_005flayout_002dcomponent_005f4);
    // /layouts/page/permissions.jsp(198,8) name = list type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_portofino_005fbuttons_005f2.setList("page-permissions-edit");
    // /layouts/page/permissions.jsp(198,8) name = cssClass type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_portofino_005fbuttons_005f2.setCssClass("contentButton");
    _jspx_th_portofino_005fbuttons_005f2.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_portofino_005fbuttons_005f2);
    return false;
  }
}
