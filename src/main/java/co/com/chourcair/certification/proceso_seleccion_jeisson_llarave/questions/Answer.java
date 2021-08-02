package co.com.chourcair.certification.proceso_seleccion_jeisson_llarave.questions;

import co.com.chourcair.certification.proceso_seleccion_jeisson_llarave.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Questions.Text;

public class Answer implements Question<Boolean>{
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).assString();
        if (question.equals(nameCourse)){
            return true;
        }else {
            return false;
        }

        return result;
    }
}
