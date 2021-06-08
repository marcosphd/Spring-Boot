package br.org.lojadegames.seguranca;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.org.lojadegames.model.Usuario;
import br.org.lojadegames.repository.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	public UsuarioRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException{
		Optional<Usuario> user = repository.findByUsuario(userName);
		user.orElseThrow(()-> new UsernameNotFoundException(userName +"not fund."));
		
		return user.map(UserDetailsImpl ::new).get();
	}
}
