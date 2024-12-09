package org.example;

public class ReplaceSymbol implements Interface1,Interface2{

    @Override
    public void replaceSymbolA(String text) {
       String name = text.replace('a','z');
        System.out.println(name);
    }

    @Override
    public void replaceSymbolB(String text) {
        String surname = text.replace('b','w');
        System.out.println(surname);
    }
}

