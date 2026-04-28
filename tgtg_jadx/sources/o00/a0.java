package o00;

import com.google.android.gms.internal.measurement.cg;
import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f31619c;

    public a0(b0 b0Var) {
        this.f31619c = b0Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i11) {
        b0 b0Var = this.f31619c;
        cg.z(i11, b0Var.f31624e);
        Object[] objArr = b0Var.f31623d;
        int i12 = i11 + i11;
        Object obj = objArr[i12];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i12 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31619c.f31624e;
    }
}
