package com.braze.communication.dust;

import com.braze.managers.d0;
import com.braze.managers.e0;
import com.braze.managers.f0;
import j4.s;
import java.net.HttpURLConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Ref.ObjectRef f9618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Ref.ObjectRef f9619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f9621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f9622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0 f9623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e0 f9624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d0 f9625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f9626i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, f0 f0Var, e0 e0Var, d0 d0Var, String str, x70.c cVar) {
        super(2, cVar);
        this.f9622e = iVar;
        this.f9623f = f0Var;
        this.f9624g = e0Var;
        this.f9625h = d0Var;
        this.f9626i = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String a(Ref.ObjectRef objectRef) {
        return s.f(((HttpURLConnection) objectRef.element).getResponseCode(), "DUST stream response code ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String b(Ref.ObjectRef objectRef) {
        return s.f(((HttpURLConnection) objectRef.element).getResponseCode(), "DUST stream connection failed with response code ");
    }

    public static final String c() {
        return "Stream connection job cancelled";
    }

    public static final String d() {
        return "Closing stream connection data";
    }

    public static final String e() {
        return "Stream job finished";
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        h hVar = new h(this.f9622e, this.f9623f, this.f9624g, this.f9625h, this.f9626i, cVar);
        hVar.f9621d = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0172 A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:7:0x0019, B:32:0x010a, B:45:0x016c, B:47:0x0172, B:49:0x019c, B:48:0x0188), top: B:60:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0188 A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:7:0x0019, B:32:0x010a, B:45:0x016c, B:47:0x0172, B:49:0x019c, B:48:0x0188), top: B:60:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b9 A[PHI: r0
      0x01b9: PHI (r0v15 java.net.HttpURLConnection) = (r0v12 java.net.HttpURLConnection), (r0v20 java.net.HttpURLConnection) binds: [B:51:0x01b7, B:40:0x0161] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f2  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r9v6, types: [T, java.net.HttpURLConnection] */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.communication.dust.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static final String a(String str) {
        return e0.f.k("Starting DUST stream to ", str);
    }

    public static final String b() {
        return "Caught unexpected exception listening to DUST stream";
    }

    public static final String a() {
        return "Stream job coroutine no longer active";
    }
}
