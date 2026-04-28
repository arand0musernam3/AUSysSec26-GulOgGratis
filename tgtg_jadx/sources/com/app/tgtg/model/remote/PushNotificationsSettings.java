package com.app.tgtg.model.remote;

import b3.i;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJD\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010*\u0012\u0004\b.\u0010/\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010-R(\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010*\u0012\u0004\b2\u0010/\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010-R(\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010*\u0012\u0004\b5\u0010/\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010-R(\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010*\u0012\u0004\b8\u0010/\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u0010-R*\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u00109\u0012\u0004\b=\u0010/\u001a\u0004\b:\u0010\u001f\"\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/app/tgtg/model/remote/PushNotificationsSettings;", "", "", "calendarAlerts", "transactional", "announcements", "supplyAlerts", "Lcom/app/tgtg/model/remote/DailyReminder;", "dailyReminder", "<init>", "(ZZZZLcom/app/tgtg/model/remote/DailyReminder;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IZZZZLcom/app/tgtg/model/remote/DailyReminder;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/PushNotificationsSettings;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "component3", "component4", "component5", "()Lcom/app/tgtg/model/remote/DailyReminder;", "copy", "(ZZZZLcom/app/tgtg/model/remote/DailyReminder;)Lcom/app/tgtg/model/remote/PushNotificationsSettings;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getCalendarAlerts", "setCalendarAlerts", "(Z)V", "getCalendarAlerts$annotations", "()V", "getTransactional", "setTransactional", "getTransactional$annotations", "getAnnouncements", "setAnnouncements", "getAnnouncements$annotations", "getSupplyAlerts", "setSupplyAlerts", "getSupplyAlerts$annotations", "Lcom/app/tgtg/model/remote/DailyReminder;", "getDailyReminder", "setDailyReminder", "(Lcom/app/tgtg/model/remote/DailyReminder;)V", "getDailyReminder$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class PushNotificationsSettings {
    private boolean announcements;
    private boolean calendarAlerts;

    @Nullable
    private DailyReminder dailyReminder;
    private boolean supplyAlerts;
    private boolean transactional;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ PushNotificationsSettings(int i11, boolean z11, boolean z12, boolean z13, boolean z14, DailyReminder dailyReminder, m1 m1Var) {
        if (16 != (i11 & 16)) {
            c1.j(i11, 16, PushNotificationsSettings$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.calendarAlerts = true;
        } else {
            this.calendarAlerts = z11;
        }
        if ((i11 & 2) == 0) {
            this.transactional = true;
        } else {
            this.transactional = z12;
        }
        if ((i11 & 4) == 0) {
            this.announcements = true;
        } else {
            this.announcements = z13;
        }
        if ((i11 & 8) == 0) {
            this.supplyAlerts = true;
        } else {
            this.supplyAlerts = z14;
        }
        this.dailyReminder = dailyReminder;
    }

    public static /* synthetic */ PushNotificationsSettings copy$default(PushNotificationsSettings pushNotificationsSettings, boolean z11, boolean z12, boolean z13, boolean z14, DailyReminder dailyReminder, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = pushNotificationsSettings.calendarAlerts;
        }
        if ((i11 & 2) != 0) {
            z12 = pushNotificationsSettings.transactional;
        }
        if ((i11 & 4) != 0) {
            z13 = pushNotificationsSettings.announcements;
        }
        if ((i11 & 8) != 0) {
            z14 = pushNotificationsSettings.supplyAlerts;
        }
        if ((i11 & 16) != 0) {
            dailyReminder = pushNotificationsSettings.dailyReminder;
        }
        DailyReminder dailyReminder2 = dailyReminder;
        boolean z15 = z13;
        return pushNotificationsSettings.copy(z11, z12, z15, z14, dailyReminder2);
    }

    public static final /* synthetic */ void write$Self$app(PushNotificationsSettings self, b output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.calendarAlerts);
        output.p(serialDesc, 1, self.transactional);
        output.p(serialDesc, 2, self.announcements);
        output.p(serialDesc, 3, self.supplyAlerts);
        output.r(serialDesc, 4, DailyReminder$$serializer.INSTANCE, self.dailyReminder);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getCalendarAlerts() {
        return this.calendarAlerts;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getTransactional() {
        return this.transactional;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAnnouncements() {
        return this.announcements;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSupplyAlerts() {
        return this.supplyAlerts;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DailyReminder getDailyReminder() {
        return this.dailyReminder;
    }

    @NotNull
    public final PushNotificationsSettings copy(boolean calendarAlerts, boolean transactional, boolean announcements, boolean supplyAlerts, @Nullable DailyReminder dailyReminder) {
        return new PushNotificationsSettings(calendarAlerts, transactional, announcements, supplyAlerts, dailyReminder);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushNotificationsSettings)) {
            return false;
        }
        PushNotificationsSettings pushNotificationsSettings = (PushNotificationsSettings) other;
        return this.calendarAlerts == pushNotificationsSettings.calendarAlerts && this.transactional == pushNotificationsSettings.transactional && this.announcements == pushNotificationsSettings.announcements && this.supplyAlerts == pushNotificationsSettings.supplyAlerts && Intrinsics.areEqual(this.dailyReminder, pushNotificationsSettings.dailyReminder);
    }

    public final boolean getAnnouncements() {
        return this.announcements;
    }

    public final boolean getCalendarAlerts() {
        return this.calendarAlerts;
    }

    @Nullable
    public final DailyReminder getDailyReminder() {
        return this.dailyReminder;
    }

    public final boolean getSupplyAlerts() {
        return this.supplyAlerts;
    }

    public final boolean getTransactional() {
        return this.transactional;
    }

    public int hashCode() {
        int iE = k.e(k.e(k.e(Boolean.hashCode(this.calendarAlerts) * 31, 31, this.transactional), 31, this.announcements), 31, this.supplyAlerts);
        DailyReminder dailyReminder = this.dailyReminder;
        return iE + (dailyReminder == null ? 0 : dailyReminder.hashCode());
    }

    public final void setAnnouncements(boolean z11) {
        this.announcements = z11;
    }

    public final void setCalendarAlerts(boolean z11) {
        this.calendarAlerts = z11;
    }

    public final void setDailyReminder(@Nullable DailyReminder dailyReminder) {
        this.dailyReminder = dailyReminder;
    }

    public final void setSupplyAlerts(boolean z11) {
        this.supplyAlerts = z11;
    }

    public final void setTransactional(boolean z11) {
        this.transactional = z11;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.calendarAlerts;
        boolean z12 = this.transactional;
        boolean z13 = this.announcements;
        boolean z14 = this.supplyAlerts;
        DailyReminder dailyReminder = this.dailyReminder;
        StringBuilder sbP = i.p("PushNotificationsSettings(calendarAlerts=", z11, ", transactional=", z12, ", announcements=");
        i.C(sbP, z13, ", supplyAlerts=", z14, ", dailyReminder=");
        sbP.append(dailyReminder);
        sbP.append(")");
        return sbP.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/PushNotificationsSettings$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/PushNotificationsSettings;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PushNotificationsSettings$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("lifecycle_and_adhoc_main")
    public static /* synthetic */ void getAnnouncements$annotations() {
    }

    @g("calendar_alerts")
    public static /* synthetic */ void getCalendarAlerts$annotations() {
    }

    @g("daily_reminder")
    public static /* synthetic */ void getDailyReminder$annotations() {
    }

    @g("surprise_bag_alerts")
    public static /* synthetic */ void getSupplyAlerts$annotations() {
    }

    @g("transactional")
    public static /* synthetic */ void getTransactional$annotations() {
    }

    public PushNotificationsSettings(boolean z11, boolean z12, boolean z13, boolean z14, @Nullable DailyReminder dailyReminder) {
        this.calendarAlerts = z11;
        this.transactional = z12;
        this.announcements = z13;
        this.supplyAlerts = z14;
        this.dailyReminder = dailyReminder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PushNotificationsSettings(boolean z11, boolean z12, boolean z13, boolean z14, DailyReminder dailyReminder, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        DailyReminder dailyReminder2;
        boolean z15;
        z11 = (i11 & 1) != 0 ? true : z11;
        z12 = (i11 & 2) != 0 ? true : z12;
        z13 = (i11 & 4) != 0 ? true : z13;
        if ((i11 & 8) != 0) {
            dailyReminder2 = dailyReminder;
            z15 = true;
        } else {
            dailyReminder2 = dailyReminder;
            z15 = z14;
        }
        this(z11, z12, z13, z15, dailyReminder2);
    }
}
