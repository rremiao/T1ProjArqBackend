package com.bcopstein.core.implementation;

import java.time.LocalDateTime;

import com.bcopstein.business.interfaces.ICalculaLimiteHorario;

public class CalculaLimiteHorarioImpl implements ICalculaLimiteHorario{
    public double calculaLimiteHorarioSimples() {
        LocalDateTime data = LocalDateTime.now();

        if(data.getHour() > 18) return 20.0;

        return 0.0;
    }   


    public double calculaLimiteHorarioComplexo() {
        LocalDateTime data = LocalDateTime.now();

        if(data.getHour() > 18 && data.getDayOfWeek().getValue() <= 5) return 10.0;
        if(data.getHour() > 18 && data.getDayOfWeek().getValue() >= 5) return 30.0;

        return 0.0;
    }
}
