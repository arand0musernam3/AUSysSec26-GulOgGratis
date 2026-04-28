package a60;

import java.util.Iterator;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f914b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f917e;

    public t(w wVar, int i11) {
        this.f917e = i11;
        this.f916d = wVar;
        this.f913a = wVar.f932c.f923d;
        this.f915c = wVar.f934e;
    }

    public final Object a() {
        return b();
    }

    public final v b() {
        v vVar = this.f913a;
        w wVar = this.f916d;
        if (vVar == wVar.f932c) {
            i1.c();
            return null;
        }
        if (wVar.f934e != this.f915c) {
            org.bouncycastle.jce.provider.a.o();
            return null;
        }
        this.f913a = vVar.f923d;
        this.f914b = vVar;
        return vVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f913a != this.f916d.f932c;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f917e) {
            case 1:
                return b().f925f;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        v vVar = this.f914b;
        if (vVar == null) {
            qc.y.e();
            return;
        }
        w wVar = this.f916d;
        wVar.d(vVar, true);
        this.f914b = null;
        this.f915c = wVar.f934e;
    }
}
