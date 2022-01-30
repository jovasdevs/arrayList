package br.com.jovas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Kia"));
        listCarros.add(new Carro("Ferrai"));
        listCarros.add(new Carro("Alfa Romeu"));
        listCarros.add(new Carro("Ford"));


        System.out.println(listCarros.contains(new Carro("Alfa Romeu")));
        System.out.println(listCarros.get(3));

        System.out.println(listCarros.indexOf(new Carro("Alfa Romeu")));

        System.out.println(listCarros.remove(1));

        System.out.println(listCarros);

    }
}
