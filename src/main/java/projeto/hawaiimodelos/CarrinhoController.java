package src.main.java.projeto.hawaiimodelos;

package br.com.caelum.goodbuy.controller;

import br.com.caelum.vraptor.Resource;


@Resource
public class CarrinhoController {

	
	 private final Carrinho carrinho;
	 

	 
	  public CarrinhoController(Carrinho carrinho) {
	    this.carrinho = carrinho;
	    
	    
	  }
	  
	  @Post @Path("/carrinho")
	  public void adiciona(Produto produto) {
		  controle.recarrega(produto.getNome());
		  carrinho.adiciona(produto);
	  }
	  
	  @Delete("/carrinho/{indiceProduto}")
	  public void remove(int indiceProduto) {
	    carrinho.remove(indiceProduto);
	  
	    Produto removido = produtos.remove(indiceProduto);
	    total -= removido.getNome().getCodigo().getDescriçao().getDepartamento * item.getQnt();
	  }
	 
}
