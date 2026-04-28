package com.app.tgtg.feature.recipegenerator.network;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ex.i;
import ib.h;
import ib.r;
import java.util.LinkedHashMap;
import jp.q;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/app/tgtg/feature/recipegenerator/network/RecipeGeneratorPollingHelper;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Ljp/q;", "recipeGeneratorRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ljp/q;)V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRecipeGeneratorPollingHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecipeGeneratorPollingHelper.kt\ncom/app/tgtg/feature/recipegenerator/network/RecipeGeneratorPollingHelper\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,136:1\n205#2:137\n205#2:138\n*S KotlinDebug\n*F\n+ 1 RecipeGeneratorPollingHelper.kt\ncom/app/tgtg/feature/recipegenerator/network/RecipeGeneratorPollingHelper\n*L\n65#1:137\n76#1:138\n*E\n"})
public final class RecipeGeneratorPollingHelper extends CoroutineWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f9244g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipeGeneratorPollingHelper(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull q qVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        qVar.getClass();
        this.f9244g = qVar;
    }

    public static r e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("POLLING_STATE", "ERROR");
        h hVar = new h(linkedHashMap);
        i.L(hVar);
        return new r(hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(x70.c r10) throws java.lang.Throwable {
        /*
            r9 = this;
            androidx.work.WorkerParameters r0 = r9.f23761b
            boolean r1 = r10 instanceof ip.b
            if (r1 == 0) goto L15
            r1 = r10
            ip.b r1 = (ip.b) r1
            int r2 = r1.l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.l = r2
            goto L1c
        L15:
            ip.b r1 = new ip.b
            z70.c r10 = (z70.c) r10
            r1.<init>(r9, r10)
        L1c:
            java.lang.Object r10 = r1.f24076j
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r1.l
            r4 = 1
            if (r3 == 0) goto L32
            if (r3 != r4) goto L2b
            ba0.g.M(r10)     // Catch: java.lang.Exception -> L72
            goto L6a
        L2b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
            r10 = 0
            return r10
        L32:
            ba0.g.M(r10)
            ib.h r10 = r0.f4147b     // Catch: java.lang.Exception -> L72
            java.lang.String r3 = "POLLING_ID"
            java.lang.String r10 = r10.a(r3)     // Catch: java.lang.Exception -> L72
            ib.h r0 = r0.f4147b     // Catch: java.lang.Exception -> L72
            java.lang.String r3 = "POLLING_INTERVAL"
            r0.getClass()     // Catch: java.lang.Exception -> L72
            r5 = -1
            java.lang.Long r7 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L72
            java.util.HashMap r0 = r0.f23727a     // Catch: java.lang.Exception -> L72
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Exception -> L72
            boolean r3 = r0 instanceof java.lang.Long     // Catch: java.lang.Exception -> L72
            if (r3 == 0) goto L55
            r7 = r0
        L55:
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Exception -> L72
            long r7 = r7.longValue()     // Catch: java.lang.Exception -> L72
            if (r10 == 0) goto L6d
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 == 0) goto L6d
            r1.l = r4     // Catch: java.lang.Exception -> L72
            java.lang.Object r10 = r9.f(r10, r7, r1)     // Catch: java.lang.Exception -> L72
            if (r10 != r2) goto L6a
            return r2
        L6a:
            ib.u r10 = (ib.u) r10     // Catch: java.lang.Exception -> L72
            return r10
        L6d:
            ib.r r10 = e()     // Catch: java.lang.Exception -> L72
            return r10
        L72:
            ib.r r10 = e()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.feature.recipegenerator.network.RecipeGeneratorPollingHelper.d(x70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        if (v80.f0.o(r14, r2) == r3) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v15, types: [T, ib.t] */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.Long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0108 -> B:71:0x01dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0113 -> B:71:0x01dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x012a -> B:71:0x01dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x012e -> B:71:0x01dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x013b -> B:71:0x01dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x013f -> B:71:0x01dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0174 -> B:71:0x01dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01db -> B:70:0x01dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01f1 -> B:74:0x01e9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r19, long r20, z70.c r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.feature.recipegenerator.network.RecipeGeneratorPollingHelper.f(java.lang.String, long, z70.c):java.lang.Object");
    }
}
