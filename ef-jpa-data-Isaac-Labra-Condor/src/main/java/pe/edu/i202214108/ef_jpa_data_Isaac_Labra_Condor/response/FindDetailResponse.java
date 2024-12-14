package pe.edu.i202214108.ef_jpa_data_Isaac_Labra_Condor.response;

import pe.edu.i202214108.ef_jpa_data_Isaac_Labra_Condor.dto.DatailDto;

public record FindDetailResponse(String code,
                                 String error,
                                 DatailDto car) {
}
