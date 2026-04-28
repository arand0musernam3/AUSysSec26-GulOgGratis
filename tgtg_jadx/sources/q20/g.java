package q20;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.m0;
import com.app.tgtg.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.firebase.messaging.a0;
import e20.i0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f35933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f35934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f35935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewGroup f35936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f35937h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f35938i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SnackbarContentLayout f35939j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35940k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f35941m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35942n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35943o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35944p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35945q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f35946r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AccessibilityManager f35947s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final u8.a f35924u = k10.a.f25731b;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final LinearInterpolator f35925v = k10.a.f25730a;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final u8.a f35926w = k10.a.f25733d;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f35928y = {R.attr.snackbarStyle};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f35929z = g.class.getSimpleName();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Handler f35927x = new Handler(Looper.getMainLooper(), new c());
    public final d l = new d(this, 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f35948t = new e(this);

    public g(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        if (view == null) {
            i4.a.f("Transient bottom bar must have non-null content");
            throw null;
        }
        if (snackbarContentLayout == null) {
            i4.a.f("Transient bottom bar must have non-null callback");
            throw null;
        }
        this.f35936g = viewGroup;
        this.f35939j = snackbarContentLayout;
        this.f35937h = context;
        i0.e(context, i0.f15670a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f35928y);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        f fVar = (f) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.f35938i = fVar;
        fVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
            float actionTextColorAlpha = fVar.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout2.f12606b.setTextColor(w0.e.E(w0.e.y(R.attr.colorSurface, snackbarContentLayout2), actionTextColorAlpha, snackbarContentLayout2.f12606b.getCurrentTextColor()));
            }
            snackbarContentLayout2.setMaxInlineActionWidth(fVar.getMaxInlineActionWidth());
        }
        fVar.addView(view);
        fVar.setAccessibilityLiveRegion(1);
        fVar.setImportantForAccessibility(1);
        fVar.setFitsSystemWindows(true);
        ViewCompat.k0(fVar, new jd.f(this, 19));
        ViewCompat.b0(fVar, new com.google.android.material.button.g(this, 3));
        this.f35947s = (AccessibilityManager) context.getSystemService("accessibility");
        this.f35932c = ox.h.P(context, R.attr.motionDurationLong2, m0.DEFAULT_SWIPE_ANIMATION_DURATION);
        this.f35930a = ox.h.P(context, R.attr.motionDurationLong2, 150);
        this.f35931b = ox.h.P(context, R.attr.motionDurationMedium1, 75);
        this.f35933d = ox.h.Q(context, R.attr.motionEasingEmphasizedInterpolator, f35925v);
        this.f35935f = ox.h.Q(context, R.attr.motionEasingEmphasizedInterpolator, f35926w);
        this.f35934e = ox.h.Q(context, R.attr.motionEasingEmphasizedInterpolator, f35924u);
    }

    public final void a(int i11) {
        a0 a0VarK = a0.K();
        e eVar = this.f35948t;
        synchronized (a0VarK.f12779b) {
            try {
                if (a0VarK.R(eVar)) {
                    a0VarK.A((i) a0VarK.f12781d, i11);
                } else {
                    i iVar = (i) a0VarK.f12782e;
                    if (iVar != null && iVar.f35949a.get() == eVar) {
                        a0VarK.A((i) a0VarK.f12782e, i11);
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f35938i.getRootWindowInsets()) == null) {
            return;
        }
        this.f35944p = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        f();
    }

    public final void c() {
        a0 a0VarK = a0.K();
        e eVar = this.f35948t;
        synchronized (a0VarK.f12779b) {
            try {
                if (a0VarK.R(eVar)) {
                    a0VarK.f12781d = null;
                    if (((i) a0VarK.f12782e) != null) {
                        a0VarK.Y();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ViewParent parent = this.f35938i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f35938i);
        }
    }

    public final void d() {
        a0 a0VarK = a0.K();
        e eVar = this.f35948t;
        synchronized (a0VarK.f12779b) {
            try {
                if (a0VarK.R(eVar)) {
                    a0VarK.W((i) a0VarK.f12781d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z11 = true;
        AccessibilityManager accessibilityManager = this.f35947s;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z11 = false;
        }
        f fVar = this.f35938i;
        if (z11) {
            fVar.post(new d(this, 2));
            return;
        }
        if (fVar.getParent() != null) {
            fVar.setVisibility(0);
        }
        d();
    }

    public final void f() {
        f fVar = this.f35938i;
        ViewGroup.LayoutParams layoutParams = fVar.getLayoutParams();
        boolean z11 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = f35929z;
        if (!z11) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (fVar.f35922j == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (fVar.getParent() == null) {
            return;
        }
        int i11 = this.f35941m;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = fVar.f35922j;
        int i12 = rect.bottom + i11;
        int i13 = rect.left + this.f35942n;
        int i14 = rect.right + this.f35943o;
        int i15 = rect.top;
        boolean z12 = (marginLayoutParams.bottomMargin == i12 && marginLayoutParams.leftMargin == i13 && marginLayoutParams.rightMargin == i14 && marginLayoutParams.topMargin == i15) ? false : true;
        if (z12) {
            marginLayoutParams.bottomMargin = i12;
            marginLayoutParams.leftMargin = i13;
            marginLayoutParams.rightMargin = i14;
            marginLayoutParams.topMargin = i15;
            fVar.requestLayout();
        }
        if ((z12 || this.f35945q != this.f35944p) && Build.VERSION.SDK_INT >= 29 && this.f35944p > 0) {
            ViewGroup.LayoutParams layoutParams2 = fVar.getLayoutParams();
            if ((layoutParams2 instanceof s6.e) && (((s6.e) layoutParams2).f38839a instanceof SwipeDismissBehavior)) {
                d dVar = this.l;
                fVar.removeCallbacks(dVar);
                fVar.post(dVar);
            }
        }
    }
}
