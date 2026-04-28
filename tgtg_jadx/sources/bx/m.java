package bx;

import android.content.Context;
import android.os.Bundle;
import ax.a0;
import ax.m0;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import tx.f0;
import tx.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f6734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f6735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f6736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f6737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile String f6738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f6739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ax.y f6740i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f6742b;

    static {
        String canonicalName = m.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f6734c = canonicalName;
        f6736e = l.AUTO;
        f6737f = new Object();
        f6740i = new ax.y(9);
    }

    public m(String str, String str2) {
        tx.j.n();
        this.f6741a = str;
        Date date = ax.b.l;
        ax.b bVarV = pd.g.v();
        if (bVarV == null || new Date().after(bVarV.f4871a) || !(str2 == null || Intrinsics.areEqual(str2, bVarV.f4878h))) {
            if (str2 == null) {
                if (a0.a() == null) {
                    c50.w.l("Argument 'context' cannot be null");
                    throw null;
                }
                str2 = a0.b();
            }
            this.f6742b = new b(null, str2);
        } else {
            this.f6742b = new b(bVarV.f4875e, a0.b());
        }
        r40.d.t();
    }

    public static final String a() {
        if (yx.a.f46339a.contains(m.class)) {
            return null;
        }
        try {
            return f6738g;
        } catch (Throwable th2) {
            yx.a.a(m.class, th2);
            return null;
        }
    }

    public static final ScheduledThreadPoolExecutor b() {
        if (yx.a.f46339a.contains(m.class)) {
            return null;
        }
        try {
            return f6735d;
        } catch (Throwable th2) {
            yx.a.a(m.class, th2);
            return null;
        }
    }

    public static final Object c() {
        if (yx.a.f46339a.contains(m.class)) {
            return null;
        }
        try {
            return f6737f;
        } catch (Throwable th2) {
            yx.a.a(m.class, th2);
            return null;
        }
    }

    public static void f(m mVar, String str, Double d3, Bundle bundle, boolean z11, UUID uuid) {
        if (yx.a.f46339a.contains(m.class)) {
            return;
        }
        try {
            mVar.e(str, d3, bundle, z11, uuid, null);
        } catch (Throwable th2) {
            yx.a.a(m.class, th2);
        }
    }

    public final void d(Bundle bundle, String str) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            try {
                f(this, str, null, bundle, false, nx.c.b());
            } catch (Throwable th2) {
                th = th2;
                yx.a.a(this, th);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.String r12, java.lang.Double r13, android.os.Bundle r14, boolean r15, java.util.UUID r16, bx.s r17) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bx.m.e(java.lang.String, java.lang.Double, android.os.Bundle, boolean, java.util.UUID, bx.s):void");
    }

    public final void g(Bundle bundle, String str) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            try {
                f(this, str, null, bundle, true, nx.c.b());
            } catch (Throwable th2) {
                th = th2;
                yx.a.a(this, th);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void h(BigDecimal bigDecimal, Currency currency, Bundle bundle, s sVar) {
        Throwable th2;
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        if (currency == null) {
            try {
                l50.a aVar = f0.f40508d;
                l50.a.z(m0.DEVELOPER_ERRORS, "AppEvents", "currency cannot be null");
                return;
            } catch (Throwable th3) {
                th2 = th3;
            }
        } else {
            try {
                bundle.putString("fb_currency", currency.getCurrencyCode());
                try {
                    e("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle, true, nx.c.b(), sVar);
                    if (r40.d.q() != l.EXPLICIT_ONLY) {
                        j.c(p.EAGER_FLUSHING_EVENT);
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    yx.a.a(this, th2);
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        yx.a.a(this, th2);
    }

    public m(Context context, String str) {
        this(n0.k(context), str);
    }
}
