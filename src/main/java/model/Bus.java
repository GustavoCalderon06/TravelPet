package model;

public class Bus {
    private int valorPasaje;
    private Pasajero[] pasajeros;

    public Bus() {
        this.valorPasaje = 2000;
        this.pasajeros = new Pasajero[40];
    }

    public Bus(int valorPasaje, Pasajero[] pasajeros) {
        this.valorPasaje = valorPasaje;
        this.pasajeros = pasajeros;
    }

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public String agregarPasajeros(Pasajero p, int numeroAsiento){
        int indice = numeroAsiento-1;
        if(this.pasajeros[indice] == null){
            this.pasajeros[indice] = p;
            return "Asiento " + numeroAsiento + " vendido";
        }
        return "Asiento " + numeroAsiento +" ocupado.";
    }

    public String verDisponibilidad(){
        String s = "";
        for (int i = 0 ; i<40 ; i++){
            int asiento = i+1;
            if(this.pasajeros[i] == null){
                s += "["+ asiento +"] ";
            }else {
                s += "[XX] ";
            }
            if(asiento%4 ==0) s +="\n";
        }
        return s;
    }
    public String calcularGanancia(){

        String s = "";
        int ganancia = 0 ;
        int descuento = (int)(this.valorPasaje * 0.5);

        int pasajeConDescuento = this.valorPasaje - descuento;
        int pasajeSinDescuento = this.valorPasaje;

        for (int i = 0 ; i<40 ; i++) {
            if (this.pasajeros[i] != null) {
                if (this.pasajeros[i].tieneDescuento()) {
                    ganancia += pasajeConDescuento;
                } else {
                    ganancia += pasajeSinDescuento;
                }
            }
        }
        return "La ganancia del bus es: $" + ganancia;
    }
    public String getListadoPasajeros(){
        String lista = "";
        for(int i=0; i < this.pasajeros.length;i++) {
            int numeroAsiento = i+1;
            String relleno="";
            if (numeroAsiento<40) relleno = "0";
            Pasajero p = this.pasajeros[i];

            if (p != null){
                lista += "\n [" +relleno+"]" + p.getNombre()+"=asiento "+numeroAsiento;
            }

        }
        return lista;
    }
}
