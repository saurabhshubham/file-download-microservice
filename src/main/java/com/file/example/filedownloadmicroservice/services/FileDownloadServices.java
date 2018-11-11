package com.file.example.filedownloadmicroservice.services;

import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Component;
import com.file.example.filedownloadmicroservice.exception.FileNotFoundException;



@Component
public class FileDownloadServices {
	private  final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Value("${file.store.location}")
	 private  String folder_location;
	 public Resource loadFileAsResource(String fileName) {
		 LOG.debug("inside loadFileAsResource");
	        try {
	        	 Path path = Paths.get(folder_location + fileName);
	            Resource resource = new UrlResource(path.toUri());
	            if(resource.exists()) {
	                return resource;
	            } else {
	                throw new FileNotFoundException("File not found " + fileName);
	            }
	        } catch (MalformedURLException ex) {
	            throw new FileNotFoundException("File not found " + fileName, ex);
	        }
			
	    }

}
