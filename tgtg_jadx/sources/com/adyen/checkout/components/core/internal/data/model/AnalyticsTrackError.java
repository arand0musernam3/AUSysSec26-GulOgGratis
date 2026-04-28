package com.adyen.checkout.components.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.braze.models.inappmessage.InAppMessageBase;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0001+BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J`\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020$HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006,"}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackError;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "id", "", AnalyticsTrackError.TIMESTAMP, "", AnalyticsTrackError.COMPONENT, AnalyticsTrackError.ERROR_TYPE, AnalyticsTrackError.CODE, AnalyticsTrackError.TARGET, "message", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getComponent", "getErrorType", "getId", "getMessage", "getTarget", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackError;", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AnalyticsTrackError extends ModelObject {

    @NotNull
    private static final String CODE = "code";

    @NotNull
    private static final String COMPONENT = "component";

    @NotNull
    private static final String ERROR_TYPE = "errorType";

    @NotNull
    private static final String ID = "id";

    @NotNull
    private static final String MESSAGE = "message";

    @NotNull
    private static final String TARGET = "target";

    @NotNull
    private static final String TIMESTAMP = "timestamp";

    @Nullable
    private final String code;

    @Nullable
    private final String component;

    @Nullable
    private final String errorType;

    @NotNull
    private final String id;

    @Nullable
    private final String message;

    @Nullable
    private final String target;

    @Nullable
    private final Long timestamp;

    @NotNull
    public static final Parcelable.Creator<AnalyticsTrackError> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<AnalyticsTrackError> SERIALIZER = new ModelObject.Serializer<AnalyticsTrackError>() { // from class: com.adyen.checkout.components.core.internal.data.model.AnalyticsTrackError$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public AnalyticsTrackError deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                String string = jsonObject.getString("id");
                string.getClass();
                return new AnalyticsTrackError(string, JsonUtilsKt.getLongOrNull(jsonObject, "timestamp"), JsonUtilsKt.getStringOrNull(jsonObject, "component"), JsonUtilsKt.getStringOrNull(jsonObject, "errorType"), JsonUtilsKt.getStringOrNull(jsonObject, "code"), JsonUtilsKt.getStringOrNull(jsonObject, "target"), JsonUtilsKt.getStringOrNull(jsonObject, InAppMessageBase.MESSAGE));
            } catch (JSONException e5) {
                w.j(AnalyticsTrackError.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull AnalyticsTrackError modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", modelObject.getId());
                jSONObject.putOpt("timestamp", modelObject.getTimestamp());
                jSONObject.putOpt("component", modelObject.getComponent());
                jSONObject.putOpt("errorType", modelObject.getErrorType());
                jSONObject.putOpt("code", modelObject.getCode());
                jSONObject.putOpt("target", modelObject.getTarget());
                jSONObject.putOpt(InAppMessageBase.MESSAGE, modelObject.getMessage());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(AnalyticsTrackError.class, e5);
                return null;
            }
        }
    };

    public AnalyticsTrackError(@NotNull String str, @Nullable Long l, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        str.getClass();
        this.id = str;
        this.timestamp = l;
        this.component = str2;
        this.errorType = str3;
        this.code = str4;
        this.target = str5;
        this.message = str6;
    }

    public static /* synthetic */ AnalyticsTrackError copy$default(AnalyticsTrackError analyticsTrackError, String str, Long l, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = analyticsTrackError.id;
        }
        if ((i11 & 2) != 0) {
            l = analyticsTrackError.timestamp;
        }
        if ((i11 & 4) != 0) {
            str2 = analyticsTrackError.component;
        }
        if ((i11 & 8) != 0) {
            str3 = analyticsTrackError.errorType;
        }
        if ((i11 & 16) != 0) {
            str4 = analyticsTrackError.code;
        }
        if ((i11 & 32) != 0) {
            str5 = analyticsTrackError.target;
        }
        if ((i11 & 64) != 0) {
            str6 = analyticsTrackError.message;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str2;
        return analyticsTrackError.copy(str, l, str10, str3, str9, str7, str8);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getComponent() {
        return this.component;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final AnalyticsTrackError copy(@NotNull String id2, @Nullable Long timestamp, @Nullable String component, @Nullable String errorType, @Nullable String code, @Nullable String target, @Nullable String message) {
        id2.getClass();
        return new AnalyticsTrackError(id2, timestamp, component, errorType, code, target, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsTrackError)) {
            return false;
        }
        AnalyticsTrackError analyticsTrackError = (AnalyticsTrackError) other;
        return Intrinsics.areEqual(this.id, analyticsTrackError.id) && Intrinsics.areEqual(this.timestamp, analyticsTrackError.timestamp) && Intrinsics.areEqual(this.component, analyticsTrackError.component) && Intrinsics.areEqual(this.errorType, analyticsTrackError.errorType) && Intrinsics.areEqual(this.code, analyticsTrackError.code) && Intrinsics.areEqual(this.target, analyticsTrackError.target) && Intrinsics.areEqual(this.message, analyticsTrackError.message);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getComponent() {
        return this.component;
    }

    @Nullable
    public final String getErrorType() {
        return this.errorType;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getTarget() {
        return this.target;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Long l = this.timestamp;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.component;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorType;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.code;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.target;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.message;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        Long l = this.timestamp;
        String str2 = this.component;
        String str3 = this.errorType;
        String str4 = this.code;
        String str5 = this.target;
        String str6 = this.message;
        StringBuilder sb2 = new StringBuilder("AnalyticsTrackError(id=");
        sb2.append(str);
        sb2.append(", timestamp=");
        sb2.append(l);
        sb2.append(", component=");
        s.A(sb2, str2, ", errorType=", str3, ", code=");
        s.A(sb2, str4, ", target=", str5, ", message=");
        return k.p(sb2, str6, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.id);
        Long l = this.timestamp;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.component);
        parcel.writeString(this.errorType);
        parcel.writeString(this.code);
        parcel.writeString(this.target);
        parcel.writeString(this.message);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AnalyticsTrackError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AnalyticsTrackError createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new AnalyticsTrackError(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AnalyticsTrackError[] newArray(int i11) {
            return new AnalyticsTrackError[i11];
        }
    }
}
