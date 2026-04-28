package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.BooleanRef f46437j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ref.BooleanRef f46438k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f46439m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f46440n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f46441o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f46442p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f46443q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f46444r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g2 f46445s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f46446t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l3 f46447u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(Ref.FloatRef floatRef, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, float f11, g2 g2Var, float f12, l3 l3Var, x70.c cVar) {
        super(2, cVar);
        this.f46441o = floatRef;
        this.f46442p = objectRef;
        this.f46443q = objectRef2;
        this.f46444r = f11;
        this.f46445s = g2Var;
        this.f46446t = f12;
        this.f46447u = l3Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        c2 c2Var = new c2(this.f46441o, this.f46442p, this.f46443q, this.f46444r, this.f46445s, this.f46446t, this.f46447u, cVar);
        c2Var.f46440n = obj;
        return c2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c2) create((k3) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c5  */
    /* JADX WARN: Type inference failed for: r10v5, types: [T, t1.j] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0181 -> B:37:0x0182). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.c2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
