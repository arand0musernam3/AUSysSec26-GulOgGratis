package he;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f21925b;

    public j(LottieAnimationView lottieAnimationView, int i11) {
        this.f21924a = i11;
        switch (i11) {
            case 1:
                this.f21925b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.f21925b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    @Override // he.c0
    public final void onResult(Object obj) {
        switch (this.f21924a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f21925b.get();
                if (lottieAnimationView != null) {
                    int i11 = lottieAnimationView.f8854d;
                    if (i11 != 0) {
                        lottieAnimationView.setImageResource(i11);
                    }
                    c0 c0Var = lottieAnimationView.f8853c;
                    if (c0Var == null) {
                        c0Var = LottieAnimationView.f8850n;
                    }
                    c0Var.onResult(th2);
                    break;
                }
                break;
            default:
                k kVar = (k) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f21925b.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(kVar);
                    break;
                }
                break;
        }
    }
}
