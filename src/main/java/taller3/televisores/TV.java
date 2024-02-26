package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	
	public static int numTV = 0;
	
	//CONSTRUCTOR
	public TV (Marca marca, boolean estado) {
		this.marca= marca;
		this.estado= estado;
		this.canal=1;
		this.volumen=1;
		this.precio=500;	
		
		TV.numTV++;	
	}
	
	//CONTEO DE TELEVISORES CREADOS.
		public static void setNumTV(int numTV) {
			TV.numTV = numTV;
		}
		public static int getNumTV() {
			return TV.numTV;
		}
	
	//METODOS SET Y GET MARCA
	public void setMarca(Marca marca) {
		this.marca= marca;
	}
	public Marca getMarca() {
		return marca;
	}
	
	//METODOS SET Y GET CANAL
	public void setCanal(int canal) {
		if (this.estado==true && canal>=1 && canal<=120) {
		   this.canal= canal;
		   }
	}
	public int getCanal() {
		return canal;
	}
	
	//METODOS SET Y GET PRECIO
	public void setPrecio(int precio) {
		this.precio= precio;
	}
	public int getPrecio() {
		return precio;
	}
	
	//METODOS SET Y GET VOLUMEN
	public void setVolumen(int volumen) {
		if (this.estado==true && volumen>=0 && volumen<=7) {
		    this.volumen=volumen;
		}	
	}
	public int getVolumen() {
		return volumen;
	}
	 //METODOS PARA CONTROL
	 public void setControl(Control control) {
		 this.control= control;
	 }
	 public Control getControl() {
		 return control;
	 }
	
	//METODOS PARA CAMBIAR ESTADO.
	public void turnOn() {
		estado=true;
	}
	public void turnOff() {
		estado=false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	//AUMENTAR Y DISMINUIR CANAL.
	 public void canalDown() {
		 if (estado==true) {
			 if (canal>1 && canal<=120) {
				 canal--;		 
			 }
		 }
	 }
	 public void canalUp() {
		 if (estado==true) {
			 if (canal>=1 && canal<120) {
				 canal++;
			 }
		 }	 
	 }
	 //AUMENTAR Y DISMINUIR VOLUMEN
	 public void volumenDown() {
		 if (estado==true) {
			 if (volumen>0 && canal<=7) {
				 volumen--;
			 }
		 }
	 }
	 public void volumenUp() {
		 if (estado==true) {
			 if(volumen>=0 && volumen<7) {
				 volumen++;
			 }
		 }
	 } 
}
