package q3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.x;
import kotlin.collections.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f35977c = new i(new Object[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f35978b;

    public i(Object[] objArr) {
        this.f35978b = objArr;
        int length = objArr.length;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.f35978b.length;
    }

    @Override // q3.c
    public final c d(int i11, Object obj) {
        Object[] objArr = this.f35978b;
        dx.f.o(i11, objArr.length);
        if (i11 == objArr.length) {
            return e(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            x.i(0, i11, 6, objArr, objArr2);
            x.d(i11 + 1, i11, objArr.length, objArr, objArr2);
            objArr2[i11] = obj;
            return new i(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        x.d(i11 + 1, i11, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i11] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // q3.c
    public final c e(Object obj) {
        Object[] objArr = this.f35978b;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new i(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new e(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // q3.c
    public final c g(Collection collection) {
        Object[] objArr = this.f35978b;
        if (collection.size() + objArr.length > 32) {
            f fVarH = h();
            fVarH.addAll(collection);
            return fVarH.e();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new i(objArrCopyOf);
    }

    @Override // kotlin.collections.f, java.util.List
    public final Object get(int i11) {
        dx.f.n(i11, b());
        return this.f35978b[i11];
    }

    @Override // q3.c
    public final f h() {
        return new f(this, null, this.f35978b, 0);
    }

    @Override // q3.c
    public final c i(b bVar) {
        Object[] objArr = this.f35978b;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z11 = false;
        for (int i11 = 0; i11 < length2; i11++) {
            Object obj = objArr[i11];
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                if (!z11) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z11 = true;
                    length = i11;
                }
            } else if (z11) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f35977c : new i(x.l(objArrCopyOf, 0, length));
    }

    @Override // kotlin.collections.f, java.util.List
    public final int indexOf(Object obj) {
        return y.E(this.f35978b, obj);
    }

    @Override // q3.c
    public final c j(int i11) {
        Object[] objArr = this.f35978b;
        dx.f.n(i11, objArr.length);
        if (objArr.length == 1) {
            return f35977c;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        x.d(i11, i11 + 1, objArr.length, objArr, objArrCopyOf);
        return new i(objArrCopyOf);
    }

    @Override // q3.c
    public final c l(int i11, Object obj) {
        dx.f.n(i11, b());
        Object[] objArr = this.f35978b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i11] = obj;
        return new i(objArrCopyOf);
    }

    @Override // kotlin.collections.f, java.util.List
    public final int lastIndexOf(Object obj) {
        return y.J(this.f35978b, obj);
    }

    @Override // kotlin.collections.f, java.util.List
    public final ListIterator listIterator(int i11) {
        Object[] objArr = this.f35978b;
        dx.f.o(i11, objArr.length);
        return new d(objArr, i11, objArr.length);
    }
}
