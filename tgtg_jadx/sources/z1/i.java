package z1;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f46533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v80.b0 f46534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f46535c;

    public i(Ref.ObjectRef objectRef, v80.b0 b0Var, Function2 function2) {
        this.f46533a = objectRef;
        this.f46534b = b0Var;
        this.f46535c = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v3, types: [T, v80.b2] */
    @Override // y80.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r12, x70.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof z1.h
            if (r0 == 0) goto L13
            r0 = r13
            z1.h r0 = (z1.h) r0
            int r1 = r0.f46530m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46530m = r1
            goto L18
        L13:
            z1.h r0 = new z1.h
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f46529k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f46530m
            kotlin.jvm.internal.Ref$ObjectRef r3 = r11.f46533a
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2b
            java.lang.Object r12 = r0.f46528j
            ba0.g.M(r13)
            goto L4e
        L2b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r12)
            r12 = 0
            return r12
        L32:
            ba0.g.M(r13)
            T r13 = r3.element
            v80.i1 r13 = (v80.i1) r13
            if (r13 == 0) goto L4e
            androidx.compose.foundation.gestures.AnchoredDragFinishedSignal r2 = new androidx.compose.foundation.gestures.AnchoredDragFinishedSignal
            r2.<init>()
            r13.a(r2)
            r0.f46528j = r12
            r0.f46530m = r4
            java.lang.Object r13 = r13.B(r0)
            if (r13 != r1) goto L4e
            return r1
        L4e:
            r7 = r12
            v80.d0 r12 = v80.d0.UNDISPATCHED
            tg.g r5 = new tg.g
            kotlin.jvm.functions.Function2 r6 = r11.f46535c
            r10 = 22
            v80.b0 r8 = r11.f46534b
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            v80.b2 r12 = v80.f0.B(r8, r9, r12, r5, r4)
            r3.element = r12
            kotlin.Unit r12 = kotlin.Unit.f26487a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.i.emit(java.lang.Object, x70.c):java.lang.Object");
    }
}
