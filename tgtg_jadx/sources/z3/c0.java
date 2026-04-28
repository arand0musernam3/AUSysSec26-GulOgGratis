package z3;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Iterator, KMutableIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f46986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f46987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map.Entry f46989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map.Entry f46990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f46991f;

    public c0(u uVar, Iterator it, int i11) {
        this.f46991f = i11;
        this.f46986a = uVar;
        this.f46987b = it;
        this.f46988c = uVar.f().f47058d;
        a();
    }

    public final void a() {
        this.f46989d = this.f46990e;
        Iterator it = this.f46987b;
        this.f46990e = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f46990e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f46991f) {
            case 0:
                a();
                if (this.f46989d == null) {
                    qc.y.e();
                }
                break;
            case 1:
                Map.Entry entry = this.f46990e;
                if (entry == null) {
                    qc.y.e();
                } else {
                    a();
                }
                break;
            default:
                Map.Entry entry2 = this.f46990e;
                if (entry2 == null) {
                    qc.y.e();
                } else {
                    a();
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        u uVar = this.f46986a;
        if (uVar.f().f47058d != this.f46988c) {
            org.bouncycastle.jce.provider.a.o();
            return;
        }
        Map.Entry entry = this.f46989d;
        if (entry == null) {
            qc.y.e();
            return;
        }
        uVar.remove(entry.getKey());
        this.f46989d = null;
        this.f46988c = uVar.f().f47058d;
    }
}
