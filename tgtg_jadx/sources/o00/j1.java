package o00;

import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j1 implements Future {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f31686d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m1 f31687e = new m1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f31688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ox.h f31689g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f31690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b1 f31691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile i1 f31692c;

    static {
        boolean z11;
        ox.h d1Var;
        Throwable th2;
        Throwable th3;
        try {
            z11 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z11 = false;
        }
        f31688f = z11;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th4 = null;
        if (property == null || property.contains(AnalyticsProcessor.CHANNEL_NAME)) {
            try {
                d1Var = new h1();
            } catch (Error | Exception e5) {
                try {
                    d1Var = new c1();
                } catch (Error | Exception e11) {
                    th4 = e11;
                    d1Var = new d1();
                }
                th2 = th4;
                th3 = e5;
            }
        } else {
            try {
                d1Var = new c1();
            } catch (NoClassDefFoundError unused2) {
                d1Var = new d1();
            }
        }
        th2 = null;
        th3 = null;
        f31689g = d1Var;
        if (th2 != null) {
            m1 m1Var = f31687e;
            Logger loggerB = m1Var.b();
            Level level = Level.SEVERE;
            loggerB.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            m1Var.b().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    public final void b(i1 i1Var) {
        i1Var.f31679a = null;
        while (true) {
            i1 i1Var2 = this.f31692c;
            if (i1Var2 != i1.f31678c) {
                i1 i1Var3 = null;
                while (i1Var2 != null) {
                    i1 i1Var4 = i1Var2.f31680b;
                    if (i1Var2.f31679a != null) {
                        i1Var3 = i1Var2;
                    } else if (i1Var3 != null) {
                        i1Var3.f31680b = i1Var4;
                        if (i1Var3.f31679a == null) {
                            break;
                        }
                    } else if (!f31689g.Y(this, i1Var2, i1Var4)) {
                        break;
                    }
                    i1Var2 = i1Var4;
                }
                return;
            }
            return;
        }
    }
}
