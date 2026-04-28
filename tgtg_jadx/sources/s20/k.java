package s20;

import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f38812b;

    public /* synthetic */ k(ViewGroup viewGroup, int i11) {
        this.f38811a = i11;
        this.f38812b = viewGroup;
    }

    @Override // s20.d
    public final void a(g gVar) {
        switch (this.f38811a) {
            case 0:
                ((ta.e) this.f38812b).setCurrentItem(gVar.f38791d);
                break;
            default:
                ((ViewPager2) this.f38812b).setCurrentItem(gVar.f38791d, true);
                break;
        }
    }
}
