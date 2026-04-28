package rt;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import com.braze.h2;
import cz.j;
import j30.g;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import qc.y;
import u00.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t00.c f38239a;

    public f(Context context) {
        context.getClass();
        this.f38239a = new t00.c(context);
    }

    public final void a(Function1 function1) {
        e eVar = new e(function1);
        t00.c cVar = this.f38239a;
        cVar.getClass();
        if (Looper.getMainLooper() != Looper.myLooper()) {
            h2.b("getMapAsync() must be called on the main thread");
            return;
        }
        j jVar = cVar.f39338a;
        g gVar = (g) jVar.f13632b;
        if (gVar != null) {
            gVar.n(eVar);
        } else {
            ((ArrayList) jVar.f13639i).add(eVar);
        }
    }

    public final void b(Bundle bundle) {
        t00.c cVar = this.f38239a;
        cVar.getClass();
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            j jVar = cVar.f39338a;
            jVar.getClass();
            jVar.q(bundle, new yz.c(jVar, bundle));
            if (((g) jVar.f13632b) == null) {
                j.n(cVar);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void c() {
        j jVar = this.f38239a.f39338a;
        g gVar = (g) jVar.f13632b;
        if (gVar == null) {
            jVar.p(1);
            return;
        }
        try {
            h hVar = (h) gVar.f24503c;
            hVar.M(5, hVar.L());
        } catch (RemoteException e5) {
            y.l(e5);
        }
    }

    public final void d() {
        g gVar = (g) this.f38239a.f39338a.f13632b;
        if (gVar != null) {
            try {
                h hVar = (h) gVar.f24503c;
                hVar.M(6, hVar.L());
            } catch (RemoteException e5) {
                y.l(e5);
            }
        }
    }

    public final void e() {
        j jVar = this.f38239a.f39338a;
        g gVar = (g) jVar.f13632b;
        if (gVar == null) {
            jVar.p(5);
            return;
        }
        try {
            h hVar = (h) gVar.f24503c;
            hVar.M(4, hVar.L());
        } catch (RemoteException e5) {
            y.l(e5);
        }
    }

    public final void f() {
        j jVar = this.f38239a.f39338a;
        jVar.getClass();
        jVar.q(null, new yz.d(jVar, 1));
    }

    public final void g(Bundle bundle) {
        bundle.getClass();
        j jVar = this.f38239a.f39338a;
        g gVar = (g) jVar.f13632b;
        if (gVar == null) {
            Bundle bundle2 = (Bundle) jVar.f13633c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
                return;
            }
            return;
        }
        try {
            Bundle bundle3 = new Bundle();
            u00.d.T(bundle, bundle3);
            h hVar = (h) gVar.f24503c;
            Parcel parcelL = hVar.L();
            n00.d.c(parcelL, bundle3);
            Parcel parcelJ = hVar.J(7, parcelL);
            if (parcelJ.readInt() != 0) {
                bundle3.readFromParcel(parcelJ);
            }
            parcelJ.recycle();
            u00.d.T(bundle3, bundle);
        } catch (RemoteException e5) {
            y.l(e5);
        }
    }

    public final void h() {
        j jVar = this.f38239a.f39338a;
        jVar.getClass();
        jVar.q(null, new yz.d(jVar, 0));
    }

    public final void i() {
        j jVar = this.f38239a.f39338a;
        g gVar = (g) jVar.f13632b;
        if (gVar == null) {
            jVar.p(4);
            return;
        }
        try {
            h hVar = (h) gVar.f24503c;
            hVar.M(13, hVar.L());
        } catch (RemoteException e5) {
            y.l(e5);
        }
    }
}
