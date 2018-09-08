package com.sun.spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Party {

	@Autowired
	private MusicDept musicDept1;
	
	@Autowired
	private DecorDept decorDept;

	public MusicDept getMd() {
		return musicDept1;
	}

	public void setMd(MusicDept musicDept1) {
		this.musicDept1 = musicDept1;
	}

	public DecorDept getDd() {
		return decorDept;
	}

	public void setDd(DecorDept decorDept) {
		this.decorDept = decorDept;
	}	
	
}
