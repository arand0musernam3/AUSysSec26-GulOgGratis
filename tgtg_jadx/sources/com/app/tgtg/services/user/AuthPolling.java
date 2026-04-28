package com.app.tgtg.services.user;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ao.h;
import ao.v;
import ex.i;
import ib.r;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import x70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/app/tgtg/services/user/AuthPolling;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lao/v;", "authRepository", "Lao/h;", "appStartRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lao/v;Lao/h;)V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AuthPolling extends CoroutineWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f9501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f9502h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthPolling(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull v vVar, @NotNull h hVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        vVar.getClass();
        hVar.getClass();
        this.f9501g = vVar;
        this.f9502h = hVar;
    }

    public static r e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("PollingState", "PollingError");
        ib.h hVar = new ib.h(linkedHashMap);
        i.L(hVar);
        return new r(hVar);
    }

    @Override // androidx.work.CoroutineWorker
    public final Object d(c cVar) {
        WorkerParameters workerParameters = this.f23761b;
        String strA = workerParameters.f4147b.a("email");
        String strA2 = workerParameters.f4147b.a("pollingId");
        return (strA == null || strA2 == null) ? e() : g(strA, strA2, (z70.c) cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(ao.l r6, z70.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof jv.a
            if (r0 == 0) goto L13
            r0 = r7
            jv.a r0 = (jv.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            jv.a r0 = new jv.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f25412j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            java.lang.String r3 = "PollingState"
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2d
            ba0.g.M(r7)
            u70.q r7 = (u70.q) r7
            java.lang.Object r6 = r7.f40851a
            goto L62
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L34:
            ba0.g.M(r7)
            boolean r7 = r6 instanceof ao.j
            if (r7 == 0) goto L53
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.lang.String r7 = "KeepPolling"
            r6.put(r3, r7)
            ib.h r7 = new ib.h
            r7.<init>(r6)
            ex.i.L(r7)
            ib.t r6 = new ib.t
            r6.<init>(r7)
            return r6
        L53:
            boolean r7 = r6 instanceof ao.k
            if (r7 == 0) goto L91
            r0.l = r4
            ao.h r6 = r5.f9502h
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L62
            return r1
        L62:
            java.lang.Throwable r7 = u70.q.a(r6)
            if (r7 != 0) goto L82
            kotlin.Unit r6 = (kotlin.Unit) r6
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.lang.String r7 = "LoginSuccess"
            r6.put(r3, r7)
            ib.h r7 = new ib.h
            r7.<init>(r6)
            ex.i.L(r7)
            ib.t r6 = new ib.t
            r6.<init>(r7)
            return r6
        L82:
            mv.m0 r6 = sa0.a.f38953a
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "AuthPolling PollingResult.LoginSuccess"
            r6.e(r7, r1, r0)
            ib.r r6 = e()
            return r6
        L91:
            boolean r6 = r6 instanceof ao.i
            if (r6 == 0) goto L9a
            ib.r r6 = e()
            return r6
        L9a:
            e40.a.f()
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.services.user.AuthPolling.f(ao.l, z70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, ib.r] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x011d -> B:48:0x0122). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x012e -> B:23:0x0088). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r18, java.lang.String r19, z70.c r20) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.services.user.AuthPolling.g(java.lang.String, java.lang.String, z70.c):java.lang.Object");
    }
}
