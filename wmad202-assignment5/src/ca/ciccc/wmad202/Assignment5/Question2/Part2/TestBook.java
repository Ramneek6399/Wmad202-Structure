package ca.ciccc.wmad202.Assignment5.Question2.Part2;

public class TestBook {
    public void run() {
        Book book = new Book("Ramneek");
        String Context1 = "A book is a medium for recording information in the form of writing or images, typically composed of many pages bound together and protected by a cover. The technical term " +
                "for this physical arrangement is codex. In the history of hand-held physical supports for extended written compositions or records," +
                "the codex replaces its predecessor, the scroll. ";
        Page page1 = new Page(1, Context1);

        String Context2 = "As an intellectual object, a book is prototypically a composition " +
                "of such great length that it takes a considerable investment of time to compose and still considered as an investment of time to read.";


        Page page2 = new Page(2, Context2);
        String Context3 = "The intellectual content in a physical book need not be a composition," +
                "nor even be called a book. Books can consist only of drawings, " +
                "engravings or photographs, crossword puzzles or cut-out dolls. ";
        Page page3= new Page(3, Context3);

        book.addPage(page1);
        book.addPage(page2);
        book.addPage(page3);

        System.out.println("========All Occurances===========" );
        book.printAllOccurances();

        System.out.println("==========Particular Occurance==========");
        book.getParticularWordOccurances("a");
        book.getParticularWordOccurances("intellectual");
    }



}
