package com.app.tgtg.model.remote.user.response;

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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J@\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010&\u0012\u0004\b*\u0010+\u001a\u0004\b'\u0010\u0017\"\u0004\b(\u0010)R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010&\u0012\u0004\b.\u0010+\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010)R*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010&\u0012\u0004\b1\u0010+\u001a\u0004\b/\u0010\u0017\"\u0004\b0\u0010)R*\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010&\u0012\u0004\b4\u0010+\u001a\u0004\b2\u0010\u0017\"\u0004\b3\u0010)¨\u00067"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/LocalTime;", "", "", "hour", "minute", "nano", "second", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/LocalTime;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/app/tgtg/model/remote/user/response/LocalTime;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getHour", "setHour", "(Ljava/lang/Integer;)V", "getHour$annotations", "()V", "getMinute", "setMinute", "getMinute$annotations", "getNano", "setNano", "getNano$annotations", "getSecond", "setSecond", "getSecond$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class LocalTime {

    @Nullable
    private Integer hour;

    @Nullable
    private Integer minute;

    @Nullable
    private Integer nano;

    @Nullable
    private Integer second;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ LocalTime(int i11, Integer num, Integer num2, Integer num3, Integer num4, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.hour = null;
        } else {
            this.hour = num;
        }
        if ((i11 & 2) == 0) {
            this.minute = null;
        } else {
            this.minute = num2;
        }
        if ((i11 & 4) == 0) {
            this.nano = null;
        } else {
            this.nano = num3;
        }
        if ((i11 & 8) == 0) {
            this.second = null;
        } else {
            this.second = num4;
        }
    }

    public static /* synthetic */ LocalTime copy$default(LocalTime localTime, Integer num, Integer num2, Integer num3, Integer num4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = localTime.hour;
        }
        if ((i11 & 2) != 0) {
            num2 = localTime.minute;
        }
        if ((i11 & 4) != 0) {
            num3 = localTime.nano;
        }
        if ((i11 & 8) != 0) {
            num4 = localTime.second;
        }
        return localTime.copy(num, num2, num3, num4);
    }

    public static final /* synthetic */ void write$Self$app(LocalTime self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.hour != null) {
            output.r(serialDesc, 0, l0.f29821a, self.hour);
        }
        if (output.C(serialDesc) || self.minute != null) {
            output.r(serialDesc, 1, l0.f29821a, self.minute);
        }
        if (output.C(serialDesc) || self.nano != null) {
            output.r(serialDesc, 2, l0.f29821a, self.nano);
        }
        if (!output.C(serialDesc) && self.second == null) {
            return;
        }
        output.r(serialDesc, 3, l0.f29821a, self.second);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getHour() {
        return this.hour;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMinute() {
        return this.minute;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getNano() {
        return this.nano;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getSecond() {
        return this.second;
    }

    @NotNull
    public final LocalTime copy(@Nullable Integer hour, @Nullable Integer minute, @Nullable Integer nano, @Nullable Integer second) {
        return new LocalTime(hour, minute, nano, second);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalTime)) {
            return false;
        }
        LocalTime localTime = (LocalTime) other;
        return Intrinsics.areEqual(this.hour, localTime.hour) && Intrinsics.areEqual(this.minute, localTime.minute) && Intrinsics.areEqual(this.nano, localTime.nano) && Intrinsics.areEqual(this.second, localTime.second);
    }

    @Nullable
    public final Integer getHour() {
        return this.hour;
    }

    @Nullable
    public final Integer getMinute() {
        return this.minute;
    }

    @Nullable
    public final Integer getNano() {
        return this.nano;
    }

    @Nullable
    public final Integer getSecond() {
        return this.second;
    }

    public int hashCode() {
        Integer num = this.hour;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.minute;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.nano;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.second;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final void setHour(@Nullable Integer num) {
        this.hour = num;
    }

    public final void setMinute(@Nullable Integer num) {
        this.minute = num;
    }

    public final void setNano(@Nullable Integer num) {
        this.nano = num;
    }

    public final void setSecond(@Nullable Integer num) {
        this.second = num;
    }

    @NotNull
    public String toString() {
        return "LocalTime(hour=" + this.hour + ", minute=" + this.minute + ", nano=" + this.nano + ", second=" + this.second + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/LocalTime$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/LocalTime;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return LocalTime$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("hour")
    public static /* synthetic */ void getHour$annotations() {
    }

    @g("minute")
    public static /* synthetic */ void getMinute$annotations() {
    }

    @g("nano")
    public static /* synthetic */ void getNano$annotations() {
    }

    @g("second")
    public static /* synthetic */ void getSecond$annotations() {
    }

    public LocalTime() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null, 15, (DefaultConstructorMarker) null);
    }

    public LocalTime(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        this.hour = num;
        this.minute = num2;
        this.nano = num3;
        this.second = num4;
    }

    public /* synthetic */ LocalTime(Integer num, Integer num2, Integer num3, Integer num4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : num3, (i11 & 8) != 0 ? null : num4);
    }
}
