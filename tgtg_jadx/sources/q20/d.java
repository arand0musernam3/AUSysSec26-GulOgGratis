package q20;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.util.Log;
import android.view.ViewGroup;
import e20.i0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f35911b;

    public /* synthetic */ d(g gVar, int i11) {
        this.f35910a = i11;
        this.f35911b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = this.f35910a;
        g gVar = this.f35911b;
        int i12 = 2;
        int i13 = 1;
        switch (i11) {
            case 0:
                f fVar = gVar.f35938i;
                if (fVar != null) {
                    int iHeight = i0.j(gVar.f35937h).height();
                    int[] iArr = new int[2];
                    fVar.getLocationInWindow(iArr);
                    int height = (iHeight - (fVar.getHeight() + iArr[1])) + ((int) fVar.getTranslationY());
                    int i14 = gVar.f35944p;
                    if (height < i14) {
                        ViewGroup.LayoutParams layoutParams = fVar.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            Log.w(g.f35929z, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        } else {
                            int i15 = gVar.f35944p;
                            gVar.f35945q = i15;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i15 - height) + marginLayoutParams.bottomMargin;
                            fVar.requestLayout();
                        }
                    } else {
                        gVar.f35945q = i14;
                    }
                }
                break;
            case 1:
                gVar.c();
                break;
            default:
                f fVar2 = gVar.f35938i;
                if (fVar2 != null) {
                    int i16 = 0;
                    if (fVar2.getParent() != null) {
                        fVar2.setVisibility(0);
                    }
                    if (fVar2.getAnimationMode() != 1) {
                        int height2 = fVar2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = fVar2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height2 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        fVar2.setTranslationY(height2);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height2, 0);
                        valueAnimator.setInterpolator(gVar.f35934e);
                        valueAnimator.setDuration(gVar.f35932c);
                        valueAnimator.addListener(new a(gVar, i13));
                        valueAnimator.addUpdateListener(new b(gVar, i12));
                        valueAnimator.start();
                    } else {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(gVar.f35933d);
                        valueAnimatorOfFloat.addUpdateListener(new b(gVar, i16));
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(gVar.f35935f);
                        valueAnimatorOfFloat2.addUpdateListener(new b(gVar, i13));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.setDuration(gVar.f35930a);
                        animatorSet.addListener(new a(gVar, 3));
                        animatorSet.start();
                    }
                    break;
                }
                break;
        }
    }
}
