package com.oguzhan.dto;

import java.util.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {

	@NotEmpty(message = "Firstname alanı boş bırakılamaz!")
	@Min(value = 3 , message = "Firstname minumum 3 karakter olmalıdır")
	@Max(value = 10 , message = "Firstname alanı maxiumum 10 karakter olmalıdır.")
	private String firstName;
	
	@Size(min = 3 , max = 30)
	private String lastName;
	
	private Date birthOfDate;
	
	@Email(message = "Email formatında bir adres giriniz!")
	private String email;
	
	@Size(min = 11 , max = 11 , message = "Tckn alanı 11 karakter olmalıdır.")
	@NotEmpty(message = "Tckn alanı boş geçilemez")
	private String tckn;
}
