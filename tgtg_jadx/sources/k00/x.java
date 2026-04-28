package k00;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object[] f25703i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x f25704j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f25705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f25706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f25707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f25708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f25709h;

    static {
        Object[] objArr = new Object[0];
        f25703i = objArr;
        f25704j = new x(0, 0, 0, objArr, objArr);
    }

    public x(int i11, int i12, int i13, Object[] objArr, Object[] objArr2) {
        this.f25705d = objArr;
        this.f25706e = i11;
        this.f25707f = objArr2;
        this.f25708g = i12;
        this.f25709h = i13;
    }

    @Override // k00.h
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f25705d;
        int i11 = this.f25709h;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // k00.h
    public final int c() {
        return this.f25709h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f25707f;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i11 = iRotateLeft & this.f25708g;
            Object obj2 = objArr[i11];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i11 + 1;
        }
    }

    @Override // k00.h
    public final int d() {
        return 0;
    }

    @Override // k00.h
    public final b0 e() {
        return j().listIterator(0);
    }

    @Override // k00.h
    public final Object[] g() {
        return this.f25705d;
    }

    @Override // k00.n, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f25706e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return j().listIterator(0);
    }

    @Override // k00.n
    public final l l() {
        return l.j(this.f25709h, this.f25705d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f25709h;
    }
}
