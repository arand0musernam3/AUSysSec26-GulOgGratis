package h0;

import android.os.Handler;
import android.util.Log;
import f0.q2;
import g3.j5;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import u70.t;
import v80.b0;
import v80.f0;
import v80.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f20981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f20982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f20983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f20984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f20985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x f20986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f20987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x f20988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f20989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f20990j;

    public n(b0 b0Var, b0 b0Var2, Executor executor, x xVar, Executor executor2, x xVar2, Executor executor3, x xVar3, Function0 function0, g0.f fVar) {
        b0Var.getClass();
        b0Var2.getClass();
        executor.getClass();
        executor2.getClass();
        executor3.getClass();
        this.f20981a = b0Var;
        this.f20982b = b0Var2;
        this.f20983c = executor;
        this.f20984d = xVar;
        this.f20985e = executor2;
        this.f20986f = xVar2;
        this.f20987g = executor3;
        this.f20988h = xVar3;
        this.f20989i = u70.l.b(new j5(1, function0));
        this.f20990j = u70.l.b(new cw.b(fVar, 26));
    }

    public final Handler a() {
        return (Handler) this.f20989i.getValue();
    }

    public final Object b(long j9, Function1 function1) {
        try {
            return f0.E(this.f20984d, new q2(this, function1, j9, (x70.c) null));
        } catch (InterruptedException e5) {
            Log.i("CXCP", "runBlockingCheckedOrNull cancelled by thread interruption", e5);
            return null;
        }
    }
}
