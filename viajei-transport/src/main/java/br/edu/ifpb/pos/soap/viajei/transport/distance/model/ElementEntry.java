/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.distance.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

/**
 *
 * @author kieckegard
 */

@Value.Immutable
@JsonDeserialize(as = ImmutableElementEntry.class)
@JsonSerialize(as = ImmutableElementEntry.class)
public interface ElementEntry {
    
    String text();
    Long value();
}
