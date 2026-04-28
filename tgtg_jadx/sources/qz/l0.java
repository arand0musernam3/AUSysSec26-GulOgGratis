package qz;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f37366b;

    public l0(int i11, d dVar) {
        super(i11);
        com.google.android.gms.common.internal.i0.i(dVar, "Null methods are not runnable.");
        this.f37366b = dVar;
    }

    @Override // qz.o0
    public final void a(Status status) {
        try {
            this.f37366b.g(status);
        } catch (IllegalStateException e5) {
            Log.w("ApiCallRunner", "Exception reporting failure", e5);
        }
    }

    @Override // qz.o0
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.f37366b.g(new Status(10, e0.f.n(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage), null, null));
        } catch (IllegalStateException e5) {
            Log.w("ApiCallRunner", "Exception reporting failure", e5);
        }
    }

    @Override // qz.o0
    public final void c(oz.m mVar, boolean z11) {
        Boolean boolValueOf = Boolean.valueOf(z11);
        Map map = (Map) mVar.f33836b;
        d dVar = this.f37366b;
        map.put(dVar, boolValueOf);
        dVar.a(new com.google.android.gms.common.internal.a0(mVar, dVar));
    }

    @Override // qz.o0
    public final void d(z zVar) throws DeadObjectException {
        try {
            d dVar = this.f37366b;
            com.google.android.gms.common.api.f fVar = zVar.f37403h;
            dVar.getClass();
            try {
                dVar.f(fVar);
            } catch (DeadObjectException e5) {
                dVar.g(new Status(8, e5.getLocalizedMessage(), null, null));
                throw e5;
            } catch (RemoteException e11) {
                dVar.g(new Status(8, e11.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e12) {
            b(e12);
        }
    }
}
