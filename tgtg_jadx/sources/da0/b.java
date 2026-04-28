package da0;

import ia0.d0;
import ia0.j;
import ia0.u;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f14853a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f14854b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f14855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f14856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IOException f14857e;

    public abstract u a();

    public final void b() {
        try {
            d0 d0Var = new d0(a());
            try {
                j jVarQ = d0Var.q(d0Var.readInt());
                j jVarQ2 = d0Var.q(d0Var.readInt());
                d0Var.close();
                synchronized (this) {
                    jVarQ.getClass();
                    this.f14855c = jVarQ;
                    jVarQ2.getClass();
                    this.f14856d = jVarQ2;
                }
            } finally {
            }
        } finally {
            this.f14854b.countDown();
        }
    }
}
