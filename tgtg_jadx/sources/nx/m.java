package nx;

import android.content.Context;
import android.os.Bundle;
import ax.a0;
import ax.m0;
import ax.s0;
import bx.p;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.StringCompanionObject;
import tx.f0;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f31445a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f31446b = {300000, TimeConstants.FIFTEEN_MINUTES_DIFFERENCE, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    public static final void b(Context context, String str, String str2) {
        Set set = yx.a.f46339a;
        if (set.contains(m.class)) {
            return;
        }
        try {
            context.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", "Unclassified");
            bx.m mVar = new bx.m(str, str2);
            a0 a0Var = a0.f4849a;
            if (s0.c()) {
                mVar.d(bundle, "fb_mobile_activate_app");
            }
            String str3 = bx.m.f6734c;
            if (r40.d.q() == bx.l.EXPLICIT_ONLY || set.contains(mVar)) {
                return;
            }
            try {
                bx.j.c(p.EXPLICIT);
            } catch (Throwable th2) {
                yx.a.a(mVar, th2);
            }
        } catch (Throwable th3) {
            yx.a.a(m.class, th3);
        }
    }

    public static final void d(String str, androidx.recyclerview.widget.b bVar, String str2) {
        Long l;
        Set set = yx.a.f46339a;
        if (set.contains(m.class) || bVar == null) {
            return;
        }
        try {
            Long l7 = (Long) bVar.f3667e;
            if (l7 == null) {
                l7 = 0L;
            }
            long jLongValue = l7.longValue();
            m mVar = f31445a;
            if (jLongValue < 0) {
                mVar.c();
                jLongValue = 0;
            }
            Long l11 = (Long) bVar.f3664b;
            long jLongValue2 = (l11 == null || (l = (Long) bVar.f3665c) == null) ? 0L : l.longValue() - l11.longValue();
            if (jLongValue2 < 0) {
                mVar.c();
                jLongValue2 = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", bVar.f3663a);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.ROOT;
            int i11 = 0;
            if (!set.contains(m.class)) {
                int i12 = 0;
                while (true) {
                    try {
                        long[] jArr = f31446b;
                        if (i12 >= 19 || jArr[i12] >= jLongValue) {
                            break;
                        } else {
                            i12++;
                        }
                    } catch (Throwable th2) {
                        yx.a.a(m.class, th2);
                    }
                }
                i11 = i12;
            }
            bundle.putString("fb_mobile_time_between_sessions", String.format(locale, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1)));
            n nVar = (n) bVar.f3668f;
            bundle.putString("fb_mobile_launch_source", nVar != null ? nVar.toString() : "Unclassified");
            Long l12 = (Long) bVar.f3665c;
            bundle.putLong("_logTime", (l12 != null ? l12.longValue() : 0L) / ((long) 1000));
            bx.m mVar2 = new bx.m(str, str2);
            double d3 = jLongValue2 / 1000;
            a0 a0Var = a0.f4849a;
            if (!s0.c() || yx.a.f46339a.contains(mVar2)) {
                return;
            }
            try {
                bx.m.f(mVar2, "fb_mobile_deactivate_app", Double.valueOf(d3), bundle, false, c.b());
            } catch (Throwable th3) {
                yx.a.a(mVar2, th3);
            }
        } catch (Throwable th4) {
            yx.a.a(m.class, th4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {, blocks: (B:11:0x0018, B:15:0x0022, B:23:0x0036, B:29:0x004a, B:21:0x0031, B:18:0x002d, B:26:0x0046), top: B:44:0x0018, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public nx.h a() {
        /*
            r3 = this;
            java.lang.Class<nx.h> r0 = nx.h.class
            java.util.Set r1 = yx.a.f46339a
            boolean r1 = r1.contains(r0)
            r2 = 0
            if (r1 == 0) goto Ld
        Lb:
            r0 = r2
            goto L15
        Ld:
            nx.h r0 = nx.h.f31435c     // Catch: java.lang.Throwable -> L10
            goto L15
        L10:
            r1 = move-exception
            yx.a.a(r0, r1)
            goto Lb
        L15:
            if (r0 != 0) goto L54
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = ax.a0.f4864q     // Catch: java.lang.Throwable -> L4e
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L22
            monitor-exit(r3)
            return r2
        L22:
            java.lang.Class<nx.h> r0 = nx.h.class
            java.util.Set r1 = yx.a.f46339a     // Catch: java.lang.Throwable -> L4e
            boolean r1 = r1.contains(r0)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L2d
            goto L34
        L2d:
            nx.h r2 = nx.h.f31435c     // Catch: java.lang.Throwable -> L30
            goto L34
        L30:
            r1 = move-exception
            yx.a.a(r0, r1)     // Catch: java.lang.Throwable -> L4e
        L34:
            if (r2 != 0) goto L50
            nx.h r2 = new nx.h     // Catch: java.lang.Throwable -> L4e
            r2.<init>()     // Catch: java.lang.Throwable -> L4e
            java.lang.Class<nx.h> r0 = nx.h.class
            java.util.Set r1 = yx.a.f46339a     // Catch: java.lang.Throwable -> L4e
            boolean r1 = r1.contains(r0)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L46
            goto L50
        L46:
            nx.h.f31435c = r2     // Catch: java.lang.Throwable -> L49
            goto L50
        L49:
            r1 = move-exception
            yx.a.a(r0, r1)     // Catch: java.lang.Throwable -> L4e
            goto L50
        L4e:
            r0 = move-exception
            goto L52
        L50:
            monitor-exit(r3)
            return r2
        L52:
            monitor-exit(r3)
            throw r0
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nx.m.a():nx.h");
    }

    public void c() {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            l50.a aVar = f0.f40508d;
            l50.a.z(m0.APP_EVENTS, "nx.m", "Clock skew detected");
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
