package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Horario {
    private Date data; // Agora armazenamos uma data (dia/mês/ano)
    private String hora;
    private boolean ocupado;

    public Horario(Date data, String hora, boolean ocupado) {
        this.data = data;
        this.hora = hora;
        this.ocupado = ocupado;
    }

    public Date getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "Data: " + data.toString() + " Hora: " + hora;
    }

    public String getFormattedDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data);
    };
}
