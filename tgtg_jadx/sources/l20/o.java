package l20;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.c0;
import bg.t;
import c50.w;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;
import e20.a0;
import e20.i0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchView f26818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f26819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f26820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f26821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout f26822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MaterialToolbar f26823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Toolbar f26824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinearLayout f26825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f26826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final EditText f26827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageButton f26828k;
    public final View l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TouchObserverFrameLayout f26829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g20.i f26830n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AnimatorSet f26831o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SearchBar f26832p;

    public o(SearchView searchView) {
        this.f26818a = searchView;
        this.f26819b = searchView.f12555a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.f12556b;
        this.f26820c = clippableRoundedCornerLayout;
        this.f26821d = searchView.f12559e;
        this.f26822e = searchView.f12560f;
        this.f26823f = searchView.f12561g;
        this.f26824g = searchView.f12562h;
        this.f26826i = searchView.f12563i;
        this.f26827j = searchView.f12565k;
        this.f26828k = searchView.l;
        this.l = searchView.f12566m;
        this.f26829m = searchView.f12567n;
        this.f26825h = searchView.f12564j;
        this.f26830n = new g20.i(clippableRoundedCornerLayout);
    }

    public static void a(o oVar, float f11) {
        ActionMenuView actionMenuViewH;
        oVar.f26828k.setAlpha(f11);
        oVar.l.setAlpha(f11);
        oVar.f26829m.setAlpha(f11);
        if (!oVar.f26818a.f12577x || (actionMenuViewH = i0.h(oVar.f26823f)) == null) {
            return;
        }
        actionMenuViewH.setAlpha(f11);
    }

    public static AnimatorSet h(boolean z11, View view, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i11, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new e20.k(new w(23), new View[]{view}));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(i12, 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(e20.k.a(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(z11 ? 300L : 250L);
        animatorSet.setInterpolator(a0.a(z11, k10.a.f25731b));
        return animatorSet;
    }

    public final void b(AnimatorSet animatorSet) {
        ImageButton imageButtonK = i0.k(this.f26823f);
        if (imageButtonK == null) {
            return;
        }
        Drawable drawable = imageButtonK.getDrawable();
        if (!this.f26818a.f12576w) {
            if (drawable instanceof m.a) {
                ((m.a) drawable).setProgress(1.0f);
            }
            if (drawable instanceof e20.f) {
                ((e20.f) drawable).a(1.0f);
                return;
            }
            return;
        }
        if (drawable instanceof m.a) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new t((m.a) drawable, 8));
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
        if (drawable instanceof e20.f) {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new t((e20.f) drawable, 9));
            animatorSet.playTogether(valueAnimatorOfFloat2);
        }
        SearchBar searchBar = this.f26832p;
        if (searchBar == null || searchBar.getNavigationIcon() != null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.addUpdateListener(new t(imageButtonK, 11));
        animatorSet.playTogether(valueAnimatorOfFloat3);
    }

    public final AnimatorSet c(boolean z11) {
        AnimatorSet animatorSet = new AnimatorSet();
        MaterialToolbar materialToolbar = this.f26823f;
        ImageButton imageButtonK = i0.k(materialToolbar);
        int i11 = 23;
        if (imageButtonK != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(j(i0.k(this.f26832p), imageButtonK), 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new e20.k(new w(i11), new View[]{imageButtonK}));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f(), 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(e20.k.a(imageButtonK));
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        }
        ActionMenuView actionMenuViewH = i0.h(materialToolbar);
        if (actionMenuViewH != null) {
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(j(i0.h(this.f26832p), actionMenuViewH), 0.0f);
            valueAnimatorOfFloat3.addUpdateListener(new e20.k(new w(i11), new View[]{actionMenuViewH}));
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(f(), 0.0f);
            valueAnimatorOfFloat4.addUpdateListener(e20.k.a(actionMenuViewH));
            animatorSet.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4);
        }
        animatorSet.setDuration(z11 ? 300L : 250L);
        animatorSet.setInterpolator(a0.a(z11, k10.a.f25731b));
        return animatorSet;
    }

    public final AnimatorSet d(boolean z11) {
        EditText editText;
        Animator animator;
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.f26831o == null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            b(animatorSet2);
            animatorSet2.setDuration(z11 ? 300L : 250L);
            animatorSet2.setInterpolator(a0.a(z11, k10.a.f25731b));
            animatorSet.playTogether(animatorSet2, c(z11));
        }
        TimeInterpolator timeInterpolator = z11 ? k10.a.f25730a : k10.a.f25731b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z11 ? 300L : 250L);
        valueAnimatorOfFloat.setStartDelay(z11 ? 100L : 0L);
        valueAnimatorOfFloat.setInterpolator(a0.a(z11, timeInterpolator));
        valueAnimatorOfFloat.addUpdateListener(new e20.k(new w(26), new View[]{this.f26819b}));
        g20.i iVar = this.f26830n;
        Rect rect = iVar.f18291j;
        Rect rectB = iVar.f18292k;
        SearchView searchView = this.f26818a;
        if (rect == null) {
            rect = new Rect(searchView.getLeft(), searchView.getTop(), searchView.getRight(), searchView.getBottom());
        }
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f26820c;
        if (rectB == null) {
            rectB = i0.b(clippableRoundedCornerLayout, this.f26832p);
        }
        final Rect rect2 = new Rect(rectB);
        final float cornerSize = this.f26832p.getCornerSize();
        float[] cornerRadii = clippableRoundedCornerLayout.getCornerRadii();
        float[] fArrC = iVar.c();
        final float[] fArr = {Math.max(cornerRadii[0], fArrC[0]), Math.max(cornerRadii[1], fArrC[1]), Math.max(cornerRadii[2], fArrC[2]), Math.max(cornerRadii[3], fArrC[3]), Math.max(cornerRadii[4], fArrC[4]), Math.max(cornerRadii[5], fArrC[5]), Math.max(cornerRadii[6], fArrC[6]), Math.max(cornerRadii[7], fArrC[7])};
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new c20.n(rect2), rectB, rect);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l20.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float[] fArr2 = fArr;
                float f11 = fArr2[0];
                float f12 = cornerSize;
                float[] fArr3 = {k10.a.a(f12, f11, animatedFraction), k10.a.a(f12, fArr2[1], animatedFraction), k10.a.a(f12, fArr2[2], animatedFraction), k10.a.a(f12, fArr2[3], animatedFraction), k10.a.a(f12, fArr2[4], animatedFraction), k10.a.a(f12, fArr2[5], animatedFraction), k10.a.a(f12, fArr2[6], animatedFraction), k10.a.a(f12, fArr2[7], animatedFraction)};
                ClippableRoundedCornerLayout clippableRoundedCornerLayout2 = this.f26812a.f26820c;
                clippableRoundedCornerLayout2.getClass();
                Rect rect3 = rect2;
                clippableRoundedCornerLayout2.a(rect3.left, rect3.top, rect3.right, rect3.bottom, fArr3);
            }
        });
        valueAnimatorOfObject.setDuration(z11 ? 300L : 250L);
        u8.a aVar = k10.a.f25731b;
        valueAnimatorOfObject.setInterpolator(a0.a(z11, aVar));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(z11 ? 50L : 42L);
        valueAnimatorOfFloat2.setStartDelay(z11 ? 250L : 0L);
        LinearInterpolator linearInterpolator = k10.a.f25730a;
        valueAnimatorOfFloat2.setInterpolator(a0.a(z11, linearInterpolator));
        valueAnimatorOfFloat2.addUpdateListener(new e20.k(new w(26), new View[]{this.f26828k}));
        AnimatorSet animatorSet3 = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.setDuration(z11 ? 150L : 83L);
        valueAnimatorOfFloat3.setStartDelay(z11 ? 75L : 0L);
        valueAnimatorOfFloat3.setInterpolator(a0.a(z11, linearInterpolator));
        View view = this.l;
        TouchObserverFrameLayout touchObserverFrameLayout = this.f26829m;
        valueAnimatorOfFloat3.addUpdateListener(new e20.k(new w(26), new View[]{view, touchObserverFrameLayout}));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat((touchObserverFrameLayout.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        valueAnimatorOfFloat4.setDuration(z11 ? 300L : 250L);
        valueAnimatorOfFloat4.setInterpolator(a0.a(z11, aVar));
        valueAnimatorOfFloat4.addUpdateListener(e20.k.a(view));
        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.95f, 1.0f);
        valueAnimatorOfFloat5.setDuration(z11 ? 300L : 250L);
        valueAnimatorOfFloat5.setInterpolator(a0.a(z11, aVar));
        valueAnimatorOfFloat5.addUpdateListener(new e20.k(new w(25), new View[]{touchObserverFrameLayout}));
        animatorSet3.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4, valueAnimatorOfFloat5);
        View view2 = this.f26821d;
        Animator animatorH = h(z11, view2, e(view2), f());
        Toolbar toolbar = this.f26824g;
        Animator animatorH2 = h(z11, toolbar, e(toolbar), f());
        ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat6.setDuration(z11 ? 300L : 250L);
        valueAnimatorOfFloat6.setInterpolator(a0.a(z11, aVar));
        if (searchView.f12577x) {
            valueAnimatorOfFloat6.addUpdateListener(new e20.g(i0.h(toolbar), i0.h(this.f26823f)));
        }
        EditText editText2 = this.f26827j;
        Animator animatorI = i(editText2, z11);
        Animator animatorI2 = i(this.f26826i, z11);
        AnimatorSet animatorSet4 = new AnimatorSet();
        if (this.f26832p == null || TextUtils.equals(editText2.getText(), this.f26832p.getText())) {
            editText = editText2;
        } else {
            ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(0.0f, 1.0f);
            editText = editText2;
            valueAnimatorOfFloat7.addUpdateListener(new t(this, 10));
            animatorSet4.playTogether(valueAnimatorOfFloat7);
        }
        if (this.f26832p == null || !TextUtils.equals(editText.getText(), this.f26832p.getText())) {
            animator = animatorH;
        } else {
            animator = animatorH;
            Rect rect3 = new Rect(0, 0, editText.getWidth(), editText.getHeight());
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f26832p.getTextView().getWidth(), editText.getWidth());
            valueAnimatorOfInt.addUpdateListener(new com.braze.ui.inappmessage.listeners.b(3, this, rect3));
            animatorSet4.playTogether(valueAnimatorOfInt);
        }
        animatorSet4.setDuration(z11 ? 300L : 250L);
        animatorSet4.setInterpolator(a0.a(z11, linearInterpolator));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfObject, valueAnimatorOfFloat2, animatorSet3, animator, animatorH2, valueAnimatorOfFloat6, animatorI, animatorI2, animatorSet4);
        animatorSet.addListener(new c0(this, z11));
        return animatorSet;
    }

    public final int e(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        int iK = k(this.f26832p);
        return this.f26832p.getLayoutDirection() == 1 ? iK - marginEnd : ((this.f26832p.getWidth() + iK) + marginEnd) - this.f26818a.getWidth();
    }

    public final int f() {
        FrameLayout frameLayout = this.f26822e;
        int height = (frameLayout.getHeight() / 2) + frameLayout.getTop();
        SearchBar searchBar = this.f26832p;
        int top = searchBar.getTop();
        for (ViewParent parent = searchBar.getParent(); (parent instanceof View) && parent != this.f26818a.getParent(); parent = parent.getParent()) {
            top += ((View) parent).getTop();
        }
        return ((this.f26832p.getHeight() / 2) + top) - height;
    }

    public final AnimatorSet g(boolean z11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f26820c;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getHeight(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(e20.k.a(clippableRoundedCornerLayout));
        animatorSet.playTogether(valueAnimatorOfFloat);
        b(animatorSet);
        animatorSet.setInterpolator(a0.a(z11, k10.a.f25731b));
        animatorSet.setDuration(z11 ? 350L : 300L);
        return animatorSet;
    }

    public final AnimatorSet i(View view, boolean z11) {
        TextView placeholderTextView = this.f26832p.getPlaceholderTextView();
        if (TextUtils.isEmpty(placeholderTextView.getText()) || z11) {
            placeholderTextView = this.f26832p.getTextView();
        }
        return h(z11, view, k(placeholderTextView) - (this.f26825h.getLeft() + view.getLeft()), f());
    }

    public final int j(View view, View view2) {
        if (view != null) {
            return k(view) - k(view2);
        }
        int marginStart = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).getMarginStart();
        int paddingStart = this.f26832p.getPaddingStart();
        int iK = k(this.f26832p);
        return this.f26832p.getLayoutDirection() == 1 ? (((this.f26832p.getWidth() + iK) + marginStart) - paddingStart) - this.f26818a.getRight() : (iK - marginStart) + paddingStart;
    }

    public final int k(View view) {
        int left = view.getLeft();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.f26818a.getParent(); parent = parent.getParent()) {
            left += ((View) parent).getLeft();
        }
        return left;
    }

    public final AnimatorSet l() {
        SearchBar searchBar = this.f26832p;
        SearchView searchView = this.f26818a;
        if (searchBar != null) {
            if (searchView.h()) {
                searchView.f();
            }
            AnimatorSet animatorSetD = d(false);
            animatorSetD.addListener(new n(this, 1));
            animatorSetD.start();
            return animatorSetD;
        }
        if (searchView.h()) {
            searchView.f();
        }
        AnimatorSet animatorSetG = g(false);
        animatorSetG.addListener(new n(this, 3));
        animatorSetG.start();
        return animatorSetG;
    }
}
