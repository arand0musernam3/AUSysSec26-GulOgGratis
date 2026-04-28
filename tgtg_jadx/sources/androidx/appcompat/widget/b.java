package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.c0;
import com.app.tgtg.R;
import p.f2;
import p.g2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class b extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p.f f2143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayoutCompat f2144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppCompatSpinner f2145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2150h;

    static {
        new DecelerateInterpolator();
    }

    public b(@NonNull Context context) {
        super(context);
        new c0(this, 2);
        setHorizontalScrollBarEnabled(false);
        androidx.appcompat.view.a aVarA = androidx.appcompat.view.a.a(context);
        setContentHeight(aVarA.c());
        this.f2148f = aVarA.f1840a.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
        this.f2144b = linearLayoutCompat;
        addView(linearLayoutCompat, new ViewGroup.LayoutParams(-2, -1));
    }

    public final void a() {
        AppCompatSpinner appCompatSpinner = this.f2145c;
        if (appCompatSpinner == null || appCompatSpinner.getParent() != this) {
            return;
        }
        removeView(this.f2145c);
        addView(this.f2144b, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f2145c.getSelectedItemPosition());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p.f fVar = this.f2143a;
        if (fVar != null) {
            post(fVar);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.view.a aVarA = androidx.appcompat.view.a.a(getContext());
        setContentHeight(aVarA.c());
        this.f2148f = aVarA.f1840a.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p.f fVar = this.f2143a;
        if (fVar != null) {
            removeCallbacks(fVar);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i11, long j9) {
        ((g2) view).getClass();
        throw null;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        boolean z11 = mode == 1073741824;
        setFillViewport(z11);
        LinearLayoutCompat linearLayoutCompat = this.f2144b;
        int childCount = linearLayoutCompat.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f2147e = -1;
        } else {
            if (childCount > 2) {
                this.f2147e = (int) (View.MeasureSpec.getSize(i11) * 0.4f);
            } else {
                this.f2147e = View.MeasureSpec.getSize(i11) / 2;
            }
            this.f2147e = Math.min(this.f2147e, this.f2148f);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f2149g, 1073741824);
        if (z11 || !this.f2146d) {
            a();
        } else {
            linearLayoutCompat.measure(0, iMakeMeasureSpec);
            if (linearLayoutCompat.getMeasuredWidth() > View.MeasureSpec.getSize(i11)) {
                AppCompatSpinner appCompatSpinner = this.f2145c;
                if (appCompatSpinner == null || appCompatSpinner.getParent() != this) {
                    if (this.f2145c == null) {
                        AppCompatSpinner appCompatSpinner2 = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
                        appCompatSpinner2.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
                        appCompatSpinner2.setOnItemSelectedListener(this);
                        this.f2145c = appCompatSpinner2;
                    }
                    removeView(linearLayoutCompat);
                    addView(this.f2145c, new ViewGroup.LayoutParams(-2, -1));
                    if (this.f2145c.getAdapter() == null) {
                        this.f2145c.setAdapter((SpinnerAdapter) new f2(this));
                    }
                    Runnable runnable = this.f2143a;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                        this.f2143a = null;
                    }
                    this.f2145c.setSelection(this.f2150h);
                }
            } else {
                a();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i11, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z11 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f2150h);
    }

    public void setAllowCollapse(boolean z11) {
        this.f2146d = z11;
    }

    public void setContentHeight(int i11) {
        this.f2149g = i11;
        requestLayout();
    }

    public void setTabSelected(int i11) {
        this.f2150h = i11;
        LinearLayoutCompat linearLayoutCompat = this.f2144b;
        int childCount = linearLayoutCompat.getChildCount();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = linearLayoutCompat.getChildAt(i12);
            boolean z11 = i12 == i11;
            childAt.setSelected(z11);
            if (z11) {
                View childAt2 = linearLayoutCompat.getChildAt(i11);
                Runnable runnable = this.f2143a;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                p.f fVar = new p.f(1, this, childAt2);
                this.f2143a = fVar;
                post(fVar);
            }
            i12++;
        }
        AppCompatSpinner appCompatSpinner = this.f2145c;
        if (appCompatSpinner == null || i11 < 0) {
            return;
        }
        appCompatSpinner.setSelection(i11);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
