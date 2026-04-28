package bg;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import com.app.tgtg.customview.BottomFadingScrollView;
import pg.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f6165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6166c;

    public /* synthetic */ j0(int i11, View view, Object obj) {
        this.f6164a = i11;
        this.f6165b = view;
        this.f6166c = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f6164a) {
            case 0:
                BottomFadingScrollView bottomFadingScrollView = (BottomFadingScrollView) this.f6165b;
                View childAt = bottomFadingScrollView.getChildAt(0);
                if (childAt != null) {
                    int height = childAt.getHeight();
                    if (bottomFadingScrollView.getHeight() < bottomFadingScrollView.getPaddingBottom() + bottomFadingScrollView.getPaddingTop() + height) {
                        ((ImageView) this.f6166c).setVisibility(8);
                    }
                }
                bottomFadingScrollView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                break;
            case 1:
                this.f6165b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                en.b bVar = (en.b) this.f6166c;
                bVar.f16116m = true;
                a2 a2Var = bVar.f16105a;
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (((double) a2Var.f34773v.getHeight()) * 1.5d), 0.0f);
                translateAnimation.setDuration(500L);
                translateAnimation.setAnimationListener(new c70.a(new ek.a(1, a2Var, bVar), new c50.p(a2Var, 15)));
                new Handler(Looper.getMainLooper()).postDelayed(new com.google.firebase.messaging.r(12, a2Var, translateAnimation), 200L);
                break;
            case 2:
                this.f6165b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                a2 a2Var2 = (a2) this.f6166c;
                NestedScrollView nestedScrollView = a2Var2.E;
                nestedScrollView.getClass();
                p30.b.i(a2Var2.f34773v.getHeight(), nestedScrollView);
                break;
            case 3:
                this.f6165b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                pg.n nVar = (pg.n) this.f6166c;
                NestedScrollView nestedScrollView2 = nVar.C;
                nestedScrollView2.getClass();
                p30.b.i(nVar.f35001t.getHeight(), nestedScrollView2);
                break;
            default:
                this.f6165b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                c40.q qVar = (c40.q) this.f6166c;
                qVar.f7092b = true;
                qVar.f();
                break;
        }
    }
}
