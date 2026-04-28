package androidx.databinding.library.baseAdapters;

import a40.d0;
import a8.a;
import a8.k;
import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class DataBinderMapperImpl extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f2925a = new SparseIntArray(0);

    @Override // a8.a
    public final List a() {
        return new ArrayList(0);
    }

    @Override // a8.a
    public final k b(int i11, View view) {
        if (f2925a.get(i11) <= 0 || view.getTag() != null) {
            return null;
        }
        d0.k("view must have a tag");
        return null;
    }

    @Override // a8.a
    public final k c(int i11, View[] viewArr) {
        if (viewArr.length == 0 || f2925a.get(i11) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        d0.k("view must have a tag");
        return null;
    }
}
