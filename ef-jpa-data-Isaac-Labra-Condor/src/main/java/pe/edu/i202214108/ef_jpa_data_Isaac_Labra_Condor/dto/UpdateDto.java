package pe.edu.i202214108.ef_jpa_data_Isaac_Labra_Condor.dto;

public record UpdateDto(Integer car_id,
                        String make,
                        String model,
                        Integer year,
                        String owner_name,
                        String color) {
}
