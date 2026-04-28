package com.app.tgtg.model.remote.item;

import android.os.Parcel;
import android.os.Parcelable;
import i90.g;
import i90.h;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import m90.r1;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001bJ\u001d\u0010 \u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J(\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010#R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010(\u0012\u0004\b,\u0010-\u001a\u0004\b)\u0010#\"\u0004\b*\u0010+R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010(\u0012\u0004\b0\u0010-\u001a\u0004\b.\u0010#\"\u0004\b/\u0010+¨\u00063"}, d2 = {"Lcom/app/tgtg/model/remote/item/PickupCountry;", "Landroid/os/Parcelable;", "", "isoCode", "countryName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/PickupCountry;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/item/PickupCountry;", "toString", "Ljava/lang/String;", "getIsoCode", "setIsoCode", "(Ljava/lang/String;)V", "getIsoCode$annotations", "()V", "getCountryName", "setCountryName", "getCountryName$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class PickupCountry implements Parcelable {

    @Nullable
    private String countryName;

    @Nullable
    private String isoCode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<PickupCountry> CREATOR = new Creator();

    public /* synthetic */ PickupCountry(int i11, String str, String str2, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.isoCode = null;
        } else {
            this.isoCode = str;
        }
        if ((i11 & 2) == 0) {
            this.countryName = null;
        } else {
            this.countryName = str2;
        }
    }

    public static /* synthetic */ PickupCountry copy$default(PickupCountry pickupCountry, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pickupCountry.isoCode;
        }
        if ((i11 & 2) != 0) {
            str2 = pickupCountry.countryName;
        }
        return pickupCountry.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$app(PickupCountry self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.isoCode != null) {
            output.r(serialDesc, 0, r1.f29848a, self.isoCode);
        }
        if (!output.C(serialDesc) && self.countryName == null) {
            return;
        }
        output.r(serialDesc, 1, r1.f29848a, self.countryName);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIsoCode() {
        return this.isoCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountryName() {
        return this.countryName;
    }

    @NotNull
    public final PickupCountry copy(@Nullable String isoCode, @Nullable String countryName) {
        return new PickupCountry(isoCode, countryName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickupCountry)) {
            return false;
        }
        PickupCountry pickupCountry = (PickupCountry) other;
        return Intrinsics.areEqual(this.isoCode, pickupCountry.isoCode) && Intrinsics.areEqual(this.countryName, pickupCountry.countryName);
    }

    @Nullable
    public final String getCountryName() {
        return this.countryName;
    }

    @Nullable
    public final String getIsoCode() {
        return this.isoCode;
    }

    public int hashCode() {
        return Objects.hash(this.isoCode, this.countryName);
    }

    public final void setCountryName(@Nullable String str) {
        this.countryName = str;
    }

    public final void setIsoCode(@Nullable String str) {
        this.isoCode = str;
    }

    @NotNull
    public String toString() {
        return a.d("PickupCountry(isoCode=", this.isoCode, ", countryName=", this.countryName, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.isoCode);
        dest.writeString(this.countryName);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/PickupCountry$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/PickupCountry;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PickupCountry$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PickupCountry> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PickupCountry createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new PickupCountry(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PickupCountry[] newArray(int i11) {
            return new PickupCountry[i11];
        }
    }

    @g("name")
    public static /* synthetic */ void getCountryName$annotations() {
    }

    @g("iso_code")
    public static /* synthetic */ void getIsoCode$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PickupCountry() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public PickupCountry(@Nullable String str, @Nullable String str2) {
        this.isoCode = str;
        this.countryName = str2;
    }

    public /* synthetic */ PickupCountry(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
