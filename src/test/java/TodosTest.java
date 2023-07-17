import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodosTest {
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
        Task[] actual = todos.search("ху");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MustFindFromOneTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Зайти в магазин");
        Todos todos = new Todos();
        todos.add(simpleTask);
        Task[] expected = {simpleTask};
        Task[] actual = todos.search("магазин");
        Assertions.assertArrayEquals(expected, actual);
    }
}