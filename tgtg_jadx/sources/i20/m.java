package i20;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f23023b;

    public /* synthetic */ m(n nVar, int i11) {
        this.f23022a = i11;
        this.f23023b = nVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f23022a) {
            case 1:
                super.onAnimationEnd(animator);
                n nVar = this.f23023b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = nVar.f23031g;
                if (arrayList != null && !nVar.f23032h) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((androidx.vectordrawable.graphics.drawable.c) it.next()).onAnimationEnd(nVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f23022a) {
            case 0:
                super.onAnimationStart(animator);
                n nVar = this.f23023b;
                ArrayList arrayList = nVar.f23031g;
                if (arrayList != null && !nVar.f23032h) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((androidx.vectordrawable.graphics.drawable.c) it.next()).onAnimationStart(nVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
