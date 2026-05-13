//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Doc doc = new Doc();

        // Simulating typing a sentence — same styles repeat
        String text = "Hello World";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                doc.add(text.charAt(i), i, "Arial", 14, "black", true);
            } else if (text.charAt(i) == ' ') {
                doc.add(text.charAt(i), i, "Arial", 14, "black", false);
            } else {
                doc.add(text.charAt(i), i, "Arial", 12, "black", false);
            }
        }

        doc.render();
        doc.printStats();
    }
}


