package piramide;

public class Piramide {

	private float h, ab;
	private double al, ATriangulo, bt, inter, at, litrosP, precoL, qtdLatas, vol;
	private int tinta;
	
	public float getH() {
		return h;
	}

	public void setH(float h) {
		this.h = h;
	}

	public float getAb() {
		return ab;
	}

	public void setAb(float ab) {
		this.ab = ab;
	}

	public int getTinta() {
		return tinta;
	}

	public void setTinta(int tinta) {
		this.tinta = tinta;
	}				
	

	public double ATriangulo() {			
		return ATriangulo = (ab * 2) * h / 2;
	}
	public double al() {			
		return al = Math.sqrt(Math.pow(h,2)+Math.pow(ab,2));
	}	
	public double ABase() {			
		return bt = Math.pow((ab)*2,2);
	}
	public double ATotal() {			
		inter = (al * (ab * 2)) / 2;
		return at = (inter * 4) + bt;
	}
	public double Litros() {						
		return litrosP = at / 4.76;
	}
	public double Latas() {		
		return Math.round(qtdLatas = litrosP / 18);	
	}
	
	public double Preco() {											
		
		if (this.tinta == 1) {
			return precoL = qtdLatas * 127.90;
		} else if (this.tinta == 2) {
			return precoL = qtdLatas * 258.98;
		} else {
			return precoL = qtdLatas * 344.34;
		}
	}
	public double Volume() {		
		return vol = (Math.pow(ab,2) * h) / 3;	
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Piramide [h=");
		builder.append(h);
		builder.append(", ab=");
		builder.append(ab);
		builder.append(", al=");
		builder.append(al);
		builder.append(", ATriangulo=");
		builder.append(ATriangulo);
		builder.append(", bt=");
		builder.append(bt);
		builder.append(", inter=");
		builder.append(inter);
		builder.append(", at=");
		builder.append(at);
		builder.append(", litrosP=");
		builder.append(litrosP);
		builder.append(", precoL=");
		builder.append(precoL);
		builder.append(", qtdLatas=");
		builder.append(qtdLatas);
		builder.append(", vol=");
		builder.append(vol);
		builder.append(", tinta=");
		builder.append(tinta);
		builder.append("]");
		return builder.toString();
	}
}
