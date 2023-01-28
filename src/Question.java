class Question {
    private String title;
    private Answer[] answers;

    public Answer[] getAnswers() {
        return answers;
    }

    public String getTitle() {
        return title;
    }
    public Question(String title, Answer[] answers) {
        this.title = title;
        this.answers = answers;
    }
}