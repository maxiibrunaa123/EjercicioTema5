package com.ejercicioTema5;

import static com.ejercicioTema5.CocheCRUD.save;

public class Main {

    static CocheCRUD cocheCRUD;
    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();

        CocheCRUDImpl.save();
        CocheCRUDImpl.findAll();
        CocheCRUDImpl.delete();
    }
}
