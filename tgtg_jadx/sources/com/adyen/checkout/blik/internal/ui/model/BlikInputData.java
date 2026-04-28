package com.adyen.checkout.blik.internal.ui.model;

import com.adyen.checkout.components.core.internal.ui.model.InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/blik/internal/ui/model/BlikInputData;", "Lcom/adyen/checkout/components/core/internal/ui/model/InputData;", "blikCode", "", "(Ljava/lang/String;)V", "getBlikCode", "()Ljava/lang/String;", "setBlikCode", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "blik_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BlikInputData implements InputData {

    @NotNull
    private String blikCode;

    public /* synthetic */ BlikInputData(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ BlikInputData copy$default(BlikInputData blikInputData, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = blikInputData.blikCode;
        }
        return blikInputData.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBlikCode() {
        return this.blikCode;
    }

    @NotNull
    public final BlikInputData copy(@NotNull String blikCode) {
        blikCode.getClass();
        return new BlikInputData(blikCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BlikInputData) && Intrinsics.areEqual(this.blikCode, ((BlikInputData) other).blikCode);
    }

    @NotNull
    public final String getBlikCode() {
        return this.blikCode;
    }

    public int hashCode() {
        return this.blikCode.hashCode();
    }

    public final void setBlikCode(@NotNull String str) {
        str.getClass();
        this.blikCode = str;
    }

    @NotNull
    public String toString() {
        return a0.p("BlikInputData(blikCode=", this.blikCode, ")");
    }

    public BlikInputData(@NotNull String str) {
        str.getClass();
        this.blikCode = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BlikInputData() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
