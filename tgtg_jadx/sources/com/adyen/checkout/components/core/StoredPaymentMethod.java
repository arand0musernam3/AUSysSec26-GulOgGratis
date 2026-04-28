package com.adyen.checkout.components.core;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod;
import com.adyen.checkout.core.internal.data.model.JsonUtils;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import e0.f;
import j4.s;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0001LB§\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J«\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010A\u001a\u00020#2\b\u0010B\u001a\u0004\u0018\u00010CHÖ\u0003J\t\u0010D\u001a\u00020EHÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001J\u0019\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020EHÖ\u0001R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b\"\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010\u0015R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0013\"\u0004\b2\u0010\u0015¨\u0006M"}, d2 = {"Lcom/adyen/checkout/components/core/StoredPaymentMethod;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "type", "", StoredPaymentMethod.NAME, StoredPaymentMethod.BRAND, StoredPaymentMethod.EXPIRY_MONTH, StoredPaymentMethod.EXPIRY_YEAR, StoredPaymentMethod.HOLDER_NAME, "id", StoredPaymentMethod.LAST_FOUR, "shopperEmail", StoredPaymentMethod.SUPPORTED_SHOPPER_INTERACTIONS, "", StoredPaymentMethod.BANK_ACCOUNT_NUMBER, StoredPaymentMethod.CASH_TAG, "label", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankAccountNumber", "()Ljava/lang/String;", "setBankAccountNumber", "(Ljava/lang/String;)V", "getBrand", "setBrand", "getCashtag", "setCashtag", "getExpiryMonth", "setExpiryMonth", "getExpiryYear", "setExpiryYear", "getHolderName", "setHolderName", "getId", "setId", "isEcommerce", "", "()Z", "getLabel", "setLabel", "getLastFour", "setLastFour", "getName", "setName", "getShopperEmail", "setShopperEmail", "getSupportedShopperInteractions", "()Ljava/util/List;", "setSupportedShopperInteractions", "(Ljava/util/List;)V", "getType", "setType", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class StoredPaymentMethod extends ModelObject {

    @NotNull
    private static final String BANK_ACCOUNT_NUMBER = "bankAccountNumber";

    @NotNull
    private static final String BRAND = "brand";

    @NotNull
    private static final String CASH_TAG = "cashtag";

    @NotNull
    private static final String ECOMMERCE = "Ecommerce";

    @NotNull
    private static final String EXPIRY_MONTH = "expiryMonth";

    @NotNull
    private static final String EXPIRY_YEAR = "expiryYear";

    @NotNull
    private static final String HOLDER_NAME = "holderName";

    @NotNull
    private static final String ID = "id";

    @NotNull
    private static final String LABEL = "label";

    @NotNull
    private static final String LAST_FOUR = "lastFour";

    @NotNull
    private static final String NAME = "name";

    @NotNull
    private static final String SHOPPER_EMAIL = "shopperEmail";

    @NotNull
    private static final String SUPPORTED_SHOPPER_INTERACTIONS = "supportedShopperInteractions";

    @NotNull
    private static final String TYPE = "type";

    @Nullable
    private String bankAccountNumber;

    @Nullable
    private String brand;

    @Nullable
    private String cashtag;

    @Nullable
    private String expiryMonth;

    @Nullable
    private String expiryYear;

    @Nullable
    private String holderName;

    @Nullable
    private String id;

    @Nullable
    private String label;

    @Nullable
    private String lastFour;

    @Nullable
    private String name;

    @Nullable
    private String shopperEmail;

    @Nullable
    private List<String> supportedShopperInteractions;

    @Nullable
    private String type;

    @NotNull
    public static final Parcelable.Creator<StoredPaymentMethod> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<StoredPaymentMethod> SERIALIZER = new ModelObject.Serializer<StoredPaymentMethod>() { // from class: com.adyen.checkout.components.core.StoredPaymentMethod$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public StoredPaymentMethod deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new StoredPaymentMethod(JsonUtilsKt.getStringOrNull(jsonObject, "type"), JsonUtilsKt.getStringOrNull(jsonObject, "name"), JsonUtilsKt.getStringOrNull(jsonObject, "brand"), JsonUtilsKt.getStringOrNull(jsonObject, "expiryMonth"), JsonUtilsKt.getStringOrNull(jsonObject, "expiryYear"), JsonUtilsKt.getStringOrNull(jsonObject, "holderName"), JsonUtilsKt.getStringOrNull(jsonObject, "id"), JsonUtilsKt.getStringOrNull(jsonObject, "lastFour"), JsonUtilsKt.getStringOrNull(jsonObject, EContextPaymentMethod.SHOPPER_EMAIL), JsonUtils.parseOptStringList(jsonObject.optJSONArray("supportedShopperInteractions")), JsonUtilsKt.getStringOrNull(jsonObject, "bankAccountNumber"), JsonUtilsKt.getStringOrNull(jsonObject, "cashtag"), JsonUtilsKt.getStringOrNull(jsonObject, AnnotatedPrivateKey.LABEL));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull StoredPaymentMethod modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt("name", modelObject.getName());
                jSONObject.putOpt("brand", modelObject.getBrand());
                jSONObject.putOpt("expiryMonth", modelObject.getExpiryMonth());
                jSONObject.putOpt("expiryYear", modelObject.getExpiryYear());
                jSONObject.putOpt("holderName", modelObject.getHolderName());
                jSONObject.putOpt("id", modelObject.getId());
                jSONObject.putOpt("lastFour", modelObject.getLastFour());
                jSONObject.putOpt(EContextPaymentMethod.SHOPPER_EMAIL, modelObject.getShopperEmail());
                jSONObject.putOpt("supportedShopperInteractions", new JSONArray((Collection) modelObject.getSupportedShopperInteractions()));
                jSONObject.putOpt("bankAccountNumber", modelObject.getBankAccountNumber());
                jSONObject.putOpt("cashtag", modelObject.getCashtag());
                jSONObject.putOpt(AnnotatedPrivateKey.LABEL, modelObject.getLabel());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(StoredPaymentMethod.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ StoredPaymentMethod(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, String str11, String str12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : list, (i11 & 1024) != 0 ? null : str10, (i11 & NewHope.SENDB_BYTES) != 0 ? null : str11, (i11 & 4096) != 0 ? null : str12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoredPaymentMethod copy$default(StoredPaymentMethod storedPaymentMethod, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, String str11, String str12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = storedPaymentMethod.type;
        }
        return storedPaymentMethod.copy(str, (i11 & 2) != 0 ? storedPaymentMethod.name : str2, (i11 & 4) != 0 ? storedPaymentMethod.brand : str3, (i11 & 8) != 0 ? storedPaymentMethod.expiryMonth : str4, (i11 & 16) != 0 ? storedPaymentMethod.expiryYear : str5, (i11 & 32) != 0 ? storedPaymentMethod.holderName : str6, (i11 & 64) != 0 ? storedPaymentMethod.id : str7, (i11 & 128) != 0 ? storedPaymentMethod.lastFour : str8, (i11 & 256) != 0 ? storedPaymentMethod.shopperEmail : str9, (i11 & 512) != 0 ? storedPaymentMethod.supportedShopperInteractions : list, (i11 & 1024) != 0 ? storedPaymentMethod.bankAccountNumber : str10, (i11 & NewHope.SENDB_BYTES) != 0 ? storedPaymentMethod.cashtag : str11, (i11 & 4096) != 0 ? storedPaymentMethod.label : str12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final List<String> component10() {
        return this.supportedShopperInteractions;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCashtag() {
        return this.cashtag;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExpiryYear() {
        return this.expiryYear;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHolderName() {
        return this.holderName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getShopperEmail() {
        return this.shopperEmail;
    }

    @NotNull
    public final StoredPaymentMethod copy(@Nullable String type, @Nullable String name, @Nullable String brand, @Nullable String expiryMonth, @Nullable String expiryYear, @Nullable String holderName, @Nullable String id2, @Nullable String lastFour, @Nullable String shopperEmail, @Nullable List<String> supportedShopperInteractions, @Nullable String bankAccountNumber, @Nullable String cashtag, @Nullable String label) {
        return new StoredPaymentMethod(type, name, brand, expiryMonth, expiryYear, holderName, id2, lastFour, shopperEmail, supportedShopperInteractions, bankAccountNumber, cashtag, label);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoredPaymentMethod)) {
            return false;
        }
        StoredPaymentMethod storedPaymentMethod = (StoredPaymentMethod) other;
        return Intrinsics.areEqual(this.type, storedPaymentMethod.type) && Intrinsics.areEqual(this.name, storedPaymentMethod.name) && Intrinsics.areEqual(this.brand, storedPaymentMethod.brand) && Intrinsics.areEqual(this.expiryMonth, storedPaymentMethod.expiryMonth) && Intrinsics.areEqual(this.expiryYear, storedPaymentMethod.expiryYear) && Intrinsics.areEqual(this.holderName, storedPaymentMethod.holderName) && Intrinsics.areEqual(this.id, storedPaymentMethod.id) && Intrinsics.areEqual(this.lastFour, storedPaymentMethod.lastFour) && Intrinsics.areEqual(this.shopperEmail, storedPaymentMethod.shopperEmail) && Intrinsics.areEqual(this.supportedShopperInteractions, storedPaymentMethod.supportedShopperInteractions) && Intrinsics.areEqual(this.bankAccountNumber, storedPaymentMethod.bankAccountNumber) && Intrinsics.areEqual(this.cashtag, storedPaymentMethod.cashtag) && Intrinsics.areEqual(this.label, storedPaymentMethod.label);
    }

    @Nullable
    public final String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    @Nullable
    public final String getBrand() {
        return this.brand;
    }

    @Nullable
    public final String getCashtag() {
        return this.cashtag;
    }

    @Nullable
    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    @Nullable
    public final String getExpiryYear() {
        return this.expiryYear;
    }

    @Nullable
    public final String getHolderName() {
        return this.holderName;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final String getLastFour() {
        return this.lastFour;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getShopperEmail() {
        return this.shopperEmail;
    }

    @Nullable
    public final List<String> getSupportedShopperInteractions() {
        return this.supportedShopperInteractions;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.brand;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expiryMonth;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.expiryYear;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.holderName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.id;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.lastFour;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.shopperEmail;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<String> list = this.supportedShopperInteractions;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        String str10 = this.bankAccountNumber;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.cashtag;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.label;
        return iHashCode12 + (str12 != null ? str12.hashCode() : 0);
    }

    public final boolean isEcommerce() {
        List<String> list = this.supportedShopperInteractions;
        return list != null && list.contains(ECOMMERCE);
    }

    public final void setBankAccountNumber(@Nullable String str) {
        this.bankAccountNumber = str;
    }

    public final void setBrand(@Nullable String str) {
        this.brand = str;
    }

    public final void setCashtag(@Nullable String str) {
        this.cashtag = str;
    }

    public final void setExpiryMonth(@Nullable String str) {
        this.expiryMonth = str;
    }

    public final void setExpiryYear(@Nullable String str) {
        this.expiryYear = str;
    }

    public final void setHolderName(@Nullable String str) {
        this.holderName = str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setLabel(@Nullable String str) {
        this.label = str;
    }

    public final void setLastFour(@Nullable String str) {
        this.lastFour = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setShopperEmail(@Nullable String str) {
        this.shopperEmail = str;
    }

    public final void setSupportedShopperInteractions(@Nullable List<String> list) {
        this.supportedShopperInteractions = list;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.name;
        String str3 = this.brand;
        String str4 = this.expiryMonth;
        String str5 = this.expiryYear;
        String str6 = this.holderName;
        String str7 = this.id;
        String str8 = this.lastFour;
        String str9 = this.shopperEmail;
        List<String> list = this.supportedShopperInteractions;
        String str10 = this.bankAccountNumber;
        String str11 = this.cashtag;
        String str12 = this.label;
        StringBuilder sbT = f.t("StoredPaymentMethod(type=", str, ", name=", str2, ", brand=");
        s.A(sbT, str3, ", expiryMonth=", str4, ", expiryYear=");
        s.A(sbT, str5, ", holderName=", str6, ", id=");
        s.A(sbT, str7, ", lastFour=", str8, ", shopperEmail=");
        sbT.append(str9);
        sbT.append(", supportedShopperInteractions=");
        sbT.append(list);
        sbT.append(", bankAccountNumber=");
        s.A(sbT, str10, ", cashtag=", str11, ", label=");
        return k.p(sbT, str12, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.type);
        parcel.writeString(this.name);
        parcel.writeString(this.brand);
        parcel.writeString(this.expiryMonth);
        parcel.writeString(this.expiryYear);
        parcel.writeString(this.holderName);
        parcel.writeString(this.id);
        parcel.writeString(this.lastFour);
        parcel.writeString(this.shopperEmail);
        parcel.writeStringList(this.supportedShopperInteractions);
        parcel.writeString(this.bankAccountNumber);
        parcel.writeString(this.cashtag);
        parcel.writeString(this.label);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StoredPaymentMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StoredPaymentMethod createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new StoredPaymentMethod(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StoredPaymentMethod[] newArray(int i11) {
            return new StoredPaymentMethod[i11];
        }
    }

    public StoredPaymentMethod() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public StoredPaymentMethod(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable List<String> list, @Nullable String str10, @Nullable String str11, @Nullable String str12) {
        this.type = str;
        this.name = str2;
        this.brand = str3;
        this.expiryMonth = str4;
        this.expiryYear = str5;
        this.holderName = str6;
        this.id = str7;
        this.lastFour = str8;
        this.shopperEmail = str9;
        this.supportedShopperInteractions = list;
        this.bankAccountNumber = str10;
        this.cashtag = str11;
        this.label = str12;
    }
}
