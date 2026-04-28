package y00;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.n5;
import com.google.android.gms.internal.measurement.o5;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g3 extends n5 implements n0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f44827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m3 f44828h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(m3 m3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f44827g = atomicReference;
        this.f44828h = m3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n5
    public final boolean a(int i11, Parcel parcel, Parcel parcel2) {
        if (i11 != 2) {
            return false;
        }
        e4 e4Var = (e4) o5.a(parcel, e4.CREATOR);
        o5.d(parcel);
        z(e4Var);
        return true;
    }

    @Override // y00.n0
    public final void z(e4 e4Var) {
        AtomicReference atomicReference = this.f44827g;
        synchronized (atomicReference) {
            w0 w0Var = ((n1) this.f44828h.f21216b).f44987f;
            n1.m(w0Var);
            w0Var.f45267o.b(Integer.valueOf(e4Var.f44745a.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(e4Var);
            atomicReference.notifyAll();
        }
    }
}
