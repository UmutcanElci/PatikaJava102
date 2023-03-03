package PatikaStore;

import PatikaStore.StoreManager.StoreUI;

public class PatikaStore {
    public static void main(String[] args) {
        StoreUI storeUI = new StoreUI();
        storeUI.addNoteBooks();
        storeUI.ListNoteBooks();
    }
}
