package oa0;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u0 f32400e;

    public /* synthetic */ x(u0 u0Var, int i11) {
        this.f32399d = i11;
        this.f32400e = u0Var;
    }

    @Override // oa0.u0
    public final void a(k0 k0Var, Object obj) {
        switch (this.f32399d) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.f32400e.a(k0Var, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i11 = 0; i11 < length; i11++) {
                        this.f32400e.a(k0Var, Array.get(obj, i11));
                    }
                    break;
                }
                break;
        }
    }
}
