import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LibrarySystem {
    private JFrame frame;
    private JTextField textField;
    private JList<String> bookList;
    private DefaultListModel<String> bookModel;
    private ArrayList<Book> books = new ArrayList<>();

    public LibrarySystem() {
        prepareGUI();
        createBookList();
        createButtons();
    }

    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
    }

    private void prepareGUI() {
        frame = new JFrame("Library System");
        frame.setLayout(new BorderLayout());
        textField = new JTextField();
        textField.setEditable(false);
        frame.add(textField, BorderLayout.NORTH);
    }

    private void createBookList() {
        bookModel = new DefaultListModel<>();
        bookList = new JList<>(bookModel);
        JScrollPane scrollPane = new JScrollPane(bookList);
        frame.add(scrollPane, BorderLayout.CENTER);
    }

    private void createButtons() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 3));
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = JOptionPane.showInputDialog(frame, "Enter book title:");
                String author = JOptionPane.showInputDialog(frame, "Enter book author:");
                Book book = new Book(title, author);
                books.add(book);
                bookModel.addElement(book.getTitle() + " - " + book.getAuthor());
            }
        });
        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (bookList.getSelectedIndex()!= -1) {
                    books.remove(bookList.getSelectedIndex());
                    bookModel.removeElementAt(bookList.getSelectedIndex());
                }
            }
        });
        JButton displayButton = new JButton("Display");
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder builder = new StringBuilder();
                for (Book book : books) {
                    builder.append(book.getTitle() + " - " + book.getAuthor() + "\n");
                }
                textField.setText(builder.toString());
            }
        });
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(displayButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
}

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}