package kotlin.collections;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends f implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f26543b;

    public w(int[] iArr) {
        this.f26543b = iArr;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.f26543b.length;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return y.t(this.f26543b, ((Number) obj).intValue());
    }

    @Override // kotlin.collections.f, java.util.List
    public final Object get(int i11) {
        return Integer.valueOf(this.f26543b[i11]);
    }

    @Override // kotlin.collections.f, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f26543b;
        iArr.getClass();
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (iIntValue == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    @Override // kotlin.collections.a, java.util.Collection
    public final boolean isEmpty() {
        return this.f26543b.length == 0;
    }

    @Override // kotlin.collections.f, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f26543b;
        iArr.getClass();
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (iIntValue == iArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }
}
