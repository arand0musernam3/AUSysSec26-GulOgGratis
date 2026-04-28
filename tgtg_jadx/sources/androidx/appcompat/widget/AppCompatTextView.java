package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import b0.a0;
import h7.i0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import ky.o;
import o00.x0;
import p.g3;
import p.j0;
import p.k;
import p.k0;
import p.p0;
import p.q;
import p.q0;
import p.r0;
import p.s0;
import p.u2;
import p.v2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView {
    private final k mBackgroundTintHelper;

    @NonNull
    private q mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<f7.d> mPrecomputedTextFuture;
    private q0 mSuperCaller;
    private final k0 mTextClassifierHelper;
    private final p0 mTextHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        v2.a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        u2.a(getContext(), this);
        k kVar = new k(this);
        this.mBackgroundTintHelper = kVar;
        kVar.d(attributeSet, i11);
        p0 p0Var = new p0(this);
        this.mTextHelper = p0Var;
        p0Var.f(attributeSet, i11);
        p0Var.b();
        k0 k0Var = new k0();
        k0Var.f33923a = this;
        this.mTextClassifierHelper = k0Var;
        getEmojiTextViewHelper().b(attributeSet, i11);
    }

    @NonNull
    private q getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new q(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            kVar.a();
        }
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            p0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (g3.f33906c) {
            return super.getAutoSizeMaxTextSize();
        }
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            return Math.round(p0Var.f33975i.f34072e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (g3.f33906c) {
            return super.getAutoSizeMinTextSize();
        }
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            return Math.round(p0Var.f33975i.f34071d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (g3.f33906c) {
            return super.getAutoSizeStepGranularity();
        }
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            return Math.round(p0Var.f33975i.f34070c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (g3.f33906c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        p0 p0Var = this.mTextHelper;
        return p0Var != null ? p0Var.f33975i.f34073f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (g3.f33906c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            return p0Var.f33975i.f34068a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return android.support.v4.media.session.a.P(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public q0 getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 34) {
                this.mSuperCaller = new s0(this);
            } else if (i11 >= 28) {
                this.mSuperCaller = new r0(this);
            } else {
                this.mSuperCaller = new o(this, 11);
            }
        }
        return this.mSuperCaller;
    }

    public ColorStateList getSupportBackgroundTintList() {
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            return kVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<f7.d> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                android.support.v4.media.session.a.y(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        k0 k0Var;
        if (Build.VERSION.SDK_INT >= 28 || (k0Var = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = k0Var.f33924b;
        return textClassifier == null ? j0.a(k0Var.f33923a) : textClassifier;
    }

    @NonNull
    public f7.c getTextMetricsParamsCompat() {
        return android.support.v4.media.session.a.y(this);
    }

    public boolean isEmojiCompatEnabled() {
        return ((w.b) getEmojiTextViewHelper().f33981b.f24851a).S();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            x0.D(editorInfo, getText());
        }
        h0.g.A(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 30 || i11 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        p0 p0Var = this.mTextHelper;
        if (p0Var == null || g3.f33906c) {
            return;
        }
        p0Var.f33975i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        Future<f7.d> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                android.support.v4.media.session.a.y(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i11, i12);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        super.onTextChanged(charSequence, i11, i12, i13);
        p0 p0Var = this.mTextHelper;
        if (p0Var == null || g3.f33906c || !p0Var.f33975i.f()) {
            return;
        }
        this.mTextHelper.f33975i.a();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z11) {
        super.setAllCaps(z11);
        getEmojiTextViewHelper().c(z11);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i11, int i12, int i13, int i14) throws IllegalArgumentException {
        if (g3.f33906c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i11, i12, i13, i14);
            return;
        }
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            p0Var.h(i11, i12, i13, i14);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i11) throws IllegalArgumentException {
        if (g3.f33906c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i11);
            return;
        }
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            p0Var.i(iArr, i11);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i11) {
        if (g3.f33906c) {
            super.setAutoSizeTextTypeWithDefaults(i11);
            return;
        }
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            p0Var.j(i11);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            kVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            kVar.f(i11);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            p0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            p0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i11 != 0 ? a0.x(context, i11) : null, i12 != 0 ? a0.x(context, i12) : null, i13 != 0 ? a0.x(context, i13) : null, i14 != 0 ? a0.x(context, i14) : null);
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            p0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i11 != 0 ? a0.x(context, i11) : null, i12 != 0 ? a0.x(context, i12) : null, i13 != 0 ? a0.x(context, i13) : null, i14 != 0 ? a0.x(context, i14) : null);
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            p0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.support.v4.media.session.a.Q(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z11) {
        getEmojiTextViewHelper().d(z11);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().p(i11);
        } else {
            android.support.v4.media.session.a.I(this, i11);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().o(i11);
        } else {
            android.support.v4.media.session.a.J(this, i11);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i11, float f11) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            getSuperCaller().r(i11, f11);
        } else if (i12 >= 34) {
            i0.w(this, i11, f11);
        } else {
            android.support.v4.media.session.a.K(this, Math.round(TypedValue.applyDimension(i11, f11, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(@NonNull f7.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        android.support.v4.media.session.a.y(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            kVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            kVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.k(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.l(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            p0Var.g(context, i11);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        k0 k0Var;
        if (Build.VERSION.SDK_INT >= 28 || (k0Var = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            k0Var.f33924b = textClassifier;
        }
    }

    public void setTextFuture(Future<f7.d> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull f7.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f17461b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i11 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i11 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i11 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i11 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i11 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i11 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i11 = 7;
            }
        }
        setTextDirection(i11);
        getPaint().set(cVar.f17460a);
        setBreakStrategy(cVar.f17462c);
        setHyphenationFrequency(cVar.f17463d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i11, float f11) {
        boolean z11 = g3.f33906c;
        if (z11) {
            super.setTextSize(i11, f11);
            return;
        }
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            p.x0 x0Var = p0Var.f33975i;
            if (z11 || x0Var.f()) {
                return;
            }
            x0Var.g(f11, i11);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i11) {
        Typeface typefaceCreate;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface == null || i11 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            na0.a aVar = x6.f.f43879a;
            if (context == null) {
                i4.a.f("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i11);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i11);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i11) {
        android.support.v4.media.session.a.K(this, i11);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            p0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            p0Var.b();
        }
    }

    public AppCompatTextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(@NonNull Context context) {
        this(context, null);
    }
}
