package bg;

import android.view.ViewPropertyAnimator;
import com.app.tgtg.customview.MessageBarView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessageBarView f6152b;

    public /* synthetic */ f0(MessageBarView messageBarView, int i11) {
        this.f6151a = i11;
        this.f6152b = messageBarView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = this.f6151a;
        MessageBarView messageBarView = this.f6152b;
        switch (i11) {
            case 0:
                int i12 = MessageBarView.f8911b;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = messageBarView.animate();
                viewPropertyAnimatorAnimate.setDuration(200L);
                viewPropertyAnimatorAnimate.alpha(0.0f);
                viewPropertyAnimatorAnimate.translationY(-20.0f);
                viewPropertyAnimatorAnimate.setStartDelay(3000L);
                viewPropertyAnimatorAnimate.start();
                viewPropertyAnimatorAnimate.withEndAction(new f0(messageBarView, 1));
                break;
            default:
                int i13 = MessageBarView.f8911b;
                messageBarView.setVisibility(4);
                break;
        }
    }
}
