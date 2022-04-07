package com.example.projet.model.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "NIVEAU")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Niveau implements Serializable {

    /**
     * generated serial ID
     */
    private static final long serialVersionUID = 1L;

    /**
     * Niveau id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ens_generator")
    @SequenceGenerator(name = "ens_generator", sequenceName = "ens_SEQ", initialValue = 1, allocationSize = 1)
    @Column(name = "idNiveau", updatable = false, nullable = false)
    private Long idNiveau ;

    @Column(name="libelle")
    private String libelle ;

    @OneToMany(mappedBy="niveau")
    private List<Section> sections;



}