
public class TesteProduto {
	public static void main(String[] args) {

		Categoria[] categorias = new Categoria[5];
		categorias[0] = new Categoria("Placa de V�deo", "descri��o1");
		categorias[1] = new Categoria("Processador", "descri��o2");
		categorias[2] = new Categoria("Placa M�e", "descri��o3");
		categorias[3] = new Categoria("SSD", "descri��o4");
		categorias[4] = new Categoria("Mem�ria RAM", "descri��o5");

		Produto[] estoque = new Produto[10];
		estoque[0] = new Produto("GTX 1080Ti", 4566.99, "descri��o da 1080Ti", categorias[0], 90);
		estoque[1] = new Produto("RTX 2070", 2738.96, "descri��o da RTX 2070", categorias[0], 79);
		estoque[2] = new Produto("Ryzen 5 2400G", 768.99, "descri��o do Ryzen 5 2400G", categorias[1], 40);
		estoque[3] = new Produto("Core i3-8300", 799.98, "descri��o do Core i3-8300", categorias[1], 28);
		estoque[4] = new Produto("Celeron G4900", 259.90, "descri��o do Celeron G4900", categorias[1], 78);
		estoque[5] = new Produto("Placa Mae MSI B450", 727.73, "descri��o da MSI B450", categorias[2], 71);
		estoque[6] = new Produto("Placa Mae MSI B450M", 503.69, "descri��o da MSI B450M", categorias[2], 32);
		estoque[7] = new Produto("Memoria Adata XPG Flame", 289.90, "descri��o da PG Flame", categorias[4], 48);
		estoque[8] = new Produto("Memoria HyperX Fury", 499.00, "descri��o da HyperX Fury", categorias[4], 94);
		estoque[9] = new Produto("SSD Team Group T-Force Delta", 849.93, "descri��o da T-Force Delta", categorias[3],
				77);

		for (int i = 0; i < categorias.length; i++) {
			System.out.println("---------" + categorias[i].getNome() + "---------\n");
		for (int j = 0; j < estoque.length; j++) {
				if (estoque[j].getCategoria() == categorias[i]) {
					System.out.println(estoque[j].getNome() + " - R$ " + estoque[j].getPreco());
					System.out.println("Cont�m " + estoque[j].getQuantidadeEstoque() + " no estoque.\n");
				}
			}
		}
	}
}