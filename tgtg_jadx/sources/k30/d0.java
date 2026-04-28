package k30;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object[] f25886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d0 f25887j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f25888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f25889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f25890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f25891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f25892h;

    static {
        Object[] objArr = new Object[0];
        f25886i = objArr;
        f25887j = new d0(0, 0, 0, objArr, objArr);
    }

    public d0(int i11, int i12, int i13, Object[] objArr, Object[] objArr2) {
        this.f25888d = objArr;
        this.f25889e = i11;
        this.f25890f = objArr2;
        this.f25891g = i12;
        this.f25892h = i13;
    }

    @Override // k30.b
    public final int c(Object[] objArr) {
        Object[] objArr2 = this.f25888d;
        int i11 = this.f25892h;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // k30.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f25890f;
            if (objArr.length != 0) {
                int iP = jb.u.P(obj.hashCode());
                while (true) {
                    int i11 = iP & this.f25891g;
                    Object obj2 = objArr[i11];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iP = i11 + 1;
                }
            }
        }
        return false;
    }

    @Override // k30.b
    public final Object[] d() {
        return this.f25888d;
    }

    @Override // k30.b
    public final int e() {
        return this.f25892h;
    }

    @Override // k30.b
    public final int g() {
        return 0;
    }

    @Override // k30.b
    public final boolean h() {
        return false;
    }

    @Override // k30.m, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f25889e;
    }

    @Override // k30.b
    /* JADX INFO: renamed from: i */
    public final j00.g iterator() {
        return b().listIterator(0);
    }

    @Override // k30.m
    public final h m() {
        return h.j(this.f25892h, this.f25888d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f25892h;
    }

    @Override // k30.m, k30.b
    public Object writeReplace() {
        return super.writeReplace();
    }
}
