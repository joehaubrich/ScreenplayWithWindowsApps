package co.tests.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MainScreen {
 public static final Target ADD_BUTTON = Target.the("Add button").locatedBy("//*[@AutomationId='plusButton']");
 public static final Target EQUALS_BUTTON = Target.the("Equals button").locatedBy("//*[@AutomationId='equalButton']");
 public static final Target ONE_BUTTON = Target.the("One button").locatedBy( "//*[@AutomationId='num1Button']");
 public static final Target FIVE_BUTTON = Target.the("Five button").locatedBy( "//*[@AutomationId='num5Button']");
 public static final Target RESULTS = Target.the("calculator results").locatedBy( "//*[@AutomationId='CalculatorResults']");

}
