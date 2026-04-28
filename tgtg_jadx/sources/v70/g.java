package v70;

import h7.o0;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMutableIterator;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends o0 implements Iterator, KMutableIterator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f42037e;

    public g(i iVar, int i11) {
        this.f42037e = i11;
        iVar.getClass();
        this.f21601d = iVar;
        this.f21599b = -1;
        this.f21600c = iVar.f42050h;
        f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f42037e) {
            case 0:
                b();
                int i11 = this.f21598a;
                i iVar = (i) this.f21601d;
                if (i11 >= iVar.f42048f) {
                    i1.c();
                } else {
                    this.f21598a = i11 + 1;
                    this.f21599b = i11;
                    h hVar = new h(iVar, i11);
                    f();
                }
                break;
            case 1:
                b();
                int i12 = this.f21598a;
                i iVar2 = (i) this.f21601d;
                if (i12 >= iVar2.f42048f) {
                    i1.c();
                } else {
                    this.f21598a = i12 + 1;
                    this.f21599b = i12;
                    Object obj = iVar2.f42043a[i12];
                    f();
                }
                break;
            default:
                b();
                int i13 = this.f21598a;
                i iVar3 = (i) this.f21601d;
                if (i13 >= iVar3.f42048f) {
                    i1.c();
                } else {
                    this.f21598a = i13 + 1;
                    this.f21599b = i13;
                    Object[] objArr = iVar3.f42044b;
                    objArr.getClass();
                    Object obj2 = objArr[this.f21599b];
                    f();
                }
                break;
        }
        return null;
    }
}
