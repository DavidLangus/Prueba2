package ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import entidades.*;

public class Principal03 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<Empleado> nomina = new ArrayList<Empleado>() ;
		
		for (int i=1; i<=20; i++) {

			System.out.println("El empleado "+i+" es (A)dministrativo o (V)endedor? [(C)ancelar y mostrar resultados]: ");
			String tipo = s.nextLine();
			
			if (tipo.equalsIgnoreCase("A")) {
				
				Administrativo unoMas = new Administrativo();
				
				System.out.println("Ingrese DNI del empleado "+i+": ");
				unoMas.setDni(Integer.parseInt(s.nextLine()));
				System.out.println("Ingrese apellido del empleado "+i+": ");
				unoMas.setApellido(s.nextLine());
				System.out.println("Ingrese nombre del empleado "+i+": ");
				unoMas.setNombre(s.nextLine());
				System.out.println("Ingrese correo electrónico del empleado "+i+": ");
				unoMas.setEmail(s.nextLine());
				System.out.println("Ingrese sueldo del empleado "+i+": ");
				unoMas.setSueldoBase(Double.parseDouble(s.nextLine()));
				System.out.println("Ingrese horas extras del empleado "+i+": ");
				unoMas.setHsExtra(Float.parseFloat(s.nextLine()));
				System.out.println("Ingrese horas de trabajo mensual del empleado "+i+": ");
				unoMas.setHsMes(Float.parseFloat(s.nextLine()));
				nomina.add(unoMas);
			};
			
			if (tipo.equalsIgnoreCase("V")) {
				
				Vendedor unoMas = new Vendedor();
				
				System.out.println("Ingrese DNI del vendedor "+i+": ");
				unoMas.setDni(Integer.parseInt(s.nextLine()));
				System.out.println("Ingrese apellido del vendedor "+i+": ");
				unoMas.setApellido(s.nextLine());
				System.out.println("Ingrese nombre del vendedor "+i+": ");
				unoMas.setNombre(s.nextLine());
				System.out.println("Ingrese correo electrónico del vendedor "+i+": ");
				unoMas.setEmail(s.nextLine());
				System.out.println("Ingrese sueldo del vendedor "+i+": ");
				unoMas.setSueldoBase(Double.parseDouble(s.nextLine()));
				System.out.println("Ingrese porcentaje que corresponde al vendedor "+i+": ");
				unoMas.setPorcenComision(Float.parseFloat(s.nextLine()));
				System.out.println("Ingrese total de ventas del vendedor "+i+": ");
				unoMas.setTotalVentas(Float.parseFloat(s.nextLine()));
				nomina.add(unoMas);
			};
			
			if ( !tipo.equalsIgnoreCase("A") && !tipo.equalsIgnoreCase("V") ) { break; }
			
		
//			for (int i1 = 0; i1 < 50; ++i1) System.out.println();
			
//		    System.out.print("\033[H\033[2J");  
//		    System.out.flush(); 
			
//			final String ANSI_CLS = "\u001b[2J";
//	        final String ANSI_HOME = "\u001b[H";
//	        System.out.print(ANSI_CLS + ANSI_HOME);
//	        System.out.flush();
		}
		
		
//		Luego listar los empleados indicando: dni, nombre, apellido y sueldo. El sueldo debe calcularse en el método getSueldo() de la siguiente forma:
//
//			Si es administrativo: sueldoBase * ((hsExtra * 1.5)+hsMes) / hsMes
//			Si es vendedor: sueldoBase + (porcenComision*totalVtas/100)
			
			
		System.out.println("... Guardados "+nomina.size()+" empleados  ... \n");
		s.close();
		
		System.out.println("Empleados guardados: ");
		Iterator<Empleado> itrNomina = nomina.iterator();
		int n=1;
		while(itrNomina.hasNext()) {
			Empleado empx = itrNomina.next();
			if (empx instanceof Administrativo) {
				System.out.println("Empleado "+n+": "+empx.getApellido()+", "+empx.getNombre()+". DNI: "+empx.getDni()+". Email: "+empx.getEmail()+". Sueldo base: "+empx.getSueldoBase()+". Sueldo final: "+empx.getSueldoBase()* ((((Administrativo) empx).getHsExtra() * 1.5)+((Administrativo) empx).getHsMes()) / ((Administrativo) empx).getHsMes());
			}
			if (empx instanceof Vendedor) {
//				System.out.println("Empleado "+n+": "+empx.getApellido()+", "+empx.getNombre()+". DNI: "+empx.getDni()+". Email: "+empx.getEmail()+". Sueldo base: "+empx.getSueldoBase()+". Porcentaje de comision: "+((Vendedor)empx).getPorcenComision()+"Total ventas: "+((Vendedor)empx).getTotalVentas()+". Sueldo final: " /*+empx.getSueldoBase() + ( (((Vendedor)empx).getPorcenComision()/100.00) * ((Vendedor) empx).getTotalVentas())*/ );
				System.out.println("Empleado "+n+": "+empx.getApellido()+", "+empx.getNombre()+". DNI: "+empx.getDni()+". Email: "+empx.getEmail()+". Sueldo base: "+empx.getSueldoBase()+". Sueldo final: " + (empx.getSueldoBase() + ( (((Vendedor)empx).getPorcenComision()/100.00) * ((Vendedor) empx).getTotalVentas()) ) );
			}
			n++;
		}

	}

}
