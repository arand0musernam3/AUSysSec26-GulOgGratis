package com.adyen.checkout.bcmc;

import com.adyen.checkout.action.core.internal.DefaultActionHandlingComponent;
import com.adyen.checkout.action.core.internal.ui.GenericActionDelegate;
import com.adyen.checkout.bcmc.internal.provider.BcmcComponentProvider;
import com.adyen.checkout.card.CardComponent;
import com.adyen.checkout.card.CardComponentState;
import com.adyen.checkout.card.internal.ui.CardDelegate;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.checkout.components.core.internal.ComponentEventHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB1\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u00060\nj\u0002`\u000b0\t¢\u0006\u0002\u0010\fR\u001e\u0010\b\u001a\f\u0012\b\u0012\u00060\nj\u0002`\u000b0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/bcmc/BcmcComponent;", "Lcom/adyen/checkout/card/CardComponent;", "cardDelegate", "Lcom/adyen/checkout/card/internal/ui/CardDelegate;", "genericActionDelegate", "Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;", "actionHandlingComponent", "Lcom/adyen/checkout/action/core/internal/DefaultActionHandlingComponent;", "componentEventHandler", "Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;", "Lcom/adyen/checkout/card/CardComponentState;", "Lcom/adyen/checkout/bcmc/BcmcComponentState;", "(Lcom/adyen/checkout/card/internal/ui/CardDelegate;Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;Lcom/adyen/checkout/action/core/internal/DefaultActionHandlingComponent;Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;)V", "getComponentEventHandler$bcmc_release", "()Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;", "Companion", "bcmc_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BcmcComponent extends CardComponent {

    @NotNull
    private final ComponentEventHandler<CardComponentState> componentEventHandler;

    @NotNull
    public static final BcmcComponentProvider PROVIDER = new BcmcComponentProvider(null, null, null, 7, null);

    @NotNull
    public static final List<String> PAYMENT_METHOD_TYPES = c0.c(PaymentMethodTypes.BCMC);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BcmcComponent(@NotNull CardDelegate cardDelegate, @NotNull GenericActionDelegate genericActionDelegate, @NotNull DefaultActionHandlingComponent defaultActionHandlingComponent, @NotNull ComponentEventHandler<CardComponentState> componentEventHandler) {
        super(cardDelegate, genericActionDelegate, defaultActionHandlingComponent, componentEventHandler);
        cardDelegate.getClass();
        genericActionDelegate.getClass();
        defaultActionHandlingComponent.getClass();
        componentEventHandler.getClass();
        this.componentEventHandler = componentEventHandler;
    }

    @NotNull
    public final ComponentEventHandler<CardComponentState> getComponentEventHandler$bcmc_release() {
        return this.componentEventHandler;
    }
}
