package g1;

import java.util.Iterator;
import m0.m1;
import s0.n;
import s0.o2;
import s0.w1;
import s0.x1;
import s0.z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f18075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f18076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o2 f18078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f18079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f18080f;

    public /* synthetic */ c(d dVar, String str, String str2, o2 o2Var, n nVar, n nVar2) {
        this.f18075a = dVar;
        this.f18076b = str;
        this.f18077c = str2;
        this.f18078d = o2Var;
        this.f18079e = nVar;
        this.f18080f = nVar2;
    }

    @Override // s0.w1
    public final void a(z1 z1Var, x1 x1Var) {
        d dVar = this.f18075a;
        if (dVar.d() == null) {
            return;
        }
        dVar.D();
        dVar.B(dVar.E(this.f18076b, this.f18077c, this.f18078d, this.f18079e, this.f18080f));
        dVar.p();
        h hVar = dVar.f18082s;
        hVar.getClass();
        a.a.t();
        Iterator it = hVar.f18097a.iterator();
        while (it.hasNext()) {
            hVar.c((m1) it.next());
        }
    }
}
