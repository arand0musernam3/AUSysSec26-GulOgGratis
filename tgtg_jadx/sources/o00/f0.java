package o00;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends x {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object[] f31654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f0 f31655i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f31656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f31657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f31658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f31659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f31660g;

    static {
        Object[] objArr = new Object[0];
        f31654h = objArr;
        f31655i = new f0(0, 0, 0, objArr, objArr);
    }

    public f0(int i11, int i12, int i13, Object[] objArr, Object[] objArr2) {
        this.f31656c = objArr;
        this.f31657d = i11;
        this.f31658e = objArr2;
        this.f31659f = i12;
        this.f31660g = i13;
    }

    @Override // o00.s
    public final Object[] b() {
        return this.f31656c;
    }

    @Override // o00.s
    public final int c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f31658e;
            if (objArr.length != 0) {
                int I = o30.e0.I(obj.hashCode());
                while (true) {
                    int i11 = I & this.f31659f;
                    Object obj2 = objArr[i11];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    I = i11 + 1;
                }
            }
        }
        return false;
    }

    @Override // o00.s
    public final int d() {
        return this.f31660g;
    }

    @Override // o00.s
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.f31656c;
        int i11 = this.f31660g;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // o00.x
    public final j00.g g() {
        return i().listIterator(0);
    }

    @Override // o00.x, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f31657d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // o00.x
    public final v j() {
        t tVar = v.f31755b;
        int i11 = this.f31660g;
        return i11 == 0 ? z.f31782e : new z(this.f31656c, i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f31660g;
    }
}
