package h2;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s0 implements pe.e, y00.x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21216b;

    public s0(int i11) {
        this.f21215a = i11;
        switch (i11) {
            case 2:
                this.f21216b = m3.i.w(Boolean.FALSE);
                break;
            default:
                q1.g0 g0Var = q1.p.f35804a;
                this.f21216b = new q1.g0();
                break;
        }
    }

    @Override // y00.x1
    public ky.p a() {
        throw null;
    }

    @Override // y00.x1
    public y00.w0 b() {
        throw null;
    }

    @Override // y00.x1
    public vz.b c() {
        throw null;
    }

    @Override // y00.x1
    public y00.l1 d() {
        throw null;
    }

    @Override // y00.x1
    public Context f() {
        throw null;
    }

    @Override // pe.e
    public List h() {
        return (List) this.f21216b;
    }

    public abstract r0 i(int i11, int i12, int i13, long j9);

    @Override // pe.e
    public boolean isStatic() {
        List list = (List) this.f21216b;
        return list.isEmpty() || (list.size() == 1 && ((we.a) list.get(0)).c());
    }

    public abstract Object j();

    public List k(q0 q0Var, int i11, long j9) {
        q1.g0 g0Var = (q1.g0) this.f21216b;
        List list = (List) g0Var.b(i11);
        if (list != null) {
            return list;
        }
        List listB = q0Var.b(i11);
        int size = listB.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(((z4.t0) listB.get(i12)).D(j9));
        }
        g0Var.i(i11, arrayList);
        return arrayList;
    }

    public abstract Object l();

    public abstract void m(Object obj);

    public abstract void n(t1.q1 q1Var);

    public abstract void o();

    public void p() {
        y00.l1 l1Var = ((y00.n1) this.f21216b).f44988g;
        y00.n1.m(l1Var);
        l1Var.p();
    }

    public String toString() {
        switch (this.f21215a) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                List list = (List) this.f21216b;
                if (!list.isEmpty()) {
                    sb2.append("values=");
                    sb2.append(Arrays.toString(list.toArray()));
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public s0(y00.n1 n1Var) {
        this.f21215a = 4;
        com.google.android.gms.common.internal.i0.h(n1Var);
        this.f21216b = n1Var;
    }

    public /* synthetic */ s0(Object obj, int i11) {
        this.f21215a = i11;
        this.f21216b = obj;
    }
}
