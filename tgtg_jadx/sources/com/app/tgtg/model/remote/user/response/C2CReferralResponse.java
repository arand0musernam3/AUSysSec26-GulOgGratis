package com.app.tgtg.model.remote.user.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.braze.Constants;
import i90.g;
import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import m90.r1;
import n90.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import t1.w1;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002IJBY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u0014J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0014J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u0014J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u0014Jb\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u0014J\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010\u0016J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00106\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b4\u00105R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00107\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010;\u0012\u0004\b=\u0010:\u001a\u0004\b<\u0010\u0014R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010;\u0012\u0004\b?\u0010:\u001a\u0004\b>\u0010\u0014R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010;\u0012\u0004\bA\u0010:\u001a\u0004\b@\u0010\u0014R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010B\u0012\u0004\bD\u0010:\u001a\u0004\bC\u0010#R\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010;\u0012\u0004\bF\u0010:\u001a\u0004\bE\u0010\u0014R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010;\u0012\u0004\bH\u0010:\u001a\u0004\bG\u0010\u0014¨\u0006K"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/C2CReferralResponse;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/user/response/C2CReferralType;", "type", "", "c2cReferralCode", "termsUrl", "c2cReferralPeriodEndAtUtc", "Lcom/app/tgtg/model/remote/user/response/C2CRewardDetails;", "c2cReferralRewardDetails", "onelinkCampaignName", "countryIsoCode", "<init>", "(Lcom/app/tgtg/model/remote/user/response/C2CReferralType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/C2CRewardDetails;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/user/response/C2CReferralType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/C2CRewardDetails;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "toJson", "()Ljava/lang/String;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/user/response/C2CReferralType;", "component2", "component3", "component4", "component5", "()Lcom/app/tgtg/model/remote/user/response/C2CRewardDetails;", "component6", "component7", "copy", "(Lcom/app/tgtg/model/remote/user/response/C2CReferralType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/C2CRewardDetails;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/user/response/C2CReferralResponse;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/C2CReferralResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/app/tgtg/model/remote/user/response/C2CReferralType;", "getType", "getType$annotations", "()V", "Ljava/lang/String;", "getC2cReferralCode", "getC2cReferralCode$annotations", "getTermsUrl", "getTermsUrl$annotations", "getC2cReferralPeriodEndAtUtc", "getC2cReferralPeriodEndAtUtc$annotations", "Lcom/app/tgtg/model/remote/user/response/C2CRewardDetails;", "getC2cReferralRewardDetails", "getC2cReferralRewardDetails$annotations", "getOnelinkCampaignName", "getOnelinkCampaignName$annotations", "getCountryIsoCode", "getCountryIsoCode$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class C2CReferralResponse implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final String c2cReferralCode;

    @Nullable
    private final String c2cReferralPeriodEndAtUtc;

    @Nullable
    private final C2CRewardDetails c2cReferralRewardDetails;

    @Nullable
    private final String countryIsoCode;

    @Nullable
    private final String onelinkCampaignName;

    @Nullable
    private final String termsUrl;

    @NotNull
    private final C2CReferralType type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<C2CReferralResponse> CREATOR = new Creator();

    @NotNull
    private static final c json = w.h(new w1(24));

    public /* synthetic */ C2CReferralResponse(int i11, C2CReferralType c2CReferralType, String str, String str2, String str3, C2CRewardDetails c2CRewardDetails, String str4, String str5, m1 m1Var) {
        this.type = (i11 & 1) == 0 ? C2CReferralType.UNKNOWN : c2CReferralType;
        if ((i11 & 2) == 0) {
            this.c2cReferralCode = null;
        } else {
            this.c2cReferralCode = str;
        }
        if ((i11 & 4) == 0) {
            this.termsUrl = null;
        } else {
            this.termsUrl = str2;
        }
        if ((i11 & 8) == 0) {
            this.c2cReferralPeriodEndAtUtc = null;
        } else {
            this.c2cReferralPeriodEndAtUtc = str3;
        }
        if ((i11 & 16) == 0) {
            this.c2cReferralRewardDetails = null;
        } else {
            this.c2cReferralRewardDetails = c2CRewardDetails;
        }
        if ((i11 & 32) == 0) {
            this.onelinkCampaignName = null;
        } else {
            this.onelinkCampaignName = str4;
        }
        if ((i11 & 64) == 0) {
            this.countryIsoCode = null;
        } else {
            this.countryIsoCode = str5;
        }
    }

    public static /* synthetic */ C2CReferralResponse copy$default(C2CReferralResponse c2CReferralResponse, C2CReferralType c2CReferralType, String str, String str2, String str3, C2CRewardDetails c2CRewardDetails, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c2CReferralType = c2CReferralResponse.type;
        }
        if ((i11 & 2) != 0) {
            str = c2CReferralResponse.c2cReferralCode;
        }
        if ((i11 & 4) != 0) {
            str2 = c2CReferralResponse.termsUrl;
        }
        if ((i11 & 8) != 0) {
            str3 = c2CReferralResponse.c2cReferralPeriodEndAtUtc;
        }
        if ((i11 & 16) != 0) {
            c2CRewardDetails = c2CReferralResponse.c2cReferralRewardDetails;
        }
        if ((i11 & 32) != 0) {
            str4 = c2CReferralResponse.onelinkCampaignName;
        }
        if ((i11 & 64) != 0) {
            str5 = c2CReferralResponse.countryIsoCode;
        }
        String str6 = str4;
        String str7 = str5;
        C2CRewardDetails c2CRewardDetails2 = c2CRewardDetails;
        String str8 = str2;
        return c2CReferralResponse.copy(c2CReferralType, str, str8, str3, c2CRewardDetails2, str6, str7);
    }

    @NotNull
    public static final C2CReferralResponse fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(n90.h hVar) {
        hVar.getClass();
        hVar.f30766c = true;
        return Unit.f26487a;
    }

    public static final /* synthetic */ void write$Self$app(C2CReferralResponse self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.type != C2CReferralType.UNKNOWN) {
            output.i(serialDesc, 0, C2CReferralTypeSerializer.INSTANCE, self.type);
        }
        if (output.C(serialDesc) || self.c2cReferralCode != null) {
            output.r(serialDesc, 1, r1.f29848a, self.c2cReferralCode);
        }
        if (output.C(serialDesc) || self.termsUrl != null) {
            output.r(serialDesc, 2, r1.f29848a, self.termsUrl);
        }
        if (output.C(serialDesc) || self.c2cReferralPeriodEndAtUtc != null) {
            output.r(serialDesc, 3, r1.f29848a, self.c2cReferralPeriodEndAtUtc);
        }
        if (output.C(serialDesc) || self.c2cReferralRewardDetails != null) {
            output.r(serialDesc, 4, C2CRewardDetails$$serializer.INSTANCE, self.c2cReferralRewardDetails);
        }
        if (output.C(serialDesc) || self.onelinkCampaignName != null) {
            output.r(serialDesc, 5, r1.f29848a, self.onelinkCampaignName);
        }
        if (!output.C(serialDesc) && self.countryIsoCode == null) {
            return;
        }
        output.r(serialDesc, 6, r1.f29848a, self.countryIsoCode);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C2CReferralType getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getC2cReferralCode() {
        return this.c2cReferralCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTermsUrl() {
        return this.termsUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getC2cReferralPeriodEndAtUtc() {
        return this.c2cReferralPeriodEndAtUtc;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C2CRewardDetails getC2cReferralRewardDetails() {
        return this.c2cReferralRewardDetails;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOnelinkCampaignName() {
        return this.onelinkCampaignName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCountryIsoCode() {
        return this.countryIsoCode;
    }

    @NotNull
    public final C2CReferralResponse copy(@NotNull C2CReferralType type, @Nullable String c2cReferralCode, @Nullable String termsUrl, @Nullable String c2cReferralPeriodEndAtUtc, @Nullable C2CRewardDetails c2cReferralRewardDetails, @Nullable String onelinkCampaignName, @Nullable String countryIsoCode) {
        type.getClass();
        return new C2CReferralResponse(type, c2cReferralCode, termsUrl, c2cReferralPeriodEndAtUtc, c2cReferralRewardDetails, onelinkCampaignName, countryIsoCode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2CReferralResponse)) {
            return false;
        }
        C2CReferralResponse c2CReferralResponse = (C2CReferralResponse) other;
        return this.type == c2CReferralResponse.type && Intrinsics.areEqual(this.c2cReferralCode, c2CReferralResponse.c2cReferralCode) && Intrinsics.areEqual(this.termsUrl, c2CReferralResponse.termsUrl) && Intrinsics.areEqual(this.c2cReferralPeriodEndAtUtc, c2CReferralResponse.c2cReferralPeriodEndAtUtc) && Intrinsics.areEqual(this.c2cReferralRewardDetails, c2CReferralResponse.c2cReferralRewardDetails) && Intrinsics.areEqual(this.onelinkCampaignName, c2CReferralResponse.onelinkCampaignName) && Intrinsics.areEqual(this.countryIsoCode, c2CReferralResponse.countryIsoCode);
    }

    @Nullable
    public final String getC2cReferralCode() {
        return this.c2cReferralCode;
    }

    @Nullable
    public final String getC2cReferralPeriodEndAtUtc() {
        return this.c2cReferralPeriodEndAtUtc;
    }

    @Nullable
    public final C2CRewardDetails getC2cReferralRewardDetails() {
        return this.c2cReferralRewardDetails;
    }

    @Nullable
    public final String getCountryIsoCode() {
        return this.countryIsoCode;
    }

    @Nullable
    public final String getOnelinkCampaignName() {
        return this.onelinkCampaignName;
    }

    @Nullable
    public final String getTermsUrl() {
        return this.termsUrl;
    }

    @NotNull
    public final C2CReferralType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.c2cReferralCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.termsUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c2cReferralPeriodEndAtUtc;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C2CRewardDetails c2CRewardDetails = this.c2cReferralRewardDetails;
        int iHashCode5 = (iHashCode4 + (c2CRewardDetails == null ? 0 : c2CRewardDetails.hashCode())) * 31;
        String str4 = this.onelinkCampaignName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.countryIsoCode;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public final String toJson() {
        return c.f30748d.c(INSTANCE.serializer(), this);
    }

    @NotNull
    public String toString() {
        C2CReferralType c2CReferralType = this.type;
        String str = this.c2cReferralCode;
        String str2 = this.termsUrl;
        String str3 = this.c2cReferralPeriodEndAtUtc;
        C2CRewardDetails c2CRewardDetails = this.c2cReferralRewardDetails;
        String str4 = this.onelinkCampaignName;
        String str5 = this.countryIsoCode;
        StringBuilder sb2 = new StringBuilder("C2CReferralResponse(type=");
        sb2.append(c2CReferralType);
        sb2.append(", c2cReferralCode=");
        sb2.append(str);
        sb2.append(", termsUrl=");
        s.A(sb2, str2, ", c2cReferralPeriodEndAtUtc=", str3, ", c2cReferralRewardDetails=");
        sb2.append(c2CRewardDetails);
        sb2.append(", onelinkCampaignName=");
        sb2.append(str4);
        sb2.append(", countryIsoCode=");
        return k.p(sb2, str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.type.name());
        dest.writeString(this.c2cReferralCode);
        dest.writeString(this.termsUrl);
        dest.writeString(this.c2cReferralPeriodEndAtUtc);
        C2CRewardDetails c2CRewardDetails = this.c2cReferralRewardDetails;
        if (c2CRewardDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c2CRewardDetails.writeToParcel(dest, flags);
        }
        dest.writeString(this.onelinkCampaignName);
        dest.writeString(this.countryIsoCode);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/C2CReferralResponse$Companion;", "", "<init>", "()V", "", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "Lcom/app/tgtg/model/remote/user/response/C2CReferralResponse;", "fromJson", "(Ljava/lang/String;)Lcom/app/tgtg/model/remote/user/response/C2CReferralResponse;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Ln90/c;", "json", "Ln90/c;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final C2CReferralResponse fromJson(@NotNull String s7) {
            s7.getClass();
            return (C2CReferralResponse) C2CReferralResponse.json.b(serializer(), s7);
        }

        @NotNull
        public final KSerializer serializer() {
            return C2CReferralResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<C2CReferralResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final C2CReferralResponse createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new C2CReferralResponse(C2CReferralType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : C2CRewardDetails.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final C2CReferralResponse[] newArray(int i11) {
            return new C2CReferralResponse[i11];
        }
    }

    @g("referral_code")
    public static /* synthetic */ void getC2cReferralCode$annotations() {
    }

    @g("referral_period_end_at_utc")
    public static /* synthetic */ void getC2cReferralPeriodEndAtUtc$annotations() {
    }

    @g("reward_details")
    public static /* synthetic */ void getC2cReferralRewardDetails$annotations() {
    }

    @g("country_iso_code")
    public static /* synthetic */ void getCountryIsoCode$annotations() {
    }

    @g("onelink_campaign_name")
    public static /* synthetic */ void getOnelinkCampaignName$annotations() {
    }

    @g("terms_url")
    public static /* synthetic */ void getTermsUrl$annotations() {
    }

    @g("type")
    public static /* synthetic */ void getType$annotations() {
    }

    public C2CReferralResponse() {
        this((C2CReferralType) null, (String) null, (String) null, (String) null, (C2CRewardDetails) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public C2CReferralResponse(@NotNull C2CReferralType c2CReferralType, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable C2CRewardDetails c2CRewardDetails, @Nullable String str4, @Nullable String str5) {
        c2CReferralType.getClass();
        this.type = c2CReferralType;
        this.c2cReferralCode = str;
        this.termsUrl = str2;
        this.c2cReferralPeriodEndAtUtc = str3;
        this.c2cReferralRewardDetails = c2CRewardDetails;
        this.onelinkCampaignName = str4;
        this.countryIsoCode = str5;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ C2CReferralResponse(com.app.tgtg.model.remote.user.response.C2CReferralType r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, com.app.tgtg.model.remote.user.response.C2CRewardDetails r6, java.lang.String r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            com.app.tgtg.model.remote.user.response.C2CReferralType r2 = com.app.tgtg.model.remote.user.response.C2CReferralType.UNKNOWN
        L6:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto Lc
            r3 = r0
        Lc:
            r10 = r9 & 4
            if (r10 == 0) goto L11
            r4 = r0
        L11:
            r10 = r9 & 8
            if (r10 == 0) goto L16
            r5 = r0
        L16:
            r10 = r9 & 16
            if (r10 == 0) goto L1b
            r6 = r0
        L1b:
            r10 = r9 & 32
            if (r10 == 0) goto L20
            r7 = r0
        L20:
            r9 = r9 & 64
            if (r9 == 0) goto L2d
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L35
        L2d:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L35:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.user.response.C2CReferralResponse.<init>(com.app.tgtg.model.remote.user.response.C2CReferralType, java.lang.String, java.lang.String, java.lang.String, com.app.tgtg.model.remote.user.response.C2CRewardDetails, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
