package h20;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import h7.j1;
import h7.o1;
import qa.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21259c;

    public b(y yVar, q1.e eVar) {
        this.f21257a = 2;
        this.f21259c = yVar;
        this.f21258b = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21257a) {
            case 0:
                DrawerLayout drawerLayout = (DrawerLayout) this.f21258b;
                drawerLayout.b((NavigationView) this.f21259c, false);
                drawerLayout.setScrimColor(-1728053248);
                break;
            case 1:
                o1 o1Var = (o1) this.f21258b;
                o1Var.f21602a.e(1.0f);
                j1.f((View) this.f21259c, o1Var);
                break;
            case 2:
                ((q1.e) this.f21258b).remove(animator);
                ((y) this.f21259c).f36762o.remove(animator);
                break;
            default:
                ((u10.g) this.f21258b).setCircularRevealOverlayDrawable(null);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f21257a) {
            case 2:
                ((y) this.f21259c).f36762o.add(animator);
                break;
            case 3:
                ((u10.g) this.f21258b).setCircularRevealOverlayDrawable((Drawable) this.f21259c);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f21257a = i11;
        this.f21258b = obj;
        this.f21259c = obj2;
    }
}
