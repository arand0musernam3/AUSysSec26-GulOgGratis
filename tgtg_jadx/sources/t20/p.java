package t20;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.app.tgtg.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {
    public ColorStateList A;
    public Typeface B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f39733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f39734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f39735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f39736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextInputLayout f39737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f39738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f39739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f39740k;
    public AnimatorSet l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f39741m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f39742n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f39743o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f39744p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f39745q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AppCompatTextView f39746r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f39747s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f39748t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f39749u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f39750v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f39751w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f39752x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AppCompatTextView f39753y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f39754z;

    public p(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f39736g = context;
        this.f39737h = textInputLayout;
        this.f39741m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f39730a = ox.h.P(context, R.attr.motionDurationShort4, 217);
        this.f39731b = ox.h.P(context, R.attr.motionDurationMedium4, 167);
        this.f39732c = ox.h.P(context, R.attr.motionDurationShort4, 167);
        this.f39733d = ox.h.Q(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, k10.a.f25733d);
        LinearInterpolator linearInterpolator = k10.a.f25730a;
        this.f39734e = ox.h.Q(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f39735f = ox.h.Q(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(AppCompatTextView appCompatTextView, int i11) {
        if (this.f39738i == null && this.f39740k == null) {
            Context context = this.f39736g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f39738i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f39738i;
            TextInputLayout textInputLayout = this.f39737h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f39740k = new FrameLayout(context);
            this.f39738i.addView(this.f39740k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i11 == 0 || i11 == 1) {
            this.f39740k.setVisibility(0);
            this.f39740k.addView(appCompatTextView);
        } else {
            this.f39738i.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f39738i.setVisibility(0);
        this.f39739j++;
    }

    public final void b() {
        if (this.f39738i != null) {
            TextInputLayout textInputLayout = this.f39737h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f39736g;
                boolean zW = h0.g.w(context);
                LinearLayout linearLayout = this.f39738i;
                int paddingStart = editText.getPaddingStart();
                if (zW) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zW) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zW) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z11, AppCompatTextView appCompatTextView, int i11, int i12, int i13) {
        if (appCompatTextView == null || !z11) {
            return;
        }
        if (i11 == i13 || i11 == i12) {
            boolean z12 = i13 == i11;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, z12 ? 1.0f : 0.0f);
            int i14 = this.f39732c;
            objectAnimatorOfFloat.setDuration(z12 ? this.f39731b : i14);
            objectAnimatorOfFloat.setInterpolator(z12 ? this.f39734e : this.f39735f);
            if (i11 == i13 && i12 != 0) {
                objectAnimatorOfFloat.setStartDelay(i14);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i13 != i11 || i12 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.f39741m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f39730a);
            objectAnimatorOfFloat2.setInterpolator(this.f39733d);
            objectAnimatorOfFloat2.setStartDelay(i14);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i11) {
        if (i11 == 1) {
            return this.f39746r;
        }
        if (i11 != 2) {
            return null;
        }
        return this.f39753y;
    }

    public final void f() {
        this.f39744p = null;
        c();
        if (this.f39742n == 1) {
            if (!this.f39752x || TextUtils.isEmpty(this.f39751w)) {
                this.f39743o = 0;
            } else {
                this.f39743o = 2;
            }
        }
        i(this.f39742n, this.f39743o, h(this.f39746r, ""));
    }

    public final void g(AppCompatTextView appCompatTextView, int i11) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f39738i;
        if (linearLayout == null) {
            return;
        }
        if ((i11 == 0 || i11 == 1) && (frameLayout = this.f39740k) != null) {
            frameLayout.removeView(appCompatTextView);
        } else {
            linearLayout.removeView(appCompatTextView);
        }
        int i12 = this.f39739j - 1;
        this.f39739j = i12;
        LinearLayout linearLayout2 = this.f39738i;
        if (i12 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f39737h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f39743o == this.f39742n && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i11, int i12, boolean z11) {
        TextView textViewE;
        TextView textViewE2;
        if (i11 == i12) {
            return;
        }
        if (z11) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f39752x, this.f39753y, 2, i11, i12);
            d(arrayList, this.f39745q, this.f39746r, 1, i11, i12);
            dx.f.x(animatorSet, arrayList);
            animatorSet.addListener(new n(this, i12, e(i11), i11, e(i12)));
            animatorSet.start();
        } else if (i11 != i12) {
            if (i12 != 0 && (textViewE2 = e(i12)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i11 != 0 && (textViewE = e(i11)) != null) {
                textViewE.setVisibility(4);
                if (i11 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            this.f39742n = i12;
        }
        TextInputLayout textInputLayout = this.f39737h;
        textInputLayout.t();
        textInputLayout.w(z11, false);
        textInputLayout.z();
    }
}
