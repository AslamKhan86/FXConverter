package com.sc.assessment.dao;

import java.io.IOException;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;

public interface FXRatesDAO {
	Map<String, Double> getFxRatesData(String userId) throws ClientProtocolException, IOException;

}
