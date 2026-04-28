package ia0;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends kotlin.collections.f implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f23687d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j[] f23688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f23689c;

    public y(j[] jVarArr, int[] iArr) {
        this.f23688b = jVarArr;
        this.f23689c = iArr;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.f23688b.length;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof j) {
            return super.contains((j) obj);
        }
        return false;
    }

    @Override // kotlin.collections.f, java.util.List
    public final Object get(int i11) {
        return this.f23688b[i11];
    }

    @Override // kotlin.collections.f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof j) {
            return super.indexOf((j) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof j) {
            return super.lastIndexOf((j) obj);
        }
        return -1;
    }
}
