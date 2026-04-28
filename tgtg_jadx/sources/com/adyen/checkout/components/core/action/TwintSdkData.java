package com.adyen.checkout.components.core.action;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/adyen/checkout/components/core/action/TwintSdkData;", "Lcom/adyen/checkout/components/core/action/SdkData;", TwintSdkData.TOKEN, "", TwintSdkData.IS_STORED, "", "(Ljava/lang/String;Z)V", "()Z", "getToken", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TwintSdkData extends SdkData {

    @NotNull
    private static final String IS_STORED = "isStored";

    @NotNull
    private static final String TOKEN = "token";
    private final boolean isStored;

    @NotNull
    private final String token;

    @NotNull
    public static final Parcelable.Creator<TwintSdkData> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<TwintSdkData> SERIALIZER = new ModelObject.Serializer<TwintSdkData>() { // from class: com.adyen.checkout.components.core.action.TwintSdkData$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public TwintSdkData deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                String string = jsonObject.getString("token");
                string.getClass();
                Boolean booleanOrNull = JsonUtilsKt.getBooleanOrNull(jsonObject, "isStored");
                return new TwintSdkData(string, booleanOrNull != null ? booleanOrNull.booleanValue() : false);
            } catch (JSONException e5) {
                w.j(TwintSdkData.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull TwintSdkData modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("token", modelObject.getToken());
                jSONObject.putOpt("isStored", Boolean.valueOf(modelObject.isStored()));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(TwintSdkData.class, e5);
                return null;
            }
        }
    };

    public TwintSdkData(@NotNull String str, boolean z11) {
        str.getClass();
        this.token = str;
        this.isStored = z11;
    }

    public static /* synthetic */ TwintSdkData copy$default(TwintSdkData twintSdkData, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = twintSdkData.token;
        }
        if ((i11 & 2) != 0) {
            z11 = twintSdkData.isStored;
        }
        return twintSdkData.copy(str, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsStored() {
        return this.isStored;
    }

    @NotNull
    public final TwintSdkData copy(@NotNull String token, boolean isStored) {
        token.getClass();
        return new TwintSdkData(token, isStored);
    }

    @Override // com.adyen.checkout.core.internal.data.model.ModelObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TwintSdkData)) {
            return false;
        }
        TwintSdkData twintSdkData = (TwintSdkData) other;
        return Intrinsics.areEqual(this.token, twintSdkData.token) && this.isStored == twintSdkData.isStored;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isStored) + (this.token.hashCode() * 31);
    }

    public final boolean isStored() {
        return this.isStored;
    }

    @NotNull
    public String toString() {
        return "TwintSdkData(token=" + this.token + ", isStored=" + this.isStored + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeInt(this.isStored ? 1 : 0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TwintSdkData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final TwintSdkData createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new TwintSdkData(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final TwintSdkData[] newArray(int i11) {
            return new TwintSdkData[i11];
        }
    }
}
