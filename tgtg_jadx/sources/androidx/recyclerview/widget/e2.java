package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f3717a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3718b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f3719c = Collections.newSetFromMap(new IdentityHashMap());

    public final d2 a(int i11) {
        SparseArray sparseArray = this.f3717a;
        d2 d2Var = (d2) sparseArray.get(i11);
        if (d2Var != null) {
            return d2Var;
        }
        d2 d2Var2 = new d2();
        sparseArray.put(i11, d2Var2);
        return d2Var2;
    }
}
