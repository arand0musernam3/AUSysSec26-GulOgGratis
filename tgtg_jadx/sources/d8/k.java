package d8;

import java.io.Serializable;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends z70.i implements Function1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f14639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Serializable f14640k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f14641m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Iterator f14642n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14643o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14644p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ y f14645q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.a0 f14646r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(y yVar, com.google.firebase.messaging.a0 a0Var, x70.c cVar) {
        super(1, cVar);
        this.f14645q = yVar;
        this.f14646r = a0Var;
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        return new k(this.f14645q, this.f14646r, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((k) create((x70.c) obj)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARN: Type inference failed for: r14v4, types: [T, java.lang.Object] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
