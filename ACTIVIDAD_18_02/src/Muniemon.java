class Muniemon {
	
	private tipo tipo;
    private String nombre;
    private int ataque;
    private int defensa;
    private int hp;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void atacar(Muniemon objetivo) {
        if (!this.estaMuerto()) {
            int ataqueReal = this.ataque - objetivo.defensa;
            if (ataqueReal < 0) {
                ataqueReal = 0;
            }
            objetivo.hp -= ataqueReal;
            if (objetivo.hp < 0) {
                objetivo.hp = 0;
            }
            System.out.println(this.nombre + " ataca a " + objetivo.nombre + " y le resta " + ataqueReal + " puntos de vida.");
        } else {
            System.out.println(this.nombre + " está muerto y no puede atacar.");
        }
    }

    public boolean estaMuerto() {
        return hp <= 0;
    }
}