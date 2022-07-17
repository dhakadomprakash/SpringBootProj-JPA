package com.nt.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "actor_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Actor {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "actor_id")
    @Id
    private Integer id;
    @NonNull
    @Column(name = "actor_name")
    private String aName;
    @NonNull
    private String actorRole;
}
