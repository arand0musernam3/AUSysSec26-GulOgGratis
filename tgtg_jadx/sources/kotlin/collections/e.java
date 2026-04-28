package kotlin.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends f implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26498b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f26501e;

    public e(f fVar, int i11, int i12) {
        this.f26501e = fVar;
        this.f26499c = i11;
        c cVar = f.f26505a;
        int iB = fVar.b();
        cVar.getClass();
        c.d(i11, i12, iB);
        this.f26500d = i12 - i11;
    }

    @Override // kotlin.collections.a
    public final int b() {
        switch (this.f26498b) {
        }
        return this.f26500d;
    }

    @Override // kotlin.collections.f, java.util.List
    public final Object get(int i11) {
        switch (this.f26498b) {
            case 0:
                c cVar = f.f26505a;
                int i12 = this.f26500d;
                cVar.getClass();
                c.b(i11, i12);
                return ((f) this.f26501e).get(this.f26499c + i11);
            default:
                c cVar2 = f.f26505a;
                int i13 = this.f26500d;
                cVar2.getClass();
                c.b(i11, i13);
                return ((ArrayList) this.f26501e).get(this.f26499c + i11);
        }
    }

    @Override // kotlin.collections.f, java.util.List
    public List subList(int i11, int i12) {
        switch (this.f26498b) {
            case 0:
                c cVar = f.f26505a;
                int i13 = this.f26500d;
                cVar.getClass();
                c.d(i11, i12, i13);
                f fVar = (f) this.f26501e;
                int i14 = this.f26499c;
                return new e(fVar, i11 + i14, i14 + i12);
            default:
                return super.subList(i11, i12);
        }
    }

    public e(ArrayList arrayList) {
        this.f26501e = arrayList;
    }
}
