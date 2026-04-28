package com.app.tgtg.model.remote.profile.response;

import c50.w;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import l90.a;
import l90.b;
import m90.c1;
import m90.d0;
import m90.e1;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/profile/response/ProfileFeature.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/profile/response/ProfileFeature;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/profile/response/ProfileFeature;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/profile/response/ProfileFeature;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class ProfileFeature$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final ProfileFeature$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ProfileFeature$$serializer profileFeature$$serializer = new ProfileFeature$$serializer();
        INSTANCE = profileFeature$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.profile.response.ProfileFeature", profileFeature$$serializer, 6);
        e1Var.j("type", false);
        e1Var.j("state", false);
        e1Var.j("loyalty_card_details", false);
        e1Var.j("c2c_referral_details", false);
        e1Var.j("special_reward_details", false);
        e1Var.j("store_signup_details", false);
        descriptor = e1Var;
    }

    private ProfileFeature$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ProfileFeatureTypeSerializer.INSTANCE, ProfileFeatureStateSerializer.INSTANCE, f0.B(LoyaltyCardDetails$$serializer.INSTANCE), f0.B(C2CReferralDetails$$serializer.INSTANCE), f0.B(SpecialRewardsCardDetails$$serializer.INSTANCE), f0.B(StoreSignupCardDetails$$serializer.INSTANCE)};
    }

    @Override // i90.b
    @NotNull
    public final ProfileFeature deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        int i11 = 0;
        ProfileFeatureType profileFeatureType = null;
        ProfileFeatureState profileFeatureState = null;
        LoyaltyCardDetails loyaltyCardDetails = null;
        C2CReferralDetails c2CReferralDetails = null;
        SpecialRewardsCardDetails specialRewardsCardDetails = null;
        StoreSignupCardDetails storeSignupCardDetails = null;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    profileFeatureType = (ProfileFeatureType) aVarC.n(serialDescriptor, 0, ProfileFeatureTypeSerializer.INSTANCE, profileFeatureType);
                    i11 |= 1;
                    break;
                case 1:
                    profileFeatureState = (ProfileFeatureState) aVarC.n(serialDescriptor, 1, ProfileFeatureStateSerializer.INSTANCE, profileFeatureState);
                    i11 |= 2;
                    break;
                case 2:
                    loyaltyCardDetails = (LoyaltyCardDetails) aVarC.m(serialDescriptor, 2, LoyaltyCardDetails$$serializer.INSTANCE, loyaltyCardDetails);
                    i11 |= 4;
                    break;
                case 3:
                    c2CReferralDetails = (C2CReferralDetails) aVarC.m(serialDescriptor, 3, C2CReferralDetails$$serializer.INSTANCE, c2CReferralDetails);
                    i11 |= 8;
                    break;
                case 4:
                    specialRewardsCardDetails = (SpecialRewardsCardDetails) aVarC.m(serialDescriptor, 4, SpecialRewardsCardDetails$$serializer.INSTANCE, specialRewardsCardDetails);
                    i11 |= 16;
                    break;
                case 5:
                    storeSignupCardDetails = (StoreSignupCardDetails) aVarC.m(serialDescriptor, 5, StoreSignupCardDetails$$serializer.INSTANCE, storeSignupCardDetails);
                    i11 |= 32;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new ProfileFeature(i11, profileFeatureType, profileFeatureState, loyaltyCardDetails, c2CReferralDetails, specialRewardsCardDetails, storeSignupCardDetails, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ProfileFeature value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        ProfileFeature.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
