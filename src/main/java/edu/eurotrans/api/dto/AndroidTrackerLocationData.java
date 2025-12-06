package edu.eurotrans.api.dto;
/*
  @author   Olga
  @project   EuroTrans
  @class  AndroidTrackerController
  @version  1.0.0
  @since 28.06.25 - 13.05
*/
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;
@Data
@AllArgsConstructor
@Jacksonized
@NoArgsConstructor
public class AndroidTrackerLocationData {

	private String email;
	private Double latitude;
	private Double longitude;
	private Double speed;
}
