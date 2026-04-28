package y00;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.j6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f44731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f44732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j6 f44733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f44734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f44735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f44736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f44737h;

    public e2(Context context, j6 j6Var, Long l, Long l7) {
        this.f44734e = true;
        com.google.android.gms.common.internal.i0.h(context);
        Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.i0.h(applicationContext);
        this.f44730a = applicationContext;
        this.f44735f = l;
        this.f44736g = l7;
        if (j6Var != null) {
            this.f44733d = j6Var;
            this.f44734e = j6Var.f11514c;
            this.f44732c = j6Var.f11513b;
            this.f44737h = j6Var.f11516e;
            Bundle bundle = j6Var.f11515d;
            if (bundle != null) {
                this.f44731b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
