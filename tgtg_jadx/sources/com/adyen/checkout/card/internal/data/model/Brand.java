package com.adyen.checkout.card.internal.data.model;

import a80.a;
import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import v0.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002/0Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\nHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001a\u0010\u0012¨\u00061"}, d2 = {"Lcom/adyen/checkout/card/internal/data/model/Brand;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", Brand.BRAND, "", Brand.ENABLE_LUHN_CHECK, "", Brand.SUPPORTED, Brand.CVC_POLICY, Brand.EXPIRY_DATE_POLICY, Brand.PAN_LENGTH, "", Brand.PAYMENT_METHOD_VARIANT, "localizedBrand", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getBrand", "()Ljava/lang/String;", "getCvcPolicy", "getEnableLuhnCheck", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getExpiryDatePolicy", "getLocalizedBrand", "getPanLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPaymentMethodVariant", "getSupported", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/card/internal/data/model/Brand;", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "FieldPolicy", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Brand extends ModelObject {

    @NotNull
    private static final String BRAND = "brand";

    @NotNull
    private static final String CVC_POLICY = "cvcPolicy";

    @NotNull
    private static final String ENABLE_LUHN_CHECK = "enableLuhnCheck";

    @NotNull
    private static final String EXPIRY_DATE_POLICY = "expiryDatePolicy";

    @NotNull
    private static final String LOCALE_BRAND = "localeBrand";

    @NotNull
    private static final String PAN_LENGTH = "panLength";

    @NotNull
    private static final String PAYMENT_METHOD_VARIANT = "paymentMethodVariant";

    @NotNull
    private static final String SUPPORTED = "supported";

    @Nullable
    private final String brand;

    @Nullable
    private final String cvcPolicy;

    @Nullable
    private final Boolean enableLuhnCheck;

    @Nullable
    private final String expiryDatePolicy;

    @Nullable
    private final String localizedBrand;

    @Nullable
    private final Integer panLength;

    @Nullable
    private final String paymentMethodVariant;

    @Nullable
    private final Boolean supported;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Brand> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<Brand> SERIALIZER = new ModelObject.Serializer<Brand>() { // from class: com.adyen.checkout.card.internal.data.model.Brand$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public Brand deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                return new Brand(JsonUtilsKt.getStringOrNull(jsonObject, "brand"), JsonUtilsKt.getBooleanOrNull(jsonObject, "enableLuhnCheck"), JsonUtilsKt.getBooleanOrNull(jsonObject, "supported"), JsonUtilsKt.getStringOrNull(jsonObject, "cvcPolicy"), JsonUtilsKt.getStringOrNull(jsonObject, "expiryDatePolicy"), JsonUtilsKt.getIntOrNull(jsonObject, "panLength"), JsonUtilsKt.getStringOrNull(jsonObject, "paymentMethodVariant"), JsonUtilsKt.getStringOrNull(jsonObject, "localeBrand"));
            } catch (JSONException e5) {
                w.j(Brand.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull Brand modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("brand", modelObject.getBrand());
                jSONObject.putOpt("enableLuhnCheck", modelObject.getEnableLuhnCheck());
                jSONObject.putOpt("supported", modelObject.getSupported());
                jSONObject.putOpt("cvcPolicy", modelObject.getCvcPolicy());
                jSONObject.putOpt("expiryDatePolicy", modelObject.getExpiryDatePolicy());
                jSONObject.putOpt("expiryDatePolicy", modelObject.getExpiryDatePolicy());
                jSONObject.putOpt("panLength", modelObject.getPanLength());
                jSONObject.putOpt("paymentMethodVariant", modelObject.getPaymentMethodVariant());
                jSONObject.putOpt("localeBrand", modelObject.getLocalizedBrand());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(Brand.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ Brand(String str, Boolean bool, Boolean bool2, String str2, String str3, Integer num, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : bool2, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : num, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? null : str5);
    }

    public static /* synthetic */ Brand copy$default(Brand brand, String str, Boolean bool, Boolean bool2, String str2, String str3, Integer num, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = brand.brand;
        }
        if ((i11 & 2) != 0) {
            bool = brand.enableLuhnCheck;
        }
        if ((i11 & 4) != 0) {
            bool2 = brand.supported;
        }
        if ((i11 & 8) != 0) {
            str2 = brand.cvcPolicy;
        }
        if ((i11 & 16) != 0) {
            str3 = brand.expiryDatePolicy;
        }
        if ((i11 & 32) != 0) {
            num = brand.panLength;
        }
        if ((i11 & 64) != 0) {
            str4 = brand.paymentMethodVariant;
        }
        if ((i11 & 128) != 0) {
            str5 = brand.localizedBrand;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        Integer num2 = num;
        return brand.copy(str, bool, bool2, str2, str8, num2, str6, str7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getEnableLuhnCheck() {
        return this.enableLuhnCheck;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getSupported() {
        return this.supported;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCvcPolicy() {
        return this.cvcPolicy;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExpiryDatePolicy() {
        return this.expiryDatePolicy;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getPanLength() {
        return this.panLength;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPaymentMethodVariant() {
        return this.paymentMethodVariant;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLocalizedBrand() {
        return this.localizedBrand;
    }

    @NotNull
    public final Brand copy(@Nullable String brand, @Nullable Boolean enableLuhnCheck, @Nullable Boolean supported, @Nullable String cvcPolicy, @Nullable String expiryDatePolicy, @Nullable Integer panLength, @Nullable String paymentMethodVariant, @Nullable String localizedBrand) {
        return new Brand(brand, enableLuhnCheck, supported, cvcPolicy, expiryDatePolicy, panLength, paymentMethodVariant, localizedBrand);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Brand)) {
            return false;
        }
        Brand brand = (Brand) other;
        return Intrinsics.areEqual(this.brand, brand.brand) && Intrinsics.areEqual(this.enableLuhnCheck, brand.enableLuhnCheck) && Intrinsics.areEqual(this.supported, brand.supported) && Intrinsics.areEqual(this.cvcPolicy, brand.cvcPolicy) && Intrinsics.areEqual(this.expiryDatePolicy, brand.expiryDatePolicy) && Intrinsics.areEqual(this.panLength, brand.panLength) && Intrinsics.areEqual(this.paymentMethodVariant, brand.paymentMethodVariant) && Intrinsics.areEqual(this.localizedBrand, brand.localizedBrand);
    }

    @Nullable
    public final String getBrand() {
        return this.brand;
    }

    @Nullable
    public final String getCvcPolicy() {
        return this.cvcPolicy;
    }

    @Nullable
    public final Boolean getEnableLuhnCheck() {
        return this.enableLuhnCheck;
    }

    @Nullable
    public final String getExpiryDatePolicy() {
        return this.expiryDatePolicy;
    }

    @Nullable
    public final String getLocalizedBrand() {
        return this.localizedBrand;
    }

    @Nullable
    public final Integer getPanLength() {
        return this.panLength;
    }

    @Nullable
    public final String getPaymentMethodVariant() {
        return this.paymentMethodVariant;
    }

    @Nullable
    public final Boolean getSupported() {
        return this.supported;
    }

    public int hashCode() {
        String str = this.brand;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.enableLuhnCheck;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.supported;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.cvcPolicy;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expiryDatePolicy;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.panLength;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.paymentMethodVariant;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.localizedBrand;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.brand;
        Boolean bool = this.enableLuhnCheck;
        Boolean bool2 = this.supported;
        String str2 = this.cvcPolicy;
        String str3 = this.expiryDatePolicy;
        Integer num = this.panLength;
        String str4 = this.paymentMethodVariant;
        String str5 = this.localizedBrand;
        StringBuilder sb2 = new StringBuilder("Brand(brand=");
        sb2.append(str);
        sb2.append(", enableLuhnCheck=");
        sb2.append(bool);
        sb2.append(", supported=");
        sb2.append(bool2);
        sb2.append(", cvcPolicy=");
        sb2.append(str2);
        sb2.append(", expiryDatePolicy=");
        sb2.append(str3);
        sb2.append(", panLength=");
        sb2.append(num);
        sb2.append(", paymentMethodVariant=");
        return f.o(sb2, str4, ", localizedBrand=", str5, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.brand);
        Boolean bool = this.enableLuhnCheck;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool);
        }
        Boolean bool2 = this.supported;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool2);
        }
        parcel.writeString(this.cvcPolicy);
        parcel.writeString(this.expiryDatePolicy);
        Integer num = this.panLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            i.w(parcel, 1, num);
        }
        parcel.writeString(this.paymentMethodVariant);
        parcel.writeString(this.localizedBrand);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/card/internal/data/model/Brand$FieldPolicy;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "isRequired", "", "REQUIRED", "OPTIONAL", "HIDDEN", "Companion", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FieldPolicy {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ FieldPolicy[] $VALUES;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @NotNull
        private final String value;
        public static final FieldPolicy REQUIRED = new FieldPolicy("REQUIRED", 0, "required");
        public static final FieldPolicy OPTIONAL = new FieldPolicy("OPTIONAL", 1, "optional");
        public static final FieldPolicy HIDDEN = new FieldPolicy("HIDDEN", 2, "hidden");

        private static final /* synthetic */ FieldPolicy[] $values() {
            return new FieldPolicy[]{REQUIRED, OPTIONAL, HIDDEN};
        }

        static {
            FieldPolicy[] fieldPolicyArr$values = $values();
            $VALUES = fieldPolicyArr$values;
            $ENTRIES = n.w(fieldPolicyArr$values);
            INSTANCE = new Companion(null);
        }

        private FieldPolicy(String str, int i11, String str2) {
            this.value = str2;
        }

        @NotNull
        public static a getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public static final FieldPolicy parse(@NotNull String str) {
            return INSTANCE.parse(str);
        }

        public static FieldPolicy valueOf(String str) {
            return (FieldPolicy) Enum.valueOf(FieldPolicy.class, str);
        }

        public static FieldPolicy[] values() {
            return (FieldPolicy[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public final boolean isRequired() {
            return this == REQUIRED;
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/card/internal/data/model/Brand$FieldPolicy$Companion;", "", "()V", "parse", "Lcom/adyen/checkout/card/internal/data/model/Brand$FieldPolicy;", "value", "", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final FieldPolicy parse(@NotNull String value) {
                value.getClass();
                FieldPolicy fieldPolicy = FieldPolicy.REQUIRED;
                if (Intrinsics.areEqual(value, fieldPolicy.getValue())) {
                    return fieldPolicy;
                }
                FieldPolicy fieldPolicy2 = FieldPolicy.OPTIONAL;
                if (Intrinsics.areEqual(value, fieldPolicy2.getValue())) {
                    return fieldPolicy2;
                }
                FieldPolicy fieldPolicy3 = FieldPolicy.HIDDEN;
                if (Intrinsics.areEqual(value, fieldPolicy3.getValue())) {
                    return fieldPolicy3;
                }
                i4.a.f(f.k("No CvcPolicy matches the value of: ", value));
                return null;
            }

            private Companion() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/card/internal/data/model/Brand$Companion;", "", "()V", "BRAND", "", "getBRAND$annotations", "CVC_POLICY", "ENABLE_LUHN_CHECK", "EXPIRY_DATE_POLICY", "LOCALE_BRAND", "PAN_LENGTH", "PAYMENT_METHOD_VARIANT", ModelUtils.SERIALIZER_FIELD_NAME, "Lcom/adyen/checkout/core/internal/data/model/ModelObject$Serializer;", "Lcom/adyen/checkout/card/internal/data/model/Brand;", "SUPPORTED", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private static /* synthetic */ void getBRAND$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Brand> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Brand createFromParcel(@NotNull Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            parcel.getClass();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            Integer numValueOf = null;
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new Brand(string, boolValueOf, boolValueOf2, string2, string3, numValueOf, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Brand[] newArray(int i11) {
            return new Brand[i11];
        }
    }

    public Brand() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public Brand(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5) {
        this.brand = str;
        this.enableLuhnCheck = bool;
        this.supported = bool2;
        this.cvcPolicy = str2;
        this.expiryDatePolicy = str3;
        this.panLength = num;
        this.paymentMethodVariant = str4;
        this.localizedBrand = str5;
    }
}
