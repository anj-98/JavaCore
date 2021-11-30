package homework.education;

import homework.author.Author;

public class LessonStorage {
    private Lesson[] lessons = new Lesson[10];
    private int size;

    public void add(Lesson lesson) {
        if (lessons.length == size) {
            extend();
        }
        lessons[size++] = lesson;
    }

    private void extend() {
        Lesson[] tmp = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0, tmp, 0, lessons.length);
        lessons = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i]);
        }
    }

    public Lesson getByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(name)) {
                return lessons[i];
            }
        }
        return null;
    }


    public void deleteByName(Lesson lesson) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(lesson)) {
                ArrayUtil.deleteByIndex(lessons, i, size);
            }
        }
    }


    public void delete(Lesson lesson) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].equals(lesson)) {
                ArrayUtil.deleteByIndex(lessons, i, size);
                break;
            }
        }
    }
}
