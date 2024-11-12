package es.joel.ejerciciop;

import com.example.ejercicioO.*;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controlador de la vista de productos.
 * Esta clase gestiona la inicialización de los productos, configurando sus imágenes,
 * nombres y stocks, y enlazándolos con los elementos visuales definidos en el archivo FXML.
 */
public class ProductosController implements Initializable {

    /**
     * Label de producto para el pan.
     */
    @FXML
    private ProductoLabel pleche;

    /**
     * Label de producto para la manzana.
     */
    @FXML
    private ProductoLabel pmanzana;

    /**
     * Label de producto para el pan.
     */
    @FXML
    private ProductoLabel ppan;

    /**
     * Configura las propiedades de un producto, incluyendo la imagen, el nombre y el stock.
     *
     * @param producto El objeto {@link ProductoLabel} que representa el producto.
     * @param imagen La ruta de la imagen que representa el producto.
     * @param nombre El nombre del producto.
     * @param stock El número de unidades disponibles del producto.
     */
    private void configurarProducto(ProductoLabel producto, String imagen, String nombre, int stock) {
        producto.setImage(new Image(getClass().getResourceAsStream(imagen)));
        producto.setNombre(nombre);
        producto.setStock(stock);
    }

    /**
     * Metodo de inicialización de la vista.
     * Este metodo se ejecuta cuando el controlador es cargado, inicializando los productos
     * con sus respectivas imágenes, nombres y stocks.
     *
     * @param url La URL que localiza la ubicación del archivo FXML cargado.
     * @param resourceBundle El conjunto de recursos que se usa para internacionalización.
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        configurarProducto(ppan, "images/pan.png", "Pan", 10);
        configurarProducto(pmanzana, "images/manzana.png", "Manzana", 200);
        configurarProducto(pleche, "images/leche.png", "Leche", 50);
    }
}
