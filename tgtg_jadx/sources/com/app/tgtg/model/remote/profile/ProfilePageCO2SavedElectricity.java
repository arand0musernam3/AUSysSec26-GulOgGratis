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
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u001f¨\u00062"}, d2 = {"Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedElectricity;", "Landroid/os/Parcelable;", "", "value", "", "countryId", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedElectricity;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedElectricity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getValue", "getValue$annotations", "()V", "Ljava/lang/String;", "getCountryId", "getCountryId$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ProfilePageCO2SavedElectricity implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final String countryId;

    @Nullable
    private final Integer value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<ProfilePageCO2SavedElectricity> CREATOR = new Creator();

    public /* synthetic */ ProfilePageCO2SavedElectricity(int i11, Integer num, String str, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.value = null;
        } else {
            this.value = num;
        }
        if ((i11 & 2) == 0) {
            this.countryId = null;
        } else {
            this.countryId = str;
        }
    }

    public static /* synthetic */ ProfilePageCO2SavedElectricity copy$default(ProfilePageCO2SavedElectricity profilePageCO2SavedElectricity, Integer num, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = profilePageCO2SavedElectricity.value;
        }
        if ((i11 & 2) != 0) {
            str = profilePageCO2SavedElectricity.countryId;
        }
        return profilePageCO2SavedElectricity.copy(num, str);
    }

    public static final /* synthetic */ void write$Self$app(ProfilePageCO2SavedElectricity self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.value != null) {
            output.r(serialDesc, 0, l0.f29821a, self.value);
        }
        if (!output.C(serialDesc) && self.countryId == null) {
            return;
        }
        output.r(serialDesc, 1, r1.f29848a, self.countryId);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountryId() {
        return this.countryId;
    }

    @NotNull
    public final ProfilePageCO2SavedElectricity copy(@Nullable Integer value, @Nullable String countryId) {
        return new ProfilePageCO2SavedElectricity(value, countryId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfilePageCO2SavedElectricity)) {
            return false;
        }
        ProfilePageCO2SavedElectricity profilePageCO2SavedElectricity = (ProfilePageCO2SavedElectricity) other;
        return Intrinsics.areEqual(this.value, profilePageCO2SavedElectricity.value) && Intrinsics.areEqual(this.countryId, profilePageCO2SavedElectricity.countryId);
    }

    @Nullable
    public final String getCountryId() {
        return this.countryId;
    }

    @Nullable
    public final Integer getValue() {
        return this.value;
    }

    public int hashCode() {
        Integer num = this.value;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.countryId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProfilePageCO2SavedElectricity(value=" + this.value + ", countryId=" + this.countryId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        Integer num = this.value;
        if (num == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num);
        }
        dest.writeString(this.countryId);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedElectricity$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedElectricity;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ProfilePageCO2SavedElectricity$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProfilePageCO2SavedElectricity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfilePageCO2SavedElectricity createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ProfilePageCO2SavedElectricity(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfilePageCO2SavedElectricity[] newArray(int i11) {
            return new ProfilePageCO2SavedElectricity[i11];
        }
    }

    @g("country_id")
    public static /* synthetic */ void getCountryId$annotations() {
    }

    @g("value")
    public static /* synthetic */ void getValue$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfilePageCO2SavedElectricity() {
        this((Integer) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public ProfilePageCO2SavedElectricity(@Nullable Integer num, @Nullable String str) {
        this.value = num;
        this.countryId = str;
    }

    public /* synthetic */ ProfilePageCO2SavedElectricity(Integer num, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str);
    }
}
