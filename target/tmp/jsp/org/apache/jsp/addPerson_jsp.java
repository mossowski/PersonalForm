package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addPerson_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Personal form</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      com.example.servletjspdemo.domain.Person person = null;
      synchronized (session) {
        person = (com.example.servletjspdemo.domain.Person) _jspx_page_context.getAttribute("person", PageContext.SESSION_SCOPE);
        if (person == null){
          person = new com.example.servletjspdemo.domain.Person();
          _jspx_page_context.setAttribute("person", person, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("person"), request);
      out.write(" \n");
      out.write("\n");
      com.example.servletjspdemo.service.StorageService storage = null;
      synchronized (application) {
        storage = (com.example.servletjspdemo.service.StorageService) _jspx_page_context.getAttribute("storage", PageContext.APPLICATION_SCOPE);
        if (storage == null){
          storage = new com.example.servletjspdemo.service.StorageService();
          _jspx_page_context.setAttribute("storage", storage, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');
 
  storage.add(person);

      out.write("\n");
      out.write("<fieldset>\n");
      out.write("<legend>Following person has been added to storage</legend>\n");
      out.write("<p>First name : <b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${person.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b> </p>\n");
      out.write("<p>Last name : <b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${person.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b> </p>\n");
      out.write("<p>Year of birth : <b>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.example.servletjspdemo.domain.Person)_jspx_page_context.findAttribute("person")).getYob())));
      out.write("</b></p>\n");
      out.write("<p>Gender : <b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${person.gender}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b></p>\n");
      out.write("<p>Town : \n");
 
    if(person.getTowns() != null)
      for(int i=0;i<person.getTownsLength();i++)
		 out.println("<b>" + person.getTownsValue(i) + "</b>");

      out.write("\n");
      out.write("<p>Languages :\n");
		 
    if(person.getLanguages() != null)
      for(int i=0;i<person.getLanguagesLength();i++)
		 out.println("<b>" + person.getLanguagesValue(i) + "</b>");

      out.write("\n");
      out.write("</p>\n");
      out.write("<p>Additional info : <b>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.example.servletjspdemo.domain.Person)_jspx_page_context.findAttribute("person")).getAdditionalInfo())));
      out.write("</b></p>\n");
      out.write("</fieldset>\n");
      out.write("<p>\n");
      out.write("  <a href=\"showAllPersons.jsp\">Show all persons</a>\n");
      out.write("</p>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
