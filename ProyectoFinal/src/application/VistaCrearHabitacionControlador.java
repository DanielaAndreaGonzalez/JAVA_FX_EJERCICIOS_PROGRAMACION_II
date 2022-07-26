package application;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import Modelo.Archivos;
import Modelo.Habitacion;
import Modelo.TipoHabitacion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class VistaCrearHabitacionControlador implements Initializable{
	
	private ObservableList<Habitacion> lista_Hab;
	
	private ObservableList<String> numeroCamas;
	
	private ObservableList<String> numeroBanios;
	
	private ObservableList<String> tipoHabitacion;
	
	
	private Habitacion habitacion;
	
	private static String ARCHIVO_HABITACIONES  = "habitaciones.txt";
	@FXML
	private ComboBox<String> txtNumeroCamas ;
	
	@FXML
	private ComboBox<String> txtNumeroBanios;
	
	@FXML
	private TextField txtDescripcion;
	
	@FXML
	private TextField txtNumeroHabitacion;
	
	@FXML
	private ComboBox<String> txtTipoHabitacion;
	
	@FXML
	private TextField txtValorHora;
	
	@FXML
	private Button btnGuardarHabitacion;
	
	
	@FXML
	public void guardarHabitacion() {
		
		String numeroCamas = this.txtNumeroCamas.getValue();	
		String numeroBanios = this.txtNumeroBanios.getValue();
		String descripcion = this.txtDescripcion.getText();
		String numeroHabitacion = txtNumeroHabitacion.getText();
		String tipoHabitacion = this.txtTipoHabitacion.getValue();
		String valorHora = this.txtValorHora.getText();
		
		System.out.println("número camas"+numeroCamas);
		System.out.println("Número Banios" + numeroBanios);
		System.out.println("Descripcion" +descripcion);
		System.out.println("númerp habitaciones "+numeroHabitacion);
		System.out.println("Tipo habitacion"+tipoHabitacion);
		System.out.println("Valor hora"+valorHora);
		
		/*
		System.out.println("los datos son: ");
		System.out.println("nombre: " + nombreAutor);
		System.out.println("nacionalidad: " + nacionalidadAutor);
		System.out.println("fecha Nacimiento: "+ fechaNacimientoAutor);
		*/
		Habitacion nuevaHabitacion = new Habitacion(Integer.parseInt(numeroCamas), Integer.parseInt(numeroBanios), descripcion, numeroHabitacion, null, TipoHabitacion.SUITE, true, 0);
	
		this.habitacion = nuevaHabitacion;
		System.out.println("Habitación Creada "+this.habitacion.getId());
        				
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Informacion");
        alert.setContentText("Se ha aÃ±adido correctamente");
        alert.showAndWait();		
		
		//Cerrar ventana
		Stage stage = (Stage)this.btnGuardarHabitacion.getScene().getWindow();
        stage.close();
				
	}
	
	
	
	public void inicializarAtributos(ObservableList<Habitacion> listaAutores) {
		this.lista_Hab = listaAutores;
		//Llenado de ComboBox de número de camas
		
		
		//this.paises =  FXCollections.observableArrayList();
		Archivos archivoNacionalidades = new Archivos(ARCHIVO_HABITACIONES);
		
		//this.paises.addAll(archivoNacionalidades.obtenerDatos());
		//this.txtNacionalidadAutor.setItems(paises);
		System.out.println("llenado de ComboBox Habiaciones"); 
	}

	/**
	 * @return el habitacion
	 */
	public Habitacion getHabitacion() {
		return this.habitacion;
	}

	/**
	 * @param habitacion el habitacion a establecer
	 */
	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Esbozo de método generado automáticamente
		
		this.lista_Hab = FXCollections.observableArrayList();
		this.numeroCamas = FXCollections.observableArrayList();
		this.numeroBanios = FXCollections.observableArrayList();
		this.tipoHabitacion = FXCollections.observableArrayList();
		
		numeroCamas.add("1");
		numeroBanios.add("1");
		numeroBanios.add("2");
		tipoHabitacion.add("Suite");
		tipoHabitacion.add("Matrimonial");
		
		this.txtNumeroCamas.setItems(numeroCamas); 
		this.txtNumeroBanios.setItems(numeroBanios);
		this.txtTipoHabitacion.setItems(tipoHabitacion);			
	}
	
	
	
	
	
}
