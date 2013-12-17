package com.williansmartins.registrators;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import com.williansmartins.impl.CarrinhoImplementacao;

public class CarrinhoRegistrador {

	public static void main(String[] args) throws Exception {
		LocateRegistry.createRegistry(1099);
		Naming.rebind("farmacia/carrinho", new CarrinhoImplementacao());
		System.out.println("carrinho registrado");
	}

}
