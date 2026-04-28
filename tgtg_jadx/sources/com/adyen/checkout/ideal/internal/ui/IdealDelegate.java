package com.adyen.checkout.ideal.internal.ui;

import com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate;
import com.adyen.checkout.ideal.IdealComponentState;
import com.adyen.checkout.ui.core.internal.ui.ViewProvidingDelegate;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import y80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/adyen/checkout/ideal/internal/ui/IdealDelegate;", "Lcom/adyen/checkout/components/core/internal/ui/PaymentComponentDelegate;", "Lcom/adyen/checkout/ideal/IdealComponentState;", "Lcom/adyen/checkout/ui/core/internal/ui/ViewProvidingDelegate;", "Ly80/i;", "getComponentStateFlow", "()Ly80/i;", "componentStateFlow", "ideal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IdealDelegate extends PaymentComponentDelegate<IdealComponentState>, ViewProvidingDelegate {
    @NotNull
    i getComponentStateFlow();
}
