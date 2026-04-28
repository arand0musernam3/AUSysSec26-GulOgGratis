package com.adyen.checkout.card;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import e0.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/adyen/checkout/card/AddressConfiguration;", "Landroid/os/Parcelable;", "()V", "CardAddressFieldPolicy", "FullAddress", "Lookup", "None", "PostalCode", "Lcom/adyen/checkout/card/AddressConfiguration$FullAddress;", "Lcom/adyen/checkout/card/AddressConfiguration$Lookup;", "Lcom/adyen/checkout/card/AddressConfiguration$None;", "Lcom/adyen/checkout/card/AddressConfiguration$PostalCode;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AddressConfiguration implements Parcelable {
    public /* synthetic */ AddressConfiguration(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/card/AddressConfiguration$CardAddressFieldPolicy;", "Landroid/os/Parcelable;", "()V", "Optional", "OptionalForCardTypes", "Required", "Lcom/adyen/checkout/card/AddressConfiguration$CardAddressFieldPolicy$Optional;", "Lcom/adyen/checkout/card/AddressConfiguration$CardAddressFieldPolicy$OptionalForCardTypes;", "Lcom/adyen/checkout/card/AddressConfiguration$CardAddressFieldPolicy$Required;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class CardAddressFieldPolicy implements Parcelable {
        public /* synthetic */ CardAddressFieldPolicy(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/card/AddressConfiguration$CardAddressFieldPolicy$Optional;", "Lcom/adyen/checkout/card/AddressConfiguration$CardAddressFieldPolicy;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Optional extends CardAddressFieldPolicy {

            @NotNull
            public static final Parcelable.Creator<Optional> CREATOR = new Creator();

            public Optional() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                parcel.getClass();
                parcel.writeInt(1);
            }

            /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Optional> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final Optional createFromParcel(@NotNull Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return new Optional();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final Optional[] newArray(int i11) {
                    return new Optional[i11];
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/adyen/checkout/card/AddressConfiguration$CardAddressFieldPolicy$OptionalForCardTypes;", "Lcom/adyen/checkout/card/AddressConfiguration$CardAddressFieldPolicy;", "brands", "", "", "(Ljava/util/List;)V", "getBrands", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OptionalForCardTypes extends CardAddressFieldPolicy {

            @NotNull
            public static final Parcelable.Creator<OptionalForCardTypes> CREATOR = new Creator();

            @NotNull
            private final List<String> brands;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OptionalForCardTypes(@NotNull List<String> list) {
                super(null);
                list.getClass();
                this.brands = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ OptionalForCardTypes copy$default(OptionalForCardTypes optionalForCardTypes, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = optionalForCardTypes.brands;
                }
                return optionalForCardTypes.copy(list);
            }

            @NotNull
            public final List<String> component1() {
                return this.brands;
            }

            @NotNull
            public final OptionalForCardTypes copy(@NotNull List<String> brands) {
                brands.getClass();
                return new OptionalForCardTypes(brands);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OptionalForCardTypes) && Intrinsics.areEqual(this.brands, ((OptionalForCardTypes) other).brands);
            }

            @NotNull
            public final List<String> getBrands() {
                return this.brands;
            }

            public int hashCode() {
                return this.brands.hashCode();
            }

            @NotNull
            public String toString() {
                return f.m("OptionalForCardTypes(brands=", ")", this.brands);
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                parcel.getClass();
                parcel.writeStringList(this.brands);
            }

            /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OptionalForCardTypes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final OptionalForCardTypes createFromParcel(@NotNull Parcel parcel) {
                    parcel.getClass();
                    return new OptionalForCardTypes(parcel.createStringArrayList());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final OptionalForCardTypes[] newArray(int i11) {
                    return new OptionalForCardTypes[i11];
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/card/AddressConfiguration$CardAddressFieldPolicy$Required;", "Lcom/adyen/checkout/card/AddressConfiguration$CardAddressFieldPolicy;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Required extends CardAddressFieldPolicy {

            @NotNull
            public static final Parcelable.Creator<Required> CREATOR = new Creator();

            public Required() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                parcel.getClass();
                parcel.writeInt(1);
            }

            /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Required> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final Required createFromParcel(@NotNull Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return new Required();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final Required[] newArray(int i11) {
                    return new Required[i11];
                }
            }
        }

        private CardAddressFieldPolicy() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/adyen/checkout/card/AddressConfiguration$FullAddress;", "Lcom/adyen/checkout/card/AddressConfiguration;", "defaultCountryCode", "", "supportedCountryCodes", "", "addressFieldPolicy", "Lcom/adyen/checkout/card/AddressConfiguration$CardAddressFieldPolicy;", "(Ljava/lang/String;Ljava/util/List;Lcom/adyen/checkout/card/AddressConfiguration$CardAddressFieldPolicy;)V", "getAddressFieldPolicy", "()Lcom/adyen/checkout/card/AddressConfiguration$CardAddressFieldPolicy;", "getDefaultCountryCode", "()Ljava/lang/String;", "getSupportedCountryCodes", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FullAddress extends AddressConfiguration {

        @NotNull
        public static final Parcelable.Creator<FullAddress> CREATOR = new Creator();

        @NotNull
        private final CardAddressFieldPolicy addressFieldPolicy;

        @Nullable
        private final String defaultCountryCode;

        @NotNull
        private final List<String> supportedCountryCodes;

        public FullAddress(String str, List list, CardAddressFieldPolicy cardAddressFieldPolicy, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? n0.f26529a : list, (i11 & 4) != 0 ? new CardAddressFieldPolicy.Required() : cardAddressFieldPolicy);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FullAddress copy$default(FullAddress fullAddress, String str, List list, CardAddressFieldPolicy cardAddressFieldPolicy, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = fullAddress.defaultCountryCode;
            }
            if ((i11 & 2) != 0) {
                list = fullAddress.supportedCountryCodes;
            }
            if ((i11 & 4) != 0) {
                cardAddressFieldPolicy = fullAddress.addressFieldPolicy;
            }
            return fullAddress.copy(str, list, cardAddressFieldPolicy);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDefaultCountryCode() {
            return this.defaultCountryCode;
        }

        @NotNull
        public final List<String> component2() {
            return this.supportedCountryCodes;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final CardAddressFieldPolicy getAddressFieldPolicy() {
            return this.addressFieldPolicy;
        }

        @NotNull
        public final FullAddress copy(@Nullable String defaultCountryCode, @NotNull List<String> supportedCountryCodes, @NotNull CardAddressFieldPolicy addressFieldPolicy) {
            supportedCountryCodes.getClass();
            addressFieldPolicy.getClass();
            return new FullAddress(defaultCountryCode, supportedCountryCodes, addressFieldPolicy);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FullAddress)) {
                return false;
            }
            FullAddress fullAddress = (FullAddress) other;
            return Intrinsics.areEqual(this.defaultCountryCode, fullAddress.defaultCountryCode) && Intrinsics.areEqual(this.supportedCountryCodes, fullAddress.supportedCountryCodes) && Intrinsics.areEqual(this.addressFieldPolicy, fullAddress.addressFieldPolicy);
        }

        @NotNull
        public final CardAddressFieldPolicy getAddressFieldPolicy() {
            return this.addressFieldPolicy;
        }

        @Nullable
        public final String getDefaultCountryCode() {
            return this.defaultCountryCode;
        }

        @NotNull
        public final List<String> getSupportedCountryCodes() {
            return this.supportedCountryCodes;
        }

        public int hashCode() {
            String str = this.defaultCountryCode;
            return this.addressFieldPolicy.hashCode() + f.c(this.supportedCountryCodes, (str == null ? 0 : str.hashCode()) * 31, 31);
        }

        @NotNull
        public String toString() {
            return "FullAddress(defaultCountryCode=" + this.defaultCountryCode + ", supportedCountryCodes=" + this.supportedCountryCodes + ", addressFieldPolicy=" + this.addressFieldPolicy + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            parcel.getClass();
            parcel.writeString(this.defaultCountryCode);
            parcel.writeStringList(this.supportedCountryCodes);
            parcel.writeParcelable(this.addressFieldPolicy, flags);
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FullAddress> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final FullAddress createFromParcel(@NotNull Parcel parcel) {
                parcel.getClass();
                return new FullAddress(parcel.readString(), parcel.createStringArrayList(), (CardAddressFieldPolicy) parcel.readParcelable(FullAddress.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final FullAddress[] newArray(int i11) {
                return new FullAddress[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FullAddress(@Nullable String str, @NotNull List<String> list, @NotNull CardAddressFieldPolicy cardAddressFieldPolicy) {
            super(null);
            list.getClass();
            cardAddressFieldPolicy.getClass();
            this.defaultCountryCode = str;
            this.supportedCountryCodes = list;
            this.addressFieldPolicy = cardAddressFieldPolicy;
        }

        public FullAddress() {
            this(null, null, null, 7, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/card/AddressConfiguration$Lookup;", "Lcom/adyen/checkout/card/AddressConfiguration;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Lookup extends AddressConfiguration {

        @NotNull
        public static final Parcelable.Creator<Lookup> CREATOR = new Creator();

        public Lookup() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            parcel.getClass();
            parcel.writeInt(1);
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Lookup> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Lookup createFromParcel(@NotNull Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return new Lookup();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Lookup[] newArray(int i11) {
                return new Lookup[i11];
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/card/AddressConfiguration$None;", "Lcom/adyen/checkout/card/AddressConfiguration;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SuppressLint({"ObjectInPublicSealedClass"})
    public static final class None extends AddressConfiguration {

        @NotNull
        public static final None INSTANCE = new None();

        @NotNull
        public static final Parcelable.Creator<None> CREATOR = new Creator();

        private None() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            parcel.getClass();
            parcel.writeInt(1);
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<None> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final None createFromParcel(@NotNull Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return None.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final None[] newArray(int i11) {
                return new None[i11];
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/adyen/checkout/card/AddressConfiguration$PostalCode;", "Lcom/adyen/checkout/card/AddressConfiguration;", "addressFieldPolicy", "Lcom/adyen/checkout/card/AddressConfiguration$CardAddressFieldPolicy;", "(Lcom/adyen/checkout/card/AddressConfiguration$CardAddressFieldPolicy;)V", "getAddressFieldPolicy", "()Lcom/adyen/checkout/card/AddressConfiguration$CardAddressFieldPolicy;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PostalCode extends AddressConfiguration {

        @NotNull
        public static final Parcelable.Creator<PostalCode> CREATOR = new Creator();

        @NotNull
        private final CardAddressFieldPolicy addressFieldPolicy;

        public /* synthetic */ PostalCode(CardAddressFieldPolicy cardAddressFieldPolicy, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new CardAddressFieldPolicy.Required() : cardAddressFieldPolicy);
        }

        public static /* synthetic */ PostalCode copy$default(PostalCode postalCode, CardAddressFieldPolicy cardAddressFieldPolicy, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cardAddressFieldPolicy = postalCode.addressFieldPolicy;
            }
            return postalCode.copy(cardAddressFieldPolicy);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CardAddressFieldPolicy getAddressFieldPolicy() {
            return this.addressFieldPolicy;
        }

        @NotNull
        public final PostalCode copy(@NotNull CardAddressFieldPolicy addressFieldPolicy) {
            addressFieldPolicy.getClass();
            return new PostalCode(addressFieldPolicy);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PostalCode) && Intrinsics.areEqual(this.addressFieldPolicy, ((PostalCode) other).addressFieldPolicy);
        }

        @NotNull
        public final CardAddressFieldPolicy getAddressFieldPolicy() {
            return this.addressFieldPolicy;
        }

        public int hashCode() {
            return this.addressFieldPolicy.hashCode();
        }

        @NotNull
        public String toString() {
            return "PostalCode(addressFieldPolicy=" + this.addressFieldPolicy + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            parcel.getClass();
            parcel.writeParcelable(this.addressFieldPolicy, flags);
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PostalCode> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final PostalCode createFromParcel(@NotNull Parcel parcel) {
                parcel.getClass();
                return new PostalCode((CardAddressFieldPolicy) parcel.readParcelable(PostalCode.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final PostalCode[] newArray(int i11) {
                return new PostalCode[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PostalCode() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PostalCode(@NotNull CardAddressFieldPolicy cardAddressFieldPolicy) {
            super(null);
            cardAddressFieldPolicy.getClass();
            this.addressFieldPolicy = cardAddressFieldPolicy;
        }
    }

    private AddressConfiguration() {
    }
}
