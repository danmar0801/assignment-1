import java.util.List;

public interface Questions {
    //Method to configure the question type (e.g., single choice or multiple choice or true/false)
    void configureQuestionType(String type);
    //Method to get the question type (e.g., single choice or multiple choice or true/false)
    String getQuestionType();
    // Method to set candidate answers for the question
    void setCandidateAnswers(List<String> answers);
    // Method to get candidate answers for the question
    List<String> getCandidateAnswers();
}
