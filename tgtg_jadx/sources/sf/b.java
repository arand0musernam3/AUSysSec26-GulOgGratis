package sf;

import al.j;
import b0.i0;
import kotlin.jvm.internal.Intrinsics;
import qf.d;
import qf.e;
import rf.g;
import v80.b0;
import v80.f0;
import v80.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ye.b f39018c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public qf.a f39020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f39021f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf.c f39016a = qf.c.Destination;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f39017b = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f39019d = true;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // qf.d
    public final void a(ye.b bVar) {
        bVar.getClass();
        bVar.getClass();
        this.f39018c = bVar;
        e eVar = this.f39017b;
        eVar.getClass();
        eVar.f37043b = bVar;
        qf.a aVar = new qf.a(bVar);
        this.f39020e = aVar;
        aVar.f37038i = true;
        ye.b bVar2 = aVar.f37030a;
        x xVar = bVar2.f45857f;
        i0 i0Var = new i0(aVar, null, 4);
        b0 b0Var = aVar.f37035f;
        f0.B(b0Var, xVar, null, i0Var, 2);
        f0.B(b0Var, bVar2.f45856e, null, new j(aVar, null), 2);
        this.f39021f = new g(bVar.d(), bVar, bVar.f(), bVar.f45852a, this);
        gf.c cVar = new gf.c(1);
        d().getClass();
        cVar.a(eVar.b());
        qf.b bVar3 = (qf.b) eVar.f37042a.get(cVar.getType());
        if (bVar3 != null) {
            bVar3.f37041a.add(cVar);
        }
    }

    @Override // qf.d
    public final pf.a b(pf.a aVar) {
        return null;
    }

    public final void c(pf.a aVar) {
        if (aVar.f34734a != null || aVar.f34735b != null) {
            f0.B(d().f45854c, d().f45857f, null, new mn.g(this, aVar, null, 23), 2);
        } else {
            d().f().d("Event is invalid for missing information like userId and deviceId. Dropping event: " + aVar.a());
        }
    }

    public final ye.b d() {
        ye.b bVar = this.f39018c;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("amplitude");
        return null;
    }

    @Override // qf.d
    public final qf.c getType() {
        return this.f39016a;
    }
}
