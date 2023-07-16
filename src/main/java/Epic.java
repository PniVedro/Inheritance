public class Epic extends Task {

    protected String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;
    }

    public String[] getSubtasks() {
        return subtasks;
    }

    @Override
    public boolean matches(String query) {
        boolean isFind = false;

        for (int i = 0; i <= subtasks.length - 1; i++) {

            if (subtasks[i].contains(query)) {
                isFind = true;
                break;
            }
        }
       return isFind;
    }
}
