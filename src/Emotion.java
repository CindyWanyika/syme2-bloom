import java.time.LocalDate;

public class Emotion {
    private String name;
    private int intensity;
    private String reason;
    private LocalDate date;
    private String notes;

    public Emotion(String name,String reason,int intensity,String notes,LocalDate date){
        this.name=name;
        this.reason=reason;
        this.intensity=intensity;
        this.notes=notes;
        this.date=date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
