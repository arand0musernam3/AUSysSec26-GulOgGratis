package t90;

import com.braze.h2;
import j4.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.jvm.internal.LongCompanionObject;
import ky.o;
import r8.k;
import r90.f;
import r90.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Logger f39876k;
    public static final e l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f39877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f39878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f39881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f39884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f39885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f39886j;

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        logger.getClass();
        f39876k = logger;
        l = new e(new o(new f(k.p(new StringBuilder(), g.f37816b, " TaskRunner"), true)));
    }

    public e(o oVar) {
        Logger logger = f39876k;
        logger.getClass();
        this.f39877a = oVar;
        this.f39878b = logger;
        this.f39879c = 10000;
        this.f39884h = new ArrayList();
        this.f39885i = new ArrayList();
        this.f39886j = new d(this);
    }

    public static final void a(e eVar, a aVar, long j9, boolean z11) {
        TimeZone timeZone = g.f37815a;
        c cVar = aVar.f39865c;
        cVar.getClass();
        if (cVar.f39872d != aVar) {
            h2.b("Check failed.");
            return;
        }
        boolean z12 = cVar.f39874f;
        cVar.f39874f = false;
        cVar.f39872d = null;
        eVar.f39884h.remove(cVar);
        if (j9 != -1 && !z12 && !cVar.f39871c) {
            cVar.e(aVar, j9, true);
        }
        if (cVar.f39873e.isEmpty()) {
            return;
        }
        eVar.f39885i.add(cVar);
        if (z11) {
            return;
        }
        eVar.e();
    }

    public final a b() {
        boolean z11;
        TimeZone timeZone = g.f37815a;
        while (true) {
            ArrayList arrayList = this.f39885i;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = LongCompanionObject.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z11 = false;
                    break;
                }
                a aVar2 = (a) ((c) it.next()).f39873e.get(0);
                long jMax = Math.max(0L, aVar2.f39866d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z11 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            ArrayList arrayList2 = this.f39884h;
            if (aVar != null) {
                TimeZone timeZone2 = g.f37815a;
                aVar.f39866d = -1L;
                c cVar = aVar.f39865c;
                cVar.getClass();
                cVar.f39873e.remove(aVar);
                arrayList.remove(cVar);
                cVar.f39872d = aVar;
                arrayList2.add(cVar);
                if (z11 || (!this.f39880d && !arrayList.isEmpty())) {
                    e();
                }
                return aVar;
            }
            if (!this.f39880d) {
                this.f39880d = true;
                this.f39881e = jNanoTime + jMin;
                try {
                    try {
                        TimeZone timeZone3 = g.f37815a;
                        if (jMin > 0) {
                            long j9 = jMin / 1000000;
                            long j11 = jMin - (1000000 * j9);
                            if (j9 > 0 || jMin > 0) {
                                wait(j9, (int) j11);
                            }
                        }
                    } catch (InterruptedException unused) {
                        TimeZone timeZone4 = g.f37815a;
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((c) arrayList2.get(size)).a();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            c cVar2 = (c) arrayList.get(size2);
                            cVar2.a();
                            if (cVar2.f39873e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.f39880d = false;
                }
            } else if (jMin < this.f39881e - jNanoTime) {
                notify();
            }
        }
        return null;
    }

    public final void c(c cVar) {
        cVar.getClass();
        TimeZone timeZone = g.f37815a;
        if (cVar.f39872d == null) {
            boolean zIsEmpty = cVar.f39873e.isEmpty();
            ArrayList arrayList = this.f39885i;
            if (zIsEmpty) {
                arrayList.remove(cVar);
            } else {
                byte[] bArr = r90.e.f37811a;
                arrayList.getClass();
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        if (this.f39880d) {
            notify();
        } else {
            e();
        }
    }

    public final c d() {
        int i11;
        synchronized (this) {
            i11 = this.f39879c;
            this.f39879c = i11 + 1;
        }
        return new c(this, s.f(i11, "Q"));
    }

    public final void e() {
        TimeZone timeZone = g.f37815a;
        int i11 = this.f39882f;
        if (i11 > this.f39883g) {
            return;
        }
        this.f39882f = i11 + 1;
        d dVar = this.f39886j;
        dVar.getClass();
        ((ThreadPoolExecutor) this.f39877a.f26718b).execute(dVar);
    }
}
