package r3;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import m0.i1;
import o00.h0;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class e extends c implements KMutableIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f37589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f37590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f37591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37592g;

    public e(d dVar, m[] mVarArr) {
        super(dVar.f37585c, mVarArr);
        this.f37589d = dVar;
        this.f37592g = dVar.f37587e;
    }

    public final void d(int i11, l lVar, Object obj, int i12) {
        int i13 = i12 * 5;
        m[] mVarArr = this.f37580a;
        if (i13 <= 30) {
            int iZ = 1 << h0.z(i11, i13);
            if (lVar.h(iZ)) {
                mVarArr[i12].a(lVar.f37604d, Integer.bitCount(lVar.f37601a) * 2, lVar.f(iZ));
                this.f37581b = i12;
                return;
            } else {
                int iT = lVar.t(iZ);
                l lVarS = lVar.s(iT);
                mVarArr[i12].a(lVar.f37604d, Integer.bitCount(lVar.f37601a) * 2, iT);
                d(i11, lVarS, obj, i12 + 1);
                return;
            }
        }
        m mVar = mVarArr[i12];
        Object[] objArr = lVar.f37604d;
        mVar.a(objArr, objArr.length, 0);
        while (true) {
            m mVar2 = mVarArr[i12];
            if (Intrinsics.areEqual(mVar2.f37605a[mVar2.f37607c], obj)) {
                this.f37581b = i12;
                return;
            } else {
                mVarArr[i12].f37607c += 2;
            }
        }
    }

    @Override // r3.c, java.util.Iterator
    public final Object next() {
        if (this.f37589d.f37587e != this.f37592g) {
            org.bouncycastle.jce.provider.a.o();
            return null;
        }
        if (!this.f37582c) {
            i1.c();
            return null;
        }
        m mVar = this.f37580a[this.f37581b];
        this.f37590e = mVar.f37605a[mVar.f37607c];
        this.f37591f = true;
        return super.next();
    }

    @Override // r3.c, java.util.Iterator
    public final void remove() {
        if (!this.f37591f) {
            y.e();
            return;
        }
        boolean z11 = this.f37582c;
        d dVar = this.f37589d;
        if (!z11) {
            TypeIntrinsics.asMutableMap(dVar).remove(this.f37590e);
        } else {
            if (!z11) {
                i1.c();
                return;
            }
            m mVar = this.f37580a[this.f37581b];
            Object obj = mVar.f37605a[mVar.f37607c];
            TypeIntrinsics.asMutableMap(dVar).remove(this.f37590e);
            d(obj != null ? obj.hashCode() : 0, dVar.f37585c, obj, 0);
        }
        this.f37590e = null;
        this.f37591f = false;
        this.f37592g = dVar.f37587e;
    }
}
