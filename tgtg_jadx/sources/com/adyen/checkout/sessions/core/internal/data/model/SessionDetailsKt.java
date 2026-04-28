package com.adyen.checkout.sessions.core.internal.data.model;

import com.adyen.checkout.sessions.core.CheckoutSession;
import com.adyen.checkout.sessions.core.SessionModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0001H\u0007¨\u0006\u0005"}, d2 = {"mapToDetails", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetails;", "Lcom/adyen/checkout/sessions/core/CheckoutSession;", "mapToModel", "Lcom/adyen/checkout/sessions/core/SessionModel;", "sessions-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SessionDetailsKt {
    @NotNull
    public static final SessionDetails mapToDetails(@NotNull CheckoutSession checkoutSession) {
        checkoutSession.getClass();
        return new SessionDetails(checkoutSession.getSessionSetupResponse().getId(), checkoutSession.getSessionSetupResponse().getSessionData(), checkoutSession.getSessionSetupResponse().getAmount(), checkoutSession.getSessionSetupResponse().getExpiresAt(), checkoutSession.getSessionSetupResponse().getReturnUrl(), checkoutSession.getSessionSetupResponse().getConfiguration(), checkoutSession.getSessionSetupResponse().getShopperLocale(), checkoutSession.getEnvironment(), checkoutSession.getClientKey());
    }

    @NotNull
    public static final SessionModel mapToModel(@NotNull SessionDetails sessionDetails) {
        sessionDetails.getClass();
        return new SessionModel(sessionDetails.getId(), sessionDetails.getSessionData());
    }
}
