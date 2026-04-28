package com.adyen.checkout.card;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.adyen.checkout.card.InstallmentOptions;
import com.adyen.checkout.card.internal.util.InstallmentUtils;
import com.adyen.checkout.core.exception.CheckoutException;
import e0.f;
import j4.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/adyen/checkout/card/InstallmentConfiguration;", "Landroid/os/Parcelable;", "defaultOptions", "Lcom/adyen/checkout/card/InstallmentOptions$DefaultInstallmentOptions;", "cardBasedOptions", "", "Lcom/adyen/checkout/card/InstallmentOptions$CardBasedInstallmentOptions;", "showInstallmentAmount", "", "(Lcom/adyen/checkout/card/InstallmentOptions$DefaultInstallmentOptions;Ljava/util/List;Z)V", "getCardBasedOptions", "()Ljava/util/List;", "getDefaultOptions", "()Lcom/adyen/checkout/card/InstallmentOptions$DefaultInstallmentOptions;", "getShowInstallmentAmount", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class InstallmentConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InstallmentConfiguration> CREATOR = new Creator();

    @NotNull
    private final List<InstallmentOptions.CardBasedInstallmentOptions> cardBasedOptions;

    @Nullable
    private final InstallmentOptions.DefaultInstallmentOptions defaultOptions;
    private final boolean showInstallmentAmount;

    public InstallmentConfiguration(@Nullable InstallmentOptions.DefaultInstallmentOptions defaultInstallmentOptions, @NotNull List<InstallmentOptions.CardBasedInstallmentOptions> list, boolean z11) {
        list.getClass();
        this.defaultOptions = defaultInstallmentOptions;
        this.cardBasedOptions = list;
        this.showInstallmentAmount = z11;
        InstallmentUtils installmentUtils = InstallmentUtils.INSTANCE;
        if (!installmentUtils.isCardBasedOptionsValid(list)) {
            throw new CheckoutException("Installment Configuration has multiple rules for same card type.", null, 2, null);
        }
        if (!installmentUtils.areInstallmentValuesValid(this)) {
            throw new CheckoutException("Installment Configuration contains invalid values for options. Values must be greater than 1.", null, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstallmentConfiguration copy$default(InstallmentConfiguration installmentConfiguration, InstallmentOptions.DefaultInstallmentOptions defaultInstallmentOptions, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            defaultInstallmentOptions = installmentConfiguration.defaultOptions;
        }
        if ((i11 & 2) != 0) {
            list = installmentConfiguration.cardBasedOptions;
        }
        if ((i11 & 4) != 0) {
            z11 = installmentConfiguration.showInstallmentAmount;
        }
        return installmentConfiguration.copy(defaultInstallmentOptions, list, z11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final InstallmentOptions.DefaultInstallmentOptions getDefaultOptions() {
        return this.defaultOptions;
    }

    @NotNull
    public final List<InstallmentOptions.CardBasedInstallmentOptions> component2() {
        return this.cardBasedOptions;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowInstallmentAmount() {
        return this.showInstallmentAmount;
    }

    @NotNull
    public final InstallmentConfiguration copy(@Nullable InstallmentOptions.DefaultInstallmentOptions defaultOptions, @NotNull List<InstallmentOptions.CardBasedInstallmentOptions> cardBasedOptions, boolean showInstallmentAmount) {
        cardBasedOptions.getClass();
        return new InstallmentConfiguration(defaultOptions, cardBasedOptions, showInstallmentAmount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentConfiguration)) {
            return false;
        }
        InstallmentConfiguration installmentConfiguration = (InstallmentConfiguration) other;
        return Intrinsics.areEqual(this.defaultOptions, installmentConfiguration.defaultOptions) && Intrinsics.areEqual(this.cardBasedOptions, installmentConfiguration.cardBasedOptions) && this.showInstallmentAmount == installmentConfiguration.showInstallmentAmount;
    }

    @NotNull
    public final List<InstallmentOptions.CardBasedInstallmentOptions> getCardBasedOptions() {
        return this.cardBasedOptions;
    }

    @Nullable
    public final InstallmentOptions.DefaultInstallmentOptions getDefaultOptions() {
        return this.defaultOptions;
    }

    public final boolean getShowInstallmentAmount() {
        return this.showInstallmentAmount;
    }

    public int hashCode() {
        InstallmentOptions.DefaultInstallmentOptions defaultInstallmentOptions = this.defaultOptions;
        return Boolean.hashCode(this.showInstallmentAmount) + f.c(this.cardBasedOptions, (defaultInstallmentOptions == null ? 0 : defaultInstallmentOptions.hashCode()) * 31, 31);
    }

    @NotNull
    public String toString() {
        InstallmentOptions.DefaultInstallmentOptions defaultInstallmentOptions = this.defaultOptions;
        List<InstallmentOptions.CardBasedInstallmentOptions> list = this.cardBasedOptions;
        boolean z11 = this.showInstallmentAmount;
        StringBuilder sb2 = new StringBuilder("InstallmentConfiguration(defaultOptions=");
        sb2.append(defaultInstallmentOptions);
        sb2.append(", cardBasedOptions=");
        sb2.append(list);
        sb2.append(", showInstallmentAmount=");
        return s.o(sb2, z11, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        InstallmentOptions.DefaultInstallmentOptions defaultInstallmentOptions = this.defaultOptions;
        if (defaultInstallmentOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            defaultInstallmentOptions.writeToParcel(parcel, flags);
        }
        Iterator itR = i.r(this.cardBasedOptions, parcel);
        while (itR.hasNext()) {
            ((InstallmentOptions.CardBasedInstallmentOptions) itR.next()).writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.showInstallmentAmount ? 1 : 0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InstallmentConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final InstallmentConfiguration createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            InstallmentOptions.DefaultInstallmentOptions defaultInstallmentOptionsCreateFromParcel = parcel.readInt() == 0 ? null : InstallmentOptions.DefaultInstallmentOptions.CREATOR.createFromParcel(parcel);
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            int iC = 0;
            while (iC != i11) {
                iC = i.c(InstallmentOptions.CardBasedInstallmentOptions.CREATOR, parcel, arrayList, iC, 1);
            }
            return new InstallmentConfiguration(defaultInstallmentOptionsCreateFromParcel, arrayList, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final InstallmentConfiguration[] newArray(int i11) {
            return new InstallmentConfiguration[i11];
        }
    }

    public InstallmentConfiguration() {
        this(null, null, false, 7, null);
    }

    public InstallmentConfiguration(InstallmentOptions.DefaultInstallmentOptions defaultInstallmentOptions, List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : defaultInstallmentOptions, (i11 & 2) != 0 ? n0.f26529a : list, (i11 & 4) != 0 ? false : z11);
    }
}
