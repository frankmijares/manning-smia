/**
 * 
 */
package com.optimagrowth.license.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.optimagrowth.license.model.License;

/**
 * @author franciscomijares
 *
 */
@Service
public class LicenseService {
	
	/**
	 * public License getLicense( String licenseId, String organizationId )
	 * @param licenseId
	 * @param organizationId
	 * @return
	 */
	public License getLicense( String licenseId, String organizationId ) {
		
		License license = new License( );
		license.setId( new Random( ).nextInt( 1000 ) );
		license.setLicenseId( licenseId );
		license.setOrganizationId( organizationId );
		license.setDescription( "Software product" );
		license.setProductName( "Ostock" );
		license.setLicenseType( "full" );
		
		return license;
	}
	/**
	 * public String createLicense( License license, String organizationId )
	 * @param license
	 * @param organizationId
	 * @return
	 */
	public String createLicense( License license, String organizationId ) {
		
		String responseMessage = null;
		if ( license != null ) {
			license.setOrganizationId(organizationId);
			responseMessage = String.format( "This is the post aand the object is: %s:", license.toString( ) );
		}
		
		return responseMessage;
	}
	
	/**
	 * public String updateLicense( License license, String organizationId )
	 * @param license
	 * @param organizationId
	 * @return
	 */
	public String updateLicense( License license, String organizationId ) {
		String responseMessage = null;
		if ( license != null ) {
			license.setOrganizationId(organizationId);
			responseMessage = String.format( "This is the put and the object is %s", license.toString( ) );
		}
		return responseMessage;
	}
	
	/**
	 * public String deleteLicense( String licenseId, String organizationId )
	 * @param licenseId
	 * @param organizationId
	 * @return
	 */
	public String deleteLicense( String licenseId, String organizationId ) {
		String responseMessage = String.format( "Deleting license with id %s for the organization %", licenseId, organizationId );
		return responseMessage;
	}
	
}
