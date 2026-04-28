package oz;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d10.g f33839b = new d10.g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f33841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f33842e;

    public n(int i11, int i12, Bundle bundle, int i13) {
        this.f33842e = i13;
        this.f33838a = i11;
        this.f33840c = i12;
        this.f33841d = bundle;
    }

    public final boolean a() {
        switch (this.f33842e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + zztVar.toString());
        }
        this.f33839b.a(zztVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f33839b.b(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f33840c + " id=" + this.f33838a + " oneWay=" + a() + "}";
    }
}
