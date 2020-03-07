package com.sc.assessment.dao.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.codehaus.jackson.map.ObjectMapper;

import com.sc.assessment.dao.FXRatesDAO;

public class FXRatesDAOImpl implements FXRatesDAO {
	@Override
	public Map<String, Double> getFxRatesData(String userId) throws ClientProtocolException, IOException {
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet("https://api.exchangeratesapi.io/latest?base=USD");
		HttpResponse response = client.execute(request);

		// Get the response
		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		String line = "";
		StringBuilder fileResponse = new StringBuilder();
		while ((line = rd.readLine()) != null) {
			fileResponse.append(line);
		}

		ObjectMapper mapper = new ObjectMapper();
		Map<String, Map<String, Double>> map = null;
		try {
			map = mapper.readValue(fileResponse.toString(), Map.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return map.get("rates");
	}

}
