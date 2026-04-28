package com.app.tgtg.model.local;

import android.os.Parcel;
import android.os.Parcelable;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006!"}, d2 = {"Lcom/app/tgtg/model/local/DeeplinkC2CReferralData;", "Landroid/os/Parcelable;", "code", "", "type", "deviceIdPersonA", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "getType", "setType", "getDeviceIdPersonA", "setDeviceIdPersonA", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DeeplinkC2CReferralData implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<DeeplinkC2CReferralData> CREATOR = new Creator();

    @Nullable
    private String code;

    @Nullable
    private String deviceIdPersonA;

    @Nullable
    private String type;

    public DeeplinkC2CReferralData(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.code = str;
        this.type = str2;
        this.deviceIdPersonA = str3;
    }

    public static /* synthetic */ DeeplinkC2CReferralData copy$default(DeeplinkC2CReferralData deeplinkC2CReferralData, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = deeplinkC2CReferralData.code;
        }
        if ((i11 & 2) != 0) {
            str2 = deeplinkC2CReferralData.type;
        }
        if ((i11 & 4) != 0) {
            str3 = deeplinkC2CReferralData.deviceIdPersonA;
        }
        return deeplinkC2CReferralData.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceIdPersonA() {
        return this.deviceIdPersonA;
    }

    @NotNull
    public final DeeplinkC2CReferralData copy(@Nullable String code, @Nullable String type, @Nullable String deviceIdPersonA) {
        return new DeeplinkC2CReferralData(code, type, deviceIdPersonA);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeeplinkC2CReferralData)) {
            return false;
        }
        DeeplinkC2CReferralData deeplinkC2CReferralData = (DeeplinkC2CReferralData) other;
        return Intrinsics.areEqual(this.code, deeplinkC2CReferralData.code) && Intrinsics.areEqual(this.type, deeplinkC2CReferralData.type) && Intrinsics.areEqual(this.deviceIdPersonA, deeplinkC2CReferralData.deviceIdPersonA);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getDeviceIdPersonA() {
        return this.deviceIdPersonA;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceIdPersonA;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setCode(@Nullable String str) {
        this.code = str;
    }

    public final void setDeviceIdPersonA(@Nullable String str) {
        this.deviceIdPersonA = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        String str = this.code;
        String str2 = this.type;
        return k.p(f.t("DeeplinkC2CReferralData(code=", str, ", type=", str2, ", deviceIdPersonA="), this.deviceIdPersonA, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.code);
        dest.writeString(this.type);
        dest.writeString(this.deviceIdPersonA);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeeplinkC2CReferralData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeeplinkC2CReferralData createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new DeeplinkC2CReferralData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeeplinkC2CReferralData[] newArray(int i11) {
            return new DeeplinkC2CReferralData[i11];
        }
    }
}
