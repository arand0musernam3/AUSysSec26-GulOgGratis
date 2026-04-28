package a4;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import m3.q0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f681a = new ArrayList();

    public final boolean a(int i11, q0 q0Var, Object obj) {
        ArrayList arrayList = q0Var.f29381a;
        if (arrayList == null) {
            b(i11, q0Var, null);
            return true;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj2 = arrayList.get(i12);
            if (obj2 instanceof m3.a) {
                if (Intrinsics.areEqual(obj2, obj)) {
                    b(0, q0Var, obj2);
                    return true;
                }
            } else {
                if (!(obj2 instanceof q0)) {
                    org.bouncycastle.jce.provider.a.p(obj2, "Unexpected child source info ");
                    return false;
                }
                if (a(i11, (q0) obj2, obj)) {
                    b(0, q0Var, obj2);
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(int i11, q0 q0Var, Object obj) {
        this.f681a.add(new d(i11, null, null));
    }

    public final void c(int i11, Object obj, q0 q0Var, Object obj2) {
        if (Intrinsics.areEqual(obj, m3.m.f29332a)) {
            b(i11, q0Var, null);
        }
    }
}
