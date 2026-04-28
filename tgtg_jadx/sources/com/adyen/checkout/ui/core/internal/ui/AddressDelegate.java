package com.adyen.checkout.ui.core.internal.ui;

import com.adyen.checkout.components.core.internal.ui.model.AddressInputModel;
import com.adyen.checkout.ui.core.internal.ui.model.AddressOutputData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import y80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/AddressDelegate;", "", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;", "", "update", "updateAddressInputData", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData;", "getAddressOutputData", "()Lcom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData;", "addressOutputData", "Ly80/i;", "getAddressOutputDataFlow", "()Ly80/i;", "addressOutputDataFlow", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AddressDelegate {
    @NotNull
    AddressOutputData getAddressOutputData();

    @NotNull
    i getAddressOutputDataFlow();

    void updateAddressInputData(@NotNull Function1<? super AddressInputModel, Unit> update);
}
