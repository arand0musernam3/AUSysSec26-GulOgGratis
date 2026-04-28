package o30;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import o00.m1;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s implements ListenableFuture {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f31916d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m1 f31917e = new m1(j.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f31918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w.b f31919g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f31920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile g f31921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile r f31922c;

    static {
        boolean z11;
        w.b lVar;
        Throwable th2;
        w.b qVar;
        try {
            z11 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z11 = false;
        }
        f31918f = z11;
        String property = System.getProperty("java.runtime.name", "");
        Throwable e5 = null;
        if (property == null || property.contains(AnalyticsProcessor.CHANNEL_NAME)) {
            try {
                qVar = new q();
            } catch (Error | Exception e11) {
                try {
                    lVar = new k();
                } catch (Error | Exception e12) {
                    e5 = e12;
                    lVar = new l();
                }
                w.b bVar = lVar;
                th2 = e11;
                qVar = bVar;
            }
        } else {
            try {
                qVar = new k();
            } catch (NoClassDefFoundError unused2) {
                qVar = new l();
            }
        }
        th2 = null;
        f31919g = qVar;
        if (e5 != null) {
            m1 m1Var = f31917e;
            Logger loggerA = m1Var.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th2);
            m1Var.a().log(level, "AtomicReferenceFieldUpdaterAtomicHelper is broken!", e5);
        }
    }

    public final void b(r rVar) {
        rVar.f31911a = null;
        while (true) {
            r rVar2 = this.f31922c;
            if (rVar2 == r.f31910c) {
                return;
            }
            r rVar3 = null;
            while (rVar2 != null) {
                r rVar4 = rVar2.f31912b;
                if (rVar2.f31911a != null) {
                    rVar3 = rVar2;
                } else if (rVar3 != null) {
                    rVar3.f31912b = rVar4;
                    if (rVar3.f31911a == null) {
                        break;
                    }
                } else if (!f31919g.x(this, rVar2, rVar4)) {
                    break;
                }
                rVar2 = rVar4;
            }
            return;
        }
    }

    public abstract Throwable c();
}
