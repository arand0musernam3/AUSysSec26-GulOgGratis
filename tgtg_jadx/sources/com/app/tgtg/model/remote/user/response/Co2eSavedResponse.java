package com.app.tgtg.model.remote.user.response;

import android.os.Parcel;
import android.os.Parcelable;
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
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IHB?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0011JJ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0011J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)J'\u00101\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b/\u00100R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u00102\u0012\u0004\b6\u00107\u001a\u0004\b3\u0010\u0019\"\u0004\b4\u00105R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u00108\u0012\u0004\b<\u00107\u001a\u0004\b9\u0010\u001b\"\u0004\b:\u0010;R*\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u00102\u0012\u0004\b?\u00107\u001a\u0004\b=\u0010\u0019\"\u0004\b>\u00105R*\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u00102\u0012\u0004\bB\u00107\u001a\u0004\b@\u0010\u0019\"\u0004\bA\u00105R(\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010C\u0012\u0004\bG\u00107\u001a\u0004\bD\u0010\u0011\"\u0004\bE\u0010F¨\u0006J"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/Co2eSavedResponse;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/user/response/Co2eSavedValue;", "savedElectricity", "Lcom/app/tgtg/model/remote/user/response/Co2eSavedHotShower;", "savedHotShower", "savedCupsOfCoffee", "savedSmartPhoneCharges", "", "co2eSavedValue", "<init>", "(Lcom/app/tgtg/model/remote/user/response/Co2eSavedValue;Lcom/app/tgtg/model/remote/user/response/Co2eSavedHotShower;Lcom/app/tgtg/model/remote/user/response/Co2eSavedValue;Lcom/app/tgtg/model/remote/user/response/Co2eSavedValue;I)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/user/response/Co2eSavedValue;Lcom/app/tgtg/model/remote/user/response/Co2eSavedHotShower;Lcom/app/tgtg/model/remote/user/response/Co2eSavedValue;Lcom/app/tgtg/model/remote/user/response/Co2eSavedValue;ILm90/m1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/user/response/Co2eSavedValue;", "component2", "()Lcom/app/tgtg/model/remote/user/response/Co2eSavedHotShower;", "component3", "component4", "component5", "copy", "(Lcom/app/tgtg/model/remote/user/response/Co2eSavedValue;Lcom/app/tgtg/model/remote/user/response/Co2eSavedHotShower;Lcom/app/tgtg/model/remote/user/response/Co2eSavedValue;Lcom/app/tgtg/model/remote/user/response/Co2eSavedValue;I)Lcom/app/tgtg/model/remote/user/response/Co2eSavedResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/Co2eSavedResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/app/tgtg/model/remote/user/response/Co2eSavedValue;", "getSavedElectricity", "setSavedElectricity", "(Lcom/app/tgtg/model/remote/user/response/Co2eSavedValue;)V", "getSavedElectricity$annotations", "()V", "Lcom/app/tgtg/model/remote/user/response/Co2eSavedHotShower;", "getSavedHotShower", "setSavedHotShower", "(Lcom/app/tgtg/model/remote/user/response/Co2eSavedHotShower;)V", "getSavedHotShower$annotations", "getSavedCupsOfCoffee", "setSavedCupsOfCoffee", "getSavedCupsOfCoffee$annotations", "getSavedSmartPhoneCharges", "setSavedSmartPhoneCharges", "getSavedSmartPhoneCharges$annotations", "I", "getCo2eSavedValue", "setCo2eSavedValue", "(I)V", "getCo2eSavedValue$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Co2eSavedResponse implements Parcelable {
    private int co2eSavedValue;

    @Nullable
    private Co2eSavedValue savedCupsOfCoffee;

    @Nullable
    private Co2eSavedValue savedElectricity;

    @Nullable
    private Co2eSavedHotShower savedHotShower;

    @Nullable
    private Co2eSavedValue savedSmartPhoneCharges;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Co2eSavedResponse> CREATOR = new Creator();

    public /* synthetic */ Co2eSavedResponse(int i11, Co2eSavedValue co2eSavedValue, Co2eSavedHotShower co2eSavedHotShower, Co2eSavedValue co2eSavedValue2, Co2eSavedValue co2eSavedValue3, int i12, m1 m1Var) {
        if (16 != (i11 & 16)) {
            c1.j(i11, 16, Co2eSavedResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.savedElectricity = null;
        } else {
            this.savedElectricity = co2eSavedValue;
        }
        if ((i11 & 2) == 0) {
            this.savedHotShower = null;
        } else {
            this.savedHotShower = co2eSavedHotShower;
        }
        if ((i11 & 4) == 0) {
            this.savedCupsOfCoffee = null;
        } else {
            this.savedCupsOfCoffee = co2eSavedValue2;
        }
        if ((i11 & 8) == 0) {
            this.savedSmartPhoneCharges = null;
        } else {
            this.savedSmartPhoneCharges = co2eSavedValue3;
        }
        this.co2eSavedValue = i12;
    }

    public static /* synthetic */ Co2eSavedResponse copy$default(Co2eSavedResponse co2eSavedResponse, Co2eSavedValue co2eSavedValue, Co2eSavedHotShower co2eSavedHotShower, Co2eSavedValue co2eSavedValue2, Co2eSavedValue co2eSavedValue3, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            co2eSavedValue = co2eSavedResponse.savedElectricity;
        }
        if ((i12 & 2) != 0) {
            co2eSavedHotShower = co2eSavedResponse.savedHotShower;
        }
        if ((i12 & 4) != 0) {
            co2eSavedValue2 = co2eSavedResponse.savedCupsOfCoffee;
        }
        if ((i12 & 8) != 0) {
            co2eSavedValue3 = co2eSavedResponse.savedSmartPhoneCharges;
        }
        if ((i12 & 16) != 0) {
            i11 = co2eSavedResponse.co2eSavedValue;
        }
        int i13 = i11;
        Co2eSavedValue co2eSavedValue4 = co2eSavedValue2;
        return co2eSavedResponse.copy(co2eSavedValue, co2eSavedHotShower, co2eSavedValue4, co2eSavedValue3, i13);
    }

    public static final /* synthetic */ void write$Self$app(Co2eSavedResponse self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.savedElectricity != null) {
            output.r(serialDesc, 0, Co2eSavedValue$$serializer.INSTANCE, self.savedElectricity);
        }
        if (output.C(serialDesc) || self.savedHotShower != null) {
            output.r(serialDesc, 1, Co2eSavedHotShower$$serializer.INSTANCE, self.savedHotShower);
        }
        if (output.C(serialDesc) || self.savedCupsOfCoffee != null) {
            output.r(serialDesc, 2, Co2eSavedValue$$serializer.INSTANCE, self.savedCupsOfCoffee);
        }
        if (output.C(serialDesc) || self.savedSmartPhoneCharges != null) {
            output.r(serialDesc, 3, Co2eSavedValue$$serializer.INSTANCE, self.savedSmartPhoneCharges);
        }
        output.m(4, self.co2eSavedValue, serialDesc);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Co2eSavedValue getSavedElectricity() {
        return this.savedElectricity;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Co2eSavedHotShower getSavedHotShower() {
        return this.savedHotShower;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Co2eSavedValue getSavedCupsOfCoffee() {
        return this.savedCupsOfCoffee;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Co2eSavedValue getSavedSmartPhoneCharges() {
        return this.savedSmartPhoneCharges;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCo2eSavedValue() {
        return this.co2eSavedValue;
    }

    @NotNull
    public final Co2eSavedResponse copy(@Nullable Co2eSavedValue savedElectricity, @Nullable Co2eSavedHotShower savedHotShower, @Nullable Co2eSavedValue savedCupsOfCoffee, @Nullable Co2eSavedValue savedSmartPhoneCharges, int co2eSavedValue) {
        return new Co2eSavedResponse(savedElectricity, savedHotShower, savedCupsOfCoffee, savedSmartPhoneCharges, co2eSavedValue);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Co2eSavedResponse)) {
            return false;
        }
        Co2eSavedResponse co2eSavedResponse = (Co2eSavedResponse) other;
        return Intrinsics.areEqual(this.savedElectricity, co2eSavedResponse.savedElectricity) && Intrinsics.areEqual(this.savedHotShower, co2eSavedResponse.savedHotShower) && Intrinsics.areEqual(this.savedCupsOfCoffee, co2eSavedResponse.savedCupsOfCoffee) && Intrinsics.areEqual(this.savedSmartPhoneCharges, co2eSavedResponse.savedSmartPhoneCharges) && this.co2eSavedValue == co2eSavedResponse.co2eSavedValue;
    }

    public final int getCo2eSavedValue() {
        return this.co2eSavedValue;
    }

    @Nullable
    public final Co2eSavedValue getSavedCupsOfCoffee() {
        return this.savedCupsOfCoffee;
    }

    @Nullable
    public final Co2eSavedValue getSavedElectricity() {
        return this.savedElectricity;
    }

    @Nullable
    public final Co2eSavedHotShower getSavedHotShower() {
        return this.savedHotShower;
    }

    @Nullable
    public final Co2eSavedValue getSavedSmartPhoneCharges() {
        return this.savedSmartPhoneCharges;
    }

    public int hashCode() {
        Co2eSavedValue co2eSavedValue = this.savedElectricity;
        int iHashCode = (co2eSavedValue == null ? 0 : co2eSavedValue.hashCode()) * 31;
        Co2eSavedHotShower co2eSavedHotShower = this.savedHotShower;
        int iHashCode2 = (iHashCode + (co2eSavedHotShower == null ? 0 : co2eSavedHotShower.hashCode())) * 31;
        Co2eSavedValue co2eSavedValue2 = this.savedCupsOfCoffee;
        int iHashCode3 = (iHashCode2 + (co2eSavedValue2 == null ? 0 : co2eSavedValue2.hashCode())) * 31;
        Co2eSavedValue co2eSavedValue3 = this.savedSmartPhoneCharges;
        return Integer.hashCode(this.co2eSavedValue) + ((iHashCode3 + (co2eSavedValue3 != null ? co2eSavedValue3.hashCode() : 0)) * 31);
    }

    public final void setCo2eSavedValue(int i11) {
        this.co2eSavedValue = i11;
    }

    public final void setSavedCupsOfCoffee(@Nullable Co2eSavedValue co2eSavedValue) {
        this.savedCupsOfCoffee = co2eSavedValue;
    }

    public final void setSavedElectricity(@Nullable Co2eSavedValue co2eSavedValue) {
        this.savedElectricity = co2eSavedValue;
    }

    public final void setSavedHotShower(@Nullable Co2eSavedHotShower co2eSavedHotShower) {
        this.savedHotShower = co2eSavedHotShower;
    }

    public final void setSavedSmartPhoneCharges(@Nullable Co2eSavedValue co2eSavedValue) {
        this.savedSmartPhoneCharges = co2eSavedValue;
    }

    @NotNull
    public String toString() {
        Co2eSavedValue co2eSavedValue = this.savedElectricity;
        Co2eSavedHotShower co2eSavedHotShower = this.savedHotShower;
        Co2eSavedValue co2eSavedValue2 = this.savedCupsOfCoffee;
        Co2eSavedValue co2eSavedValue3 = this.savedSmartPhoneCharges;
        int i11 = this.co2eSavedValue;
        StringBuilder sb2 = new StringBuilder("Co2eSavedResponse(savedElectricity=");
        sb2.append(co2eSavedValue);
        sb2.append(", savedHotShower=");
        sb2.append(co2eSavedHotShower);
        sb2.append(", savedCupsOfCoffee=");
        sb2.append(co2eSavedValue2);
        sb2.append(", savedSmartPhoneCharges=");
        sb2.append(co2eSavedValue3);
        sb2.append(", co2eSavedValue=");
        return k.i(i11, ")", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        Co2eSavedValue co2eSavedValue = this.savedElectricity;
        if (co2eSavedValue == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            co2eSavedValue.writeToParcel(dest, flags);
        }
        Co2eSavedHotShower co2eSavedHotShower = this.savedHotShower;
        if (co2eSavedHotShower == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            co2eSavedHotShower.writeToParcel(dest, flags);
        }
        Co2eSavedValue co2eSavedValue2 = this.savedCupsOfCoffee;
        if (co2eSavedValue2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            co2eSavedValue2.writeToParcel(dest, flags);
        }
        Co2eSavedValue co2eSavedValue3 = this.savedSmartPhoneCharges;
        if (co2eSavedValue3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            co2eSavedValue3.writeToParcel(dest, flags);
        }
        dest.writeInt(this.co2eSavedValue);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/Co2eSavedResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/Co2eSavedResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Co2eSavedResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Co2eSavedResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Co2eSavedResponse createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Co2eSavedResponse(parcel.readInt() == 0 ? null : Co2eSavedValue.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Co2eSavedHotShower.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Co2eSavedValue.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Co2eSavedValue.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Co2eSavedResponse[] newArray(int i11) {
            return new Co2eSavedResponse[i11];
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

    public Co2eSavedResponse(@Nullable Co2eSavedValue co2eSavedValue, @Nullable Co2eSavedHotShower co2eSavedHotShower, @Nullable Co2eSavedValue co2eSavedValue2, @Nullable Co2eSavedValue co2eSavedValue3, int i11) {
        this.savedElectricity = co2eSavedValue;
        this.savedHotShower = co2eSavedHotShower;
        this.savedCupsOfCoffee = co2eSavedValue2;
        this.savedSmartPhoneCharges = co2eSavedValue3;
        this.co2eSavedValue = i11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Co2eSavedResponse(Co2eSavedValue co2eSavedValue, Co2eSavedHotShower co2eSavedHotShower, Co2eSavedValue co2eSavedValue2, Co2eSavedValue co2eSavedValue3, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        int i13;
        Co2eSavedValue co2eSavedValue4;
        co2eSavedValue = (i12 & 1) != 0 ? null : co2eSavedValue;
        co2eSavedHotShower = (i12 & 2) != 0 ? null : co2eSavedHotShower;
        co2eSavedValue2 = (i12 & 4) != 0 ? null : co2eSavedValue2;
        if ((i12 & 8) != 0) {
            i13 = i11;
            co2eSavedValue4 = null;
        } else {
            i13 = i11;
            co2eSavedValue4 = co2eSavedValue3;
        }
        this(co2eSavedValue, co2eSavedHotShower, co2eSavedValue2, co2eSavedValue4, i13);
    }
}
