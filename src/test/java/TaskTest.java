import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void matchesSimpleTaskTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Пример");
        Assertions.assertTrue(simpleTask.matches("Пример"));
//        boolean expected = false;
//        boolean actual = (boolean) simpleTask.matches("Пример");
//        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void matchesSimpleTaskFalse() {
        SimpleTask simpleTask = new SimpleTask(5, "Пример");
       Assertions.assertFalse(simpleTask.matches("Рок"));
//        boolean expected = false;
//        boolean actual = (boolean) simpleTask.matches("Рок");
//        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesMeetingTrue() {
        Meeting meeting = new Meeting(5, "Пример", "6.05.2000", "Старт");
        Assertions.assertTrue(meeting.matches("Пример"));
//        boolean expected = false;
//        boolean actual = (boolean) simpleTask.matches("Пример");
//        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void matchesMeetingFalse() {
        Meeting meeting = new Meeting(5, "Пример", "6.05.2000", "Ситуация");
        Assertions.assertFalse(meeting.matches("Рок"));
//        boolean expected = false;
//        boolean actual = (boolean) simpleTask.matches("Рок");
//        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesEpicTrue() {
        Epic epic = new Epic(5, new String[]{"Привет", "Здарова","Добрый день"});
        Assertions.assertTrue(epic.matches("Привет"));
//        boolean expected = false;
//        boolean actual = (boolean) simpleTask.matches("Пример");
//        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void matchesEpicFalse() {
        Epic epic = new Epic(5, new String[]{"Привет", "Здарова","Добрый день"});
        Assertions.assertFalse(epic.matches("Пример"));
//        boolean expected = false;
//        boolean actual = (boolean) simpleTask.matches("Рок");
//        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesEpicEmpty() {
        Epic epic = new Epic(5, new String[]{});
        Assertions.assertFalse(epic.matches("Пример"));
//        boolean expected = false;
//        boolean actual = (boolean) simpleTask.matches("Рок");
//        Assertions.assertEquals(expected, actual);
    }
}