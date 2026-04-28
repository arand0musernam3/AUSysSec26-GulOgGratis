package com.adyen.checkout.ui.core.internal.ui.model;

import com.adyen.checkout.components.core.internal.ui.model.FieldState;
import com.adyen.checkout.components.core.internal.ui.model.OutputData;
import com.appsflyer.AdRevenueScheme;
import e0.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0002\u0010\u0012J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u00ad\u0001\u0010-\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0004HÆ\u0001J\u0013\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\u0006\u00101\u001a\u00020\u0004J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00065"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData;", "Lcom/adyen/checkout/components/core/internal/ui/model/OutputData;", "postalCode", "Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "", "street", "stateOrProvince", "houseNumberOrName", "apartmentSuite", "city", AdRevenueScheme.COUNTRY, "isOptional", "", "countryOptions", "", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressListItem;", "stateOptions", "countryDisplayName", "(Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getApartmentSuite", "()Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "getCity", "getCountry", "getCountryDisplayName", "()Ljava/lang/String;", "getCountryOptions", "()Ljava/util/List;", "getHouseNumberOrName", "()Z", "isValid", "getPostalCode", "getStateOptions", "getStateOrProvince", "getStreet", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "formatted", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddressOutputData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressOutputData.kt\ncom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,62:1\n3829#2:63\n4344#2,2:64\n3829#2:66\n4344#2,2:67\n3829#2:69\n4344#2,2:70\n*S KotlinDebug\n*F\n+ 1 AddressOutputData.kt\ncom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData\n*L\n45#1:63\n45#1:64,2\n54#1:66\n54#1:67,2\n58#1:69\n58#1:70,2\n*E\n"})
public final /* data */ class AddressOutputData implements OutputData {

    @NotNull
    private final FieldState<String> apartmentSuite;

    @NotNull
    private final FieldState<String> city;

    @NotNull
    private final FieldState<String> country;

    @NotNull
    private final String countryDisplayName;

    @NotNull
    private final List<AddressListItem> countryOptions;

    @NotNull
    private final FieldState<String> houseNumberOrName;
    private final boolean isOptional;

    @NotNull
    private final FieldState<String> postalCode;

    @NotNull
    private final List<AddressListItem> stateOptions;

    @NotNull
    private final FieldState<String> stateOrProvince;

    @NotNull
    private final FieldState<String> street;

    public AddressOutputData(@NotNull FieldState<String> fieldState, @NotNull FieldState<String> fieldState2, @NotNull FieldState<String> fieldState3, @NotNull FieldState<String> fieldState4, @NotNull FieldState<String> fieldState5, @NotNull FieldState<String> fieldState6, @NotNull FieldState<String> fieldState7, boolean z11, @NotNull List<AddressListItem> list, @NotNull List<AddressListItem> list2, @NotNull String str) {
        fieldState.getClass();
        fieldState2.getClass();
        fieldState3.getClass();
        fieldState4.getClass();
        fieldState5.getClass();
        fieldState6.getClass();
        fieldState7.getClass();
        list.getClass();
        list2.getClass();
        str.getClass();
        this.postalCode = fieldState;
        this.street = fieldState2;
        this.stateOrProvince = fieldState3;
        this.houseNumberOrName = fieldState4;
        this.apartmentSuite = fieldState5;
        this.city = fieldState6;
        this.country = fieldState7;
        this.isOptional = z11;
        this.countryOptions = list;
        this.stateOptions = list2;
        this.countryDisplayName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressOutputData copy$default(AddressOutputData addressOutputData, FieldState fieldState, FieldState fieldState2, FieldState fieldState3, FieldState fieldState4, FieldState fieldState5, FieldState fieldState6, FieldState fieldState7, boolean z11, List list, List list2, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fieldState = addressOutputData.postalCode;
        }
        if ((i11 & 2) != 0) {
            fieldState2 = addressOutputData.street;
        }
        if ((i11 & 4) != 0) {
            fieldState3 = addressOutputData.stateOrProvince;
        }
        if ((i11 & 8) != 0) {
            fieldState4 = addressOutputData.houseNumberOrName;
        }
        if ((i11 & 16) != 0) {
            fieldState5 = addressOutputData.apartmentSuite;
        }
        if ((i11 & 32) != 0) {
            fieldState6 = addressOutputData.city;
        }
        if ((i11 & 64) != 0) {
            fieldState7 = addressOutputData.country;
        }
        if ((i11 & 128) != 0) {
            z11 = addressOutputData.isOptional;
        }
        if ((i11 & 256) != 0) {
            list = addressOutputData.countryOptions;
        }
        if ((i11 & 512) != 0) {
            list2 = addressOutputData.stateOptions;
        }
        if ((i11 & 1024) != 0) {
            str = addressOutputData.countryDisplayName;
        }
        List list3 = list2;
        String str2 = str;
        boolean z12 = z11;
        List list4 = list;
        FieldState fieldState8 = fieldState6;
        FieldState fieldState9 = fieldState7;
        FieldState fieldState10 = fieldState5;
        FieldState fieldState11 = fieldState3;
        return addressOutputData.copy(fieldState, fieldState2, fieldState11, fieldState4, fieldState10, fieldState8, fieldState9, z12, list4, list3, str2);
    }

    @NotNull
    public final FieldState<String> component1() {
        return this.postalCode;
    }

    @NotNull
    public final List<AddressListItem> component10() {
        return this.stateOptions;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCountryDisplayName() {
        return this.countryDisplayName;
    }

    @NotNull
    public final FieldState<String> component2() {
        return this.street;
    }

    @NotNull
    public final FieldState<String> component3() {
        return this.stateOrProvince;
    }

    @NotNull
    public final FieldState<String> component4() {
        return this.houseNumberOrName;
    }

    @NotNull
    public final FieldState<String> component5() {
        return this.apartmentSuite;
    }

    @NotNull
    public final FieldState<String> component6() {
        return this.city;
    }

    @NotNull
    public final FieldState<String> component7() {
        return this.country;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsOptional() {
        return this.isOptional;
    }

    @NotNull
    public final List<AddressListItem> component9() {
        return this.countryOptions;
    }

    @NotNull
    public final AddressOutputData copy(@NotNull FieldState<String> postalCode, @NotNull FieldState<String> street, @NotNull FieldState<String> stateOrProvince, @NotNull FieldState<String> houseNumberOrName, @NotNull FieldState<String> apartmentSuite, @NotNull FieldState<String> city, @NotNull FieldState<String> country, boolean isOptional, @NotNull List<AddressListItem> countryOptions, @NotNull List<AddressListItem> stateOptions, @NotNull String countryDisplayName) {
        postalCode.getClass();
        street.getClass();
        stateOrProvince.getClass();
        houseNumberOrName.getClass();
        apartmentSuite.getClass();
        city.getClass();
        country.getClass();
        countryOptions.getClass();
        stateOptions.getClass();
        countryDisplayName.getClass();
        return new AddressOutputData(postalCode, street, stateOrProvince, houseNumberOrName, apartmentSuite, city, country, isOptional, countryOptions, stateOptions, countryDisplayName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressOutputData)) {
            return false;
        }
        AddressOutputData addressOutputData = (AddressOutputData) other;
        return Intrinsics.areEqual(this.postalCode, addressOutputData.postalCode) && Intrinsics.areEqual(this.street, addressOutputData.street) && Intrinsics.areEqual(this.stateOrProvince, addressOutputData.stateOrProvince) && Intrinsics.areEqual(this.houseNumberOrName, addressOutputData.houseNumberOrName) && Intrinsics.areEqual(this.apartmentSuite, addressOutputData.apartmentSuite) && Intrinsics.areEqual(this.city, addressOutputData.city) && Intrinsics.areEqual(this.country, addressOutputData.country) && this.isOptional == addressOutputData.isOptional && Intrinsics.areEqual(this.countryOptions, addressOutputData.countryOptions) && Intrinsics.areEqual(this.stateOptions, addressOutputData.stateOptions) && Intrinsics.areEqual(this.countryDisplayName, addressOutputData.countryDisplayName);
    }

    @NotNull
    public final String formatted() {
        CharSequence[] charSequenceArr = {this.street.getValue(), this.houseNumberOrName.getValue(), this.apartmentSuite.getValue()};
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 3; i11++) {
            CharSequence charSequence = charSequenceArr[i11];
            if (!StringsKt.H(charSequence)) {
                arrayList.add(charSequence);
            }
        }
        String strU = CollectionsKt.U(arrayList, " ", null, null, null, 62);
        CharSequence[] charSequenceArr2 = {this.postalCode.getValue(), this.city.getValue(), this.stateOrProvince.getValue(), this.countryDisplayName};
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < 4; i12++) {
            CharSequence charSequence2 = charSequenceArr2[i12];
            if (!StringsKt.H(charSequence2)) {
                arrayList2.add(charSequence2);
            }
        }
        String[] strArr = {strU, CollectionsKt.U(arrayList2, ", ", null, null, null, 62)};
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < 2; i13++) {
            String str = strArr[i13];
            if (!StringsKt.H(str)) {
                arrayList3.add(str);
            }
        }
        return CollectionsKt.U(arrayList3, "\n", null, null, null, 62);
    }

    @NotNull
    public final FieldState<String> getApartmentSuite() {
        return this.apartmentSuite;
    }

    @NotNull
    public final FieldState<String> getCity() {
        return this.city;
    }

    @NotNull
    public final FieldState<String> getCountry() {
        return this.country;
    }

    @NotNull
    public final String getCountryDisplayName() {
        return this.countryDisplayName;
    }

    @NotNull
    public final List<AddressListItem> getCountryOptions() {
        return this.countryOptions;
    }

    @NotNull
    public final FieldState<String> getHouseNumberOrName() {
        return this.houseNumberOrName;
    }

    @NotNull
    public final FieldState<String> getPostalCode() {
        return this.postalCode;
    }

    @NotNull
    public final List<AddressListItem> getStateOptions() {
        return this.stateOptions;
    }

    @NotNull
    public final FieldState<String> getStateOrProvince() {
        return this.stateOrProvince;
    }

    @NotNull
    public final FieldState<String> getStreet() {
        return this.street;
    }

    public int hashCode() {
        return this.countryDisplayName.hashCode() + f.c(this.stateOptions, f.c(this.countryOptions, k.e((this.country.hashCode() + ((this.city.hashCode() + ((this.apartmentSuite.hashCode() + ((this.houseNumberOrName.hashCode() + ((this.stateOrProvince.hashCode() + ((this.street.hashCode() + (this.postalCode.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.isOptional), 31), 31);
    }

    public final boolean isOptional() {
        return this.isOptional;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.OutputData
    /* JADX INFO: renamed from: isValid */
    public boolean getIsValid() {
        return this.postalCode.getValidation().isValid() && this.street.getValidation().isValid() && this.stateOrProvince.getValidation().isValid() && this.houseNumberOrName.getValidation().isValid() && this.apartmentSuite.getValidation().isValid() && this.city.getValidation().isValid() && this.country.getValidation().isValid();
    }

    @NotNull
    public String toString() {
        FieldState<String> fieldState = this.postalCode;
        FieldState<String> fieldState2 = this.street;
        FieldState<String> fieldState3 = this.stateOrProvince;
        FieldState<String> fieldState4 = this.houseNumberOrName;
        FieldState<String> fieldState5 = this.apartmentSuite;
        FieldState<String> fieldState6 = this.city;
        FieldState<String> fieldState7 = this.country;
        boolean z11 = this.isOptional;
        List<AddressListItem> list = this.countryOptions;
        List<AddressListItem> list2 = this.stateOptions;
        String str = this.countryDisplayName;
        StringBuilder sb2 = new StringBuilder("AddressOutputData(postalCode=");
        sb2.append(fieldState);
        sb2.append(", street=");
        sb2.append(fieldState2);
        sb2.append(", stateOrProvince=");
        sb2.append(fieldState3);
        sb2.append(", houseNumberOrName=");
        sb2.append(fieldState4);
        sb2.append(", apartmentSuite=");
        sb2.append(fieldState5);
        sb2.append(", city=");
        sb2.append(fieldState6);
        sb2.append(", country=");
        sb2.append(fieldState7);
        sb2.append(", isOptional=");
        sb2.append(z11);
        sb2.append(", countryOptions=");
        sb2.append(list);
        sb2.append(", stateOptions=");
        sb2.append(list2);
        sb2.append(", countryDisplayName=");
        return k.p(sb2, str, ")");
    }
}
