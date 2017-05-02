package br.com.drbsoft.security.auth.util;

import org.apache.commons.lang3.StringUtils;

public class Utils {

	public static String extractToken(String authorization) {
		if(StringUtils.isEmpty(authorization)){
			return null;
		}
		
		String[] header = StringUtils.split(authorization);
		if(header == null || header.length != 2){
			return null;
		}
		
		return header[1];
	}

}
