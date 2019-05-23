package com.davidherron.pv_inverters_modules.api;

import com.davidherron.pv_inverters_modules.model.Inverter;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-23T10:48:04.857Z")

@Controller
public class InvertersApiController implements InvertersApi {

    private static final Logger log = LoggerFactory.getLogger(InvertersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public InvertersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Inverter>> getInverters(@ApiParam(value = "Match manufacturer name") @Valid @RequestParam(value = "manufacturer", required = false) String manufacturer,@ApiParam(value = "Match manufacturer-assigned model number") @Valid @RequestParam(value = "model", required = false) String model,@ApiParam(value = "Minimum power continuous rating") @Valid @RequestParam(value = "minpower", required = false) Float minpower,@ApiParam(value = "Maximum power continuous rating") @Valid @RequestParam(value = "maxpower", required = false) Float maxpower,@ApiParam(value = "Minimum nominal voltage") @Valid @RequestParam(value = "minvoltage", required = false) Float minvoltage,@ApiParam(value = "Maximum nominal voltage") @Valid @RequestParam(value = "maxvoltage", required = false) Float maxvoltage,@ApiParam(value = "Has a built-in meter", allowableValues = "true, false") @Valid @RequestParam(value = "hasmeter", required = false) String hasmeter,@ApiParam(value = "Is a microinverter system", allowableValues = "true, false") @Valid @RequestParam(value = "microinverter", required = false) String microinverter) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Inverter>>(objectMapper.readValue("[ {  \"firmwareVersionTested\" : \"firmwareVersionTested\",  \"efficiencyVnom20\" : 9.965781,  \"notes\" : \"notes\",  \"voltageNominalAC\" : 6.0274563,  \"description\" : \"description\",  \"efficiencyVmin10\" : 1.0246457,  \"efficiencyVmin30\" : 6.846853,  \"efficiencyVmin75\" : 1.1730742,  \"efficiencyVmin50\" : 7.4577446,  \"manufacturer\" : \"manufacturer\",  \"powerRating\" : 0.8008282,  \"builtInMeter\" : \"builtInMeter\",  \"nightTareLoss40C\" : \"nightTareLoss40C\",  \"powerLevel20\" : 3.6160767,  \"UL1741SA\" : \"UL1741SA\",  \"voltageNominalDC\" : 2.302136,  \"voltageMinDC\" : 5.637377,  \"efficiencyVmax50\" : 1.284659,  \"model\" : \"model\",  \"microInverter\" : \"microInverter\",  \"efficiencyVmax10\" : 6.4384236,  \"efficiencyVmax75\" : 2.8841622,  \"efficiencyVmax30\" : 6.965118,  \"efficiencyVnom10\" : 5.025005,  \"efficiency\" : 1.4658129,  \"efficiencyVnom75\" : 8.762042,  \"efficiencyVnom30\" : 9.36931,  \"efficiencyVnom50\" : 6.6835623,  \"voltageMaxDC\" : 7.0614014,  \"powerRatingContinuous\" : 5.962134,  \"efficiencyVnom100\" : 9.018348,  \"efficiencyVmin20\" : 1.4894159,  \"powerLevel30\" : 2.027123,  \"powerLevel75\" : 7.386282,  \"powerLevel10\" : 9.301444,  \"cecListingDate\" : \"cecListingDate\",  \"powerLevel100\" : 1.2315135,  \"powerLevel50\" : 4.145608,  \"sortOrder\" : \"sortOrder\",  \"lastUpdate\" : \"lastUpdate\",  \"efficiencyVmax100\" : 6.778325,  \"nightTareLoss\" : \"nightTareLoss\",  \"efficiencyVmin100\" : 4.9652185,  \"efficiencyVmax20\" : 3.5571952}, {  \"firmwareVersionTested\" : \"firmwareVersionTested\",  \"efficiencyVnom20\" : 9.965781,  \"notes\" : \"notes\",  \"voltageNominalAC\" : 6.0274563,  \"description\" : \"description\",  \"efficiencyVmin10\" : 1.0246457,  \"efficiencyVmin30\" : 6.846853,  \"efficiencyVmin75\" : 1.1730742,  \"efficiencyVmin50\" : 7.4577446,  \"manufacturer\" : \"manufacturer\",  \"powerRating\" : 0.8008282,  \"builtInMeter\" : \"builtInMeter\",  \"nightTareLoss40C\" : \"nightTareLoss40C\",  \"powerLevel20\" : 3.6160767,  \"UL1741SA\" : \"UL1741SA\",  \"voltageNominalDC\" : 2.302136,  \"voltageMinDC\" : 5.637377,  \"efficiencyVmax50\" : 1.284659,  \"model\" : \"model\",  \"microInverter\" : \"microInverter\",  \"efficiencyVmax10\" : 6.4384236,  \"efficiencyVmax75\" : 2.8841622,  \"efficiencyVmax30\" : 6.965118,  \"efficiencyVnom10\" : 5.025005,  \"efficiency\" : 1.4658129,  \"efficiencyVnom75\" : 8.762042,  \"efficiencyVnom30\" : 9.36931,  \"efficiencyVnom50\" : 6.6835623,  \"voltageMaxDC\" : 7.0614014,  \"powerRatingContinuous\" : 5.962134,  \"efficiencyVnom100\" : 9.018348,  \"efficiencyVmin20\" : 1.4894159,  \"powerLevel30\" : 2.027123,  \"powerLevel75\" : 7.386282,  \"powerLevel10\" : 9.301444,  \"cecListingDate\" : \"cecListingDate\",  \"powerLevel100\" : 1.2315135,  \"powerLevel50\" : 4.145608,  \"sortOrder\" : \"sortOrder\",  \"lastUpdate\" : \"lastUpdate\",  \"efficiencyVmax100\" : 6.778325,  \"nightTareLoss\" : \"nightTareLoss\",  \"efficiencyVmin100\" : 4.9652185,  \"efficiencyVmax20\" : 3.5571952} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Inverter>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Inverter>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
