import java.util.List;

public class MultipleChoiceQuestion implements Questions{
    private List<String> candidateAnswers;
    private String QuestionType;
    public void configureQuestionType(String type) {
        this.QuestionType = type;
    }
    public String getQuestionType() {
        return QuestionType;
    }


    public void setCandidateAnswers(List<String> answers) {
        this.candidateAnswers = answers;
    }

    public List<String> getCandidateAnswers() {
        return candidateAnswers;
    }
}
