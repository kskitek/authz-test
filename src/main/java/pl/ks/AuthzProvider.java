package pl.ks;

import io.helidon.security.AuthorizationResponse;
import io.helidon.security.ProviderRequest;
import io.helidon.security.Subject;
import io.helidon.security.spi.AuthorizationProvider;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class AuthzProvider implements AuthorizationProvider {
    @Override
    public CompletionStage<AuthorizationResponse> authorize(ProviderRequest providerRequest) {
        return CompletableFuture.completedFuture(AuthorizationResponse.deny());
    }

    @Override
    public boolean isUserInRole(Subject subject, String role) {
        return false;
    }
}
