package t20;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.app.tgtg.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import d40.t1;
import e20.i0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f39761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f39762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f39763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f39764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f39765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f39766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView.ScaleType f39768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View.OnLongClickListener f39769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f39770j;

    public s(TextInputLayout textInputLayout, j30.g gVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f39761a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f39764d = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f39762b = appCompatTextView;
        if (h0.g.w(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f39769i;
        checkableImageButton.setOnClickListener(null);
        t1.I(checkableImageButton, onLongClickListener);
        this.f39769i = null;
        checkableImageButton.setOnLongClickListener(null);
        t1.I(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) gVar.f24503c;
        if (typedArray.hasValue(70)) {
            this.f39765e = h0.g.q(getContext(), gVar, 70);
        }
        if (typedArray.hasValue(71)) {
            this.f39766f = i0.o(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(gVar.k(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            i4.a.f("startIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.f39767g) {
            this.f39767g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeZ = t1.z(typedArray.getInt(69, -1));
            this.f39768h = scaleTypeZ;
            checkableImageButton.setScaleType(scaleTypeZ);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            appCompatTextView.setTextColor(gVar.j(62));
        }
        CharSequence text2 = typedArray.getText(60);
        this.f39763c = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        e();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f39764d;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.f39762b.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f39764d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f39765e;
            PorterDuff.Mode mode = this.f39766f;
            TextInputLayout textInputLayout = this.f39761a;
            t1.s(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            t1.E(textInputLayout, checkableImageButton, this.f39765e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f39769i;
        checkableImageButton.setOnClickListener(null);
        t1.I(checkableImageButton, onLongClickListener);
        this.f39769i = null;
        checkableImageButton.setOnLongClickListener(null);
        t1.I(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z11) {
        CheckableImageButton checkableImageButton = this.f39764d;
        if ((checkableImageButton.getVisibility() == 0) != z11) {
            checkableImageButton.setVisibility(z11 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        EditText editText = this.f39761a.f12646e;
        if (editText == null) {
            return;
        }
        this.f39762b.setPaddingRelative(this.f39764d.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i11 = (this.f39763c == null || this.f39770j) ? 8 : 0;
        setVisibility((this.f39764d.getVisibility() == 0 || i11 == 0) ? 0 : 8);
        this.f39762b.setVisibility(i11);
        this.f39761a.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        d();
    }
}
