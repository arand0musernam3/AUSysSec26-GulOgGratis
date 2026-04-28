package q6;

import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f36305b;

    public /* synthetic */ s(ViewGroup viewGroup, int i11) {
        this.f36304a = i11;
        this.f36305b = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36304a) {
            case 0:
                ((MotionLayout) this.f36305b).f2277j1.a();
                break;
            case 1:
                ((MotionLayout) this.f36305b).f2277j1.a();
                break;
            default:
                this.f36305b.setNestedScrollingEnabled(true);
                break;
        }
    }
}
