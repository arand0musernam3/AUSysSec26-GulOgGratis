package i30;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements m, IInterface {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f23223g;

    public k(IBinder iBinder) {
        this.f23223g = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f23223g;
    }
}
