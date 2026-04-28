package com.app.tgtg.tasks;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import et.z;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/app/tgtg/tasks/RedeemWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Let/z;", "orderRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Let/z;)V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RedeemWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z f9504g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedeemWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull z zVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        zVar.getClass();
        this.f9504g = zVar;
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
            boolean r0 = r5 instanceof kv.b
            if (r0 == 0) goto L13
            r0 = r5
            kv.b r0 = (kv.b) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L1a
        L13:
            kv.b r0 = new kv.b
            z70.c r5 = (z70.c) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.f26678j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r5)
            goto L3e
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L30:
            ba0.g.M(r5)
            r0.l = r3
            et.z r5 = r4.f9504g
            java.lang.Object r5 = r5.n(r0)
            if (r5 != r1) goto L3e
            return r1
        L3e:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4e
            ib.t r5 = new ib.t
            ib.h r0 = ib.h.f23726b
            r5.<init>(r0)
            return r5
        L4e:
            androidx.work.WorkerParameters r5 = r4.f23761b
            int r5 = r5.f4148c
            r0 = 10
            if (r5 <= r0) goto L5c
            ib.r r5 = new ib.r
            r5.<init>()
            return r5
        L5c:
            ib.s r5 = new ib.s
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.tasks.RedeemWorker.d(x70.c):java.lang.Object");
    }
}
