package classes;

public class CD extends Midia {
	private int faixas;
	private String autor;
	private String album;
	
	public CD(int codigo, String descricao, String gravadora, float duracao, int faixas, String autor, String album) {
		super(codigo, descricao, gravadora, duracao);
		setFaixas(faixas);
		setAutor(autor);
		setAlbum(album);
	}
	
	public CD() {
		
	}
	
	public int getFaixas() {
		return faixas;
	}
	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CD [faixas=");
		builder.append(faixas);
		builder.append(", autor=");
		builder.append(autor);
		builder.append(", album=");
		builder.append(album);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
