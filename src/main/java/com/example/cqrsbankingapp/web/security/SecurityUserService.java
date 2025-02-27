package com.example.cqrsbankingapp.web.security;

import com.example.cqrsbankingapp.domain.model.Client;
import com.example.cqrsbankingapp.service.client.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SecurityUserService implements UserDetailsService {

    private final ClientService clientService;

    @Override
    public SecurityUser loadUserByUsername(
            final String username
    ) {
        Client client = clientService.getByUsername(username);
        return new SecurityUser(client);
    }

}
