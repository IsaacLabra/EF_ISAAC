package pe.edu.i202214108.ef_jpa_data_Isaac_Labra_Condor.service;

import pe.edu.i202214108.ef_jpa_data_Isaac_Labra_Condor.dto.DatailDto;
import pe.edu.i202214108.ef_jpa_data_Isaac_Labra_Condor.dto.Dto;
import pe.edu.i202214108.ef_jpa_data_Isaac_Labra_Condor.dto.UpdateDto;

import java.util.List;
import java.util.Optional;

public interface ManageService {
    List<Dto> getAllCars() throws Exception;

    Optional<DatailDto> getCarById(int id) throws Exception;

    boolean updateCar(UpdateDto UpdateDto) throws Exception;

    boolean deleteCarById(int id) throws Exception;

    boolean addCar(DatailDto DetailDto) throws Exception;
}
