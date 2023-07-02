package ru.netology.Todos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test

    public void shouldAddSimpleTaskSearchTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        Boolean expected = true;
        Boolean actual = simpleTask.matches("Позвонить родителям");
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldAddSimpleTaskSearchFalse() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        Boolean expected = false;
        Boolean actual = simpleTask.matches("Привет");
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldAddEpicSearchTrue(){
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Boolean expected = true;
        Boolean actual = epic.matches("Молоко");
        Assertions.assertEquals(expected,actual);
    }

    @Test

    public void shouldAddEpicSearchFalse(){
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Boolean expected = false;
        Boolean actual = epic.matches("Мороженое");
        Assertions.assertEquals(expected,actual);
    }

    @Test

    public void shouldAddMeetingSearchTrue(){
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Boolean expected = true;
        Boolean actual = meeting.matches("Выкатка");
        Assertions.assertEquals(expected,actual);

    }

    @Test

    public void shouldAddMeetingSearchFalse(){
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Boolean expected = false;
        Boolean actual = meeting.matches("В среду");
        Assertions.assertEquals(expected,actual);

    }

}




