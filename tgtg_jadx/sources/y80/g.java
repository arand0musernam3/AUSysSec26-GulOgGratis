package y80;

import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f45476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f45477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f45478c;

    public g(h hVar, Ref.ObjectRef objectRef, j jVar) {
        this.f45476a = hVar;
        this.f45477b = objectRef;
        this.f45478c = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
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
    @Override // y80.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, x70.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof y80.f
            if (r0 == 0) goto L13
            r0 = r9
            y80.f r0 = (y80.f) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            y80.f r0 = new y80.f
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f45470j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r9)
            goto L60
        L27:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L2e:
            ba0.g.M(r9)
            y80.h r9 = r7.f45476a
            kotlin.jvm.functions.Function1 r2 = r9.f45484b
            java.lang.Object r2 = r2.invoke(r8)
            kotlin.jvm.internal.Ref$ObjectRef r4 = r7.f45477b
            T r5 = r4.element
            a90.v r6 = z80.b.f47357b
            if (r5 == r6) goto L53
            kotlin.jvm.functions.Function2 r9 = r9.f45485c
            java.lang.Object r9 = r9.invoke(r5, r2)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L50
            goto L53
        L50:
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        L53:
            r4.element = r2
            r0.l = r3
            y80.j r9 = r7.f45478c
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto L60
            return r1
        L60:
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.g.emit(java.lang.Object, x70.c):java.lang.Object");
    }
}
