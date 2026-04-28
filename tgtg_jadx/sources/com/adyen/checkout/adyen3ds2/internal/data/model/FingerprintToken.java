package com.adyen.checkout.adyen3ds2.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import e0.f;
import j4.s;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0001!BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\""}, d2 = {"Lcom/adyen/checkout/adyen3ds2/internal/data/model/FingerprintToken;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", FingerprintToken.DIRECTORY_SERVER_ID, "", FingerprintToken.DIRECTORY_SERVER_PUBLIC_KEY, FingerprintToken.DIRECTORY_SERVER_ROOT_CERTIFICATES, FingerprintToken.THREEDS_SERVER_TRANS_ID, FingerprintToken.THREEDS_MESSAGE_VERSION, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDirectoryServerId", "()Ljava/lang/String;", "getDirectoryServerPublicKey", "getDirectoryServerRootCertificates", "getThreeDSMessageVersion", "getThreeDSServerTransID", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FingerprintToken extends ModelObject {

    @NotNull
    private static final String DIRECTORY_SERVER_ID = "directoryServerId";

    @NotNull
    private static final String DIRECTORY_SERVER_PUBLIC_KEY = "directoryServerPublicKey";

    @NotNull
    private static final String DIRECTORY_SERVER_ROOT_CERTIFICATES = "directoryServerRootCertificates";

    @NotNull
    private static final String THREEDS_MESSAGE_VERSION = "threeDSMessageVersion";

    @NotNull
    private static final String THREEDS_SERVER_TRANS_ID = "threeDSServerTransID";

    @Nullable
    private final String directoryServerId;

    @Nullable
    private final String directoryServerPublicKey;

    @Nullable
    private final String directoryServerRootCertificates;

    @Nullable
    private final String threeDSMessageVersion;

    @Nullable
    private final String threeDSServerTransID;

    @NotNull
    public static final Parcelable.Creator<FingerprintToken> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<FingerprintToken> SERIALIZER = new ModelObject.Serializer<FingerprintToken>() { // from class: com.adyen.checkout.adyen3ds2.internal.data.model.FingerprintToken$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public FingerprintToken deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                return new FingerprintToken(JsonUtilsKt.getStringOrNull(jsonObject, "directoryServerId"), JsonUtilsKt.getStringOrNull(jsonObject, "directoryServerPublicKey"), JsonUtilsKt.getStringOrNull(jsonObject, "directoryServerRootCertificates"), JsonUtilsKt.getStringOrNull(jsonObject, "threeDSServerTransID"), JsonUtilsKt.getStringOrNull(jsonObject, "threeDSMessageVersion"));
            } catch (JSONException e5) {
                w.j(FingerprintToken.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull FingerprintToken modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("directoryServerId", modelObject.getDirectoryServerId());
                jSONObject.putOpt("directoryServerPublicKey", modelObject.getDirectoryServerPublicKey());
                jSONObject.putOpt("directoryServerRootCertificates", modelObject.getDirectoryServerRootCertificates());
                jSONObject.putOpt("threeDSServerTransID", modelObject.getThreeDSServerTransID());
                jSONObject.putOpt("threeDSMessageVersion", modelObject.getThreeDSMessageVersion());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(FingerprintToken.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ FingerprintToken(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5);
    }

    public static /* synthetic */ FingerprintToken copy$default(FingerprintToken fingerprintToken, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fingerprintToken.directoryServerId;
        }
        if ((i11 & 2) != 0) {
            str2 = fingerprintToken.directoryServerPublicKey;
        }
        if ((i11 & 4) != 0) {
            str3 = fingerprintToken.directoryServerRootCertificates;
        }
        if ((i11 & 8) != 0) {
            str4 = fingerprintToken.threeDSServerTransID;
        }
        if ((i11 & 16) != 0) {
            str5 = fingerprintToken.threeDSMessageVersion;
        }
        String str6 = str5;
        String str7 = str3;
        return fingerprintToken.copy(str, str2, str7, str4, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDirectoryServerId() {
        return this.directoryServerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDirectoryServerPublicKey() {
        return this.directoryServerPublicKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDirectoryServerRootCertificates() {
        return this.directoryServerRootCertificates;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getThreeDSServerTransID() {
        return this.threeDSServerTransID;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getThreeDSMessageVersion() {
        return this.threeDSMessageVersion;
    }

    @NotNull
    public final FingerprintToken copy(@Nullable String directoryServerId, @Nullable String directoryServerPublicKey, @Nullable String directoryServerRootCertificates, @Nullable String threeDSServerTransID, @Nullable String threeDSMessageVersion) {
        return new FingerprintToken(directoryServerId, directoryServerPublicKey, directoryServerRootCertificates, threeDSServerTransID, threeDSMessageVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FingerprintToken)) {
            return false;
        }
        FingerprintToken fingerprintToken = (FingerprintToken) other;
        return Intrinsics.areEqual(this.directoryServerId, fingerprintToken.directoryServerId) && Intrinsics.areEqual(this.directoryServerPublicKey, fingerprintToken.directoryServerPublicKey) && Intrinsics.areEqual(this.directoryServerRootCertificates, fingerprintToken.directoryServerRootCertificates) && Intrinsics.areEqual(this.threeDSServerTransID, fingerprintToken.threeDSServerTransID) && Intrinsics.areEqual(this.threeDSMessageVersion, fingerprintToken.threeDSMessageVersion);
    }

    @Nullable
    public final String getDirectoryServerId() {
        return this.directoryServerId;
    }

    @Nullable
    public final String getDirectoryServerPublicKey() {
        return this.directoryServerPublicKey;
    }

    @Nullable
    public final String getDirectoryServerRootCertificates() {
        return this.directoryServerRootCertificates;
    }

    @Nullable
    public final String getThreeDSMessageVersion() {
        return this.threeDSMessageVersion;
    }

    @Nullable
    public final String getThreeDSServerTransID() {
        return this.threeDSServerTransID;
    }

    public int hashCode() {
        String str = this.directoryServerId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.directoryServerPublicKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.directoryServerRootCertificates;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.threeDSServerTransID;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.threeDSMessageVersion;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.directoryServerId;
        String str2 = this.directoryServerPublicKey;
        String str3 = this.directoryServerRootCertificates;
        String str4 = this.threeDSServerTransID;
        String str5 = this.threeDSMessageVersion;
        StringBuilder sbT = f.t("FingerprintToken(directoryServerId=", str, ", directoryServerPublicKey=", str2, ", directoryServerRootCertificates=");
        s.A(sbT, str3, ", threeDSServerTransID=", str4, ", threeDSMessageVersion=");
        return k.p(sbT, str5, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.directoryServerId);
        parcel.writeString(this.directoryServerPublicKey);
        parcel.writeString(this.directoryServerRootCertificates);
        parcel.writeString(this.threeDSServerTransID);
        parcel.writeString(this.threeDSMessageVersion);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FingerprintToken> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FingerprintToken createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new FingerprintToken(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FingerprintToken[] newArray(int i11) {
            return new FingerprintToken[i11];
        }
    }

    public FingerprintToken() {
        this(null, null, null, null, null, 31, null);
    }

    public FingerprintToken(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.directoryServerId = str;
        this.directoryServerPublicKey = str2;
        this.directoryServerRootCertificates = str3;
        this.threeDSServerTransID = str4;
        this.threeDSMessageVersion = str5;
    }
}
