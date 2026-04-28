package com.adyen.checkout.ui.core.internal.ui.view;

import com.adyen.checkout.components.core.AddressData;
import com.adyen.checkout.components.core.LookupAddress;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\u0015\u001a\u00020\u000bH\u0002J\b\u0010\u0016\u001a\u00020\u000bH\u0002J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/LookupOption;", "", "lookupAddress", "Lcom/adyen/checkout/components/core/LookupAddress;", "isLoading", "", "(Lcom/adyen/checkout/components/core/LookupAddress;Z)V", "()Z", "getLookupAddress", "()Lcom/adyen/checkout/components/core/LookupAddress;", "subtitle", "", "getSubtitle", "()Ljava/lang/String;", MessageBundle.TITLE_ENTRY, "getTitle", "component1", "component2", "copy", "equals", "other", "formatSubtitle", "formatTitle", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddressLookupOptionsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressLookupOptionsAdapter.kt\ncom/adyen/checkout/ui/core/internal/ui/view/LookupOption\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,91:1\n3829#2:92\n4344#2,2:93\n3829#2:95\n4344#2,2:96\n*S KotlinDebug\n*F\n+ 1 AddressLookupOptionsAdapter.kt\ncom/adyen/checkout/ui/core/internal/ui/view/LookupOption\n*L\n74#1:92\n74#1:93,2\n87#1:95\n87#1:96,2\n*E\n"})
public final /* data */ class LookupOption {
    private final boolean isLoading;

    @NotNull
    private final LookupAddress lookupAddress;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;

    public LookupOption(@NotNull LookupAddress lookupAddress, boolean z11) {
        lookupAddress.getClass();
        this.lookupAddress = lookupAddress;
        this.isLoading = z11;
        this.title = formatTitle();
        this.subtitle = formatSubtitle();
    }

    public static /* synthetic */ LookupOption copy$default(LookupOption lookupOption, LookupAddress lookupAddress, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lookupAddress = lookupOption.lookupAddress;
        }
        if ((i11 & 2) != 0) {
            z11 = lookupOption.isLoading;
        }
        return lookupOption.copy(lookupAddress, z11);
    }

    private final String formatSubtitle() {
        AddressData address = this.lookupAddress.getAddress();
        String[] strArr = {address.getPostalCode(), address.getCity(), address.getStateOrProvince(), address.getCountry()};
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 4; i11++) {
            String str = strArr[i11];
            if (!StringsKt.H(str)) {
                arrayList.add(str);
            }
        }
        return CollectionsKt.U(arrayList, ", ", null, null, null, 62);
    }

    private final String formatTitle() {
        AddressData address = this.lookupAddress.getAddress();
        String street = address.getStreet();
        String houseNumberOrName = address.getHouseNumberOrName();
        String apartmentSuite = address.getApartmentSuite();
        if (apartmentSuite == null) {
            apartmentSuite = "";
        }
        String[] strArr = {street, houseNumberOrName, apartmentSuite};
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 3; i11++) {
            String str = strArr[i11];
            if (!StringsKt.H(str)) {
                arrayList.add(str);
            }
        }
        return CollectionsKt.U(arrayList, " ", null, null, null, 62);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LookupAddress getLookupAddress() {
        return this.lookupAddress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @NotNull
    public final LookupOption copy(@NotNull LookupAddress lookupAddress, boolean isLoading) {
        lookupAddress.getClass();
        return new LookupOption(lookupAddress, isLoading);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LookupOption)) {
            return false;
        }
        LookupOption lookupOption = (LookupOption) other;
        return Intrinsics.areEqual(this.lookupAddress, lookupOption.lookupAddress) && this.isLoading == lookupOption.isLoading;
    }

    @NotNull
    public final LookupAddress getLookupAddress() {
        return this.lookupAddress;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLoading) + (this.lookupAddress.hashCode() * 31);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    @NotNull
    public String toString() {
        return "LookupOption(lookupAddress=" + this.lookupAddress + ", isLoading=" + this.isLoading + ")";
    }

    public /* synthetic */ LookupOption(LookupAddress lookupAddress, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(lookupAddress, (i11 & 2) != 0 ? false : z11);
    }
}
