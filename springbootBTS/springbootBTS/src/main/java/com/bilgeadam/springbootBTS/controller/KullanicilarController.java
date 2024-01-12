package com.bilgeadam.springbootBTS.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bilgeadam.springbootBTS.model.Kullanicilar;
import com.bilgeadam.springbootBTS.repository.KullanicilarRepository;



@RestController
@RequestMapping(path = "kullanicilar")
public class KullanicilarController
{
	private KullanicilarRepository kullanicilarRepository;
	//	private DersService dersService;

	public KullanicilarController(KullanicilarRepository kullanicilarRepository)
	{
		this.kullanicilarRepository=kullanicilarRepository;
	}


	
	@GetMapping(path = "getall", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Kullanicilar>> getall()
	{
		// localhost:8080/kullanicilar/getall
		try
		{
			return ResponseEntity.ok(kullanicilarRepository.getAll());
		}
		catch (Exception e)
		{
			// daha sonra değişecek exception handling olacak
			e.printStackTrace();
			return ResponseEntity.internalServerError().build();
		}
	}


}
