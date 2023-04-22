package StepDefinitions;

import com.pages.CartPage;
import com.pages.InventoryPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.util.List;
import java.util.Map;

public class AddToCartStepDef {
    private InventoryPage inventoryPage= new InventoryPage(DriverFactory.getDriver());
    private CartPage cartPage;
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Then("user adds {string} to cart")
    public void user_adds_to_cart(String string) {
    inventoryPage.add_to_cart(string);
    }

    @Then("user clicks on cart")
    public void user_clicks_on_cart() {
    inventoryPage.add_to_cart_link();
    }

    @Then("user verifies {string} in cart Page")
    public void user_verifies_in_cart_page(String string) {
    cartPage.check_product_in_cart_page(string);

    }

    @Given("user has already logged in to application")
    public void user_has_already_logged_in_to_application(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        // For other transformations you can register a DataTableType.
        List<Map<String,String>> credList = dataTable.asMaps();
        String uName =credList.get(0).get("username");
        String psw = credList.get(0).get("password");
        cartPage = loginPage.doLogin(uName,psw);
    }
}
