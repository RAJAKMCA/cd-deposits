package com.abybank.cdeposits.controller;

import com.abybank.cdeposits.model.CdHistoryRatesDTO;
import com.abybank.cdeposits.model.CdManagerHistoryRatesDTO;
import com.abybank.cdeposits.model.CdManagerRatesDTO;
import com.abybank.cdeposits.model.CdRatesDTO;
import com.abybank.cdeposits.service.CdRateServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Certified Deposits", description = "Certified Deposits APIs for View Rates")
@RestController
public class CertifiedDepositRestController {
    @Autowired
    CdRateServices cdRatesService;

    @Operation(summary = "Get a Customer rates", description = "Returns a Customer CD Rates")
    @ApiResponses({ @ApiResponse(responseCode = "200", content = {
            @Content(array = @ArraySchema(schema = @Schema(implementation = CdRatesDTO.class)), mediaType = "application/json") }),
            @ApiResponse(responseCode = "404", description = "Resource Not Avaliable", content = {
                    @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
                    @Content(schema = @Schema()) }) })
    @GetMapping("/customer/viewRates/{zipCode}")
    public ResponseEntity<List<CdRatesDTO>> getCustomerViewRates(@PathVariable("zipCode") int zipCode) {
        return ResponseEntity.ok(cdRatesService.getCustomerData(zipCode));

    }

    @Operation(summary = "Get a Customer History rates", description = "Returns a Customer History CD Rates")
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {
                    @Content(schema = @Schema(implementation = CdRatesDTO.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "404", description = "Zipcode Not Avaliable", content = {
                    @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
                    @Content(schema = @Schema()) }) })
    @GetMapping("/customer/viewHistoryRates/{zipCode}")
    public ResponseEntity<List<CdHistoryRatesDTO>> getCustomerHistoryRates(@PathVariable("zipCode") int zipCode) {

        return ResponseEntity.ok(cdRatesService.getCustomerHistoryData(zipCode));

    }

    @Operation(summary = "Get a Manager rates", description = "Returns a Manager CD Rates")
    @ApiResponses({ @ApiResponse(responseCode = "200", content = {
            @Content(array = @ArraySchema(schema = @Schema(implementation = CdRatesDTO.class)), mediaType = "application/json") }),
            @ApiResponse(responseCode = "404", description = "Resource Not Avaliable", content = {
                    @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
                    @Content(schema = @Schema()) }) })
    @GetMapping("/branchManager/viewRates/{zipCode}")
    public ResponseEntity<List<CdManagerRatesDTO>> getManagerRates(@PathVariable("zipCode") int zipCode) {
        return ResponseEntity.ok(cdRatesService.getManagerData(zipCode));

    }

    @Operation(summary = "Get a Branch Manager History rates", description = "Returns a Branch Manager History CD Rates")
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {
                    @Content(schema = @Schema(implementation = CdRatesDTO.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "404", description = "Zipcode Not Avaliable", content = {
                    @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
                    @Content(schema = @Schema()) }) })
    @GetMapping("/branchManager/viewHistoryRates/{zipCode}")
    public ResponseEntity<List<CdManagerHistoryRatesDTO>> getManagerHistoryRates(@PathVariable("zipCode") int zipCode) {

        return ResponseEntity.ok(cdRatesService.getManagerHistoryData(zipCode));
    }

}
