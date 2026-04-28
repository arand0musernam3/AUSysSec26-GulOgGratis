package wa;

import androidx.recyclerview.widget.n1;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43363b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f43362a = i11;
        this.f43363b = obj;
    }

    @Override // androidx.recyclerview.widget.n1
    public final void a() {
        switch (this.f43362a) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) this.f43363b;
                viewPager2.f4118e = true;
                viewPager2.l.l = true;
                break;
            default:
                ((j) this.f43363b).R();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.n1
    public final void b(int i11, int i12, Object obj) {
        a();
    }

    @Override // androidx.recyclerview.widget.n1
    public final void c(int i11, int i12) {
        a();
    }

    @Override // androidx.recyclerview.widget.n1
    public final void d(int i11, int i12) {
        a();
    }

    @Override // androidx.recyclerview.widget.n1
    public final void e(int i11, int i12) {
        a();
    }
}
