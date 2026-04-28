package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.search.SearchBar;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3679c;

    public /* synthetic */ c0(Object obj, int i11) {
        this.f3677a = i11;
        this.f3679c = obj;
        this.f3678b = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3677a) {
            case 0:
                this.f3678b = true;
                break;
            case 1:
            default:
                super.onAnimationCancel(animator);
                break;
            case 2:
                this.f3678b = true;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i11 = this.f3677a;
        Object obj = this.f3679c;
        switch (i11) {
            case 0:
                e0 e0Var = (e0) obj;
                if (this.f3678b) {
                    this.f3678b = false;
                } else if (((Float) e0Var.f3716z.getAnimatedValue()).floatValue() != 0.0f) {
                    e0Var.A = 2;
                    e0Var.f3709s.invalidate();
                } else {
                    e0Var.A = 0;
                    e0Var.i(0);
                }
                break;
            case 1:
                l20.o oVar = (l20.o) obj;
                EditText editText = oVar.f26827j;
                boolean z11 = this.f3678b;
                l20.o.a(oVar, z11 ? 1.0f : 0.0f);
                editText.setAlpha(1.0f);
                SearchBar searchBar = oVar.f26832p;
                if (searchBar != null) {
                    searchBar.getTextView().setAlpha(1.0f);
                }
                editText.setClipBounds(null);
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = oVar.f26820c;
                clippableRoundedCornerLayout.f12501a = null;
                clippableRoundedCornerLayout.f12502b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
                clippableRoundedCornerLayout.invalidate();
                if (!z11) {
                    oVar.f26830n.l = null;
                }
                break;
            case 2:
                androidx.appcompat.widget.b bVar = (androidx.appcompat.widget.b) obj;
                if (!this.f3678b) {
                    bVar.setVisibility(0);
                    break;
                }
                break;
            default:
                if (!this.f3678b) {
                    ((View) obj).setVisibility(4);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f3677a) {
            case 1:
                l20.o.a((l20.o) this.f3679c, this.f3678b ? 0.0f : 1.0f);
                break;
            case 2:
                ((androidx.appcompat.widget.b) this.f3679c).setVisibility(0);
                this.f3678b = false;
                break;
            case 3:
                if (this.f3678b) {
                    ((View) this.f3679c).setVisibility(0);
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public c0(View view, boolean z11) {
        this.f3677a = 3;
        this.f3678b = z11;
        this.f3679c = view;
    }

    public c0(l20.o oVar, boolean z11) {
        this.f3677a = 1;
        this.f3679c = oVar;
        this.f3678b = z11;
    }
}
