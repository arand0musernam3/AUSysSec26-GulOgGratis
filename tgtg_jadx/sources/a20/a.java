package a20;

import android.content.Context;
import android.graphics.Color;
import com.app.tgtg.R;
import ex.i;
import w0.e;
import x6.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f236f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f241e;

    public a(Context context) {
        boolean zG = i.G(context, R.attr.elevationOverlayEnabled, false);
        int iZ = e.z(context, R.attr.elevationOverlayColor, 0);
        int iZ2 = e.z(context, R.attr.elevationOverlayAccentColor, 0);
        int iZ3 = e.z(context, R.attr.colorSurface, 0);
        float f11 = context.getResources().getDisplayMetrics().density;
        this.f237a = zG;
        this.f238b = iZ;
        this.f239c = iZ2;
        this.f240d = iZ3;
        this.f241e = f11;
    }

    public final int a(float f11, int i11) {
        int i12;
        if (!this.f237a || c.e(i11, 255) != this.f240d) {
            return i11;
        }
        float fMin = (this.f241e <= 0.0f || f11 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f11 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i11);
        int iE = e.E(c.e(i11, 255), fMin, this.f238b);
        if (fMin > 0.0f && (i12 = this.f239c) != 0) {
            iE = c.c(c.e(i12, f236f), iE);
        }
        return c.e(iE, iAlpha);
    }
}
