package com.app.tgtg.customview;

import ag.n;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.vectordrawable.graphics.drawable.e;
import bg.r;
import bg.s;
import bg.t;
import e0.f;
import e40.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandableTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f8892m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f8893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f8894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ValueAnimator f8899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SpannableString f8900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public StaticLayout f8901i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f8902j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f8903k;
    public r l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.f8893a = "";
        this.f8894b = "";
        this.f8895c = 4;
        this.f8896d = context.getColor(R.color.holo_purple);
        this.f8897e = true;
        this.f8900h = new SpannableString("");
        this.f8903k = true;
        setEllipsize(TextUtils.TruncateAt.END);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f1447b);
        typedArrayObtainStyledAttributes.getClass();
        int i12 = 0;
        String string = typedArrayObtainStyledAttributes.getString(0);
        setExpandAction(string == null ? this.f8894b : string);
        setExpandActionColor(typedArrayObtainStyledAttributes.getColor(1, this.f8896d));
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        setOriginalText(string2 == null ? this.f8893a : string2);
        setLimitedMaxLines(typedArrayObtainStyledAttributes.getInt(3, this.f8895c));
        int i13 = 2;
        this.f8903k = typedArrayObtainStyledAttributes.getBoolean(2, true);
        if (getMaxLines() == -1 || this.f8895c <= getMaxLines()) {
            typedArrayObtainStyledAttributes.recycle();
            setOnFocusChangeListener(new s(this, i12));
            setOnClickListener(new ax.s(this, i13));
            return;
        }
        a.g(kotlin.text.s.c("\n                maxLines (" + getMaxLines() + ") must be greater than or equal to limitedMaxLines (" + this.f8895c + "). \n                maxLines can be -1 if there is no upper limit for lineCount.\n            "));
        throw null;
    }

    public static /* synthetic */ void g(ExpandableTextView expandableTextView, boolean z11) {
        expandableTextView.f((expandableTextView.getMeasuredWidth() - expandableTextView.getCompoundPaddingStart()) - expandableTextView.getCompoundPaddingEnd(), z11);
    }

    private final void setExpandAction(String str) {
        this.f8894b = str;
        int length = String.valueOf((char) 8230).length();
        SpannableString spannableString = new SpannableString(f.k("… ", str));
        this.f8900h = spannableString;
        spannableString.setSpan(new ForegroundColorSpan(this.f8896d), length, this.f8900h.length(), 33);
        g(this, true);
    }

    public final StaticLayout d(int i11, int i12, CharSequence charSequence) {
        if (i12 < 0) {
            i12 = 0;
        }
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), i12).setIncludePad(false).setMaxLines(i11).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).build();
        staticLayoutBuild.getClass();
        return staticLayoutBuild;
    }

    public final void e() {
        r rVar = this.l;
        if (rVar != null) {
            rVar.e();
        }
        if (!this.f8903k) {
            setOnClickListener(null);
            setClickable(false);
        }
        if (Intrinsics.areEqual(this.f8893a, this.f8902j)) {
            this.f8897e = !this.f8897e;
            return;
        }
        int height = getHeight();
        setText(this.f8897e ? this.f8893a : this.f8902j);
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 0));
        int measuredHeight = getMeasuredHeight();
        ValueAnimator valueAnimator = this.f8899g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        long jAbs = ((long) Math.abs(measuredHeight - height)) * 2;
        if (jAbs > 100) {
            jAbs = 100;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, measuredHeight);
        valueAnimatorOfInt.setInterpolator(new u8.a(1));
        valueAnimatorOfInt.setDuration(jAbs);
        valueAnimatorOfInt.addUpdateListener(new t(this, 0));
        valueAnimatorOfInt.addListener(new e(this, 1));
        valueAnimatorOfInt.start();
        this.f8899g = valueAnimatorOfInt;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.customview.ExpandableTextView.f(int, boolean):void");
    }

    public final boolean getCollapsed() {
        return this.f8897e;
    }

    public final int getExpandActionColor() {
        return this.f8896d;
    }

    public final int getLimitedMaxLines() {
        return this.f8895c;
    }

    @NotNull
    public final String getOriginalText() {
        return this.f8893a;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f8899g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i11, int i12) {
        ValueAnimator valueAnimator;
        int size = (View.MeasureSpec.getSize(i11) - getCompoundPaddingStart()) - getCompoundPaddingEnd();
        if (size == this.f8898f || ((valueAnimator = this.f8899g) != null && valueAnimator.isRunning())) {
            super.onMeasure(i11, i12);
            return;
        }
        this.f8898f = size;
        f(size, true);
        super.onMeasure(i11, i12);
    }

    @Override // android.widget.TextView
    public void setEllipsize(@Nullable TextUtils.TruncateAt truncateAt) {
        super.setEllipsize(TextUtils.TruncateAt.END);
    }

    public final void setExpandActionColor(int i11) {
        this.f8896d = i11;
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i11);
        int length = String.valueOf((char) 8230).length();
        SpannableString spannableString = this.f8900h;
        spannableString.setSpan(foregroundColorSpan, length, spannableString.length(), 33);
        g(this, true);
    }

    public final void setExpandActivatedCallback(@NotNull r rVar) {
        rVar.getClass();
        this.l = rVar;
    }

    public final void setLimitedMaxLines(int i11) {
        if (getMaxLines() == -1 || i11 <= getMaxLines()) {
            this.f8895c = i11;
            g(this, false);
            return;
        }
        a.g(kotlin.text.s.c("\n                    maxLines (" + getMaxLines() + ") must be greater than or equal to limitedMaxLines (" + i11 + "). \n                    maxLines can be -1 if there is no upper limit for lineCount.\n                "));
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i11) {
        int i12;
        if (i11 == -1 || (i12 = this.f8895c) <= i11) {
            super.setMaxLines(i11);
            g(this, false);
            return;
        }
        a.g(kotlin.text.s.c("\n                maxLines (" + i11 + ") must be greater than or equal to limitedMaxLines (" + i12 + "). \n                maxLines can be -1 if there is no upper limit for lineCount.\n            "));
    }

    public final void setOriginalText(@NotNull String str) {
        str.getClass();
        this.f8893a = str;
        g(this, false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ ExpandableTextView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
