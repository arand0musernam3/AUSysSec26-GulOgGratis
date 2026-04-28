package q3;

import kotlin.jvm.internal.markers.KMutableListIterator;
import m0.i1;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a implements KMutableListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f35973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f35975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35976g;

    public h(f fVar, int i11) {
        super(i11, fVar.f35970h, 0);
        this.f35973d = fVar;
        this.f35974e = fVar.h();
        this.f35976g = -1;
        b();
    }

    public final void a() {
        if (this.f35974e == this.f35973d.h()) {
            return;
        }
        org.bouncycastle.jce.provider.a.o();
    }

    @Override // q3.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i11 = this.f35953b;
        f fVar = this.f35973d;
        fVar.add(i11, obj);
        this.f35953b++;
        this.f35954c = fVar.b();
        this.f35974e = fVar.h();
        this.f35976g = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        f fVar = this.f35973d;
        Object[] objArr = fVar.f35968f;
        if (objArr == null) {
            this.f35975f = null;
            return;
        }
        int i11 = (fVar.f35970h - 1) & (-32);
        int i12 = this.f35953b;
        if (i12 > i11) {
            i12 = i11;
        }
        int i13 = (fVar.f35966d / 5) + 1;
        j jVar = this.f35975f;
        if (jVar == null) {
            this.f35975f = new j(objArr, i12, i11, i13);
            return;
        }
        jVar.f35953b = i12;
        jVar.f35954c = i11;
        jVar.f35979d = i13;
        if (jVar.f35980e.length < i13) {
            jVar.f35980e = new Object[i13];
        }
        jVar.f35980e[0] = objArr;
        ?? r62 = i12 == i11 ? 1 : 0;
        jVar.f35981f = r62;
        jVar.b(i12 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            i1.c();
            return null;
        }
        int i11 = this.f35953b;
        this.f35976g = i11;
        j jVar = this.f35975f;
        f fVar = this.f35973d;
        if (jVar == null) {
            Object[] objArr = fVar.f35969g;
            this.f35953b = i11 + 1;
            return objArr[i11];
        }
        if (jVar.hasNext()) {
            this.f35953b++;
            return jVar.next();
        }
        Object[] objArr2 = fVar.f35969g;
        int i12 = this.f35953b;
        this.f35953b = i12 + 1;
        return objArr2[i12 - jVar.f35954c];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            i1.c();
            return null;
        }
        int i11 = this.f35953b;
        this.f35976g = i11 - 1;
        j jVar = this.f35975f;
        f fVar = this.f35973d;
        if (jVar == null) {
            Object[] objArr = fVar.f35969g;
            int i12 = i11 - 1;
            this.f35953b = i12;
            return objArr[i12];
        }
        int i13 = jVar.f35954c;
        if (i11 <= i13) {
            this.f35953b = i11 - 1;
            return jVar.previous();
        }
        Object[] objArr2 = fVar.f35969g;
        int i14 = i11 - 1;
        this.f35953b = i14;
        return objArr2[i14 - i13];
    }

    @Override // q3.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i11 = this.f35976g;
        if (i11 == -1) {
            y.e();
            return;
        }
        f fVar = this.f35973d;
        fVar.d(i11);
        int i12 = this.f35976g;
        if (i12 < this.f35953b) {
            this.f35953b = i12;
        }
        this.f35954c = fVar.b();
        this.f35974e = fVar.h();
        this.f35976g = -1;
        b();
    }

    @Override // q3.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i11 = this.f35976g;
        if (i11 == -1) {
            y.e();
            return;
        }
        f fVar = this.f35973d;
        fVar.set(i11, obj);
        this.f35974e = fVar.h();
        b();
    }
}
