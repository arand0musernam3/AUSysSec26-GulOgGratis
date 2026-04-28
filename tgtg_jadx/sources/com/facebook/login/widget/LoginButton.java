package com.facebook.login.widget;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.activity.result.ActivityResultRegistry;
import ax.a0;
import ax.t;
import c40.q;
import c50.w;
import com.app.tgtg.R;
import com.google.firebase.messaging.r;
import cy.b0;
import cy.f0;
import cy.h0;
import cy.z;
import dy.a;
import dy.b;
import dy.c;
import dy.d;
import dy.f;
import dy.i;
import dy.j;
import h.e;
import j4.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.collections.n0;
import kotlin.collections.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.g;
import tx.h;
import u70.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class LoginButton extends t {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f10988y = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f10990j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f10991k;
    public final a l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i f10993n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d f10994o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f10995p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public j f10996q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public q f10997r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public u70.j f10998s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Float f10999t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11000u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f11001v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public tx.i f11002w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public e f11003x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginButton(Context context, AttributeSet attributeSet, int i11, int i12, String str, String str2) {
        super(context, attributeSet, i11, i12, str, str2);
        context.getClass();
        str.getClass();
        str2.getClass();
        a aVar = new a();
        aVar.f15216a = cy.e.FRIENDS;
        aVar.f15217b = n0.f26529a;
        aVar.f15218c = cy.q.NATIVE_WITH_FALLBACK;
        aVar.f15219d = "rerequest";
        aVar.f15220e = f0.FACEBOOK;
        this.l = aVar;
        this.f10993n = i.BLUE;
        d.Companion.getClass();
        this.f10994o = d.DEFAULT;
        this.f10995p = 6000L;
        this.f10998s = l.b(f.f15224a);
        this.f11000u = 255;
        this.f11001v = s.e();
    }

    @Override // ax.t
    public final void a(Context context, AttributeSet attributeSet, int i11, int i12) {
        Set set = yx.a.f46339a;
        if (set.contains(this)) {
            return;
        }
        try {
            context.getClass();
            super.a(context, attributeSet, i11, i12);
            setInternalOnClickListener(getNewLoginClickListener());
            j(context, attributeSet, i11, i12);
            if (isInEditMode()) {
                setBackgroundColor(getResources().getColor(R.color.com_facebook_blue));
                setLoginText("Continue with Facebook");
            } else {
                this.f10997r = new q(this);
            }
            m();
            l();
            if (!set.contains(this)) {
                try {
                    getBackground().setAlpha(this.f11000u);
                } catch (Throwable th2) {
                    yx.a.a(this, th2);
                }
            }
            k();
        } catch (Throwable th3) {
            yx.a.a(this, th3);
        }
    }

    public final void g() {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            int i11 = dy.e.$EnumSwitchMapping$0[this.f10994o.ordinal()];
            if (i11 == 1) {
                if (getContext() == null) {
                    throw new NullPointerException("Argument 'context' cannot be null");
                }
                a0.c().execute(new r(10, a0.b(), this));
                return;
            }
            if (i11 != 2) {
                return;
            }
            String string = getResources().getString(R.string.com_facebook_tooltip_default);
            string.getClass();
            h(string);
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    @NotNull
    public final String getAuthType() {
        return this.l.f15219d;
    }

    @Nullable
    public final ax.q getCallbackManager() {
        return this.f11002w;
    }

    @NotNull
    public final cy.e getDefaultAudience() {
        return this.l.f15216a;
    }

    @Override // ax.t
    public int getDefaultRequestCode() {
        if (yx.a.f46339a.contains(this)) {
            return 0;
        }
        try {
            return h.Login.a();
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return 0;
        }
    }

    @Override // ax.t
    public int getDefaultStyleResource() {
        return R.style.com_facebook_loginview_default_style;
    }

    @NotNull
    public final String getLoggerID() {
        return this.f11001v;
    }

    @NotNull
    public final cy.q getLoginBehavior() {
        return this.l.f15218c;
    }

    public final int getLoginButtonContinueLabel() {
        return R.string.com_facebook_loginview_log_in_button_continue;
    }

    @NotNull
    public final u70.j getLoginManagerLazy() {
        return this.f10998s;
    }

    @NotNull
    public final f0 getLoginTargetApp() {
        return this.l.f15220e;
    }

    @Nullable
    public final String getLoginText() {
        return this.f10990j;
    }

    @Nullable
    public final String getLogoutText() {
        return this.f10991k;
    }

    @Nullable
    public final String getMessengerPageId() {
        return this.l.f15221f;
    }

    @NotNull
    public b getNewLoginClickListener() {
        return new b(this);
    }

    @NotNull
    public final List<String> getPermissions() {
        return this.l.f15217b;
    }

    @NotNull
    public final a getProperties() {
        return this.l;
    }

    public final boolean getResetMessengerState() {
        return this.l.f15222g;
    }

    public final boolean getShouldSkipAccountDeduplication() {
        this.l.getClass();
        return false;
    }

    public final long getToolTipDisplayTime() {
        return this.f10995p;
    }

    @NotNull
    public final d getToolTipMode() {
        return this.f10994o;
    }

    @NotNull
    public final i getToolTipStyle() {
        return this.f10993n;
    }

    public final void h(String str) {
        Set set = yx.a.f46339a;
        if (set.contains(this)) {
            return;
        }
        try {
            j jVar = new j(str, this);
            i iVar = this.f10993n;
            if (!set.contains(jVar)) {
                try {
                    iVar.getClass();
                    jVar.f15237g = iVar;
                } catch (Throwable th2) {
                    yx.a.a(jVar, th2);
                }
            }
            long j9 = this.f10995p;
            if (!yx.a.f46339a.contains(jVar)) {
                try {
                    jVar.f15231a = j9;
                } catch (Throwable th3) {
                    yx.a.a(jVar, th3);
                }
            }
            jVar.i();
            this.f10996q = jVar;
        } catch (Throwable th4) {
            yx.a.a(this, th4);
        }
    }

    public final int i(String str) {
        if (yx.a.f46339a.contains(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + b(str) + getCompoundPaddingRight();
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return 0;
        }
    }

    public final void j(Context context, AttributeSet attributeSet, int i11, int i12) {
        d dVar;
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            context.getClass();
            c cVar = d.Companion;
            cVar.getClass();
            this.f10994o = d.DEFAULT;
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h0.f13511a, i11, i12);
            typedArrayObtainStyledAttributes.getClass();
            try {
                this.f10989i = typedArrayObtainStyledAttributes.getBoolean(0, true);
                setLoginText(typedArrayObtainStyledAttributes.getString(3));
                setLogoutText(typedArrayObtainStyledAttributes.getString(4));
                cVar.getClass();
                int i13 = typedArrayObtainStyledAttributes.getInt(5, d.DEFAULT.c());
                cVar.getClass();
                d[] dVarArrValues = d.values();
                int length = dVarArrValues.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        dVar = null;
                        break;
                    }
                    dVar = dVarArrValues[i14];
                    if (dVar.c() == i13) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (dVar == null) {
                    d.Companion.getClass();
                    dVar = d.DEFAULT;
                }
                this.f10994o = dVar;
                if (typedArrayObtainStyledAttributes.hasValue(1)) {
                    this.f10999t = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(1, 0.0f));
                }
                int integer = typedArrayObtainStyledAttributes.getInteger(2, 255);
                this.f11000u = integer;
                int iMax = Math.max(0, integer);
                this.f11000u = iMax;
                this.f11000u = Math.min(255, iMax);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } catch (Throwable th3) {
            yx.a.a(this, th3);
        }
    }

    public final void k() {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            setCompoundDrawablesWithIntrinsicBounds(b0.a0.x(getContext(), R.drawable.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final void l() {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            Float f11 = this.f10999t;
            if (f11 != null) {
                float fFloatValue = f11.floatValue();
                Drawable background = getBackground();
                if (Build.VERSION.SDK_INT >= 29 && (background instanceof StateListDrawable)) {
                    int stateCount = ((StateListDrawable) background).getStateCount();
                    for (int i11 = 0; i11 < stateCount; i11++) {
                        Drawable stateDrawable = ((StateListDrawable) background).getStateDrawable(i11);
                        GradientDrawable gradientDrawable = stateDrawable instanceof GradientDrawable ? (GradientDrawable) stateDrawable : null;
                        if (gradientDrawable != null) {
                            gradientDrawable.setCornerRadius(fFloatValue);
                        }
                    }
                }
                if (background instanceof GradientDrawable) {
                    ((GradientDrawable) background).setCornerRadius(fFloatValue);
                }
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final void m() {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            Resources resources = getResources();
            if (!isInEditMode()) {
                Date date = ax.b.l;
                if (g.B()) {
                    String string = this.f10991k;
                    if (string == null) {
                        string = resources.getString(R.string.com_facebook_loginview_log_out_button);
                    }
                    setText(string);
                    return;
                }
            }
            String str = this.f10990j;
            if (str != null) {
                setText(str);
                return;
            }
            String string2 = resources.getString(getLoginButtonContinueLabel());
            string2.getClass();
            int width = getWidth();
            if (width != 0 && i(string2) > width) {
                string2 = resources.getString(R.string.com_facebook_loginview_log_in_button);
                string2.getClass();
            }
            setText(string2);
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    @Override // ax.t, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        boolean z11;
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (getContext() instanceof h.f) {
                Object context = getContext();
                context.getClass();
                ActivityResultRegistry activityResultRegistry = ((h.f) context).getActivityResultRegistry();
                b0 b0Var = (b0) this.f10998s.getValue();
                tx.i iVar = this.f11002w;
                String str = this.f11001v;
                b0Var.getClass();
                this.f11003x = activityResultRegistry.c("facebook-login", new z(b0Var, iVar, str), new w(20));
            }
            q qVar = this.f10997r;
            if (qVar == null || !(z11 = qVar.f7092b)) {
                return;
            }
            if (!z11) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                ((d9.c) qVar.f7094d).b((tx.d) qVar.f7093c, intentFilter);
                qVar.f7092b = true;
            }
            m();
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            super.onDetachedFromWindow();
            e eVar = this.f11003x;
            if (eVar != null) {
                eVar.b();
            }
            q qVar = this.f10997r;
            if (qVar != null && qVar.f7092b) {
                ((d9.c) qVar.f7094d).d((tx.d) qVar.f7093c);
                qVar.f7092b = false;
            }
            j jVar = this.f10996q;
            if (jVar != null) {
                jVar.h();
            }
            this.f10996q = null;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    @Override // ax.t, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            canvas.getClass();
            super.onDraw(canvas);
            if (this.f10992m || isInEditMode()) {
                return;
            }
            this.f10992m = true;
            g();
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            super.onLayout(z11, i11, i12, i13, i14);
            try {
                m();
            } catch (Throwable th2) {
                th = th2;
                yx.a.a(this, th);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i11, int i12) {
        Set set = yx.a.f46339a;
        if (set.contains(this)) {
            return;
        }
        try {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil(Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom))) + getCompoundPaddingBottom();
            Resources resources = getResources();
            int i13 = 0;
            if (!set.contains(this)) {
                try {
                    Resources resources2 = getResources();
                    String string = this.f10990j;
                    if (string == null) {
                        string = resources2.getString(R.string.com_facebook_loginview_log_in_button_continue);
                        int i14 = i(string);
                        if (View.resolveSize(i14, i11) < i14) {
                            string = resources2.getString(R.string.com_facebook_loginview_log_in_button);
                        }
                    }
                    i13 = i(string);
                } catch (Throwable th2) {
                    yx.a.a(this, th2);
                }
            }
            String string2 = this.f10991k;
            if (string2 == null) {
                string2 = resources.getString(R.string.com_facebook_loginview_log_out_button);
                string2.getClass();
            }
            setMeasuredDimension(View.resolveSize(Math.max(i13, i(string2)), i11), compoundPaddingTop);
        } catch (Throwable th3) {
            yx.a.a(this, th3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i11) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            view.getClass();
            super.onVisibilityChanged(view, i11);
            if (i11 != 0) {
                j jVar = this.f10996q;
                if (jVar != null) {
                    jVar.h();
                }
                this.f10996q = null;
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final void setAuthType(@NotNull String str) {
        str.getClass();
        a aVar = this.l;
        aVar.getClass();
        str.getClass();
        aVar.f15219d = str;
    }

    public final void setDefaultAudience(@NotNull cy.e eVar) {
        eVar.getClass();
        a aVar = this.l;
        aVar.getClass();
        eVar.getClass();
        aVar.f15216a = eVar;
    }

    public final void setLoginBehavior(@NotNull cy.q qVar) {
        qVar.getClass();
        a aVar = this.l;
        aVar.getClass();
        qVar.getClass();
        aVar.f15218c = qVar;
    }

    public final void setLoginManagerLazy(@NotNull u70.j jVar) {
        jVar.getClass();
        this.f10998s = jVar;
    }

    public final void setLoginTargetApp(@NotNull f0 f0Var) {
        f0Var.getClass();
        a aVar = this.l;
        aVar.getClass();
        f0Var.getClass();
        aVar.f15220e = f0Var;
    }

    public final void setLoginText(@Nullable String str) {
        this.f10990j = str;
        m();
    }

    public final void setLogoutText(@Nullable String str) {
        this.f10991k = str;
        m();
    }

    public final void setMessengerPageId(@Nullable String str) {
        this.l.f15221f = str;
    }

    public final void setPermissions(@NotNull String... strArr) {
        strArr.getClass();
        ArrayList arrayListW = y.w(Arrays.copyOf(strArr, strArr.length));
        a aVar = this.l;
        aVar.getClass();
        aVar.f15217b = arrayListW;
    }

    @u70.d
    public final void setPublishPermissions(@NotNull String... strArr) {
        strArr.getClass();
        ArrayList arrayListW = y.w(Arrays.copyOf(strArr, strArr.length));
        a aVar = this.l;
        aVar.getClass();
        aVar.f15217b = arrayListW;
    }

    @u70.d
    public final void setReadPermissions(@NotNull String... strArr) {
        strArr.getClass();
        ArrayList arrayListW = y.w(Arrays.copyOf(strArr, strArr.length));
        a aVar = this.l;
        aVar.getClass();
        aVar.f15217b = arrayListW;
    }

    public final void setResetMessengerState(boolean z11) {
        this.l.f15222g = z11;
    }

    public final void setToolTipDisplayTime(long j9) {
        this.f10995p = j9;
    }

    public final void setToolTipMode(@NotNull d dVar) {
        dVar.getClass();
        this.f10994o = dVar;
    }

    public final void setToolTipStyle(@NotNull i iVar) {
        iVar.getClass();
        this.f10993n = iVar;
    }

    public final void setPermissions(@NotNull List<String> list) {
        list.getClass();
        a aVar = this.l;
        aVar.getClass();
        aVar.f15217b = list;
    }

    @u70.d
    public final void setPublishPermissions(@NotNull List<String> list) {
        list.getClass();
        a aVar = this.l;
        aVar.getClass();
        aVar.f15217b = list;
    }

    @u70.d
    public final void setReadPermissions(@NotNull List<String> list) {
        list.getClass();
        a aVar = this.l;
        aVar.getClass();
        aVar.f15217b = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginButton(@NotNull Context context) {
        this(context, null, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, "fb_login_button_create", "fb_login_button_did_tap");
        context.getClass();
    }
}
