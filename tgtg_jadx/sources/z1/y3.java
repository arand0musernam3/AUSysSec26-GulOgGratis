package z1;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final le.v f46778a = new le.v(3, null, 3);

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[LOOP:0: B:19:0x004a->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(w4.k0 r8, z70.a r9) {
        /*
            boolean r0 = r9 instanceof z1.p3
            if (r0 == 0) goto L13
            r0 = r9
            z1.p3 r0 = (z1.p3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            z1.p3 r0 = new z1.p3
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f46636k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            w4.k0 r8 = r0.f46635j
            ba0.g.M(r9)
            goto L40
        L29:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L30:
            ba0.g.M(r9)
        L33:
            r0.f46635j = r8
            r0.l = r3
            w4.o r9 = w4.o.Main
            java.lang.Object r9 = r8.b(r9, r0)
            if (r9 != r1) goto L40
            return r1
        L40:
            w4.n r9 = (w4.n) r9
            java.util.List r2 = r9.f43165a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4a:
            if (r6 >= r4) goto L58
            java.lang.Object r7 = r2.get(r6)
            w4.v r7 = (w4.v) r7
            r7.a()
            int r6 = r6 + 1
            goto L4a
        L58:
            java.util.List r9 = r9.f43165a
            int r2 = r9.size()
        L5e:
            if (r5 >= r2) goto L6e
            java.lang.Object r4 = r9.get(r5)
            w4.v r4 = (w4.v) r4
            boolean r4 = r4.f43181d
            if (r4 == 0) goto L6b
            goto L33
        L6b:
            int r5 = r5 + 1
            goto L5e
        L6e:
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.y3.a(w4.k0, z70.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(w4.k0 r6, boolean r7, w4.o r8, x70.c r9) {
        /*
            boolean r0 = r9 instanceof z1.m3
            if (r0 == 0) goto L13
            r0 = r9
            z1.m3 r0 = (z1.m3) r0
            int r1 = r0.f46611n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46611n = r1
            goto L18
        L13:
            z1.m3 r0 = new z1.m3
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f46610m
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f46611n
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            boolean r6 = r0.l
            w4.o r7 = r0.f46609k
            w4.k0 r8 = r0.f46608j
            ba0.g.M(r9)
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
            goto L4a
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L38:
            ba0.g.M(r9)
        L3b:
            r0.f46608j = r6
            r0.f46609k = r8
            r0.l = r7
            r0.f46611n = r3
            java.lang.Object r9 = r6.b(r8, r0)
            if (r9 != r1) goto L4a
            return r1
        L4a:
            w4.n r9 = (w4.n) r9
            r2 = 0
            boolean r4 = g(r9, r7, r2)
            if (r4 == 0) goto L3b
            java.util.List r6 = r9.f43165a
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.y3.b(w4.k0, boolean, w4.o, x70.c):java.lang.Object");
    }

    public static /* synthetic */ Object c(w4.k0 k0Var, w4.o oVar, x70.c cVar, int i11) {
        boolean z11 = (i11 & 1) != 0;
        if ((i11 & 2) != 0) {
            oVar = w4.o.Main;
        }
        return b(k0Var, z11, oVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(w4.k0 r6, w4.o r7, z70.a r8) {
        /*
            boolean r0 = r8 instanceof z1.n3
            if (r0 == 0) goto L13
            r0 = r8
            z1.n3 r0 = (z1.n3) r0
            int r1 = r0.f46618m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46618m = r1
            goto L18
        L13:
            z1.n3 r0 = new z1.n3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f46618m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2e
            w4.o r6 = r0.f46617k
            w4.k0 r7 = r0.f46616j
            ba0.g.M(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L45
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L35:
            ba0.g.M(r8)
        L38:
            r0.f46616j = r6
            r0.f46617k = r7
            r0.f46618m = r3
            java.lang.Object r8 = r6.b(r7, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            w4.n r8 = (w4.n) r8
            r2 = 0
            boolean r4 = g(r8, r2, r3)
            if (r4 == 0) goto L38
            java.util.List r6 = r8.f43165a
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.y3.d(w4.k0, w4.o, z70.a):java.lang.Object");
    }

    public static final Object e(w4.y yVar, i80.n nVar, Function1 function1, x70.c cVar) {
        Object objN = v80.f0.n(new af.b(yVar, nVar, function1, new k2(yVar), (x70.c) null), cVar);
        return objN == y70.a.COROUTINE_SUSPENDED ? objN : Unit.f26487a;
    }

    public static Object f(w4.y yVar, Function1 function1, x70.c cVar) {
        Object objN = v80.f0.n(new al.j(yVar, f46778a, (Object) null, (Object) null, function1, (x70.c) null, 10), cVar);
        return objN == y70.a.COROUTINE_SUSPENDED ? objN : Unit.f26487a;
    }

    public static final boolean g(w4.n nVar, boolean z11, boolean z12) {
        if (z12) {
            List list = nVar.f43165a;
            int size = list.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    if (((w4.v) list.get(i11)).f43186i != 2) {
                        break;
                    }
                    i11++;
                } else if ((nVar.f43168d & 33) == 0) {
                    return false;
                }
            }
        }
        List list2 = nVar.f43165a;
        int size2 = list2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            w4.v vVar = (w4.v) list2.get(i12);
            if (!(z11 ? w4.u.a(vVar) : w4.u.b(vVar))) {
                return false;
            }
        }
        return true;
    }

    public static v80.b2 h(v80.b0 b0Var, v80.i1 i1Var, Function2 function2) {
        return v80.f0.B(b0Var, null, v80.d0.UNDISPATCHED, new d3(i1Var, function2, (x70.c) null), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, z1.u1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(w4.k0 r7, w4.o r8, z70.a r9) {
        /*
            boolean r0 = r9 instanceof z1.v3
            if (r0 == 0) goto L13
            r0 = r9
            z1.v3 r0 = (z1.v3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            z1.v3 r0 = new z1.v3
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f46734k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            kotlin.jvm.internal.Ref$ObjectRef r7 = r0.f46733j
            ba0.g.M(r9)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L59
            goto L56
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L30:
            ba0.g.M(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            z1.u1 r2 = z1.u1.f46714a
            r9.element = r2
            c5.u3 r2 = r7.e()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L59
            long r4 = r2.b()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L59
            z1.w3 r2 = new z1.w3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L59
            r6 = 0
            r2.<init>(r8, r9, r6)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L59
            r0.f46733j = r9     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L59
            r0.l = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L59
            java.lang.Object r7 = r7.p(r4, r2, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L59
            if (r7 != r1) goto L55
            return r1
        L55:
            r7 = r9
        L56:
            T r7 = r7.element
            return r7
        L59:
            z1.w1 r7 = z1.w1.f46752a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.y3.i(w4.k0, w4.o, z70.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
    
        if (r15 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009d -> B:13:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(w4.k0 r13, w4.o r14, z70.a r15) {
        /*
            boolean r0 = r15 instanceof z1.x3
            if (r0 == 0) goto L13
            r0 = r15
            z1.x3 r0 = (z1.x3) r0
            int r1 = r0.f46770m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46770m = r1
            goto L18
        L13:
            z1.x3 r0 = new z1.x3
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f46770m
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3a
            if (r2 != r3) goto L33
            w4.o r13 = r0.f46769k
            w4.k0 r14 = r0.f46768j
            ba0.g.M(r15)
        L2e:
            r12 = r14
            r14 = r13
            r13 = r12
            goto La0
        L33:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r13)
            r13 = 0
            return r13
        L3a:
            w4.o r13 = r0.f46769k
            w4.k0 r14 = r0.f46768j
            ba0.g.M(r15)
            goto L55
        L42:
            ba0.g.M(r15)
        L45:
            r0.f46768j = r13
            r0.f46769k = r14
            r0.f46770m = r5
            java.lang.Object r15 = r13.b(r14, r0)
            if (r15 != r1) goto L52
            goto L9f
        L52:
            r12 = r14
            r14 = r13
            r13 = r12
        L55:
            w4.n r15 = (w4.n) r15
            java.util.List r15 = r15.f43165a
            int r2 = r15.size()
            r6 = r4
        L5e:
            if (r6 >= r2) goto Lbf
            java.lang.Object r7 = r15.get(r6)
            w4.v r7 = (w4.v) r7
            boolean r7 = w4.u.c(r7)
            if (r7 != 0) goto Lbc
            int r2 = r15.size()
            r6 = r4
        L71:
            if (r6 >= r2) goto L91
            java.lang.Object r7 = r15.get(r6)
            w4.v r7 = (w4.v) r7
            boolean r8 = r7.b()
            if (r8 != 0) goto Lb7
            w4.m0 r8 = r14.f43144f
            long r8 = r8.f43164x
            long r10 = r14.c()
            boolean r7 = w4.u.f(r7, r8, r10)
            if (r7 == 0) goto L8e
            goto Lb7
        L8e:
            int r6 = r6 + 1
            goto L71
        L91:
            w4.o r15 = w4.o.Final
            r0.f46768j = r14
            r0.f46769k = r13
            r0.f46770m = r3
            java.lang.Object r15 = r14.b(r15, r0)
            if (r15 != r1) goto L2e
        L9f:
            return r1
        La0:
            w4.n r15 = (w4.n) r15
            java.util.List r15 = r15.f43165a
            int r2 = r15.size()
            r6 = r4
        La9:
            if (r6 >= r2) goto L45
            java.lang.Object r7 = r15.get(r6)
            w4.v r7 = (w4.v) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto Lb9
        Lb7:
            r13 = 0
            return r13
        Lb9:
            int r6 = r6 + 1
            goto La9
        Lbc:
            int r6 = r6 + 1
            goto L5e
        Lbf:
            java.lang.Object r13 = r15.get(r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.y3.j(w4.k0, w4.o, z70.a):java.lang.Object");
    }
}
