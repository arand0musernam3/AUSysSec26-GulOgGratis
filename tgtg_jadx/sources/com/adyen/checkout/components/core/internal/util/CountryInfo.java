package com.adyen.checkout.components.core.internal.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/adyen/checkout/components/core/internal/util/CountryInfo;", "", "isoCode", "", "callingCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getCallingCode", "()Ljava/lang/String;", "getIsoCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CountryInfo {

    @NotNull
    private final String callingCode;

    @NotNull
    private final String isoCode;

    public CountryInfo(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.isoCode = str;
        this.callingCode = str2;
    }

    public static /* synthetic */ CountryInfo copy$default(CountryInfo countryInfo, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = countryInfo.isoCode;
        }
        if ((i11 & 2) != 0) {
            str2 = countryInfo.callingCode;
        }
        return countryInfo.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIsoCode() {
        return this.isoCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCallingCode() {
        return this.callingCode;
    }

    @NotNull
    public final CountryInfo copy(@NotNull String isoCode, @NotNull String callingCode) {
        isoCode.getClass();
        callingCode.getClass();
        return new CountryInfo(isoCode, callingCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryInfo)) {
            return false;
        }
        CountryInfo countryInfo = (CountryInfo) other;
        return Intrinsics.areEqual(this.isoCode, countryInfo.isoCode) && Intrinsics.areEqual(this.callingCode, countryInfo.callingCode);
    }

    @NotNull
    public final String getCallingCode() {
        return this.callingCode;
    }

    @NotNull
    public final String getIsoCode() {
        return this.isoCode;
    }

    public int hashCode() {
        return this.callingCode.hashCode() + (this.isoCode.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.d("CountryInfo(isoCode=", this.isoCode, ", callingCode=", this.callingCode, ")");
    }
}
