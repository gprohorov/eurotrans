package edu.eurotrans.api.dto;

import edu.eurotrans.dao.repository.jooq.DriverDataForMapEntity;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class DriverDataForMapDTO {
	private DriverDataForMapEntity driverDataForMap;
	private List<String> cargoNames;
	private AndroidTrackerLocationData locationData;

}
