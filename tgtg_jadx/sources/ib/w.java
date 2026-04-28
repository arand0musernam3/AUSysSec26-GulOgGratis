package ib;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f23764b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile w f23765c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23766a;

    public w(int i11) {
        this.f23766a = i11;
    }

    public static w d() {
        w wVar;
        synchronized (f23764b) {
            try {
                if (f23765c == null) {
                    f23765c = new w(3);
                }
                wVar = f23765c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public final void a(String str, String str2) {
        if (this.f23766a <= 3) {
            Log.d(str, str2);
        }
    }

    public final void b(String str, String str2) {
        if (this.f23766a <= 6) {
            Log.e(str, str2);
        }
    }

    public final void c(String str, String str2, Throwable th2) {
        if (this.f23766a <= 6) {
            Log.e(str, str2, th2);
        }
    }

    public final void e(String str, String str2) {
        if (this.f23766a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void g(String str, String str2) {
        if (this.f23766a <= 5) {
            Log.w(str, str2);
        }
    }
}
