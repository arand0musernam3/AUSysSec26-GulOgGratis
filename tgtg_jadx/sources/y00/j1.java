package y00;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j1 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1 f44874d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(l1 l1Var, Callable callable, boolean z11) {
        super(callable);
        this.f44874d = l1Var;
        long andIncrement = l1.l.getAndIncrement();
        this.f44871a = andIncrement;
        this.f44873c = "Task exception on worker thread";
        this.f44872b = z11;
        if (andIncrement == LongCompanionObject.MAX_VALUE) {
            w0 w0Var = ((n1) l1Var.f21216b).f44987f;
            n1.m(w0Var);
            w0Var.f45260g.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j1 j1Var = (j1) obj;
        boolean z11 = j1Var.f44872b;
        boolean z12 = this.f44872b;
        if (z12 != z11) {
            return !z12 ? 1 : -1;
        }
        long j9 = j1Var.f44871a;
        long j11 = this.f44871a;
        if (j11 < j9) {
            return -1;
        }
        if (j11 > j9) {
            return 1;
        }
        w0 w0Var = ((n1) this.f44874d.f21216b).f44987f;
        n1.m(w0Var);
        w0Var.f45261h.b(Long.valueOf(j11), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        w0 w0Var = ((n1) this.f44874d.f21216b).f44987f;
        n1.m(w0Var);
        w0Var.f45260g.b(th2, this.f44873c);
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(l1 l1Var, Runnable runnable, boolean z11, String str) {
        super(runnable, null);
        this.f44874d = l1Var;
        long andIncrement = l1.l.getAndIncrement();
        this.f44871a = andIncrement;
        this.f44873c = str;
        this.f44872b = z11;
        if (andIncrement == LongCompanionObject.MAX_VALUE) {
            w0 w0Var = ((n1) l1Var.f21216b).f44987f;
            n1.m(w0Var);
            w0Var.f45260g.a("Tasks index overflow");
        }
    }
}
