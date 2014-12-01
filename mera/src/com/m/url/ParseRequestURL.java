package com.m.url;

public class ParseRequestURL {

	public static void main(String[] args) {

		String requestUrl = "http://hktv.co:9001/hkhtv/main/gm/s/H0140001/pr/HktvFPPromotion1";
		int hktv = requestUrl.indexOf("/hktv/");
		String invalidContexPath = null;
		if(hktv != -1){
			invalidContexPath = requestUrl.substring(0, hktv+6);
		}else{
			int slash = requestUrl.substring(requestUrl.indexOf("//"), requestUrl.length() ).indexOf("/");
			requestUrl.substring(0);
			System.out.println("string to be replaced.."+requestUrl.indexOf("/"));
			invalidContexPath = requestUrl.substring(0, requestUrl.indexOf("/"));
		}
		
		String contextPath = "http://hktv.co:9001/hktv/en";
		System.out.println("......old.."+requestUrl);
		System.out.println("corrected..."+requestUrl.replace(invalidContexPath,contextPath+"/" ));
		/*String url = requestUrl.substring(hktv);
		if(null != url && url.contains("/")){
			String[] split = url.split("/");
			
			if(split.length > 0){
				String countryCode = split[2];
				if("en".equals(countryCode) || "zh".equals(countryCode)){
					System.out.println(requestUrl);
				}else{
					requestUrl = requestUrl.replace("/hktv/", "/hktv/zh/");
					System.out.println(requestUrl);
				}
			}
		}*/
		
	}

}
