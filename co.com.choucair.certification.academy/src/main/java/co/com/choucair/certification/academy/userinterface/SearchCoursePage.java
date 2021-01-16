package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Selecciona el curso choucair").located(By.xpath("//div[@id='certificaciones']"));
    public static final Target INPUT_COURSE = Target.the("Buscar curso").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso").located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Da click para buscar curso").located(By.xpath("//section[@id='region-main']//div[@class='search-results']//div[@class='result']//h4[@class='result-title']//a[contains(text(),'Foundation Express')]"));
    public static final Target NAME_COURSE = Target.the("").located(By.xpath("//h1[contains(text(),'Foundation Express')]"));
}
