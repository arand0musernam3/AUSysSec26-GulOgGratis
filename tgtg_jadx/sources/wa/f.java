package wa;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f43365b;

    public /* synthetic */ f(ViewPager2 viewPager2, int i11) {
        this.f43364a = i11;
        this.f43365b = viewPager2;
    }

    @Override // wa.i
    public void a(int i11) {
        switch (this.f43364a) {
            case 0:
                if (i11 == 0) {
                    this.f43365b.e();
                }
                break;
        }
    }

    @Override // wa.i
    public final void c(int i11) {
        switch (this.f43364a) {
            case 0:
                ViewPager2 viewPager2 = this.f43365b;
                if (viewPager2.f4117d != i11) {
                    viewPager2.f4117d = i11;
                    viewPager2.f4132t.R();
                }
                break;
            default:
                ViewPager2 viewPager22 = this.f43365b;
                viewPager22.clearFocus();
                if (viewPager22.hasFocus()) {
                    viewPager22.f4123j.requestFocus(2);
                }
                break;
        }
    }
}
