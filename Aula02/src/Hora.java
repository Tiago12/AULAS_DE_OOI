
public class Hora {

	public int h;
	public int m;
	public int s;
	
	public boolean validaH(int valor){
		if((valor >=0)&&(valor <=23)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean validaMS(int valor){
		if ((valor>=0)&&(valor<=59)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean setarHoras(String h){
		
		if (h.length()==8){
			String  sh=h.substring(0, 2);
			String  sm=h.substring(3, 5);
			String  ss=h.substring(6, 8);
			int ih = Integer.valueOf(sh);
			int im = Integer.valueOf(sm);
			int is = Integer.valueOf(ss);
			return setarHoras(ih,im,is);
			
		}
		
		return false;
	}
	
	public boolean setarHoras(int hora, int min, int seg){
		//if (validaH(hora)==true)
		if (validaH(hora)){
			this.h =hora;
		}else{
			System.out.println("Erro de parametros sua hora deve ser entre 0 e 23");
					return false;
		}
		if (validaMS(min)){
			this.m=min;
		}else{
			System.out.println(min + "Erro de parametros os minutos deve ser entre 0 e 59 ");
					return false;
		}
		if (validaMS(seg)){
			this.s=seg;
		}else{
			System.out.println("Erro de parametros os segundo deve ser entre 0 e 59");
					return false;
		}
		return true;
		
	}
}
