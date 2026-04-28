package com.adyen.checkout.issuerlist.internal.ui;

import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate;
import com.adyen.checkout.components.core.paymentmethod.IssuerListPaymentMethod;
import com.adyen.checkout.issuerlist.internal.ui.model.IssuerListComponentParams;
import com.adyen.checkout.issuerlist.internal.ui.model.IssuerListInputData;
import com.adyen.checkout.issuerlist.internal.ui.model.IssuerListOutputData;
import com.adyen.checkout.issuerlist.internal.ui.model.IssuerModel;
import com.adyen.checkout.ui.core.internal.ui.ButtonDelegate;
import com.adyen.checkout.ui.core.internal.ui.UIStateDelegate;
import com.adyen.checkout.ui.core.internal.ui.ViewProvidingDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import y80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00010\u00052\u00020\u00062\u00020\u00072\u00020\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!¨\u0006%"}, d2 = {"Lcom/adyen/checkout/issuerlist/internal/ui/IssuerListDelegate;", "Lcom/adyen/checkout/components/core/paymentmethod/IssuerListPaymentMethod;", "IssuerListPaymentMethodT", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "ComponentStateT", "Lcom/adyen/checkout/components/core/internal/ui/PaymentComponentDelegate;", "Lcom/adyen/checkout/ui/core/internal/ui/ViewProvidingDelegate;", "Lcom/adyen/checkout/ui/core/internal/ui/ButtonDelegate;", "Lcom/adyen/checkout/ui/core/internal/ui/UIStateDelegate;", "", "Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerModel;", "getIssuers", "()Ljava/util/List;", "Lkotlin/Function1;", "Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerListInputData;", "", "update", "updateInputData", "(Lkotlin/jvm/functions/Function1;)V", "", "isInteractionBlocked", "setInteractionBlocked", "(Z)V", "Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerListComponentParams;", "getComponentParams", "()Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerListComponentParams;", "componentParams", "Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerListOutputData;", "getOutputData", "()Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerListOutputData;", "outputData", "Ly80/i;", "getOutputDataFlow", "()Ly80/i;", "outputDataFlow", "getComponentStateFlow", "componentStateFlow", "issuer-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IssuerListDelegate<IssuerListPaymentMethodT extends IssuerListPaymentMethod, ComponentStateT extends PaymentComponentState<IssuerListPaymentMethodT>> extends PaymentComponentDelegate<ComponentStateT>, ViewProvidingDelegate, ButtonDelegate, UIStateDelegate {
    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    @NotNull
    IssuerListComponentParams getComponentParams();

    @NotNull
    i getComponentStateFlow();

    @NotNull
    List<IssuerModel> getIssuers();

    @NotNull
    IssuerListOutputData getOutputData();

    @NotNull
    i getOutputDataFlow();

    void setInteractionBlocked(boolean isInteractionBlocked);

    void updateInputData(@NotNull Function1<? super IssuerListInputData, Unit> update);
}
