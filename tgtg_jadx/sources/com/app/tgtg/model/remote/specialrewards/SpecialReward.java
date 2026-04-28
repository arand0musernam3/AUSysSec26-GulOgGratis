package com.app.tgtg.model.remote.specialrewards;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.RewardId;
import com.app.tgtg.model.remote.RewardId$$serializer;
import com.app.tgtg.model.remote.StoreId;
import com.app.tgtg.model.remote.StoreId$$serializer;
import com.app.tgtg.model.remote.profile.response.SpecialRewardsCardDetails;
import com.braze.Constants;
import e0.f;
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
import m90.c1;
import m90.m1;
import m90.r1;
import n90.c;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qb.r;
import w.a0;
import w2.l1;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 a2\u00020\u0001:\u0002abB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u009b\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\u001bJ\u0010\u0010(\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010\u001bJ\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010\u001bJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010\u001bJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010\u001bJ\u0010\u0010,\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b,\u0010\u001bJ\u0010\u0010-\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b-\u0010\u001bJ\u0010\u0010.\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b.\u0010\u001bJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b/\u0010\u001bJ\u0010\u00100\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b0\u0010\u001bJ\u0012\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b1\u0010\u001bJ\u0010\u00102\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b2\u00103J\u009a\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00107\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b7\u0010\u001bJ\u0010\u00108\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b8\u0010\u001dJ\u001a\u0010;\u001a\u00020\u00112\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003¢\u0006\u0004\b;\u0010<J'\u0010D\u001a\u00020!2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0001¢\u0006\u0004\bB\u0010CR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010E\u0012\u0004\bG\u0010H\u001a\u0004\bF\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010E\u0012\u0004\bJ\u0010H\u001a\u0004\bI\u0010\u001bR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010E\u0012\u0004\bL\u0010H\u001a\u0004\bK\u0010\u001bR \u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010E\u0012\u0004\bN\u0010H\u001a\u0004\bM\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010E\u0012\u0004\bP\u0010H\u001a\u0004\bO\u0010\u001bR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010E\u0012\u0004\bR\u0010H\u001a\u0004\bQ\u0010\u001bR \u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010E\u0012\u0004\bT\u0010H\u001a\u0004\bS\u0010\u001bR \u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010E\u0012\u0004\bV\u0010H\u001a\u0004\bU\u0010\u001bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010E\u0012\u0004\bX\u0010H\u001a\u0004\bW\u0010\u001bR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010E\u0012\u0004\bZ\u0010H\u001a\u0004\bY\u0010\u001bR \u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010E\u0012\u0004\b\\\u0010H\u001a\u0004\b[\u0010\u001bR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010E\u0012\u0004\b^\u0010H\u001a\u0004\b]\u0010\u001bR \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010_\u0012\u0004\b`\u0010H\u001a\u0004\b\u0012\u00103¨\u0006c"}, d2 = {"Lcom/app/tgtg/model/remote/specialrewards/SpecialReward;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/RewardId;", "rewardId", "", "rewardName", "Lcom/app/tgtg/model/remote/StoreId;", "storeId", "status", "expirationDate", "storeLogoUrl", "storeName", "storeAddress", "rewardPropertiesFirstLine", "rewardPropertiesSecondLine", "termsUrl", "redeemDate", "", "isExpiringSoon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toJson", "()Ljava/lang/String;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1-r7kTZ_U", "component1", "component2", "component3-Q2NXY1A", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Z", "copy-OcPTFWk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/app/tgtg/model/remote/specialrewards/SpecialReward;", "copy", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/specialrewards/SpecialReward;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getRewardId-r7kTZ_U", "getRewardId-r7kTZ_U$annotations", "()V", "getRewardName", "getRewardName$annotations", "getStoreId-Q2NXY1A", "getStoreId-Q2NXY1A$annotations", "getStatus", "getStatus$annotations", "getExpirationDate", "getExpirationDate$annotations", "getStoreLogoUrl", "getStoreLogoUrl$annotations", "getStoreName", "getStoreName$annotations", "getStoreAddress", "getStoreAddress$annotations", "getRewardPropertiesFirstLine", "getRewardPropertiesFirstLine$annotations", "getRewardPropertiesSecondLine", "getRewardPropertiesSecondLine$annotations", "getTermsUrl", "getTermsUrl$annotations", "getRedeemDate", "getRedeemDate$annotations", "Z", "isExpiringSoon$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class SpecialReward implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final String expirationDate;
    private final boolean isExpiringSoon;

    @Nullable
    private final String redeemDate;

    @NotNull
    private final String rewardId;

    @NotNull
    private final String rewardName;

    @NotNull
    private final String rewardPropertiesFirstLine;

    @Nullable
    private final String rewardPropertiesSecondLine;

    @NotNull
    private final String status;

    @NotNull
    private final String storeAddress;

    @NotNull
    private final String storeId;

    @Nullable
    private final String storeLogoUrl;

    @NotNull
    private final String storeName;

    @NotNull
    private final String termsUrl;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<SpecialReward> CREATOR = new Creator();

    @NotNull
    private static final c json = w.h(new r(18));

    private /* synthetic */ SpecialReward(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z11, m1 m1Var) {
        if (2047 != (i11 & 2047)) {
            c1.j(i11, 2047, SpecialReward$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.rewardId = str;
        this.rewardName = str2;
        this.storeId = str3;
        this.status = str4;
        this.expirationDate = str5;
        this.storeLogoUrl = str6;
        this.storeName = str7;
        this.storeAddress = str8;
        this.rewardPropertiesFirstLine = str9;
        this.rewardPropertiesSecondLine = str10;
        this.termsUrl = str11;
        if ((i11 & NewHope.SENDB_BYTES) == 0) {
            this.redeemDate = null;
        } else {
            this.redeemDate = str12;
        }
        this.isExpiringSoon = (i11 & 4096) == 0 ? false : z11;
    }

    /* JADX INFO: renamed from: copy-OcPTFWk$default, reason: not valid java name */
    public static /* synthetic */ SpecialReward m490copyOcPTFWk$default(SpecialReward specialReward, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = specialReward.rewardId;
        }
        return specialReward.m495copyOcPTFWk(str, (i11 & 2) != 0 ? specialReward.rewardName : str2, (i11 & 4) != 0 ? specialReward.storeId : str3, (i11 & 8) != 0 ? specialReward.status : str4, (i11 & 16) != 0 ? specialReward.expirationDate : str5, (i11 & 32) != 0 ? specialReward.storeLogoUrl : str6, (i11 & 64) != 0 ? specialReward.storeName : str7, (i11 & 128) != 0 ? specialReward.storeAddress : str8, (i11 & 256) != 0 ? specialReward.rewardPropertiesFirstLine : str9, (i11 & 512) != 0 ? specialReward.rewardPropertiesSecondLine : str10, (i11 & 1024) != 0 ? specialReward.termsUrl : str11, (i11 & NewHope.SENDB_BYTES) != 0 ? specialReward.redeemDate : str12, (i11 & 4096) != 0 ? specialReward.isExpiringSoon : z11);
    }

    @NotNull
    public static final SpecialReward fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(n90.h hVar) {
        hVar.getClass();
        hVar.f30766c = true;
        return Unit.f26487a;
    }

    public static final /* synthetic */ void write$Self$app(SpecialReward self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, RewardId$$serializer.INSTANCE, RewardId.m257boximpl(self.rewardId));
        output.q(serialDesc, 1, self.rewardName);
        output.i(serialDesc, 2, StoreId$$serializer.INSTANCE, StoreId.m269boximpl(self.storeId));
        output.q(serialDesc, 3, self.status);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 4, r1Var, self.expirationDate);
        output.r(serialDesc, 5, r1Var, self.storeLogoUrl);
        output.q(serialDesc, 6, self.storeName);
        output.q(serialDesc, 7, self.storeAddress);
        output.q(serialDesc, 8, self.rewardPropertiesFirstLine);
        output.r(serialDesc, 9, r1Var, self.rewardPropertiesSecondLine);
        output.q(serialDesc, 10, self.termsUrl);
        if (output.C(serialDesc) || self.redeemDate != null) {
            output.r(serialDesc, 11, r1Var, self.redeemDate);
        }
        if (output.C(serialDesc) || self.isExpiringSoon) {
            output.p(serialDesc, 12, self.isExpiringSoon);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1-r7kTZ_U, reason: not valid java name and from getter */
    public final String getRewardId() {
        return this.rewardId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRewardPropertiesSecondLine() {
        return this.rewardPropertiesSecondLine;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTermsUrl() {
        return this.termsUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRedeemDate() {
        return this.redeemDate;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsExpiringSoon() {
        return this.isExpiringSoon;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRewardName() {
        return this.rewardName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3-Q2NXY1A, reason: not valid java name and from getter */
    public final String getStoreId() {
        return this.storeId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStoreLogoUrl() {
        return this.storeLogoUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStoreAddress() {
        return this.storeAddress;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRewardPropertiesFirstLine() {
        return this.rewardPropertiesFirstLine;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-OcPTFWk, reason: not valid java name */
    public final SpecialReward m495copyOcPTFWk(@NotNull String rewardId, @NotNull String rewardName, @NotNull String storeId, @NotNull String status, @Nullable String expirationDate, @Nullable String storeLogoUrl, @NotNull String storeName, @NotNull String storeAddress, @NotNull String rewardPropertiesFirstLine, @Nullable String rewardPropertiesSecondLine, @NotNull String termsUrl, @Nullable String redeemDate, boolean isExpiringSoon) {
        i.B(rewardId, rewardName, storeId, status, storeName);
        storeAddress.getClass();
        rewardPropertiesFirstLine.getClass();
        termsUrl.getClass();
        return new SpecialReward(rewardId, rewardName, storeId, status, expirationDate, storeLogoUrl, storeName, storeAddress, rewardPropertiesFirstLine, rewardPropertiesSecondLine, termsUrl, redeemDate, isExpiringSoon, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpecialReward)) {
            return false;
        }
        SpecialReward specialReward = (SpecialReward) other;
        return RewardId.m261equalsimpl0(this.rewardId, specialReward.rewardId) && Intrinsics.areEqual(this.rewardName, specialReward.rewardName) && StoreId.m273equalsimpl0(this.storeId, specialReward.storeId) && Intrinsics.areEqual(this.status, specialReward.status) && Intrinsics.areEqual(this.expirationDate, specialReward.expirationDate) && Intrinsics.areEqual(this.storeLogoUrl, specialReward.storeLogoUrl) && Intrinsics.areEqual(this.storeName, specialReward.storeName) && Intrinsics.areEqual(this.storeAddress, specialReward.storeAddress) && Intrinsics.areEqual(this.rewardPropertiesFirstLine, specialReward.rewardPropertiesFirstLine) && Intrinsics.areEqual(this.rewardPropertiesSecondLine, specialReward.rewardPropertiesSecondLine) && Intrinsics.areEqual(this.termsUrl, specialReward.termsUrl) && Intrinsics.areEqual(this.redeemDate, specialReward.redeemDate) && this.isExpiringSoon == specialReward.isExpiringSoon;
    }

    @Nullable
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    @Nullable
    public final String getRedeemDate() {
        return this.redeemDate;
    }

    @NotNull
    /* JADX INFO: renamed from: getRewardId-r7kTZ_U, reason: not valid java name */
    public final String m496getRewardIdr7kTZ_U() {
        return this.rewardId;
    }

    @NotNull
    public final String getRewardName() {
        return this.rewardName;
    }

    @NotNull
    public final String getRewardPropertiesFirstLine() {
        return this.rewardPropertiesFirstLine;
    }

    @Nullable
    public final String getRewardPropertiesSecondLine() {
        return this.rewardPropertiesSecondLine;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getStoreAddress() {
        return this.storeAddress;
    }

    @NotNull
    /* JADX INFO: renamed from: getStoreId-Q2NXY1A, reason: not valid java name */
    public final String m497getStoreIdQ2NXY1A() {
        return this.storeId;
    }

    @Nullable
    public final String getStoreLogoUrl() {
        return this.storeLogoUrl;
    }

    @NotNull
    public final String getStoreName() {
        return this.storeName;
    }

    @NotNull
    public final String getTermsUrl() {
        return this.termsUrl;
    }

    public int hashCode() {
        int iB = l1.b((StoreId.m274hashCodeimpl(this.storeId) + l1.b(RewardId.m262hashCodeimpl(this.rewardId) * 31, 31, this.rewardName)) * 31, 31, this.status);
        String str = this.expirationDate;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.storeLogoUrl;
        int iB2 = l1.b(l1.b(l1.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.storeName), 31, this.storeAddress), 31, this.rewardPropertiesFirstLine);
        String str3 = this.rewardPropertiesSecondLine;
        int iB3 = l1.b((iB2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.termsUrl);
        String str4 = this.redeemDate;
        return Boolean.hashCode(this.isExpiringSoon) + ((iB3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final boolean isExpiringSoon() {
        return this.isExpiringSoon;
    }

    @NotNull
    public final String toJson() {
        return c.f30748d.c(INSTANCE.serializer(), this);
    }

    @NotNull
    public String toString() {
        String strM263toStringimpl = RewardId.m263toStringimpl(this.rewardId);
        String str = this.rewardName;
        String strM275toStringimpl = StoreId.m275toStringimpl(this.storeId);
        String str2 = this.status;
        String str3 = this.expirationDate;
        String str4 = this.storeLogoUrl;
        String str5 = this.storeName;
        String str6 = this.storeAddress;
        String str7 = this.rewardPropertiesFirstLine;
        String str8 = this.rewardPropertiesSecondLine;
        String str9 = this.termsUrl;
        String str10 = this.redeemDate;
        boolean z11 = this.isExpiringSoon;
        StringBuilder sbT = f.t("SpecialReward(rewardId=", strM263toStringimpl, ", rewardName=", str, ", storeId=");
        s.A(sbT, strM275toStringimpl, ", status=", str2, ", expirationDate=");
        s.A(sbT, str3, ", storeLogoUrl=", str4, ", storeName=");
        s.A(sbT, str5, ", storeAddress=", str6, ", rewardPropertiesFirstLine=");
        s.A(sbT, str7, ", rewardPropertiesSecondLine=", str8, ", termsUrl=");
        s.A(sbT, str9, ", redeemDate=", str10, ", isExpiringSoon=");
        return s.o(sbT, z11, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        RewardId.m264writeToParcelimpl(this.rewardId, dest, flags);
        dest.writeString(this.rewardName);
        StoreId.m276writeToParcelimpl(this.storeId, dest, flags);
        dest.writeString(this.status);
        dest.writeString(this.expirationDate);
        dest.writeString(this.storeLogoUrl);
        dest.writeString(this.storeName);
        dest.writeString(this.storeAddress);
        dest.writeString(this.rewardPropertiesFirstLine);
        dest.writeString(this.rewardPropertiesSecondLine);
        dest.writeString(this.termsUrl);
        dest.writeString(this.redeemDate);
        dest.writeInt(this.isExpiringSoon ? 1 : 0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/app/tgtg/model/remote/specialrewards/SpecialReward$Companion;", "", "<init>", "()V", "", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "Lcom/app/tgtg/model/remote/specialrewards/SpecialReward;", "fromJson", "(Ljava/lang/String;)Lcom/app/tgtg/model/remote/specialrewards/SpecialReward;", "status", "", "isExpiringSoon", "Lcom/app/tgtg/model/remote/profile/response/SpecialRewardsCardDetails;", ErrorBundle.DETAIL_ENTRY, "mapProfileSpecialRewards", "(Ljava/lang/String;ZLcom/app/tgtg/model/remote/profile/response/SpecialRewardsCardDetails;)Lcom/app/tgtg/model/remote/specialrewards/SpecialReward;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Ln90/c;", "json", "Ln90/c;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SpecialReward fromJson(@NotNull String s7) {
            s7.getClass();
            return (SpecialReward) SpecialReward.json.b(serializer(), s7);
        }

        @NotNull
        public final SpecialReward mapProfileSpecialRewards(@NotNull String status, boolean isExpiringSoon, @NotNull SpecialRewardsCardDetails details) {
            status.getClass();
            details.getClass();
            return new SpecialReward(details.m489getRewardIdr7kTZ_U(), details.getRewardName(), StoreId.m270constructorimpl("0"), status, details.getExpirationDate(), details.getStoreLogoUrl(), details.getStoreName(), "", details.getRewardPropertiesFirstLine(), details.getRewardPropertiesSecondLine(), "", (String) null, isExpiringSoon, NewHope.SENDB_BYTES, (DefaultConstructorMarker) null);
        }

        @NotNull
        public final KSerializer serializer() {
            return SpecialReward$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SpecialReward> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpecialReward createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SpecialReward(RewardId.CREATOR.createFromParcel(parcel).m265unboximpl(), parcel.readString(), StoreId.CREATOR.createFromParcel(parcel).m277unboximpl(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpecialReward[] newArray(int i11) {
            return new SpecialReward[i11];
        }
    }

    @g("expiration_date_utc")
    public static /* synthetic */ void getExpirationDate$annotations() {
    }

    @g("redeemed_at_utc")
    public static /* synthetic */ void getRedeemDate$annotations() {
    }

    @g("reward_id")
    /* JADX INFO: renamed from: getRewardId-r7kTZ_U$annotations, reason: not valid java name */
    public static /* synthetic */ void m491getRewardIdr7kTZ_U$annotations() {
    }

    @g("reward_name")
    public static /* synthetic */ void getRewardName$annotations() {
    }

    @g("reward_properties_first_line_text")
    public static /* synthetic */ void getRewardPropertiesFirstLine$annotations() {
    }

    @g("reward_properties_second_line_text")
    public static /* synthetic */ void getRewardPropertiesSecondLine$annotations() {
    }

    @g("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @g("store_address")
    public static /* synthetic */ void getStoreAddress$annotations() {
    }

    @g("store_id")
    /* JADX INFO: renamed from: getStoreId-Q2NXY1A$annotations, reason: not valid java name */
    public static /* synthetic */ void m492getStoreIdQ2NXY1A$annotations() {
    }

    @g("store_logo_url")
    public static /* synthetic */ void getStoreLogoUrl$annotations() {
    }

    @g("store_name")
    public static /* synthetic */ void getStoreName$annotations() {
    }

    @g("terms_url")
    public static /* synthetic */ void getTermsUrl$annotations() {
    }

    @g("is_expiring_soon")
    public static /* synthetic */ void isExpiringSoon$annotations() {
    }

    private SpecialReward(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z11) {
        i.B(str, str2, str3, str4, str7);
        a0.C(str8, str9, str11);
        this.rewardId = str;
        this.rewardName = str2;
        this.storeId = str3;
        this.status = str4;
        this.expirationDate = str5;
        this.storeLogoUrl = str6;
        this.storeName = str7;
        this.storeAddress = str8;
        this.rewardPropertiesFirstLine = str9;
        this.rewardPropertiesSecondLine = str10;
        this.termsUrl = str11;
        this.redeemDate = str12;
        this.isExpiringSoon = z11;
    }

    public /* synthetic */ SpecialReward(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z11);
    }

    public /* synthetic */ SpecialReward(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z11, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z11, m1Var);
    }

    public /* synthetic */ SpecialReward(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, (i11 & NewHope.SENDB_BYTES) != 0 ? null : str12, (i11 & 4096) != 0 ? false : z11, null);
    }
}
