package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.app.e;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.app.tgtg.R;
import h0.g;
import java.util.Arrays;
import s6.f;
import w20.a;
import w20.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class ClockFaceView extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ClockHandView f12694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f12695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f12696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f12697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseArray f12698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f12699i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f12700j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f12701k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f12702m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f12703n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f12704o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String[] f12705p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f12706q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ColorStateList f12707r;

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f12695e = new Rect();
        this.f12696f = new RectF();
        this.f12697g = new Rect();
        this.f12698h = new SparseArray();
        this.f12701k = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j10.a.l, i11, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        int i12 = 1;
        ColorStateList colorStateListP = g.p(context, typedArrayObtainStyledAttributes, 1);
        this.f12707r = colorStateListP;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f12694d = clockHandView;
        this.l = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListP.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListP.getDefaultColor());
        this.f12700j = new int[]{colorForState, colorForState, colorStateListP.getDefaultColor()};
        clockHandView.f12714f.add(this);
        int defaultColor = e.b(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListP2 = g.p(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListP2 != null ? colorStateListP2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new f(this, i12));
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.f12699i = new a(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        setValues(strArr, 0);
        this.f12702m = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f12703n = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f12704o = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // w20.d
    public final void j() {
        super.j();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f12698h;
            if (i11 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i11)).setVisibility(0);
            i11++;
        }
    }

    public final void k() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.f12694d.f12718j;
        float f11 = Float.MAX_VALUE;
        TextView textView = null;
        int i11 = 0;
        while (true) {
            sparseArray = this.f12698h;
            int size = sparseArray.size();
            rect = this.f12695e;
            rectF = this.f12696f;
            if (i11 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i11);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f11) {
                    textView = textView2;
                    f11 = fHeight;
                }
            }
            i11++;
        }
        for (int i12 = 0; i12 < sparseArray.size(); i12++) {
            TextView textView3 = (TextView) sparseArray.get(i12);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f12697g);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f12700j, this.f12701k, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.Z0(accessibilityNodeInfo).j0(i7.d.a(1, this.f12705p.length, 1, false));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        k();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f12704o / Math.max(Math.max(this.f12702m / displayMetrics.heightPixels, this.f12703n / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public void setHandRotation(float f11) {
        this.f12694d.setHandRotation(f11);
        k();
    }

    @Override // w20.d
    public void setRadius(int i11) {
        if (i11 != this.f43089b) {
            super.setRadius(i11);
            this.f12694d.setCircleRadius(this.f43089b);
        }
    }

    public void setValues(String[] strArr, int i11) {
        this.f12705p = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        SparseArray sparseArray = this.f12698h;
        int size = sparseArray.size();
        boolean z11 = false;
        for (int i12 = 0; i12 < Math.max(this.f12705p.length, size); i12++) {
            TextView textView = (TextView) sparseArray.get(i12);
            if (i12 >= this.f12705p.length) {
                removeView(textView);
                sparseArray.remove(i12);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i12, textView);
                    addView(textView);
                }
                textView.setText(this.f12705p[i12]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i12));
                int i13 = (i12 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i13));
                if (i13 > 1) {
                    z11 = true;
                }
                ViewCompat.b0(textView, this.f12699i);
                textView.setTextColor(this.f12707r);
                if (i11 != 0) {
                    textView.setContentDescription(getResources().getString(i11, this.f12705p[i12]));
                }
            }
        }
        ClockHandView clockHandView = this.f12694d;
        if (clockHandView.f12713e && !z11) {
            clockHandView.f12723p = 1;
        }
        clockHandView.f12713e = z11;
        clockHandView.invalidate();
    }

    public ClockFaceView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockFaceView(@NonNull Context context) {
        this(context, null);
    }
}
