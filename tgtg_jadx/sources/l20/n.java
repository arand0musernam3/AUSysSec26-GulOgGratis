package l20;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f26817b;

    public /* synthetic */ n(o oVar, int i11) {
        this.f26816a = i11;
        this.f26817b = oVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26816a) {
            case 0:
                o oVar = this.f26817b;
                SearchView searchView = oVar.f26818a;
                SearchView searchView2 = oVar.f26818a;
                if (!searchView.h()) {
                    searchView2.j();
                }
                searchView2.setTransitionState(l.SHOWN);
                break;
            case 1:
                o oVar2 = this.f26817b;
                oVar2.f26820c.setVisibility(8);
                SearchView searchView3 = oVar2.f26818a;
                if (!searchView3.h()) {
                    searchView3.f();
                }
                searchView3.setTransitionState(l.HIDDEN);
                break;
            case 2:
                o oVar3 = this.f26817b;
                SearchView searchView4 = oVar3.f26818a;
                SearchView searchView5 = oVar3.f26818a;
                if (!searchView4.h()) {
                    searchView5.j();
                }
                searchView5.setTransitionState(l.SHOWN);
                break;
            default:
                o oVar4 = this.f26817b;
                oVar4.f26820c.setVisibility(8);
                SearchView searchView6 = oVar4.f26818a;
                if (!searchView6.h()) {
                    searchView6.f();
                }
                searchView6.setTransitionState(l.HIDDEN);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f26816a) {
            case 0:
                o oVar = this.f26817b;
                oVar.f26820c.setVisibility(0);
                SearchBar searchBar = oVar.f26832p;
                searchBar.f12539l1.getClass();
                View centerView = searchBar.getCenterView();
                if (centerView != null) {
                    centerView.setAlpha(0.0f);
                }
                break;
            case 1:
                this.f26817b.f26818a.setTransitionState(l.HIDING);
                break;
            case 2:
                o oVar2 = this.f26817b;
                oVar2.f26820c.setVisibility(0);
                oVar2.f26818a.setTransitionState(l.SHOWING);
                break;
            default:
                this.f26817b.f26818a.setTransitionState(l.HIDING);
                break;
        }
    }
}
