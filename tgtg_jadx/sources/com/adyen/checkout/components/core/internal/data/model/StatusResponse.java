package com.adyen.checkout.components.core.internal.data.model;

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
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0018HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006 "}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "type", "", "payload", StatusResponse.RESULT_CODE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPayload", "()Ljava/lang/String;", "setPayload", "(Ljava/lang/String;)V", "getResultCode", "setResultCode", "getType", "setType", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class StatusResponse extends ModelObject {

    @NotNull
    public static final String PAYLOAD = "payload";

    @NotNull
    public static final String RESULT_CODE = "resultCode";

    @NotNull
    public static final String TYPE = "type";

    @Nullable
    private String payload;

    @Nullable
    private String resultCode;

    @Nullable
    private String type;

    @NotNull
    public static final Parcelable.Creator<StatusResponse> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<StatusResponse> SERIALIZER = new ModelObject.Serializer<StatusResponse>() { // from class: com.adyen.checkout.components.core.internal.data.model.StatusResponse$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public StatusResponse deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new StatusResponse(JsonUtilsKt.getStringOrNull(jsonObject, "type"), JsonUtilsKt.getStringOrNull(jsonObject, "payload"), JsonUtilsKt.getStringOrNull(jsonObject, StatusResponse.RESULT_CODE));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull StatusResponse modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt("payload", modelObject.getPayload());
                jSONObject.putOpt(StatusResponse.RESULT_CODE, modelObject.getResultCode());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(StatusResponse.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ StatusResponse(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ StatusResponse copy$default(StatusResponse statusResponse, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = statusResponse.type;
        }
        if ((i11 & 2) != 0) {
            str2 = statusResponse.payload;
        }
        if ((i11 & 4) != 0) {
            str3 = statusResponse.resultCode;
        }
        return statusResponse.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getResultCode() {
        return this.resultCode;
    }

    @NotNull
    public final StatusResponse copy(@Nullable String type, @Nullable String payload, @Nullable String resultCode) {
        return new StatusResponse(type, payload, resultCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusResponse)) {
            return false;
        }
        StatusResponse statusResponse = (StatusResponse) other;
        return Intrinsics.areEqual(this.type, statusResponse.type) && Intrinsics.areEqual(this.payload, statusResponse.payload) && Intrinsics.areEqual(this.resultCode, statusResponse.resultCode);
    }

    @Nullable
    public final String getPayload() {
        return this.payload;
    }

    @Nullable
    public final String getResultCode() {
        return this.resultCode;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.payload;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.resultCode;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setPayload(@Nullable String str) {
        this.payload = str;
    }

    public final void setResultCode(@Nullable String str) {
        this.resultCode = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.payload;
        return k.p(f.t("StatusResponse(type=", str, ", payload=", str2, ", resultCode="), this.resultCode, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.type);
        parcel.writeString(this.payload);
        parcel.writeString(this.resultCode);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StatusResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StatusResponse createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new StatusResponse(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StatusResponse[] newArray(int i11) {
            return new StatusResponse[i11];
        }
    }

    public StatusResponse() {
        this(null, null, null, 7, null);
    }

    public StatusResponse(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.type = str;
        this.payload = str2;
        this.resultCode = str3;
    }
}
