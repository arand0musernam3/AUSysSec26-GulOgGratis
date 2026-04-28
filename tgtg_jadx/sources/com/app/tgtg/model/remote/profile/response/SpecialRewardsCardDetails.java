package com.app.tgtg.model.remote.profile.response;

import com.app.tgtg.model.remote.RewardId;
import com.app.tgtg.model.remote.RewardId$$serializer;
import e0.f;
import i90.g;
import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\\\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u0010\u0010\u001f\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J'\u0010-\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u0013R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\u0013R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010\u0013R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b7\u00101\u001a\u0004\b6\u0010\u0013R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b9\u00101\u001a\u0004\b8\u0010\u0013R \u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b;\u00101\u001a\u0004\b:\u0010\u0013R\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b=\u00101\u001a\u0004\b<\u0010\u0013¨\u0006@"}, d2 = {"Lcom/app/tgtg/model/remote/profile/response/SpecialRewardsCardDetails;", "", "Lcom/app/tgtg/model/remote/RewardId;", "rewardId", "", "rewardName", "rewardPropertiesFirstLine", "rewardPropertiesSecondLine", "storeLogoUrl", "storeName", "expirationDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-r7kTZ_U", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy-PSuK3Us", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/profile/response/SpecialRewardsCardDetails;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/profile/response/SpecialRewardsCardDetails;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getRewardId-r7kTZ_U", "getRewardId-r7kTZ_U$annotations", "()V", "getRewardName", "getRewardName$annotations", "getRewardPropertiesFirstLine", "getRewardPropertiesFirstLine$annotations", "getRewardPropertiesSecondLine", "getRewardPropertiesSecondLine$annotations", "getStoreLogoUrl", "getStoreLogoUrl$annotations", "getStoreName", "getStoreName$annotations", "getExpirationDate", "getExpirationDate$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class SpecialRewardsCardDetails {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String expirationDate;

    @NotNull
    private final String rewardId;

    @NotNull
    private final String rewardName;

    @NotNull
    private final String rewardPropertiesFirstLine;

    @Nullable
    private final String rewardPropertiesSecondLine;

    @Nullable
    private final String storeLogoUrl;

    @NotNull
    private final String storeName;

    private /* synthetic */ SpecialRewardsCardDetails(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, m1 m1Var) {
        if (127 != (i11 & 127)) {
            c1.j(i11, 127, SpecialRewardsCardDetails$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.rewardId = str;
        this.rewardName = str2;
        this.rewardPropertiesFirstLine = str3;
        this.rewardPropertiesSecondLine = str4;
        this.storeLogoUrl = str5;
        this.storeName = str6;
        this.expirationDate = str7;
    }

    /* JADX INFO: renamed from: copy-PSuK3Us$default, reason: not valid java name */
    public static /* synthetic */ SpecialRewardsCardDetails m485copyPSuK3Us$default(SpecialRewardsCardDetails specialRewardsCardDetails, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = specialRewardsCardDetails.rewardId;
        }
        if ((i11 & 2) != 0) {
            str2 = specialRewardsCardDetails.rewardName;
        }
        if ((i11 & 4) != 0) {
            str3 = specialRewardsCardDetails.rewardPropertiesFirstLine;
        }
        if ((i11 & 8) != 0) {
            str4 = specialRewardsCardDetails.rewardPropertiesSecondLine;
        }
        if ((i11 & 16) != 0) {
            str5 = specialRewardsCardDetails.storeLogoUrl;
        }
        if ((i11 & 32) != 0) {
            str6 = specialRewardsCardDetails.storeName;
        }
        if ((i11 & 64) != 0) {
            str7 = specialRewardsCardDetails.expirationDate;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return specialRewardsCardDetails.m488copyPSuK3Us(str, str2, str11, str4, str10, str8, str9);
    }

    public static final /* synthetic */ void write$Self$app(SpecialRewardsCardDetails self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, RewardId$$serializer.INSTANCE, RewardId.m257boximpl(self.rewardId));
        output.q(serialDesc, 1, self.rewardName);
        output.q(serialDesc, 2, self.rewardPropertiesFirstLine);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 3, r1Var, self.rewardPropertiesSecondLine);
        output.r(serialDesc, 4, r1Var, self.storeLogoUrl);
        output.q(serialDesc, 5, self.storeName);
        output.r(serialDesc, 6, r1Var, self.expirationDate);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-r7kTZ_U, reason: not valid java name and from getter */
    public final String getRewardId() {
        return this.rewardId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRewardName() {
        return this.rewardName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRewardPropertiesFirstLine() {
        return this.rewardPropertiesFirstLine;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRewardPropertiesSecondLine() {
        return this.rewardPropertiesSecondLine;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStoreLogoUrl() {
        return this.storeLogoUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-PSuK3Us, reason: not valid java name */
    public final SpecialRewardsCardDetails m488copyPSuK3Us(@NotNull String rewardId, @NotNull String rewardName, @NotNull String rewardPropertiesFirstLine, @Nullable String rewardPropertiesSecondLine, @Nullable String storeLogoUrl, @NotNull String storeName, @Nullable String expirationDate) {
        rewardId.getClass();
        rewardName.getClass();
        rewardPropertiesFirstLine.getClass();
        storeName.getClass();
        return new SpecialRewardsCardDetails(rewardId, rewardName, rewardPropertiesFirstLine, rewardPropertiesSecondLine, storeLogoUrl, storeName, expirationDate, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpecialRewardsCardDetails)) {
            return false;
        }
        SpecialRewardsCardDetails specialRewardsCardDetails = (SpecialRewardsCardDetails) other;
        return RewardId.m261equalsimpl0(this.rewardId, specialRewardsCardDetails.rewardId) && Intrinsics.areEqual(this.rewardName, specialRewardsCardDetails.rewardName) && Intrinsics.areEqual(this.rewardPropertiesFirstLine, specialRewardsCardDetails.rewardPropertiesFirstLine) && Intrinsics.areEqual(this.rewardPropertiesSecondLine, specialRewardsCardDetails.rewardPropertiesSecondLine) && Intrinsics.areEqual(this.storeLogoUrl, specialRewardsCardDetails.storeLogoUrl) && Intrinsics.areEqual(this.storeName, specialRewardsCardDetails.storeName) && Intrinsics.areEqual(this.expirationDate, specialRewardsCardDetails.expirationDate);
    }

    @Nullable
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    @NotNull
    /* JADX INFO: renamed from: getRewardId-r7kTZ_U, reason: not valid java name */
    public final String m489getRewardIdr7kTZ_U() {
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

    @Nullable
    public final String getStoreLogoUrl() {
        return this.storeLogoUrl;
    }

    @NotNull
    public final String getStoreName() {
        return this.storeName;
    }

    public int hashCode() {
        int iB = l1.b(l1.b(RewardId.m262hashCodeimpl(this.rewardId) * 31, 31, this.rewardName), 31, this.rewardPropertiesFirstLine);
        String str = this.rewardPropertiesSecondLine;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.storeLogoUrl;
        int iB2 = l1.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.storeName);
        String str3 = this.expirationDate;
        return iB2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String strM263toStringimpl = RewardId.m263toStringimpl(this.rewardId);
        String str = this.rewardName;
        String str2 = this.rewardPropertiesFirstLine;
        String str3 = this.rewardPropertiesSecondLine;
        String str4 = this.storeLogoUrl;
        String str5 = this.storeName;
        String str6 = this.expirationDate;
        StringBuilder sbT = f.t("SpecialRewardsCardDetails(rewardId=", strM263toStringimpl, ", rewardName=", str, ", rewardPropertiesFirstLine=");
        s.A(sbT, str2, ", rewardPropertiesSecondLine=", str3, ", storeLogoUrl=");
        s.A(sbT, str4, ", storeName=", str5, ", expirationDate=");
        return k.p(sbT, str6, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/profile/response/SpecialRewardsCardDetails$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/profile/response/SpecialRewardsCardDetails;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SpecialRewardsCardDetails$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("expiration_date_utc")
    public static /* synthetic */ void getExpirationDate$annotations() {
    }

    @g("reward_id")
    /* JADX INFO: renamed from: getRewardId-r7kTZ_U$annotations, reason: not valid java name */
    public static /* synthetic */ void m486getRewardIdr7kTZ_U$annotations() {
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

    @g("store_logo_url")
    public static /* synthetic */ void getStoreLogoUrl$annotations() {
    }

    @g("store_name")
    public static /* synthetic */ void getStoreName$annotations() {
    }

    public /* synthetic */ SpecialRewardsCardDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7);
    }

    public /* synthetic */ SpecialRewardsCardDetails(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, str3, str4, str5, str6, str7, m1Var);
    }

    private SpecialRewardsCardDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str6.getClass();
        this.rewardId = str;
        this.rewardName = str2;
        this.rewardPropertiesFirstLine = str3;
        this.rewardPropertiesSecondLine = str4;
        this.storeLogoUrl = str5;
        this.storeName = str6;
        this.expirationDate = str7;
    }
}
