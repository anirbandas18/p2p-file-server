package com.t3nt.p2p.fsrv.utility;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.servlet.HandlerMapping;

@Component
public class RestUtility {

	/**
	 * Extract path from a controller mapping. /controllerUrl/** => return matched **
	 * @param request incoming request.
	 * @return extracted path
	 */
	public String extractPathFromPattern(final HttpServletRequest request){
	    String path = (String) request.getAttribute(
	            HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
	    String bestMatchPattern = (String ) request.getAttribute(HandlerMapping.BEST_MATCHING_PATTERN_ATTRIBUTE);
	    AntPathMatcher apm = new AntPathMatcher();
	    String finalPath = apm.extractPathWithinPattern(bestMatchPattern, path);
	    return finalPath;

	}
	
}
