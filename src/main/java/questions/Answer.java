package questions;

import net.serenitybdd.rest.Ensure;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;
    public Answer(String question) {
        this.question=question;
    }

    public static Answer onThe(String question){
        return new Answer(question);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String welcome= Text.of("https://utest.com/welcome?from=signup").viewedBy(actor).asString();
        if (question.equals(welcome)){
            result=true;
        }else {
            result=false;
        }
        return result;

    }
}
