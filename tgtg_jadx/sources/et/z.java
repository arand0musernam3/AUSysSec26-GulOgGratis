package et;

import android.content.Context;
import android.content.SharedPreferences;
import ao.g3;
import ao.y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mv.p0;
import o00.x0;
import y80.a2;
import y80.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gt.w f16466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gt.j f16467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kt.j f16468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kt.d f16469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kt.e f16470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0 f16471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cv.b f16472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g3 f16473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a2 f16474j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h1 f16475k;
    public List l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e90.c f16476m;

    public z(Context context, gt.w wVar, gt.j jVar, kt.j jVar2, kt.d dVar, kt.e eVar, y0 y0Var, cv.b bVar, g3 g3Var) {
        jVar2.getClass();
        dVar.getClass();
        eVar.getClass();
        y0Var.getClass();
        bVar.getClass();
        g3Var.getClass();
        this.f16465a = context;
        this.f16466b = wVar;
        this.f16467c = jVar;
        this.f16468d = jVar2;
        this.f16469e = dVar;
        this.f16470f = eVar;
        this.f16471g = y0Var;
        this.f16472h = bVar;
        this.f16473i = g3Var;
        a2 a2VarC = y80.r.c(new qt.a(new ArrayList()));
        this.f16474j = a2VarC;
        this.f16475k = new h1(a2VarC);
        this.f16476m = e90.d.a();
    }

    public static void t(String str) {
        if (str == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - p0.h(str);
        ft.e.f17923d.f17913i = Long.valueOf(jCurrentTimeMillis);
        SharedPreferences sharedPreferences = ft.e.f17920a;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentLoginData");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putLong("timeScrew", jCurrentTimeMillis);
        editorEdit.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
    
        if (v(r5, r12, r0) == r1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:14:0x002d, B:34:0x0089, B:36:0x008d, B:39:0x0093, B:41:0x0099, B:44:0x009f, B:46:0x00a5, B:48:0x00ad, B:50:0x00b5), top: B:59:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {all -> 0x0032, blocks: (B:14:0x002d, B:34:0x0089, B:36:0x008d, B:39:0x0093, B:41:0x0099, B:44:0x009f, B:46:0x00a5, B:48:0x00ad, B:50:0x00b5), top: B:59:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [et.z] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1, types: [e90.a] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v1, types: [gt.w] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, z70.c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.a(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d6, code lost:
    
        if (r3.s(r11, r0) == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099 A[Catch: all -> 0x009e, TryCatch #1 {all -> 0x009e, blocks: (B:35:0x0095, B:37:0x0099, B:46:0x00c1, B:42:0x00a6, B:44:0x00ac, B:45:0x00bd, B:32:0x0082), top: B:57:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6 A[Catch: all -> 0x009e, TryCatch #1 {all -> 0x009e, blocks: (B:35:0x0095, B:37:0x0099, B:46:0x00c1, B:42:0x00a6, B:44:0x00ac, B:45:0x00bd, B:32:0x0082), top: B:57:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.app.tgtg.model.remote.order.Order r11, z70.c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.b(com.app.tgtg.model.remote.order.Order, z70.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(11:12|67|13|14|73|(6:43|(4:46|(5:76|48|(1:50)|51|79)(1:78)|77|44)|75|52|(2:72|54)(1:74)|41)|71|58|(1:60)|61|62)(2:17|18))(3:19|63|20))(2:24|(2:26|27)(5:28|65|29|(1:32)|54))|33|69|39|40|73|(1:41)|71|58|(0)|61|62) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010d, code lost:
    
        r14 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010e, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab A[Catch: all -> 0x003c, TryCatch #2 {all -> 0x003c, blocks: (B:13:0x0035, B:41:0x00a5, B:43:0x00ab, B:44:0x00b9, B:46:0x00bf, B:48:0x00d3, B:50:0x00e0, B:51:0x00ef, B:52:0x00f7), top: B:67:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlin.collections.n0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r14, z70.c r15) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.c(java.util.List, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum d(java.lang.String r7, z70.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof et.e
            if (r0 == 0) goto L13
            r0 = r8
            et.e r0 = (et.e) r0
            int r1 = r0.f16371m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16371m = r1
            goto L18
        L13:
            et.e r0 = new et.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f16370k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f16371m
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2d
            com.app.tgtg.model.remote.order.CancelOrderState r7 = r0.f16369j
            ba0.g.M(r8)
            return r7
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            return r5
        L33:
            ba0.g.M(r8)
            u70.q r8 = (u70.q) r8
            java.lang.Object r7 = r8.f40851a
            goto L50
        L3b:
            ba0.g.M(r8)
            com.app.tgtg.model.remote.order.request.CancelOrderRequest r8 = new com.app.tgtg.model.remote.order.request.CancelOrderRequest
            java.lang.String r2 = "1"
            r8.<init>(r2)
            r0.f16371m = r4
            kt.j r2 = r6.f16468d
            java.lang.Object r7 = r2.q(r7, r8, r0)
            if (r7 != r1) goto L50
            goto L6b
        L50:
            u70.o r8 = u70.q.f40850b
            boolean r8 = r7 instanceof u70.p
            if (r8 == 0) goto L57
            r7 = r5
        L57:
            com.app.tgtg.model.remote.order.response.CancelOrderResponse r7 = (com.app.tgtg.model.remote.order.response.CancelOrderResponse) r7
            if (r7 == 0) goto L5f
            com.app.tgtg.model.remote.order.CancelOrderState r5 = r7.getState()
        L5f:
            if (r5 == 0) goto L6c
            r0.f16369j = r5
            r0.f16371m = r3
            java.lang.Object r7 = r6.q(r4, r0)
            if (r7 != r1) goto L6c
        L6b:
            return r1
        L6c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.d(java.lang.String, z70.c):java.lang.Enum");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00af, code lost:
    
        if (r4 == r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0139, code lost:
    
        if (r0.u(r14, r2) == r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0146, code lost:
    
        r8 = r8;
        r4 = r4;
        r12 = r12;
        r10 = r10;
        r9 = r9;
        r13 = r13;
        r11 = r11;
        r16 = r6;
        r17 = r7;
        r1 = r1;
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x017a, code lost:
    
        if (r0.u(r14, r2) == r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02b6, code lost:
    
        if (kotlin.Unit.f26487a != r3) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type update failed for variable: r0v0 ??, new type: et.z
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 7201. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:86)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:58)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d7 -> B:25:0x00e7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x024e -> B:71:0x0255). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.List r20, z70.c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.e(java.util.List, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.app.tgtg.model.remote.order.Order r72, z70.c r73) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.f(com.app.tgtg.model.remote.order.Order, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (v(r8, 0, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.app.tgtg.model.remote.brief.BriefOrder r8, z70.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof et.h
            if (r0 == 0) goto L13
            r0 = r9
            et.h r0 = (et.h) r0
            int r1 = r0.f16389n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16389n = r1
            goto L18
        L13:
            et.h r0 = new et.h
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f16389n
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            ba0.g.M(r9)
            goto L79
        L2a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L31:
            android.content.Context r8 = r0.f16387k
            com.app.tgtg.model.remote.brief.BriefOrder r2 = r0.f16386j
            ba0.g.M(r9)
            goto L54
        L39:
            ba0.g.M(r9)
            java.lang.String r9 = r8.m321getOrderIdreIZeYA()
            r0.f16386j = r8
            android.content.Context r2 = r7.f16465a
            r0.f16387k = r2
            r0.f16389n = r4
            gt.w r4 = r7.f16466b
            java.lang.Object r9 = r4.p(r9, r0)
            if (r9 != r1) goto L51
            goto L78
        L51:
            r6 = r2
            r2 = r8
            r8 = r6
        L54:
            com.app.tgtg.model.remote.order.Order r9 = (com.app.tgtg.model.remote.order.Order) r9
            r4 = 0
            if (r9 == 0) goto L63
            int r9 = r9.getCalendarEventId()
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r9)
            goto L64
        L63:
            r5 = r4
        L64:
            mv.d.g(r8, r5)
            java.lang.String r8 = r2.m321getOrderIdreIZeYA()
            r0.f16386j = r4
            r0.f16387k = r4
            r0.f16389n = r3
            r9 = 0
            java.lang.Object r8 = r7.v(r8, r9, r0)
            if (r8 != r1) goto L79
        L78:
            return r1
        L79:
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.g(com.app.tgtg.model.remote.brief.BriefOrder, z70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084 A[Catch: ClassCastException -> 0x0046, TryCatch #1 {ClassCastException -> 0x0046, blocks: (B:21:0x003e, B:34:0x007e, B:36:0x0084, B:38:0x0089, B:31:0x006f), top: B:54:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa A[Catch: ClassCastException -> 0x0033, TRY_ENTER, TryCatch #0 {ClassCastException -> 0x0033, blocks: (B:14:0x002e, B:45:0x00aa, B:47:0x00b0), top: B:52:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r8v0, types: [et.z] */
    /* JADX WARN: Type inference failed for: r9v12, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v6, types: [T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(z70.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof et.i
            if (r0 == 0) goto L13
            r0 = r9
            et.i r0 = (et.i) r0
            int r1 = r0.f16394o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16394o = r1
            goto L18
        L13:
            et.i r0 = new et.i
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f16392m
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f16394o
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L57
            if (r2 == r6) goto L4a
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L36
            com.app.tgtg.model.remote.order.OrderListResult r1 = r0.l
            kotlin.jvm.internal.Ref$ObjectRef r0 = r0.f16390j
            ba0.g.M(r9)     // Catch: java.lang.ClassCastException -> L33
            goto La5
        L33:
            r9 = move-exception
            goto Lb4
        L36:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            return r3
        L3c:
            kotlin.jvm.internal.Ref$ObjectRef r2 = r0.f16390j
            ba0.g.M(r9)     // Catch: java.lang.ClassCastException -> L46
            u70.q r9 = (u70.q) r9     // Catch: java.lang.ClassCastException -> L46
            java.lang.Object r9 = r9.f40851a     // Catch: java.lang.ClassCastException -> L46
            goto L7e
        L46:
            r9 = move-exception
            r0 = r2
            goto Lb4
        L4a:
            java.lang.Object r2 = r0.f16391k
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f16390j
            ba0.g.M(r9)
            r7 = r6
            r6 = r2
            r2 = r7
            goto L6d
        L57:
            ba0.g.M(r9)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            r0.f16390j = r2
            r0.f16391k = r2
            r0.f16394o = r6
            java.lang.Object r9 = r8.j(r0)
            if (r9 != r1) goto L6c
            goto La2
        L6c:
            r6 = r2
        L6d:
            r6.element = r9
            kt.j r9 = r8.f16468d     // Catch: java.lang.ClassCastException -> L46
            r0.f16390j = r2     // Catch: java.lang.ClassCastException -> L46
            r0.f16391k = r3     // Catch: java.lang.ClassCastException -> L46
            r0.f16394o = r5     // Catch: java.lang.ClassCastException -> L46
            java.lang.Object r9 = r9.d(r0)     // Catch: java.lang.ClassCastException -> L46
            if (r9 != r1) goto L7e
            goto La2
        L7e:
            u70.o r3 = u70.q.f40850b     // Catch: java.lang.ClassCastException -> L46
            boolean r3 = r9 instanceof u70.p     // Catch: java.lang.ClassCastException -> L46
            if (r3 != 0) goto Lba
            r3 = r9
            com.app.tgtg.model.remote.order.OrderListResult r3 = (com.app.tgtg.model.remote.order.OrderListResult) r3     // Catch: java.lang.ClassCastException -> L46
            if (r3 == 0) goto La7
            java.lang.String r5 = r3.getCurrentServerTime()     // Catch: java.lang.ClassCastException -> L46
            t(r5)     // Catch: java.lang.ClassCastException -> L46
            java.util.List r5 = r3.getOrderList()     // Catch: java.lang.ClassCastException -> L46
            r0.f16390j = r2     // Catch: java.lang.ClassCastException -> L46
            r0.f16391k = r9     // Catch: java.lang.ClassCastException -> L46
            r0.l = r3     // Catch: java.lang.ClassCastException -> L46
            r0.f16394o = r4     // Catch: java.lang.ClassCastException -> L46
            java.lang.Object r9 = r8.c(r5, r0)     // Catch: java.lang.ClassCastException -> L46
            if (r9 != r1) goto La3
        La2:
            return r1
        La3:
            r0 = r2
            r1 = r3
        La5:
            r3 = r1
            goto La8
        La7:
            r0 = r2
        La8:
            if (r3 == 0) goto Lb2
            java.util.List r9 = r3.getOrderList()     // Catch: java.lang.ClassCastException -> L33
            if (r9 == 0) goto Lb2
            r0.element = r9     // Catch: java.lang.ClassCastException -> L33
        Lb2:
            r2 = r0
            goto Lba
        Lb4:
            mv.m0 r1 = sa0.a.f38953a
            r1.d(r9)
            goto Lb2
        Lba:
            T r9 = r2.element
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.h(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Integer r11, java.lang.Integer r12, z70.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof et.j
            if (r0 == 0) goto L13
            r0 = r13
            et.j r0 = (et.j) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            et.j r0 = new et.j
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f16395j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r13)
            u70.q r13 = (u70.q) r13
            java.lang.Object r11 = r13.f40851a
            goto L4f
        L2b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r11)
            r11 = 0
            return r11
        L32:
            ba0.g.M(r13)
            com.app.tgtg.model.remote.order.request.ListOrdersRequest r13 = new com.app.tgtg.model.remote.order.request.ListOrdersRequest
            com.app.tgtg.model.remote.item.requests.Paging r4 = new com.app.tgtg.model.remote.item.requests.Paging
            r8 = 1
            r9 = 0
            r5 = 0
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r13.<init>(r4)
            r0.l = r3
            kt.j r11 = r10.f16468d
            java.lang.Object r11 = r11.f(r13, r0)
            if (r11 != r1) goto L4f
            return r1
        L4f:
            u70.o r12 = u70.q.f40850b
            boolean r12 = r11 instanceof u70.p
            if (r12 != 0) goto L5f
            r12 = r11
            com.app.tgtg.model.remote.order.OrderListMonthlyResult r12 = (com.app.tgtg.model.remote.order.OrderListMonthlyResult) r12
            java.lang.String r12 = r12.getCurrentServerTime()
            t(r12)
        L5f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.i(java.lang.Integer, java.lang.Integer, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(z70.c r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof et.k
            if (r0 == 0) goto L13
            r0 = r14
            et.k r0 = (et.k) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            et.k r0 = new et.k
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.f16397j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 0
            r4 = 3
            r5 = 2
            gt.w r6 = r13.f16466b
            r7 = 1
            if (r2 == 0) goto L3f
            if (r2 == r7) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L30
            ba0.g.M(r14)
            return r14
        L30:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r14)
            r14 = 0
            return r14
        L37:
            ba0.g.M(r14)
            goto La2
        L3b:
            ba0.g.M(r14)
            goto L53
        L3f:
            ba0.g.M(r14)
            r0.l = r7
            y9.v r14 = r6.f20895a
            gt.r r2 = new gt.r
            r8 = 0
            r2.<init>(r6, r8)
            java.lang.Object r14 = o00.x0.C(r0, r14, r7, r3, r2)
            if (r14 != r1) goto L53
            goto Lb2
        L53:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r14 = r14.iterator()
        L5e:
            boolean r8 = r14.hasNext()
            if (r8 == 0) goto L89
            java.lang.Object r8 = r14.next()
            r9 = r8
            com.app.tgtg.model.remote.order.Order r9 = (com.app.tgtg.model.remote.order.Order) r9
            com.app.tgtg.model.remote.item.PickupInterval r9 = r9.getRedeemInterval()
            r9.getClass()
            java.lang.String r9 = r9.getIntervalEnd()
            long r9 = mv.p0.h(r9)
            long r11 = mv.p0.o()
            long r9 = r9 - r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 > 0) goto L5e
            r2.add(r8)
            goto L5e
        L89:
            r0.l = r5
            y9.v r14 = r6.f20895a
            ek.a r5 = new ek.a
            r8 = 21
            r5.<init>(r8, r6, r2)
            java.lang.Object r14 = o00.x0.C(r0, r14, r3, r7, r5)
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            if (r14 != r2) goto L9d
            goto L9f
        L9d:
            kotlin.Unit r14 = kotlin.Unit.f26487a
        L9f:
            if (r14 != r1) goto La2
            goto Lb2
        La2:
            r0.l = r4
            y9.v r14 = r6.f20895a
            gt.r r2 = new gt.r
            r4 = 0
            r2.<init>(r6, r4)
            java.lang.Object r14 = o00.x0.C(r0, r14, r7, r3, r2)
            if (r14 != r1) goto Lb3
        Lb2:
            return r1
        Lb3:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.j(z70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec A[Catch: Exception -> 0x0050, TryCatch #1 {Exception -> 0x0050, blocks: (B:14:0x0048, B:90:0x01b7, B:80:0x0181, B:86:0x018c, B:39:0x00b1, B:50:0x00e6, B:52:0x00ec, B:54:0x00f0, B:55:0x00fb, B:57:0x0105, B:59:0x0111, B:61:0x011d, B:97:0x01d8, B:101:0x01ef), top: B:113:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015a A[Catch: all -> 0x015f, TryCatch #7 {all -> 0x015f, blocks: (B:69:0x0156, B:71:0x015a, B:75:0x0165, B:79:0x017e, B:78:0x016c), top: B:124:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016c A[Catch: all -> 0x015f, TryCatch #7 {all -> 0x015f, blocks: (B:69:0x0156, B:71:0x015a, B:75:0x0165, B:79:0x017e, B:78:0x016c), top: B:124:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d6  */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r14, z70.c r15) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.k(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.app.tgtg.model.remote.brief.BriefOrder r7, com.app.tgtg.model.remote.brief.BriefOrder r8, java.util.List r9, z70.c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof et.m
            if (r0 == 0) goto L13
            r0 = r10
            et.m r0 = (et.m) r0
            int r1 = r0.f16411o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16411o = r1
            goto L18
        L13:
            et.m r0 = new et.m
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f16409m
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f16411o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L30
            java.util.List r7 = r0.l
            com.app.tgtg.model.remote.brief.BriefOrder r8 = r0.f16408k
            com.app.tgtg.model.remote.brief.BriefOrder r9 = r0.f16407j
            ba0.g.M(r10)
            goto L7d
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L37:
            java.util.List r9 = r0.l
            com.app.tgtg.model.remote.brief.BriefOrder r8 = r0.f16408k
            com.app.tgtg.model.remote.brief.BriefOrder r7 = r0.f16407j
            ba0.g.M(r10)
            goto L53
        L41:
            ba0.g.M(r10)
            r0.f16407j = r7
            r0.f16408k = r8
            r0.l = r9
            r0.f16411o = r4
            java.lang.Object r10 = r6.w(r7, r8, r0)
            if (r10 != r1) goto L53
            goto L79
        L53:
            r0.f16407j = r7
            r0.f16408k = r8
            r0.l = r9
            r0.f16411o = r3
            com.app.tgtg.model.remote.order.OrderState r10 = r7.getOrderState()
            com.app.tgtg.model.remote.order.OrderState r2 = com.app.tgtg.model.remote.order.OrderState.COLLECTION_DELEGATED
            if (r10 != r2) goto L75
            com.app.tgtg.model.remote.order.OrderState r10 = r8.getOrderState()
            com.app.tgtg.model.remote.order.OrderState r2 = com.app.tgtg.model.remote.order.OrderState.CANCELLED
            if (r10 != r2) goto L75
            java.lang.Object r10 = r6.g(r8, r0)
            if (r10 != r1) goto L72
            goto L77
        L72:
            kotlin.Unit r10 = kotlin.Unit.f26487a
            goto L77
        L75:
            kotlin.Unit r10 = kotlin.Unit.f26487a
        L77:
            if (r10 != r1) goto L7a
        L79:
            return r1
        L7a:
            r5 = r9
            r9 = r7
            r7 = r5
        L7d:
            com.app.tgtg.model.remote.order.OrderState r9 = r9.getOrderState()
            com.app.tgtg.model.remote.order.OrderState r10 = r8.getOrderState()
            com.app.tgtg.model.remote.order.OrderState r0 = com.app.tgtg.model.remote.order.OrderState.COLLECTION_DELEGATED
            if (r9 != r0) goto L90
            com.app.tgtg.model.remote.order.OrderState r0 = com.app.tgtg.model.remote.order.OrderState.CANCELLED
            if (r10 != r0) goto L90
            com.app.tgtg.model.remote.brief.BriefOrderChangeState r9 = com.app.tgtg.model.remote.brief.BriefOrderChangeState.DELEGATED_CANCELLED
            goto Lb2
        L90:
            com.app.tgtg.model.remote.order.OrderState r0 = com.app.tgtg.model.remote.order.OrderState.CANCELLED
            if (r10 != r0) goto L97
            com.app.tgtg.model.remote.brief.BriefOrderChangeState r9 = com.app.tgtg.model.remote.brief.BriefOrderChangeState.CANCELLED
            goto Lb2
        L97:
            com.app.tgtg.model.remote.order.OrderState r0 = com.app.tgtg.model.remote.order.OrderState.REDEEMED
            if (r9 != r0) goto La2
            com.app.tgtg.model.remote.order.OrderState r0 = com.app.tgtg.model.remote.order.OrderState.REFUNDED
            if (r10 != r0) goto La2
            com.app.tgtg.model.remote.brief.BriefOrderChangeState r9 = com.app.tgtg.model.remote.brief.BriefOrderChangeState.REFUNDED
            goto Lb2
        La2:
            com.app.tgtg.model.remote.order.OrderState r0 = com.app.tgtg.model.remote.order.OrderState.SHIPPED
            if (r9 == r0) goto Laa
            com.app.tgtg.model.remote.order.OrderState r0 = com.app.tgtg.model.remote.order.OrderState.DELIVERED
            if (r9 != r0) goto Lb1
        Laa:
            com.app.tgtg.model.remote.order.OrderState r9 = com.app.tgtg.model.remote.order.OrderState.REFUNDED
            if (r10 != r9) goto Lb1
            com.app.tgtg.model.remote.brief.BriefOrderChangeState r9 = com.app.tgtg.model.remote.brief.BriefOrderChangeState.REFUNDED
            goto Lb2
        Lb1:
            r9 = 0
        Lb2:
            if (r9 == 0) goto Lba
            r8.setChangeState(r9)
            r7.add(r8)
        Lba:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.l(com.app.tgtg.model.remote.brief.BriefOrder, com.app.tgtg.model.remote.brief.BriefOrder, java.util.List, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.String r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof et.n
            if (r0 == 0) goto L13
            r0 = r6
            et.n r0 = (et.n) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            et.n r0 = new et.n
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f16412j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            r0.l = r3
            kt.d r6 = r4.f16469e
            java.lang.Object r5 = r6.e(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.m(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (r1 == r3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x025b, code lost:
    
        r7 = null;
        r8 = true;
        r6.element = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0228 A[PHI: r4 r5 r6 r13 r14 r15
      0x0228: PHI (r4v3 int) = (r4v6 int), (r4v18 int) binds: [B:46:0x0130, B:18:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r5v4 java.util.Iterator) = (r5v11 java.util.Iterator), (r5v18 java.util.Iterator) binds: [B:46:0x0130, B:18:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r6v3 kotlin.jvm.internal.Ref$BooleanRef) = (r6v5 kotlin.jvm.internal.Ref$BooleanRef), (r6v13 kotlin.jvm.internal.Ref$BooleanRef) binds: [B:46:0x0130, B:18:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r13v5 int) = (r13v8 int), (r13v17 int) binds: [B:46:0x0130, B:18:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r14v2 java.lang.Object) = (r14v6 java.lang.Object), (r14v12 java.lang.Object) binds: [B:46:0x0130, B:18:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r15v0 com.app.tgtg.model.remote.order.Order) = (r15v2 com.app.tgtg.model.remote.order.Order), (r15v7 com.app.tgtg.model.remote.order.Order) binds: [B:46:0x0130, B:18:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0269  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0253 -> B:78:0x0254). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x025d -> B:82:0x025f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(z70.c r31) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.n(z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d9, code lost:
    
        if (r8.g(r2, r6, r4) != r5) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.String r29, z70.c r30, boolean r31) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.o(java.lang.String, z70.c, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.util.List r7, z70.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof et.q
            if (r0 == 0) goto L13
            r0 = r8
            et.q r0 = (et.q) r0
            int r1 = r0.f16430m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16430m = r1
            goto L18
        L13:
            et.q r0 = new et.q
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f16429k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f16430m
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            java.util.List r7 = r0.f16428j
            ba0.g.M(r8)
            goto L40
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L30:
            ba0.g.M(r8)
            r6.l = r7
            r0.f16428j = r7
            r0.f16430m = r3
            java.lang.Object r8 = r6.e(r7, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L49:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r0 = r7.next()
            com.app.tgtg.model.remote.brief.BriefOrder r0 = (com.app.tgtg.model.remote.brief.BriefOrder) r0
            com.app.tgtg.model.remote.order.OrderType r1 = r0.getOrderType()
            com.app.tgtg.model.remote.order.OrderType r2 = com.app.tgtg.model.remote.order.OrderType.MANUFACTURER
            if (r1 != r2) goto L49
            com.app.tgtg.model.remote.brief.BriefRatingInfo r1 = r0.getBriefRatingInfo()
            r2 = 0
            if (r1 == 0) goto L6f
            java.lang.Boolean r1 = r1.isRateable()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            goto L70
        L6f:
            r1 = r2
        L70:
            if (r1 == 0) goto L49
            com.app.tgtg.model.remote.manufacturer.response.ManufacturerRateableOrder r1 = new com.app.tgtg.model.remote.manufacturer.response.ManufacturerRateableOrder
            java.lang.String r3 = r0.m321getOrderIdreIZeYA()
            com.app.tgtg.model.remote.brief.BriefItemInfo r4 = r0.getBriefItemInfo()
            r5 = 0
            if (r4 == 0) goto L84
            java.lang.String r4 = r4.getItemName()
            goto L85
        L84:
            r4 = r5
        L85:
            java.lang.Boolean r0 = r0.isMultiItem()
            if (r0 == 0) goto L8f
            boolean r2 = r0.booleanValue()
        L8f:
            r1.<init>(r3, r4, r2, r5)
            r8.add(r1)
            goto L49
        L96:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.p(java.util.List, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
    
        r2.f16432k = null;
        r2.l = r11;
        r2.f16433m = r10;
        r2.f16434n = r13;
        r2.f16435o = r12;
        r2.f16431j = r7;
        r2.f16436p = r4;
        r2.f16437q = r8;
        r2.f16438r = r1;
        r2.f16441u = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f8, code lost:
    
        if (x(r13, r14, r2) != r3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fc, code lost:
    
        r14 = r11;
        r11 = r12;
        r12 = r13;
        r13 = r10;
        r10 = r7;
        r7 = r8;
        r8 = r4;
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0118, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r13.getNeedsSync(), java.lang.Boolean.FALSE) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0120, code lost:
    
        if (r13.getState() == com.app.tgtg.model.remote.order.OrderState.ACTIVE) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0128, code lost:
    
        if (r13.getState() == com.app.tgtg.model.remote.order.OrderState.COLLECTION_OFFERED) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0130, code lost:
    
        if (r13.getState() == com.app.tgtg.model.remote.order.OrderState.COLLECTION_DELEGATED) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0138, code lost:
    
        if (r13.getState() == com.app.tgtg.model.remote.order.OrderState.SHIPPED) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013a, code lost:
    
        r2.f16432k = null;
        r2.l = r11;
        r2.f16433m = r10;
        r2.f16434n = null;
        r2.f16435o = null;
        r2.f16431j = r7;
        r2.f16436p = r4;
        r2.f16437q = r8;
        r1 = 4;
        r2.f16441u = 4;
        r5 = r17.f16466b.k(r13, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0155, code lost:
    
        if (r5 != y70.a.COROUTINE_SUSPENDED) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0158, code lost:
    
        r5 = kotlin.Unit.f26487a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015a, code lost:
    
        if (r5 != r3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015d, code lost:
    
        r8 = r10;
        r10 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0165, code lost:
    
        r1 = 4;
        r8 = r4;
        r4 = r10;
        r10 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010e A[EDGE_INSN: B:71:0x010e->B:48:0x010e BREAK  A[LOOP:0: B:38:0x00c5->B:70:0x00c5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x015d -> B:65:0x015f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0165 -> B:67:0x0169). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(boolean r18, z70.c r19) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.q(boolean, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.String r6, z70.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof et.s
            if (r0 == 0) goto L13
            r0 = r7
            et.s r0 = (et.s) r0
            int r1 = r0.f16444m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16444m = r1
            goto L18
        L13:
            et.s r0 = new et.s
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f16443k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f16444m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            ba0.g.M(r7)
            u70.q r7 = (u70.q) r7
            java.lang.Object r6 = r7.f40851a
            return r6
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L35:
            java.lang.String r6 = r0.f16442j
            ba0.g.M(r7)
            u70.q r7 = (u70.q) r7
            java.lang.Object r7 = r7.f40851a
            goto L4f
        L3f:
            ba0.g.M(r7)
            r0.f16442j = r6
            r0.f16444m = r4
            kt.j r7 = r5.f16468d
            java.lang.Object r7 = r7.h(r6, r0)
            if (r7 != r1) goto L4f
            goto L65
        L4f:
            java.lang.Throwable r2 = u70.q.a(r7)
            if (r2 != 0) goto L67
            q90.r0 r7 = (q90.r0) r7
            com.app.tgtg.model.remote.order.OrderState r7 = com.app.tgtg.model.remote.order.OrderState.NOT_COLLECTED
            r2 = 0
            r0.f16442j = r2
            r0.f16444m = r3
            r2 = 0
            java.lang.Object r6 = r5.y(r6, r7, r2, r0)
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            return r6
        L67:
            u70.p r6 = new u70.p
            r6.<init>(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.r(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(java.lang.String r10, z70.c r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof et.t
            if (r0 == 0) goto L13
            r0 = r11
            et.t r0 = (et.t) r0
            int r1 = r0.f16447m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16447m = r1
            goto L18
        L13:
            et.t r0 = new et.t
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f16446k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f16447m
            gt.w r4 = r9.f16466b
            r3 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L33
            if (r2 != r3) goto L2c
            ba0.g.M(r11)
            goto L6f
        L2c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
            r10 = 0
            return r10
        L33:
            java.lang.String r10 = r0.f16445j
            ba0.g.M(r11)
        L38:
            r5 = r10
            goto L48
        L3a:
            ba0.g.M(r11)
            r0.f16445j = r10
            r0.f16447m = r5
            java.lang.Object r11 = r4.p(r10, r0)
            if (r11 != r1) goto L38
            goto L6e
        L48:
            com.app.tgtg.model.remote.order.Order r11 = (com.app.tgtg.model.remote.order.Order) r11
            if (r11 == 0) goto L6f
            com.app.tgtg.model.remote.order.OrderState r10 = r11.getState()
            com.app.tgtg.model.remote.order.OrderState r11 = com.app.tgtg.model.remote.order.OrderState.ACTIVE
            if (r10 != r11) goto L6f
            com.app.tgtg.model.remote.order.OrderState r6 = com.app.tgtg.model.remote.order.OrderState.UNREDEEMED
            r7 = 0
            r0.f16445j = r7
            r0.f16447m = r3
            y9.v r10 = r4.f20895a
            aa.t r3 = new aa.t
            r8 = 4
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r10 = o00.x0.B(r10, r3, r0)
            if (r10 != r1) goto L6a
            goto L6c
        L6a:
            kotlin.Unit r10 = kotlin.Unit.f26487a
        L6c:
            if (r10 != r1) goto L6f
        L6e:
            return r1
        L6f:
            kotlin.Unit r10 = kotlin.Unit.f26487a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.s(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(com.app.tgtg.model.remote.brief.BriefOrder r6, z70.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof et.u
            if (r0 == 0) goto L13
            r0 = r7
            et.u r0 = (et.u) r0
            int r1 = r0.f16451n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16451n = r1
            goto L18
        L13:
            et.u r0 = new et.u
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f16451n
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            android.content.Context r6 = r0.f16449k
            com.app.tgtg.model.remote.brief.BriefOrder r0 = r0.f16448j
            ba0.g.M(r7)
            goto L4c
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L32:
            ba0.g.M(r7)
            java.lang.String r7 = r6.m321getOrderIdreIZeYA()
            r0.f16448j = r6
            android.content.Context r2 = r5.f16465a
            r0.f16449k = r2
            r0.f16451n = r3
            gt.w r3 = r5.f16466b
            java.lang.Object r7 = r3.p(r7, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            r0 = r6
            r6 = r2
        L4c:
            com.app.tgtg.model.remote.order.Order r7 = (com.app.tgtg.model.remote.order.Order) r7
            r1 = 0
            if (r7 == 0) goto L5b
            int r7 = r7.getCalendarEventId()
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r7)
            goto L5c
        L5b:
            r2 = r1
        L5c:
            r6.getClass()
            r0.getClass()
            if (r2 == 0) goto Lb9
            int r7 = r2.intValue()
            if (r7 != 0) goto L6b
            goto Lb9
        L6b:
            boolean r2 = mv.d.o(r6)
            if (r2 == 0) goto Lb9
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            com.app.tgtg.model.remote.item.PickupInterval r3 = r0.getTimeInterval()
            if (r3 == 0) goto L81
            java.lang.String r3 = r3.getIntervalStart()
            goto L82
        L81:
            r3 = r1
        L82:
            long r3 = mv.p0.h(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "dtstart"
            r2.put(r4, r3)
            com.app.tgtg.model.remote.item.PickupInterval r0 = r0.getTimeInterval()
            if (r0 == 0) goto L9a
            java.lang.String r0 = r0.getIntervalEnd()
            goto L9b
        L9a:
            r0 = r1
        L9b:
            long r3 = mv.p0.h(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "dtend"
            r2.put(r3, r0)
            android.net.Uri r0 = android.provider.CalendarContract.Events.CONTENT_URI
            long r3 = (long) r7
            android.net.Uri r7 = android.content.ContentUris.withAppendedId(r0, r3)
            r7.getClass()
            android.content.ContentResolver r6 = r6.getContentResolver()
            r6.update(r7, r2, r1, r1)
        Lb9:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.u(com.app.tgtg.model.remote.brief.BriefOrder, z70.c):java.lang.Object");
    }

    public final Object v(String str, int i11, z70.c cVar) {
        Object objC = x0.C(cVar, this.f16466b.f20895a, false, true, new gt.u(i11, str, 0));
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        if (objC != aVar) {
            objC = Unit.f26487a;
        }
        return objC == aVar ? objC : Unit.f26487a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r7.l(r10, r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r7.l(r10, r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c8, code lost:
    
        if (r12 != r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(com.app.tgtg.model.remote.brief.BriefOrder r10, com.app.tgtg.model.remote.brief.BriefOrder r11, z70.c r12) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.w(com.app.tgtg.model.remote.brief.BriefOrder, com.app.tgtg.model.remote.brief.BriefOrder, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (r3.w(r13, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        if (r3.w(r13, r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(com.app.tgtg.model.remote.order.Order r12, com.app.tgtg.model.remote.order.Order r13, z70.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof et.w
            if (r0 == 0) goto L13
            r0 = r14
            et.w r0 = (et.w) r0
            int r1 = r0.f16458n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16458n = r1
            goto L18
        L13:
            et.w r0 = new et.w
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f16458n
            gt.w r3 = r11.f16466b
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L3d
            if (r2 == r6) goto L35
            if (r2 != r4) goto L2e
            ba0.g.M(r14)
            goto Lb9
        L2e:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r12)
            r12 = 0
            return r12
        L35:
            com.app.tgtg.model.remote.order.Order r13 = r0.f16456k
            com.app.tgtg.model.remote.order.Order r12 = r0.f16455j
            ba0.g.M(r14)
            goto L89
        L3d:
            ba0.g.M(r14)
            com.app.tgtg.model.remote.item.PickupInterval r14 = r12.getPickupInterval()
            com.app.tgtg.model.remote.item.PickupInterval r2 = r13.getPickupInterval()
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual(r14, r2)
            if (r14 != 0) goto L8c
            com.app.tgtg.model.remote.item.PickupInterval r14 = r13.getPickupInterval()
            if (r14 == 0) goto L59
            java.lang.String r14 = r14.getIntervalEnd()
            goto L5a
        L59:
            r14 = r5
        L5a:
            long r7 = mv.p0.h(r14)
            long r9 = java.lang.System.currentTimeMillis()
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 < 0) goto L8c
            com.app.tgtg.model.remote.order.OrderType r14 = com.app.tgtg.model.remote.order.OrderType.MANUFACTURER
            com.app.tgtg.model.remote.order.OrderType r2 = com.app.tgtg.model.remote.order.OrderType.CATERING
            com.app.tgtg.model.remote.order.OrderType[] r14 = new com.app.tgtg.model.remote.order.OrderType[]{r14, r2}
            java.util.List r14 = kotlin.collections.d0.h(r14)
            com.app.tgtg.model.remote.order.OrderType r2 = r13.getOrderType()
            boolean r14 = r14.contains(r2)
            if (r14 != 0) goto L8c
            r0.f16455j = r12
            r0.f16456k = r13
            r0.f16458n = r6
            java.lang.Object r14 = r3.w(r13, r0)
            if (r14 != r1) goto L89
            goto Lb8
        L89:
            r13.setHasCollectionTimeChanged(r6)
        L8c:
            com.app.tgtg.model.remote.order.OrderType r14 = com.app.tgtg.model.remote.order.OrderType.MANUFACTURER
            com.app.tgtg.model.remote.order.OrderType r2 = com.app.tgtg.model.remote.order.OrderType.CATERING
            com.app.tgtg.model.remote.order.OrderType[] r14 = new com.app.tgtg.model.remote.order.OrderType[]{r14, r2}
            java.util.List r14 = kotlin.collections.d0.h(r14)
            com.app.tgtg.model.remote.order.OrderType r2 = r13.getOrderType()
            boolean r14 = r14.contains(r2)
            if (r14 == 0) goto Lbc
            com.app.tgtg.model.remote.order.OrderState r14 = r13.getState()
            com.app.tgtg.model.remote.order.OrderState r12 = r12.getState()
            if (r14 == r12) goto Lbc
            r0.f16455j = r5
            r0.f16456k = r5
            r0.f16458n = r4
            java.lang.Object r12 = r3.w(r13, r0)
            if (r12 != r1) goto Lb9
        Lb8:
            return r1
        Lb9:
            kotlin.Unit r12 = kotlin.Unit.f26487a
            return r12
        Lbc:
            kotlin.Unit r12 = kotlin.Unit.f26487a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.x(com.app.tgtg.model.remote.order.Order, com.app.tgtg.model.remote.order.Order, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(java.lang.String r7, com.app.tgtg.model.remote.order.OrderState r8, boolean r9, z70.c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof et.x
            if (r0 == 0) goto L13
            r0 = r10
            et.x r0 = (et.x) r0
            int r1 = r0.f16462n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16462n = r1
            goto L18
        L13:
            et.x r0 = new et.x
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f16462n
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            ba0.g.M(r10)
            u70.q r10 = (u70.q) r10
            java.lang.Object r7 = r10.f40851a
            return r7
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            return r5
        L35:
            boolean r9 = r0.f16460k
            java.lang.String r7 = r0.f16459j
            ba0.g.M(r10)
            goto L4f
        L3d:
            ba0.g.M(r10)
            r0.f16459j = r7
            r0.f16460k = r9
            r0.f16462n = r4
            gt.w r10 = r6.f16466b
            java.lang.Object r10 = gt.w.t(r10, r7, r8, r9, r0)
            if (r10 != r1) goto L4f
            goto L62
        L4f:
            com.app.tgtg.model.remote.order.Order r10 = (com.app.tgtg.model.remote.order.Order) r10
            if (r10 == 0) goto L56
            u70.o r7 = u70.q.f40850b
            return r10
        L56:
            r0.f16459j = r5
            r0.f16460k = r9
            r0.f16462n = r3
            java.lang.Object r7 = r6.k(r7, r0)
            if (r7 != r1) goto L63
        L62:
            return r1
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.y(java.lang.String, com.app.tgtg.model.remote.order.OrderState, boolean, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(java.lang.String r5, q90.a0 r6, z70.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof et.y
            if (r0 == 0) goto L13
            r0 = r7
            et.y r0 = (et.y) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            et.y r0 = new et.y
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f16463j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 == r3) goto L35
            r5 = 2
            if (r2 != r5) goto L2e
            ba0.g.M(r7)
            u70.q r7 = (u70.q) r7
            java.lang.Object r5 = r7.f40851a
            return r5
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L35:
            ba0.g.M(r7)
            u70.q r7 = (u70.q) r7
            java.lang.Object r5 = r7.f40851a
            return r5
        L3d:
            ba0.g.M(r7)
            java.util.List r6 = kotlin.collections.c0.c(r6)
            r0.l = r3
            kt.j r7 = r4.f16468d
            java.lang.Object r5 = r7.j(r5, r6, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: et.z.z(java.lang.String, q90.a0, z70.c):java.lang.Object");
    }
}
