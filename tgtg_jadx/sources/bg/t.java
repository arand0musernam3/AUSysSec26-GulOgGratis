package bg;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.tgtg.customview.ExpandableTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.timepicker.ClockHandView;
import h7.e1;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6232b;

    public /* synthetic */ t(e1 e1Var, View view) {
        this.f6231a = 5;
        this.f6232b = e1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i11 = this.f6231a;
        Object obj = this.f6232b;
        switch (i11) {
            case 0:
                ExpandableTextView expandableTextView = (ExpandableTextView) obj;
                int i12 = ExpandableTextView.f8892m;
                valueAnimator.getClass();
                ViewGroup.LayoutParams layoutParams = expandableTextView.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = expandableTextView.getLayoutParams();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                layoutParams2.height = ((Integer) animatedValue).intValue();
                expandableTextView.setLayoutParams(layoutParams);
                break;
            case 1:
                valueAnimator.getClass();
                ConstraintLayout constraintLayout = ((dn.f) obj).f14994a.f34816t;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                constraintLayout.setBackgroundColor(((Integer) animatedValue2).intValue());
                break;
            case 2:
                fn.t tVar = (fn.t) obj;
                valueAnimator.getClass();
                pg.o0 o0Var = tVar.f17859s;
                o0Var.getClass();
                RecyclerView recyclerView = o0Var.f35016b;
                pg.o0 o0Var2 = tVar.f17859s;
                o0Var2.getClass();
                int paddingLeft = o0Var2.f35016b.getPaddingLeft();
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                animatedValue3.getClass();
                int iIntValue = ((Integer) animatedValue3).intValue();
                pg.o0 o0Var3 = tVar.f17859s;
                o0Var3.getClass();
                recyclerView.setPadding(paddingLeft, iIntValue, o0Var3.f35016b.getPaddingRight(), tVar.f17855o);
                pg.o0 o0Var4 = tVar.f17859s;
                o0Var4.getClass();
                o0Var4.f35016b.j0(0);
                break;
            case 3:
                ((ClippableRoundedCornerLayout) obj).a(r4.getLeft(), r4.getTop(), r4.getRight(), r4.getBottom(), (float[]) valueAnimator.getAnimatedValue());
                break;
            case 4:
                ((DrawerLayout) obj).setScrimColor(x6.c.e(-1728053248, k10.a.c(h20.c.f21260a, valueAnimator.getAnimatedFraction(), 0)));
                break;
            case 5:
                ((View) ((androidx.appcompat.app.c) ((lz.i) ((e1) obj)).f28446b).f1817d.getParent()).invalidate();
                break;
            case 6:
                he.z zVar = (he.z) obj;
                he.a aVar = zVar.M;
                if (aVar == null) {
                    aVar = he.e.f21898a;
                }
                if (aVar == he.a.ENABLED) {
                    zVar.invalidateSelf();
                } else {
                    re.d dVar = zVar.f21995p;
                    if (dVar != null) {
                        dVar.r(zVar.f21982b.a());
                    }
                }
                break;
            case 7:
                i20.l lVar = (i20.l) obj;
                lVar.f23014q.f23040e = lVar.f23019v.getInterpolation(lVar.f23018u.getAnimatedFraction());
                break;
            case 8:
                ((m.a) obj).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                ((e20.f) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 10:
                l20.o oVar = (l20.o) obj;
                oVar.f26827j.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                oVar.f26832p.getTextView().setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                ((ImageButton) obj).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 12:
                p20.e eVar = (p20.e) obj;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (x20.a aVar2 : eVar.l) {
                    aVar2.X = fFloatValue;
                    aVar2.Y = fFloatValue;
                    aVar2.t0 = k10.a.b(0.0f, 1.0f, 0.19f, 1.0f, fFloatValue);
                    aVar2.invalidateSelf();
                }
                eVar.postInvalidateOnAnimation();
                break;
            case 13:
                q10.d dVar2 = (q10.d) obj;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar2.f35890j.setAlpha((int) (255.0f * fFloatValue2));
                dVar2.f35903x = fFloatValue2;
                break;
            case 14:
                ((t20.i) obj).f39723d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                int i13 = uk.q.f41347y;
                valueAnimator.getClass();
                BottomSheetBehavior bottomSheetBehavior = ((uk.q) obj).f41366t;
                if (bottomSheetBehavior != null) {
                    Object animatedValue4 = valueAnimator.getAnimatedValue();
                    animatedValue4.getClass();
                    bottomSheetBehavior.I(((Integer) animatedValue4).intValue());
                }
                break;
            case 16:
                int i14 = ClockHandView.f12708q;
                ((ClockHandView) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                valueAnimator.getClass();
                BottomSheetBehavior bottomSheetBehavior2 = ((yi.r) obj).f46021m;
                if (bottomSheetBehavior2 != null) {
                    Object animatedValue5 = valueAnimator.getAnimatedValue();
                    animatedValue5.getClass();
                    bottomSheetBehavior2.I(((Integer) animatedValue5).intValue());
                }
                break;
        }
    }

    public /* synthetic */ t(Object obj, int i11) {
        this.f6231a = i11;
        this.f6232b = obj;
    }
}
