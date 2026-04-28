package kotlin.collections;

import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.markers.KMutableList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m extends AbstractList implements List, KMutableList {
    public abstract int b();

    public abstract Object d(int i11);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i11) {
        return d(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}
