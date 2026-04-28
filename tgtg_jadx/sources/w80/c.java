package w80;

import a90.p;
import android.os.Handler;
import android.os.Looper;
import c90.f;
import d8.s0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import r8.k;
import v80.f0;
import v80.k0;
import v80.l;
import v80.p0;
import v80.r0;
import v80.v1;
import v80.y1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends v1 implements k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f43292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f43294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f43295e;

    public c(Handler handler, String str, boolean z11) {
        this.f43292b = handler;
        this.f43293c = str;
        this.f43294d = z11;
        this.f43295e = z11 ? this : new c(handler, str, true);
    }

    public final void A0(CoroutineContext coroutineContext, Runnable runnable) {
        f0.i(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        f fVar = p0.f42144a;
        c90.e.f7834b.u0(coroutineContext, runnable);
    }

    @Override // v80.k0
    public final r0 L(long j9, Runnable runnable, CoroutineContext coroutineContext) {
        if (j9 > 4611686018427387903L) {
            j9 = 4611686018427387903L;
        }
        if (this.f43292b.postDelayed(runnable, j9)) {
            return new s0(1, this, runnable);
        }
        A0(coroutineContext, runnable);
        return y1.f42177a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.f43292b == this.f43292b && cVar.f43294d == this.f43294d;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f43292b) ^ (this.f43294d ? 1231 : 1237);
    }

    @Override // v80.k0
    public final void r(long j9, l lVar) {
        v30.a aVar = new v30.a(5, lVar, this);
        if (j9 > 4611686018427387903L) {
            j9 = 4611686018427387903L;
        }
        if (this.f43292b.postDelayed(aVar, j9)) {
            lVar.v(new ry.b(25, this, aVar));
        } else {
            A0(lVar.f42119e, aVar);
        }
    }

    @Override // v80.x
    public final String toString() {
        c cVar;
        String str;
        f fVar = p0.f42144a;
        c cVar2 = p.f1044a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f43295e;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f43293c;
        if (string == null) {
            string = this.f43292b.toString();
        }
        return this.f43294d ? k.l(string, ".immediate") : string;
    }

    @Override // v80.x
    public final void u0(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f43292b.post(runnable)) {
            return;
        }
        A0(coroutineContext, runnable);
    }

    @Override // v80.x
    public final boolean y0(CoroutineContext coroutineContext) {
        return (this.f43294d && Intrinsics.areEqual(Looper.myLooper(), this.f43292b.getLooper())) ? false : true;
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
