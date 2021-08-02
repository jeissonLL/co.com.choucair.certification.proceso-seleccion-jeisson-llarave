package co.com.chourcair.certification.proceso_seleccion_jeisson_llarave.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import java.lang.annotation.Target;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the( targetElementName, "Select choucair university")
            .located(By.xpath("//div[@id='university']//strong"));
    public static final Target NAME_COURSE = Target.the( targetElementName, "Name course of choucair university")
            .located(By.id("namecourse"));
    public static final Target INPUT_COURSE = Target.the( targetElementName, "Search course")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTOM_GO = Target.the( targetElementName, "Click to search for the course")
            .located(By.id("//button[(@class, 'btn btn-secondary')]"));
    public static final Target SELECT_COURSE = Target.the( targetElementName, "Click to search for the course")
            .located(By.xpath("//h4[contains(text(), 'Bancolombia automation resources')]"));
}
