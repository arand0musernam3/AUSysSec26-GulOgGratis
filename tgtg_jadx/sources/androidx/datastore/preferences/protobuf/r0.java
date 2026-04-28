package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f3047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f3048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f3049c;

    public r0(g1 g1Var, o oVar, a aVar) {
        this.f3048b = g1Var;
        oVar.getClass();
        this.f3049c = oVar;
        this.f3047a = aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    public final void a(Object obj, Object obj2) {
        b1.k(this.f3048b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    public final void b(Object obj, i0 i0Var) {
        this.f3049c.getClass();
        b3.i.A(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    public final void c(Object obj) {
        ((i1) this.f3048b).getClass();
        h1 h1Var = ((z) obj).unknownFields;
        if (h1Var.f2986e) {
            h1Var.f2986e = false;
        }
        this.f3049c.getClass();
        b3.i.A(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    public final boolean d(Object obj) {
        this.f3049c.getClass();
        b3.i.A(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    public final int e(z zVar) {
        ((i1) this.f3048b).getClass();
        h1 h1Var = zVar.unknownFields;
        int i11 = h1Var.f2985d;
        if (i11 != -1) {
            return i11;
        }
        int iF = 0;
        for (int i12 = 0; i12 < h1Var.f2982a; i12++) {
            int i13 = h1Var.f2983b[i12] >>> 3;
            iF += l.f(3, (f) h1Var.f2984c[i12]) + l.i(i13) + l.h(2) + (l.h(1) * 2);
        }
        h1Var.f2985d = iF;
        return iF;
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    public final int f(z zVar) {
        ((i1) this.f3048b).getClass();
        return zVar.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    public final boolean g(z zVar, z zVar2) {
        i1 i1Var = (i1) this.f3048b;
        i1Var.getClass();
        h1 h1Var = zVar.unknownFields;
        i1Var.getClass();
        return h1Var.equals(zVar2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    public final void h(Object obj, k kVar, n nVar) {
        this.f3048b.a(obj);
        this.f3049c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    public final z i() {
        a aVar = this.f3047a;
        return aVar instanceof z ? ((z) aVar).i() : ((w) ((z) aVar).c(y.NEW_BUILDER)).b();
    }
}
