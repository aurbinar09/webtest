package com.nttdata.testing.Pages;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
public class ProductPage {
    public static final Target PRODUCT = Target.the("Producto {0}").locatedBy("//tr[td[text()='{0}']]");
    public static final Target ADD_TO_CART_BUTTON = Target.the("Agregar al carrito").locatedBy("//a[text()='Add to cart']");

//    public static Target tablaProducto(String nombreProducto) {
//        return Target.the("Tabla de los productos en el carrito")
//                .located(By.xpath("//td[contains(text(),'" + nombreProducto + "')]"));
//    }
}
