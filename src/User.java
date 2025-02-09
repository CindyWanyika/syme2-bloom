import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class User {
    private String name;
    private String password;
    private String email;
    private ArrayList<Emotion> emotions;
    private ArrayList<Emotion> happiness;
    private ArrayList<Emotion> sadness;
    private ArrayList<Emotion> anger;
    private ArrayList<Emotion> anxiety;
    private static HashMap<String,String> allUsers;
    private Emotion currentEmotion;

    public User(String name,String password,String email){
        this.name=name;
        this.password=password;
        this.email=email;
        emotions=new ArrayList<>();
        happiness=new ArrayList<>();
        sadness=new ArrayList<>();
        anger=new ArrayList<>();
        anxiety=new ArrayList<>();
    }
    public void createAccount(String name,String password,String email){
        User newUser=new User(name,password,email);
        allUsers.put(name, password);
    }
    public static boolean login(String name,String password){
        if(!allUsers.containsKey(name))return false;
        return allUsers.get(name).equals(password);
    }
    public void logEmotion(String name, String reason, int intensity, String notes){
        LocalDate date=LocalDate.now();
        currentEmotion=new Emotion(name,reason,intensity,notes,date);
        if (currentEmotion.getName().equalsIgnoreCase("Happy"))happiness.add(currentEmotion);
        if (currentEmotion.getName().equalsIgnoreCase("sad"))sadness.add(currentEmotion);
        if (currentEmotion.getName().equalsIgnoreCase("anxious"))anxiety.add(currentEmotion);
        if (currentEmotion.getName().equalsIgnoreCase("angry"))anger.add(currentEmotion);

    }

    public static HashMap<String, String> getAllUsers() {
        return allUsers;
    }

    public static void setAllUsers(HashMap<String, String> allUsers) {
        User.allUsers = allUsers;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Emotion> getEmotions() {
        return emotions;
    }

    public void setEmotions(ArrayList<Emotion> emotions) {
        this.emotions = emotions;
    }

    public ArrayList<Emotion> getHappiness() {
        return happiness;
    }

    public void setHappiness(ArrayList<Emotion> happiness) {
        this.happiness = happiness;
    }

    public ArrayList<Emotion> getSadness() {
        return sadness;
    }

    public void setSadness(ArrayList<Emotion> sadness) {
        this.sadness = sadness;
    }

    public ArrayList<Emotion> getAnger() {
        return anger;
    }

    public void setAnger(ArrayList<Emotion> anger) {
        this.anger = anger;
    }

    public ArrayList<Emotion> getAnxiety() {
        return anxiety;
    }

    public void setAnxiety(ArrayList<Emotion> anxiety) {
        this.anxiety = anxiety;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
