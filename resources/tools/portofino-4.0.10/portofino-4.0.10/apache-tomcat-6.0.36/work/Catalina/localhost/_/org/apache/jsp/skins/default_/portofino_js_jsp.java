package org.apache.jsp.skins.default_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.manydesigns.elements.servlet.ServletConstants;

public final class portofino_js_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
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
      response.setContentType("text/javascript; UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;


    // Avoid caching of dynamic pages
    response.setHeader(ServletConstants.HTTP_PRAGMA, ServletConstants.HTTP_PRAGMA_NO_CACHE);
    response.addHeader(ServletConstants.HTTP_CACHE_CONTROL, ServletConstants.HTTP_CACHE_CONTROL_MUST_REVALIDATE);
    response.addHeader(ServletConstants.HTTP_CACHE_CONTROL, ServletConstants.HTTP_CACHE_CONTROL_NO_CACHE);
    response.addHeader(ServletConstants.HTTP_CACHE_CONTROL, ServletConstants.HTTP_CACHE_CONTROL_NO_STORE);
    response.setDateHeader(ServletConstants.HTTP_EXPIRES, 0);

      out.write("\n");
      out.write("function fixSideBar() {\n");
      out.write("    $(\n");
      out.write("        function() {\n");
      out.write("            var contentNode = $('#content');\n");
      out.write("            var sideBarNode = $('#sidebar');\n");
      out.write("            var contentOffsetHeight = contentNode.prop('offsetHeight');\n");
      out.write("            var sideBarOffsetHeight = sideBarNode.prop('offsetHeight');\n");
      out.write("            if (contentOffsetHeight < sideBarOffsetHeight) {\n");
      out.write("                contentNode.css('min-height', (sideBarOffsetHeight + 5) + 'px')\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            contentNode = $('div.search_results.withSearchForm'); //TODO Serve ancora?\n");
      out.write("            sideBarNode = contentNode.parent().parent();\n");
      out.write("            contentOffsetHeight = contentNode.attr('offsetHeight');\n");
      out.write("            sideBarOffsetHeight = sideBarNode.attr('offsetHeight');\n");
      out.write("            if (contentOffsetHeight < sideBarOffsetHeight) {\n");
      out.write("                contentNode.css('min-height', sideBarOffsetHeight + 'px')\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    )\n");
      out.write("}\n");
      out.write("\n");
      out.write("function copyFormAsHiddenFields(source, form) {\n");
      out.write("    source.find(\"input, select\").each(function(index, elem) {\n");
      out.write("        elem = $(elem);\n");
      out.write("        var hiddenField = document.createElement(\"input\");\n");
      out.write("        hiddenField.setAttribute(\"type\", \"hidden\");\n");
      out.write("        hiddenField.setAttribute(\"name\", elem.attr('name'));\n");
      out.write("        hiddenField.setAttribute(\"value\", elem.val());\n");
      out.write("        form.append(hiddenField);\n");
      out.write("    });\n");
      out.write("}\n");
      out.write("\n");
      out.write("function confirmDeletePage(pagePath, contextPath) {\n");
      out.write("    var dialogDiv = $(document.createElement(\"div\"));\n");
      out.write("    dialogDiv.load(contextPath + \"/actions/admin/page?confirmDelete&originalPath=\" + pagePath, function() {\n");
      out.write("        dialogDiv.find(\"#dialog-confirm-delete-page\").dialog({\n");
      out.write("            modal: true,\n");
      out.write("            width: 500,\n");
      out.write("            buttons: {\n");
      out.write("                '");
      if (_jspx_meth_fmt_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("': function() {\n");
      out.write("                    var form = $(\"#pageAdminForm\");\n");
      out.write("                    copyFormAsHiddenFields($(this), form);\n");
      out.write("                    form.submit();\n");
      out.write("                    $(this).dialog(\"close\");\n");
      out.write("                },\n");
      out.write("                '");
      if (_jspx_meth_fmt_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("': function() {\n");
      out.write("                    $(this).dialog(\"close\");\n");
      out.write("                    dialogDiv.remove();\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("    return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function showMovePageDialog(pagePath, contextPath) {\n");
      out.write("    var dialogDiv = $(document.createElement(\"div\"));\n");
      out.write("    dialogDiv.load(contextPath + \"/actions/admin/page?chooseNewLocation&originalPath=\" + pagePath, function() {\n");
      out.write("        dialogDiv.find(\"#dialog-move-page\").dialog({\n");
      out.write("            modal: true,\n");
      out.write("            width: 500,\n");
      out.write("            buttons: {\n");
      out.write("                '");
      if (_jspx_meth_fmt_005fmessage_005f2(_jspx_page_context))
        return;
      out.write("': function() {\n");
      out.write("                    var form = $(\"#pageAdminForm\");\n");
      out.write("                    copyFormAsHiddenFields($(this), form);\n");
      out.write("                    form.submit();\n");
      out.write("                    $(this).dialog(\"close\");\n");
      out.write("                },\n");
      out.write("                '");
      if (_jspx_meth_fmt_005fmessage_005f3(_jspx_page_context))
        return;
      out.write("': function() {\n");
      out.write("                    $(this).dialog(\"close\");\n");
      out.write("                    dialogDiv.remove();\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("    return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function showCopyPageDialog(pagePath, contextPath) {\n");
      out.write("    var dialogDiv = $(document.createElement(\"div\"));\n");
      out.write("    dialogDiv.load(contextPath + \"/actions/admin/page?copyPageDialog&originalPath=\" + pagePath, function() {\n");
      out.write("        dialogDiv.find(\"#dialog-copy-page\").dialog({\n");
      out.write("            modal: true,\n");
      out.write("            width: 500,\n");
      out.write("            buttons: {\n");
      out.write("                '");
      if (_jspx_meth_fmt_005fmessage_005f4(_jspx_page_context))
        return;
      out.write("': function() {\n");
      out.write("                    var form = $(\"#pageAdminForm\");\n");
      out.write("                    copyFormAsHiddenFields($(this), form);\n");
      out.write("                    form.submit();\n");
      out.write("                    $(this).dialog(\"close\");\n");
      out.write("                },\n");
      out.write("                '");
      if (_jspx_meth_fmt_005fmessage_005f5(_jspx_page_context))
        return;
      out.write("': function() {\n");
      out.write("                    $(this).dialog(\"close\");\n");
      out.write("                    dialogDiv.remove();\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("    return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("var portofino = {\n");
      out.write("    _setupRichTextEditors: setupRichTextEditors,\n");
      out.write("\n");
      out.write("    decorateButton: function(selector, options) {\n");
      out.write("        $(selector).each(function(index, element) {\n");
      out.write("            element = $(element);\n");
      out.write("            element.html(element.find('.ui-button-text').html());\n");
      out.write("            element.button(options);\n");
      out.write("        });\n");
      out.write("    },\n");
      out.write("\n");
      out.write("    decorateIconButton: function(selector, icon) {\n");
      out.write("        portofino.decorateButton(selector, {\n");
      out.write("            icons: {\n");
      out.write("                primary: icon\n");
      out.write("            },\n");
      out.write("            text: false\n");
      out.write("        });\n");
      out.write("    },\n");
      out.write("\n");
      out.write("    setupRichTextEditors: function(config) {\n");
      out.write("        config = config || {};\n");
      out.write("        var windowWidth, windowHeight;\n");
      out.write("        if (window.innerWidth && window.innerHeight) {\n");
      out.write("            windowWidth = window.innerWidth;\n");
      out.write("            windowHeight = window.innerHeight;\n");
      out.write("        } else if (document.compatMode=='CSS1Compat' &&\n");
      out.write("            document.documentElement &&\n");
      out.write("            document.documentElement.offsetWidth ) {\n");
      out.write("            windowWidth = document.documentElement.offsetWidth;\n");
      out.write("            windowHeight = document.documentElement.offsetHeight;\n");
      out.write("        } else if (document.body && document.body.offsetWidth) {\n");
      out.write("            windowWidth = document.body.offsetWidth;\n");
      out.write("            windowHeight = document.body.offsetHeight;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var baseConfig = {};\n");
      out.write("        if(windowHeight) {\n");
      out.write("            baseConfig.height =\n");
      out.write("                    windowHeight -\n");
      out.write("                    $(\"textarea.mde-form-rich-text\").offset().top -\n");
      out.write("                    $(\"#ft\").height() -\n");
      out.write("                    $(\".contentFooter\").height() -\n");
      out.write("                    250; //250 ~= toolbar 3 righe + footer + margine tolleranza\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        config = $.extend(baseConfig, {\n");
      out.write("            customConfig : '");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("/ckeditor-custom/config.js',\n");
      out.write("            toolbar: 'PortofinoDefault',\n");
      out.write("            toolbarCanCollapse: false,\n");
      out.write("            filebrowserWindowWidth : windowWidth,\n");
      out.write("            filebrowserWindowHeight : windowHeight\n");
      out.write("        }, config);\n");
      out.write("\n");
      out.write("        $('textarea.mde-form-rich-text').data('mdeRichTextConfig', config);\n");
      out.write("        portofino._setupRichTextEditors();\n");
      out.write("    }\n");
      out.write("};\n");
      out.write("\n");
      out.write("setupRichTextEditors = function() {/* Do nothing (remove default initialization by Elements) */};\n");
      out.write("\n");
      out.write("$(function() {\n");
      out.write("    portofino.decorateButton(\"button.contentButton\");\n");
      out.write("    portofino.decorateButton(\"button.portletButton\");\n");
      out.write("\n");
      out.write("    portofino.decorateIconButton(\"button.arrow-4\", \"ui-icon-arrow-4\");\n");
      out.write("    portofino.decorateIconButton(\"button.refresh\", \"ui-icon-refresh\");\n");
      out.write("    portofino.decorateIconButton(\"button.person\", \"ui-icon-person\");\n");
      out.write("    portofino.decorateIconButton(\"button.copy\", \"ui-icon-copy\");\n");
      out.write("    portofino.decorateIconButton(\"button.plusthick\", \"ui-icon-plusthick\");\n");
      out.write("    portofino.decorateIconButton(\"button.minusthick\", \"ui-icon-minusthick\");\n");
      out.write("    portofino.decorateIconButton(\"button.transferthick-e-w\", \"ui-icon-transferthick-e-w\");\n");
      out.write("    portofino.decorateIconButton(\"button.folder-open\", \"ui-icon-folder-open\");\n");
      out.write("    portofino.decorateIconButton(\".portletHeaderButtons button[name=configure]\", \"ui-icon-wrench\");\n");
      out.write("});\n");
      out.write("\n");
      out.write("function enablePortletDragAndDrop(button) {\n");
      out.write("    $(\"div.portletContainer\").sortable({\n");
      out.write("        connectWith: \"div.portletContainer\",\n");
      out.write("        placeholder: \"portletPlaceholder\",\n");
      out.write("        cursor: \"move\", // cursor image\n");
      out.write("        revert: true, // moves the portlet to its new position with a smooth transition\n");
      out.write("        tolerance: \"pointer\" // mouse pointer overlaps the droppable\n");
      out.write("    }).disableSelection().addClass(\"portletBox\");\n");
      out.write("\n");
      out.write("    var container = $(button).parent();\n");
      out.write("    $(button).remove();\n");
      out.write("    container.prepend('<button name=\"cancel\" type=\"submit\" class=\"contentButton\">Cancel</button> ');\n");
      out.write("    container.prepend('<button name=\"updateLayout\" type=\"submit\" class=\"contentButton\">Save</button>');\n");
      out.write("    container.children(\"button[name=cancel]\").button();\n");
      out.write("    container.children(\"button[name=updateLayout]\").button();\n");
      out.write("    $(\"button[name=updateLayout]\").click(function() {\n");
      out.write("        var theButton = $(this);\n");
      out.write("        $('div.portletContainer').each(function(index, element) {\n");
      out.write("            var wrapper = $(element);\n");
      out.write("            var templateHiddenField = wrapper.children(\"input[type=hidden]\").first();\n");
      out.write("            var elements = wrapper.sortable('toArray');\n");
      out.write("            for(var e in elements) {\n");
      out.write("                var id = elements[e];\n");
      out.write("                var hiddenField = document.createElement(\"input\");\n");
      out.write("                hiddenField.setAttribute(\"type\", \"hidden\");\n");
      out.write("                hiddenField.setAttribute(\"name\", templateHiddenField.val());\n");
      out.write("                hiddenField.setAttribute(\"value\", id.substring(\"portletWrapper_\".length));\n");
      out.write("                theButton.before(hiddenField);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("        return true;\n");
      out.write("    });\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("var HTML_CHARS = {\n");
      out.write("    '&': '&amp;',\n");
      out.write("    '<': '&lt;',\n");
      out.write("    '>': '&gt;',\n");
      out.write("    '\"': '&quot;',\n");
      out.write("    \"'\": '&#x27;',\n");
      out.write("    '/': '&#x2F;',\n");
      out.write("    '`': '&#x60;'\n");
      out.write("};\n");
      out.write("\n");
      out.write("function htmlEscape (string) {\n");
      out.write("    if(string == null) {\n");
      out.write("        return string;\n");
      out.write("    }\n");
      out.write("    return (string + '').replace(/[&<>\"'\\/`]/g, function (match) {\n");
      out.write("        return HTML_CHARS[match];\n");
      out.write("    });\n");
      out.write("}\n");
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

  private boolean _jspx_meth_fmt_005fmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f0.setParent(null);
    // /skins/default/portofino.js.jsp(52,17) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f0.setKey("commons.delete");
    int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f1.setParent(null);
    // /skins/default/portofino.js.jsp(58,17) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f1.setKey("commons.cancel");
    int _jspx_eval_fmt_005fmessage_005f1 = _jspx_th_fmt_005fmessage_005f1.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f2.setParent(null);
    // /skins/default/portofino.js.jsp(75,17) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f2.setKey("commons.move");
    int _jspx_eval_fmt_005fmessage_005f2 = _jspx_th_fmt_005fmessage_005f2.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f2);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f3.setParent(null);
    // /skins/default/portofino.js.jsp(81,17) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f3.setKey("commons.cancel");
    int _jspx_eval_fmt_005fmessage_005f3 = _jspx_th_fmt_005fmessage_005f3.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f3);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f4.setParent(null);
    // /skins/default/portofino.js.jsp(98,17) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f4.setKey("commons.copy");
    int _jspx_eval_fmt_005fmessage_005f4 = _jspx_th_fmt_005fmessage_005f4.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f4);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f5.setParent(null);
    // /skins/default/portofino.js.jsp(104,17) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f5.setKey("commons.cancel");
    int _jspx_eval_fmt_005fmessage_005f5 = _jspx_th_fmt_005fmessage_005f5.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent(null);
    // /skins/default/portofino.js.jsp(161,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }
}
