package com.braze.triggers.managers;

import com.braze.i1;
import com.braze.models.inappmessage.l;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import j4.s;
import kotlin.jvm.functions.Function0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public final boolean a(com.braze.triggers.events.b bVar, com.braze.triggers.actions.g gVar, long j9, long j11) {
        long j12;
        bVar.getClass();
        gVar.getClass();
        if (bVar instanceof com.braze.triggers.events.h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.c(2), 7, (Object) null);
            return true;
        }
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        com.braze.triggers.config.c cVar = gVar.f10799b;
        long j13 = jNowInSeconds + ((long) cVar.f10826d);
        int i11 = cVar.f10829g;
        if (i11 != -1) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l(i11, 19), 7, (Object) null);
            j12 = j9 + ((long) i11);
        } else {
            j12 = j9 + j11;
        }
        long j14 = j12;
        if (j13 >= j14) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new i1(1, j13, j14), 6, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new qw.f(0, j11, j14, j13), 6, (Object) null);
        return false;
    }

    public static final String a() {
        return "Ignoring minimum time interval between triggered actions because the trigger event is a test.";
    }

    public static final String a(int i11) {
        return s.f(i11, "Using override minimum display interval: ");
    }

    public static final String a(long j9, long j11) {
        StringBuilder sbG = l1.g("Minimum time interval requirement met for matched trigger. Action display time: ", j9, " . Next viable display time: ");
        sbG.append(j11);
        return sbG.toString();
    }

    public static final String a(long j9, long j11, long j12) {
        StringBuilder sbG = l1.g("Minimum time interval requirement and triggered action override time interval requirement of ", j9, " not met for matched trigger. Returning null. Next viable display time: ");
        sbG.append(j11);
        sbG.append(". Action display time: ");
        sbG.append(j12);
        return sbG.toString();
    }
}
