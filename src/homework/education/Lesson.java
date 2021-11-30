package homework.education;

public class Lesson {
    private String name;
    private int duration;
    private String lectureName;
    private int price;


    public Lesson(String name, int duration, String lectureName, int price) {
        this.name = name;
        this.duration = duration;
        this.lectureName = lectureName;
        this.price = price;
    }

    public Lesson() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", lectureName='" + lectureName + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lesson lesson = (Lesson) o;

        if (duration != lesson.duration) return false;
        if (price != lesson.price) return false;
        if (name != null ? !name.equals(lesson.name) : lesson.name != null) return false;
        return lectureName != null ? lectureName.equals(lesson.lectureName) : lesson.lectureName == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + duration;
        result = 31 * result + (lectureName != null ? lectureName.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }
}
