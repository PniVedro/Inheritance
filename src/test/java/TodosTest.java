import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodosTest {
    @Test
    public void shouldAddThreeTasksOfDifferentType() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = { simpleTask, epic, meeting };
        Task[] actual = todos.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void mustFindOutOfThreeTasks() {
        SimpleTask simpleTask = new SimpleTask(5, "Зайти в магазин");
        Meeting meeting = new Meeting(3, "Важная встреча", "в 10 утра", "Тудус");
        Epic epic = new Epic(2, new String[]{"Хлеб", "Яйка", "Молоко"});
        Todos todos = new Todos();
        todos.add(simpleTask);
        todos.add(meeting);
        todos.add(epic);
        Task[] expected = {epic};
        Task[] actual = todos.search("Молоко");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldReturnEmptyArray() {
        SimpleTask simpleTask = new SimpleTask(5, "Зайти в магазин");
        Meeting meeting = new Meeting(3, "Важная встреча", "в 10 утра", "Тудус");
        Epic epic = new Epic(2, new String[]{"Хлеб", "Яйка", "Молоко"});
        Todos todos = new Todos();
        todos.add(simpleTask);
        todos.add(meeting);
        todos.add(epic);
        Task[] expected = {};
        Task[] actual = todos.search("в 10");
        Assertions.assertArrayEquals(expected, actual);
    }
}