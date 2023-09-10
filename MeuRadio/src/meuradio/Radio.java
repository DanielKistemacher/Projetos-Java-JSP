package meuradio;

public class Radio {
    
    int estacao; // limites de 88 a 110
    int volume; // limites de 0 a 40
    boolean estado; // ligado/desligado

    // implementar os métodos setters e getters e os demais métodos:
    public int getEstacao() {
        return estacao;
    }

    public void setEstacao(int estacao) {
        this.estacao = estacao;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
        
    public void ligar (){
        this.estado = true;
        this.volume = 0;
        this.estacao = 88;
    }
    
    public void desligar (){
        this.estado = false;
        this.volume = 0;
        this.estacao = 0;
    }
    
    public void incrementarEstacao (){
        if (this.estado == false){
            System.out.println("Favor ligar o rádio!");
            } else {
                this.estacao = this.estacao + 2;
        
                if (this.estacao > 110){
                    this.estacao = 88;
                }
            }
    }

    public void decrementarEstacao (){
        if (this.estado == false){
            System.out.println("Favor ligar o rádio!");
        } else {
            this.estacao = this.estacao - 2;
        
            if (this.estacao < 88){
                this.estacao = 110;
            }
        }
    }
    
    public void incrementarVolume ()
    {
        if (this.estado == false){
            System.out.println("Favor ligar o rádio!");
        } else if (this.volume < 40){
                this.volume = this.volume + 2;
            }
                else if (this.volume == 40){
                System.out.println("Volume máximo atingido!");
                }
    }
    
    public void decrementarVolume ()
    {
        if (this.estado == false){
            System.out.println("Favor ligar o rádio!");
        } else if (this.volume > 0){
                this.volume = this.volume - 2;
            }
                else if (this.volume == 0){
                System.out.println("Volume mínimo atingido!");
                }
    }
    
}
