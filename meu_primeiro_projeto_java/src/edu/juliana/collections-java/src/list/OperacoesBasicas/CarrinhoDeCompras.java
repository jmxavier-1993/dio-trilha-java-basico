package edu.juliana.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        this.itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensRemover = new ArrayList<>();

        if (!itemList.isEmpty()){
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)){
                    itensRemover.add(i);
                }
            }
            this.itemList.removeAll(itensRemover);
        } else {
            System.out.println("Não há itens no carrinho para serem removidos.");
        }

    }

    public double calcularValorTotal(){
       double valorTotal = 0;

       if (!itemList.isEmpty()) {
           for (Item i : itemList){
               valorTotal += i.getPreco() * i.getQuantidade();
           }
           return valorTotal;
       } else {
           throw new RuntimeException("A lista está vazia!");
       }

    }

    public void exibirItens(){
        if (!itemList.isEmpty()){
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.exibirItens();

//        carrinhoDeCompras.adicionarItem("Pipoca", 5, 2);
//        carrinhoDeCompras.adicionarItem("Coxinha", 5, 2);

        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());

//        carrinhoDeCompras.removerItem("Pipoca");
    }

}
