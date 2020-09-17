public class StoryMain {
    public static void main(String[] args) {
        Question_5 news1=new Question_5();
        String character=Utils.getInput("Enter Character");
        String setting=Utils.getInput("Enter setting");
        String topic=Utils.getInput("Enter topic");
        int year=Utils.getNumber("Enter year");
        news1.setCharacter(character);
        news1.setSetting(setting);
        news1.setTopic(topic);
        news1.setYear(year);
        System.out.println("This news was happen in "+news1.getSetting()+ " "+ "at"+" " +news1.getYear()+" "+
                " for"+" " +news1.getCharacter()+ news1.getTopic());


       // Question_5 story1 = new Question_5("sudan", 2020, "Sudanese people", "flooding");
       // Question_5 story2 = new Question_5("Usa", 2020, "black people", "not being treated equily ");
       // Question_5 story3 = new Question_5("World",2019,"all people","virus");
      //  Question_5 story4=new Question_5("newWork",2001,"business","million of people die");



    }
}
