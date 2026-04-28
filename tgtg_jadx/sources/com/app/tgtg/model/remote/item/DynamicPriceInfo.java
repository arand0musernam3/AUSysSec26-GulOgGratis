package com.app.tgtg.model.remote.item;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import i90.h;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.g;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001cJ\u001d\u0010!\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010&J4\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010$R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010+\u0012\u0004\b/\u00100\u001a\u0004\b,\u0010$\"\u0004\b-\u0010.R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u00101\u0012\u0004\b4\u00100\u001a\u0004\b\u0005\u0010&\"\u0004\b2\u00103R*\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u00101\u0012\u0004\b6\u00100\u001a\u0004\b\u0006\u0010&\"\u0004\b5\u00103¨\u00069"}, d2 = {"Lcom/app/tgtg/model/remote/item/DynamicPriceInfo;", "Landroid/os/Parcelable;", "", "type", "", "isRecurring", "isPersonal", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/DynamicPriceInfo;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/app/tgtg/model/remote/item/DynamicPriceInfo;", "toString", "Ljava/lang/String;", "getType", "setType", "(Ljava/lang/String;)V", "getType$annotations", "()V", "Ljava/lang/Boolean;", "setRecurring", "(Ljava/lang/Boolean;)V", "isRecurring$annotations", "setPersonal", "isPersonal$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DynamicPriceInfo implements Parcelable {

    @Nullable
    private Boolean isPersonal;

    @Nullable
    private Boolean isRecurring;

    @Nullable
    private String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<DynamicPriceInfo> CREATOR = new Creator();

    public /* synthetic */ DynamicPriceInfo(int i11, String str, Boolean bool, Boolean bool2, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i11 & 2) == 0) {
            this.isRecurring = null;
        } else {
            this.isRecurring = bool;
        }
        if ((i11 & 4) == 0) {
            this.isPersonal = null;
        } else {
            this.isPersonal = bool2;
        }
    }

    public static /* synthetic */ DynamicPriceInfo copy$default(DynamicPriceInfo dynamicPriceInfo, String str, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dynamicPriceInfo.type;
        }
        if ((i11 & 2) != 0) {
            bool = dynamicPriceInfo.isRecurring;
        }
        if ((i11 & 4) != 0) {
            bool2 = dynamicPriceInfo.isPersonal;
        }
        return dynamicPriceInfo.copy(str, bool, bool2);
    }

    public static final /* synthetic */ void write$Self$app(DynamicPriceInfo self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.type != null) {
            output.r(serialDesc, 0, r1.f29848a, self.type);
        }
        if (output.C(serialDesc) || self.isRecurring != null) {
            output.r(serialDesc, 1, g.f29797a, self.isRecurring);
        }
        if (!output.C(serialDesc) && self.isPersonal == null) {
            return;
        }
        output.r(serialDesc, 2, g.f29797a, self.isPersonal);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsRecurring() {
        return this.isRecurring;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsPersonal() {
        return this.isPersonal;
    }

    @NotNull
    public final DynamicPriceInfo copy(@Nullable String type, @Nullable Boolean isRecurring, @Nullable Boolean isPersonal) {
        return new DynamicPriceInfo(type, isRecurring, isPersonal);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicPriceInfo)) {
            return false;
        }
        DynamicPriceInfo dynamicPriceInfo = (DynamicPriceInfo) other;
        return Intrinsics.areEqual(this.type, dynamicPriceInfo.type) && Intrinsics.areEqual(this.isRecurring, dynamicPriceInfo.isRecurring) && Intrinsics.areEqual(this.isPersonal, dynamicPriceInfo.isPersonal);
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.isRecurring, this.isPersonal);
    }

    @Nullable
    public final Boolean isPersonal() {
        return this.isPersonal;
    }

    @Nullable
    public final Boolean isRecurring() {
        return this.isRecurring;
    }

    public final void setPersonal(@Nullable Boolean bool) {
        this.isPersonal = bool;
    }

    public final void setRecurring(@Nullable Boolean bool) {
        this.isRecurring = bool;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        return "DynamicPriceInfo(type=" + this.type + ", isRecurring=" + this.isRecurring + ", isPersonal=" + this.isPersonal + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.type);
        Boolean bool = this.isRecurring;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool);
        }
        Boolean bool2 = this.isPersonal;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/DynamicPriceInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/DynamicPriceInfo;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DynamicPriceInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DynamicPriceInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DynamicPriceInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            String string = parcel.readString();
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DynamicPriceInfo(string, boolValueOf, boolValueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DynamicPriceInfo[] newArray(int i11) {
            return new DynamicPriceInfo[i11];
        }
    }

    @i90.g("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @i90.g("is_personal")
    public static /* synthetic */ void isPersonal$annotations() {
    }

    @i90.g("is_recurring")
    public static /* synthetic */ void isRecurring$annotations() {
    }

    public DynamicPriceInfo() {
        this((String) null, (Boolean) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
    }

    public DynamicPriceInfo(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.type = str;
        this.isRecurring = bool;
        this.isPersonal = bool2;
    }

    public /* synthetic */ DynamicPriceInfo(String str, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : bool2);
    }
}
