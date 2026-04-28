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
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0016J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010(\u0012\u0004\b,\u0010-\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010+R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010.\u0012\u0004\b2\u0010-\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/Co2eSavedValue;", "Landroid/os/Parcelable;", "", "value", "", "countryId", "<init>", "(ILjava/lang/String;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IILjava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/Co2eSavedValue;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/app/tgtg/model/remote/user/response/Co2eSavedValue;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getValue", "setValue", "(I)V", "getValue$annotations", "()V", "Ljava/lang/String;", "getCountryId", "setCountryId", "(Ljava/lang/String;)V", "getCountryId$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Co2eSavedValue implements Parcelable {

    @Nullable
    private String countryId;
    private int value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Co2eSavedValue> CREATOR = new Creator();

    public /* synthetic */ Co2eSavedValue(int i11, int i12, String str, m1 m1Var) {
        if (1 != (i11 & 1)) {
            c1.j(i11, 1, Co2eSavedValue$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.value = i12;
        if ((i11 & 2) == 0) {
            this.countryId = null;
        } else {
            this.countryId = str;
        }
    }

    public static /* synthetic */ Co2eSavedValue copy$default(Co2eSavedValue co2eSavedValue, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = co2eSavedValue.value;
        }
        if ((i12 & 2) != 0) {
            str = co2eSavedValue.countryId;
        }
        return co2eSavedValue.copy(i11, str);
    }

    public static final /* synthetic */ void write$Self$app(Co2eSavedValue self, b output, SerialDescriptor serialDesc) {
        output.m(0, self.value, serialDesc);
        if (!output.C(serialDesc) && self.countryId == null) {
            return;
        }
        output.r(serialDesc, 1, r1.f29848a, self.countryId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountryId() {
        return this.countryId;
    }

    @NotNull
    public final Co2eSavedValue copy(int value, @Nullable String countryId) {
        return new Co2eSavedValue(value, countryId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Co2eSavedValue)) {
            return false;
        }
        Co2eSavedValue co2eSavedValue = (Co2eSavedValue) other;
        return this.value == co2eSavedValue.value && Intrinsics.areEqual(this.countryId, co2eSavedValue.countryId);
    }

    @Nullable
    public final String getCountryId() {
        return this.countryId;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.value) * 31;
        String str = this.countryId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setCountryId(@Nullable String str) {
        this.countryId = str;
    }

    public final void setValue(int i11) {
        this.value = i11;
    }

    @NotNull
    public String toString() {
        return "Co2eSavedValue(value=" + this.value + ", countryId=" + this.countryId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.value);
        dest.writeString(this.countryId);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/Co2eSavedValue$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/Co2eSavedValue;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Co2eSavedValue$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Co2eSavedValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Co2eSavedValue createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Co2eSavedValue(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Co2eSavedValue[] newArray(int i11) {
            return new Co2eSavedValue[i11];
        }
    }

    @g("country_id")
    public static /* synthetic */ void getCountryId$annotations() {
    }

    @g("value")
    public static /* synthetic */ void getValue$annotations() {
    }

    public Co2eSavedValue(int i11, @Nullable String str) {
        this.value = i11;
        this.countryId = str;
    }

    public /* synthetic */ Co2eSavedValue(int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : str);
    }
}
