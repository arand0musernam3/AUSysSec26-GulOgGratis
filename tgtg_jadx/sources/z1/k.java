package z1;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yj.m f46568a = new yj.m(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.s f46569b = new t1.s(new y00.e0(9));

    public static final a0 a(Function1 function1) {
        h1 h1Var = new h1();
        function1.invoke(h1Var);
        float[] fArr = h1Var.f46532b;
        ArrayList arrayList = h1Var.f46531a;
        int size = arrayList.size();
        fArr.getClass();
        kotlin.collections.u.a(size, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
        fArrCopyOfRange.getClass();
        return new a0(arrayList, fArrCopyOfRange);
    }

    public static final Object b(r rVar, float f11, q qVar, g1 g1Var, Object obj, t1.i iVar, z70.i iVar2) {
        Object objA;
        float f12 = ((a0) g1Var).f(obj);
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = Float.isNaN(rVar.f46655j.h()) ? 0.0f : rVar.f46655j.h();
        if (!Float.isNaN(f12)) {
            float f13 = floatRef.element;
            if (f13 != f12 && (objA = t1.j1.a(f13, f12, f11, iVar, new rk.a0(22, qVar, floatRef), iVar2)) == y70.a.COROUTINE_SUSPENDED) {
                return objA;
            }
        }
        return Unit.f26487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(z1.g1 r5, float r6, float r7, kotlin.jvm.functions.Function1 r8, kotlin.jvm.functions.Function0 r9) {
        /*
            boolean r0 = java.lang.Float.isNaN(r6)
            if (r0 != 0) goto L97
            float r0 = java.lang.Math.abs(r7)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r0 <= 0) goto L13
            r0 = r3
            goto L14
        L13:
            r0 = r2
        L14:
            if (r0 == 0) goto L1c
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L1c
            r1 = r3
            goto L1d
        L1c:
            r1 = r2
        L1d:
            if (r0 != 0) goto L29
            z1.a0 r5 = (z1.a0) r5
            java.lang.Object r5 = r5.a(r6)
            r5.getClass()
            return r5
        L29:
            float r7 = java.lang.Math.abs(r7)
            java.lang.Object r9 = r9.invoke()
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            float r9 = java.lang.Math.abs(r9)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L49
            z1.a0 r5 = (z1.a0) r5
            java.lang.Object r5 = r5.b(r6, r1)
            r5.getClass()
            return r5
        L49:
            z1.a0 r5 = (z1.a0) r5
            java.lang.Object r7 = r5.b(r6, r2)
            r7.getClass()
            float r9 = r5.f(r7)
            java.lang.Object r0 = r5.b(r6, r3)
            r0.getClass()
            float r5 = r5.f(r0)
            float r4 = r9 - r5
            float r4 = java.lang.Math.abs(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Object r8 = r8.invoke(r4)
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            float r8 = java.lang.Math.abs(r8)
            if (r1 == 0) goto L7c
            goto L7d
        L7c:
            r9 = r5
        L7d:
            float r9 = r9 - r6
            float r5 = java.lang.Math.abs(r9)
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 < 0) goto L87
            r2 = r3
        L87:
            if (r2 != r3) goto L8c
            if (r1 == 0) goto L90
            goto L91
        L8c:
            if (r2 != 0) goto L92
            if (r1 == 0) goto L91
        L90:
            return r7
        L91:
            return r0
        L92:
            e40.a.f()
            r5 = 0
            return r5
        L97:
            java.lang.String r5 = "The offset provided to computeTarget must not be NaN."
            i4.a.f(r5)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.k.c(z1.g1, float, float, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(kotlin.jvm.functions.Function0 r4, kotlin.jvm.functions.Function2 r5, z70.c r6) {
        /*
            boolean r0 = r6 instanceof z1.g
            if (r0 == 0) goto L13
            r0 = r6
            z1.g r0 = (z1.g) r0
            int r1 = r0.f46513k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46513k = r1
            goto L18
        L13:
            z1.g r0 = new z1.g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f46512j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f46513k
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r6)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L40
            goto L40
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L2e:
            ba0.g.M(r6)
            z1.j r6 = new z1.j     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L40
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L40
            r0.f46513k = r3     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L40
            java.lang.Object r4 = v80.f0.n(r6, r0)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L40
            if (r4 != r1) goto L40
            return r1
        L40:
            kotlin.Unit r4 = kotlin.Unit.f26487a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.k.d(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, z70.c):java.lang.Object");
    }

    public static b4.t e(b4.t tVar, r rVar, h2 h2Var, boolean z11, g3.s3 s3Var, int i11) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 32) != 0) {
            s3Var = null;
        }
        return tVar.then(new b(rVar, h2Var, z11, s3Var));
    }

    public static final Object f(r rVar, Enum r32, t1.i iVar, x70.c cVar) {
        Object objA = rVar.a(r32, v1.j1.Default, new d(rVar, iVar, null), cVar);
        return objA == y70.a.COROUTINE_SUSPENDED ? objA : Unit.f26487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(z1.r r10, java.lang.Object r11, float r12, t1.i r13, t1.s r14, z70.c r15) {
        /*
            boolean r1 = r15 instanceof z1.e
            if (r1 == 0) goto L14
            r1 = r15
            z1.e r1 = (z1.e) r1
            int r3 = r1.f46476m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L14
            int r3 = r3 - r4
            r1.f46476m = r3
        L12:
            r7 = r1
            goto L1a
        L14:
            z1.e r1 = new z1.e
            r1.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r0 = r7.l
            y70.a r8 = y70.a.COROUTINE_SUSPENDED
            int r1 = r7.f46476m
            r9 = 1
            if (r1 == 0) goto L34
            if (r1 != r9) goto L2d
            float r1 = r7.f46474j
            kotlin.jvm.internal.Ref$FloatRef r2 = r7.f46475k
            ba0.g.M(r0)
            goto L59
        L2d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r0)
            r0 = 0
            return r0
        L34:
            ba0.g.M(r0)
            kotlin.jvm.internal.Ref$FloatRef r4 = new kotlin.jvm.internal.Ref$FloatRef
            r4.<init>()
            r4.element = r12
            z1.f r0 = new z1.f
            r6 = 0
            r1 = r10
            r2 = r12
            r3 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f46475k = r4
            r7.f46474j = r12
            r7.f46476m = r9
            v1.j1 r1 = v1.j1.Default
            java.lang.Object r0 = r10.a(r11, r1, r0, r7)
            if (r0 != r8) goto L57
            return r8
        L57:
            r1 = r12
            r2 = r4
        L59:
            float r0 = r2.element
            float r1 = r1 - r0
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.k.g(z1.r, java.lang.Object, float, t1.i, t1.s, z70.c):java.lang.Object");
    }

    public static Object h(r rVar, Object obj, float f11, z70.c cVar) {
        t1.i iVar;
        t1.s sVar = null;
        if (rVar.e()) {
            iVar = rVar.f46649d;
            if (iVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("snapAnimationSpec");
                iVar = null;
            }
        } else {
            iVar = a.f46388a;
        }
        t1.i iVar2 = iVar;
        if (rVar.e()) {
            t1.s sVar2 = rVar.f46650e;
            if (sVar2 != null) {
                sVar = sVar2;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("decayAnimationSpec");
            }
        } else {
            sVar = a.f46390c;
        }
        return g(rVar, obj, f11, iVar2, sVar, cVar);
    }
}
