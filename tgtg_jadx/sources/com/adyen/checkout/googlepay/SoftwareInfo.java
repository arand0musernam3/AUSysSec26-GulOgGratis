package com.adyen.checkout.googlepay;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/adyen/checkout/googlepay/SoftwareInfo;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "id", "", SoftwareInfo.SOFTWARE_VERSION, "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getVersion", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SoftwareInfo extends ModelObject {

    @NotNull
    private static final String SOFTWARE_ID = "id";

    @NotNull
    private static final String SOFTWARE_VERSION = "version";

    @NotNull
    private final String id;

    @NotNull
    private final String version;

    @NotNull
    public static final Parcelable.Creator<SoftwareInfo> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<SoftwareInfo> SERIALIZER = new ModelObject.Serializer<SoftwareInfo>() { // from class: com.adyen.checkout.googlepay.SoftwareInfo$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public SoftwareInfo deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                String string = jsonObject.getString("id");
                string.getClass();
                String string2 = jsonObject.getString("version");
                string2.getClass();
                return new SoftwareInfo(string, string2);
            } catch (JSONException e5) {
                w.j(SoftwareInfo.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull SoftwareInfo modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", modelObject.getId());
                jSONObject.put("version", modelObject.getVersion());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(SoftwareInfo.class, e5);
                return null;
            }
        }
    };

    public SoftwareInfo(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.version = str2;
    }

    public static /* synthetic */ SoftwareInfo copy$default(SoftwareInfo softwareInfo, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = softwareInfo.id;
        }
        if ((i11 & 2) != 0) {
            str2 = softwareInfo.version;
        }
        return softwareInfo.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final SoftwareInfo copy(@NotNull String id2, @NotNull String version) {
        id2.getClass();
        version.getClass();
        return new SoftwareInfo(id2, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SoftwareInfo)) {
            return false;
        }
        SoftwareInfo softwareInfo = (SoftwareInfo) other;
        return Intrinsics.areEqual(this.id, softwareInfo.id) && Intrinsics.areEqual(this.version, softwareInfo.version);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version.hashCode() + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.d("SoftwareInfo(id=", this.id, ", version=", this.version, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.version);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SoftwareInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SoftwareInfo createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new SoftwareInfo(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SoftwareInfo[] newArray(int i11) {
            return new SoftwareInfo[i11];
        }
    }
}
