package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import cg.k;
import ib.h;
import ib.t;
import java.util.List;
import jb.s;
import kotlin.Metadata;
import o00.x0;
import org.jetbrains.annotations.NotNull;
import qb.g;
import qb.j;
import qb.r;
import qb.w;
import qb.y;
import tb.a;
import y9.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final t d() {
        s sVarD = s.d(this.f23760a);
        sVarD.getClass();
        WorkDatabase workDatabase = sVarD.f24926c;
        workDatabase.getClass();
        w wVarX = workDatabase.x();
        j jVarV = workDatabase.v();
        y yVarY = workDatabase.y();
        g gVarU = workDatabase.u();
        sVarD.f24925b.f23695d.getClass();
        List list = (List) x0.A(wVarX.f36870a, true, false, new k(System.currentTimeMillis() - 86400000, 7));
        v vVar = wVarX.f36870a;
        List list2 = (List) x0.A(vVar, true, false, new r(0));
        List list3 = (List) x0.A(vVar, true, false, new r(4));
        if (!list.isEmpty()) {
            ib.w wVarD = ib.w.d();
            String str = a.f39919a;
            wVarD.e(str, "Recently completed work:\n\n");
            ib.w.d().e(str, a.a(jVarV, yVarY, gVarU, list));
        }
        if (!list2.isEmpty()) {
            ib.w wVarD2 = ib.w.d();
            String str2 = a.f39919a;
            wVarD2.e(str2, "Running work:\n\n");
            ib.w.d().e(str2, a.a(jVarV, yVarY, gVarU, list2));
        }
        if (!list3.isEmpty()) {
            ib.w wVarD3 = ib.w.d();
            String str3 = a.f39919a;
            wVarD3.e(str3, "Enqueued work:\n\n");
            ib.w.d().e(str3, a.a(jVarV, yVarY, gVarU, list3));
        }
        return new t(h.f23726b);
    }
}
