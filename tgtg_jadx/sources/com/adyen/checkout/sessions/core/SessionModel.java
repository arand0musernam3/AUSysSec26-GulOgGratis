package com.adyen.checkout.sessions.core;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/adyen/checkout/sessions/core/SessionModel;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "id", "", SessionModel.SESSION_DATA, "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getSessionData", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionModel extends ModelObject {

    @NotNull
    private static final String ID = "id";

    @NotNull
    private static final String SESSION_DATA = "sessionData";

    @NotNull
    private final String id;

    @Nullable
    private final String sessionData;

    @NotNull
    public static final Parcelable.Creator<SessionModel> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<SessionModel> SERIALIZER = new ModelObject.Serializer<SessionModel>() { // from class: com.adyen.checkout.sessions.core.SessionModel$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public SessionModel deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            String stringOrNull = JsonUtilsKt.getStringOrNull(jsonObject, "id");
            if (stringOrNull == null) {
                stringOrNull = "";
            }
            return new SessionModel(stringOrNull, JsonUtilsKt.getStringOrNull(jsonObject, "sessionData"));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull SessionModel modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("id", modelObject.getId());
                jSONObject.putOpt("sessionData", modelObject.getSessionData());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(SessionModel.class, e5);
                return null;
            }
        }
    };

    public SessionModel(@NotNull String str, @Nullable String str2) {
        str.getClass();
        this.id = str;
        this.sessionData = str2;
    }

    public static /* synthetic */ SessionModel copy$default(SessionModel sessionModel, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionModel.id;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionModel.sessionData;
        }
        return sessionModel.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionData() {
        return this.sessionData;
    }

    @NotNull
    public final SessionModel copy(@NotNull String id2, @Nullable String sessionData) {
        id2.getClass();
        return new SessionModel(id2, sessionData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionModel)) {
            return false;
        }
        SessionModel sessionModel = (SessionModel) other;
        return Intrinsics.areEqual(this.id, sessionModel.id) && Intrinsics.areEqual(this.sessionData, sessionModel.sessionData);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getSessionData() {
        return this.sessionData;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.sessionData;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return a.d("SessionModel(id=", this.id, ", sessionData=", this.sessionData, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.sessionData);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionModel createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new SessionModel(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionModel[] newArray(int i11) {
            return new SessionModel[i11];
        }
    }
}
