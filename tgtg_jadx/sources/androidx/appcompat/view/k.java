package androidx.appcompat.view;

import android.view.animation.Interpolator;
import androidx.core.view.ViewPropertyAnimatorCompat;
import h7.d1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f1899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d1 f1900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1901e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1898b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f1902f = new j(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1897a = new ArrayList();

    public final void a() {
        if (this.f1901e) {
            Iterator it = this.f1897a.iterator();
            while (it.hasNext()) {
                ((ViewPropertyAnimatorCompat) it.next()).b();
            }
            this.f1901e = false;
        }
    }

    public final void b() {
        if (this.f1901e) {
            return;
        }
        for (ViewPropertyAnimatorCompat viewPropertyAnimatorCompat : this.f1897a) {
            long j9 = this.f1898b;
            if (j9 >= 0) {
                viewPropertyAnimatorCompat.d(j9);
            }
            Interpolator interpolator = this.f1899c;
            if (interpolator != null) {
                viewPropertyAnimatorCompat.e(interpolator);
            }
            if (this.f1900d != null) {
                viewPropertyAnimatorCompat.f(this.f1902f);
            }
            viewPropertyAnimatorCompat.i();
        }
        this.f1901e = true;
    }
}
