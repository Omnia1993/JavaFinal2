public class Question_5 {
  String Setting ;
  int year;
String character;
String topic;

    public Question_5() {
    }

    public Question_5(String setting, int year, String character, String topic) {
        Setting = setting;
        this.year = year;
        this.character = character;
        this.topic = topic;
    }

    public String getSetting() {
        return Setting;
    }

    public void setSetting(String setting) {
        Setting = setting;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
