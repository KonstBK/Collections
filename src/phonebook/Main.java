package phonebook;

public class Main {
    public static void main(String[] args) {

        Note note1 = new Note("Konstantin", "+380995433401");
        Note note2 = new Note("Valentin", "+38066745222");
        Note note3 = new Note("Valentin", "+38066472522");
        Phonebook notebook = new Phonebook();
        notebook.add(note1);
        notebook.add(note2);
        notebook.add(note3);
        for (Note note : Phonebook.getPhoneBook()) {
            System.out.println(note);
        }
        System.out.println(notebook.find("Konstantin"));
        System.out.println(notebook.findAll("Valentin"));
        System.out.println(notebook.find("Sanya"));
    }
}
