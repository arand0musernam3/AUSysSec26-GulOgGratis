package g3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p4 implements v2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v2.h f19297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v2.f f19298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l9 f19299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i80.n f19300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f19301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f19302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b2.k f19303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d2.z1 f19304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d9 f19305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u3.d f19306j;

    public p4(v2.h hVar, v2.f fVar, l9 l9Var, i80.n nVar, boolean z11, boolean z12, b2.k kVar, d2.z1 z1Var, d9 d9Var, u3.d dVar) {
        this.f19297a = hVar;
        this.f19298b = fVar;
        this.f19299c = l9Var;
        this.f19300d = nVar;
        this.f19301e = z11;
        this.f19302f = z12;
        this.f19303g = kVar;
        this.f19304h = z1Var;
        this.f19305i = d9Var;
        this.f19306j = dVar;
    }

    @Override // v2.c
    public final void a(u3.d dVar, m3.n nVar, int i11) {
        m3.s sVar;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(794272399);
        int i12 = (sVar2.f(this) ? 32 : 16) | i11;
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            sVar = sVar2;
            i3.q0.a(i3.r0.Outlined, this.f19297a.b().f41928c, dVar, this.f19299c, this.f19300d, null, null, null, null, Intrinsics.areEqual(this.f19298b, v2.e.f41932b), this.f19301e, this.f19302f, this.f19303g, this.f19304h, this.f19305i, this.f19306j, sVar, 390, 0);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.u2(this, dVar, i11, 22);
        }
    }
}
