package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f2641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f2642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1[] f2643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharSequence f2647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PendingIntent f2648h;

    public o(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, c1[] c1VarArr, boolean z11, boolean z12) {
        this.f2645e = true;
        this.f2642b = iconCompat;
        if (iconCompat != null) {
            int i11 = iconCompat.f2719a;
            if ((i11 == -1 ? ba0.g.y(iconCompat.f2720b) : i11) == 2) {
                this.f2646f = iconCompat.e();
            }
        }
        this.f2647g = s.b(charSequence);
        this.f2648h = pendingIntent;
        this.f2641a = bundle == null ? new Bundle() : bundle;
        this.f2643c = c1VarArr;
        this.f2644d = z11;
        this.f2645e = z12;
    }
}
