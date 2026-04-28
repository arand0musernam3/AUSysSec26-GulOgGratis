package n80;

import kotlin.collections.s0;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30716d;

    public h(int i11, int i12, int i13) {
        this.f30713a = i13;
        this.f30714b = i12;
        boolean z11 = false;
        if (i13 <= 0 ? i11 >= i12 : i11 <= i12) {
            z11 = true;
        }
        this.f30715c = z11;
        this.f30716d = z11 ? i11 : i12;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30715c;
    }

    @Override // kotlin.collections.s0
    public final int nextInt() {
        int i11 = this.f30716d;
        if (i11 != this.f30714b) {
            this.f30716d = this.f30713a + i11;
            return i11;
        }
        if (this.f30715c) {
            this.f30715c = false;
            return i11;
        }
        i1.c();
        return 0;
    }
}
