package t80;

import kotlin.jvm.internal.markers.KMutableListIterator;
import m0.i1;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends q3.a implements KMutableListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f39854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f39856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39857g;

    public f(d dVar, int i11) {
        super(i11, dVar.f39851f, 1);
        this.f39854d = dVar;
        this.f39855e = dVar.h();
        this.f39857g = -1;
        d();
    }

    public final void a() {
        if (this.f39855e == this.f39854d.h()) {
            return;
        }
        org.bouncycastle.jce.provider.a.o();
    }

    @Override // q3.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        this.f39854d.add(this.f35953b, obj);
        this.f35953b++;
        b();
    }

    public final void b() {
        d dVar = this.f39854d;
        this.f35954c = dVar.b();
        this.f39855e = dVar.h();
        this.f39857g = -1;
        d();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void d() {
        d dVar = this.f39854d;
        Object[] objArr = dVar.f39849d;
        if (objArr == null) {
            this.f39856f = null;
            return;
        }
        int i11 = (dVar.f39851f - 1) & (-32);
        int i12 = this.f35953b;
        if (i12 > i11) {
            i12 = i11;
        }
        int i13 = (dVar.f39846a / 5) + 1;
        h hVar = this.f39856f;
        if (hVar == null) {
            this.f39856f = new h(objArr, i12, i11, i13);
            return;
        }
        hVar.f35953b = i12;
        hVar.f35954c = i11;
        hVar.f39860d = i13;
        if (hVar.f39861e.length < i13) {
            hVar.f39861e = new Object[i13];
        }
        hVar.f39861e[0] = objArr;
        ?? r62 = i12 == i11 ? 1 : 0;
        hVar.f39862f = r62;
        hVar.b(i12 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            i1.c();
            return null;
        }
        int i11 = this.f35953b;
        this.f39857g = i11;
        h hVar = this.f39856f;
        d dVar = this.f39854d;
        if (hVar == null) {
            Object[] objArr = dVar.f39850e;
            this.f35953b = i11 + 1;
            return objArr[i11];
        }
        if (hVar.hasNext()) {
            this.f35953b++;
            return hVar.next();
        }
        Object[] objArr2 = dVar.f39850e;
        int i12 = this.f35953b;
        this.f35953b = i12 + 1;
        return objArr2[i12 - hVar.f35954c];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            i1.c();
            return null;
        }
        int i11 = this.f35953b;
        this.f39857g = i11 - 1;
        h hVar = this.f39856f;
        d dVar = this.f39854d;
        if (hVar == null) {
            Object[] objArr = dVar.f39850e;
            int i12 = i11 - 1;
            this.f35953b = i12;
            return objArr[i12];
        }
        int i13 = hVar.f35954c;
        if (i11 <= i13) {
            this.f35953b = i11 - 1;
            return hVar.previous();
        }
        Object[] objArr2 = dVar.f39850e;
        int i14 = i11 - 1;
        this.f35953b = i14;
        return objArr2[i14 - i13];
    }

    @Override // q3.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i11 = this.f39857g;
        if (i11 == -1) {
            y.e();
            return;
        }
        this.f39854d.d(i11);
        int i12 = this.f39857g;
        if (i12 < this.f35953b) {
            this.f35953b = i12;
        }
        b();
    }

    @Override // q3.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i11 = this.f39857g;
        if (i11 == -1) {
            y.e();
            return;
        }
        d dVar = this.f39854d;
        dVar.set(i11, obj);
        this.f39855e = dVar.h();
        d();
    }
}
