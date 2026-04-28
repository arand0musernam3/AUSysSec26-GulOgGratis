package n1;

import java.util.ArrayList;
import java.util.List;
import p4.j;
import p4.m;
import p4.n;
import p4.s;
import p4.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements pe.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f30272a;

    public c(v70.e eVar) {
        eVar.getClass();
        this.f30272a = new ArrayList(eVar);
    }

    public void a() {
        this.f30272a.add(j.f34357c);
    }

    public void b(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f30272a.add(new s(f11, f12, f13, f14, f15, f16));
    }

    public void c(float f11, float f12) {
        this.f30272a.add(new m(f11, f12));
    }

    public void d(float f11, float f12) {
        this.f30272a.add(new u(f11, f12));
    }

    public void e(float f11, float f12) {
        this.f30272a.add(new n(f11, f12));
    }

    @Override // pe.e
    public ke.e g() {
        ArrayList arrayList = this.f30272a;
        return ((we.a) arrayList.get(0)).c() ? new ke.j(arrayList, 1) : new ke.m(arrayList);
    }

    @Override // pe.e
    public List h() {
        return this.f30272a;
    }

    @Override // pe.e
    public boolean isStatic() {
        ArrayList arrayList = this.f30272a;
        return arrayList.size() == 1 && ((we.a) arrayList.get(0)).c();
    }

    public c() {
        this.f30272a = new ArrayList(32);
    }

    public c(ArrayList arrayList) {
        this.f30272a = arrayList;
    }
}
