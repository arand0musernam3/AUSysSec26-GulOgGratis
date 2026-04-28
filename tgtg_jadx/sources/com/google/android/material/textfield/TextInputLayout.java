package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.app.e;
import androidx.core.view.ViewCompat;
import b0.a0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
import d40.t1;
import e20.c;
import e20.c0;
import e20.d;
import e20.g0;
import e20.i0;
import ex.i;
import f7.b;
import j30.g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import n20.j;
import n20.m;
import n20.n;
import n20.o;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p.e1;
import qa.h;
import qc.y;
import t20.f;
import t20.k;
import t20.l;
import t20.p;
import t20.s;
import t20.t;
import t20.u;
import t20.v;
import t20.w;
import v20.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] J1 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public int A1;
    public ColorStateList B;
    public boolean B1;
    public ColorStateList C;
    public final c C1;
    public boolean D;
    public boolean D1;
    public CharSequence E;
    public boolean E1;
    public boolean F;
    public ValueAnimator F1;
    public j G;
    public boolean G1;
    public j H;
    public boolean H1;
    public StateListDrawable I;
    public boolean I1;
    public boolean J;
    public j K;
    public j L;
    public o M;
    public boolean N;
    public final int O;
    public int P;
    public int Q;
    public int T;
    public int V;
    public int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f12642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f12643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f12644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EditText f12646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f12647f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final Rect f12648f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12649g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final Rect f12650g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12651h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f12652h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final RectF f12653h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12654i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public Typeface f12655i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12656j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public ColorDrawable f12657j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f12658k;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public int f12659k1;
    public boolean l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final LinkedHashSet f12660l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12661m;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public ColorDrawable f12662m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12663n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public int f12664n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v f12665o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public Drawable f12666o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AppCompatTextView f12667p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public ColorStateList f12668p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12669q;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public ColorStateList f12670q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12671r;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public int f12672r1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f12673s;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public int f12674s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12675t;
    public int t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public int f12676t1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AppCompatTextView f12677u;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public ColorStateList f12678u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f12679v;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public int f12680v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12681w;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public int f12682w1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h f12683x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public int f12684x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public h f12685y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public int f12686y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f12687z;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public int f12688z1;

    public TextInputLayout(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(a.a(context, attributeSet, i11, com.app.tgtg.R.style.Widget_Design_TextInputLayout), attributeSet, i11);
        this.f12649g = -1;
        this.f12651h = -1;
        this.f12654i = -1;
        this.f12656j = -1;
        this.f12658k = new p(this);
        this.f12665o = new y(10);
        this.f12648f1 = new Rect();
        this.f12650g1 = new Rect();
        this.f12653h1 = new RectF();
        this.f12660l1 = new LinkedHashSet();
        c cVar = new c(this);
        this.C1 = cVar;
        this.I1 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f12642a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = k10.a.f25730a;
        cVar.R = linearInterpolator;
        cVar.j(false);
        cVar.Q = linearInterpolator;
        cVar.j(false);
        if (cVar.f15603g != 8388659) {
            cVar.f15603g = 8388659;
            cVar.j(false);
        }
        g gVarN = i0.n(context2, attributeSet, j10.a.f24408c0, i11, com.app.tgtg.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        s sVar = new s(this, gVarN);
        this.f12643b = sVar;
        TypedArray typedArray = (TypedArray) gVarN.f24503c;
        this.D = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.E1 = typedArray.getBoolean(47, true);
        this.D1 = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.M = o.c(context2, attributeSet, i11, com.app.tgtg.R.style.Widget_Design_TextInputLayout).a();
        this.O = context2.getResources().getDimensionPixelOffset(com.app.tgtg.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.Q = typedArray.getDimensionPixelOffset(9, 0);
        this.f12645d = getResources().getDimensionPixelSize(com.app.tgtg.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.V = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.app.tgtg.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.W = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.app.tgtg.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.T = this.V;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        n nVarH = this.M.h();
        if (dimension >= 0.0f) {
            nVarH.f(dimension);
        }
        if (dimension2 >= 0.0f) {
            nVarH.g(dimension2);
        }
        if (dimension3 >= 0.0f) {
            nVarH.e(dimension3);
        }
        if (dimension4 >= 0.0f) {
            nVarH.d(dimension4);
        }
        this.M = nVarH.a();
        ColorStateList colorStateListQ = h0.g.q(context2, gVarN, 7);
        if (colorStateListQ != null) {
            int defaultColor = colorStateListQ.getDefaultColor();
            this.f12680v1 = defaultColor;
            this.t0 = defaultColor;
            if (colorStateListQ.isStateful()) {
                this.f12682w1 = colorStateListQ.getColorForState(new int[]{-16842910}, -1);
                this.f12684x1 = colorStateListQ.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f12686y1 = colorStateListQ.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f12684x1 = this.f12680v1;
                ColorStateList colorStateListB = e.b(context2, com.app.tgtg.R.color.mtrl_filled_background_color);
                this.f12682w1 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f12686y1 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.t0 = 0;
            this.f12680v1 = 0;
            this.f12682w1 = 0;
            this.f12684x1 = 0;
            this.f12686y1 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList colorStateListJ = gVarN.j(1);
            this.f12670q1 = colorStateListJ;
            this.f12668p1 = colorStateListJ;
        }
        ColorStateList colorStateListQ2 = h0.g.q(context2, gVarN, 14);
        this.f12676t1 = typedArray.getColor(14, 0);
        this.f12672r1 = context2.getColor(com.app.tgtg.R.color.mtrl_textinput_default_box_stroke_color);
        this.f12688z1 = context2.getColor(com.app.tgtg.R.color.mtrl_textinput_disabled_color);
        this.f12674s1 = context2.getColor(com.app.tgtg.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListQ2 != null) {
            setBoxStrokeColorStateList(colorStateListQ2);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(h0.g.q(context2, gVarN, 15));
        }
        if (typedArray.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(50, 0));
        }
        this.B = gVarN.j(24);
        this.C = gVarN.j(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i12 = typedArray.getInt(34, 1);
        boolean z11 = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z12 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(58, 0);
        CharSequence text3 = typedArray.getText(57);
        boolean z13 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.f12671r = typedArray.getResourceId(22, 0);
        this.f12669q = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i12);
        setCounterOverflowTextAppearance(this.f12669q);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f12671r);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(gVarN.j(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(gVarN.j(46));
        }
        if (typedArray.hasValue(51)) {
            setHintTextColor(gVarN.j(51));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(gVarN.j(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(gVarN.j(21));
        }
        if (typedArray.hasValue(59)) {
            setPlaceholderTextColor(gVarN.j(59));
        }
        l lVar = new l(this, gVarN);
        this.f12644c = lVar;
        boolean z14 = typedArray.getBoolean(0, true);
        setHintMaxLines(typedArray.getInt(49, 1));
        gVarN.v();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(sVar);
        frameLayout.addView(lVar);
        addView(frameLayout);
        setEnabled(z14);
        setHelperTextEnabled(z12);
        setErrorEnabled(z11);
        setCounterEnabled(z13);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f12646e;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.G;
        }
        int iY = w0.e.y(com.app.tgtg.R.attr.colorControlHighlight, this.f12646e);
        int i11 = this.P;
        int[][] iArr = J1;
        if (i11 != 2) {
            if (i11 != 1) {
                return null;
            }
            j jVar = this.G;
            int i12 = this.t0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{w0.e.E(iY, 0.1f, i12), i12}), jVar, jVar);
        }
        Context context = getContext();
        j jVar2 = this.G;
        TypedValue typedValueI = i.I(context, "TextInputLayout", com.app.tgtg.R.attr.colorSurface);
        int i13 = typedValueI.resourceId;
        int color = i13 != 0 ? context.getColor(i13) : typedValueI.data;
        j jVar3 = new j(jVar2.f30345b.f30318a);
        int iE = w0.e.E(iY, 0.1f, color);
        jVar3.t(new ColorStateList(iArr, new int[]{iE, 0}));
        jVar3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iE, color});
        j jVar4 = new j(jVar2.f30345b.f30318a);
        jVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, jVar3, jVar4), jVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.I == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.I = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.I.addState(new int[0], h(false));
        }
        return this.I;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.H == null) {
            this.H = h(true);
        }
        return this.H;
    }

    public static void m(ViewGroup viewGroup, boolean z11) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            childAt.setEnabled(z11);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z11);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f12646e != null) {
            i4.a.f("We already have an EditText, can only have one");
            return;
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f12646e = editText;
        int i11 = this.f12649g;
        if (i11 != -1) {
            setMinEms(i11);
        } else {
            setMinWidth(this.f12654i);
        }
        int i12 = this.f12651h;
        if (i12 != -1) {
            setMaxEms(i12);
        } else {
            setMaxWidth(this.f12656j);
        }
        this.J = false;
        k();
        setTextInputAccessibilityDelegate(new u(this));
        Typeface typeface = this.f12646e.getTypeface();
        c cVar = this.C1;
        cVar.n(typeface);
        float textSize = this.f12646e.getTextSize();
        if (cVar.f15605h != textSize) {
            cVar.f15605h = textSize;
            cVar.j(false);
        }
        float letterSpacing = this.f12646e.getLetterSpacing();
        if (cVar.X != letterSpacing) {
            cVar.X = letterSpacing;
            cVar.j(false);
        }
        int gravity = this.f12646e.getGravity();
        int i13 = (gravity & (-113)) | 48;
        if (cVar.f15603g != i13) {
            cVar.f15603g = i13;
            cVar.j(false);
        }
        if (cVar.f15601f != gravity) {
            cVar.f15601f = gravity;
            cVar.j(false);
        }
        this.A1 = editText.getMinimumHeight();
        this.f12646e.addTextChangedListener(new t(this, editText));
        if (this.f12668p1 == null) {
            this.f12668p1 = this.f12646e.getHintTextColors();
        }
        if (this.D) {
            if (TextUtils.isEmpty(this.E)) {
                CharSequence hint = this.f12646e.getHint();
                this.f12647f = hint;
                setHint(hint);
                this.f12646e.setHint((CharSequence) null);
            }
            this.F = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.f12667p != null) {
            p(this.f12646e.getText());
        }
        t();
        this.f12658k.b();
        this.f12643b.bringToFront();
        l lVar = this.f12644c;
        lVar.bringToFront();
        Iterator it = this.f12660l1.iterator();
        while (it.hasNext()) {
            ((k) it.next()).a(this);
        }
        lVar.l();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.E)) {
            return;
        }
        this.E = charSequence;
        c cVar = this.C1;
        if (charSequence == null || !TextUtils.equals(cVar.B, charSequence)) {
            cVar.B = charSequence;
            cVar.C = null;
            cVar.j(false);
        }
        if (this.B1) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z11) {
        if (this.f12675t == z11) {
            return;
        }
        AppCompatTextView appCompatTextView = this.f12677u;
        if (!z11) {
            if (appCompatTextView != null) {
                appCompatTextView.setVisibility(8);
            }
            this.f12677u = null;
        } else if (appCompatTextView != null) {
            this.f12642a.addView(appCompatTextView);
            this.f12677u.setVisibility(0);
        }
        this.f12675t = z11;
    }

    public final void a() {
        if (this.f12646e == null || this.P != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.f12646e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.C1.f() + this.f12645d), this.f12646e.getPaddingEnd(), getResources().getDimensionPixelSize(com.app.tgtg.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.f12646e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.app.tgtg.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f12646e.getPaddingEnd(), getResources().getDimensionPixelSize(com.app.tgtg.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (h0.g.w(getContext())) {
            EditText editText3 = this.f12646e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.app.tgtg.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f12646e.getPaddingEnd(), getResources().getDimensionPixelSize(com.app.tgtg.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i11, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f12642a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f11) {
        c cVar = this.C1;
        if (cVar.f15593b == f11) {
            return;
        }
        int i11 = 2;
        if (this.F1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.F1 = valueAnimator;
            valueAnimator.setInterpolator(ox.h.Q(getContext(), com.app.tgtg.R.attr.motionEasingEmphasizedInterpolator, k10.a.f25731b));
            this.F1.setDuration(ox.h.P(getContext(), com.app.tgtg.R.attr.motionDurationMedium4, 167));
            this.F1.addUpdateListener(new g0(i11, this));
        }
        this.F1.setFloatValues(cVar.f15593b, f11);
        this.F1.start();
    }

    public final void c() {
        int i11;
        int i12;
        j jVar = this.G;
        if (jVar == null) {
            return;
        }
        o oVar = jVar.f30345b.f30318a;
        o oVar2 = this.M;
        if (oVar != oVar2) {
            jVar.setShapeAppearanceModel(oVar2);
        }
        if (this.P == 2 && (i11 = this.T) > -1 && (i12 = this.f12652h0) != 0) {
            j jVar2 = this.G;
            jVar2.A(i11);
            jVar2.z(ColorStateList.valueOf(i12));
        }
        int iC = this.t0;
        if (this.P == 1) {
            iC = x6.c.c(this.t0, w0.e.z(getContext(), com.app.tgtg.R.attr.colorSurface, 0));
        }
        this.t0 = iC;
        this.G.t(ColorStateList.valueOf(iC));
        j jVar3 = this.K;
        if (jVar3 != null && this.L != null) {
            if (this.T > -1 && this.f12652h0 != 0) {
                jVar3.t(this.f12646e.isFocused() ? ColorStateList.valueOf(this.f12672r1) : ColorStateList.valueOf(this.f12652h0));
                this.L.t(ColorStateList.valueOf(this.f12652h0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.f12646e == null) {
            y.e();
            return null;
        }
        boolean z11 = getLayoutDirection() == 1;
        int i11 = rect.bottom;
        Rect rect2 = this.f12650g1;
        rect2.bottom = i11;
        int i12 = this.P;
        if (i12 == 1) {
            rect2.left = i(rect.left, z11);
            rect2.top = rect.top + this.Q;
            rect2.right = j(rect.right, z11);
            return rect2;
        }
        int i13 = rect.left;
        if (i12 != 2) {
            rect2.left = i(i13, z11);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z11);
            return rect2;
        }
        rect2.left = this.f12646e.getPaddingLeft() + i13;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.f12646e.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i11) {
        EditText editText = this.f12646e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i11);
            return;
        }
        if (this.f12647f != null) {
            boolean z11 = this.F;
            this.F = false;
            CharSequence hint = editText.getHint();
            this.f12646e.setHint(this.f12647f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i11);
                return;
            } finally {
                this.f12646e.setHint(hint);
                this.F = z11;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i11);
        onProvideAutofillVirtualStructure(viewStructure, i11);
        FrameLayout frameLayout = this.f12642a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i12 = 0; i12 < frameLayout.getChildCount(); i12++) {
            View childAt = frameLayout.getChildAt(i12);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i12);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i11);
            if (childAt == this.f12646e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.H1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.H1 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        j jVar;
        super.draw(canvas);
        boolean z11 = this.D;
        c cVar = this.C1;
        if (z11) {
            TextPaint textPaint = cVar.O;
            RectF rectF = cVar.f15599e;
            int iSave = canvas.save();
            if (cVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(cVar.G);
                float f11 = cVar.f15617q;
                float f12 = cVar.f15618r;
                float f13 = cVar.F;
                if (f13 != 1.0f) {
                    canvas.scale(f13, f13, f11, f12);
                }
                if ((cVar.f15600e0 > 1 || cVar.f15602f0 > 1) && !cVar.D && cVar.o()) {
                    float lineStart = cVar.f15617q - cVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas.translate(lineStart, f12);
                    float f14 = alpha;
                    textPaint.setAlpha((int) (cVar.f15596c0 * f14));
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 31) {
                        textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, w0.e.m(cVar.K, textPaint.getAlpha()));
                    }
                    cVar.Z.draw(canvas);
                    textPaint.setAlpha((int) (cVar.f15594b0 * f14));
                    if (i11 >= 31) {
                        textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, w0.e.m(cVar.K, textPaint.getAlpha()));
                    }
                    int lineBaseline = cVar.Z.getLineBaseline(0);
                    CharSequence charSequence = cVar.f15598d0;
                    float f15 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f15, textPaint);
                    if (i11 >= 31) {
                        textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, cVar.K);
                    }
                    String strTrim = cVar.f15598d0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(cVar.Z.getLineEnd(0), str.length()), 0.0f, f15, (Paint) textPaint);
                    canvas = canvas;
                } else {
                    canvas.translate(f11, f12);
                    cVar.Z.draw(canvas);
                }
                canvas.restoreToCount(iSave);
            }
        }
        if (this.L == null || (jVar = this.K) == null) {
            return;
        }
        jVar.draw(canvas);
        if (this.f12646e.isFocused()) {
            Rect bounds = this.L.getBounds();
            Rect bounds2 = this.K.getBounds();
            float f16 = cVar.f15593b;
            int iCenterX = bounds2.centerX();
            bounds.left = k10.a.c(iCenterX, f16, bounds2.left);
            bounds.right = k10.a.c(iCenterX, f16, bounds2.right);
            this.L.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.G1
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.G1 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            e20.c r3 = r4.C1
            if (r3 == 0) goto L2f
            r3.M = r1
            android.content.res.ColorStateList r1 = r3.f15611k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f15609j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.j(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f12646e
            if (r3 == 0) goto L45
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L41
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L41
            goto L42
        L41:
            r0 = r2
        L42:
            r4.w(r0, r2)
        L45:
            r4.t()
            r4.z()
            if (r1 == 0) goto L50
            r4.invalidate()
        L50:
            r4.G1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final int e() {
        if (this.D) {
            int i11 = this.P;
            c cVar = this.C1;
            if (i11 == 0) {
                return (int) cVar.f();
            }
            if (i11 == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (cVar.f() / 2.0f);
                }
                float f11 = cVar.f();
                TextPaint textPaint = cVar.P;
                textPaint.setTextSize(cVar.f15607i);
                textPaint.setTypeface(cVar.f15619s);
                textPaint.setLetterSpacing(cVar.W);
                return Math.max(0, (int) (f11 - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final h f() {
        h hVar = new h();
        hVar.f36751c = ox.h.P(getContext(), com.app.tgtg.R.attr.motionDurationShort2, 87);
        hVar.f36752d = ox.h.Q(getContext(), com.app.tgtg.R.attr.motionEasingLinearInterpolator, k10.a.f25730a);
        return hVar;
    }

    public final boolean g() {
        return this.D && !TextUtils.isEmpty(this.E) && (this.G instanceof f);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f12646e;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    @NonNull
    public j getBoxBackground() {
        int i11 = this.P;
        if (i11 == 1 || i11 == 2) {
            return this.G;
        }
        y.e();
        return null;
    }

    public int getBoxBackgroundColor() {
        return this.t0;
    }

    public int getBoxBackgroundMode() {
        return this.P;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.Q;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        o oVar = this.M;
        RectF rectF = this.f12653h1;
        return layoutDirection == 1 ? oVar.f30395h.a(rectF) : oVar.f30394g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        o oVar = this.M;
        RectF rectF = this.f12653h1;
        return layoutDirection == 1 ? oVar.f30394g.a(rectF) : oVar.f30395h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        o oVar = this.M;
        RectF rectF = this.f12653h1;
        return layoutDirection == 1 ? oVar.f30392e.a(rectF) : oVar.f30393f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        o oVar = this.M;
        RectF rectF = this.f12653h1;
        return layoutDirection == 1 ? oVar.f30393f.a(rectF) : oVar.f30392e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f12676t1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f12678u1;
    }

    public int getBoxStrokeWidth() {
        return this.V;
    }

    public int getBoxStrokeWidthFocused() {
        return this.W;
    }

    public int getCounterMaxLength() {
        return this.f12661m;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.l && this.f12663n && (appCompatTextView = this.f12667p) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.A;
    }

    public ColorStateList getCounterTextColor() {
        return this.f12687z;
    }

    public ColorStateList getCursorColor() {
        return this.B;
    }

    public ColorStateList getCursorErrorColor() {
        return this.C;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f12668p1;
    }

    public EditText getEditText() {
        return this.f12646e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f12644c.f39705g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f12644c.f39705g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f12644c.f39710m;
    }

    public int getEndIconMode() {
        return this.f12644c.f39707i;
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f12644c.f39711n;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f12644c.f39705g;
    }

    public CharSequence getError() {
        p pVar = this.f12658k;
        if (pVar.f39745q) {
            return pVar.f39744p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f12658k.f39748t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f12658k.f39747s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f12658k.f39746r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f12644c.f39701c.getDrawable();
    }

    public CharSequence getHelperText() {
        p pVar = this.f12658k;
        if (pVar.f39752x) {
            return pVar.f39751w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f12658k.f39753y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.D) {
            return this.E;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.C1.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        c cVar = this.C1;
        return cVar.g(cVar.f15611k);
    }

    public int getHintMaxLines() {
        return this.C1.f15600e0;
    }

    public ColorStateList getHintTextColor() {
        return this.f12670q1;
    }

    @NonNull
    public v getLengthCounter() {
        return this.f12665o;
    }

    public int getMaxEms() {
        return this.f12651h;
    }

    public int getMaxWidth() {
        return this.f12656j;
    }

    public int getMinEms() {
        return this.f12649g;
    }

    public int getMinWidth() {
        return this.f12654i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f12644c.f39705g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f12644c.f39705g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f12675t) {
            return this.f12673s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f12681w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f12679v;
    }

    public CharSequence getPrefixText() {
        return this.f12643b.f39763c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f12643b.f39762b.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f12643b.f39762b;
    }

    @NonNull
    public o getShapeAppearanceModel() {
        return this.M;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f12643b.f39764d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f12643b.f39764d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f12643b.f39767g;
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.f12643b.f39768h;
    }

    public CharSequence getSuffixText() {
        return this.f12644c.f39713p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f12644c.f39714q.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f12644c.f39714q;
    }

    public Typeface getTypeface() {
        return this.f12655i1;
    }

    public final j h(boolean z11) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.app.tgtg.R.dimen.mtrl_shape_corner_size_small_component);
        float f11 = z11 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f12646e;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.app.tgtg.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.app.tgtg.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        m mVar = new m();
        m mVar2 = new m();
        m mVar3 = new m();
        m mVar4 = new m();
        int i11 = 0;
        n20.f fVar = new n20.f(i11);
        n20.f fVar2 = new n20.f(i11);
        n20.f fVar3 = new n20.f(i11);
        n20.f fVar4 = new n20.f(i11);
        n20.a aVar = new n20.a(f11);
        n20.a aVar2 = new n20.a(f11);
        n20.a aVar3 = new n20.a(dimensionPixelOffset);
        n20.a aVar4 = new n20.a(dimensionPixelOffset);
        o oVar = new o();
        oVar.f30388a = mVar;
        oVar.f30389b = mVar2;
        oVar.f30390c = mVar3;
        oVar.f30391d = mVar4;
        oVar.f30392e = aVar;
        oVar.f30393f = aVar2;
        oVar.f30394g = aVar4;
        oVar.f30395h = aVar3;
        oVar.f30396i = fVar;
        oVar.f30397j = fVar2;
        oVar.f30398k = fVar3;
        oVar.l = fVar4;
        EditText editText2 = this.f12646e;
        j jVarE = j.e(getContext(), popupElevation, editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null);
        jVarE.setShapeAppearanceModel(oVar);
        n20.h hVar = jVarE.f30345b;
        if (hVar.f30325h == null) {
            hVar.f30325h = new Rect();
        }
        jVarE.f30345b.f30325h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        jVarE.invalidateSelf();
        return jVarE;
    }

    public final int i(int i11, boolean z11) {
        return ((z11 || getPrefixText() == null) ? (!z11 || getSuffixText() == null) ? this.f12646e.getCompoundPaddingLeft() : this.f12644c.b() : this.f12643b.a()) + i11;
    }

    public final int j(int i11, boolean z11) {
        return i11 - ((z11 || getSuffixText() == null) ? (!z11 || getPrefixText() == null) ? this.f12646e.getCompoundPaddingRight() : this.f12643b.a() : this.f12644c.b());
    }

    public final void k() {
        int i11 = this.P;
        if (i11 == 0) {
            this.G = null;
            this.K = null;
            this.L = null;
        } else if (i11 == 1) {
            this.G = new j(this.M);
            this.K = new j();
            this.L = new j();
        } else {
            if (i11 != 2) {
                i4.a.f(r8.k.i(this.P, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
                return;
            }
            if (!this.D || (this.G instanceof f)) {
                this.G = new j(this.M);
            } else {
                o oVar = this.M;
                int i12 = f.I;
                if (oVar == null) {
                    oVar = new o();
                }
                t20.e eVar = new t20.e(oVar, new RectF());
                f fVar = new f(eVar);
                fVar.H = eVar;
                this.G = fVar;
            }
            this.K = null;
            this.L = null;
        }
        u();
        z();
        if (this.P == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.Q = getResources().getDimensionPixelSize(com.app.tgtg.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (h0.g.w(getContext())) {
                this.Q = getResources().getDimensionPixelSize(com.app.tgtg.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.P != 0) {
            v();
        }
        EditText editText = this.f12646e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i13 = this.P;
                if (i13 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i13 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.l():void");
    }

    public final void n(AppCompatTextView appCompatTextView, int i11) {
        try {
            appCompatTextView.setTextAppearance(i11);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(com.app.tgtg.R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(getContext().getColor(com.app.tgtg.R.color.design_error));
    }

    public final boolean o() {
        p pVar = this.f12658k;
        return (pVar.f39743o != 1 || pVar.f39746r == null || TextUtils.isEmpty(pVar.f39744p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.C1.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        l lVar = this.f12644c;
        lVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z11 = false;
        this.I1 = false;
        if (this.f12646e != null && this.f12646e.getMeasuredHeight() < (iMax = Math.max(lVar.getMeasuredHeight(), this.f12643b.getMeasuredHeight()))) {
            this.f12646e.setMinimumHeight(iMax);
            z11 = true;
        }
        boolean zS = s();
        if (z11 || zS) {
            this.f12646e.post(new m0.l(this, 21));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        float fDescent;
        int i15;
        int compoundPaddingTop;
        super.onLayout(z11, i11, i12, i13, i14);
        EditText editText = this.f12646e;
        if (editText != null) {
            Rect rect = this.f12648f1;
            d.a(this, editText, rect);
            j jVar = this.K;
            if (jVar != null) {
                int i16 = rect.bottom;
                jVar.setBounds(rect.left, i16 - this.V, rect.right, i16);
            }
            j jVar2 = this.L;
            if (jVar2 != null) {
                int i17 = rect.bottom;
                jVar2.setBounds(rect.left, i17 - this.W, rect.right, i17);
            }
            if (this.D) {
                float textSize = this.f12646e.getTextSize();
                c cVar = this.C1;
                float f11 = cVar.f15605h;
                TextPaint textPaint = cVar.P;
                if (f11 != textSize) {
                    cVar.f15605h = textSize;
                    cVar.j(false);
                }
                int gravity = this.f12646e.getGravity();
                int i18 = (gravity & (-113)) | 48;
                if (cVar.f15603g != i18) {
                    cVar.f15603g = i18;
                    cVar.j(false);
                }
                if (cVar.f15601f != gravity) {
                    cVar.f15601f = gravity;
                    cVar.j(false);
                }
                Rect rectD = d(rect);
                int i19 = rectD.left;
                int i21 = rectD.top;
                int i22 = rectD.right;
                int i23 = rectD.bottom;
                Rect rect2 = cVar.f15597d;
                if (rect2.left != i19 || rect2.top != i21 || rect2.right != i22 || rect2.bottom != i23) {
                    rect2.set(i19, i21, i22, i23);
                    cVar.N = true;
                }
                if (this.f12646e == null) {
                    y.e();
                    return;
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(cVar.f15605h);
                    textPaint.setTypeface(cVar.f15622v);
                    textPaint.setLetterSpacing(cVar.X);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(cVar.f15605h);
                    textPaint.setTypeface(cVar.f15622v);
                    textPaint.setLetterSpacing(cVar.X);
                    fDescent = cVar.l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.f12646e.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f12650g1;
                rect3.left = compoundPaddingLeft;
                if (this.P != 1 || this.f12646e.getMinLines() > 1) {
                    if (this.P != 0 || getHintMaxLines() == 1) {
                        i15 = 0;
                    } else {
                        textPaint.setTextSize(cVar.f15605h);
                        textPaint.setTypeface(cVar.f15622v);
                        textPaint.setLetterSpacing(cVar.X);
                        i15 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.f12646e.getCompoundPaddingTop() + rect.top) - i15;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.f12646e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.P != 1 || this.f12646e.getMinLines() > 1) ? rect.bottom - this.f12646e.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i24 = rect3.left;
                int i25 = rect3.top;
                int i26 = rect3.right;
                Rect rect4 = cVar.f15595c;
                if (rect4.left != i24 || rect4.top != i25 || rect4.right != i26 || rect4.bottom != compoundPaddingBottom || true != cVar.f15612k0) {
                    rect4.set(i24, i25, i26, compoundPaddingBottom);
                    cVar.N = true;
                    cVar.f15612k0 = true;
                }
                cVar.j(false);
                if (!g() || this.B1) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        float f11;
        EditText editText;
        super.onMeasure(i11, i12);
        boolean z11 = this.I1;
        l lVar = this.f12644c;
        if (!z11) {
            lVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.I1 = true;
        }
        if (this.f12677u != null && (editText = this.f12646e) != null) {
            this.f12677u.setGravity(editText.getGravity());
            this.f12677u.setPadding(this.f12646e.getCompoundPaddingLeft(), this.f12646e.getCompoundPaddingTop(), this.f12646e.getCompoundPaddingRight(), this.f12646e.getCompoundPaddingBottom());
        }
        lVar.l();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.f12646e.getMeasuredWidth() - this.f12646e.getCompoundPaddingLeft()) - this.f12646e.getCompoundPaddingRight();
        c cVar = this.C1;
        TextPaint textPaint = cVar.P;
        textPaint.setTextSize(cVar.f15607i);
        textPaint.setTypeface(cVar.f15619s);
        textPaint.setLetterSpacing(cVar.W);
        float f12 = measuredWidth;
        cVar.f15608i0 = cVar.e(cVar.f15602f0, textPaint, cVar.B, (cVar.f15607i / cVar.f15605h) * f12, cVar.D).getHeight();
        textPaint.setTextSize(cVar.f15605h);
        textPaint.setTypeface(cVar.f15622v);
        textPaint.setLetterSpacing(cVar.X);
        cVar.f15610j0 = cVar.e(cVar.f15600e0, textPaint, cVar.B, f12, cVar.D).getHeight();
        EditText editText2 = this.f12646e;
        Rect rect = this.f12648f1;
        d.a(this, editText2, rect);
        Rect rectD = d(rect);
        int i13 = rectD.left;
        int i14 = rectD.top;
        int i15 = rectD.right;
        int i16 = rectD.bottom;
        Rect rect2 = cVar.f15597d;
        if (rect2.left != i13 || rect2.top != i14 || rect2.right != i15 || rect2.bottom != i16) {
            rect2.set(i13, i14, i15, i16);
            cVar.N = true;
        }
        v();
        a();
        if (this.f12646e == null) {
            return;
        }
        int i17 = cVar.f15610j0;
        if (i17 != -1) {
            f11 = i17;
        } else {
            TextPaint textPaint2 = cVar.P;
            textPaint2.setTextSize(cVar.f15605h);
            textPaint2.setTypeface(cVar.f15622v);
            textPaint2.setLetterSpacing(cVar.X);
            f11 = -textPaint2.ascent();
        }
        float height = 0.0f;
        if (this.f12673s != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.f12677u.getPaint());
            textPaint3.setTextSize(this.f12677u.getTextSize());
            textPaint3.setTypeface(this.f12677u.getTypeface());
            textPaint3.setLetterSpacing(this.f12677u.getLetterSpacing());
            try {
                c0 c0Var = new c0(this.f12673s, textPaint3, measuredWidth);
                c0Var.f15637k = getLayoutDirection() == 1;
                c0Var.f15636j = true;
                float lineSpacingExtra = this.f12677u.getLineSpacingExtra();
                float lineSpacingMultiplier = this.f12677u.getLineSpacingMultiplier();
                c0Var.f15633g = lineSpacingExtra;
                c0Var.f15634h = lineSpacingMultiplier;
                c0Var.f15638m = new mp.a(this, 12);
                height = c0Var.a().getHeight() + (this.P == 1 ? cVar.f() + this.Q + this.f12645d : 0.0f);
            } catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException e5) {
                Log.e("TextInputLayout", e5.getCause().getMessage(), e5);
            }
        }
        float fMax = Math.max(f11, height);
        if (this.f12646e.getMeasuredHeight() < fMax) {
            this.f12646e.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof w)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w wVar = (w) parcelable;
        super.onRestoreInstanceState(wVar.f45418a);
        setError(wVar.f39775c);
        if (wVar.f39776d) {
            post(new a8.f(this, 14));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i11) {
        super.onRtlPropertiesChanged(i11);
        boolean z11 = i11 == 1;
        if (z11 != this.N) {
            n20.d dVar = this.M.f30392e;
            RectF rectF = this.f12653h1;
            float fA = dVar.a(rectF);
            float fA2 = this.M.f30393f.a(rectF);
            float fA3 = this.M.f30395h.a(rectF);
            float fA4 = this.M.f30394g.a(rectF);
            o oVar = this.M;
            jf.e eVar = oVar.f30388a;
            jf.e eVar2 = oVar.f30389b;
            jf.e eVar3 = oVar.f30391d;
            jf.e eVar4 = oVar.f30390c;
            n20.f fVar = new n20.f(0);
            n20.f fVar2 = new n20.f(0);
            n20.f fVar3 = new n20.f(0);
            n20.f fVar4 = new n20.f(0);
            n20.a aVar = new n20.a(fA2);
            n20.a aVar2 = new n20.a(fA);
            n20.a aVar3 = new n20.a(fA4);
            n20.a aVar4 = new n20.a(fA3);
            o oVar2 = new o();
            oVar2.f30388a = eVar2;
            oVar2.f30389b = eVar;
            oVar2.f30390c = eVar3;
            oVar2.f30391d = eVar4;
            oVar2.f30392e = aVar;
            oVar2.f30393f = aVar2;
            oVar2.f30394g = aVar4;
            oVar2.f30395h = aVar3;
            oVar2.f30396i = fVar;
            oVar2.f30397j = fVar2;
            oVar2.f30398k = fVar3;
            oVar2.l = fVar4;
            this.N = z11;
            setShapeAppearanceModel(oVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        w wVar = new w(super.onSaveInstanceState());
        if (o()) {
            wVar.f39775c = getError();
        }
        l lVar = this.f12644c;
        wVar.f39776d = lVar.f39707i != 0 && lVar.f39705g.f12498d;
        return wVar;
    }

    public final void p(Editable editable) {
        ((y) this.f12665o).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z11 = this.f12663n;
        int i11 = this.f12661m;
        if (i11 == -1) {
            this.f12667p.setText(String.valueOf(length));
            this.f12667p.setContentDescription(null);
            this.f12663n = false;
        } else {
            this.f12663n = length > i11;
            Context context = getContext();
            this.f12667p.setContentDescription(context.getString(this.f12663n ? com.app.tgtg.R.string.character_counter_overflowed_content_description : com.app.tgtg.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f12661m)));
            if (z11 != this.f12663n) {
                q();
            }
            String str = b.f17455b;
            b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? b.f17458e : b.f17457d;
            AppCompatTextView appCompatTextView = this.f12667p;
            String string = getContext().getString(com.app.tgtg.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f12661m));
            bVar.getClass();
            c40.i iVar = f7.f.f17465a;
            appCompatTextView.setText(string != null ? bVar.c(string).toString() : null);
        }
        if (this.f12646e == null || z11 == this.f12663n) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f12667p;
        if (appCompatTextView != null) {
            n(appCompatTextView, this.f12663n ? this.f12669q : this.f12671r);
            if (!this.f12663n && (colorStateList2 = this.f12687z) != null) {
                this.f12667p.setTextColor(colorStateList2);
            }
            if (!this.f12663n || (colorStateList = this.A) == null) {
                return;
            }
            this.f12667p.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.B
            if (r0 == 0) goto L5
            goto L26
        L5:
            android.content.Context r0 = r4.getContext()
            r1 = 2130968892(0x7f04013c, float:1.754645E38)
            android.util.TypedValue r1 = ex.i.F(r0, r1)
            r2 = 0
            if (r1 != 0) goto L15
        L13:
            r0 = r2
            goto L26
        L15:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1e
            android.content.res.ColorStateList r0 = androidx.core.app.e.b(r0, r3)
            goto L26
        L1e:
            int r0 = r1.data
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L26:
            android.widget.EditText r1 = r4.f12646e
            if (r1 == 0) goto L51
            android.graphics.drawable.Drawable r1 = r1.getTextCursorDrawable()
            if (r1 != 0) goto L31
            goto L51
        L31:
            android.widget.EditText r1 = r4.f12646e
            android.graphics.drawable.Drawable r1 = r1.getTextCursorDrawable()
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.o()
            if (r2 != 0) goto L49
            androidx.appcompat.widget.AppCompatTextView r2 = r4.f12667p
            if (r2 == 0) goto L4e
            boolean r2 = r4.f12663n
            if (r2 == 0) goto L4e
        L49:
            android.content.res.ColorStateList r2 = r4.C
            if (r2 == 0) goto L4e
            r0 = r2
        L4e:
            r1.setTintList(r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.r():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s() {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.s():boolean");
    }

    public void setBoxBackgroundColor(int i11) {
        if (this.t0 != i11) {
            this.t0 = i11;
            this.f12680v1 = i11;
            this.f12684x1 = i11;
            this.f12686y1 = i11;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i11) {
        setBoxBackgroundColor(getContext().getColor(i11));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f12680v1 = defaultColor;
        this.t0 = defaultColor;
        this.f12682w1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f12684x1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f12686y1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i11) {
        if (i11 == this.P) {
            return;
        }
        this.P = i11;
        if (this.f12646e != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i11) {
        this.Q = i11;
    }

    public void setBoxCornerFamily(int i11) {
        n nVarH = this.M.h();
        n20.d dVar = this.M.f30392e;
        nVarH.f30376a = lx.u.x(i11);
        nVarH.f30380e = dVar;
        n20.d dVar2 = this.M.f30393f;
        nVarH.f30377b = lx.u.x(i11);
        nVarH.f30381f = dVar2;
        n20.d dVar3 = this.M.f30395h;
        nVarH.f30379d = lx.u.x(i11);
        nVarH.f30383h = dVar3;
        n20.d dVar4 = this.M.f30394g;
        nVarH.f30378c = lx.u.x(i11);
        nVarH.f30382g = dVar4;
        this.M = nVarH.a();
        c();
    }

    public void setBoxCornerRadii(float f11, float f12, float f13, float f14) {
        boolean z11 = getLayoutDirection() == 1;
        this.N = z11;
        float f15 = z11 ? f12 : f11;
        if (!z11) {
            f11 = f12;
        }
        float f16 = z11 ? f14 : f13;
        if (!z11) {
            f13 = f14;
        }
        j jVar = this.G;
        if (jVar != null && jVar.m() == f15 && this.G.n() == f11) {
            j jVar2 = this.G;
            float[] fArr = jVar2.C;
            if ((fArr != null ? fArr[2] : jVar2.f30345b.f30318a.f30395h.a(jVar2.i())) == f16) {
                j jVar3 = this.G;
                float[] fArr2 = jVar3.C;
                if ((fArr2 != null ? fArr2[1] : jVar3.f30345b.f30318a.f30394g.a(jVar3.i())) == f13) {
                    return;
                }
            }
        }
        n nVarH = this.M.h();
        nVarH.f(f15);
        nVarH.g(f11);
        nVarH.d(f16);
        nVarH.e(f13);
        this.M = nVarH.a();
        c();
    }

    public void setBoxCornerRadiiResources(int i11, int i12, int i13, int i14) {
        setBoxCornerRadii(getContext().getResources().getDimension(i11), getContext().getResources().getDimension(i12), getContext().getResources().getDimension(i14), getContext().getResources().getDimension(i13));
    }

    public void setBoxStrokeColor(int i11) {
        if (this.f12676t1 != i11) {
            this.f12676t1 = i11;
            z();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f12672r1 = colorStateList.getDefaultColor();
            this.f12688z1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f12674s1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f12676t1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f12676t1 != colorStateList.getDefaultColor()) {
            this.f12676t1 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f12678u1 != colorStateList) {
            this.f12678u1 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i11) {
        this.V = i11;
        z();
    }

    public void setBoxStrokeWidthFocused(int i11) {
        this.W = i11;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i11) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i11));
    }

    public void setBoxStrokeWidthResource(int i11) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i11));
    }

    public void setCounterEnabled(boolean z11) {
        if (this.l != z11) {
            p pVar = this.f12658k;
            if (z11) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f12667p = appCompatTextView;
                appCompatTextView.setId(com.app.tgtg.R.id.textinput_counter);
                Typeface typeface = this.f12655i1;
                if (typeface != null) {
                    this.f12667p.setTypeface(typeface);
                }
                this.f12667p.setMaxLines(1);
                pVar.a(this.f12667p, 2);
                ((ViewGroup.MarginLayoutParams) this.f12667p.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.app.tgtg.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.f12667p != null) {
                    EditText editText = this.f12646e;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                pVar.g(this.f12667p, 2);
                this.f12667p = null;
            }
            this.l = z11;
        }
    }

    public void setCounterMaxLength(int i11) {
        if (this.f12661m != i11) {
            if (i11 > 0) {
                this.f12661m = i11;
            } else {
                this.f12661m = -1;
            }
            if (!this.l || this.f12667p == null) {
                return;
            }
            EditText editText = this.f12646e;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i11) {
        if (this.f12669q != i11) {
            this.f12669q = i11;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i11) {
        if (this.f12671r != i11) {
            this.f12671r = i11;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f12687z != colorStateList) {
            this.f12687z = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            if (o() || (this.f12667p != null && this.f12663n)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f12668p1 = colorStateList;
        this.f12670q1 = colorStateList;
        if (this.f12646e != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        m(this, z11);
        super.setEnabled(z11);
    }

    public void setEndIconActivated(boolean z11) {
        this.f12644c.f39705g.setActivated(z11);
    }

    public void setEndIconCheckable(boolean z11) {
        this.f12644c.f39705g.setCheckable(z11);
    }

    public void setEndIconContentDescription(int i11) {
        l lVar = this.f12644c;
        CharSequence text = i11 != 0 ? lVar.getResources().getText(i11) : null;
        CheckableImageButton checkableImageButton = lVar.f39705g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i11) {
        l lVar = this.f12644c;
        Drawable drawableX = i11 != 0 ? a0.x(lVar.getContext(), i11) : null;
        TextInputLayout textInputLayout = lVar.f39699a;
        CheckableImageButton checkableImageButton = lVar.f39705g;
        checkableImageButton.setImageDrawable(drawableX);
        if (drawableX != null) {
            t1.s(textInputLayout, checkableImageButton, lVar.f39709k, lVar.l);
            t1.E(textInputLayout, checkableImageButton, lVar.f39709k);
        }
    }

    public void setEndIconMinSize(int i11) {
        l lVar = this.f12644c;
        if (i11 < 0) {
            lVar.getClass();
            i4.a.f("endIconSize cannot be less than 0");
        } else if (i11 != lVar.f39710m) {
            lVar.f39710m = i11;
            CheckableImageButton checkableImageButton = lVar.f39705g;
            checkableImageButton.setMinimumWidth(i11);
            checkableImageButton.setMinimumHeight(i11);
            CheckableImageButton checkableImageButton2 = lVar.f39701c;
            checkableImageButton2.setMinimumWidth(i11);
            checkableImageButton2.setMinimumHeight(i11);
        }
    }

    public void setEndIconMode(int i11) {
        this.f12644c.f(i11);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        l lVar = this.f12644c;
        CheckableImageButton checkableImageButton = lVar.f39705g;
        View.OnLongClickListener onLongClickListener = lVar.f39712o;
        checkableImageButton.setOnClickListener(onClickListener);
        t1.I(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        l lVar = this.f12644c;
        lVar.f39712o = onLongClickListener;
        CheckableImageButton checkableImageButton = lVar.f39705g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        t1.I(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        l lVar = this.f12644c;
        lVar.f39711n = scaleType;
        lVar.f39705g.setScaleType(scaleType);
        lVar.f39701c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        l lVar = this.f12644c;
        if (lVar.f39709k != colorStateList) {
            lVar.f39709k = colorStateList;
            t1.s(lVar.f39699a, lVar.f39705g, colorStateList, lVar.l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        l lVar = this.f12644c;
        if (lVar.l != mode) {
            lVar.l = mode;
            t1.s(lVar.f39699a, lVar.f39705g, lVar.f39709k, mode);
        }
    }

    public void setEndIconVisible(boolean z11) {
        this.f12644c.g(z11);
    }

    public void setError(CharSequence charSequence) {
        p pVar = this.f12658k;
        if (!pVar.f39745q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            pVar.f();
            return;
        }
        pVar.c();
        pVar.f39744p = charSequence;
        pVar.f39746r.setText(charSequence);
        int i11 = pVar.f39742n;
        if (i11 != 1) {
            pVar.f39743o = 1;
        }
        pVar.i(i11, pVar.f39743o, pVar.h(pVar.f39746r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i11) {
        p pVar = this.f12658k;
        pVar.f39748t = i11;
        AppCompatTextView appCompatTextView = pVar.f39746r;
        if (appCompatTextView != null) {
            appCompatTextView.setAccessibilityLiveRegion(i11);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        p pVar = this.f12658k;
        pVar.f39747s = charSequence;
        AppCompatTextView appCompatTextView = pVar.f39746r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z11) {
        p pVar = this.f12658k;
        TextInputLayout textInputLayout = pVar.f39737h;
        if (pVar.f39745q == z11) {
            return;
        }
        pVar.c();
        if (z11) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(pVar.f39736g);
            pVar.f39746r = appCompatTextView;
            appCompatTextView.setId(com.app.tgtg.R.id.textinput_error);
            pVar.f39746r.setTextAlignment(5);
            Typeface typeface = pVar.B;
            if (typeface != null) {
                pVar.f39746r.setTypeface(typeface);
            }
            int i11 = pVar.f39749u;
            pVar.f39749u = i11;
            AppCompatTextView appCompatTextView2 = pVar.f39746r;
            if (appCompatTextView2 != null) {
                pVar.f39737h.n(appCompatTextView2, i11);
            }
            ColorStateList colorStateList = pVar.f39750v;
            pVar.f39750v = colorStateList;
            AppCompatTextView appCompatTextView3 = pVar.f39746r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = pVar.f39747s;
            pVar.f39747s = charSequence;
            AppCompatTextView appCompatTextView4 = pVar.f39746r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i12 = pVar.f39748t;
            pVar.f39748t = i12;
            AppCompatTextView appCompatTextView5 = pVar.f39746r;
            if (appCompatTextView5 != null) {
                appCompatTextView5.setAccessibilityLiveRegion(i12);
            }
            pVar.f39746r.setVisibility(4);
            pVar.a(pVar.f39746r, 0);
        } else {
            pVar.f();
            pVar.g(pVar.f39746r, 0);
            pVar.f39746r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        pVar.f39745q = z11;
    }

    public void setErrorIconDrawable(int i11) {
        l lVar = this.f12644c;
        lVar.h(i11 != 0 ? a0.x(lVar.getContext(), i11) : null);
        t1.E(lVar.f39699a, lVar.f39701c, lVar.f39702d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        l lVar = this.f12644c;
        CheckableImageButton checkableImageButton = lVar.f39701c;
        View.OnLongClickListener onLongClickListener = lVar.f39704f;
        checkableImageButton.setOnClickListener(onClickListener);
        t1.I(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        l lVar = this.f12644c;
        lVar.f39704f = onLongClickListener;
        CheckableImageButton checkableImageButton = lVar.f39701c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        t1.I(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        l lVar = this.f12644c;
        if (lVar.f39702d != colorStateList) {
            lVar.f39702d = colorStateList;
            t1.s(lVar.f39699a, lVar.f39701c, colorStateList, lVar.f39703e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        l lVar = this.f12644c;
        if (lVar.f39703e != mode) {
            lVar.f39703e = mode;
            t1.s(lVar.f39699a, lVar.f39701c, lVar.f39702d, mode);
        }
    }

    public void setErrorTextAppearance(int i11) {
        p pVar = this.f12658k;
        pVar.f39749u = i11;
        AppCompatTextView appCompatTextView = pVar.f39746r;
        if (appCompatTextView != null) {
            pVar.f39737h.n(appCompatTextView, i11);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        p pVar = this.f12658k;
        pVar.f39750v = colorStateList;
        AppCompatTextView appCompatTextView = pVar.f39746r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z11) {
        if (this.D1 != z11) {
            this.D1 = z11;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        p pVar = this.f12658k;
        if (zIsEmpty) {
            if (pVar.f39752x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!pVar.f39752x) {
            setHelperTextEnabled(true);
        }
        pVar.c();
        pVar.f39751w = charSequence;
        pVar.f39753y.setText(charSequence);
        int i11 = pVar.f39742n;
        if (i11 != 2) {
            pVar.f39743o = 2;
        }
        pVar.i(i11, pVar.f39743o, pVar.h(pVar.f39753y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        p pVar = this.f12658k;
        pVar.A = colorStateList;
        AppCompatTextView appCompatTextView = pVar.f39753y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z11) {
        p pVar = this.f12658k;
        TextInputLayout textInputLayout = pVar.f39737h;
        if (pVar.f39752x == z11) {
            return;
        }
        pVar.c();
        if (z11) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(pVar.f39736g);
            pVar.f39753y = appCompatTextView;
            appCompatTextView.setId(com.app.tgtg.R.id.textinput_helper_text);
            pVar.f39753y.setTextAlignment(5);
            Typeface typeface = pVar.B;
            if (typeface != null) {
                pVar.f39753y.setTypeface(typeface);
            }
            pVar.f39753y.setVisibility(4);
            pVar.f39753y.setAccessibilityLiveRegion(1);
            int i11 = pVar.f39754z;
            pVar.f39754z = i11;
            AppCompatTextView appCompatTextView2 = pVar.f39753y;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextAppearance(i11);
            }
            ColorStateList colorStateList = pVar.A;
            pVar.A = colorStateList;
            AppCompatTextView appCompatTextView3 = pVar.f39753y;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            pVar.a(pVar.f39753y, 1);
            pVar.f39753y.setAccessibilityDelegate(new t20.o(pVar));
        } else {
            pVar.c();
            int i12 = pVar.f39742n;
            if (i12 == 2) {
                pVar.f39743o = 0;
            }
            pVar.i(i12, pVar.f39743o, pVar.h(pVar.f39753y, ""));
            pVar.g(pVar.f39753y, 1);
            pVar.f39753y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        pVar.f39752x = z11;
    }

    public void setHelperTextTextAppearance(int i11) {
        p pVar = this.f12658k;
        pVar.f39754z = i11;
        AppCompatTextView appCompatTextView = pVar.f39753y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i11);
        }
    }

    public void setHint(int i11) {
        setHint(i11 != 0 ? getResources().getText(i11) : null);
    }

    public void setHintAnimationEnabled(boolean z11) {
        this.E1 = z11;
    }

    public void setHintEnabled(boolean z11) {
        if (z11 != this.D) {
            this.D = z11;
            if (z11) {
                CharSequence hint = this.f12646e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.E)) {
                        setHint(hint);
                    }
                    this.f12646e.setHint((CharSequence) null);
                }
                this.F = true;
            } else {
                this.F = false;
                if (!TextUtils.isEmpty(this.E) && TextUtils.isEmpty(this.f12646e.getHint())) {
                    this.f12646e.setHint(this.E);
                }
                setHintInternal(null);
            }
            if (this.f12646e != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i11) {
        c cVar = this.C1;
        if (i11 != cVar.f15602f0) {
            cVar.f15602f0 = i11;
            cVar.j(false);
        }
        if (i11 != cVar.f15600e0) {
            cVar.f15600e0 = i11;
            cVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i11) {
        c cVar = this.C1;
        TextInputLayout textInputLayout = cVar.f15591a;
        j20.d dVar = new j20.d(textInputLayout.getContext(), i11);
        ColorStateList colorStateList = dVar.f24466k;
        if (colorStateList != null) {
            cVar.f15611k = colorStateList;
        }
        float f11 = dVar.l;
        if (f11 != 0.0f) {
            cVar.f15607i = f11;
        }
        ColorStateList colorStateList2 = dVar.f24456a;
        if (colorStateList2 != null) {
            cVar.V = colorStateList2;
        }
        cVar.T = dVar.f24461f;
        cVar.U = dVar.f24462g;
        cVar.S = dVar.f24463h;
        cVar.W = dVar.f24465j;
        j20.a aVar = cVar.f15626z;
        if (aVar != null) {
            aVar.f24449g = true;
        }
        se.b bVar = new se.b(cVar, 16);
        dVar.a();
        cVar.f15626z = new j20.a(bVar, dVar.f24470p);
        dVar.b(textInputLayout.getContext(), cVar.f15626z);
        cVar.j(false);
        this.f12670q1 = cVar.f15611k;
        if (this.f12646e != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f12670q1 != colorStateList) {
            if (this.f12668p1 == null) {
                c cVar = this.C1;
                if (cVar.f15611k != colorStateList) {
                    cVar.f15611k = colorStateList;
                    cVar.j(false);
                }
            }
            this.f12670q1 = colorStateList;
            if (this.f12646e != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(@NonNull v vVar) {
        this.f12665o = vVar;
    }

    public void setMaxEms(int i11) {
        this.f12651h = i11;
        EditText editText = this.f12646e;
        if (editText == null || i11 == -1) {
            return;
        }
        editText.setMaxEms(i11);
    }

    public void setMaxWidth(int i11) {
        this.f12656j = i11;
        EditText editText = this.f12646e;
        if (editText == null || i11 == -1) {
            return;
        }
        editText.setMaxWidth(i11);
    }

    public void setMaxWidthResource(int i11) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i11));
    }

    public void setMinEms(int i11) {
        this.f12649g = i11;
        EditText editText = this.f12646e;
        if (editText == null || i11 == -1) {
            return;
        }
        editText.setMinEms(i11);
    }

    public void setMinWidth(int i11) {
        this.f12654i = i11;
        EditText editText = this.f12646e;
        if (editText == null || i11 == -1) {
            return;
        }
        editText.setMinWidth(i11);
    }

    public void setMinWidthResource(int i11) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i11));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i11) {
        l lVar = this.f12644c;
        lVar.f39705g.setContentDescription(i11 != 0 ? lVar.getResources().getText(i11) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i11) {
        l lVar = this.f12644c;
        lVar.f39705g.setImageDrawable(i11 != 0 ? a0.x(lVar.getContext(), i11) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z11) {
        l lVar = this.f12644c;
        if (z11 && lVar.f39707i != 1) {
            lVar.f(1);
        } else if (z11) {
            lVar.getClass();
        } else {
            lVar.f(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        l lVar = this.f12644c;
        lVar.f39709k = colorStateList;
        t1.s(lVar.f39699a, lVar.f39705g, colorStateList, lVar.l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        l lVar = this.f12644c;
        lVar.l = mode;
        t1.s(lVar.f39699a, lVar.f39705g, lVar.f39709k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        int i11 = 1;
        if (this.f12677u == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f12677u = appCompatTextView;
            appCompatTextView.setId(com.app.tgtg.R.id.textinput_placeholder);
            this.f12677u.setImportantForAccessibility(1);
            this.f12677u.setAccessibilityLiveRegion(1);
            h hVarF = f();
            this.f12683x = hVarF;
            hVarF.f36750b = 67L;
            this.f12685y = f();
            setPlaceholderTextAppearance(this.f12681w);
            setPlaceholderTextColor(this.f12679v);
            ViewCompat.b0(this.f12677u, new j8.c(i11));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f12675t) {
                setPlaceholderTextEnabled(true);
            }
            this.f12673s = charSequence;
        }
        EditText editText = this.f12646e;
        x(editText == null ? null : editText.getText());
    }

    public void setPlaceholderTextAppearance(int i11) {
        this.f12681w = i11;
        AppCompatTextView appCompatTextView = this.f12677u;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i11);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f12679v != colorStateList) {
            this.f12679v = colorStateList;
            AppCompatTextView appCompatTextView = this.f12677u;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        s sVar = this.f12643b;
        sVar.getClass();
        sVar.f39763c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        sVar.f39762b.setText(charSequence);
        sVar.e();
    }

    public void setPrefixTextAppearance(int i11) {
        this.f12643b.f39762b.setTextAppearance(i11);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f12643b.f39762b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull o oVar) {
        j jVar = this.G;
        if (jVar == null || jVar.f30345b.f30318a == oVar) {
            return;
        }
        this.M = oVar;
        c();
    }

    public void setStartIconCheckable(boolean z11) {
        this.f12643b.f39764d.setCheckable(z11);
    }

    public void setStartIconContentDescription(int i11) {
        setStartIconContentDescription(i11 != 0 ? getResources().getText(i11) : null);
    }

    public void setStartIconDrawable(int i11) {
        setStartIconDrawable(i11 != 0 ? a0.x(getContext(), i11) : null);
    }

    public void setStartIconMinSize(int i11) {
        s sVar = this.f12643b;
        if (i11 < 0) {
            sVar.getClass();
            i4.a.f("startIconSize cannot be less than 0");
        } else if (i11 != sVar.f39767g) {
            sVar.f39767g = i11;
            CheckableImageButton checkableImageButton = sVar.f39764d;
            checkableImageButton.setMinimumWidth(i11);
            checkableImageButton.setMinimumHeight(i11);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        s sVar = this.f12643b;
        CheckableImageButton checkableImageButton = sVar.f39764d;
        View.OnLongClickListener onLongClickListener = sVar.f39769i;
        checkableImageButton.setOnClickListener(onClickListener);
        t1.I(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        s sVar = this.f12643b;
        sVar.f39769i = onLongClickListener;
        CheckableImageButton checkableImageButton = sVar.f39764d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        t1.I(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        s sVar = this.f12643b;
        sVar.f39768h = scaleType;
        sVar.f39764d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        s sVar = this.f12643b;
        if (sVar.f39765e != colorStateList) {
            sVar.f39765e = colorStateList;
            t1.s(sVar.f39761a, sVar.f39764d, colorStateList, sVar.f39766f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        s sVar = this.f12643b;
        if (sVar.f39766f != mode) {
            sVar.f39766f = mode;
            t1.s(sVar.f39761a, sVar.f39764d, sVar.f39765e, mode);
        }
    }

    public void setStartIconVisible(boolean z11) {
        this.f12643b.c(z11);
    }

    public void setSuffixText(CharSequence charSequence) {
        l lVar = this.f12644c;
        lVar.getClass();
        lVar.f39713p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        lVar.f39714q.setText(charSequence);
        lVar.m();
    }

    public void setSuffixTextAppearance(int i11) {
        this.f12644c.f39714q.setTextAppearance(i11);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f12644c.f39714q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(u uVar) {
        EditText editText = this.f12646e;
        if (editText != null) {
            ViewCompat.b0(editText, uVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f12655i1) {
            this.f12655i1 = typeface;
            this.C1.n(typeface);
            p pVar = this.f12658k;
            if (typeface != pVar.B) {
                pVar.B = typeface;
                AppCompatTextView appCompatTextView = pVar.f39746r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = pVar.f39753y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f12667p;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f12646e;
        if (editText == null || this.P != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = e1.f33881a;
        Drawable drawableMutate = background.mutate();
        if (o()) {
            drawableMutate.setColorFilter(p.m.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f12663n && (appCompatTextView = this.f12667p) != null) {
            drawableMutate.setColorFilter(p.m.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f12646e.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.f12646e;
        if (editText == null || this.G == null) {
            return;
        }
        if ((this.J || editText.getBackground() == null) && this.P != 0) {
            this.f12646e.setBackground(getEditTextBoxBackground());
            this.J = true;
        }
    }

    public final void v() {
        if (this.P != 1) {
            FrameLayout frameLayout = this.f12642a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z11, boolean z12) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f12646e;
        boolean z13 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f12646e;
        boolean z14 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f12668p1;
        c cVar = this.C1;
        if (colorStateList2 != null) {
            cVar.k(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f12668p1;
            int colorForState = this.f12688z1;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, colorForState);
            }
            cVar.k(ColorStateList.valueOf(colorForState));
        } else if (o()) {
            AppCompatTextView appCompatTextView2 = this.f12658k.f39746r;
            cVar.k(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.f12663n && (appCompatTextView = this.f12667p) != null) {
            cVar.k(appCompatTextView.getTextColors());
        } else if (z14 && (colorStateList = this.f12670q1) != null && cVar.f15611k != colorStateList) {
            cVar.f15611k = colorStateList;
            cVar.j(false);
        }
        l lVar = this.f12644c;
        s sVar = this.f12643b;
        if (z13 || !this.D1 || (isEnabled() && z14)) {
            if (z12 || this.B1) {
                ValueAnimator valueAnimator = this.F1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.F1.cancel();
                }
                if (z11 && this.E1) {
                    b(1.0f);
                } else {
                    cVar.m(1.0f);
                }
                this.B1 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.f12646e;
                x(editText3 != null ? editText3.getText() : null);
                sVar.f39770j = false;
                sVar.e();
                lVar.f39715r = false;
                lVar.m();
                return;
            }
            return;
        }
        if (z12 || !this.B1) {
            ValueAnimator valueAnimator2 = this.F1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.F1.cancel();
            }
            if (z11 && this.E1) {
                b(0.0f);
            } else {
                cVar.m(0.0f);
            }
            if (g() && !((f) this.G).H.f39680s.isEmpty() && g()) {
                ((f) this.G).F(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.B1 = true;
            AppCompatTextView appCompatTextView3 = this.f12677u;
            if (appCompatTextView3 != null && this.f12675t) {
                appCompatTextView3.setText((CharSequence) null);
                qa.c0.a(this.f12642a, this.f12685y);
                this.f12677u.setVisibility(4);
            }
            sVar.f39770j = true;
            sVar.e();
            lVar.f39715r = true;
            lVar.m();
        }
    }

    public final void x(Editable editable) {
        ((y) this.f12665o).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f12642a;
        if (length != 0 || this.B1) {
            AppCompatTextView appCompatTextView = this.f12677u;
            if (appCompatTextView == null || !this.f12675t) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            qa.c0.a(frameLayout, this.f12685y);
            this.f12677u.setVisibility(4);
            return;
        }
        if (this.f12677u == null || !this.f12675t || TextUtils.isEmpty(this.f12673s)) {
            return;
        }
        this.f12677u.setText(this.f12673s);
        qa.c0.a(frameLayout, this.f12683x);
        this.f12677u.setVisibility(0);
        this.f12677u.bringToFront();
    }

    public final void y(boolean z11, boolean z12) {
        int defaultColor = this.f12678u1.getDefaultColor();
        int colorForState = this.f12678u1.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f12678u1.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z11) {
            this.f12652h0 = colorForState2;
        } else if (z12) {
            this.f12652h0 = colorForState;
        } else {
            this.f12652h0 = defaultColor;
        }
    }

    public final void z() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.G == null || this.P == 0) {
            return;
        }
        boolean z11 = false;
        boolean z12 = isFocused() || ((editText2 = this.f12646e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f12646e) != null && editText.isHovered())) {
            z11 = true;
        }
        if (!isEnabled()) {
            this.f12652h0 = this.f12688z1;
        } else if (o()) {
            if (this.f12678u1 != null) {
                y(z12, z11);
            } else {
                this.f12652h0 = getErrorCurrentTextColors();
            }
        } else if (!this.f12663n || (appCompatTextView = this.f12667p) == null) {
            if (z12) {
                this.f12652h0 = this.f12676t1;
            } else if (z11) {
                this.f12652h0 = this.f12674s1;
            } else {
                this.f12652h0 = this.f12672r1;
            }
        } else if (this.f12678u1 != null) {
            y(z12, z11);
        } else {
            this.f12652h0 = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        l lVar = this.f12644c;
        TextInputLayout textInputLayout = lVar.f39699a;
        CheckableImageButton checkableImageButton = lVar.f39705g;
        TextInputLayout textInputLayout2 = lVar.f39699a;
        lVar.k();
        t1.E(textInputLayout2, lVar.f39701c, lVar.f39702d);
        t1.E(textInputLayout2, checkableImageButton, lVar.f39709k);
        if (lVar.a() instanceof t20.i) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                t1.s(textInputLayout, checkableImageButton, lVar.f39709k, lVar.l);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        s sVar = this.f12643b;
        t1.E(sVar.f39761a, sVar.f39764d, sVar.f39765e);
        if (this.P == 2) {
            int i11 = this.T;
            if (z12 && isEnabled()) {
                this.T = this.W;
            } else {
                this.T = this.V;
            }
            if (this.T != i11 && g() && !this.B1) {
                if (g()) {
                    ((f) this.G).F(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.P == 1) {
            if (!isEnabled()) {
                this.t0 = this.f12682w1;
            } else if (z11 && !z12) {
                this.t0 = this.f12686y1;
            } else if (z12) {
                this.t0 = this.f12684x1;
            } else {
                this.t0 = this.f12680v1;
            }
        }
        c();
    }

    public void setHint(CharSequence charSequence) {
        if (this.D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(NewHope.SENDB_BYTES);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f12643b.f39764d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f12643b.b(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f12644c.f39705g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f12644c.f39705g.setImageDrawable(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f12644c.f39705g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f12644c.h(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        l lVar = this.f12644c;
        TextInputLayout textInputLayout = lVar.f39699a;
        CheckableImageButton checkableImageButton = lVar.f39705g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            t1.s(textInputLayout, checkableImageButton, lVar.f39709k, lVar.l);
            t1.E(textInputLayout, checkableImageButton, lVar.f39709k);
        }
    }

    public TextInputLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.app.tgtg.R.attr.textInputStyle);
    }

    public TextInputLayout(@NonNull Context context) {
        this(context, null);
    }
}
