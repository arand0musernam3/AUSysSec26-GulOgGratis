package com.adyen.checkout.ui.core.internal.ui.model;

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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressParams;", "", "()V", "FullAddress", "Lookup", "None", "PostalCode", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressParams$FullAddress;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressParams$Lookup;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressParams$None;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressParams$PostalCode;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AddressParams {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressParams$Lookup;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressParams;", "()V", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Lookup extends AddressParams {
        public Lookup() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressParams$None;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressParams;", "()V", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class None extends AddressParams {

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressParams$PostalCode;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressParams;", "addressFieldPolicy", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressFieldPolicy;", "(Lcom/adyen/checkout/ui/core/internal/ui/model/AddressFieldPolicy;)V", "getAddressFieldPolicy", "()Lcom/adyen/checkout/ui/core/internal/ui/model/AddressFieldPolicy;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PostalCode extends AddressParams {

        @NotNull
        private final AddressFieldPolicy addressFieldPolicy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PostalCode(@NotNull AddressFieldPolicy addressFieldPolicy) {
            super(null);
            addressFieldPolicy.getClass();
            this.addressFieldPolicy = addressFieldPolicy;
        }

        public static /* synthetic */ PostalCode copy$default(PostalCode postalCode, AddressFieldPolicy addressFieldPolicy, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                addressFieldPolicy = postalCode.addressFieldPolicy;
            }
            return postalCode.copy(addressFieldPolicy);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AddressFieldPolicy getAddressFieldPolicy() {
            return this.addressFieldPolicy;
        }

        @NotNull
        public final PostalCode copy(@NotNull AddressFieldPolicy addressFieldPolicy) {
            addressFieldPolicy.getClass();
            return new PostalCode(addressFieldPolicy);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PostalCode) && Intrinsics.areEqual(this.addressFieldPolicy, ((PostalCode) other).addressFieldPolicy);
        }

        @NotNull
        public final AddressFieldPolicy getAddressFieldPolicy() {
            return this.addressFieldPolicy;
        }

        public int hashCode() {
            return this.addressFieldPolicy.hashCode();
        }

        @NotNull
        public String toString() {
            return "PostalCode(addressFieldPolicy=" + this.addressFieldPolicy + ")";
        }
    }

    public /* synthetic */ AddressParams(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AddressParams() {
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressParams$FullAddress;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressParams;", "defaultCountryCode", "", "supportedCountryCodes", "", "addressFieldPolicy", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressFieldPolicy;", "(Ljava/lang/String;Ljava/util/List;Lcom/adyen/checkout/ui/core/internal/ui/model/AddressFieldPolicy;)V", "getAddressFieldPolicy", "()Lcom/adyen/checkout/ui/core/internal/ui/model/AddressFieldPolicy;", "getDefaultCountryCode", "()Ljava/lang/String;", "getSupportedCountryCodes", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FullAddress extends AddressParams {

        @NotNull
        private final AddressFieldPolicy addressFieldPolicy;

        @Nullable
        private final String defaultCountryCode;

        @NotNull
        private final List<String> supportedCountryCodes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FullAddress(@Nullable String str, @NotNull List<String> list, @NotNull AddressFieldPolicy addressFieldPolicy) {
            super(null);
            list.getClass();
            addressFieldPolicy.getClass();
            this.defaultCountryCode = str;
            this.supportedCountryCodes = list;
            this.addressFieldPolicy = addressFieldPolicy;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FullAddress copy$default(FullAddress fullAddress, String str, List list, AddressFieldPolicy addressFieldPolicy, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = fullAddress.defaultCountryCode;
            }
            if ((i11 & 2) != 0) {
                list = fullAddress.supportedCountryCodes;
            }
            if ((i11 & 4) != 0) {
                addressFieldPolicy = fullAddress.addressFieldPolicy;
            }
            return fullAddress.copy(str, list, addressFieldPolicy);
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
        public final AddressFieldPolicy getAddressFieldPolicy() {
            return this.addressFieldPolicy;
        }

        @NotNull
        public final FullAddress copy(@Nullable String defaultCountryCode, @NotNull List<String> supportedCountryCodes, @NotNull AddressFieldPolicy addressFieldPolicy) {
            supportedCountryCodes.getClass();
            addressFieldPolicy.getClass();
            return new FullAddress(defaultCountryCode, supportedCountryCodes, addressFieldPolicy);
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
        public final AddressFieldPolicy getAddressFieldPolicy() {
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

        public FullAddress(String str, List list, AddressFieldPolicy addressFieldPolicy, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? n0.f26529a : list, addressFieldPolicy);
        }
    }
}
