package w6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f43256a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f43257b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f43258c = new Object();

    public static float a(Resources resources, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            return g.a(resources, i11);
        }
        ThreadLocal threadLocal = f43256a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i11, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i11) + " type #0x" + Integer.toHexString(typedValue.type) + " is not valid");
    }

    public static Typeface b(Context context, int i11) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i11, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface c(android.content.Context r12, int r13, android.util.TypedValue r14, int r15, w6.a r16, boolean r17, boolean r18) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.j.c(android.content.Context, int, android.util.TypedValue, int, w6.a, boolean, boolean):android.graphics.Typeface");
    }
}
