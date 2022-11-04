package ServletPackage;

import java.io.IOException;

import LoginDatabase.LoginPatientDao;
import LoginDatabase.ShowPatientDao;
import MainPackage.Patient;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class PatientServlet
 */
@WebServlet("/PatientServlet")
public class PatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PatientServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//login patient button
		HttpSession session = request.getSession(true);
	        String password = request.getParameter("password");
		    String username = request.getParameter("username");
		//System.out.println(username);
		//System.out.println(LoginPatientDao.validate(username, password));
        if(LoginPatientDao.validate(username,password)) {
            session.setAttribute("username", username);          
        	response.sendRedirect("http://localhost:8080/WebApp/MenuPatient.jsp");
        }	else response.sendRedirect("http://localhost:8080/WebApp/Login.jsp");
        
        ShowPatientDao.Show(username);
        session.setAttribute("name", Patient.name);
        session.setAttribute("surname", Patient.surname);
        session.setAttribute("password", Patient.password);
        session.setAttribute("AMKA", Patient.AMKA);

           
		
		
      
	}

	}
        
        
		
	


