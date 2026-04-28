package y00;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends h2.s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f44758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f44759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f44760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f44761f;

    public final boolean A(String str, f0 f0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) f0Var.a(null)).booleanValue();
        }
        String strE = this.f44760e.e(str, f0Var.f44747a);
        return TextUtils.isEmpty(strE) ? ((Boolean) f0Var.a(null)).booleanValue() : ((Boolean) f0Var.a(Boolean.valueOf("1".equals(strE)))).booleanValue();
    }

    public final Bundle B() {
        n1 n1Var = (n1) this.f21216b;
        try {
            Context context = n1Var.f44982a;
            Context context2 = n1Var.f44982a;
            w0 w0Var = n1Var.f44987f;
            if (context.getPackageManager() == null) {
                n1.m(w0Var);
                w0Var.f45260g.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoB = xz.c.a(context2).b(128, context2.getPackageName());
            if (applicationInfoB != null) {
                return applicationInfoB.metaData;
            }
            n1.m(w0Var);
            w0Var.f45260g.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e5) {
            w0 w0Var2 = n1Var.f44987f;
            n1.m(w0Var2);
            w0Var2.f45260g.b(e5, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean C(String str) {
        com.google.android.gms.common.internal.i0.e(str);
        Bundle bundleB = B();
        if (bundleB != null) {
            if (bundleB.containsKey(str)) {
                return Boolean.valueOf(bundleB.getBoolean(str));
            }
            return null;
        }
        w0 w0Var = ((n1) this.f21216b).f44987f;
        n1.m(w0Var);
        w0Var.f45260g.a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean D() {
        ((n1) this.f21216b).getClass();
        Boolean boolC = C("firebase_analytics_collection_deactivated");
        return boolC != null && boolC.booleanValue();
    }

    public final boolean E() {
        Boolean boolC = C("google_analytics_automatic_screen_reporting_enabled");
        return boolC == null || boolC.booleanValue();
    }

    public final y1 F(String str, boolean z11) {
        Object obj;
        com.google.android.gms.common.internal.i0.e(str);
        n1 n1Var = (n1) this.f21216b;
        Bundle bundleB = B();
        if (bundleB == null) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45260g.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleB.get(str);
        }
        if (obj == null) {
            return y1.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return y1.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return y1.DENIED;
        }
        if (z11 && "eu_consent_policy".equals(obj)) {
            return y1.POLICY;
        }
        w0 w0Var2 = n1Var.f44987f;
        n1.m(w0Var2);
        w0Var2.f45263j.b(str, "Invalid manifest metadata for");
        return y1.UNINITIALIZED;
    }

    public final boolean q(String str) {
        n1.k(((n1) this.f21216b).f44990i);
        if (r4.S((String) g0.f44782g1.a(null), str) || r4.S((String) g0.f44785h1.a(null), str) || r4.S((String) g0.f44788i1.a(null), str)) {
            return true;
        }
        return "1".equals(this.f44760e.e(str, "gaia_collection_enabled"));
    }

    public final boolean r(String str) {
        return "1".equals(this.f44760e.e(str, "measurement.event_sampling_enabled"));
    }

    public final boolean s() {
        if (this.f44758c == null) {
            Boolean boolC = C("app_measurement_lite");
            this.f44758c = boolC;
            if (boolC == null) {
                this.f44758c = Boolean.FALSE;
            }
        }
        return this.f44758c.booleanValue() || !((n1) this.f21216b).f44983b;
    }

    public final String t(String str) {
        n1 n1Var = (n1) this.f21216b;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            com.google.android.gms.common.internal.i0.h(str2);
            return str2;
        } catch (ClassNotFoundException e5) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45260g.b(e5, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e11) {
            w0 w0Var2 = n1Var.f44987f;
            n1.m(w0Var2);
            w0Var2.f45260g.b(e11, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e12) {
            w0 w0Var3 = n1Var.f44987f;
            n1.m(w0Var3);
            w0Var3.f45260g.b(e12, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e13) {
            w0 w0Var4 = n1Var.f44987f;
            n1.m(w0Var4);
            w0Var4.f45260g.b(e13, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final int u(String str, boolean z11) {
        return Math.max(z11 ? Math.max(Math.min(y(str, g0.f44781g0), 500), 100) : 500, 256);
    }

    public final void v() {
        ((n1) this.f21216b).getClass();
    }

    public final String w(String str, f0 f0Var) {
        return TextUtils.isEmpty(str) ? (String) f0Var.a(null) : (String) f0Var.a(this.f44760e.e(str, f0Var.f44747a));
    }

    public final long x(String str, f0 f0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) f0Var.a(null)).longValue();
        }
        String strE = this.f44760e.e(str, f0Var.f44747a);
        if (TextUtils.isEmpty(strE)) {
            return ((Long) f0Var.a(null)).longValue();
        }
        try {
            return ((Long) f0Var.a(Long.valueOf(Long.parseLong(strE)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) f0Var.a(null)).longValue();
        }
    }

    public final int y(String str, f0 f0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) f0Var.a(null)).intValue();
        }
        String strE = this.f44760e.e(str, f0Var.f44747a);
        if (TextUtils.isEmpty(strE)) {
            return ((Integer) f0Var.a(null)).intValue();
        }
        try {
            return ((Integer) f0Var.a(Integer.valueOf(Integer.parseInt(strE)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) f0Var.a(null)).intValue();
        }
    }

    public final double z(String str, f0 f0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) f0Var.a(null)).doubleValue();
        }
        String strE = this.f44760e.e(str, f0Var.f44747a);
        if (TextUtils.isEmpty(strE)) {
            return ((Double) f0Var.a(null)).doubleValue();
        }
        try {
            return ((Double) f0Var.a(Double.valueOf(Double.parseDouble(strE)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) f0Var.a(null)).doubleValue();
        }
    }
}
