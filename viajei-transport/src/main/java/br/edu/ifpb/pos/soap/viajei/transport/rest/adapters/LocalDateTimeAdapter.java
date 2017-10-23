/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.rest.adapters;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 *
 * @author kieckegard
 */
public class LocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {

    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    
    @Override
    public LocalDateTime unmarshal(String v) throws Exception {
        
        if(v == null) return null;
        try {
            System.out.println("[LocalDateTimeAdapter] data to be converted: " + v);
            return LocalDateTime.parse(v, dtf);
        } catch (DateTimeParseException ex) {
            System.out.println("[LocalDateTimeAdapter] exception thrown"
                    + " when converting "
                    + v + " to localdateTime");
            return null;
        }
    }

    @Override
    public String marshal(LocalDateTime v) throws Exception {
        
        if(v == null) return null;
        return dtf.format(v);
    }
    
}
