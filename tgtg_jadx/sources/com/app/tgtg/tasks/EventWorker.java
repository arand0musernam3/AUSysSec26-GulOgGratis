package com.app.tgtg.tasks;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ao.m0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/app/tgtg/tasks/EventWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lao/m0;", "eventRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lao/m0;)V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EventWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m0 f9503g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull m0 m0Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        m0Var.getClass();
        this.f9503g = m0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(x70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kv.a
            if (r0 == 0) goto L13
            r0 = r5
            kv.a r0 = (kv.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L1a
        L13:
            kv.a r0 = new kv.a
            z70.c r5 = (z70.c) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.f26676j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r5)     // Catch: java.lang.Exception -> L29
            goto L40
        L29:
            r5 = move-exception
            goto L48
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r5)
            ao.m0 r5 = r4.f9503g     // Catch: java.lang.Exception -> L29
            r0.l = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r5 = r5.f(r0)     // Catch: java.lang.Exception -> L29
            if (r5 != r1) goto L40
            return r1
        L40:
            ib.t r5 = new ib.t     // Catch: java.lang.Exception -> L29
            ib.h r0 = ib.h.f23726b     // Catch: java.lang.Exception -> L29
            r5.<init>(r0)     // Catch: java.lang.Exception -> L29
            return r5
        L48:
            mv.m0 r0 = sa0.a.f38953a
            r0.d(r5)
            ib.r r5 = new ib.r
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.tasks.EventWorker.d(x70.c):java.lang.Object");
    }
}
