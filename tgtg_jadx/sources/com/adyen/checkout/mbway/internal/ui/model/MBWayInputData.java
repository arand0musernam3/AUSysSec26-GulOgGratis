package com.adyen.checkout.mbway.internal.ui.model;

import com.adyen.checkout.components.core.internal.ui.model.InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/adyen/checkout/mbway/internal/ui/model/MBWayInputData;", "Lcom/adyen/checkout/components/core/internal/ui/model/InputData;", "countryCode", "", "localPhoneNumber", "(Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "getLocalPhoneNumber", "setLocalPhoneNumber", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "mbway_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MBWayInputData implements InputData {

    @NotNull
    private String countryCode;

    @NotNull
    private String localPhoneNumber;

    public /* synthetic */ MBWayInputData(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ MBWayInputData copy$default(MBWayInputData mBWayInputData, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mBWayInputData.countryCode;
        }
        if ((i11 & 2) != 0) {
            str2 = mBWayInputData.localPhoneNumber;
        }
        return mBWayInputData.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLocalPhoneNumber() {
        return this.localPhoneNumber;
    }

    @NotNull
    public final MBWayInputData copy(@NotNull String countryCode, @NotNull String localPhoneNumber) {
        countryCode.getClass();
        localPhoneNumber.getClass();
        return new MBWayInputData(countryCode, localPhoneNumber);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MBWayInputData)) {
            return false;
        }
        MBWayInputData mBWayInputData = (MBWayInputData) other;
        return Intrinsics.areEqual(this.countryCode, mBWayInputData.countryCode) && Intrinsics.areEqual(this.localPhoneNumber, mBWayInputData.localPhoneNumber);
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getLocalPhoneNumber() {
        return this.localPhoneNumber;
    }

    public int hashCode() {
        return this.localPhoneNumber.hashCode() + (this.countryCode.hashCode() * 31);
    }

    public final void setCountryCode(@NotNull String str) {
        str.getClass();
        this.countryCode = str;
    }

    public final void setLocalPhoneNumber(@NotNull String str) {
        str.getClass();
        this.localPhoneNumber = str;
    }

    @NotNull
    public String toString() {
        return a.d("MBWayInputData(countryCode=", this.countryCode, ", localPhoneNumber=", this.localPhoneNumber, ")");
    }

    public MBWayInputData(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.countryCode = str;
        this.localPhoneNumber = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MBWayInputData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
