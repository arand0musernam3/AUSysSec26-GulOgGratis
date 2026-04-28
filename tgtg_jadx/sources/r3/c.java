package r3;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m[] f37580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37582c = true;

    public c(l lVar, m[] mVarArr) {
        this.f37580a = mVarArr;
        mVarArr[0].a(lVar.f37604d, Integer.bitCount(lVar.f37601a) * 2, 0);
        this.f37581b = 0;
        a();
    }

    public final void a() {
        int i11 = this.f37581b;
        m[] mVarArr = this.f37580a;
        m mVar = mVarArr[i11];
        if (mVar.f37607c < mVar.f37606b) {
            return;
        }
        while (-1 < i11) {
            int iB = b(i11);
            if (iB == -1) {
                m mVar2 = mVarArr[i11];
                int i12 = mVar2.f37607c;
                Object[] objArr = mVar2.f37605a;
                if (i12 < objArr.length) {
                    int length = objArr.length;
                    mVar2.f37607c = i12 + 1;
                    iB = b(i11);
                }
            }
            if (iB != -1) {
                this.f37581b = iB;
                return;
            }
            if (i11 > 0) {
                m mVar3 = mVarArr[i11 - 1];
                int i13 = mVar3.f37607c;
                int length2 = mVar3.f37605a.length;
                mVar3.f37607c = i13 + 1;
            }
            mVarArr[i11].a(l.f37600e.f37604d, 0, 0);
            i11--;
        }
        this.f37582c = false;
    }

    public final int b(int i11) {
        m[] mVarArr = this.f37580a;
        m mVar = mVarArr[i11];
        int i12 = mVar.f37607c;
        if (i12 < mVar.f37606b) {
            return i11;
        }
        Object[] objArr = mVar.f37605a;
        if (i12 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i12];
        obj.getClass();
        l lVar = (l) obj;
        if (i11 == 6) {
            m mVar2 = mVarArr[i11 + 1];
            Object[] objArr2 = lVar.f37604d;
            mVar2.a(objArr2, objArr2.length, 0);
        } else {
            mVarArr[i11 + 1].a(lVar.f37604d, Integer.bitCount(lVar.f37601a) * 2, 0);
        }
        return b(i11 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37582c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f37582c) {
            i1.c();
            return null;
        }
        Object next = this.f37580a[this.f37581b].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
