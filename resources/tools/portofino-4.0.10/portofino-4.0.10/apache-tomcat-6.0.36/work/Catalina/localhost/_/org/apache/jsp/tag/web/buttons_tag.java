package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.manydesigns.elements.xml.XhtmlBuffer;
import com.manydesigns.portofino.buttons.ButtonInfo;
import com.manydesigns.portofino.buttons.ButtonsLogic;
import com.manydesigns.portofino.buttons.GuardType;
import com.manydesigns.portofino.buttons.annotations.Button;
import com.manydesigns.portofino.dispatcher.PageAction;
import com.manydesigns.portofino.dispatcher.PageInstance;
import com.manydesigns.portofino.logic.SecurityLogic;
import net.sourceforge.stripes.action.ActionBean;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import javax.servlet.jsp.jstl.fmt.LocalizationContext;
import java.lang.reflect.Method;
import java.util.List;
import java.util.MissingResourceException;
import java.util.UUID;

public final class buttons_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {



    protected String getValue(ButtonInfo button, LocalizationContext localizationContext) {
        String key = button.getButton().key();
        if(!StringUtils.isEmpty(key)) {
            try {
                return localizationContext.getResourceBundle().getString(key);
            } catch (MissingResourceException e) {
                //ignore
            }
        }
        return button.getMethod().getName();
    }

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fvar_005fscope_005fkey_005fnobody;

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
  private java.lang.String list;
  private java.lang.String cssClass;

  public java.lang.String getList() {
    return this.list;
  }

  public void setList(java.lang.String list) {
    this.list = list;
    jspContext.setAttribute("list", list);
  }

  public java.lang.String getCssClass() {
    return this.cssClass;
  }

  public void setCssClass(java.lang.String cssClass) {
    this.cssClass = cssClass;
    jspContext.setAttribute("cssClass", cssClass);
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fvar_005fscope_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) config.getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fvar_005fscope_005fkey_005fnobody.release();
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
    if( getList() != null ) 
      _jspx_page_context.setAttribute("list", getList());
    if( getCssClass() != null ) 
      _jspx_page_context.setAttribute("cssClass", getCssClass());

    try {
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

    ActionBean actionBean = (ActionBean) request.getAttribute("actionBean");
    Subject subject = SecurityUtils.getSubject();

    PageInstance currentPageInstance = null;
    if(actionBean instanceof PageAction) {
        currentPageInstance = ((PageAction) actionBean).getPageInstance();
    }
    List<ButtonInfo> buttons =
            ButtonsLogic.getButtonsForClass(actionBean.getClass(), list);
    if(buttons != null) {
        for(ButtonInfo button : buttons) {
            Method handler = button.getMethod();
            boolean isAdmin = SecurityLogic.isAdministrator(request);
            if(!isAdmin &&
               ((currentPageInstance != null && !ButtonsLogic.hasPermissions(button, currentPageInstance, subject)) ||
                !SecurityLogic.satisfiesRequiresAdministrator(request, actionBean, handler))) {
                continue;
            }
            if(!ButtonsLogic.doGuardsPass(actionBean, handler, GuardType.VISIBLE)) {
                continue;
            }
            XhtmlBuffer buffer = new XhtmlBuffer(out);
            Button theButton = button.getButton();
            boolean hasIcon = !StringUtils.isBlank(theButton.icon());
            buffer.openElement("button");
            String id = UUID.randomUUID().toString();
            if(hasIcon) {
                buffer.addAttribute("id", id);
            }
            if(!ButtonsLogic.doGuardsPass(actionBean, handler, GuardType.ENABLED)) {
                buffer.addAttribute("disabled", "disabled");
            }
            buffer.addAttribute("name", handler.getName());
            
      out.write("\n");
      out.write("                ");
      //  fmt:message
      org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fvar_005fscope_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
      _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/buttons.tag(59,16) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f0.setKey( theButton.key() );
      // /WEB-INF/tags/buttons.tag(59,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f0.setVar("__buttonValue");
      // /WEB-INF/tags/buttons.tag(59,16) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f0.setScope("page");
      int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fvar_005fscope_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fvar_005fscope_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
      out.write("\n");
      out.write("            ");

            String value = (String) jspContext.getAttribute("__buttonValue");
            jspContext.removeAttribute("__buttonValue");
            buffer.addAttribute("type", "submit");
            String actualCssClass = "ui-button ui-widget ui-state-default ui-corner-all ";
            if(cssClass != null) {
                actualCssClass += cssClass;
            }
            if(hasIcon) {
                actualCssClass += " ui-button-icon-only";
            } else {
                actualCssClass += " ui-button-text-only";
            }
            buffer.addAttribute("class", actualCssClass);
            if(hasIcon) {
                buffer.openElement("span");
                buffer.addAttribute("class", "ui-button-icon-primary ui-icon " + theButton.icon());
                buffer.closeElement("span");
            }
            buffer.openElement("span");
            buffer.addAttribute("class", "ui-button-text");
            buffer.write(value);
            buffer.closeElement("span");
            buffer.closeElement("button");
            if(hasIcon) {
                
      out.write("<script type=\"text/javascript\">\n");
      out.write("                    $(function() {\n");
      out.write("                        portofino.decorateIconButton(\"#");
      out.print( id );
      out.write("\", \"");
      out.print( theButton.icon() );
      out.write("\");\n");
      out.write("                    });\n");
      out.write("                </script>");

            }
        }
    }

      out.write('\n');
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
      _jspDestroy();
    }
  }
}
