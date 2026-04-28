package com.adyen.checkout.ui.core.internal.ui;

import com.adyen.checkout.components.core.AddressLookupCallback;
import com.adyen.checkout.components.core.AddressLookupResult;
import com.adyen.checkout.components.core.LookupAddress;
import com.adyen.checkout.components.core.internal.ui.model.AddressInputModel;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v80.b0;
import y80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\nH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H&¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0006H&¢\u0006\u0004\b!\u0010\u001fR\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010)¨\u0006/"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/AddressLookupDelegate;", "", "Lv80/b0;", "coroutineScope", "Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;", "addressInputModel", "", "initialize", "(Lv80/b0;Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;)V", "", "Lcom/adyen/checkout/components/core/LookupAddress;", "options", "updateAddressLookupOptions", "(Ljava/util/List;)V", "Lcom/adyen/checkout/components/core/AddressLookupResult;", "addressLookupResult", "setAddressLookupResult", "(Lcom/adyen/checkout/components/core/AddressLookupResult;)V", "Lcom/adyen/checkout/components/core/AddressLookupCallback;", "addressLookupCallback", "setAddressLookupCallback", "(Lcom/adyen/checkout/components/core/AddressLookupCallback;)V", "", "query", "onAddressQueryChanged", "(Ljava/lang/String;)V", "lookupAddress", "", "onAddressLookupCompletion", "(Lcom/adyen/checkout/components/core/LookupAddress;)Z", "onManualEntryModeSelected", "()V", "submitAddress", "clear", "Lcom/adyen/checkout/ui/core/internal/ui/AddressDelegate;", "getAddressDelegate", "()Lcom/adyen/checkout/ui/core/internal/ui/AddressDelegate;", "addressDelegate", "Ly80/i;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState;", "getAddressLookupStateFlow", "()Ly80/i;", "addressLookupStateFlow", "getAddressLookupSubmitFlow", "addressLookupSubmitFlow", "getAddressLookupErrorPopupFlow", "addressLookupErrorPopupFlow", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AddressLookupDelegate {
    void clear();

    @NotNull
    AddressDelegate getAddressDelegate();

    @NotNull
    i getAddressLookupErrorPopupFlow();

    @NotNull
    i getAddressLookupStateFlow();

    @NotNull
    i getAddressLookupSubmitFlow();

    void initialize(@NotNull b0 coroutineScope, @NotNull AddressInputModel addressInputModel);

    boolean onAddressLookupCompletion(@NotNull LookupAddress lookupAddress);

    void onAddressQueryChanged(@NotNull String query);

    void onManualEntryModeSelected();

    void setAddressLookupCallback(@NotNull AddressLookupCallback addressLookupCallback);

    void setAddressLookupResult(@NotNull AddressLookupResult addressLookupResult);

    void submitAddress();

    void updateAddressLookupOptions(@NotNull List<LookupAddress> options);
}
