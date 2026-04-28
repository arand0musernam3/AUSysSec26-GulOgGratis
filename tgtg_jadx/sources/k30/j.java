package k30;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f25905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f25906b;

    public j(k kVar) {
        int i11 = ((c0) kVar).f25882f;
        Object[] objArr = new Object[i11];
        Object[] objArr2 = new Object[i11];
        j00.g it = kVar.entrySet().iterator();
        int i12 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i12] = entry.getKey();
            objArr2[i12] = entry.getValue();
            i12++;
        }
        this.f25905a = objArr;
        this.f25906b = objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.f25905a;
        boolean z11 = objArr instanceof m;
        Object[] objArr2 = this.f25906b;
        if (!z11) {
            a3.j jVar = new a3.j(objArr.length);
            for (int i11 = 0; i11 < objArr.length; i11++) {
                jVar.q(objArr[i11], objArr2[i11]);
            }
            return jVar.f(true);
        }
        m mVar = (m) objArr;
        a3.j jVar2 = new a3.j(mVar.size());
        j00.g it = mVar.iterator();
        j00.g it2 = ((b) objArr2).iterator();
        while (it.hasNext()) {
            jVar2.q(it.next(), it2.next());
        }
        return jVar2.f(true);
    }
}
