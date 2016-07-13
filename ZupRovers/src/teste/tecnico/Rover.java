package teste.tecnico;

public class Rover {
	private Integer x;
	private Integer y;
	private Integer xMax;
	private Integer yMax;
	private String direcao;
	private String comandos;

	public Rover(Integer x, Integer y, String direcao, Integer xMax, Integer yMax) {
		this.x = x;
		this.y = y;
		this.direcao = direcao;
		this.xMax = xMax;
		this.yMax = yMax;
	}

	public void virarEsquerda(){
		switch (direcao) {
		case "N":
			direcao = "W";
			break;
		case "W":
			direcao = "S";
			break;
		case "S":
			direcao = "E";
			break;
		case "E":
			direcao = "N";
			break;
		default:
			break;
		}
	}

	public void virarDireita(){
		switch (direcao) {
		case "N":
			direcao = "E";
			break;
		case "E":
			direcao = "S";
			break;
		case "S":
			direcao = "W";
			break;
		case "W":
			direcao = "N";
			break;
		default:
			break;
		}
	}

	public void mover(){
		switch (direcao) {
		case "N":
			if(this.y < this.yMax)
				this.y++;
			break;
		case "W":
			if(this.x > 0)
				this.x--;
			break;
		case "S":
			if(this.y>0)
				this.y--;
			break;
		case "E":
			if(this.x < this.xMax)
				this.x++;
			break;
		default:
			break;
		}
	}
	public String getPosicaoFinal() {

		for(int i = 0;i<comandos.length();i++){
			
			switch (comandos.substring(i, i+1)) {
			case "M":
				mover();
				break;
			case "L":
				virarEsquerda();
				break;
			case "R":
				virarDireita();
				break;
			default:
				break;
			}
		}
		return ""+this.x+" "+this.y+" "+direcao;
	}
	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public String getComandos() {
		return comandos;
	}

	public void setComandos(String comandos) {
		this.comandos = comandos;
	}




}
