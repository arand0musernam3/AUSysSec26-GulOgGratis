package g6;

import com.braze.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f20038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20039b;

    public e(int i11) {
        if (i11 > 0) {
            this.f20038a = new Object[i11];
        } else {
            i4.a.f("The max pool size must be > 0");
            throw null;
        }
    }

    public Object a() {
        int i11 = this.f20039b;
        if (i11 <= 0) {
            return null;
        }
        int i12 = i11 - 1;
        Object[] objArr = this.f20038a;
        Object obj = objArr[i12];
        obj.getClass();
        objArr[i12] = null;
        this.f20039b--;
        return obj;
    }

    public void b(b bVar) {
        int i11 = this.f20039b;
        Object[] objArr = this.f20038a;
        if (i11 < objArr.length) {
            objArr[i11] = bVar;
            this.f20039b = i11 + 1;
        }
    }

    public boolean c(Object obj) {
        obj.getClass();
        int i11 = this.f20039b;
        int i12 = 0;
        while (true) {
            Object[] objArr = this.f20038a;
            if (i12 >= i11) {
                int i13 = this.f20039b;
                if (i13 >= objArr.length) {
                    return false;
                }
                objArr[i13] = obj;
                this.f20039b = i13 + 1;
                return true;
            }
            if (objArr[i12] == obj) {
                h2.b("Already in the pool!");
                return false;
            }
            i12++;
        }
    }

    public e() {
        this.f20038a = new Object[256];
    }
}
