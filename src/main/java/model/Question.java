package model;
public class Question {
    private int num;
    private String answer;
    public Question(int num , String answer){
        this.answer = answer;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
