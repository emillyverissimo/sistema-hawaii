package hawaiimodelos;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import hawaiimodelos.Produto;

@Component
@SessionScoped
public class Carrinho{
	
	private List<Produto> itens = new ArrayList<Produto>();
	private Double total = 0.0;
	
	 public void adiciona(Produto produto) {
		produto.add(produto);
	    total += produto.getNome().getCodigo().getDescriçao().getDepartamento * item.getQnt();
	}

	 public List<Produto> getItens() {
		return itens;
	}
	
	 public Integer getTotalDeProdutos() {
	    return produtos.size();
	  }
	
	

	public void setItens(List<Produto> itens) {
		this.itens = itens;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	

}
