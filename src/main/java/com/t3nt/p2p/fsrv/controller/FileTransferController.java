package com.t3nt.p2p.fsrv.controller;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController("/p2p/file")
public class FileTransferController {

	@PostMapping("/upload/**")
	public void fileUpload(MultipartFile fileChunk) throws IOException {
		InputStream rawChunk = fileChunk.getInputStream();
	}
	
	@GetMapping("/download/**")
	public void fileDownload() {
		
	}
	
	@DeleteMapping("/delete/**")
	public void fileRemoval() {
		
	}
	
}
