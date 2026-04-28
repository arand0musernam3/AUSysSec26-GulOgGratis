package com.adyen.checkout.adyen3ds2.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintResponse;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", SubmitFingerprintResponse.ACTION, "Lcom/adyen/checkout/components/core/action/Action;", "type", "", "details", "(Lcom/adyen/checkout/components/core/action/Action;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Lcom/adyen/checkout/components/core/action/Action;", "getDetails", "()Ljava/lang/String;", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SubmitFingerprintResponse extends ModelObject {

    @NotNull
    private static final String ACTION = "action";

    @NotNull
    private static final String DETAILS = "details";

    @NotNull
    private static final String TYPE = "type";

    @Nullable
    private final Action action;

    @Nullable
    private final String details;

    @Nullable
    private final String type;

    @NotNull
    public static final Parcelable.Creator<SubmitFingerprintResponse> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<SubmitFingerprintResponse> SERIALIZER = new ModelObject.Serializer<SubmitFingerprintResponse>() { // from class: com.adyen.checkout.adyen3ds2.internal.data.model.SubmitFingerprintResponse$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public SubmitFingerprintResponse deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                return new SubmitFingerprintResponse((Action) ModelUtils.deserializeOpt(jsonObject.optJSONObject("action"), Action.SERIALIZER), JsonUtilsKt.getStringOrNull(jsonObject, "type"), JsonUtilsKt.getStringOrNull(jsonObject, ErrorBundle.DETAIL_ENTRY));
            } catch (JSONException e5) {
                w.j(SubmitFingerprintResponse.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull SubmitFingerprintResponse modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("action", modelObject.getAction());
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(ErrorBundle.DETAIL_ENTRY, modelObject.getDetails());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(SubmitFingerprintResponse.class, e5);
                return null;
            }
        }
    };

    public SubmitFingerprintResponse(@Nullable Action action, @Nullable String str, @Nullable String str2) {
        this.action = action;
        this.type = str;
        this.details = str2;
    }

    public static /* synthetic */ SubmitFingerprintResponse copy$default(SubmitFingerprintResponse submitFingerprintResponse, Action action, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            action = submitFingerprintResponse.action;
        }
        if ((i11 & 2) != 0) {
            str = submitFingerprintResponse.type;
        }
        if ((i11 & 4) != 0) {
            str2 = submitFingerprintResponse.details;
        }
        return submitFingerprintResponse.copy(action, str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    @NotNull
    public final SubmitFingerprintResponse copy(@Nullable Action action, @Nullable String type, @Nullable String details) {
        return new SubmitFingerprintResponse(action, type, details);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitFingerprintResponse)) {
            return false;
        }
        SubmitFingerprintResponse submitFingerprintResponse = (SubmitFingerprintResponse) other;
        return Intrinsics.areEqual(this.action, submitFingerprintResponse.action) && Intrinsics.areEqual(this.type, submitFingerprintResponse.type) && Intrinsics.areEqual(this.details, submitFingerprintResponse.details);
    }

    @Nullable
    public final Action getAction() {
        return this.action;
    }

    @Nullable
    public final String getDetails() {
        return this.details;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        Action action = this.action;
        int iHashCode = (action == null ? 0 : action.hashCode()) * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.details;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Action action = this.action;
        String str = this.type;
        String str2 = this.details;
        StringBuilder sb2 = new StringBuilder("SubmitFingerprintResponse(action=");
        sb2.append(action);
        sb2.append(", type=");
        sb2.append(str);
        sb2.append(", details=");
        return k.p(sb2, str2, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeParcelable(this.action, flags);
        parcel.writeString(this.type);
        parcel.writeString(this.details);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SubmitFingerprintResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SubmitFingerprintResponse createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new SubmitFingerprintResponse((Action) parcel.readParcelable(SubmitFingerprintResponse.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SubmitFingerprintResponse[] newArray(int i11) {
            return new SubmitFingerprintResponse[i11];
        }
    }
}
