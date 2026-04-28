package com.adyen.checkout.blik.internal.ui;

import com.adyen.checkout.blik.BlikComponentState;
import com.adyen.checkout.blik.internal.ui.model.BlikInputData;
import com.adyen.checkout.blik.internal.ui.model.BlikOutputData;
import com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate;
import com.adyen.checkout.ui.core.internal.ui.ButtonDelegate;
import com.adyen.checkout.ui.core.internal.ui.UIStateDelegate;
import com.adyen.checkout.ui.core.internal.ui.ViewProvidingDelegate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import y80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005J#\u0010\n\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/adyen/checkout/blik/internal/ui/BlikDelegate;", "Lcom/adyen/checkout/components/core/internal/ui/PaymentComponentDelegate;", "Lcom/adyen/checkout/blik/BlikComponentState;", "Lcom/adyen/checkout/ui/core/internal/ui/ViewProvidingDelegate;", "Lcom/adyen/checkout/ui/core/internal/ui/ButtonDelegate;", "Lcom/adyen/checkout/ui/core/internal/ui/UIStateDelegate;", "Lkotlin/Function1;", "Lcom/adyen/checkout/blik/internal/ui/model/BlikInputData;", "", "update", "updateInputData", "(Lkotlin/jvm/functions/Function1;)V", "", "isInteractionBlocked", "setInteractionBlocked", "(Z)V", "Lcom/adyen/checkout/blik/internal/ui/model/BlikOutputData;", "getOutputData", "()Lcom/adyen/checkout/blik/internal/ui/model/BlikOutputData;", "outputData", "Ly80/i;", "getOutputDataFlow", "()Ly80/i;", "outputDataFlow", "getComponentStateFlow", "componentStateFlow", "blik_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface BlikDelegate extends PaymentComponentDelegate<BlikComponentState>, ViewProvidingDelegate, ButtonDelegate, UIStateDelegate {
    @NotNull
    i getComponentStateFlow();

    @NotNull
    BlikOutputData getOutputData();

    @NotNull
    i getOutputDataFlow();

    void setInteractionBlocked(boolean isInteractionBlocked);

    void updateInputData(@NotNull Function1<? super BlikInputData, Unit> update);
}
