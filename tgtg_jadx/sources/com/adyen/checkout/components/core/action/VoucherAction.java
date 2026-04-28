package com.adyen.checkout.components.core.action;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.paymentmethod.IssuerListPaymentMethod;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import com.braze.Constants;
import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u0001_BÝ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003Já\u0001\u0010Q\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010R\u001a\u00020SHÖ\u0001J\u0013\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010WHÖ\u0003J\t\u0010X\u001a\u00020SHÖ\u0001J\t\u0010Y\u001a\u00020\u0003HÖ\u0001J\u0019\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020SHÖ\u0001R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010$\"\u0004\b8\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010$\"\u0004\b:\u0010&R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0018\"\u0004\b<\u0010\u001aR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0018\"\u0004\b>\u0010\u001a¨\u0006`"}, d2 = {"Lcom/adyen/checkout/components/core/action/VoucherAction;", "Lcom/adyen/checkout/components/core/action/Action;", "type", "", "paymentData", Action.PAYMENT_METHOD_TYPE, VoucherAction.ENTITY, VoucherAction.SURCHARGE, "Lcom/adyen/checkout/components/core/Amount;", VoucherAction.INITIAL_AMOUNT, VoucherAction.TOTAL_AMOUNT, "issuer", VoucherAction.EXPIRES_AT, VoucherAction.REFERENCE, VoucherAction.COLLECTION_INSTITUTION_NUMBER, VoucherAction.MASKED_TELEPHONE_NUMBER, VoucherAction.ALTERNATIVE_REFERENCE, VoucherAction.MERCHANT_NAME, VoucherAction.MERCHANT_REFERENCE, "url", VoucherAction.DOWNLOAD_URL, VoucherAction.INSTRUCTIONS_URL, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/Amount;Lcom/adyen/checkout/components/core/Amount;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlternativeReference", "()Ljava/lang/String;", "setAlternativeReference", "(Ljava/lang/String;)V", "getCollectionInstitutionNumber", "setCollectionInstitutionNumber", "getDownloadUrl", "setDownloadUrl", "getEntity", "setEntity", "getExpiresAt", "setExpiresAt", "getInitialAmount", "()Lcom/adyen/checkout/components/core/Amount;", "setInitialAmount", "(Lcom/adyen/checkout/components/core/Amount;)V", "getInstructionsUrl", "setInstructionsUrl", "getIssuer", "setIssuer", "getMaskedTelephoneNumber", "setMaskedTelephoneNumber", "getMerchantName", "setMerchantName", "getMerchantReference", "setMerchantReference", "getPaymentData", "setPaymentData", "getPaymentMethodType", "setPaymentMethodType", "getReference", "setReference", "getSurcharge", "setSurcharge", "getTotalAmount", "setTotalAmount", "getType", "setType", "getUrl", "setUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VoucherAction extends Action {

    @NotNull
    public static final String ACTION_TYPE = "voucher";

    @NotNull
    private static final String ALTERNATIVE_REFERENCE = "alternativeReference";

    @NotNull
    private static final String COLLECTION_INSTITUTION_NUMBER = "collectionInstitutionNumber";

    @NotNull
    private static final String DOWNLOAD_URL = "downloadUrl";

    @NotNull
    private static final String ENTITY = "entity";

    @NotNull
    private static final String EXPIRES_AT = "expiresAt";

    @NotNull
    private static final String INITIAL_AMOUNT = "initialAmount";

    @NotNull
    private static final String INSTRUCTIONS_URL = "instructionsUrl";

    @NotNull
    private static final String ISSUER = "issuer";

    @NotNull
    private static final String MASKED_TELEPHONE_NUMBER = "maskedTelephoneNumber";

    @NotNull
    private static final String MERCHANT_NAME = "merchantName";

    @NotNull
    private static final String MERCHANT_REFERENCE = "merchantReference";

    @NotNull
    private static final String REFERENCE = "reference";

    @NotNull
    private static final String SURCHARGE = "surcharge";

    @NotNull
    private static final String TOTAL_AMOUNT = "totalAmount";

    @NotNull
    private static final String URL = "url";

    @Nullable
    private String alternativeReference;

    @Nullable
    private String collectionInstitutionNumber;

    @Nullable
    private String downloadUrl;

    @Nullable
    private String entity;

    @Nullable
    private String expiresAt;

    @Nullable
    private Amount initialAmount;

    @Nullable
    private String instructionsUrl;

    @Nullable
    private String issuer;

    @Nullable
    private String maskedTelephoneNumber;

    @Nullable
    private String merchantName;

    @Nullable
    private String merchantReference;

    @Nullable
    private String paymentData;

    @Nullable
    private String paymentMethodType;

    @Nullable
    private String reference;

    @Nullable
    private Amount surcharge;

    @Nullable
    private Amount totalAmount;

    @Nullable
    private String type;

    @Nullable
    private String url;

    @NotNull
    public static final Parcelable.Creator<VoucherAction> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<VoucherAction> SERIALIZER = new ModelObject.Serializer<VoucherAction>() { // from class: com.adyen.checkout.components.core.action.VoucherAction$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public VoucherAction deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            String stringOrNull = JsonUtilsKt.getStringOrNull(jsonObject, "type");
            String stringOrNull2 = JsonUtilsKt.getStringOrNull(jsonObject, "paymentData");
            String stringOrNull3 = JsonUtilsKt.getStringOrNull(jsonObject, Action.PAYMENT_METHOD_TYPE);
            String stringOrNull4 = JsonUtilsKt.getStringOrNull(jsonObject, "entity");
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("surcharge");
            ModelObject.Serializer<Amount> serializer = Amount.SERIALIZER;
            return new VoucherAction(stringOrNull, stringOrNull2, stringOrNull3, stringOrNull4, (Amount) ModelUtils.deserializeOpt(jSONObjectOptJSONObject, serializer), (Amount) ModelUtils.deserializeOpt(jsonObject.optJSONObject("initialAmount"), serializer), (Amount) ModelUtils.deserializeOpt(jsonObject.optJSONObject("totalAmount"), serializer), JsonUtilsKt.getStringOrNull(jsonObject, IssuerListPaymentMethod.ISSUER), JsonUtilsKt.getStringOrNull(jsonObject, "expiresAt"), JsonUtilsKt.getStringOrNull(jsonObject, "reference"), JsonUtilsKt.getStringOrNull(jsonObject, "collectionInstitutionNumber"), JsonUtilsKt.getStringOrNull(jsonObject, "maskedTelephoneNumber"), JsonUtilsKt.getStringOrNull(jsonObject, "alternativeReference"), JsonUtilsKt.getStringOrNull(jsonObject, "merchantName"), JsonUtilsKt.getStringOrNull(jsonObject, "merchantReference"), JsonUtilsKt.getStringOrNull(jsonObject, Constants.BRAZE_WEBVIEW_URL_EXTRA), JsonUtilsKt.getStringOrNull(jsonObject, "downloadUrl"), JsonUtilsKt.getStringOrNull(jsonObject, "instructionsUrl"));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull VoucherAction modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt("paymentData", modelObject.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, modelObject.getPaymentMethodType());
                jSONObject.putOpt("entity", modelObject.getEntity());
                Amount surcharge = modelObject.getSurcharge();
                ModelObject.Serializer<Amount> serializer = Amount.SERIALIZER;
                jSONObject.putOpt("surcharge", ModelUtils.serializeOpt(surcharge, serializer));
                jSONObject.putOpt("initialAmount", ModelUtils.serializeOpt(modelObject.getInitialAmount(), serializer));
                jSONObject.putOpt("totalAmount", ModelUtils.serializeOpt(modelObject.getTotalAmount(), serializer));
                jSONObject.putOpt(IssuerListPaymentMethod.ISSUER, modelObject.getIssuer());
                jSONObject.putOpt("expiresAt", modelObject.getExpiresAt());
                jSONObject.putOpt("reference", modelObject.getReference());
                jSONObject.putOpt("collectionInstitutionNumber", modelObject.getCollectionInstitutionNumber());
                jSONObject.putOpt("maskedTelephoneNumber", modelObject.getMaskedTelephoneNumber());
                jSONObject.putOpt("alternativeReference", modelObject.getAlternativeReference());
                jSONObject.putOpt("merchantName", modelObject.getMerchantName());
                jSONObject.putOpt("merchantReference", modelObject.getMerchantReference());
                jSONObject.putOpt(Constants.BRAZE_WEBVIEW_URL_EXTRA, modelObject.getUrl());
                jSONObject.putOpt("downloadUrl", modelObject.getDownloadUrl());
                jSONObject.putOpt("instructionsUrl", modelObject.getInstructionsUrl());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(VoucherAction.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ VoucherAction(String str, String str2, String str3, String str4, Amount amount, Amount amount2, Amount amount3, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : amount, (i11 & 32) != 0 ? null : amount2, (i11 & 64) != 0 ? null : amount3, (i11 & 128) != 0 ? null : str5, (i11 & 256) != 0 ? null : str6, (i11 & 512) != 0 ? null : str7, (i11 & 1024) != 0 ? null : str8, (i11 & NewHope.SENDB_BYTES) != 0 ? null : str9, (i11 & 4096) != 0 ? null : str10, (i11 & 8192) != 0 ? null : str11, (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? null : str12, (i11 & 32768) != 0 ? null : str13, (i11 & 65536) != 0 ? null : str14, (i11 & 131072) != 0 ? null : str15);
    }

    public static /* synthetic */ VoucherAction copy$default(VoucherAction voucherAction, String str, String str2, String str3, String str4, Amount amount, Amount amount2, Amount amount3, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i11, Object obj) {
        String str16;
        String str17;
        String str18 = (i11 & 1) != 0 ? voucherAction.type : str;
        String str19 = (i11 & 2) != 0 ? voucherAction.paymentData : str2;
        String str20 = (i11 & 4) != 0 ? voucherAction.paymentMethodType : str3;
        String str21 = (i11 & 8) != 0 ? voucherAction.entity : str4;
        Amount amount4 = (i11 & 16) != 0 ? voucherAction.surcharge : amount;
        Amount amount5 = (i11 & 32) != 0 ? voucherAction.initialAmount : amount2;
        Amount amount6 = (i11 & 64) != 0 ? voucherAction.totalAmount : amount3;
        String str22 = (i11 & 128) != 0 ? voucherAction.issuer : str5;
        String str23 = (i11 & 256) != 0 ? voucherAction.expiresAt : str6;
        String str24 = (i11 & 512) != 0 ? voucherAction.reference : str7;
        String str25 = (i11 & 1024) != 0 ? voucherAction.collectionInstitutionNumber : str8;
        String str26 = (i11 & NewHope.SENDB_BYTES) != 0 ? voucherAction.maskedTelephoneNumber : str9;
        String str27 = (i11 & 4096) != 0 ? voucherAction.alternativeReference : str10;
        String str28 = (i11 & 8192) != 0 ? voucherAction.merchantName : str11;
        String str29 = str18;
        String str30 = (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? voucherAction.merchantReference : str12;
        String str31 = (i11 & 32768) != 0 ? voucherAction.url : str13;
        String str32 = (i11 & 65536) != 0 ? voucherAction.downloadUrl : str14;
        if ((i11 & 131072) != 0) {
            str17 = str32;
            str16 = voucherAction.instructionsUrl;
        } else {
            str16 = str15;
            str17 = str32;
        }
        return voucherAction.copy(str29, str19, str20, str21, amount4, amount5, amount6, str22, str23, str24, str25, str26, str27, str28, str30, str31, str17, str16);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCollectionInstitutionNumber() {
        return this.collectionInstitutionNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getMaskedTelephoneNumber() {
        return this.maskedTelephoneNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAlternativeReference() {
        return this.alternativeReference;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getMerchantReference() {
        return this.merchantReference;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getInstructionsUrl() {
        return this.instructionsUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentData() {
        return this.paymentData;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEntity() {
        return this.entity;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Amount getSurcharge() {
        return this.surcharge;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Amount getInitialAmount() {
        return this.initialAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Amount getTotalAmount() {
        return this.totalAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getExpiresAt() {
        return this.expiresAt;
    }

    @NotNull
    public final VoucherAction copy(@Nullable String type, @Nullable String paymentData, @Nullable String paymentMethodType, @Nullable String entity, @Nullable Amount surcharge, @Nullable Amount initialAmount, @Nullable Amount totalAmount, @Nullable String issuer, @Nullable String expiresAt, @Nullable String reference, @Nullable String collectionInstitutionNumber, @Nullable String maskedTelephoneNumber, @Nullable String alternativeReference, @Nullable String merchantName, @Nullable String merchantReference, @Nullable String url, @Nullable String downloadUrl, @Nullable String instructionsUrl) {
        return new VoucherAction(type, paymentData, paymentMethodType, entity, surcharge, initialAmount, totalAmount, issuer, expiresAt, reference, collectionInstitutionNumber, maskedTelephoneNumber, alternativeReference, merchantName, merchantReference, url, downloadUrl, instructionsUrl);
    }

    @Override // com.adyen.checkout.core.internal.data.model.ModelObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoucherAction)) {
            return false;
        }
        VoucherAction voucherAction = (VoucherAction) other;
        return Intrinsics.areEqual(this.type, voucherAction.type) && Intrinsics.areEqual(this.paymentData, voucherAction.paymentData) && Intrinsics.areEqual(this.paymentMethodType, voucherAction.paymentMethodType) && Intrinsics.areEqual(this.entity, voucherAction.entity) && Intrinsics.areEqual(this.surcharge, voucherAction.surcharge) && Intrinsics.areEqual(this.initialAmount, voucherAction.initialAmount) && Intrinsics.areEqual(this.totalAmount, voucherAction.totalAmount) && Intrinsics.areEqual(this.issuer, voucherAction.issuer) && Intrinsics.areEqual(this.expiresAt, voucherAction.expiresAt) && Intrinsics.areEqual(this.reference, voucherAction.reference) && Intrinsics.areEqual(this.collectionInstitutionNumber, voucherAction.collectionInstitutionNumber) && Intrinsics.areEqual(this.maskedTelephoneNumber, voucherAction.maskedTelephoneNumber) && Intrinsics.areEqual(this.alternativeReference, voucherAction.alternativeReference) && Intrinsics.areEqual(this.merchantName, voucherAction.merchantName) && Intrinsics.areEqual(this.merchantReference, voucherAction.merchantReference) && Intrinsics.areEqual(this.url, voucherAction.url) && Intrinsics.areEqual(this.downloadUrl, voucherAction.downloadUrl) && Intrinsics.areEqual(this.instructionsUrl, voucherAction.instructionsUrl);
    }

    @Nullable
    public final String getAlternativeReference() {
        return this.alternativeReference;
    }

    @Nullable
    public final String getCollectionInstitutionNumber() {
        return this.collectionInstitutionNumber;
    }

    @Nullable
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    @Nullable
    public final String getEntity() {
        return this.entity;
    }

    @Nullable
    public final String getExpiresAt() {
        return this.expiresAt;
    }

    @Nullable
    public final Amount getInitialAmount() {
        return this.initialAmount;
    }

    @Nullable
    public final String getInstructionsUrl() {
        return this.instructionsUrl;
    }

    @Nullable
    public final String getIssuer() {
        return this.issuer;
    }

    @Nullable
    public final String getMaskedTelephoneNumber() {
        return this.maskedTelephoneNumber;
    }

    @Nullable
    public final String getMerchantName() {
        return this.merchantName;
    }

    @Nullable
    public final String getMerchantReference() {
        return this.merchantReference;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    @Nullable
    public String getPaymentData() {
        return this.paymentData;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    @Nullable
    public String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    @Nullable
    public final String getReference() {
        return this.reference;
    }

    @Nullable
    public final Amount getSurcharge() {
        return this.surcharge;
    }

    @Nullable
    public final Amount getTotalAmount() {
        return this.totalAmount;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    @Nullable
    public String getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentData;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentMethodType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.entity;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Amount amount = this.surcharge;
        int iHashCode5 = (iHashCode4 + (amount == null ? 0 : amount.hashCode())) * 31;
        Amount amount2 = this.initialAmount;
        int iHashCode6 = (iHashCode5 + (amount2 == null ? 0 : amount2.hashCode())) * 31;
        Amount amount3 = this.totalAmount;
        int iHashCode7 = (iHashCode6 + (amount3 == null ? 0 : amount3.hashCode())) * 31;
        String str5 = this.issuer;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.expiresAt;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.reference;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.collectionInstitutionNumber;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.maskedTelephoneNumber;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.alternativeReference;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.merchantName;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.merchantReference;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.url;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.downloadUrl;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.instructionsUrl;
        return iHashCode17 + (str15 != null ? str15.hashCode() : 0);
    }

    public final void setAlternativeReference(@Nullable String str) {
        this.alternativeReference = str;
    }

    public final void setCollectionInstitutionNumber(@Nullable String str) {
        this.collectionInstitutionNumber = str;
    }

    public final void setDownloadUrl(@Nullable String str) {
        this.downloadUrl = str;
    }

    public final void setEntity(@Nullable String str) {
        this.entity = str;
    }

    public final void setExpiresAt(@Nullable String str) {
        this.expiresAt = str;
    }

    public final void setInitialAmount(@Nullable Amount amount) {
        this.initialAmount = amount;
    }

    public final void setInstructionsUrl(@Nullable String str) {
        this.instructionsUrl = str;
    }

    public final void setIssuer(@Nullable String str) {
        this.issuer = str;
    }

    public final void setMaskedTelephoneNumber(@Nullable String str) {
        this.maskedTelephoneNumber = str;
    }

    public final void setMerchantName(@Nullable String str) {
        this.merchantName = str;
    }

    public final void setMerchantReference(@Nullable String str) {
        this.merchantReference = str;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setPaymentData(@Nullable String str) {
        this.paymentData = str;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setPaymentMethodType(@Nullable String str) {
        this.paymentMethodType = str;
    }

    public final void setReference(@Nullable String str) {
        this.reference = str;
    }

    public final void setSurcharge(@Nullable Amount amount) {
        this.surcharge = amount;
    }

    public final void setTotalAmount(@Nullable Amount amount) {
        this.totalAmount = amount;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.paymentData;
        String str3 = this.paymentMethodType;
        String str4 = this.entity;
        Amount amount = this.surcharge;
        Amount amount2 = this.initialAmount;
        Amount amount3 = this.totalAmount;
        String str5 = this.issuer;
        String str6 = this.expiresAt;
        String str7 = this.reference;
        String str8 = this.collectionInstitutionNumber;
        String str9 = this.maskedTelephoneNumber;
        String str10 = this.alternativeReference;
        String str11 = this.merchantName;
        String str12 = this.merchantReference;
        String str13 = this.url;
        String str14 = this.downloadUrl;
        String str15 = this.instructionsUrl;
        StringBuilder sbT = f.t("VoucherAction(type=", str, ", paymentData=", str2, ", paymentMethodType=");
        s.A(sbT, str3, ", entity=", str4, ", surcharge=");
        sbT.append(amount);
        sbT.append(", initialAmount=");
        sbT.append(amount2);
        sbT.append(", totalAmount=");
        sbT.append(amount3);
        sbT.append(", issuer=");
        sbT.append(str5);
        sbT.append(", expiresAt=");
        s.A(sbT, str6, ", reference=", str7, ", collectionInstitutionNumber=");
        s.A(sbT, str8, ", maskedTelephoneNumber=", str9, ", alternativeReference=");
        s.A(sbT, str10, ", merchantName=", str11, ", merchantReference=");
        s.A(sbT, str12, ", url=", str13, ", downloadUrl=");
        return f.o(sbT, str14, ", instructionsUrl=", str15, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.type);
        parcel.writeString(this.paymentData);
        parcel.writeString(this.paymentMethodType);
        parcel.writeString(this.entity);
        Amount amount = this.surcharge;
        if (amount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount.writeToParcel(parcel, flags);
        }
        Amount amount2 = this.initialAmount;
        if (amount2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount2.writeToParcel(parcel, flags);
        }
        Amount amount3 = this.totalAmount;
        if (amount3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount3.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.issuer);
        parcel.writeString(this.expiresAt);
        parcel.writeString(this.reference);
        parcel.writeString(this.collectionInstitutionNumber);
        parcel.writeString(this.maskedTelephoneNumber);
        parcel.writeString(this.alternativeReference);
        parcel.writeString(this.merchantName);
        parcel.writeString(this.merchantReference);
        parcel.writeString(this.url);
        parcel.writeString(this.downloadUrl);
        parcel.writeString(this.instructionsUrl);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VoucherAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final VoucherAction createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new VoucherAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Amount.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Amount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Amount.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final VoucherAction[] newArray(int i11) {
            return new VoucherAction[i11];
        }
    }

    public VoucherAction() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    public VoucherAction(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Amount amount, @Nullable Amount amount2, @Nullable Amount amount3, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15) {
        this.type = str;
        this.paymentData = str2;
        this.paymentMethodType = str3;
        this.entity = str4;
        this.surcharge = amount;
        this.initialAmount = amount2;
        this.totalAmount = amount3;
        this.issuer = str5;
        this.expiresAt = str6;
        this.reference = str7;
        this.collectionInstitutionNumber = str8;
        this.maskedTelephoneNumber = str9;
        this.alternativeReference = str10;
        this.merchantName = str11;
        this.merchantReference = str12;
        this.url = str13;
        this.downloadUrl = str14;
        this.instructionsUrl = str15;
    }
}
