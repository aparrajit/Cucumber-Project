package stepdefinitions;

import java.util.List;
import java.util.Map;

import app.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Calculatorstepdefs {

	Calculator calc;
	int result = 0;

	@Given("I have the calculator")
	public void i_have_the_calculator() {
		// Write code here that turns the phrase above into concrete actions

		calc = new Calculator();
	}

	@When("I add {int} and {int}")
	public void i_add_and(int num1, int num2) {
		// Write code here that turns the phrase above into concrete actions

		result = calc.add(num1, num2);

	}

	@Then("I should get the result as {int}")
	public void i_should_get_the_result_as(int expResult) {
		// Write code here that turns the phrase above into concrete actions

		Assert.assertEquals(expResult, result);
	}

	@When("I subtract {int} and {int}")
	public void i_subtract_and(Integer int1, Integer int2) {
		// Write code here that turns the phrase above into concrete actions
		result = calc.sub(int1, int2);
	}

	@When("I add multiple numbers")
	public void i_add_multiple_numbers(List<Integer> numbers) {

		for (int num : numbers) {

			result = calc.add(num, result);

		}

	}

	@When("I buy the items below")
	public void i_buy_the_items_below(Map<String, Integer> items) {

		for (int vals : items.values()) {

			// result = result + vals;

			result = calc.add(vals, result);

		}

	}

	@When("I buy below items with given price and quantity")
	public void i_buy_below_items_with_given_price_and_quantity(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions

		int rows = dataTable.height();

		for (int i = 0; i < rows; i++) {

			int qnt = Integer.parseInt(dataTable.cell(i, 1));
			int price = Integer.parseInt(dataTable.cell(i, 2));

			result = calc.add(qnt * price, result);
		}

	}

}
