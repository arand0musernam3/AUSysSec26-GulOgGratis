package com.adyen.checkout.sessions.core;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001dHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\f¨\u0006%"}, d2 = {"Lcom/adyen/checkout/sessions/core/SessionSetupConfiguration;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", SessionSetupConfiguration.ENABLE_STORE_DETAILS, "", SessionSetupConfiguration.SHOW_INSTALLMENT_AMOUNT, SessionSetupConfiguration.INSTALLMENT_OPTIONS, "", "", "Lcom/adyen/checkout/sessions/core/SessionSetupInstallmentOptions;", SessionSetupConfiguration.SHOW_REMOVE_PAYMENT_METHOD_BUTTON, "(Ljava/lang/Boolean;ZLjava/util/Map;Ljava/lang/Boolean;)V", "getEnableStoreDetails", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getInstallmentOptions", "()Ljava/util/Map;", "getShowInstallmentAmount", "()Z", "getShowRemovePaymentMethodButton", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;ZLjava/util/Map;Ljava/lang/Boolean;)Lcom/adyen/checkout/sessions/core/SessionSetupConfiguration;", "equals", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionSetupConfiguration extends ModelObject {

    @NotNull
    private static final String ENABLE_STORE_DETAILS = "enableStoreDetails";

    @NotNull
    private static final String INSTALLMENT_OPTIONS = "installmentOptions";

    @NotNull
    private static final String SHOW_INSTALLMENT_AMOUNT = "showInstallmentAmount";

    @NotNull
    private static final String SHOW_REMOVE_PAYMENT_METHOD_BUTTON = "showRemovePaymentMethodButton";

    @Nullable
    private final Boolean enableStoreDetails;

    @Nullable
    private final Map<String, SessionSetupInstallmentOptions> installmentOptions;
    private final boolean showInstallmentAmount;

    @Nullable
    private final Boolean showRemovePaymentMethodButton;

    @NotNull
    public static final Parcelable.Creator<SessionSetupConfiguration> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<SessionSetupConfiguration> SERIALIZER = new ModelObject.Serializer<SessionSetupConfiguration>() { // from class: com.adyen.checkout.sessions.core.SessionSetupConfiguration$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public SessionSetupConfiguration deserialize(@NotNull JSONObject jsonObject) {
            LinkedHashMap linkedHashMap;
            jsonObject.getClass();
            try {
                Boolean booleanOrNull = JsonUtilsKt.getBooleanOrNull(jsonObject, "enableStoreDetails");
                Boolean booleanOrNull2 = JsonUtilsKt.getBooleanOrNull(jsonObject, "showInstallmentAmount");
                boolean zBooleanValue = booleanOrNull2 != null ? booleanOrNull2.booleanValue() : false;
                JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("installmentOptions");
                if (jSONObjectOptJSONObject != null) {
                    ModelObject.Serializer<SessionSetupInstallmentOptions> serializer = SessionSetupInstallmentOptions.SERIALIZER;
                    linkedHashMap = new LinkedHashMap();
                    if (jSONObjectOptJSONObject != JSONObject.NULL) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            Object obj = jSONObjectOptJSONObject.get(next);
                            if (obj instanceof JSONObject) {
                                next.getClass();
                                linkedHashMap.put(next, ModelUtils.deserializeOpt((JSONObject) obj, serializer));
                            }
                        }
                    }
                } else {
                    linkedHashMap = null;
                }
                return new SessionSetupConfiguration(booleanOrNull, zBooleanValue, linkedHashMap, JsonUtilsKt.getBooleanOrNull(jsonObject, "showRemovePaymentMethodButton"));
            } catch (JSONException e5) {
                w.j(SessionSetupConfiguration.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull SessionSetupConfiguration modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("enableStoreDetails", modelObject.getEnableStoreDetails());
                jSONObject.putOpt("showInstallmentAmount", Boolean.valueOf(modelObject.getShowInstallmentAmount()));
                jSONObject.putOpt("installmentOptions", ModelUtils.INSTANCE.serializeOptMap(modelObject.getInstallmentOptions(), SessionSetupInstallmentOptions.SERIALIZER));
                jSONObject.putOpt("showRemovePaymentMethodButton", modelObject.getShowRemovePaymentMethodButton());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(SessionSetupConfiguration.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ SessionSetupConfiguration(Boolean bool, boolean z11, Map map, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : map, (i11 & 8) != 0 ? null : bool2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionSetupConfiguration copy$default(SessionSetupConfiguration sessionSetupConfiguration, Boolean bool, boolean z11, Map map, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = sessionSetupConfiguration.enableStoreDetails;
        }
        if ((i11 & 2) != 0) {
            z11 = sessionSetupConfiguration.showInstallmentAmount;
        }
        if ((i11 & 4) != 0) {
            map = sessionSetupConfiguration.installmentOptions;
        }
        if ((i11 & 8) != 0) {
            bool2 = sessionSetupConfiguration.showRemovePaymentMethodButton;
        }
        return sessionSetupConfiguration.copy(bool, z11, map, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnableStoreDetails() {
        return this.enableStoreDetails;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowInstallmentAmount() {
        return this.showInstallmentAmount;
    }

    @Nullable
    public final Map<String, SessionSetupInstallmentOptions> component3() {
        return this.installmentOptions;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getShowRemovePaymentMethodButton() {
        return this.showRemovePaymentMethodButton;
    }

    @NotNull
    public final SessionSetupConfiguration copy(@Nullable Boolean enableStoreDetails, boolean showInstallmentAmount, @Nullable Map<String, SessionSetupInstallmentOptions> installmentOptions, @Nullable Boolean showRemovePaymentMethodButton) {
        return new SessionSetupConfiguration(enableStoreDetails, showInstallmentAmount, installmentOptions, showRemovePaymentMethodButton);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionSetupConfiguration)) {
            return false;
        }
        SessionSetupConfiguration sessionSetupConfiguration = (SessionSetupConfiguration) other;
        return Intrinsics.areEqual(this.enableStoreDetails, sessionSetupConfiguration.enableStoreDetails) && this.showInstallmentAmount == sessionSetupConfiguration.showInstallmentAmount && Intrinsics.areEqual(this.installmentOptions, sessionSetupConfiguration.installmentOptions) && Intrinsics.areEqual(this.showRemovePaymentMethodButton, sessionSetupConfiguration.showRemovePaymentMethodButton);
    }

    @Nullable
    public final Boolean getEnableStoreDetails() {
        return this.enableStoreDetails;
    }

    @Nullable
    public final Map<String, SessionSetupInstallmentOptions> getInstallmentOptions() {
        return this.installmentOptions;
    }

    public final boolean getShowInstallmentAmount() {
        return this.showInstallmentAmount;
    }

    @Nullable
    public final Boolean getShowRemovePaymentMethodButton() {
        return this.showRemovePaymentMethodButton;
    }

    public int hashCode() {
        Boolean bool = this.enableStoreDetails;
        int iE = k.e((bool == null ? 0 : bool.hashCode()) * 31, 31, this.showInstallmentAmount);
        Map<String, SessionSetupInstallmentOptions> map = this.installmentOptions;
        int iHashCode = (iE + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool2 = this.showRemovePaymentMethodButton;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SessionSetupConfiguration(enableStoreDetails=" + this.enableStoreDetails + ", showInstallmentAmount=" + this.showInstallmentAmount + ", installmentOptions=" + this.installmentOptions + ", showRemovePaymentMethodButton=" + this.showRemovePaymentMethodButton + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        Boolean bool = this.enableStoreDetails;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool);
        }
        parcel.writeInt(this.showInstallmentAmount ? 1 : 0);
        Map<String, SessionSetupInstallmentOptions> map = this.installmentOptions;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, SessionSetupInstallmentOptions> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                SessionSetupInstallmentOptions value = entry.getValue();
                if (value == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    value.writeToParcel(parcel, flags);
                }
            }
        }
        Boolean bool2 = this.showRemovePaymentMethodButton;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionSetupConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionSetupConfiguration createFromParcel(@NotNull Parcel parcel) {
            LinkedHashMap linkedHashMap;
            parcel.getClass();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            boolean z11 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i11 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap.put(parcel.readString(), parcel.readInt() == 0 ? null : SessionSetupInstallmentOptions.CREATOR.createFromParcel(parcel));
                }
            }
            return new SessionSetupConfiguration(boolValueOf, z11, linkedHashMap, parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionSetupConfiguration[] newArray(int i11) {
            return new SessionSetupConfiguration[i11];
        }
    }

    public SessionSetupConfiguration() {
        this(null, false, null, null, 15, null);
    }

    public SessionSetupConfiguration(@Nullable Boolean bool, boolean z11, @Nullable Map<String, SessionSetupInstallmentOptions> map, @Nullable Boolean bool2) {
        this.enableStoreDetails = bool;
        this.showInstallmentAmount = z11;
        this.installmentOptions = map;
        this.showRemovePaymentMethodButton = bool2;
    }
}
