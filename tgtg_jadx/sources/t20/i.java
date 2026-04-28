package t20;

import a40.d0;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.app.tgtg.R;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f39684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f39685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f39686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ax.s f39687i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final bg.s f39688j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h f39689k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f39690m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f39691n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f39692o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AccessibilityManager f39693p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f39694q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f39695r;

    /* JADX WARN: Type inference failed for: r0v2, types: [t20.h] */
    public i(l lVar) {
        super(lVar);
        this.f39687i = new ax.s(this, 22);
        this.f39688j = new bg.s(this, 7);
        this.f39689k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: t20.h
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z11) {
                i iVar = this.f39682a;
                AutoCompleteTextView autoCompleteTextView = iVar.f39686h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                iVar.f39723d.setImportantForAccessibility(z11 ? 2 : 1);
            }
        };
        this.f39692o = LongCompanionObject.MAX_VALUE;
        this.f39684f = ox.h.P(lVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f39683e = ox.h.P(lVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f39685g = ox.h.Q(lVar.getContext(), R.attr.motionEasingLinearInterpolator, k10.a.f25730a);
    }

    @Override // t20.m
    public final void a() {
        if (this.f39693p.isTouchExplorationEnabled() && this.f39686h.getInputType() != 0 && !this.f39723d.hasFocus()) {
            this.f39686h.dismissDropDown();
        }
        this.f39686h.post(new m0.l(this, 20));
    }

    @Override // t20.m
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // t20.m
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // t20.m
    public final View.OnFocusChangeListener e() {
        return this.f39688j;
    }

    @Override // t20.m
    public final View.OnClickListener f() {
        return this.f39687i;
    }

    @Override // t20.m
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f39689k;
    }

    @Override // t20.m
    public final boolean i(int i11) {
        return i11 != 0;
    }

    @Override // t20.m
    public final boolean k() {
        return this.f39691n;
    }

    @Override // t20.m
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            d0.k("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f39686h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new l20.i(this, 1));
        this.f39686h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: t20.g
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                i iVar = this.f39681a;
                iVar.f39690m = true;
                iVar.f39692o = SystemClock.uptimeMillis();
                iVar.s(false);
            }
        });
        this.f39686h.setThreshold(0);
        TextInputLayout textInputLayout = this.f39720a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f39693p.isTouchExplorationEnabled()) {
            this.f39723d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // t20.m
    public final void m(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.f39686h.getInputType() == 0) {
            accessibilityNodeInfoCompat.h0(Spinner.class.getName());
        }
        if (accessibilityNodeInfoCompat.Q()) {
            accessibilityNodeInfoCompat.w0(null);
        }
    }

    @Override // t20.m
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.f39693p.isEnabled() && this.f39686h.getInputType() == 0) {
            boolean z11 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f39691n && !this.f39686h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z11) {
                t();
                this.f39690m = true;
                this.f39692o = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // t20.m
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f39685g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f39684f);
        int i11 = 14;
        valueAnimatorOfFloat.addUpdateListener(new bg.t(this, i11));
        this.f39695r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f39683e);
        valueAnimatorOfFloat2.addUpdateListener(new bg.t(this, i11));
        this.f39694q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new androidx.vectordrawable.graphics.drawable.e(this, 14));
        this.f39693p = (AccessibilityManager) this.f39722c.getSystemService("accessibility");
    }

    @Override // t20.m
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.f39686h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f39686h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z11) {
        if (this.f39691n != z11) {
            this.f39691n = z11;
            this.f39695r.cancel();
            this.f39694q.start();
        }
    }

    public final void t() {
        if (this.f39686h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f39692o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.f39690m = false;
        }
        if (this.f39690m) {
            this.f39690m = false;
            return;
        }
        s(!this.f39691n);
        boolean z11 = this.f39691n;
        AutoCompleteTextView autoCompleteTextView = this.f39686h;
        if (!z11) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.f39686h.showDropDown();
        }
    }
}
