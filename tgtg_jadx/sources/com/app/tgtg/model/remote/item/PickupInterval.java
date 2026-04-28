package com.app.tgtg.model.remote.item;

import android.os.Parcel;
import android.os.Parcelable;
import dv.d;
import i90.g;
import i90.h;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import m90.r1;
import mv.p0;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001bJ\u001d\u0010 \u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J(\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010#R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010(\u0012\u0004\b,\u0010-\u001a\u0004\b)\u0010#\"\u0004\b*\u0010+R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010(\u0012\u0004\b0\u0010-\u001a\u0004\b.\u0010#\"\u0004\b/\u0010+R\u0013\u00102\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b1\u0010#R\u0011\u00104\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b3\u0010#¨\u00067"}, d2 = {"Lcom/app/tgtg/model/remote/item/PickupInterval;", "Landroid/os/Parcelable;", "", "intervalStart", "intervalEnd", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/PickupInterval;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/item/PickupInterval;", "toString", "Ljava/lang/String;", "getIntervalStart", "setIntervalStart", "(Ljava/lang/String;)V", "getIntervalStart$annotations", "()V", "getIntervalEnd", "setIntervalEnd", "getIntervalEnd$annotations", "getPickupWindowStartSecond", "pickupWindowStartSecond", "getPickupWindowLength", "pickupWindowLength", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class PickupInterval implements Parcelable {

    @Nullable
    private String intervalEnd;

    @Nullable
    private String intervalStart;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<PickupInterval> CREATOR = new Creator();

    public /* synthetic */ PickupInterval(int i11, String str, String str2, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.intervalStart = null;
        } else {
            this.intervalStart = str;
        }
        if ((i11 & 2) == 0) {
            this.intervalEnd = null;
        } else {
            this.intervalEnd = str2;
        }
    }

    public static /* synthetic */ PickupInterval copy$default(PickupInterval pickupInterval, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pickupInterval.intervalStart;
        }
        if ((i11 & 2) != 0) {
            str2 = pickupInterval.intervalEnd;
        }
        return pickupInterval.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$app(PickupInterval self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.intervalStart != null) {
            output.r(serialDesc, 0, r1.f29848a, self.intervalStart);
        }
        if (!output.C(serialDesc) && self.intervalEnd == null) {
            return;
        }
        output.r(serialDesc, 1, r1.f29848a, self.intervalEnd);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIntervalStart() {
        return this.intervalStart;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIntervalEnd() {
        return this.intervalEnd;
    }

    @NotNull
    public final PickupInterval copy(@Nullable String intervalStart, @Nullable String intervalEnd) {
        return new PickupInterval(intervalStart, intervalEnd);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickupInterval)) {
            return false;
        }
        PickupInterval pickupInterval = (PickupInterval) other;
        return Intrinsics.areEqual(this.intervalStart, pickupInterval.intervalStart) && Intrinsics.areEqual(this.intervalEnd, pickupInterval.intervalEnd);
    }

    @Nullable
    public final String getIntervalEnd() {
        return this.intervalEnd;
    }

    @Nullable
    public final String getIntervalStart() {
        return this.intervalStart;
    }

    @NotNull
    public final String getPickupWindowLength() {
        String str;
        Date dateI;
        Date dateI2;
        String str2 = this.intervalStart;
        if (str2 == null || (str = this.intervalEnd) == null || (dateI = p0.I(str2)) == null || (dateI2 = p0.I(str)) == null) {
            return "0";
        }
        double time = (dateI2.getTime() - dateI.getTime()) / ((double) 3600000);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(time)}, 1));
    }

    @Nullable
    public final String getPickupWindowStartSecond() {
        Date dateI;
        String str = this.intervalStart;
        if (str == null || (dateI = p0.I(str)) == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateI);
        return calendar.get(13) % 2 == 0 ? d.EVEN.a() : d.ODD.a();
    }

    public int hashCode() {
        return Objects.hash(this.intervalStart, this.intervalEnd);
    }

    public final void setIntervalEnd(@Nullable String str) {
        this.intervalEnd = str;
    }

    public final void setIntervalStart(@Nullable String str) {
        this.intervalStart = str;
    }

    @NotNull
    public String toString() {
        return a.d("PickupInterval(intervalStart=", this.intervalStart, ", intervalEnd=", this.intervalEnd, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.intervalStart);
        dest.writeString(this.intervalEnd);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/PickupInterval$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/PickupInterval;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PickupInterval$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PickupInterval> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PickupInterval createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new PickupInterval(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PickupInterval[] newArray(int i11) {
            return new PickupInterval[i11];
        }
    }

    @g("end")
    public static /* synthetic */ void getIntervalEnd$annotations() {
    }

    @g("start")
    public static /* synthetic */ void getIntervalStart$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PickupInterval() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public PickupInterval(@Nullable String str, @Nullable String str2) {
        this.intervalStart = str;
        this.intervalEnd = str2;
    }

    public /* synthetic */ PickupInterval(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
