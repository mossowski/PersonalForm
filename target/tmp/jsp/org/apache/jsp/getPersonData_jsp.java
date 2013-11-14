package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class getPersonData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


public String checkTown(String town,int length,String[] towns)
{
   for(int i=0;i<length;i++)
     if (town.equals(towns[i])) 
      return "selected";
   return "";
}

public String checkLanguage(String language,int length,String[] languages)
{
   for(int i=0;i<length;i++)
     if (language.equals(languages[i])) 
      return "checked";
   return "";
}

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
      com.example.servletjspdemo.service.StorageService storage = null;
      synchronized (application) {
        storage = (com.example.servletjspdemo.service.StorageService) _jspx_page_context.getAttribute("storage", PageContext.APPLICATION_SCOPE);
        if (storage == null){
          storage = new com.example.servletjspdemo.service.StorageService();
          _jspx_page_context.setAttribute("storage", storage, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\n');
      com.example.servletjspdemo.domain.Person person = null;
      synchronized (session) {
        person = (com.example.servletjspdemo.domain.Person) _jspx_page_context.getAttribute("person", PageContext.SESSION_SCOPE);
        if (person == null){
          person = new com.example.servletjspdemo.domain.Person();
          _jspx_page_context.setAttribute("person", person, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<form action=\"confirm.jsp\">\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');
 
 int lengthT = 0;
 int lengthL = 0;
 
 if(person.getTowns() != null)
	  lengthT = person.getTownsLength();
 if(person.getLanguages() != null)
	  lengthL = person.getLanguagesLength();

      out.write("\n");
      out.write("\n");
      out.write("<fieldset>\n");
      out.write("  <legend>Personal Information</legend>\n");
      out.write("  First name : <input type=\"text\" name=\"firstName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${person.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/><br/>\n");
      out.write("  Last name : <input type=\"text\" name=\"lastName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${person.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/><br/>\n");
      out.write("  Year of birth : <input type=\"text\"  name=\"yob\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${person.yob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/><br/>\n");
      out.write("  Gender : <input type=\"radio\" name=\"gender\" value=\"Male\" \n");
      out.write("           ");
 if ("Male".equals(person.getGender())) 
                out.print("checked"); 
      out.write("\n");
      out.write("           />Male\n");
      out.write("           <input type=\"radio\" name=\"gender\" value=\"Female\"\n");
      out.write("           ");
 if ("Female".equals(person.getGender())) 
                out.print("checked"); 
      out.write("\n");
      out.write("           />Female<br/>\n");
      out.write("  Town : <select name=\"towns\" size=\"4\" multiple=\"multiple\">\n");
      out.write("    <option value=\"Gdańsk\"\n");
      out.write("           ");
 out.print(checkTown("Gdańsk",lengthT,person.getTowns()));
      out.write("\n");
      out.write("    >Gdańsk</option>\n");
      out.write("    <option value=\"Gdynia\"\n");
      out.write("           ");
 out.print(checkTown("Gdynia",lengthT,person.getTowns()));
      out.write("\n");
      out.write("    >Gdynia</option>\n");
      out.write("    <option value=\"Sopot\"\n");
      out.write("           ");
 out.print(checkTown("Sopot",lengthT,person.getTowns()));
      out.write("\n");
      out.write("    >Sopot</option>\n");
      out.write("    <option value=\"Kartuzy\"\n");
      out.write("           ");
 out.print(checkTown("Kartuzy",lengthT,person.getTowns()));
      out.write("\n");
      out.write("    >Kartuzy</option>\n");
      out.write("  </select><br/>\n");
      out.write("</fieldset>\n");
      out.write("<fieldset>\n");
      out.write("<legend>Favorite Languages</legend>\n");
      out.write("        <input type=\"checkbox\" name=\"languages\" value=\"Java\" \n");
      out.write("        ");
 out.print(checkLanguage("Java",lengthL,person.getLanguages()));
      out.write("/>Java\n");
      out.write("        <input type=\"checkbox\" name=\"languages\" value=\"C++\"\n");
      out.write("        ");
 out.print(checkLanguage("C++",lengthL,person.getLanguages()));
      out.write("/>C++\n");
      out.write("        <input type=\"checkbox\" name=\"languages\" value=\"C#\"\n");
      out.write("        ");
 out.print(checkLanguage("C#",lengthL,person.getLanguages()));
      out.write("/>C#\n");
      out.write("        <input type=\"checkbox\" name=\"languages\" value=\"PHP\"\n");
      out.write("        ");
 out.print(checkLanguage("PHP",lengthL,person.getLanguages()));
      out.write("/>PHP\n");
      out.write("        <input type=\"checkbox\" name=\"languages\" value=\"JavaScript\"\n");
      out.write("        ");
 out.print(checkLanguage("JavaScript",lengthL,person.getLanguages()));
      out.write("/>JavaScript\n");
      out.write("        <input type=\"checkbox\" name=\"languages\" value=\"Python\"\n");
      out.write("        ");
 out.print(checkLanguage("Python",lengthL,person.getLanguages()));
      out.write("/>Python\n");
      out.write("        <input type=\"checkbox\" name=\"languages\" value=\"Perl\"\n");
      out.write("        ");
 out.print(checkLanguage("Perl",lengthL,person.getLanguages()));
      out.write("/>Perl\n");
      out.write("        <input type=\"checkbox\" name=\"languages\" value=\"Ruby\"\n");
      out.write("        ");
 out.print(checkLanguage("Ruby",lengthL,person.getLanguages()));
      out.write("/>Ruby\n");
      out.write("</fieldset>\n");
      out.write("<fieldset>\n");
      out.write("  <legend>Additional information</legend>\n");
      out.write("  <textarea rows=\"6\" cols=\"50\" name=\"additionalInfo\">\n");
      out.write("       ");
 out.print(person.getAdditionalInfo()); 
      out.write("\n");
      out.write("  </textarea>\n");
      out.write("</fieldset><br>\n");
      out.write("        <input type=\"submit\" value=\" OK \"/>\n");
      out.write("    \n");
      out.write("</form>\n");
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
