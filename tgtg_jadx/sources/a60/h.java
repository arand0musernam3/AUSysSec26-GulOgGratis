package a60;

import com.squareup.moshi.JsonEncodingException;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f871c = new a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f873b;

    public h(k kVar, int i11) {
        this.f873b = i11;
        this.f872a = kVar;
    }

    @Override // a60.k
    public Object a(p pVar) throws EOFException, JsonEncodingException {
        Collection arrayList;
        switch (this.f873b) {
            case 0:
                arrayList = new ArrayList();
                break;
            default:
                arrayList = new LinkedHashSet();
                break;
        }
        pVar.a();
        while (pVar.G()) {
            arrayList.add(this.f872a.a(pVar));
        }
        pVar.r();
        return arrayList;
    }

    @Override // a60.k
    public void e(q qVar, Object obj) {
        qVar.e();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            this.f872a.e(qVar, it.next());
        }
        qVar.p(1, 2, ']');
    }

    public final String toString() {
        return this.f872a + ".collection()";
    }
}
