package zw;

import android.graphics.Matrix;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g0 extends m1 implements i0, j1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashSet f48198i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f48199j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashSet f48200k = null;
    public HashSet l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HashSet f48201m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Matrix f48202n;

    @Override // zw.j1
    public final Set a() {
        return this.f48200k;
    }

    @Override // zw.j1
    public final String b() {
        return this.f48199j;
    }

    @Override // zw.j1
    public final void d(HashSet hashSet) {
        this.f48198i = hashSet;
    }

    @Override // zw.j1
    public final Set e() {
        return this.f48198i;
    }

    @Override // zw.j1
    public final void f(HashSet hashSet) {
        this.f48201m = hashSet;
    }

    @Override // zw.j1
    public final void g(String str) {
        this.f48199j = str;
    }

    @Override // zw.j1
    public final void h(HashSet hashSet) {
        this.l = hashSet;
    }

    @Override // zw.j1
    public final void i(HashSet hashSet) {
        this.f48200k = hashSet;
    }

    @Override // zw.i0
    public final void j(Matrix matrix) {
        this.f48202n = matrix;
    }

    @Override // zw.j1
    public final Set l() {
        return this.l;
    }

    @Override // zw.j1
    public final Set m() {
        return this.f48201m;
    }
}
