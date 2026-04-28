package a60;

import com.braze.h2;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import java.io.EOFException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f836d = new a(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f837e = new a(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f838a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f840c;

    public b(b0 b0Var, Type type, Type type2) {
        Set set = b60.f.f6049a;
        this.f839b = b0Var.a(type, set, null);
        this.f840c = b0Var.a(type2, set, null);
    }

    @Override // a60.k
    public final Object a(p pVar) throws EOFException, JsonEncodingException {
        switch (this.f838a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                pVar.a();
                while (pVar.G()) {
                    arrayList.add(this.f839b.a(pVar));
                }
                pVar.r();
                Object objNewInstance = Array.newInstance((Class<?>) this.f840c, arrayList.size());
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    Array.set(objNewInstance, i11, arrayList.get(i11));
                }
                return objNewInstance;
            default:
                w wVar = new w();
                pVar.e();
                while (pVar.G()) {
                    if (pVar.G()) {
                        pVar.f897j = pVar.L();
                        pVar.f894g = 11;
                    }
                    Object objA = this.f839b.a(pVar);
                    Object objA2 = ((k) this.f840c).a(pVar);
                    Object objPut = wVar.put(objA, objA2);
                    if (objPut != null) {
                        StringBuilder sb2 = new StringBuilder("Map key '");
                        sb2.append(objA);
                        String strB = pVar.B();
                        sb2.append("' has multiple values at path ");
                        sb2.append(strB);
                        sb2.append(": ");
                        sb2.append(objPut);
                        sb2.append(" and ");
                        sb2.append(objA2);
                        throw new JsonDataException(sb2.toString());
                    }
                }
                pVar.t();
                return wVar;
        }
    }

    @Override // a60.k
    public final void e(q qVar, Object obj) {
        switch (this.f838a) {
            case 0:
                qVar.e();
                int length = Array.getLength(obj);
                for (int i11 = 0; i11 < length; i11++) {
                    this.f839b.e(qVar, Array.get(obj, i11));
                }
                qVar.p(1, 2, ']');
                return;
            default:
                qVar.g();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (entry.getKey() == null) {
                        throw new JsonDataException("Map key is null at ".concat(qVar.t()));
                    }
                    int iG = qVar.G();
                    if (iG != 5 && iG != 3) {
                        h2.b("Nesting problem.");
                        return;
                    } else {
                        qVar.f903e = true;
                        this.f839b.e(qVar, entry.getKey());
                        ((k) this.f840c).e(qVar, entry.getValue());
                    }
                }
                qVar.r();
                return;
        }
    }

    public final String toString() {
        switch (this.f838a) {
            case 0:
                return this.f839b + ".array()";
            default:
                return "JsonAdapter(" + this.f839b + "=" + ((k) this.f840c) + ")";
        }
    }

    public b(Class cls, k kVar) {
        this.f840c = cls;
        this.f839b = kVar;
    }
}
