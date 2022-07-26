/**
 * 
 */
package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Modelo.Archivos;
import Modelo.Habitacion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
/**
 * @author DanielaAGonzalezH
 *
 */
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



public class PanelAdministradorControlador implements Initializable{
	
	
	private ArrayList <Habitacion> listaHabitaciones = new ArrayList<>();
	private ObservableList<Habitacion> lista_Hab;
	private static String ARCHIVO_HABITACIONES  = "habitaciones.txt";
	private Archivos archivoHabitacion;
	
	
	@FXML
	private TableView<Habitacion> tblHabitaciones;
	
	@FXML
	private TableColumn colId;
	
	@FXML
	private TableColumn colHabitacion;
	/*
	@FXML
	private TableColumn colNumeroCamas;
	
	@FXML
	private TableColumn colNumeroBanios;
	
	@FXML
	private TableColumn colDescripcion;
	
	@FXML
	private TableColumn colValorhora;
	
	*/
	@FXML
	private void crearHabitacion(ActionEvent event) {
		try {
			
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("VistaCrearHabitacion.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			//stage.initStyle(StageStyle.UNDECORATED);
			stage.initStyle(StageStyle.UTILITY);
			stage.setTitle("Crear Habitación");
			stage.setScene(new Scene(root1));
			
			VistaCrearHabitacionControlador controlador = fxmlLoader.getController();
            controlador.inicializarAtributos(lista_Hab);
			stage.showAndWait();
			
			Habitacion habitacionDevuelta = controlador.getHabitacion();
			
			System.out.println("número camas"+habitacionDevuelta.getNumeroCamas());
			
			
			if(habitacionDevuelta != null) {
				//this.lista_Hab.add(habitacionDevuelta);
				//this.tblHabitaciones.refresh();
			}
			
			if(this.archivoHabitacion.guardarHabitaciones(this.lista_Hab)) {
				System.out.println("guardado autores exitoso");
			} else {
				System.out.println("guardado erróneo");
			}
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	private void cargarDatos(ActionEvent event) {
		ArrayList<Habitacion> temp = this.listaHabitaciones;
		for(Habitacion a:temp)
			lista_Hab.add(a);
      //  this.tblHabitaciones.setItems(lista_Hab);
	}
	@SuppressWarnings("rawtypes")
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Esbozo de método generado automáticamente
		
		this.lista_Hab = FXCollections.observableArrayList();
		Habitacion habitacion = new Habitacion(2, "eree" );
		lista_Hab.add(habitacion);
		this.tblHabitaciones.setItems(lista_Hab);
		this.archivoHabitacion = new Archivos(ARCHIVO_HABITACIONES);
		
		//this.colId.setCellValueFactory(new PropertyValueFactory("numeroCamas"));		
		//this.colHabitacion.setCellValueFactory(new PropertyValueFactory("descripcion"));
		//this.colNumeroCamas.setCellValueFactory(new PropertyValueFactory("numeroCamas"));
		//this.colNumeroBanios.setCellValueFactory(new PropertyValueFactory("numeroBanios"));
		//this.colDescripcion.setCellValueFactory(new PropertyValueFactory("descripcion"));
		//this.colValorhora.setCellValueFactory(new PropertyValueFactory("valorHora"));
		
		
        if(!this.archivoHabitacion.existe()) {
        	this.archivoHabitacion.crearArchivo();
        	System.out.println("archivo " +  ARCHIVO_HABITACIONES + " creado");
        } else {
        	System.out.println("archivo " + ARCHIVO_HABITACIONES + " existe");
        }
	}
	
	
	
	
	
	

}
