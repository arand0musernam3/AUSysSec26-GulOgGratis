package com.adyen.checkout.components.core.action;

import a80.a;
import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019HÖ\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006!"}, d2 = {"Lcom/adyen/checkout/components/core/action/Threeds2Action;", "Lcom/adyen/checkout/components/core/action/BaseThreeds2Action;", "type", "", "paymentData", Action.PAYMENT_METHOD_TYPE, Threeds2Action.TOKEN, Threeds2Action.SUBTYPE, Threeds2Action.AUTHORISATION_TOKEN, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthorisationToken", "()Ljava/lang/String;", "setAuthorisationToken", "(Ljava/lang/String;)V", "getPaymentData", "setPaymentData", "getPaymentMethodType", "setPaymentMethodType", "getSubtype", "setSubtype", "getToken", "setToken", "getType", "setType", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "SubType", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Threeds2Action extends BaseThreeds2Action {

    @NotNull
    public static final String ACTION_TYPE = "threeDS2";

    @NotNull
    private static final String AUTHORISATION_TOKEN = "authorisationToken";

    @NotNull
    private static final String SUBTYPE = "subtype";

    @NotNull
    private static final String TOKEN = "token";

    @Nullable
    private String authorisationToken;

    @Nullable
    private String paymentData;

    @Nullable
    private String paymentMethodType;

    @Nullable
    private String subtype;

    @Nullable
    private String token;

    @Nullable
    private String type;

    @NotNull
    public static final Parcelable.Creator<Threeds2Action> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<Threeds2Action> SERIALIZER = new ModelObject.Serializer<Threeds2Action>() { // from class: com.adyen.checkout.components.core.action.Threeds2Action$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public Threeds2Action deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                return new Threeds2Action(JsonUtilsKt.getStringOrNull(jsonObject, "type"), JsonUtilsKt.getStringOrNull(jsonObject, "paymentData"), JsonUtilsKt.getStringOrNull(jsonObject, Action.PAYMENT_METHOD_TYPE), JsonUtilsKt.getStringOrNull(jsonObject, "token"), JsonUtilsKt.getStringOrNull(jsonObject, "subtype"), JsonUtilsKt.getStringOrNull(jsonObject, "authorisationToken"));
            } catch (JSONException e5) {
                w.j(Threeds2Action.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull Threeds2Action modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt("paymentData", modelObject.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, modelObject.getPaymentMethodType());
                jSONObject.putOpt("token", modelObject.getToken());
                jSONObject.putOpt("subtype", modelObject.getSubtype());
                jSONObject.putOpt("authorisationToken", modelObject.getAuthorisationToken());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(Threeds2Action.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ Threeds2Action(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6);
    }

    @Override // com.adyen.checkout.core.internal.data.model.ModelObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getAuthorisationToken() {
        return this.authorisationToken;
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
    public final String getSubtype() {
        return this.subtype;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    @Nullable
    public String getType() {
        return this.type;
    }

    public final void setAuthorisationToken(@Nullable String str) {
        this.authorisationToken = str;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setPaymentData(@Nullable String str) {
        this.paymentData = str;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setPaymentMethodType(@Nullable String str) {
        this.paymentMethodType = str;
    }

    public final void setSubtype(@Nullable String str) {
        this.subtype = str;
    }

    public final void setToken(@Nullable String str) {
        this.token = str;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setType(@Nullable String str) {
        this.type = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.type);
        parcel.writeString(this.paymentData);
        parcel.writeString(this.paymentMethodType);
        parcel.writeString(this.token);
        parcel.writeString(this.subtype);
        parcel.writeString(this.authorisationToken);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/components/core/action/Threeds2Action$SubType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FINGERPRINT", "CHALLENGE", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SubType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SubType[] $VALUES;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @NotNull
        private final String value;
        public static final SubType FINGERPRINT = new SubType("FINGERPRINT", 0, "fingerprint");
        public static final SubType CHALLENGE = new SubType("CHALLENGE", 1, "challenge");

        private static final /* synthetic */ SubType[] $values() {
            return new SubType[]{FINGERPRINT, CHALLENGE};
        }

        static {
            SubType[] subTypeArr$values = $values();
            $VALUES = subTypeArr$values;
            $ENTRIES = n.w(subTypeArr$values);
            INSTANCE = new Companion(null);
        }

        private SubType(String str, int i11, String str2) {
            this.value = str2;
        }

        @NotNull
        public static a getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public static final SubType parse(@NotNull String str) {
            return INSTANCE.parse(str);
        }

        public static SubType valueOf(String str) {
            return (SubType) Enum.valueOf(SubType.class, str);
        }

        public static SubType[] values() {
            return (SubType[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/components/core/action/Threeds2Action$SubType$Companion;", "", "()V", "parse", "Lcom/adyen/checkout/components/core/action/Threeds2Action$SubType;", "value", "", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final SubType parse(@NotNull String value) {
                value.getClass();
                SubType subType = SubType.FINGERPRINT;
                if (Intrinsics.areEqual(value, subType.getValue())) {
                    return subType;
                }
                SubType subType2 = SubType.CHALLENGE;
                if (Intrinsics.areEqual(value, subType2.getValue())) {
                    return subType2;
                }
                i4.a.f(f.k("No Subtype matches the value of: ", value));
                return null;
            }

            private Companion() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Threeds2Action> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Threeds2Action createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new Threeds2Action(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Threeds2Action[] newArray(int i11) {
            return new Threeds2Action[i11];
        }
    }

    public Threeds2Action() {
        this(null, null, null, null, null, null, 63, null);
    }

    public Threeds2Action(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.type = str;
        this.paymentData = str2;
        this.paymentMethodType = str3;
        this.token = str4;
        this.subtype = str5;
        this.authorisationToken = str6;
    }
}
