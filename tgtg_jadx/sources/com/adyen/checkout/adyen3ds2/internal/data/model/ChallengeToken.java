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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0001+BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020$HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006,"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/internal/data/model/ChallengeToken;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", ChallengeToken.ACS_REFERENCE_NUMBER, "", ChallengeToken.ACS_SIGNED_CONTENT, ChallengeToken.ACS_TRANS_ID, ChallengeToken.ACS_URL, ChallengeToken.MESSAGE_VERSION, ChallengeToken.THREEDS_SERVER_TRANS_ID, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAcsReferenceNumber", "()Ljava/lang/String;", "setAcsReferenceNumber", "(Ljava/lang/String;)V", "getAcsSignedContent", "setAcsSignedContent", "getAcsTransID", "setAcsTransID", "getAcsURL", "setAcsURL", "getMessageVersion", "setMessageVersion", "getThreeDSServerTransID", "setThreeDSServerTransID", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ChallengeToken extends ModelObject {

    @NotNull
    private static final String ACS_REFERENCE_NUMBER = "acsReferenceNumber";

    @NotNull
    private static final String ACS_SIGNED_CONTENT = "acsSignedContent";

    @NotNull
    private static final String ACS_TRANS_ID = "acsTransID";

    @NotNull
    private static final String ACS_URL = "acsURL";

    @NotNull
    private static final String MESSAGE_VERSION = "messageVersion";

    @NotNull
    private static final String THREEDS_SERVER_TRANS_ID = "threeDSServerTransID";

    @Nullable
    private String acsReferenceNumber;

    @Nullable
    private String acsSignedContent;

    @Nullable
    private String acsTransID;

    @Nullable
    private String acsURL;

    @Nullable
    private String messageVersion;

    @Nullable
    private String threeDSServerTransID;

    @NotNull
    public static final Parcelable.Creator<ChallengeToken> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<ChallengeToken> SERIALIZER = new ModelObject.Serializer<ChallengeToken>() { // from class: com.adyen.checkout.adyen3ds2.internal.data.model.ChallengeToken$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public ChallengeToken deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                return new ChallengeToken(JsonUtilsKt.getStringOrNull(jsonObject, "acsReferenceNumber"), JsonUtilsKt.getStringOrNull(jsonObject, "acsSignedContent"), JsonUtilsKt.getStringOrNull(jsonObject, "acsTransID"), JsonUtilsKt.getStringOrNull(jsonObject, "acsURL"), JsonUtilsKt.getStringOrNull(jsonObject, "messageVersion"), JsonUtilsKt.getStringOrNull(jsonObject, "threeDSServerTransID"));
            } catch (JSONException e5) {
                w.j(ChallengeToken.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull ChallengeToken modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("acsReferenceNumber", modelObject.getAcsReferenceNumber());
                jSONObject.putOpt("acsSignedContent", modelObject.getAcsSignedContent());
                jSONObject.putOpt("acsTransID", modelObject.getAcsTransID());
                jSONObject.putOpt("acsURL", modelObject.getAcsURL());
                jSONObject.putOpt("messageVersion", modelObject.getMessageVersion());
                jSONObject.putOpt("threeDSServerTransID", modelObject.getThreeDSServerTransID());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(ChallengeToken.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ ChallengeToken(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6);
    }

    public static /* synthetic */ ChallengeToken copy$default(ChallengeToken challengeToken, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = challengeToken.acsReferenceNumber;
        }
        if ((i11 & 2) != 0) {
            str2 = challengeToken.acsSignedContent;
        }
        if ((i11 & 4) != 0) {
            str3 = challengeToken.acsTransID;
        }
        if ((i11 & 8) != 0) {
            str4 = challengeToken.acsURL;
        }
        if ((i11 & 16) != 0) {
            str5 = challengeToken.messageVersion;
        }
        if ((i11 & 32) != 0) {
            str6 = challengeToken.threeDSServerTransID;
        }
        String str7 = str5;
        String str8 = str6;
        return challengeToken.copy(str, str2, str3, str4, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAcsReferenceNumber() {
        return this.acsReferenceNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAcsSignedContent() {
        return this.acsSignedContent;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAcsTransID() {
        return this.acsTransID;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAcsURL() {
        return this.acsURL;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMessageVersion() {
        return this.messageVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getThreeDSServerTransID() {
        return this.threeDSServerTransID;
    }

    @NotNull
    public final ChallengeToken copy(@Nullable String acsReferenceNumber, @Nullable String acsSignedContent, @Nullable String acsTransID, @Nullable String acsURL, @Nullable String messageVersion, @Nullable String threeDSServerTransID) {
        return new ChallengeToken(acsReferenceNumber, acsSignedContent, acsTransID, acsURL, messageVersion, threeDSServerTransID);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeToken)) {
            return false;
        }
        ChallengeToken challengeToken = (ChallengeToken) other;
        return Intrinsics.areEqual(this.acsReferenceNumber, challengeToken.acsReferenceNumber) && Intrinsics.areEqual(this.acsSignedContent, challengeToken.acsSignedContent) && Intrinsics.areEqual(this.acsTransID, challengeToken.acsTransID) && Intrinsics.areEqual(this.acsURL, challengeToken.acsURL) && Intrinsics.areEqual(this.messageVersion, challengeToken.messageVersion) && Intrinsics.areEqual(this.threeDSServerTransID, challengeToken.threeDSServerTransID);
    }

    @Nullable
    public final String getAcsReferenceNumber() {
        return this.acsReferenceNumber;
    }

    @Nullable
    public final String getAcsSignedContent() {
        return this.acsSignedContent;
    }

    @Nullable
    public final String getAcsTransID() {
        return this.acsTransID;
    }

    @Nullable
    public final String getAcsURL() {
        return this.acsURL;
    }

    @Nullable
    public final String getMessageVersion() {
        return this.messageVersion;
    }

    @Nullable
    public final String getThreeDSServerTransID() {
        return this.threeDSServerTransID;
    }

    public int hashCode() {
        String str = this.acsReferenceNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.acsSignedContent;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.acsTransID;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.acsURL;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.messageVersion;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.threeDSServerTransID;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setAcsReferenceNumber(@Nullable String str) {
        this.acsReferenceNumber = str;
    }

    public final void setAcsSignedContent(@Nullable String str) {
        this.acsSignedContent = str;
    }

    public final void setAcsTransID(@Nullable String str) {
        this.acsTransID = str;
    }

    public final void setAcsURL(@Nullable String str) {
        this.acsURL = str;
    }

    public final void setMessageVersion(@Nullable String str) {
        this.messageVersion = str;
    }

    public final void setThreeDSServerTransID(@Nullable String str) {
        this.threeDSServerTransID = str;
    }

    @NotNull
    public String toString() {
        String str = this.acsReferenceNumber;
        String str2 = this.acsSignedContent;
        String str3 = this.acsTransID;
        String str4 = this.acsURL;
        String str5 = this.messageVersion;
        String str6 = this.threeDSServerTransID;
        StringBuilder sbT = f.t("ChallengeToken(acsReferenceNumber=", str, ", acsSignedContent=", str2, ", acsTransID=");
        s.A(sbT, str3, ", acsURL=", str4, ", messageVersion=");
        return f.o(sbT, str5, ", threeDSServerTransID=", str6, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.acsReferenceNumber);
        parcel.writeString(this.acsSignedContent);
        parcel.writeString(this.acsTransID);
        parcel.writeString(this.acsURL);
        parcel.writeString(this.messageVersion);
        parcel.writeString(this.threeDSServerTransID);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChallengeToken> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ChallengeToken createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new ChallengeToken(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ChallengeToken[] newArray(int i11) {
            return new ChallengeToken[i11];
        }
    }

    public ChallengeToken() {
        this(null, null, null, null, null, null, 63, null);
    }

    public ChallengeToken(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.acsReferenceNumber = str;
        this.acsSignedContent = str2;
        this.acsTransID = str3;
        this.acsURL = str4;
        this.messageVersion = str5;
        this.threeDSServerTransID = str6;
    }
}
