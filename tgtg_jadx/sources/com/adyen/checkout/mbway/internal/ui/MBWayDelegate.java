package com.adyen.checkout.mbway.internal.ui;

import com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate;
import com.adyen.checkout.mbway.MBWayComponentState;
import com.adyen.checkout.mbway.internal.ui.model.MBWayInputData;
import com.adyen.checkout.mbway.internal.ui.model.MBWayOutputData;
import com.adyen.checkout.ui.core.internal.ui.ButtonDelegate;
import com.adyen.checkout.ui.core.internal.ui.UIStateDelegate;
import com.adyen.checkout.ui.core.internal.ui.ViewProvidingDelegate;
import com.adyen.checkout.ui.core.internal.ui.model.CountryModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006 "}, d2 = {"Lcom/adyen/checkout/mbway/internal/ui/MBWayDelegate;", "Lcom/adyen/checkout/components/core/internal/ui/PaymentComponentDelegate;", "Lcom/adyen/checkout/mbway/MBWayComponentState;", "Lcom/adyen/checkout/ui/core/internal/ui/ViewProvidingDelegate;", "Lcom/adyen/checkout/ui/core/internal/ui/ButtonDelegate;", "Lcom/adyen/checkout/ui/core/internal/ui/UIStateDelegate;", "", "Lcom/adyen/checkout/ui/core/internal/ui/model/CountryModel;", "getSupportedCountries", "()Ljava/util/List;", "getInitiallySelectedCountry", "()Lcom/adyen/checkout/ui/core/internal/ui/model/CountryModel;", "Lkotlin/Function1;", "Lcom/adyen/checkout/mbway/internal/ui/model/MBWayInputData;", "", "update", "updateInputData", "(Lkotlin/jvm/functions/Function1;)V", "", "isInteractionBlocked", "setInteractionBlocked", "(Z)V", "Lcom/adyen/checkout/mbway/internal/ui/model/MBWayOutputData;", "getOutputData", "()Lcom/adyen/checkout/mbway/internal/ui/model/MBWayOutputData;", "outputData", "Ly80/i;", "getOutputDataFlow", "()Ly80/i;", "outputDataFlow", "getComponentStateFlow", "componentStateFlow", "mbway_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface MBWayDelegate extends PaymentComponentDelegate<MBWayComponentState>, ViewProvidingDelegate, ButtonDelegate, UIStateDelegate {
    @NotNull
    i getComponentStateFlow();

    @Nullable
    CountryModel getInitiallySelectedCountry();

    @NotNull
    MBWayOutputData getOutputData();

    @NotNull
    i getOutputDataFlow();

    @NotNull
    List<CountryModel> getSupportedCountries();

    void setInteractionBlocked(boolean isInteractionBlocked);

    void updateInputData(@NotNull Function1<? super MBWayInputData, Unit> update);
}
