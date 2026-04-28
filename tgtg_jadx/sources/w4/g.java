package w4;

import b5.i2;
import b5.m1;
import b5.o2;
import b5.q2;
import java.util.List;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends b4.s implements q2, i2, b5.k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b5.q f43119o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f43120p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f43121q;

    public g(a aVar, b5.q qVar) {
        this.f43119o = qVar;
        this.f43120p = aVar;
    }

    @Override // b5.i2
    public final void F() {
        P0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L0() {
        a aVar;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        b5.o.p(this, new f(1));
        g gVar = (g) objectRef.element;
        if (gVar == null || (aVar = gVar.f43120p) == null) {
            aVar = this.f43120p;
        }
        M0(aVar);
    }

    public abstract void M0(s sVar);

    public final void N0() {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        b5.o.r(this, new e(booleanRef));
        if (booleanRef.element) {
            L0();
        }
    }

    public abstract boolean O0(int i11);

    /* JADX WARN: Multi-variable type inference failed */
    public final void P0() {
        if (this.f43121q) {
            this.f43121q = false;
            if (isAttached()) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                b5.o.p(this, new d(objectRef));
                g gVar = (g) objectRef.element;
                if (gVar != null) {
                    gVar.L0();
                } else {
                    M0(null);
                }
            }
        }
    }

    @Override // b5.i2
    public final long j() {
        b5.q qVar = this.f43119o;
        if (qVar == null) {
            return o2.f5912a;
        }
        z5.c cVar = b5.m.g(this).f5889z;
        int i11 = o2.f5913b;
        return m1.c(cVar.q0(qVar.f5924a), cVar.q0(qVar.f5925b), cVar.q0(qVar.f5926c), cVar.q0(qVar.f5927d));
    }

    @Override // b4.s
    public final void onDetach() {
        P0();
        super.onDetach();
    }

    @Override // b5.i2
    public final void p0(n nVar, o oVar, long j9) {
        if (oVar == o.Main) {
            List list = nVar.f43165a;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (O0(((v) list.get(i11)).f43186i)) {
                    int i12 = nVar.f43170f;
                    if (i12 == 4) {
                        this.f43121q = true;
                        N0();
                        return;
                    } else {
                        if (i12 == 5) {
                            P0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }
}
