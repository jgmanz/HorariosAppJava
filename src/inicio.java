import java.awt.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import models.Alumno;
import models.Dia;
import models.Edificio;
import models.Grupo;
import models.Horario;
import models.Profesor;
import models.TipoProfesor;

public class inicio {
	public static void main (String[] args)
	{ 
		//Materia ingles;
		
		Edificio eA = new Edificio("Edificio A", 'A',0,0); 
		Edificio eB = new Edificio("Edificio B", 'B',0,0); 
		Edificio eC = new Edificio("Edificio C", 'C',0,0); 
		
		eA.getLetra();
		eA.setNombre("Edificio A1"); 
		
		Profesor pJose = new Profesor("Jose", "Manzanero","99999", "PROF1", "jose@utrm.com.mx", "0011100", TipoProfesor.PARCIAL);
		Profesor pJuan = new Profesor("Juan", "Perez","99999", "PROF2", "juan@utrm.com.mx", "0011101",  TipoProfesor.PLANTA);
		Profesor pMaria = new Profesor("Maria", "Morales","99999", "PROF3", "maria@utrm.com.mx", "0011102",  TipoProfesor.PARCIAL);
		
		if(pMaria.getTipoProfesor().equals(TipoProfesor.PARCIAL))
		{
			
		}
		Horario h1 = new Horario(pJose, "07:00", "07:50", "Ingles", "Lunes");
		Grupo grupoIT = new Grupo("Informatica 99", "IT99",eA, 
				new Horario[] {
						h1,
						new Horario(pMaria, "07:50", "09:50", "Matematicas", "Lunes"),
						new Horario(pJuan, "09:50", "11:50", "Programacion", "Lunes"),
						new Horario(pMaria, "07:00", "07:50", "Matemaricas", "Martes"),
						new Horario(pJose, "07:50", "09:50", "Ingles", "Martes"),
						new Horario(pJuan, "09:50", "11:50", "Programacion", "Martes"),
				});
		
		
		String res =  new String ("0"); 
		int d = 2;
		switch (d)
		{
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Dos");
			break;
			default:
				System.out.println("Fuera de switch");
			
		}
		if(res.equals(String.valueOf(d)))
			System.out.println("Coincide");
		else
			System.out.println("No Coincide");
		
		
		
		
		//System.out.println(grupoIT.getHorarios()[8]);
		
		Alumno a1 = new Alumno("Jose","Manzanero","9841390123","XAXA0001","jogal.manz@gmail.com","MMA15555",
				grupoIT,"20170101","NOVENO");
		Alumno a2 = new Alumno("Jorge","Lopez","984132223","XAXA0001","s.jorge@gmail.com","MMA15e55",
						grupoIT,"20170101","NOVENO"); 

		ArrayList<Horario> arr1 = new ArrayList<Horario>();
		h1.setDia(Dia.LUNES);
		arr1.add(h1);
		arr1.add(new Horario(pMaria, "07:00", "07:50", "Matemaricas", "Martes"));
		arr1.add(h1);
		a1.getGrupo().getEdificio().getLetra(); 
		
		for(Horario h: arr1)
		{
			System.out.println(h.toString());
		}
		int cont = 0; 
		while(cont <= arr1.size())
		{
			//System.out.println(arr1.get(cont).toString());
			cont++;
		}
		
		
		for(int i = 0; i < arr1.size(); i++)
		{
			System.out.println(arr1.get(i).toString());
		} 
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }
		  
		  
		  
		
		  
		  //***manejo de fechas
		  
		  Date ahora = new Date();
	      SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
	      String r = formater.format(ahora);
	      

	      SimpleDateFormat formater2 = new SimpleDateFormat("dd-MM-yyyy");
	      String r2 = formater.format(ahora);
	      
	      
	      try
	      {
	    	  String stringFechaConHora = "2014-09-15 15:03:23";
		      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ii:ss");
		      Date fechaConHora = sdf.parse(stringFechaConHora);
	      }
	      catch(Exception ex)
	      {
	    	  
	      }
	      
	      
	      Calendar ahoraCal = Calendar.getInstance();
	      System.out.println(ahoraCal.getClass());
	      ahoraCal.set(2004,1,7);
	      System.out.println(ahoraCal.getTime());
	      ahoraCal.set(2004,1,7,7,0,0);
	      System.out.println(ahoraCal.getTime());
	      ahoraCal.add(Calendar.DATE, 3);
	      
	      Date f = ahoraCal.getTime();
		
	      
		
		
		
		
		
		/*

      // LinkedList
      List l1 = new LinkedList();
      l1.add("Zara");
      l1.add("Mahnaz");
      l1.add("Ayan");
      System.out.println();
      System.out.println(" LinkedList Elements");
      System.out.print("\t" + l1);

      // HashSet
      Set s1 = new HashSet(); 
      s1.add("Zara");
      s1.add("Mahnaz");
      s1.add("Ayan");
      System.out.println();
      System.out.println(" Set Elements");
      System.out.print("\t" + s1);

      // HashMap
      Map m1 = new HashMap(); 
      m1.put("Zara", "8");
      m1.put("Mahnaz", "31");
      m1.put("Ayan", "12");
      m1.put("Daisy", "14");
      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);*/
	}
}
