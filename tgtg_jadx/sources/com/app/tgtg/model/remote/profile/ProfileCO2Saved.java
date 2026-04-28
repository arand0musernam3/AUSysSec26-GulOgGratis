package com.app.tgtg.model.remote.profile;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.l0;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGBC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b*\u0010+JL\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b1\u0010\u001cJ\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b5\u00106R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00107\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010;\u0012\u0004\b=\u0010:\u001a\u0004\b<\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010>\u0012\u0004\b@\u0010:\u001a\u0004\b?\u0010'R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010A\u0012\u0004\bC\u0010:\u001a\u0004\bB\u0010)R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010D\u0012\u0004\bF\u0010:\u001a\u0004\bE\u0010+¨\u0006I"}, d2 = {"Lcom/app/tgtg/model/remote/profile/ProfileCO2Saved;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedElectricity;", "savedElectricity", "Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedHotShower;", "savedHotShower", "Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedCupsOfCoffee;", "savedCupsOfCoffee", "Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedSmartPhoneCharges;", "savedSmartPhoneCharges", "", "co2eSavedValue", "<init>", "(Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedElectricity;Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedHotShower;Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedCupsOfCoffee;Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedSmartPhoneCharges;Ljava/lang/Integer;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedElectricity;Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedHotShower;Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedCupsOfCoffee;Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedSmartPhoneCharges;Ljava/lang/Integer;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/profile/ProfileCO2Saved;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedElectricity;", "component2", "()Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedHotShower;", "component3", "()Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedCupsOfCoffee;", "component4", "()Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedSmartPhoneCharges;", "component5", "()Ljava/lang/Integer;", "copy", "(Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedElectricity;Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedHotShower;Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedCupsOfCoffee;Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedSmartPhoneCharges;Ljava/lang/Integer;)Lcom/app/tgtg/model/remote/profile/ProfileCO2Saved;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedElectricity;", "getSavedElectricity", "getSavedElectricity$annotations", "()V", "Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedHotShower;", "getSavedHotShower", "getSavedHotShower$annotations", "Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedCupsOfCoffee;", "getSavedCupsOfCoffee", "getSavedCupsOfCoffee$annotations", "Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedSmartPhoneCharges;", "getSavedSmartPhoneCharges", "getSavedSmartPhoneCharges$annotations", "Ljava/lang/Integer;", "getCo2eSavedValue", "getCo2eSavedValue$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ProfileCO2Saved implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final Integer co2eSavedValue;

    @Nullable
    private final ProfilePageCO2SavedCupsOfCoffee savedCupsOfCoffee;

    @Nullable
    private final ProfilePageCO2SavedElectricity savedElectricity;

    @Nullable
    private final ProfilePageCO2SavedHotShower savedHotShower;

    @Nullable
    private final ProfilePageCO2SavedSmartPhoneCharges savedSmartPhoneCharges;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<ProfileCO2Saved> CREATOR = new Creator();

    public /* synthetic */ ProfileCO2Saved(int i11, ProfilePageCO2SavedElectricity profilePageCO2SavedElectricity, ProfilePageCO2SavedHotShower profilePageCO2SavedHotShower, ProfilePageCO2SavedCupsOfCoffee profilePageCO2SavedCupsOfCoffee, ProfilePageCO2SavedSmartPhoneCharges profilePageCO2SavedSmartPhoneCharges, Integer num, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.savedElectricity = null;
        } else {
            this.savedElectricity = profilePageCO2SavedElectricity;
        }
        if ((i11 & 2) == 0) {
            this.savedHotShower = null;
        } else {
            this.savedHotShower = profilePageCO2SavedHotShower;
        }
        if ((i11 & 4) == 0) {
            this.savedCupsOfCoffee = null;
        } else {
            this.savedCupsOfCoffee = profilePageCO2SavedCupsOfCoffee;
        }
        if ((i11 & 8) == 0) {
            this.savedSmartPhoneCharges = null;
        } else {
            this.savedSmartPhoneCharges = profilePageCO2SavedSmartPhoneCharges;
        }
        if ((i11 & 16) == 0) {
            this.co2eSavedValue = null;
        } else {
            this.co2eSavedValue = num;
        }
    }

    public static /* synthetic */ ProfileCO2Saved copy$default(ProfileCO2Saved profileCO2Saved, ProfilePageCO2SavedElectricity profilePageCO2SavedElectricity, ProfilePageCO2SavedHotShower profilePageCO2SavedHotShower, ProfilePageCO2SavedCupsOfCoffee profilePageCO2SavedCupsOfCoffee, ProfilePageCO2SavedSmartPhoneCharges profilePageCO2SavedSmartPhoneCharges, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            profilePageCO2SavedElectricity = profileCO2Saved.savedElectricity;
        }
        if ((i11 & 2) != 0) {
            profilePageCO2SavedHotShower = profileCO2Saved.savedHotShower;
        }
        if ((i11 & 4) != 0) {
            profilePageCO2SavedCupsOfCoffee = profileCO2Saved.savedCupsOfCoffee;
        }
        if ((i11 & 8) != 0) {
            profilePageCO2SavedSmartPhoneCharges = profileCO2Saved.savedSmartPhoneCharges;
        }
        if ((i11 & 16) != 0) {
            num = profileCO2Saved.co2eSavedValue;
        }
        Integer num2 = num;
        ProfilePageCO2SavedCupsOfCoffee profilePageCO2SavedCupsOfCoffee2 = profilePageCO2SavedCupsOfCoffee;
        return profileCO2Saved.copy(profilePageCO2SavedElectricity, profilePageCO2SavedHotShower, profilePageCO2SavedCupsOfCoffee2, profilePageCO2SavedSmartPhoneCharges, num2);
    }

    public static final /* synthetic */ void write$Self$app(ProfileCO2Saved self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.savedElectricity != null) {
            output.r(serialDesc, 0, ProfilePageCO2SavedElectricity$$serializer.INSTANCE, self.savedElectricity);
        }
        if (output.C(serialDesc) || self.savedHotShower != null) {
            output.r(serialDesc, 1, ProfilePageCO2SavedHotShower$$serializer.INSTANCE, self.savedHotShower);
        }
        if (output.C(serialDesc) || self.savedCupsOfCoffee != null) {
            output.r(serialDesc, 2, ProfilePageCO2SavedCupsOfCoffee$$serializer.INSTANCE, self.savedCupsOfCoffee);
        }
        if (output.C(serialDesc) || self.savedSmartPhoneCharges != null) {
            output.r(serialDesc, 3, ProfilePageCO2SavedSmartPhoneCharges$$serializer.INSTANCE, self.savedSmartPhoneCharges);
        }
        if (!output.C(serialDesc) && self.co2eSavedValue == null) {
            return;
        }
        output.r(serialDesc, 4, l0.f29821a, self.co2eSavedValue);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProfilePageCO2SavedElectricity getSavedElectricity() {
        return this.savedElectricity;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ProfilePageCO2SavedHotShower getSavedHotShower() {
        return this.savedHotShower;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ProfilePageCO2SavedCupsOfCoffee getSavedCupsOfCoffee() {
        return this.savedCupsOfCoffee;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ProfilePageCO2SavedSmartPhoneCharges getSavedSmartPhoneCharges() {
        return this.savedSmartPhoneCharges;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getCo2eSavedValue() {
        return this.co2eSavedValue;
    }

    @NotNull
    public final ProfileCO2Saved copy(@Nullable ProfilePageCO2SavedElectricity savedElectricity, @Nullable ProfilePageCO2SavedHotShower savedHotShower, @Nullable ProfilePageCO2SavedCupsOfCoffee savedCupsOfCoffee, @Nullable ProfilePageCO2SavedSmartPhoneCharges savedSmartPhoneCharges, @Nullable Integer co2eSavedValue) {
        return new ProfileCO2Saved(savedElectricity, savedHotShower, savedCupsOfCoffee, savedSmartPhoneCharges, co2eSavedValue);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileCO2Saved)) {
            return false;
        }
        ProfileCO2Saved profileCO2Saved = (ProfileCO2Saved) other;
        return Intrinsics.areEqual(this.savedElectricity, profileCO2Saved.savedElectricity) && Intrinsics.areEqual(this.savedHotShower, profileCO2Saved.savedHotShower) && Intrinsics.areEqual(this.savedCupsOfCoffee, profileCO2Saved.savedCupsOfCoffee) && Intrinsics.areEqual(this.savedSmartPhoneCharges, profileCO2Saved.savedSmartPhoneCharges) && Intrinsics.areEqual(this.co2eSavedValue, profileCO2Saved.co2eSavedValue);
    }

    @Nullable
    public final Integer getCo2eSavedValue() {
        return this.co2eSavedValue;
    }

    @Nullable
    public final ProfilePageCO2SavedCupsOfCoffee getSavedCupsOfCoffee() {
        return this.savedCupsOfCoffee;
    }

    @Nullable
    public final ProfilePageCO2SavedElectricity getSavedElectricity() {
        return this.savedElectricity;
    }

    @Nullable
    public final ProfilePageCO2SavedHotShower getSavedHotShower() {
        return this.savedHotShower;
    }

    @Nullable
    public final ProfilePageCO2SavedSmartPhoneCharges getSavedSmartPhoneCharges() {
        return this.savedSmartPhoneCharges;
    }

    public int hashCode() {
        ProfilePageCO2SavedElectricity profilePageCO2SavedElectricity = this.savedElectricity;
        int iHashCode = (profilePageCO2SavedElectricity == null ? 0 : profilePageCO2SavedElectricity.hashCode()) * 31;
        ProfilePageCO2SavedHotShower profilePageCO2SavedHotShower = this.savedHotShower;
        int iHashCode2 = (iHashCode + (profilePageCO2SavedHotShower == null ? 0 : profilePageCO2SavedHotShower.hashCode())) * 31;
        ProfilePageCO2SavedCupsOfCoffee profilePageCO2SavedCupsOfCoffee = this.savedCupsOfCoffee;
        int iHashCode3 = (iHashCode2 + (profilePageCO2SavedCupsOfCoffee == null ? 0 : profilePageCO2SavedCupsOfCoffee.hashCode())) * 31;
        ProfilePageCO2SavedSmartPhoneCharges profilePageCO2SavedSmartPhoneCharges = this.savedSmartPhoneCharges;
        int iHashCode4 = (iHashCode3 + (profilePageCO2SavedSmartPhoneCharges == null ? 0 : profilePageCO2SavedSmartPhoneCharges.hashCode())) * 31;
        Integer num = this.co2eSavedValue;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ProfilePageCO2SavedElectricity profilePageCO2SavedElectricity = this.savedElectricity;
        ProfilePageCO2SavedHotShower profilePageCO2SavedHotShower = this.savedHotShower;
        ProfilePageCO2SavedCupsOfCoffee profilePageCO2SavedCupsOfCoffee = this.savedCupsOfCoffee;
        ProfilePageCO2SavedSmartPhoneCharges profilePageCO2SavedSmartPhoneCharges = this.savedSmartPhoneCharges;
        Integer num = this.co2eSavedValue;
        StringBuilder sb2 = new StringBuilder("ProfileCO2Saved(savedElectricity=");
        sb2.append(profilePageCO2SavedElectricity);
        sb2.append(", savedHotShower=");
        sb2.append(profilePageCO2SavedHotShower);
        sb2.append(", savedCupsOfCoffee=");
        sb2.append(profilePageCO2SavedCupsOfCoffee);
        sb2.append(", savedSmartPhoneCharges=");
        sb2.append(profilePageCO2SavedSmartPhoneCharges);
        sb2.append(", co2eSavedValue=");
        return i.m(sb2, num, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        ProfilePageCO2SavedElectricity profilePageCO2SavedElectricity = this.savedElectricity;
        if (profilePageCO2SavedElectricity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            profilePageCO2SavedElectricity.writeToParcel(dest, flags);
        }
        ProfilePageCO2SavedHotShower profilePageCO2SavedHotShower = this.savedHotShower;
        if (profilePageCO2SavedHotShower == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            profilePageCO2SavedHotShower.writeToParcel(dest, flags);
        }
        ProfilePageCO2SavedCupsOfCoffee profilePageCO2SavedCupsOfCoffee = this.savedCupsOfCoffee;
        if (profilePageCO2SavedCupsOfCoffee == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            profilePageCO2SavedCupsOfCoffee.writeToParcel(dest, flags);
        }
        ProfilePageCO2SavedSmartPhoneCharges profilePageCO2SavedSmartPhoneCharges = this.savedSmartPhoneCharges;
        if (profilePageCO2SavedSmartPhoneCharges == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            profilePageCO2SavedSmartPhoneCharges.writeToParcel(dest, flags);
        }
        Integer num = this.co2eSavedValue;
        if (num == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/profile/ProfileCO2Saved$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/profile/ProfileCO2Saved;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ProfileCO2Saved$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProfileCO2Saved> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfileCO2Saved createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ProfileCO2Saved(parcel.readInt() == 0 ? null : ProfilePageCO2SavedElectricity.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProfilePageCO2SavedHotShower.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProfilePageCO2SavedCupsOfCoffee.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProfilePageCO2SavedSmartPhoneCharges.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfileCO2Saved[] newArray(int i11) {
            return new ProfileCO2Saved[i11];
        }
    }

    @g("co2e_saved_value")
    public static /* synthetic */ void getCo2eSavedValue$annotations() {
    }

    @g("saved_cups_of_coffee")
    public static /* synthetic */ void getSavedCupsOfCoffee$annotations() {
    }

    @g("saved_electricity")
    public static /* synthetic */ void getSavedElectricity$annotations() {
    }

    @g("saved_hot_shower")
    public static /* synthetic */ void getSavedHotShower$annotations() {
    }

    @g("saved_smart_phone_charges")
    public static /* synthetic */ void getSavedSmartPhoneCharges$annotations() {
    }

    public ProfileCO2Saved() {
        this((ProfilePageCO2SavedElectricity) null, (ProfilePageCO2SavedHotShower) null, (ProfilePageCO2SavedCupsOfCoffee) null, (ProfilePageCO2SavedSmartPhoneCharges) null, (Integer) null, 31, (DefaultConstructorMarker) null);
    }

    public ProfileCO2Saved(@Nullable ProfilePageCO2SavedElectricity profilePageCO2SavedElectricity, @Nullable ProfilePageCO2SavedHotShower profilePageCO2SavedHotShower, @Nullable ProfilePageCO2SavedCupsOfCoffee profilePageCO2SavedCupsOfCoffee, @Nullable ProfilePageCO2SavedSmartPhoneCharges profilePageCO2SavedSmartPhoneCharges, @Nullable Integer num) {
        this.savedElectricity = profilePageCO2SavedElectricity;
        this.savedHotShower = profilePageCO2SavedHotShower;
        this.savedCupsOfCoffee = profilePageCO2SavedCupsOfCoffee;
        this.savedSmartPhoneCharges = profilePageCO2SavedSmartPhoneCharges;
        this.co2eSavedValue = num;
    }

    public /* synthetic */ ProfileCO2Saved(ProfilePageCO2SavedElectricity profilePageCO2SavedElectricity, ProfilePageCO2SavedHotShower profilePageCO2SavedHotShower, ProfilePageCO2SavedCupsOfCoffee profilePageCO2SavedCupsOfCoffee, ProfilePageCO2SavedSmartPhoneCharges profilePageCO2SavedSmartPhoneCharges, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : profilePageCO2SavedElectricity, (i11 & 2) != 0 ? null : profilePageCO2SavedHotShower, (i11 & 4) != 0 ? null : profilePageCO2SavedCupsOfCoffee, (i11 & 8) != 0 ? null : profilePageCO2SavedSmartPhoneCharges, (i11 & 16) != 0 ? null : num);
    }
}
