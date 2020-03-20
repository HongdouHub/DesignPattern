package designpattern.no16_template_method.test2.bean;

import utils.TextUtils;

public class NormalLoginModel extends LoginModel {

    private String question;

    private String answer;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 17;
        result = prime * result + (loginId == null ? 0 : loginId.hashCode());
        result = prime * result + (pwd == null ? 0 : pwd.hashCode());
        result = prime * result + (question == null ? 0 : question.hashCode());
        result = prime * result + (answer == null ? 0 : answer.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof NormalLoginModel)) {
            return false;
        }
        NormalLoginModel model = (NormalLoginModel) obj;
        return TextUtils.equals(model.getPwd(), pwd) && TextUtils.equals(model.getLoginId(), loginId)
                && TextUtils.equals(model.getQuestion(), question) && TextUtils.equals(model.getAnswer(), answer);
    }
}
