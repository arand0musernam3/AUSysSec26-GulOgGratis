package com.adyen.checkout.card.internal.ui;

import com.adyen.checkout.card.BinLookupData;
import com.adyen.checkout.card.CardComponentState;
import com.adyen.checkout.card.internal.ui.model.CardInputData;
import com.adyen.checkout.card.internal.ui.model.CardOutputData;
import com.adyen.checkout.components.core.AddressLookupCallback;
import com.adyen.checkout.components.core.AddressLookupResult;
import com.adyen.checkout.components.core.LookupAddress;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate;
import com.adyen.checkout.ui.core.internal.ui.AddressDelegate;
import com.adyen.checkout.ui.core.internal.ui.ButtonDelegate;
import com.adyen.checkout.ui.core.internal.ui.UIStateDelegate;
import com.adyen.checkout.ui.core.internal.ui.ViewProvidingDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006J#\u0010\u000b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\t2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H&¢\u0006\u0004\b\u0013\u0010\fJ+\u0010\u0016\u001a\u00020\t2\u001a\u0010\u0012\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H&¢\u0006\u0004\b\u0016\u0010\fJ\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\rH&¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\tH&¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020\rH&¢\u0006\u0004\b(\u0010\u0010J\u0017\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020\rH&¢\u0006\u0004\b*\u0010\u0010J5\u00100\u001a\u00020\t2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\u00112\b\u0010.\u001a\u0004\u0018\u00010+2\b\u0010/\u001a\u0004\u0018\u00010+H&¢\u0006\u0004\b0\u00101R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000202068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u00108R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020<068&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u00108¨\u0006?"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/CardDelegate;", "Lcom/adyen/checkout/components/core/internal/ui/PaymentComponentDelegate;", "Lcom/adyen/checkout/card/CardComponentState;", "Lcom/adyen/checkout/ui/core/internal/ui/ViewProvidingDelegate;", "Lcom/adyen/checkout/ui/core/internal/ui/ButtonDelegate;", "Lcom/adyen/checkout/ui/core/internal/ui/UIStateDelegate;", "Lcom/adyen/checkout/ui/core/internal/ui/AddressDelegate;", "Lkotlin/Function1;", "Lcom/adyen/checkout/card/internal/ui/model/CardInputData;", "", "update", "updateInputData", "(Lkotlin/jvm/functions/Function1;)V", "", "isInteractionBlocked", "setInteractionBlocked", "(Z)V", "", "listener", "setOnBinValueListener", "", "Lcom/adyen/checkout/card/BinLookupData;", "setOnBinLookupListener", "Lcom/adyen/checkout/components/core/AddressLookupCallback;", "addressLookupCallback", "setAddressLookupCallback", "(Lcom/adyen/checkout/components/core/AddressLookupCallback;)V", "Lcom/adyen/checkout/components/core/LookupAddress;", "options", "updateAddressLookupOptions", "(Ljava/util/List;)V", "Lcom/adyen/checkout/components/core/AddressLookupResult;", "addressLookupResult", "setAddressLookupResult", "(Lcom/adyen/checkout/components/core/AddressLookupResult;)V", "handleBackPress", "()Z", "startAddressLookup", "()V", "isAvailable", "onCardScanningAvailability", "didDisplay", "onCardScanningDisplayed", "", StatusResponse.RESULT_CODE, "pan", "expiryMonth", "expiryYear", "onCardScanningResult", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lcom/adyen/checkout/card/internal/ui/model/CardOutputData;", "getOutputData", "()Lcom/adyen/checkout/card/internal/ui/model/CardOutputData;", "outputData", "Ly80/i;", "getOutputDataFlow", "()Ly80/i;", "outputDataFlow", "getComponentStateFlow", "componentStateFlow", "Lcom/adyen/checkout/core/exception/CheckoutException;", "getExceptionFlow", "exceptionFlow", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CardDelegate extends PaymentComponentDelegate<CardComponentState>, ViewProvidingDelegate, ButtonDelegate, UIStateDelegate, AddressDelegate {
    @NotNull
    i getComponentStateFlow();

    @NotNull
    i getExceptionFlow();

    @NotNull
    CardOutputData getOutputData();

    @NotNull
    i getOutputDataFlow();

    boolean handleBackPress();

    void onCardScanningAvailability(boolean isAvailable);

    void onCardScanningDisplayed(boolean didDisplay);

    void onCardScanningResult(int resultCode, @Nullable String pan, @Nullable Integer expiryMonth, @Nullable Integer expiryYear);

    void setAddressLookupCallback(@NotNull AddressLookupCallback addressLookupCallback);

    void setAddressLookupResult(@NotNull AddressLookupResult addressLookupResult);

    void setInteractionBlocked(boolean isInteractionBlocked);

    void setOnBinLookupListener(@Nullable Function1<? super List<BinLookupData>, Unit> listener);

    void setOnBinValueListener(@Nullable Function1<? super String, Unit> listener);

    void startAddressLookup();

    void updateAddressLookupOptions(@NotNull List<LookupAddress> options);

    void updateInputData(@NotNull Function1<? super CardInputData, Unit> update);
}
