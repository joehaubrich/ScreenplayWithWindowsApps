package co.tests.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;


import static co.tests.screenplay.userinterface.MainScreen.ADD_BUTTON;
import static co.tests.screenplay.userinterface.MainScreen.EQUALS_BUTTON;

public class AddTwoNumbersWTwoDigits implements Task {
    private Target numberOne;
    private Target numberTwo;
    private Target numberThree;
    private Target numberFour;

    public AddTwoNumbersWTwoDigits(Target numberOne, Target numberTwo, Target numberThree, Target numberFour) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberThree = numberThree;
        this.numberFour = numberFour;
    }

    public static AddTwoNumbersWTwoDigits addMultiDigitNumber(Target numberOne, Target numberTwo, Target numberThree, Target numberFour) {
        return Tasks.instrumented(AddTwoNumbersWTwoDigits.class, numberOne, numberTwo, numberThree, numberFour);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(numberOne),
                Click.on(numberTwo),
                Click.on(ADD_BUTTON),
                Click.on(numberThree),
                Click.on(numberFour),
                Click.on(EQUALS_BUTTON)
        );
    }

}
