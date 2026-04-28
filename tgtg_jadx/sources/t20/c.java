package t20;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.app.tgtg.R;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f39672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f39673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f39674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EditText f39675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ax.s f39676j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final bg.s f39677k;
    public AnimatorSet l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f39678m;

    public c(l lVar) {
        super(lVar);
        this.f39676j = new ax.s(this, 21);
        this.f39677k = new bg.s(this, 6);
        this.f39671e = ox.h.P(lVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f39672f = ox.h.P(lVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f39673g = ox.h.Q(lVar.getContext(), R.attr.motionEasingLinearInterpolator, k10.a.f25730a);
        this.f39674h = ox.h.Q(lVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, k10.a.f25733d);
    }

    @Override // t20.m
    public final void a() {
        if (this.f39721b.f39713p != null) {
            return;
        }
        s(t());
    }

    @Override // t20.m
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // t20.m
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // t20.m
    public final View.OnFocusChangeListener e() {
        return this.f39677k;
    }

    @Override // t20.m
    public final View.OnClickListener f() {
        return this.f39676j;
    }

    @Override // t20.m
    public final View.OnFocusChangeListener g() {
        return this.f39677k;
    }

    @Override // t20.m
    public final void l(EditText editText) {
        this.f39675i = editText;
        this.f39720a.setEndIconVisible(t());
    }

    @Override // t20.m
    public final void o(boolean z11) {
        if (this.f39721b.f39713p == null) {
            return;
        }
        s(z11);
    }

    @Override // t20.m
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f39674h);
        valueAnimatorOfFloat.setDuration(this.f39672f);
        final int i11 = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: t20.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f39668b;

            {
                this.f39668b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        this.f39668b.f39723d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = this.f39668b.f39723d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f39673g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i12 = this.f39671e;
        valueAnimatorOfFloat2.setDuration(i12);
        final int i13 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: t20.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f39668b;

            {
                this.f39668b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i13) {
                    case 0:
                        this.f39668b.f39723d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = this.f39668b.f39723d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.l.addListener(new b(this, i13));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i12);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: t20.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f39668b;

            {
                this.f39668b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i13) {
                    case 0:
                        this.f39668b.f39723d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = this.f39668b.f39723d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f39678m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new b(this, i11));
    }

    @Override // t20.m
    public final void r() {
        EditText editText = this.f39675i;
        if (editText != null) {
            editText.post(new m0.l(this, 19));
        }
    }

    public final void s(boolean z11) {
        boolean z12 = this.f39721b.c() == z11;
        if (z11 && !this.l.isRunning()) {
            this.f39678m.cancel();
            this.l.start();
            if (z12) {
                this.l.end();
                return;
            }
            return;
        }
        if (z11) {
            return;
        }
        this.l.cancel();
        this.f39678m.start();
        if (z12) {
            this.f39678m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.f39675i;
        if (editText != null) {
            return (editText.hasFocus() || this.f39723d.hasFocus()) && this.f39675i.getText().length() > 0;
        }
        return false;
    }
}
