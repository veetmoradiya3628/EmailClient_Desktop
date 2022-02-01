package com.test;

import com.test.controller.services.FetchFolderService;
import com.test.model.EmailAccount;
import com.test.model.EmailTreeItem;
import javafx.scene.control.TreeItem;

public class EmailManager {

    // Folder Handling:
    private EmailTreeItem<String> foldersRoot = new EmailTreeItem<String>("");

    public TreeItem<String> getFoldersRoot() {
        return foldersRoot;
    }

    public void addEmailAccount(EmailAccount emailAccount){
        EmailTreeItem<String> treeItem = new EmailTreeItem<>(emailAccount.getAddress());
        treeItem.setExpanded(true);
        FetchFolderService fetchFolderService = new FetchFolderService(emailAccount.getStore(), treeItem);
        fetchFolderService.start();
        foldersRoot.getChildren().add(treeItem);
    }
}
