package z1;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f46771a = ((float) 0.125d) / 18;

    /* JADX WARN: Path cross not found for [B:32:0x00b4, B:38:0x00d6], limit reached: 68 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0086 -> B:23:0x008e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(w4.k0 r18, w4.v r19, w4.o r20, z70.a r21) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.y0.a(w4.k0, w4.v, w4.o, z70.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00be, code lost:
    
        if (h4.b.b(w4.u.h(r11, true), 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005f -> B:22:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(w4.k0 r17, long r18, z70.c r20) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.y0.b(w4.k0, long, z70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, w4.v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(w4.k0 r9, long r10, z70.c r12) {
        /*
            boolean r0 = r12 instanceof z1.t0
            if (r0 == 0) goto L13
            r0 = r12
            z1.t0 r0 = (z1.t0) r0
            int r1 = r0.f46691n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46691n = r1
            goto L18
        L13:
            z1.t0 r0 = new z1.t0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f46690m
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f46691n
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2e
            kotlin.jvm.internal.Ref$BooleanRef r9 = r0.l
            kotlin.jvm.internal.Ref$ObjectRef r10 = r0.f46689k
            w4.v r11 = r0.f46688j
            ba0.g.M(r12)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La5
            goto L98
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L35:
            ba0.g.M(r12)
            w4.m0 r12 = r9.f43144f
            w4.n r12 = r12.f43159s
            boolean r12 = g(r12, r10)
            if (r12 == 0) goto L43
            goto La4
        L43:
            w4.m0 r12 = r9.f43144f
            w4.n r12 = r12.f43159s
            java.util.List r12 = r12.f43165a
            int r2 = r12.size()
            r5 = 0
        L4e:
            if (r5 >= r2) goto L63
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            w4.v r7 = (w4.v) r7
            long r7 = r7.f43178a
            boolean r7 = w4.u.e(r7, r10)
            if (r7 == 0) goto L60
            goto L64
        L60:
            int r5 = r5 + 1
            goto L4e
        L63:
            r6 = r4
        L64:
            r11 = r6
            w4.v r11 = (w4.v) r11
            if (r11 != 0) goto L6a
            goto La4
        L6a:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            r12.element = r11
            c5.u3 r2 = r9.e()
            long r5 = r2.b()
            kotlin.jvm.internal.Ref$BooleanRef r2 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La5
            r2.<init>()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La5
            z1.u0 r7 = new z1.u0     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La5
            r7.<init>(r2, r12, r10, r4)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La5
            r0.f46688j = r11     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La5
            r0.f46689k = r10     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La5
            r0.l = r2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La5
            r0.f46691n = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La5
            java.lang.Object r9 = r9.p(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La5
            if (r9 != r1) goto L97
            return r1
        L97:
            r9 = r2
        L98:
            boolean r9 = r9.element     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La5
            if (r9 == 0) goto La4
            T r9 = r10.element     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La5
            w4.v r9 = (w4.v) r9     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La5
            if (r9 != 0) goto La3
            return r11
        La3:
            return r9
        La4:
            return r4
        La5:
            T r9 = r10.element
            w4.v r9 = (w4.v) r9
            if (r9 != 0) goto Lac
            goto Lad
        Lac:
            r11 = r9
        Lad:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.y0.c(w4.k0, long, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0153 -> B:63:0x0159). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(w4.k0 r20, long r21, a3.f1 r23, z70.a r24) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.y0.d(w4.k0, long, a3.f1, z70.a):java.lang.Object");
    }

    public static final Object e(w4.y yVar, Function1 function1, Function0 function0, Function0 function02, Function2 function2, x70.c cVar) {
        Object objE = z3.e(yVar, new w0(new yu.a(12), new Ref.LongRef(), null, new tq.c(function1, 9), function2, function02, new a3.p2(16, function0), null), cVar);
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        if (objE != aVar) {
            objE = Unit.f26487a;
        }
        return objE == aVar ? objE : Unit.f26487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(w4.k0 r4, long r5, kotlin.jvm.functions.Function1 r7, z70.c r8) {
        /*
            boolean r0 = r8 instanceof z1.x0
            if (r0 == 0) goto L13
            r0 = r8
            z1.x0 r0 = (z1.x0) r0
            int r1 = r0.f46763m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46763m = r1
            goto L18
        L13:
            z1.x0 r0 = new z1.x0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f46763m
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            kotlin.jvm.functions.Function1 r4 = r0.f46762k
            w4.k0 r5 = r0.f46761j
            ba0.g.M(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L34:
            ba0.g.M(r8)
        L37:
            r0.f46761j = r4
            r0.f46762k = r7
            r0.f46763m = r3
            java.lang.Object r8 = b(r4, r5, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            w4.v r8 = (w4.v) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = w4.u.d(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.invoke(r8)
            long r5 = r8.f43178a
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.y0.f(w4.k0, long, kotlin.jvm.functions.Function1, z70.c):java.lang.Object");
    }

    public static final boolean g(w4.n nVar, long j9) {
        Object obj;
        List list = nVar.f43165a;
        int size = list.size();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i11);
            if (w4.u.e(((w4.v) obj).f43178a, j9)) {
                break;
            }
            i11++;
        }
        w4.v vVar = (w4.v) obj;
        if (vVar != null && vVar.f43181d) {
            z11 = true;
        }
        return true ^ z11;
    }

    public static final float h(c5.u3 u3Var, int i11) {
        return i11 == 2 ? u3Var.f() * f46771a : u3Var.f();
    }
}
