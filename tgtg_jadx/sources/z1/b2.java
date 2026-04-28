package z1;

import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l3 f46415j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ref.FloatRef f46416k;
    public float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f46417m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g2 f46418n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f46419o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(g2 g2Var, z70.c cVar) {
        super(cVar);
        this.f46418n = g2Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f46417m = obj;
        this.f46419o |= Integer.MIN_VALUE;
        return g2.a(this.f46418n, null, null, 0.0f, 0.0f, this);
    }
}
