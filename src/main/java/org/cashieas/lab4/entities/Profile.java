package org.cashieas.lab4.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "profiles")
public class Profile {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "bio", columnDefinition = "TEXT")
    private String bio;

    @Column(name = "phone_number", length = 15)
    private String phoneNumber;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Builder.Default
    @Column(name = "loyalty_points")
    private Integer loyaltyPoints = 0;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private User user;
}
