package com.adyen.checkout.ui.core.internal.ui;

import a80.a;
import com.adyen.checkout.ui.core.internal.ui.model.AddressParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/AddressFormUIState;", "", "(Ljava/lang/String;I)V", "NONE", "POSTAL_CODE", "FULL_ADDRESS", "LOOKUP", "Companion", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AddressFormUIState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AddressFormUIState[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final AddressFormUIState NONE = new AddressFormUIState("NONE", 0);
    public static final AddressFormUIState POSTAL_CODE = new AddressFormUIState("POSTAL_CODE", 1);
    public static final AddressFormUIState FULL_ADDRESS = new AddressFormUIState("FULL_ADDRESS", 2);
    public static final AddressFormUIState LOOKUP = new AddressFormUIState("LOOKUP", 3);

    private static final /* synthetic */ AddressFormUIState[] $values() {
        return new AddressFormUIState[]{NONE, POSTAL_CODE, FULL_ADDRESS, LOOKUP};
    }

    static {
        AddressFormUIState[] addressFormUIStateArr$values = $values();
        $VALUES = addressFormUIStateArr$values;
        $ENTRIES = n.w(addressFormUIStateArr$values);
        INSTANCE = new Companion(null);
    }

    private AddressFormUIState(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static AddressFormUIState valueOf(String str) {
        return (AddressFormUIState) Enum.valueOf(AddressFormUIState.class, str);
    }

    public static AddressFormUIState[] values() {
        return (AddressFormUIState[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/AddressFormUIState$Companion;", "", "()V", "fromAddressParams", "Lcom/adyen/checkout/ui/core/internal/ui/AddressFormUIState;", "addressParams", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressParams;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AddressFormUIState fromAddressParams(@NotNull AddressParams addressParams) {
            addressParams.getClass();
            if (addressParams instanceof AddressParams.FullAddress) {
                return AddressFormUIState.FULL_ADDRESS;
            }
            if (addressParams instanceof AddressParams.PostalCode) {
                return AddressFormUIState.POSTAL_CODE;
            }
            if (addressParams instanceof AddressParams.None) {
                return AddressFormUIState.NONE;
            }
            if (addressParams instanceof AddressParams.Lookup) {
                return AddressFormUIState.LOOKUP;
            }
            e40.a.f();
            return null;
        }

        private Companion() {
        }
    }
}
