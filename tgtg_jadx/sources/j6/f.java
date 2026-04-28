package j6;

import com.google.android.gms.internal.measurement.a1;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b implements Iterable {
    @Override // j6.b
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final f b() {
        return (f) super.b();
    }

    @Override // j6.b, j6.c
    public final Object clone() {
        return (f) super.b();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        a1 a1Var = new a1();
        a1Var.f11239b = 0;
        a1Var.f11240c = this;
        return a1Var;
    }
}
