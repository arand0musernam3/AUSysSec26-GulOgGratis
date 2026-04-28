package com.adyen.checkout.voucher.internal.ui.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/model/VoucherInformationField;", "", "labelResId", "", "value", "", "(ILjava/lang/String;)V", "getLabelResId", "()I", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VoucherInformationField {
    private final int labelResId;

    @NotNull
    private final String value;

    public VoucherInformationField(int i11, @NotNull String str) {
        str.getClass();
        this.labelResId = i11;
        this.value = str;
    }

    public static /* synthetic */ VoucherInformationField copy$default(VoucherInformationField voucherInformationField, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = voucherInformationField.labelResId;
        }
        if ((i12 & 2) != 0) {
            str = voucherInformationField.value;
        }
        return voucherInformationField.copy(i11, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLabelResId() {
        return this.labelResId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final VoucherInformationField copy(int labelResId, @NotNull String value) {
        value.getClass();
        return new VoucherInformationField(labelResId, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoucherInformationField)) {
            return false;
        }
        VoucherInformationField voucherInformationField = (VoucherInformationField) other;
        return this.labelResId == voucherInformationField.labelResId && Intrinsics.areEqual(this.value, voucherInformationField.value);
    }

    public final int getLabelResId() {
        return this.labelResId;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (Integer.hashCode(this.labelResId) * 31);
    }

    @NotNull
    public String toString() {
        return "VoucherInformationField(labelResId=" + this.labelResId + ", value=" + this.value + ")";
    }
}
