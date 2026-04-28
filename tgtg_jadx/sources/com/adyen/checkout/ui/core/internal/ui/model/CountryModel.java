package com.adyen.checkout.ui.core.internal.ui.model;

import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0006\u0010\u0014\u001a\u00020\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/CountryModel;", "", "isoCode", "", "countryName", "callingCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCallingCode", "()Ljava/lang/String;", "getCountryName", "getIsoCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toShortString", "toString", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CountryModel {

    @NotNull
    private final String callingCode;

    @NotNull
    private final String countryName;

    @NotNull
    private final String isoCode;

    public CountryModel(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        a0.C(str, str2, str3);
        this.isoCode = str;
        this.countryName = str2;
        this.callingCode = str3;
    }

    public static /* synthetic */ CountryModel copy$default(CountryModel countryModel, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = countryModel.isoCode;
        }
        if ((i11 & 2) != 0) {
            str2 = countryModel.countryName;
        }
        if ((i11 & 4) != 0) {
            str3 = countryModel.callingCode;
        }
        return countryModel.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIsoCode() {
        return this.isoCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountryName() {
        return this.countryName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCallingCode() {
        return this.callingCode;
    }

    @NotNull
    public final CountryModel copy(@NotNull String isoCode, @NotNull String countryName, @NotNull String callingCode) {
        isoCode.getClass();
        countryName.getClass();
        callingCode.getClass();
        return new CountryModel(isoCode, countryName, callingCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryModel)) {
            return false;
        }
        CountryModel countryModel = (CountryModel) other;
        return Intrinsics.areEqual(this.isoCode, countryModel.isoCode) && Intrinsics.areEqual(this.countryName, countryModel.countryName) && Intrinsics.areEqual(this.callingCode, countryModel.callingCode);
    }

    @NotNull
    public final String getCallingCode() {
        return this.callingCode;
    }

    @NotNull
    public final String getCountryName() {
        return this.countryName;
    }

    @NotNull
    public final String getIsoCode() {
        return this.isoCode;
    }

    public int hashCode() {
        return this.callingCode.hashCode() + l1.b(this.isoCode.hashCode() * 31, 31, this.countryName);
    }

    @NotNull
    public final String toShortString() {
        return k.m(this.isoCode, " ", this.callingCode);
    }

    @NotNull
    public String toString() {
        String str = this.isoCode;
        String str2 = this.countryName;
        return k.p(f.t("CountryModel(isoCode=", str, ", countryName=", str2, ", callingCode="), this.callingCode, ")");
    }
}
