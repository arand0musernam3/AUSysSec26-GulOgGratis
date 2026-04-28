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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B9\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ(\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001dR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010\u001dR\u001f\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b1\u0010-\u001a\u0004\b0\u0010\u001d¨\u00064"}, d2 = {"Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedHotShower;", "Landroid/os/Parcelable;", "", "valueMinute", "valueHour", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "inMinutes", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedHotShower;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/Integer;", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedHotShower;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getValueMinute", "getValueMinute$annotations", "()V", "getValueHour", "getValueHour$annotations", "getInMinutes", "getInMinutes$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ProfilePageCO2SavedHotShower implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final Integer inMinutes;

    @Nullable
    private final Integer valueHour;

    @Nullable
    private final Integer valueMinute;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<ProfilePageCO2SavedHotShower> CREATOR = new Creator();

    public /* synthetic */ ProfilePageCO2SavedHotShower(int i11, Integer num, Integer num2, Integer num3, m1 m1Var) {
        Integer numValueOf = null;
        if ((i11 & 1) == 0) {
            this.valueMinute = null;
        } else {
            this.valueMinute = num;
        }
        if ((i11 & 2) == 0) {
            this.valueHour = null;
        } else {
            this.valueHour = num2;
        }
        if ((i11 & 4) != 0) {
            this.inMinutes = num3;
            return;
        }
        Integer num4 = this.valueHour;
        if (num4 != null) {
            int iIntValue = num4.intValue() * 60;
            Integer num5 = this.valueMinute;
            numValueOf = Integer.valueOf(iIntValue + (num5 != null ? num5.intValue() : 0));
        }
        this.inMinutes = numValueOf;
    }

    public static /* synthetic */ ProfilePageCO2SavedHotShower copy$default(ProfilePageCO2SavedHotShower profilePageCO2SavedHotShower, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = profilePageCO2SavedHotShower.valueMinute;
        }
        if ((i11 & 2) != 0) {
            num2 = profilePageCO2SavedHotShower.valueHour;
        }
        return profilePageCO2SavedHotShower.copy(num, num2);
    }

    public static final /* synthetic */ void write$Self$app(ProfilePageCO2SavedHotShower self, b output, SerialDescriptor serialDesc) {
        Integer numValueOf;
        if (output.C(serialDesc) || self.valueMinute != null) {
            output.r(serialDesc, 0, l0.f29821a, self.valueMinute);
        }
        if (output.C(serialDesc) || self.valueHour != null) {
            output.r(serialDesc, 1, l0.f29821a, self.valueHour);
        }
        if (!output.C(serialDesc)) {
            Integer num = self.inMinutes;
            Integer num2 = self.valueHour;
            if (num2 != null) {
                int iIntValue = num2.intValue() * 60;
                Integer num3 = self.valueMinute;
                numValueOf = Integer.valueOf(iIntValue + (num3 != null ? num3.intValue() : 0));
            } else {
                numValueOf = null;
            }
            if (Intrinsics.areEqual(num, numValueOf)) {
                return;
            }
        }
        output.r(serialDesc, 2, l0.f29821a, self.inMinutes);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getValueMinute() {
        return this.valueMinute;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getValueHour() {
        return this.valueHour;
    }

    @NotNull
    public final ProfilePageCO2SavedHotShower copy(@Nullable Integer valueMinute, @Nullable Integer valueHour) {
        return new ProfilePageCO2SavedHotShower(valueMinute, valueHour);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfilePageCO2SavedHotShower)) {
            return false;
        }
        ProfilePageCO2SavedHotShower profilePageCO2SavedHotShower = (ProfilePageCO2SavedHotShower) other;
        return Intrinsics.areEqual(this.valueMinute, profilePageCO2SavedHotShower.valueMinute) && Intrinsics.areEqual(this.valueHour, profilePageCO2SavedHotShower.valueHour);
    }

    @Nullable
    public final Integer getInMinutes() {
        return this.inMinutes;
    }

    @Nullable
    public final Integer getValueHour() {
        return this.valueHour;
    }

    @Nullable
    public final Integer getValueMinute() {
        return this.valueMinute;
    }

    public int hashCode() {
        Integer num = this.valueMinute;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.valueHour;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProfilePageCO2SavedHotShower(valueMinute=" + this.valueMinute + ", valueHour=" + this.valueHour + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        Integer num = this.valueMinute;
        if (num == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num);
        }
        Integer num2 = this.valueHour;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedHotShower$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/profile/ProfilePageCO2SavedHotShower;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ProfilePageCO2SavedHotShower$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProfilePageCO2SavedHotShower> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfilePageCO2SavedHotShower createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ProfilePageCO2SavedHotShower(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfilePageCO2SavedHotShower[] newArray(int i11) {
            return new ProfilePageCO2SavedHotShower[i11];
        }
    }

    public static /* synthetic */ void getInMinutes$annotations() {
    }

    @g("value_hour")
    public static /* synthetic */ void getValueHour$annotations() {
    }

    @g("value_minute")
    public static /* synthetic */ void getValueMinute$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfilePageCO2SavedHotShower() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public ProfilePageCO2SavedHotShower(@Nullable Integer num, @Nullable Integer num2) {
        Integer numValueOf;
        this.valueMinute = num;
        this.valueHour = num2;
        if (num2 != null) {
            numValueOf = Integer.valueOf((num2.intValue() * 60) + (num != null ? num.intValue() : 0));
        } else {
            numValueOf = null;
        }
        this.inMinutes = numValueOf;
    }

    public /* synthetic */ ProfilePageCO2SavedHotShower(Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2);
    }
}
