package y00;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w0 extends w1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f45257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f45258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f45259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u0 f45260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u0 f45261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u0 f45262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u0 f45263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u0 f45264k;
    public final u0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u0 f45265m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u0 f45266n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u0 f45267o;

    public w0(n1 n1Var) {
        super(n1Var);
        this.f45257d = (char) 0;
        this.f45258e = -1L;
        this.f45260g = new u0(this, 6, false, false);
        this.f45261h = new u0(this, 6, true, false);
        this.f45262i = new u0(this, 6, false, true);
        this.f45263j = new u0(this, 5, false, false);
        this.f45264k = new u0(this, 5, true, false);
        this.l = new u0(this, 5, false, true);
        this.f45265m = new u0(this, 4, false, false);
        this.f45266n = new u0(this, 3, false, false);
        this.f45267o = new u0(this, 2, false, false);
    }

    public static String A(boolean z11, String str, Object obj, Object obj2, Object obj3) {
        String strB = B(obj, z11);
        String strB2 = B(obj2, z11);
        String strB3 = B(obj3, z11);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strB)) {
            sb2.append(str2);
            sb2.append(strB);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strB2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strB2);
        }
        if (!TextUtils.isEmpty(strB3)) {
            sb2.append(str3);
            sb2.append(strB3);
        }
        return sb2.toString();
    }

    public static String B(Object obj, boolean z11) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z11) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb2 = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            org.bouncycastle.jcajce.provider.asymmetric.a.v(sb2, str, jRound, "...");
            sb2.append(str);
            sb2.append(jRound2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof v0 ? ((v0) obj).f45248a : z11 ? "-" : obj.toString();
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z11 ? th2.getClass().getName() : th2.toString());
        String canonicalName = n1.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length2 = stackTrace.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i11];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb3.append(": ");
                    sb3.append(stackTraceElement);
                    break;
                }
            }
            i11++;
        }
        return sb3.toString();
    }

    public static v0 x(String str) {
        if (str == null) {
            return null;
        }
        return new v0(str);
    }

    @Override // y00.w1
    public final boolean q() {
        return false;
    }

    public final u0 t() {
        return this.f45260g;
    }

    public final u0 u() {
        return this.f45263j;
    }

    public final u0 v() {
        return this.f45266n;
    }

    public final u0 w() {
        return this.f45267o;
    }

    public final void y(int i11, boolean z11, boolean z12, String str, Object obj, Object obj2, Object obj3) {
        if (!z11 && Log.isLoggable(z(), i11)) {
            Log.println(i11, z(), A(false, str, obj, obj2, obj3));
        }
        if (z12 || i11 < 5) {
            return;
        }
        com.google.android.gms.common.internal.i0.h(str);
        l1 l1Var = ((n1) this.f21216b).f44988g;
        if (l1Var == null) {
            Log.println(6, z(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!l1Var.f45268c) {
                Log.println(6, z(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i11 >= 9) {
                i11 = 8;
            }
            l1Var.y(new t0(this, i11, str, obj, obj2, obj3));
        }
    }

    public final String z() {
        String str;
        synchronized (this) {
            try {
                if (this.f45259f == null) {
                    ((n1) ((n1) this.f21216b).f44985d.f21216b).getClass();
                    this.f45259f = "FA";
                }
                com.google.android.gms.common.internal.i0.h(this.f45259f);
                str = this.f45259f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
