package app;

import com.beans.EstudiantesBean;
import com.dao.EstudianteDAO;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EstudianteDAO estudiante = new EstudianteDAO();
		EstudiantesBean estudiaBean = new EstudiantesBean();
		/*Add
		estudiaBean.setNombre("joge");
		estudiaBean.setCorreo("ep@hot.com");
		estudiaBean.setTelefono("3128983921");
		estudiante.add(estudiaBean);
		*/
		
		/*Delete
		estudiante.delete(2);
		*/
		/*findAll*/
		estudiante.findAll();
		
		
		/*Update
		estudiaBean.setNombre("Katalina");
		estudiaBean.setEstudiante_id(3);
		estudiante.update(estudiaBean);
		*/
		
	}

}
