package androidx.work;

import android.content.Context;
import e6.l;
import h0.g;
import ib.f;
import ib.v;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v80.f0;
import x70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "Lib/v;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "ib/f", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CoroutineWorker extends v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WorkerParameters f4143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f4144f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f4143e = workerParameters;
        this.f4144f = f.f23720b;
    }

    @Override // ib.v
    public final l a() {
        return g.y(this.f4144f.plus(f0.c()), new ib.g(this, null, 0));
    }

    @Override // ib.v
    public final l c() {
        f fVar = f.f23720b;
        CoroutineContext coroutineContext = this.f4144f;
        if (Intrinsics.areEqual(coroutineContext, fVar)) {
            coroutineContext = this.f4143e.f4150e;
        }
        coroutineContext.getClass();
        return g.y(coroutineContext.plus(f0.c()), new ib.g(this, null, 1));
    }

    public abstract Object d(c cVar);
}
