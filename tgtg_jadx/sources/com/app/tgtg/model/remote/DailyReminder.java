package com.app.tgtg.model.remote;

import b3.i;
import i90.g;
import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012JV\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J'\u0010+\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b)\u0010*R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010,\u0012\u0004\b0\u00101\u001a\u0004\b-\u0010\u0012\"\u0004\b.\u0010/R(\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010,\u0012\u0004\b4\u00101\u001a\u0004\b2\u0010\u0012\"\u0004\b3\u0010/R(\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010,\u0012\u0004\b7\u00101\u001a\u0004\b5\u0010\u0012\"\u0004\b6\u0010/R(\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010,\u0012\u0004\b:\u00101\u001a\u0004\b8\u0010\u0012\"\u0004\b9\u0010/R(\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010,\u0012\u0004\b=\u00101\u001a\u0004\b;\u0010\u0012\"\u0004\b<\u0010/R(\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010,\u0012\u0004\b@\u00101\u001a\u0004\b>\u0010\u0012\"\u0004\b?\u0010/R(\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010,\u0012\u0004\bC\u00101\u001a\u0004\bA\u0010\u0012\"\u0004\bB\u0010/¨\u0006F"}, d2 = {"Lcom/app/tgtg/model/remote/DailyReminder;", "", "", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday", "<init>", "(ZZZZZZZ)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IZZZZZZZLm90/m1;)V", "component1", "()Z", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZZZZZZZ)Lcom/app/tgtg/model/remote/DailyReminder;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/DailyReminder;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Z", "getMonday", "setMonday", "(Z)V", "getMonday$annotations", "()V", "getTuesday", "setTuesday", "getTuesday$annotations", "getWednesday", "setWednesday", "getWednesday$annotations", "getThursday", "setThursday", "getThursday$annotations", "getFriday", "setFriday", "getFriday$annotations", "getSaturday", "setSaturday", "getSaturday$annotations", "getSunday", "setSunday", "getSunday$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DailyReminder {
    private boolean friday;
    private boolean monday;
    private boolean saturday;
    private boolean sunday;
    private boolean thursday;
    private boolean tuesday;
    private boolean wednesday;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ DailyReminder(int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.monday = false;
        } else {
            this.monday = z11;
        }
        if ((i11 & 2) == 0) {
            this.tuesday = false;
        } else {
            this.tuesday = z12;
        }
        if ((i11 & 4) == 0) {
            this.wednesday = false;
        } else {
            this.wednesday = z13;
        }
        if ((i11 & 8) == 0) {
            this.thursday = false;
        } else {
            this.thursday = z14;
        }
        if ((i11 & 16) == 0) {
            this.friday = false;
        } else {
            this.friday = z15;
        }
        if ((i11 & 32) == 0) {
            this.saturday = false;
        } else {
            this.saturday = z16;
        }
        if ((i11 & 64) == 0) {
            this.sunday = false;
        } else {
            this.sunday = z17;
        }
    }

    public static /* synthetic */ DailyReminder copy$default(DailyReminder dailyReminder, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = dailyReminder.monday;
        }
        if ((i11 & 2) != 0) {
            z12 = dailyReminder.tuesday;
        }
        if ((i11 & 4) != 0) {
            z13 = dailyReminder.wednesday;
        }
        if ((i11 & 8) != 0) {
            z14 = dailyReminder.thursday;
        }
        if ((i11 & 16) != 0) {
            z15 = dailyReminder.friday;
        }
        if ((i11 & 32) != 0) {
            z16 = dailyReminder.saturday;
        }
        if ((i11 & 64) != 0) {
            z17 = dailyReminder.sunday;
        }
        boolean z18 = z16;
        boolean z19 = z17;
        boolean z21 = z15;
        boolean z22 = z13;
        return dailyReminder.copy(z11, z12, z22, z14, z21, z18, z19);
    }

    public static final /* synthetic */ void write$Self$app(DailyReminder self, b output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.monday);
        output.p(serialDesc, 1, self.tuesday);
        output.p(serialDesc, 2, self.wednesday);
        output.p(serialDesc, 3, self.thursday);
        output.p(serialDesc, 4, self.friday);
        output.p(serialDesc, 5, self.saturday);
        output.p(serialDesc, 6, self.sunday);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getMonday() {
        return this.monday;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getTuesday() {
        return this.tuesday;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getWednesday() {
        return this.wednesday;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getThursday() {
        return this.thursday;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getFriday() {
        return this.friday;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getSaturday() {
        return this.saturday;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getSunday() {
        return this.sunday;
    }

    @NotNull
    public final DailyReminder copy(boolean monday, boolean tuesday, boolean wednesday, boolean thursday, boolean friday, boolean saturday, boolean sunday) {
        return new DailyReminder(monday, tuesday, wednesday, thursday, friday, saturday, sunday);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyReminder)) {
            return false;
        }
        DailyReminder dailyReminder = (DailyReminder) other;
        return this.monday == dailyReminder.monday && this.tuesday == dailyReminder.tuesday && this.wednesday == dailyReminder.wednesday && this.thursday == dailyReminder.thursday && this.friday == dailyReminder.friday && this.saturday == dailyReminder.saturday && this.sunday == dailyReminder.sunday;
    }

    public final boolean getFriday() {
        return this.friday;
    }

    public final boolean getMonday() {
        return this.monday;
    }

    public final boolean getSaturday() {
        return this.saturday;
    }

    public final boolean getSunday() {
        return this.sunday;
    }

    public final boolean getThursday() {
        return this.thursday;
    }

    public final boolean getTuesday() {
        return this.tuesday;
    }

    public final boolean getWednesday() {
        return this.wednesday;
    }

    public int hashCode() {
        return Boolean.hashCode(this.sunday) + k.e(k.e(k.e(k.e(k.e(Boolean.hashCode(this.monday) * 31, 31, this.tuesday), 31, this.wednesday), 31, this.thursday), 31, this.friday), 31, this.saturday);
    }

    public final void setFriday(boolean z11) {
        this.friday = z11;
    }

    public final void setMonday(boolean z11) {
        this.monday = z11;
    }

    public final void setSaturday(boolean z11) {
        this.saturday = z11;
    }

    public final void setSunday(boolean z11) {
        this.sunday = z11;
    }

    public final void setThursday(boolean z11) {
        this.thursday = z11;
    }

    public final void setTuesday(boolean z11) {
        this.tuesday = z11;
    }

    public final void setWednesday(boolean z11) {
        this.wednesday = z11;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.monday;
        boolean z12 = this.tuesday;
        boolean z13 = this.wednesday;
        boolean z14 = this.thursday;
        boolean z15 = this.friday;
        boolean z16 = this.saturday;
        boolean z17 = this.sunday;
        StringBuilder sbP = i.p("DailyReminder(monday=", z11, ", tuesday=", z12, ", wednesday=");
        i.C(sbP, z13, ", thursday=", z14, ", friday=");
        i.C(sbP, z15, ", saturday=", z16, ", sunday=");
        return s.o(sbP, z17, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/DailyReminder$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/DailyReminder;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DailyReminder$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("friday")
    public static /* synthetic */ void getFriday$annotations() {
    }

    @g("monday")
    public static /* synthetic */ void getMonday$annotations() {
    }

    @g("saturday")
    public static /* synthetic */ void getSaturday$annotations() {
    }

    @g("sunday")
    public static /* synthetic */ void getSunday$annotations() {
    }

    @g("thursday")
    public static /* synthetic */ void getThursday$annotations() {
    }

    @g("tuesday")
    public static /* synthetic */ void getTuesday$annotations() {
    }

    @g("wednesday")
    public static /* synthetic */ void getWednesday$annotations() {
    }

    public DailyReminder() {
        this(false, false, false, false, false, false, false, 127, (DefaultConstructorMarker) null);
    }

    public DailyReminder(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.monday = z11;
        this.tuesday = z12;
        this.wednesday = z13;
        this.thursday = z14;
        this.friday = z15;
        this.saturday = z16;
        this.sunday = z17;
    }

    public /* synthetic */ DailyReminder(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? false : z14, (i11 & 16) != 0 ? false : z15, (i11 & 32) != 0 ? false : z16, (i11 & 64) != 0 ? false : z17);
    }
}
