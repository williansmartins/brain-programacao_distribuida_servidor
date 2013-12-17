package com.williansmartins.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import com.williansmartins.interfaces.CarrinhoInterface;
import com.williansmartins.model.Item;

public class CarrinhoImplementacao extends UnicastRemoteObject implements CarrinhoInterface{

	private static final long serialVersionUID = 1L;

	private List<Item> itens = new ArrayList<Item>();
	
	public CarrinhoImplementacao() throws RemoteException {
		super();
	}

	public void cadastrarItem(Item item) throws RemoteException {
		itens.add(item);
		System.out.println("Item cadastrado com sucesso: " + item.getNome());
	}

	public List<Item> obterItens() throws RemoteException {
		return this.itens;
	}
	
	public int obterQuantidadeItens() {
		return this.itens.size();
	}

}
