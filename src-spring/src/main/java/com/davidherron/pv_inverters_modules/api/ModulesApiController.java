package com.davidherron.pv_inverters_modules.api;

import com.davidherron.pv_inverters_modules.model.Module;
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
public class ModulesApiController implements ModulesApi {

    private static final Logger log = LoggerFactory.getLogger(ModulesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ModulesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Module>> getModules(@ApiParam(value = "Match manufacturer name") @Valid @RequestParam(value = "manufacturer", required = false) String manufacturer,@ApiParam(value = "Match manufacturer-assigned model number") @Valid @RequestParam(value = "model", required = false) String model,@ApiParam(value = "Minimum of allowable Pmax range") @Valid @RequestParam(value = "minPmax", required = false) Float minPmax,@ApiParam(value = "Maximum of allowable Pmax range") @Valid @RequestParam(value = "maxPmax", required = false) Float maxPmax,@ApiParam(value = "Minimum of allowable Vpmax range") @Valid @RequestParam(value = "minVpmax", required = false) Float minVpmax,@ApiParam(value = "Maximum of allowable Vpmax range") @Valid @RequestParam(value = "maxVpmax", required = false) Float maxVpmax,@ApiParam(value = "Minimum of allowable Voc range") @Valid @RequestParam(value = "minVoc", required = false) Float minVoc,@ApiParam(value = "Maximum of allowable Voc range") @Valid @RequestParam(value = "maxVoc", required = false) Float maxVoc,@ApiParam(value = "Minimum of allowable Isx range") @Valid @RequestParam(value = "minIsc", required = false) Float minIsc,@ApiParam(value = "Maximum of allowable Isc range") @Valid @RequestParam(value = "maxIsc", required = false) Float maxIsc,@ApiParam(value = "Matches against the panel family", allowableValues = "monocrystalline, polycrystalline, thinfilm, cigsthin, hitsithin") @Valid @RequestParam(value = "family", required = false) String family,@ApiParam(value = "Matches against the panel technology", allowableValues = "monocsi, multicsi, thinfilm") @Valid @RequestParam(value = "technology", required = false) String technology) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Module>>(objectMapper.readValue("[ {  \"nameplateVpmax\" : 1.4658129,  \"notes\" : \"notes\",  \"alphaIsc\" : 2.027123,  \"betaVpmax\" : 3.6160767,  \"description\" : \"description\",  \"ApertureArea\" : 5.025005,  \"VPmaxlow\" : 1.2315135,  \"type\" : \"type\",  \"sizeShortSide\" : 7.4577446,  \"manufacturer\" : \"manufacturer\",  \"BIPV\" : \"BIPV\",  \"NumberCellsParallel\" : 9.36931,  \"model\" : \"model\",  \"sizeLongSide\" : 1.1730742,  \"IPmaxlow\" : 1.0246457,  \"nameplateVoc\" : 5.637377,  \"IPmaxNOCT\" : 6.846853,  \"alphaIpmax\" : 4.145608,  \"gammaPmax\" : 7.386282,  \"technology\" : \"technology\",  \"geometricMultiplier\" : 4.9652185,  \"NumberCellsSeries\" : 9.965781,  \"nameplateIsc\" : 2.302136,  \"cecListingDate\" : \"cecListingDate\",  \"averageNOCT\" : 7.0614014,  \"VPmaxNOCT\" : 1.4894159,  \"nameplateIpmax\" : 5.962134,  \"nameplatePmax\" : 0,  \"betaVoc\" : 9.301444,  \"mounting\" : \"mounting\",  \"lastUpdate\" : \"lastUpdate\",  \"PTC\" : 6.0274563}, {  \"nameplateVpmax\" : 1.4658129,  \"notes\" : \"notes\",  \"alphaIsc\" : 2.027123,  \"betaVpmax\" : 3.6160767,  \"description\" : \"description\",  \"ApertureArea\" : 5.025005,  \"VPmaxlow\" : 1.2315135,  \"type\" : \"type\",  \"sizeShortSide\" : 7.4577446,  \"manufacturer\" : \"manufacturer\",  \"BIPV\" : \"BIPV\",  \"NumberCellsParallel\" : 9.36931,  \"model\" : \"model\",  \"sizeLongSide\" : 1.1730742,  \"IPmaxlow\" : 1.0246457,  \"nameplateVoc\" : 5.637377,  \"IPmaxNOCT\" : 6.846853,  \"alphaIpmax\" : 4.145608,  \"gammaPmax\" : 7.386282,  \"technology\" : \"technology\",  \"geometricMultiplier\" : 4.9652185,  \"NumberCellsSeries\" : 9.965781,  \"nameplateIsc\" : 2.302136,  \"cecListingDate\" : \"cecListingDate\",  \"averageNOCT\" : 7.0614014,  \"VPmaxNOCT\" : 1.4894159,  \"nameplateIpmax\" : 5.962134,  \"nameplatePmax\" : 0,  \"betaVoc\" : 9.301444,  \"mounting\" : \"mounting\",  \"lastUpdate\" : \"lastUpdate\",  \"PTC\" : 6.0274563} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Module>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Module>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
