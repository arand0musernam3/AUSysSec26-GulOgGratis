package d2;

import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.k1 f13727c = m3.i.w(x6.d.f43872e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3.k1 f13728d = m3.i.w(Boolean.TRUE);

    public a(int i11, String str) {
        this.f13725a = i11;
        this.f13726b = str;
    }

    @Override // d2.y2
    public final int a(z5.c cVar, z5.m mVar) {
        return e().f43873a;
    }

    @Override // d2.y2
    public final int b(z5.c cVar, z5.m mVar) {
        return e().f43875c;
    }

    @Override // d2.y2
    public final int c(z5.c cVar) {
        return e().f43876d;
    }

    @Override // d2.y2
    public final int d(z5.c cVar) {
        return e().f43874b;
    }

    public final x6.d e() {
        return (x6.d) this.f13727c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f13725a == ((a) obj).f13725a;
        }
        return false;
    }

    public final void f(boolean z11) {
        this.f13728d.setValue(Boolean.valueOf(z11));
    }

    public final void g(WindowInsetsCompat windowInsetsCompat, int i11) {
        int i12 = this.f13725a;
        if (i11 == 0 || (i11 & i12) != 0) {
            this.f13727c.setValue(windowInsetsCompat.e(i12));
            f(windowInsetsCompat.s(i12));
        }
    }

    public final int hashCode() {
        return this.f13725a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13726b);
        sb2.append('(');
        sb2.append(e().f43873a);
        sb2.append(", ");
        sb2.append(e().f43874b);
        sb2.append(", ");
        sb2.append(e().f43875c);
        sb2.append(", ");
        return r8.k.o(sb2, e().f43876d, ')');
    }
}
