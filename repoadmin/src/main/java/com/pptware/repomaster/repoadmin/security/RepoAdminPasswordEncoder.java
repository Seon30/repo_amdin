package com.pptware.repomaster.repoadmin.security;

public interface RepoAdminPasswordEncoder {

	String encode(CharSequence rawPassword);
	
    boolean matches(CharSequence rawPassword, String encodedPassword);
    
}
