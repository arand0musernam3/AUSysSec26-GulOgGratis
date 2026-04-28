package y00;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.n5;
import com.google.android.gms.internal.measurement.o5;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f3 extends n5 implements l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f44756g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(m3 m3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f44756g = atomicReference;
    }

    @Override // y00.l0
    public final void G(List list) {
        AtomicReference atomicReference = this.f44756g;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.n5
    public final boolean a(int i11, Parcel parcel, Parcel parcel2) {
        if (i11 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(y3.CREATOR);
        o5.d(parcel);
        G(arrayListCreateTypedArrayList);
        return true;
    }
}
