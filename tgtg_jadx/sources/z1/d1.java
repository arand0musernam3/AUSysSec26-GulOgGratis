package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.ObjectRef f46460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f46461k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f46462m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f1 f46463n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Ref.ObjectRef objectRef, f1 f1Var, x70.c cVar) {
        super(2, cVar);
        this.f46462m = objectRef;
        this.f46463n = f1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        d1 d1Var = new d1(this.f46462m, this.f46463n, cVar);
        d1Var.l = obj;
        return d1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d1) create((Function1) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0040 -> B:25:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004c -> B:24:0x004f). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r6.f46461k
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L13
            kotlin.jvm.internal.Ref$ObjectRef r1 = r6.f46460j
            java.lang.Object r3 = r6.l
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            ba0.g.M(r7)
            goto L4f
        L13:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L1a:
            ba0.g.M(r7)
            java.lang.Object r7 = r6.l
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r3 = r7
        L22:
            kotlin.jvm.internal.Ref$ObjectRef r1 = r6.f46462m
            T r7 = r1.element
            boolean r4 = r7 instanceof z1.p0
            if (r4 != 0) goto L55
            boolean r4 = r7 instanceof z1.m0
            if (r4 != 0) goto L55
            boolean r4 = r7 instanceof z1.n0
            r5 = 0
            if (r4 == 0) goto L36
            z1.n0 r7 = (z1.n0) r7
            goto L37
        L36:
            r7 = r5
        L37:
            if (r7 == 0) goto L3c
            r3.invoke(r7)
        L3c:
            z1.f1 r7 = r6.f46463n
            x80.i r7 = r7.f46501u
            if (r7 == 0) goto L52
            r6.l = r3
            r6.f46460j = r1
            r6.f46461k = r2
            java.lang.Object r7 = r7.b(r6)
            if (r7 != r0) goto L4f
            return r0
        L4f:
            r5 = r7
            z1.q0 r5 = (z1.q0) r5
        L52:
            r1.element = r5
            goto L22
        L55:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.d1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
