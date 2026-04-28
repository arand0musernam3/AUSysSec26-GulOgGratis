package zw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k1 extends m1 implements l1, j1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f48263i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HashSet f48264j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f48265k = null;
    public HashSet l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HashSet f48266m = null;

    @Override // zw.j1
    public final Set a() {
        return null;
    }

    @Override // zw.j1
    public final String b() {
        return this.f48265k;
    }

    @Override // zw.j1
    public final void d(HashSet hashSet) {
        this.f48264j = hashSet;
    }

    @Override // zw.j1
    public final Set e() {
        return this.f48264j;
    }

    @Override // zw.j1
    public final void f(HashSet hashSet) {
        this.f48266m = hashSet;
    }

    @Override // zw.j1
    public final void g(String str) {
        this.f48265k = str;
    }

    @Override // zw.l1
    public final List getChildren() {
        return this.f48263i;
    }

    @Override // zw.j1
    public final void h(HashSet hashSet) {
        this.l = hashSet;
    }

    public void k(p1 p1Var) {
        this.f48263i.add(p1Var);
    }

    @Override // zw.j1
    public final Set l() {
        return this.l;
    }

    @Override // zw.j1
    public final Set m() {
        return this.f48266m;
    }

    @Override // zw.j1
    public final void i(HashSet hashSet) {
    }
}
