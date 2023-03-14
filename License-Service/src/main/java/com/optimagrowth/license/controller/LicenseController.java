/**
 * 
 */
package com.optimagrowth.license.controller;

import	java.util.Random;

import 	org.springframework.beans.factory.annotation.Autowired;
import	org.springframework.http.ResponseEntity;
import 	org.springframework.web.bind.annotation.GetMapping;
import	org.springframework.web.bind.annotation.PathVariable;
import	org.springframework.web.bind.annotation.PostMapping;
import	org.springframework.web.bind.annotation.PutMapping;
import	org.springframework.web.bind.annotation.RequestBody;
import	org.springframework.web.bind.annotation.RequestMapping;
import	org.springframework.web.bind.annotation.RequestMethod;
import	org.springframework.web.bind.annotation.RestController;

import	com.optimagrowth.license.model.License;
import 	com.optimagrowth.license.service.LicenseService;


@RestController
@RequestMapping( value="v1/organization/{organizationId}/license" )
/**
 * @author franciscomijares
 *
 */

public class LicenseController {
	
	@Autowired
	LicenseService licenseService;
	
	@RequestMapping( value="/{licenseId}", method = RequestMethod.GET )
	public ResponseEntity<License> getLicense( 
			@PathVariable( "organizationId" ) String organizationId, 
			@PathVariable( "licenseId" ) String licenseId ) {	
		License license = licenseService.getLicense(licenseId, organizationId);
		return ResponseEntity.ok( license );
	}
	
	@PutMapping
	public ResponseEntity<String> updateLicense( @PathVariable( "organizationId" ) String organizationId,
												 @RequestBody License request ) {
		return ResponseEntity.ok( licenseService.updateLicense(request, organizationId) );
		
	}
												 

	
}

