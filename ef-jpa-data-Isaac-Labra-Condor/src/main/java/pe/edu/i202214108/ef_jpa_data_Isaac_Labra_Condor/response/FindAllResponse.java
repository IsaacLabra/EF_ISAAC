package pe.edu.i202214108.ef_jpa_data_Isaac_Labra_Condor.response;

import pe.edu.i202214108.ef_jpa_data_Isaac_Labra_Condor.dto.Dto;

public record FindAllResponse(String code,
                              String error,
                              Iterable<Dto> cars) {
}
