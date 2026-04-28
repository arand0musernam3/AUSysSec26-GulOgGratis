package e7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o00.x0;
import q1.b0;
import q1.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f15826a = new b0(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f15827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f15828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k1 f15829d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new k());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f15827b = threadPoolExecutor;
        f15828c = new Object();
        f15829d = new k1(0);
    }

    public static String a(int i11, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < list.size(); i12++) {
            sb2.append(((d) list.get(i12)).f15818g);
            sb2.append("-");
            sb2.append(i11);
            if (i12 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    public static f b(String str, Context context, List list, int i11) {
        int i12;
        Typeface typefaceI0;
        b0 b0Var = f15826a;
        Trace.beginSection(x0.G("getFontSync"));
        try {
            Typeface typeface = (Typeface) b0Var.c(str);
            if (typeface != null) {
                return new f(typeface);
            }
            h hVarA = c.a(context, list);
            List list2 = hVarA.f15831b;
            int i13 = hVarA.f15830a;
            if (i13 != 0) {
                i12 = i13 != 1 ? -3 : -2;
            } else {
                i[] iVarArr = (i[]) list2.get(0);
                if (iVarArr == null || iVarArr.length == 0) {
                    i12 = 1;
                } else {
                    int length = iVarArr.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= length) {
                            i12 = 0;
                            break;
                        }
                        int i15 = iVarArr[i14].f15837f;
                        if (i15 == 0) {
                            i14++;
                        } else if (i15 >= 0) {
                            i12 = i15;
                        }
                    }
                }
            }
            if (i12 != 0) {
                return new f(i12);
            }
            if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                i[] iVarArr2 = (i[]) list2.get(0);
                na0.a aVar = x6.f.f43879a;
                Trace.beginSection(x0.G("TypefaceCompat.createFromFontInfo"));
                typefaceI0 = x6.f.f43879a.i0(context, iVarArr2, i11);
                Trace.endSection();
            } else {
                na0.a aVar2 = x6.f.f43879a;
                Trace.beginSection(x0.G("TypefaceCompat.createFromFontInfoWithFallback"));
                typefaceI0 = x6.f.f43879a.j0(context, list2, i11);
                Trace.endSection();
            }
            if (typefaceI0 == null) {
                return new f(-3);
            }
            b0Var.d(str, typefaceI0);
            return new f(typefaceI0);
        } catch (PackageManager.NameNotFoundException unused) {
            return new f(-1);
        } catch (Throwable th2) {
            throw th2;
        } finally {
            Trace.endSection();
        }
    }
}
