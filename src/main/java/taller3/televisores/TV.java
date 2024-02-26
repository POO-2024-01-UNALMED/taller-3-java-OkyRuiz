package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	
	public static int numTV=0;
	
	//CONSTRUCTOR
	public TV (Marca marca, boolean estado) {
		this.marca= marca;
		this.estado= estado;
		canal=1;
		volumen=1;
		precio=500;	
		TV.numTV++;
	}
	//METODOS SET Y GET MARCA
	public void setMarca(Marca marca) {
		this.marca= marca;
	}
	public Marca GetMarca() {
		return marca;
	}
	
	//METODOS SET Y GET CANAL
	public void setCanal(int canal) {
		if (canal>0 && canal<=120) {
		   this.canal= canal;
		   }
	}
	public int getCanal() {
		return canal;
	}
	
	//METODOS SET Y GET PRECIO
	public void SetPrecio(int precio) {
		this.precio= precio;
	}
	public int GetPrecio() {
		return precio;
	}
	
	//METODOS SET Y GET VOLUMEN
	public void SetVolumen(int volumen) {
		if (volumen>=0 && volumen<=7) {
		    this.volumen=volumen;
		}	
	}
	public int GetVolumen() {
		return volumen;
	}
	 //METODOS PARA CONTROL
	 public void setControl(Control control) {
		 this.control= control;
	 }
	 public Control getControl() {
		 return control;
	 }
	
	//CONTEO DE TELEVISORES CREADOS.
	public static void setnumTV(int i) {
		TV.numTV= i;
	}
	public static int getnumTV() {
		return TV.numTV;
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
			 if (canal>1) {
				 canal--;		 
			 }
		 }
	 }
	 public void canalUp() {
		 if (estado==true) {
			 if (canal<120) {
				 canal++;
			 }
		 }	 
	 }
	 //AUMENTAR Y DISMINUIR VOLUMEN
	 public void volumenDown() {
		 if (estado==true) {
			 if (volumen>0) {
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
