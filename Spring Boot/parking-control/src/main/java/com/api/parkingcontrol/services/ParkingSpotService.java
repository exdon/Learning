package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ParkingSpotService {

    @Autowired //necessário para informar ao spring que será add um injeção de depedencia de ParkingSpotRepository
    ParkingSpotRepository parkingSpotRepository;

    //pode ser feito dessa forma abaixo tbm, ao invés do @Autowired

    // final ParkingSpotRepository parkingSpotRepository;

    //public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
    //    this.parkingSpotRepository = parkingSppotRepository
    // }

    @Transactional //em caso de erro, ele garante o rollback e que tudo volte ao normal, importante colocar em métodos construtitos e destrutivos
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }

    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
    }

    public Page<ParkingSpotModel> findAll(Pageable pageable) {
        return parkingSpotRepository.findAll(pageable);
    }


    public Optional<ParkingSpotModel> findById(UUID id) {
        return parkingSpotRepository.findById(id);
    }

    @Transactional
    public void delete(ParkingSpotModel parkingSpotModel) {
        parkingSpotRepository.delete(parkingSpotModel);
    }

    public Page<ParkingSpotModel> findByResName(String responsibleName, Pageable pageable) {
        return parkingSpotRepository.findByResponsibleName(responsibleName, pageable);
    }
}
