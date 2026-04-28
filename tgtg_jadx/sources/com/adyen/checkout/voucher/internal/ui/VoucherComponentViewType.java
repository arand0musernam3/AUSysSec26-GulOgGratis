package com.adyen.checkout.voucher.internal.ui;

import a80.a;
import com.adyen.checkout.ui.core.internal.ui.ComponentViewType;
import com.adyen.checkout.ui.core.internal.ui.ViewProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/VoucherComponentViewType;", "", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "(Ljava/lang/String;I)V", "viewProvider", "Lcom/adyen/checkout/ui/core/internal/ui/ViewProvider;", "getViewProvider", "()Lcom/adyen/checkout/ui/core/internal/ui/ViewProvider;", "SIMPLE_VOUCHER", "FULL_VOUCHER", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VoucherComponentViewType implements ComponentViewType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ VoucherComponentViewType[] $VALUES;

    @NotNull
    private final ViewProvider viewProvider = VoucherViewProvider.INSTANCE;
    public static final VoucherComponentViewType SIMPLE_VOUCHER = new VoucherComponentViewType("SIMPLE_VOUCHER", 0);
    public static final VoucherComponentViewType FULL_VOUCHER = new VoucherComponentViewType("FULL_VOUCHER", 1);

    private static final /* synthetic */ VoucherComponentViewType[] $values() {
        return new VoucherComponentViewType[]{SIMPLE_VOUCHER, FULL_VOUCHER};
    }

    static {
        VoucherComponentViewType[] voucherComponentViewTypeArr$values = $values();
        $VALUES = voucherComponentViewTypeArr$values;
        $ENTRIES = n.w(voucherComponentViewTypeArr$values);
    }

    private VoucherComponentViewType(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static VoucherComponentViewType valueOf(String str) {
        return (VoucherComponentViewType) Enum.valueOf(VoucherComponentViewType.class, str);
    }

    public static VoucherComponentViewType[] values() {
        return (VoucherComponentViewType[]) $VALUES.clone();
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentViewType
    @NotNull
    public ViewProvider getViewProvider() {
        return this.viewProvider;
    }
}
