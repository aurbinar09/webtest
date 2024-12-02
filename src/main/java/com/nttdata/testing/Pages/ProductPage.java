package com.nttdata.testing.Pages;
import net.serenitybdd.screenplay.targets.Target;
public class ProductPage {
    public static final Target PRODUCT = Target.the("Producto {0}").locatedBy("//a[text()='{0}']");
    public static final Target ADD_TO_CART_BUTTON = Target.the("Agregar al carrito").locatedBy("//a[text()='Add to cart']");

}
