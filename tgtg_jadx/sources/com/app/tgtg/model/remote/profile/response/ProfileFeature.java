package com.app.tgtg.model.remote.profile.response;

import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KJB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)JT\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\u001fR(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u00109\u0012\u0004\b=\u00108\u001a\u0004\b:\u0010!\"\u0004\b;\u0010<R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010>\u0012\u0004\b@\u00108\u001a\u0004\b?\u0010#R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010A\u0012\u0004\bC\u00108\u001a\u0004\bB\u0010%R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010D\u0012\u0004\bF\u00108\u001a\u0004\bE\u0010'R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010G\u0012\u0004\bI\u00108\u001a\u0004\bH\u0010)¨\u0006L"}, d2 = {"Lcom/app/tgtg/model/remote/profile/response/ProfileFeature;", "", "Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureType;", "featureType", "Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureState;", "featureState", "Lcom/app/tgtg/model/remote/profile/response/LoyaltyCardDetails;", "loyaltyCardDetails", "Lcom/app/tgtg/model/remote/profile/response/C2CReferralDetails;", "c2cReferralDetails", "Lcom/app/tgtg/model/remote/profile/response/SpecialRewardsCardDetails;", "specialRewardsDetails", "Lcom/app/tgtg/model/remote/profile/response/StoreSignupCardDetails;", "storeSignupDetails", "<init>", "(Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureType;Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureState;Lcom/app/tgtg/model/remote/profile/response/LoyaltyCardDetails;Lcom/app/tgtg/model/remote/profile/response/C2CReferralDetails;Lcom/app/tgtg/model/remote/profile/response/SpecialRewardsCardDetails;Lcom/app/tgtg/model/remote/profile/response/StoreSignupCardDetails;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/profile/response/ProfileFeatureType;Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureState;Lcom/app/tgtg/model/remote/profile/response/LoyaltyCardDetails;Lcom/app/tgtg/model/remote/profile/response/C2CReferralDetails;Lcom/app/tgtg/model/remote/profile/response/SpecialRewardsCardDetails;Lcom/app/tgtg/model/remote/profile/response/StoreSignupCardDetails;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/profile/response/ProfileFeature;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureType;", "component2", "()Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureState;", "component3", "()Lcom/app/tgtg/model/remote/profile/response/LoyaltyCardDetails;", "component4", "()Lcom/app/tgtg/model/remote/profile/response/C2CReferralDetails;", "component5", "()Lcom/app/tgtg/model/remote/profile/response/SpecialRewardsCardDetails;", "component6", "()Lcom/app/tgtg/model/remote/profile/response/StoreSignupCardDetails;", "copy", "(Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureType;Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureState;Lcom/app/tgtg/model/remote/profile/response/LoyaltyCardDetails;Lcom/app/tgtg/model/remote/profile/response/C2CReferralDetails;Lcom/app/tgtg/model/remote/profile/response/SpecialRewardsCardDetails;Lcom/app/tgtg/model/remote/profile/response/StoreSignupCardDetails;)Lcom/app/tgtg/model/remote/profile/response/ProfileFeature;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureType;", "getFeatureType", "getFeatureType$annotations", "()V", "Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureState;", "getFeatureState", "setFeatureState", "(Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureState;)V", "getFeatureState$annotations", "Lcom/app/tgtg/model/remote/profile/response/LoyaltyCardDetails;", "getLoyaltyCardDetails", "getLoyaltyCardDetails$annotations", "Lcom/app/tgtg/model/remote/profile/response/C2CReferralDetails;", "getC2cReferralDetails", "getC2cReferralDetails$annotations", "Lcom/app/tgtg/model/remote/profile/response/SpecialRewardsCardDetails;", "getSpecialRewardsDetails", "getSpecialRewardsDetails$annotations", "Lcom/app/tgtg/model/remote/profile/response/StoreSignupCardDetails;", "getStoreSignupDetails", "getStoreSignupDetails$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ProfileFeature {

    @Nullable
    private final C2CReferralDetails c2cReferralDetails;

    @NotNull
    private ProfileFeatureState featureState;

    @NotNull
    private final ProfileFeatureType featureType;

    @Nullable
    private final LoyaltyCardDetails loyaltyCardDetails;

    @Nullable
    private final SpecialRewardsCardDetails specialRewardsDetails;

    @Nullable
    private final StoreSignupCardDetails storeSignupDetails;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ ProfileFeature(int i11, ProfileFeatureType profileFeatureType, ProfileFeatureState profileFeatureState, LoyaltyCardDetails loyaltyCardDetails, C2CReferralDetails c2CReferralDetails, SpecialRewardsCardDetails specialRewardsCardDetails, StoreSignupCardDetails storeSignupCardDetails, m1 m1Var) {
        if (63 != (i11 & 63)) {
            c1.j(i11, 63, ProfileFeature$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.featureType = profileFeatureType;
        this.featureState = profileFeatureState;
        this.loyaltyCardDetails = loyaltyCardDetails;
        this.c2cReferralDetails = c2CReferralDetails;
        this.specialRewardsDetails = specialRewardsCardDetails;
        this.storeSignupDetails = storeSignupCardDetails;
    }

    public static /* synthetic */ ProfileFeature copy$default(ProfileFeature profileFeature, ProfileFeatureType profileFeatureType, ProfileFeatureState profileFeatureState, LoyaltyCardDetails loyaltyCardDetails, C2CReferralDetails c2CReferralDetails, SpecialRewardsCardDetails specialRewardsCardDetails, StoreSignupCardDetails storeSignupCardDetails, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            profileFeatureType = profileFeature.featureType;
        }
        if ((i11 & 2) != 0) {
            profileFeatureState = profileFeature.featureState;
        }
        if ((i11 & 4) != 0) {
            loyaltyCardDetails = profileFeature.loyaltyCardDetails;
        }
        if ((i11 & 8) != 0) {
            c2CReferralDetails = profileFeature.c2cReferralDetails;
        }
        if ((i11 & 16) != 0) {
            specialRewardsCardDetails = profileFeature.specialRewardsDetails;
        }
        if ((i11 & 32) != 0) {
            storeSignupCardDetails = profileFeature.storeSignupDetails;
        }
        SpecialRewardsCardDetails specialRewardsCardDetails2 = specialRewardsCardDetails;
        StoreSignupCardDetails storeSignupCardDetails2 = storeSignupCardDetails;
        return profileFeature.copy(profileFeatureType, profileFeatureState, loyaltyCardDetails, c2CReferralDetails, specialRewardsCardDetails2, storeSignupCardDetails2);
    }

    public static final /* synthetic */ void write$Self$app(ProfileFeature self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, ProfileFeatureTypeSerializer.INSTANCE, self.featureType);
        output.i(serialDesc, 1, ProfileFeatureStateSerializer.INSTANCE, self.featureState);
        output.r(serialDesc, 2, LoyaltyCardDetails$$serializer.INSTANCE, self.loyaltyCardDetails);
        output.r(serialDesc, 3, C2CReferralDetails$$serializer.INSTANCE, self.c2cReferralDetails);
        output.r(serialDesc, 4, SpecialRewardsCardDetails$$serializer.INSTANCE, self.specialRewardsDetails);
        output.r(serialDesc, 5, StoreSignupCardDetails$$serializer.INSTANCE, self.storeSignupDetails);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProfileFeatureType getFeatureType() {
        return this.featureType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ProfileFeatureState getFeatureState() {
        return this.featureState;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LoyaltyCardDetails getLoyaltyCardDetails() {
        return this.loyaltyCardDetails;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final C2CReferralDetails getC2cReferralDetails() {
        return this.c2cReferralDetails;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SpecialRewardsCardDetails getSpecialRewardsDetails() {
        return this.specialRewardsDetails;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final StoreSignupCardDetails getStoreSignupDetails() {
        return this.storeSignupDetails;
    }

    @NotNull
    public final ProfileFeature copy(@NotNull ProfileFeatureType featureType, @NotNull ProfileFeatureState featureState, @Nullable LoyaltyCardDetails loyaltyCardDetails, @Nullable C2CReferralDetails c2cReferralDetails, @Nullable SpecialRewardsCardDetails specialRewardsDetails, @Nullable StoreSignupCardDetails storeSignupDetails) {
        featureType.getClass();
        featureState.getClass();
        return new ProfileFeature(featureType, featureState, loyaltyCardDetails, c2cReferralDetails, specialRewardsDetails, storeSignupDetails);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileFeature)) {
            return false;
        }
        ProfileFeature profileFeature = (ProfileFeature) other;
        return this.featureType == profileFeature.featureType && this.featureState == profileFeature.featureState && Intrinsics.areEqual(this.loyaltyCardDetails, profileFeature.loyaltyCardDetails) && Intrinsics.areEqual(this.c2cReferralDetails, profileFeature.c2cReferralDetails) && Intrinsics.areEqual(this.specialRewardsDetails, profileFeature.specialRewardsDetails) && Intrinsics.areEqual(this.storeSignupDetails, profileFeature.storeSignupDetails);
    }

    @Nullable
    public final C2CReferralDetails getC2cReferralDetails() {
        return this.c2cReferralDetails;
    }

    @NotNull
    public final ProfileFeatureState getFeatureState() {
        return this.featureState;
    }

    @NotNull
    public final ProfileFeatureType getFeatureType() {
        return this.featureType;
    }

    @Nullable
    public final LoyaltyCardDetails getLoyaltyCardDetails() {
        return this.loyaltyCardDetails;
    }

    @Nullable
    public final SpecialRewardsCardDetails getSpecialRewardsDetails() {
        return this.specialRewardsDetails;
    }

    @Nullable
    public final StoreSignupCardDetails getStoreSignupDetails() {
        return this.storeSignupDetails;
    }

    public int hashCode() {
        int iHashCode = (this.featureState.hashCode() + (this.featureType.hashCode() * 31)) * 31;
        LoyaltyCardDetails loyaltyCardDetails = this.loyaltyCardDetails;
        int iHashCode2 = (iHashCode + (loyaltyCardDetails == null ? 0 : loyaltyCardDetails.hashCode())) * 31;
        C2CReferralDetails c2CReferralDetails = this.c2cReferralDetails;
        int iHashCode3 = (iHashCode2 + (c2CReferralDetails == null ? 0 : c2CReferralDetails.hashCode())) * 31;
        SpecialRewardsCardDetails specialRewardsCardDetails = this.specialRewardsDetails;
        int iHashCode4 = (iHashCode3 + (specialRewardsCardDetails == null ? 0 : specialRewardsCardDetails.hashCode())) * 31;
        StoreSignupCardDetails storeSignupCardDetails = this.storeSignupDetails;
        return iHashCode4 + (storeSignupCardDetails != null ? storeSignupCardDetails.hashCode() : 0);
    }

    public final void setFeatureState(@NotNull ProfileFeatureState profileFeatureState) {
        profileFeatureState.getClass();
        this.featureState = profileFeatureState;
    }

    @NotNull
    public String toString() {
        return "ProfileFeature(featureType=" + this.featureType + ", featureState=" + this.featureState + ", loyaltyCardDetails=" + this.loyaltyCardDetails + ", c2cReferralDetails=" + this.c2cReferralDetails + ", specialRewardsDetails=" + this.specialRewardsDetails + ", storeSignupDetails=" + this.storeSignupDetails + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/profile/response/ProfileFeature$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/profile/response/ProfileFeature;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ProfileFeature$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("c2c_referral_details")
    public static /* synthetic */ void getC2cReferralDetails$annotations() {
    }

    @g("state")
    public static /* synthetic */ void getFeatureState$annotations() {
    }

    @g("type")
    public static /* synthetic */ void getFeatureType$annotations() {
    }

    @g("loyalty_card_details")
    public static /* synthetic */ void getLoyaltyCardDetails$annotations() {
    }

    @g("special_reward_details")
    public static /* synthetic */ void getSpecialRewardsDetails$annotations() {
    }

    @g("store_signup_details")
    public static /* synthetic */ void getStoreSignupDetails$annotations() {
    }

    public ProfileFeature(@NotNull ProfileFeatureType profileFeatureType, @NotNull ProfileFeatureState profileFeatureState, @Nullable LoyaltyCardDetails loyaltyCardDetails, @Nullable C2CReferralDetails c2CReferralDetails, @Nullable SpecialRewardsCardDetails specialRewardsCardDetails, @Nullable StoreSignupCardDetails storeSignupCardDetails) {
        profileFeatureType.getClass();
        profileFeatureState.getClass();
        this.featureType = profileFeatureType;
        this.featureState = profileFeatureState;
        this.loyaltyCardDetails = loyaltyCardDetails;
        this.c2cReferralDetails = c2CReferralDetails;
        this.specialRewardsDetails = specialRewardsCardDetails;
        this.storeSignupDetails = storeSignupCardDetails;
    }
}
