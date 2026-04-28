package com.adyen.checkout.ui.core.internal.ui;

import a80.a;
import b3.i;
import com.adyen.checkout.ui.core.R;
import com.appsflyer.AdRevenueScheme;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0018\u0019B?\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\t\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\b\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fj\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u001a"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/AddressSpecification;", "", "street", "Lcom/adyen/checkout/ui/core/internal/ui/AddressSpecification$AddressFieldSpec;", "houseNumber", "apartmentSuite", "postalCode", "city", "stateProvince", AdRevenueScheme.COUNTRY, "(Ljava/lang/String;ILcom/adyen/checkout/ui/core/internal/ui/AddressSpecification$AddressFieldSpec;Lcom/adyen/checkout/ui/core/internal/ui/AddressSpecification$AddressFieldSpec;Lcom/adyen/checkout/ui/core/internal/ui/AddressSpecification$AddressFieldSpec;Lcom/adyen/checkout/ui/core/internal/ui/AddressSpecification$AddressFieldSpec;Lcom/adyen/checkout/ui/core/internal/ui/AddressSpecification$AddressFieldSpec;Lcom/adyen/checkout/ui/core/internal/ui/AddressSpecification$AddressFieldSpec;Lcom/adyen/checkout/ui/core/internal/ui/AddressSpecification$AddressFieldSpec;)V", "getApartmentSuite$ui_core_release", "()Lcom/adyen/checkout/ui/core/internal/ui/AddressSpecification$AddressFieldSpec;", "getCity$ui_core_release", "getCountry$ui_core_release", "getHouseNumber$ui_core_release", "getPostalCode$ui_core_release", "getStateProvince$ui_core_release", "getStreet$ui_core_release", "BR", "CA", "GB", "US", "DEFAULT", "AddressFieldSpec", "Companion", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AddressSpecification {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AddressSpecification[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final AddressFieldSpec apartmentSuite;

    @NotNull
    private final AddressFieldSpec city;

    @NotNull
    private final AddressFieldSpec country;

    @NotNull
    private final AddressFieldSpec houseNumber;

    @NotNull
    private final AddressFieldSpec postalCode;

    @NotNull
    private final AddressFieldSpec stateProvince;

    @NotNull
    private final AddressFieldSpec street;
    public static final AddressSpecification BR = new AddressSpecification("BR", 0, new AddressFieldSpec(true, R.style.AdyenCheckout_StreetInput, Integer.valueOf(R.style.AdyenCheckout_StreetInput_Optional)), new AddressFieldSpec(true, R.style.AdyenCheckout_HouseNumberInput, Integer.valueOf(R.style.AdyenCheckout_HouseNumberInput_Optional)), new AddressFieldSpec(false, R.style.AdyenCheckout_ApartmentSuiteInput, Integer.valueOf(R.style.AdyenCheckout_ApartmentSuiteInput_Optional)), new AddressFieldSpec(true, R.style.AdyenCheckout_PostalCodeInput, Integer.valueOf(R.style.AdyenCheckout_PostalCodeInput_Optional)), new AddressFieldSpec(true, R.style.AdyenCheckout_CityInput, Integer.valueOf(R.style.AdyenCheckout_CityInput_Optional)), new AddressFieldSpec(true, R.style.AdyenCheckout_DropdownTextInputLayout_StatesInput, null), new AddressFieldSpec(true, R.style.AdyenCheckout_DropdownTextInputLayout_CountryInput, null));
    public static final AddressSpecification CA = new AddressSpecification("CA", 1, new AddressFieldSpec(true, R.style.AdyenCheckout_AddressInput, Integer.valueOf(R.style.AdyenCheckout_AddressInput_Optional)), new AddressFieldSpec(false, 0, 0), new AddressFieldSpec(false, R.style.AdyenCheckout_ApartmentSuiteInput, Integer.valueOf(R.style.AdyenCheckout_ApartmentSuiteInput_Optional)), new AddressFieldSpec(true, R.style.AdyenCheckout_PostalCodeInput, Integer.valueOf(R.style.AdyenCheckout_PostalCodeInput_Optional)), new AddressFieldSpec(true, R.style.AdyenCheckout_CityInput, Integer.valueOf(R.style.AdyenCheckout_CityInput_Optional)), new AddressFieldSpec(true, R.style.AdyenCheckout_ProvinceTerritoryInput, null), new AddressFieldSpec(true, R.style.AdyenCheckout_DropdownTextInputLayout_CountryInput, null));
    public static final AddressSpecification GB = new AddressSpecification("GB", 2, new AddressFieldSpec(true, R.style.AdyenCheckout_StreetInput, Integer.valueOf(R.style.AdyenCheckout_StreetInput_Optional)), new AddressFieldSpec(true, R.style.AdyenCheckout_HouseNumberInput, Integer.valueOf(R.style.AdyenCheckout_HouseNumberInput_Optional)), new AddressFieldSpec(false, 0, 0), new AddressFieldSpec(true, R.style.AdyenCheckout_PostalCodeInput, Integer.valueOf(R.style.AdyenCheckout_PostalCodeInput_Optional)), new AddressFieldSpec(true, R.style.AdyenCheckout_CityTownInput, Integer.valueOf(R.style.AdyenCheckout_CityTownInput_Optional)), new AddressFieldSpec(false, 0, 0), new AddressFieldSpec(true, R.style.AdyenCheckout_DropdownTextInputLayout_CountryInput, null));
    public static final AddressSpecification US = new AddressSpecification("US", 3, new AddressFieldSpec(true, R.style.AdyenCheckout_AddressInput, Integer.valueOf(R.style.AdyenCheckout_AddressInput_Optional)), new AddressFieldSpec(false, 0, 0), new AddressFieldSpec(false, R.style.AdyenCheckout_ApartmentSuiteInput, Integer.valueOf(R.style.AdyenCheckout_ApartmentSuiteInput_Optional)), new AddressFieldSpec(true, R.style.AdyenCheckout_ZipCodeInput, Integer.valueOf(R.style.AdyenCheckout_ZipCodeInput_Optional)), new AddressFieldSpec(true, R.style.AdyenCheckout_CityInput, Integer.valueOf(R.style.AdyenCheckout_CityInput_Optional)), new AddressFieldSpec(true, R.style.AdyenCheckout_DropdownTextInputLayout_StatesInput, null), new AddressFieldSpec(true, R.style.AdyenCheckout_DropdownTextInputLayout_CountryInput, null));
    public static final AddressSpecification DEFAULT = new AddressSpecification("DEFAULT", 4, new AddressFieldSpec(true, R.style.AdyenCheckout_StreetInput, Integer.valueOf(R.style.AdyenCheckout_StreetInput_Optional)), new AddressFieldSpec(true, R.style.AdyenCheckout_HouseNumberInput, Integer.valueOf(R.style.AdyenCheckout_HouseNumberInput_Optional)), new AddressFieldSpec(false, R.style.AdyenCheckout_ApartmentSuiteInput, Integer.valueOf(R.style.AdyenCheckout_ApartmentSuiteInput_Optional)), new AddressFieldSpec(true, R.style.AdyenCheckout_PostalCodeInput, Integer.valueOf(R.style.AdyenCheckout_PostalCodeInput_Optional)), new AddressFieldSpec(true, R.style.AdyenCheckout_CityInput, Integer.valueOf(R.style.AdyenCheckout_CityInput_Optional)), new AddressFieldSpec(true, R.style.AdyenCheckout_ProvinceTerritoryInput, Integer.valueOf(R.style.AdyenCheckout_ProvinceTerritoryInput_Optional)), new AddressFieldSpec(true, R.style.AdyenCheckout_DropdownTextInputLayout_CountryInput, null));

    private static final /* synthetic */ AddressSpecification[] $values() {
        return new AddressSpecification[]{BR, CA, GB, US, DEFAULT};
    }

    static {
        AddressSpecification[] addressSpecificationArr$values = $values();
        $VALUES = addressSpecificationArr$values;
        $ENTRIES = n.w(addressSpecificationArr$values);
        INSTANCE = new Companion(null);
    }

    private AddressSpecification(String str, int i11, AddressFieldSpec addressFieldSpec, AddressFieldSpec addressFieldSpec2, AddressFieldSpec addressFieldSpec3, AddressFieldSpec addressFieldSpec4, AddressFieldSpec addressFieldSpec5, AddressFieldSpec addressFieldSpec6, AddressFieldSpec addressFieldSpec7) {
        this.street = addressFieldSpec;
        this.houseNumber = addressFieldSpec2;
        this.apartmentSuite = addressFieldSpec3;
        this.postalCode = addressFieldSpec4;
        this.city = addressFieldSpec5;
        this.stateProvince = addressFieldSpec6;
        this.country = addressFieldSpec7;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static AddressSpecification valueOf(String str) {
        return (AddressSpecification) Enum.valueOf(AddressSpecification.class, str);
    }

    public static AddressSpecification[] values() {
        return (AddressSpecification[]) $VALUES.clone();
    }

    @NotNull
    /* JADX INFO: renamed from: getApartmentSuite$ui_core_release, reason: from getter */
    public final AddressFieldSpec getApartmentSuite() {
        return this.apartmentSuite;
    }

    @NotNull
    /* JADX INFO: renamed from: getCity$ui_core_release, reason: from getter */
    public final AddressFieldSpec getCity() {
        return this.city;
    }

    @NotNull
    /* JADX INFO: renamed from: getCountry$ui_core_release, reason: from getter */
    public final AddressFieldSpec getCountry() {
        return this.country;
    }

    @NotNull
    /* JADX INFO: renamed from: getHouseNumber$ui_core_release, reason: from getter */
    public final AddressFieldSpec getHouseNumber() {
        return this.houseNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: getPostalCode$ui_core_release, reason: from getter */
    public final AddressFieldSpec getPostalCode() {
        return this.postalCode;
    }

    @NotNull
    /* JADX INFO: renamed from: getStateProvince$ui_core_release, reason: from getter */
    public final AddressFieldSpec getStateProvince() {
        return this.stateProvince;
    }

    @NotNull
    /* JADX INFO: renamed from: getStreet$ui_core_release, reason: from getter */
    public final AddressFieldSpec getStreet() {
        return this.street;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/AddressSpecification$Companion;", "", "()V", "fromString", "Lcom/adyen/checkout/ui/core/internal/ui/AddressSpecification;", "countryCode", "", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAddressSpecification.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressSpecification.kt\ncom/adyen/checkout/ui/core/internal/ui/AddressSpecification$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n295#2,2:245\n*S KotlinDebug\n*F\n+ 1 AddressSpecification.kt\ncom/adyen/checkout/ui/core/internal/ui/AddressSpecification$Companion\n*L\n226#1:245,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AddressSpecification fromString(@Nullable String countryCode) {
            Object next;
            Iterator<E> it = AddressSpecification.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((AddressSpecification) next).name(), countryCode)) {
                    break;
                }
            }
            AddressSpecification addressSpecification = (AddressSpecification) next;
            return addressSpecification == null ? AddressSpecification.DEFAULT : addressSpecification;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0015\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0002\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/AddressSpecification$AddressFieldSpec;", "", "isRequired", "", "styleResId", "", "optionalStyleResId", "(ZILjava/lang/Integer;)V", "()Z", "getOptionalStyleResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStyleResId", "()I", "component1", "component2", "component3", "copy", "(ZILjava/lang/Integer;)Lcom/adyen/checkout/ui/core/internal/ui/AddressSpecification$AddressFieldSpec;", "equals", "other", "isOptional", "(Z)Ljava/lang/Integer;", "hashCode", "toString", "", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddressFieldSpec {
        private final boolean isRequired;

        @Nullable
        private final Integer optionalStyleResId;
        private final int styleResId;

        public AddressFieldSpec(boolean z11, int i11, @Nullable Integer num) {
            this.isRequired = z11;
            this.styleResId = i11;
            this.optionalStyleResId = num;
        }

        public static /* synthetic */ AddressFieldSpec copy$default(AddressFieldSpec addressFieldSpec, boolean z11, int i11, Integer num, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z11 = addressFieldSpec.isRequired;
            }
            if ((i12 & 2) != 0) {
                i11 = addressFieldSpec.styleResId;
            }
            if ((i12 & 4) != 0) {
                num = addressFieldSpec.optionalStyleResId;
            }
            return addressFieldSpec.copy(z11, i11, num);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getStyleResId() {
            return this.styleResId;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getOptionalStyleResId() {
            return this.optionalStyleResId;
        }

        @NotNull
        public final AddressFieldSpec copy(boolean isRequired, int styleResId, @Nullable Integer optionalStyleResId) {
            return new AddressFieldSpec(isRequired, styleResId, optionalStyleResId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddressFieldSpec)) {
                return false;
            }
            AddressFieldSpec addressFieldSpec = (AddressFieldSpec) other;
            return this.isRequired == addressFieldSpec.isRequired && this.styleResId == addressFieldSpec.styleResId && Intrinsics.areEqual(this.optionalStyleResId, addressFieldSpec.optionalStyleResId);
        }

        @Nullable
        public final Integer getOptionalStyleResId() {
            return this.optionalStyleResId;
        }

        @Nullable
        public final Integer getStyleResId(boolean isOptional) {
            return isOptional ? this.optionalStyleResId : Integer.valueOf(this.styleResId);
        }

        public int hashCode() {
            int iB = k.b(this.styleResId, Boolean.hashCode(this.isRequired) * 31, 31);
            Integer num = this.optionalStyleResId;
            return iB + (num == null ? 0 : num.hashCode());
        }

        public final boolean isRequired() {
            return this.isRequired;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isRequired;
            int i11 = this.styleResId;
            Integer num = this.optionalStyleResId;
            StringBuilder sb2 = new StringBuilder("AddressFieldSpec(isRequired=");
            sb2.append(z11);
            sb2.append(", styleResId=");
            sb2.append(i11);
            sb2.append(", optionalStyleResId=");
            return i.m(sb2, num, ")");
        }

        public final int getStyleResId() {
            return this.styleResId;
        }
    }
}
