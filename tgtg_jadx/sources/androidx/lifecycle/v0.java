package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.ObjectRef f3533j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ref.ObjectRef f3534k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f3535m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Lifecycle.State f3536n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v80.b0 f3537o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ z70.i f3538p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v0(Lifecycle lifecycle, Lifecycle.State state, v80.b0 b0Var, Function2 function2, x70.c cVar) {
        super(2, cVar);
        this.f3535m = lifecycle;
        this.f3536n = state;
        this.f3537o = b0Var;
        this.f3538p = (z70.i) function2;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new v0(this.f3535m, this.f3536n, this.f3537o, this.f3538p, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.lifecycle.d0, androidx.lifecycle.u0] */
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
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r12.l
            r2 = 0
            androidx.lifecycle.Lifecycle r3 = r12.f3535m
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 != r4) goto L17
            kotlin.jvm.internal.Ref$ObjectRef r1 = r12.f3534k
            kotlin.jvm.internal.Ref$ObjectRef r4 = r12.f3533j
            ba0.g.M(r13)     // Catch: java.lang.Throwable -> L14
            goto L71
        L14:
            r0 = move-exception
            r13 = r0
            goto L89
        L17:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r13)
            r13 = 0
            return r13
        L1e:
            ba0.g.M(r13)
            androidx.lifecycle.Lifecycle$State r13 = r3.b()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r13 != r1) goto L2c
            kotlin.Unit r13 = kotlin.Unit.f26487a
            return r13
        L2c:
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            androidx.lifecycle.Lifecycle$State r13 = r12.f3536n     // Catch: java.lang.Throwable -> L86
            v80.b0 r7 = r12.f3537o     // Catch: java.lang.Throwable -> L86
            z70.i r11 = r12.f3538p     // Catch: java.lang.Throwable -> L86
            r12.f3533j = r6     // Catch: java.lang.Throwable -> L86
            r12.f3534k = r1     // Catch: java.lang.Throwable -> L86
            r12.l = r4     // Catch: java.lang.Throwable -> L86
            v80.l r9 = new v80.l     // Catch: java.lang.Throwable -> L86
            x70.c r5 = y70.f.b(r12)     // Catch: java.lang.Throwable -> L86
            r9.<init>(r4, r5)     // Catch: java.lang.Throwable -> L86
            r9.t()     // Catch: java.lang.Throwable -> L86
            androidx.lifecycle.u r4 = androidx.lifecycle.w.Companion     // Catch: java.lang.Throwable -> L86
            r4.getClass()     // Catch: java.lang.Throwable -> L86
            androidx.lifecycle.w r5 = androidx.lifecycle.u.c(r13)     // Catch: java.lang.Throwable -> L86
            androidx.lifecycle.w r8 = androidx.lifecycle.u.a(r13)     // Catch: java.lang.Throwable -> L86
            e90.c r10 = e90.d.a()     // Catch: java.lang.Throwable -> L86
            androidx.lifecycle.u0 r4 = new androidx.lifecycle.u0     // Catch: java.lang.Throwable -> L86
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L86
            r1.element = r4     // Catch: java.lang.Throwable -> L86
            r3.a(r4)     // Catch: java.lang.Throwable -> L86
            java.lang.Object r13 = r9.s()     // Catch: java.lang.Throwable -> L86
            if (r13 != r0) goto L70
            return r0
        L70:
            r4 = r6
        L71:
            T r13 = r4.element
            v80.i1 r13 = (v80.i1) r13
            if (r13 == 0) goto L7a
            r13.a(r2)
        L7a:
            T r13 = r1.element
            androidx.lifecycle.c0 r13 = (androidx.lifecycle.c0) r13
            if (r13 == 0) goto L83
            r3.d(r13)
        L83:
            kotlin.Unit r13 = kotlin.Unit.f26487a
            return r13
        L86:
            r0 = move-exception
            r13 = r0
            r4 = r6
        L89:
            T r0 = r4.element
            v80.i1 r0 = (v80.i1) r0
            if (r0 == 0) goto L92
            r0.a(r2)
        L92:
            T r0 = r1.element
            androidx.lifecycle.c0 r0 = (androidx.lifecycle.c0) r0
            if (r0 == 0) goto L9b
            r3.d(r0)
        L9b:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.v0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
