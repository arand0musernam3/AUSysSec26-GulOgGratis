package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.app.tgtg.customview.ExpandableTextView;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import e20.i0;
import h7.d1;
import i20.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.iana.AEADAlgorithm;
import qa.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4040b;

    public e(d1 d1Var, View view) {
        this.f4039a = 6;
        this.f4040b = d1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f4039a) {
            case 2:
                ((c20.b) this.f4040b).d();
                break;
            case 6:
                ((d1) this.f4040b).a();
                break;
            case 11:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f4040b;
                actionBarOverlayLayout.f1982w = null;
                actionBarOverlayLayout.f1970j = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f4039a) {
            case 0:
                h hVar = (h) this.f4040b;
                ArrayList arrayList = new ArrayList(hVar.f4050e);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((c) arrayList.get(i11)).onAnimationEnd(hVar);
                }
                break;
            case 1:
                animator.getClass();
                super.onAnimationEnd(animator);
                ExpandableTextView expandableTextView = (ExpandableTextView) this.f4040b;
                expandableTextView.setText(expandableTextView.getCollapsed() ? expandableTextView.f8902j : expandableTextView.getOriginalText());
                ViewGroup.LayoutParams layoutParams = expandableTextView.getLayoutParams();
                expandableTextView.getLayoutParams().height = -2;
                expandableTextView.setLayoutParams(layoutParams);
                break;
            case 2:
                ((c20.b) this.f4040b).e();
                break;
            case 3:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f4040b;
                bottomSheetBehavior.K(5);
                WeakReference weakReference = bottomSheetBehavior.Z;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.Z.get()).requestLayout();
                    break;
                }
                break;
            case 4:
                g20.g gVar = (g20.g) this.f4040b;
                gVar.f18275b.setTranslationY(0.0f);
                gVar.c(0.0f);
                break;
            case 5:
                View view = (View) this.f4040b;
                if (view != null) {
                    view.setVisibility(0);
                }
                break;
            case 6:
                ((d1) this.f4040b).c();
                break;
            case 7:
            default:
                super.onAnimationEnd(animator);
                break;
            case 8:
                ((HideBottomViewOnScrollBehavior) this.f4040b).l = null;
                break;
            case 9:
                ((HideViewOnScrollBehavior) this.f4040b).f12274k = null;
                break;
            case 10:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f4040b;
                sideSheetBehavior.x(5);
                WeakReference weakReference2 = sideSheetBehavior.f12594p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.f12594p.get()).requestLayout();
                    break;
                }
                break;
            case 11:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f4040b;
                actionBarOverlayLayout.f1982w = null;
                actionBarOverlayLayout.f1970j = false;
                break;
            case 12:
                super.onAnimationEnd(animator);
                p20.e eVar = (p20.e) this.f4040b;
                ViewGroup viewGroupI = i0.i(eVar);
                ViewOverlay overlay = viewGroupI == null ? null : viewGroupI.getOverlay();
                if (overlay != null) {
                    Iterator it = eVar.l.iterator();
                    while (it.hasNext()) {
                        overlay.remove((x20.a) it.next());
                    }
                    break;
                }
                break;
            case 13:
                ((y) this.f4040b).o();
                animator.removeListener(this);
                break;
            case 14:
                t20.i iVar = (t20.i) this.f4040b;
                iVar.p();
                iVar.f39695r.start();
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((ExpandableTransformationBehavior) this.f4040b).f12730b = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f4039a) {
            case 7:
                super.onAnimationRepeat(animator);
                t tVar = (t) this.f4040b;
                tVar.f23068f = (tVar.f23068f + 1) % tVar.f23067e.f22957e.length;
                tVar.f23069g = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f4039a) {
            case 0:
                h hVar = (h) this.f4040b;
                ArrayList arrayList = new ArrayList(hVar.f4050e);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((c) arrayList.get(i11)).onAnimationStart(hVar);
                }
                break;
            case 1:
                animator.getClass();
                super.onAnimationStart(animator);
                ExpandableTextView expandableTextView = (ExpandableTextView) this.f4040b;
                expandableTextView.f8897e = !expandableTextView.getCollapsed();
                expandableTextView.setText(expandableTextView.getOriginalText());
                break;
            case 2:
                ((c20.b) this.f4040b).f(animator);
                break;
            case 3:
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                break;
            case 6:
                ((d1) this.f4040b).b();
                break;
        }
    }

    public /* synthetic */ e(Object obj, int i11) {
        this.f4039a = i11;
        this.f4040b = obj;
    }
}
