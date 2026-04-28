package n80;

import kotlin.collections.b0;
import kotlin.jvm.internal.Intrinsics;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30710d;

    public c(char c3, char c7, int i11) {
        this.f30707a = i11;
        this.f30708b = c7;
        boolean z11 = false;
        if (i11 <= 0 ? Intrinsics.compare((int) c3, (int) c7) >= 0 : Intrinsics.compare((int) c3, (int) c7) <= 0) {
            z11 = true;
        }
        this.f30709c = z11;
        this.f30710d = z11 ? c3 : c7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30709c;
    }

    @Override // kotlin.collections.b0
    public final char nextChar() {
        int i11 = this.f30710d;
        if (i11 != this.f30708b) {
            this.f30710d = this.f30707a + i11;
        } else {
            if (!this.f30709c) {
                i1.c();
                return (char) 0;
            }
            this.f30709c = false;
        }
        return (char) i11;
    }
}
