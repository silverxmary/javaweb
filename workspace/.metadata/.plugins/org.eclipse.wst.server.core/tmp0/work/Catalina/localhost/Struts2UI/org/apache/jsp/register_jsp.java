/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.79
 * Generated at: 2017-09-20 19:31:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionerror_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fpassword_0026_005fname_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fradio_0026_005fname_005flist_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005flabel_005fheaderValue_005fheaderKey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fname_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fcheckboxlist_0026_005fname_005flist_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fname_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fsubmit_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fform_0026_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fpassword_0026_005fname_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fradio_0026_005fname_005flist_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005flabel_005fheaderValue_005fheaderKey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fname_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fcheckboxlist_0026_005fname_005flist_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fname_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fsubmit_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fform_0026_005faction.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fpassword_0026_005fname_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fradio_0026_005fname_005flist_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005flabel_005fheaderValue_005fheaderKey_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fname_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fcheckboxlist_0026_005fname_005flist_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fname_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fsubmit_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Register Page</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      if (_jspx_meth_s_005factionerror_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_s_005factionmessage_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005factionerror_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:actionerror
    org.apache.struts2.views.jsp.ui.ActionErrorTag _jspx_th_s_005factionerror_005f0 = (org.apache.struts2.views.jsp.ui.ActionErrorTag) _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.get(org.apache.struts2.views.jsp.ui.ActionErrorTag.class);
    boolean _jspx_th_s_005factionerror_005f0_reused = false;
    try {
      _jspx_th_s_005factionerror_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005factionerror_005f0.setParent(null);
      int _jspx_eval_s_005factionerror_005f0 = _jspx_th_s_005factionerror_005f0.doStartTag();
      if (_jspx_th_s_005factionerror_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.reuse(_jspx_th_s_005factionerror_005f0);
      _jspx_th_s_005factionerror_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005factionerror_005f0, _jsp_getInstanceManager(), _jspx_th_s_005factionerror_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005factionmessage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:actionmessage
    org.apache.struts2.views.jsp.ui.ActionMessageTag _jspx_th_s_005factionmessage_005f0 = (org.apache.struts2.views.jsp.ui.ActionMessageTag) _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.get(org.apache.struts2.views.jsp.ui.ActionMessageTag.class);
    boolean _jspx_th_s_005factionmessage_005f0_reused = false;
    try {
      _jspx_th_s_005factionmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005factionmessage_005f0.setParent(null);
      int _jspx_eval_s_005factionmessage_005f0 = _jspx_th_s_005factionmessage_005f0.doStartTag();
      if (_jspx_th_s_005factionmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.reuse(_jspx_th_s_005factionmessage_005f0);
      _jspx_th_s_005factionmessage_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005factionmessage_005f0, _jsp_getInstanceManager(), _jspx_th_s_005factionmessage_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    boolean _jspx_th_s_005fform_005f0_reused = false;
    try {
      _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fform_005f0.setParent(null);
      // /register.jsp(15,0) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setAction("saveRegister");
      int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_s_005fform_005f0);
        }
        do {
          out.write('\r');
          out.write('\n');
          out.write('	');
          if (_jspx_meth_s_005ftextfield_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write('\r');
          out.write('\n');
          out.write('	');
          if (_jspx_meth_s_005fpassword_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write('\r');
          out.write('\n');
          out.write('	');
          if (_jspx_meth_s_005fradio_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write('\r');
          out.write('\n');
          out.write('	');
          if (_jspx_meth_s_005fselect_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write('\r');
          out.write('\n');
          out.write('	');
          if (_jspx_meth_s_005ftextarea_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write('\r');
          out.write('\n');
          out.write('	');
          if (_jspx_meth_s_005fcheckboxlist_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write('\r');
          out.write('\n');
          out.write('	');
          if (_jspx_meth_s_005fcheckbox_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write('\r');
          out.write('\n');
          out.write('	');
          if (_jspx_meth_s_005fsubmit_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fform_0026_005faction.reuse(_jspx_th_s_005fform_005f0);
      _jspx_th_s_005fform_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fform_005f0, _jsp_getInstanceManager(), _jspx_th_s_005fform_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    boolean _jspx_th_s_005ftextfield_005f0_reused = false;
    try {
      _jspx_th_s_005ftextfield_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005ftextfield_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /register.jsp(16,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005ftextfield_005f0.setName("userName");
      // /register.jsp(16,1) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005ftextfield_005f0.setLabel("Usuario");
      int _jspx_eval_s_005ftextfield_005f0 = _jspx_th_s_005ftextfield_005f0.doStartTag();
      if (_jspx_th_s_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
      _jspx_th_s_005ftextfield_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005ftextfield_005f0, _jsp_getInstanceManager(), _jspx_th_s_005ftextfield_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fpassword_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:password
    org.apache.struts2.views.jsp.ui.PasswordTag _jspx_th_s_005fpassword_005f0 = (org.apache.struts2.views.jsp.ui.PasswordTag) _005fjspx_005ftagPool_005fs_005fpassword_0026_005fname_005flabel_005fnobody.get(org.apache.struts2.views.jsp.ui.PasswordTag.class);
    boolean _jspx_th_s_005fpassword_005f0_reused = false;
    try {
      _jspx_th_s_005fpassword_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fpassword_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /register.jsp(17,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fpassword_005f0.setName("password");
      // /register.jsp(17,1) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fpassword_005f0.setLabel("Password");
      int _jspx_eval_s_005fpassword_005f0 = _jspx_th_s_005fpassword_005f0.doStartTag();
      if (_jspx_th_s_005fpassword_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fpassword_0026_005fname_005flabel_005fnobody.reuse(_jspx_th_s_005fpassword_005f0);
      _jspx_th_s_005fpassword_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fpassword_005f0, _jsp_getInstanceManager(), _jspx_th_s_005fpassword_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fradio_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:radio
    org.apache.struts2.views.jsp.ui.RadioTag _jspx_th_s_005fradio_005f0 = (org.apache.struts2.views.jsp.ui.RadioTag) _005fjspx_005ftagPool_005fs_005fradio_0026_005fname_005flist_005flabel_005fnobody.get(org.apache.struts2.views.jsp.ui.RadioTag.class);
    boolean _jspx_th_s_005fradio_005f0_reused = false;
    try {
      _jspx_th_s_005fradio_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fradio_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /register.jsp(18,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fradio_005f0.setName("gender");
      // /register.jsp(18,1) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fradio_005f0.setLabel("Sexo");
      // /register.jsp(18,1) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fradio_005f0.setList("{'Masculino','Femenino'}");
      int _jspx_eval_s_005fradio_005f0 = _jspx_th_s_005fradio_005f0.doStartTag();
      if (_jspx_th_s_005fradio_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fradio_0026_005fname_005flist_005flabel_005fnobody.reuse(_jspx_th_s_005fradio_005f0);
      _jspx_th_s_005fradio_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fradio_005f0, _jsp_getInstanceManager(), _jspx_th_s_005fradio_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f0 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005flabel_005fheaderValue_005fheaderKey_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    boolean _jspx_th_s_005fselect_005f0_reused = false;
    try {
      _jspx_th_s_005fselect_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /register.jsp(19,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fselect_005f0.setName("country");
      // /register.jsp(19,1) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fselect_005f0.setList("countryList");
      // /register.jsp(19,1) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fselect_005f0.setListKey("countryId");
      // /register.jsp(19,1) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fselect_005f0.setListValue("countryName");
      // /register.jsp(19,1) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fselect_005f0.setHeaderKey("0");
      // /register.jsp(19,1) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fselect_005f0.setHeaderValue("Country");
      // /register.jsp(19,1) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fselect_005f0.setLabel("Pais?");
      int _jspx_eval_s_005fselect_005f0 = _jspx_th_s_005fselect_005f0.doStartTag();
      if (_jspx_th_s_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005flabel_005fheaderValue_005fheaderKey_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
      _jspx_th_s_005fselect_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fselect_005f0, _jsp_getInstanceManager(), _jspx_th_s_005fselect_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:textarea
    org.apache.struts2.views.jsp.ui.TextareaTag _jspx_th_s_005ftextarea_005f0 = (org.apache.struts2.views.jsp.ui.TextareaTag) _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fname_005flabel_005fnobody.get(org.apache.struts2.views.jsp.ui.TextareaTag.class);
    boolean _jspx_th_s_005ftextarea_005f0_reused = false;
    try {
      _jspx_th_s_005ftextarea_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /register.jsp(22,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005ftextarea_005f0.setName("about");
      // /register.jsp(22,1) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005ftextarea_005f0.setLabel("Notas");
      int _jspx_eval_s_005ftextarea_005f0 = _jspx_th_s_005ftextarea_005f0.doStartTag();
      if (_jspx_th_s_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fname_005flabel_005fnobody.reuse(_jspx_th_s_005ftextarea_005f0);
      _jspx_th_s_005ftextarea_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005ftextarea_005f0, _jsp_getInstanceManager(), _jspx_th_s_005ftextarea_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fcheckboxlist_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:checkboxlist
    org.apache.struts2.views.jsp.ui.CheckboxListTag _jspx_th_s_005fcheckboxlist_005f0 = (org.apache.struts2.views.jsp.ui.CheckboxListTag) _005fjspx_005ftagPool_005fs_005fcheckboxlist_0026_005fname_005flist_005flabel_005fnobody.get(org.apache.struts2.views.jsp.ui.CheckboxListTag.class);
    boolean _jspx_th_s_005fcheckboxlist_005f0_reused = false;
    try {
      _jspx_th_s_005fcheckboxlist_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fcheckboxlist_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /register.jsp(23,1) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fcheckboxlist_005f0.setList("communityList");
      // /register.jsp(23,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fcheckboxlist_005f0.setName("community");
      // /register.jsp(23,1) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fcheckboxlist_005f0.setLabel("Comunidad");
      int _jspx_eval_s_005fcheckboxlist_005f0 = _jspx_th_s_005fcheckboxlist_005f0.doStartTag();
      if (_jspx_th_s_005fcheckboxlist_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fcheckboxlist_0026_005fname_005flist_005flabel_005fnobody.reuse(_jspx_th_s_005fcheckboxlist_005f0);
      _jspx_th_s_005fcheckboxlist_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fcheckboxlist_005f0, _jsp_getInstanceManager(), _jspx_th_s_005fcheckboxlist_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fcheckbox_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:checkbox
    org.apache.struts2.views.jsp.ui.CheckboxTag _jspx_th_s_005fcheckbox_005f0 = (org.apache.struts2.views.jsp.ui.CheckboxTag) _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fname_005flabel_005fnobody.get(org.apache.struts2.views.jsp.ui.CheckboxTag.class);
    boolean _jspx_th_s_005fcheckbox_005f0_reused = false;
    try {
      _jspx_th_s_005fcheckbox_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /register.jsp(24,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fcheckbox_005f0.setName("mailingList");
      // /register.jsp(24,1) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fcheckbox_005f0.setLabel("Mailing list?");
      int _jspx_eval_s_005fcheckbox_005f0 = _jspx_th_s_005fcheckbox_005f0.doStartTag();
      if (_jspx_th_s_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fname_005flabel_005fnobody.reuse(_jspx_th_s_005fcheckbox_005f0);
      _jspx_th_s_005fcheckbox_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fcheckbox_005f0, _jsp_getInstanceManager(), _jspx_th_s_005fcheckbox_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_005fsubmit_005f0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fs_005fsubmit_005fnobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    boolean _jspx_th_s_005fsubmit_005f0_reused = false;
    try {
      _jspx_th_s_005fsubmit_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      int _jspx_eval_s_005fsubmit_005f0 = _jspx_th_s_005fsubmit_005f0.doStartTag();
      if (_jspx_th_s_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fsubmit_005fnobody.reuse(_jspx_th_s_005fsubmit_005f0);
      _jspx_th_s_005fsubmit_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fsubmit_005f0, _jsp_getInstanceManager(), _jspx_th_s_005fsubmit_005f0_reused);
    }
    return false;
  }
}
