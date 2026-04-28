package t90;

import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;
import r90.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f39869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f39872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f39873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f39874f;

    public c(e eVar, String str) {
        eVar.getClass();
        this.f39869a = eVar;
        this.f39870b = str;
        this.f39873e = new ArrayList();
    }

    public static void b(c cVar, String str, long j9, Function0 function0, int i11) {
        if ((i11 & 2) != 0) {
            j9 = 0;
        }
        boolean z11 = (i11 & 4) != 0;
        cVar.getClass();
        str.getClass();
        function0.getClass();
        cVar.c(new b(str, function0, z11), j9);
    }

    public final boolean a() {
        a aVar = this.f39872d;
        if (aVar != null && aVar.f39864b) {
            this.f39874f = true;
        }
        ArrayList arrayList = this.f39873e;
        boolean z11 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f39864b) {
                Logger logger = this.f39869a.f39878b;
                a aVar2 = (a) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    jf.e.n(logger, aVar2, this, StatusResponseUtils.RESULT_CANCELED);
                }
                arrayList.remove(size);
                z11 = true;
            }
        }
        return z11;
    }

    public final void c(a aVar, long j9) {
        aVar.getClass();
        synchronized (this.f39869a) {
            if (!this.f39871c) {
                if (e(aVar, j9, false)) {
                    this.f39869a.c(this);
                }
                return;
            }
            boolean z11 = aVar.f39864b;
            e eVar = this.f39869a;
            if (z11) {
                Logger logger = eVar.f39878b;
                if (logger.isLoggable(Level.FINE)) {
                    jf.e.n(logger, aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = eVar.f39878b;
                if (logger2.isLoggable(Level.FINE)) {
                    jf.e.n(logger2, aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(t90.a r12, long r13, boolean r15) {
        /*
            r11 = this;
            r12.getClass()
            t90.c r0 = r12.f39865c
            if (r0 != r11) goto L8
            goto Lc
        L8:
            if (r0 != 0) goto L8a
            r12.f39865c = r11
        Lc:
            t90.e r0 = r11.f39869a
            ky.o r1 = r0.f39877a
            java.util.logging.Logger r0 = r0.f39878b
            long r1 = java.lang.System.nanoTime()
            long r3 = r1 + r13
            java.util.ArrayList r5 = r11.f39873e
            int r6 = r5.indexOf(r12)
            r7 = 0
            r8 = -1
            if (r6 == r8) goto L39
            long r9 = r12.f39866d
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L36
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r13 = r0.isLoggable(r13)
            if (r13 == 0) goto L89
            java.lang.String r13 = "already scheduled"
            jf.e.n(r0, r12, r11, r13)
            return r7
        L36:
            r5.remove(r6)
        L39:
            r12.f39866d = r3
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            boolean r6 = r0.isLoggable(r6)
            if (r6 == 0) goto L5f
            if (r15 == 0) goto L51
            long r3 = r3 - r1
            java.lang.String r15 = jf.e.C(r3)
            java.lang.String r3 = "run again after "
            java.lang.String r15 = r3.concat(r15)
            goto L5c
        L51:
            long r3 = r3 - r1
            java.lang.String r15 = jf.e.C(r3)
            java.lang.String r3 = "scheduled after "
            java.lang.String r15 = r3.concat(r15)
        L5c:
            jf.e.n(r0, r12, r11, r15)
        L5f:
            java.util.Iterator r15 = r5.iterator()
            r0 = r7
        L64:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r15.next()
            t90.a r3 = (t90.a) r3
            long r3 = r3.f39866d
            long r3 = r3 - r1
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 <= 0) goto L78
            goto L7c
        L78:
            int r0 = r0 + 1
            goto L64
        L7b:
            r0 = r8
        L7c:
            if (r0 != r8) goto L82
            int r0 = r5.size()
        L82:
            r5.add(r0, r12)
            if (r0 != 0) goto L89
            r12 = 1
            return r12
        L89:
            return r7
        L8a:
            java.lang.String r12 = "task is in multiple queues"
            com.braze.h2.b(r12)
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: t90.c.e(t90.a, long, boolean):boolean");
    }

    public final void f() {
        e eVar = this.f39869a;
        TimeZone timeZone = g.f37815a;
        synchronized (eVar) {
            this.f39871c = true;
            if (a()) {
                this.f39869a.c(this);
            }
        }
    }

    public final String toString() {
        return this.f39870b;
    }
}
