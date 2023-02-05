package com.model.service;

public interface AadharCardOfficeService {

	void addAadharOfficeDetailsWithAadharCardAndPanCardDetails();

	void getAllAadharOfficeDetailsWithAadharCardAndPanCardDetails();

	void getSingleAadharOfficeDetailsWithAadharCardAndPanCardDetails();

	void getAllAadharCardWithPanCardDetails();

	void getSingleAadharCardWithPanCardDetails();

	void updateAadharOfficeDetails();

	void updateAadharCardDetailsUsingAadharOffice();

	void updatePanCardDetailsUsingAadharCard();

	void deleteParticularAadharCardUsingAadharOffice();

	void deleteAadharOffice();
	
	
	
}
