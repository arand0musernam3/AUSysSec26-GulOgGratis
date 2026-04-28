package a1;

import ae.e;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import com.google.android.gms.internal.measurement.ce;
import com.google.android.gms.internal.measurement.gg;
import com.google.android.gms.internal.measurement.nb;
import com.google.android.gms.internal.measurement.ud;
import com.google.android.gms.internal.measurement.vd;
import com.google.android.gms.internal.measurement.x0;
import ed.m;
import java.io.InputStream;
import u00.d;
import ud.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements e, vd, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f189b;

    public b(int i11) {
        this.f188a = i11;
        switch (i11) {
            case 3:
                break;
            default:
                this.f189b = z0.a.f46383a.b(SurfaceOrderQuirk.class) != null;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.vd
    public /* bridge */ /* synthetic */ Object a(ud udVar) {
        nb nbVarA;
        InputStream inputStreamD = gg.d(udVar);
        try {
            int i11 = 4096;
            if (this.f189b) {
                if (inputStreamD instanceof ce) {
                    long length = ((ce) inputStreamD).a().length();
                    if (length == 0) {
                        i11 = 512;
                    } else if (length < 4096) {
                        i11 = (int) length;
                    }
                }
                nbVarA = nb.a(x0.h(inputStreamD, i11), true);
            } else {
                nbVarA = nb.a(x0.h(inputStreamD, 4096), false);
            }
            d.p(inputStreamD, null);
            return nbVarA;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                d.p(inputStreamD, th2);
                throw th3;
            }
        }
    }

    @Override // ae.e, ed.m
    public boolean e() {
        switch (this.f188a) {
        }
        return this.f189b;
    }

    @Override // ae.e
    public boolean f(h hVar) {
        return this.f189b;
    }

    @Override // ed.m
    public boolean s(ad.h hVar) {
        return this.f189b;
    }

    public /* synthetic */ b(boolean z11, int i11) {
        this.f188a = i11;
        this.f189b = z11;
    }
}
