package com.rant;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import com.model.Book;
import com.model.User;
import org.junit.Test;

public class RentedBooksView {

    public static Pane getPane(User user) {
        Pane root = new Pane();

        TableView<Book> viewBooks = new TableView<>(user.getRentedBooks());
        viewBooks.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        viewBooks.prefWidthProperty().bind(root.widthProperty());
        viewBooks.prefHeightProperty().bind(root.heightProperty());

        TableColumn<Book, String> columnId = new TableColumn<>("ID");
        columnId.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Book, String> columnTitle = new TableColumn<>("Title");
        columnTitle.setCellValueFactory(new PropertyValueFactory<>("title"));

        TableColumn<Book, String> columnAuthor = new TableColumn<>("Author");
        columnAuthor.setCellValueFactory(new PropertyValueFactory<>("author"));

        viewBooks.getColumns().addAll(columnId, columnTitle, columnAuthor);

        root.getChildren().add(viewBooks);

        return root;
    }
}
