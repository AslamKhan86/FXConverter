package com.sc.assessment.service;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import com.sc.assessment.exception.UserException;
import com.sc.assessment.model.FXResponse;

public interface FXRatesService {
	FXResponse getFXRates(String userId) throws UserException, ClientProtocolException, IOException;
}
