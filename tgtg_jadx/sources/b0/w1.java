package b0;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 implements h2, d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f5467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z.a f5468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k3 f5469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o2 f5471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f5472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5475i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5476j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f5477k;

    public w1(n nVar, z.a aVar, k3 k3Var) {
        nVar.getClass();
        k3Var.getClass();
        this.f5467a = nVar;
        this.f5468b = aVar;
        this.f5469c = k3Var;
        this.f5470d = new Object();
        this.f5472f = new ArrayList();
        this.f5474h = 2;
        this.f5475i = 1;
    }

    @Override // b0.h2
    public final void a(o2 o2Var) {
        this.f5471e = o2Var;
        f();
    }

    @Override // b0.d3
    public final void b(LinkedHashSet linkedHashSet) {
        x70.c cVar = null;
        v80.f0.B(this.f5469c.f5270f, null, null, new aa.l0(cVar, CollectionsKt.v0(linkedHashSet), this, 5), 3);
    }

    public final void c(Exception exc) {
        List listR0;
        synchronized (this.f5470d) {
            listR0 = CollectionsKt.r0(this.f5472f);
            this.f5472f.clear();
        }
        Iterator it = listR0.iterator();
        while (it.hasNext()) {
            ((v80.q) it.next()).h0(exc);
        }
    }

    public final int d(boolean z11, int i11, Integer num) {
        int iIntValue;
        if (num == null) {
            if (i11 == 0) {
                switch (this.f5468b.f46358a) {
                    case 0:
                        iIntValue = 1;
                        break;
                    default:
                        iIntValue = 2;
                        break;
                }
            } else {
                iIntValue = i11 != 1 ? 1 : 3;
            }
        } else {
            iIntValue = num.intValue();
        }
        if (z11 && z20.b.r(this.f5467a.f5321b)) {
            if (wd.a.B(3, "CXCP")) {
                Log.d("CXCP", "State3AControl.invalidate: trying external flash AE mode.");
            }
            iIntValue = 5;
        }
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "State3AControl.getFinalPreferredAeMode: preferAeMode = " + iIntValue);
        }
        return iIntValue;
    }

    public final int e() {
        int iQ;
        synchronized (this.f5470d) {
            iQ = z20.b.q(this.f5467a.f5321b, d(this.f5476j, this.f5474h, this.f5477k));
        }
        return iQ;
    }

    public final v80.q f() {
        v80.q qVar = new v80.q();
        Ref.LongRef longRef = new Ref.LongRef();
        synchronized (this.f5470d) {
            this.f5472f.add(qVar);
            long j9 = this.f5473g + 1;
            this.f5473g = j9;
            longRef.element = j9;
        }
        v80.f0.B(this.f5469c.f5270f, null, null, new aa.l0((x70.c) null, this, longRef, 6), 3);
        return qVar;
    }

    @Override // b0.h2
    public final void reset() {
        synchronized (this.f5470d) {
            this.f5476j = false;
            this.f5477k = null;
            this.f5474h = 2;
            this.f5475i = 1;
        }
        f();
    }
}
