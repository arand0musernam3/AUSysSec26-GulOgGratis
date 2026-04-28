package aa;

import com.google.android.gms.internal.measurement.t5;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import y00.h1;
import y00.l4;
import y00.n1;
import y00.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends q1.b0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1125g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1126h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h1 h1Var) {
        super(20);
        this.f1126h = h1Var;
    }

    @Override // q1.b0
    public Object a(Object obj) {
        LinkedHashMap linkedHashMap;
        switch (this.f1125g) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return ((k) this.f1126h).f1127a.v0(str);
            case 1:
            default:
                return super.a(obj);
            case 2:
                String str2 = (String) obj;
                com.google.android.gms.common.internal.i0.e(str2);
                h1 h1Var = (h1) this.f1126h;
                h1Var.q();
                com.google.android.gms.common.internal.i0.e(str2);
                y00.m mVar = h1Var.f44586c.f44922c;
                l4.U(mVar);
                t5.a aVarX0 = mVar.x0(str2);
                if (aVarX0 == null) {
                    return null;
                }
                w0 w0Var = ((n1) h1Var.f21216b).f44987f;
                n1.m(w0Var);
                w0Var.f45267o.b(str2, "Populate EES config from database on cache miss. appId");
                h1Var.x(str2, h1Var.y(str2, (byte[]) aVarX0.f39791b));
                j jVar = h1Var.l;
                synchronized (jVar.f35717c) {
                    Set setEntrySet = jVar.f35716b.f24902a.entrySet();
                    setEntrySet.getClass();
                    linkedHashMap = new LinkedHashMap(setEntrySet.size());
                    Set<Map.Entry> setEntrySet2 = jVar.f35716b.f24902a.entrySet();
                    setEntrySet2.getClass();
                    for (Map.Entry entry : setEntrySet2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                        break;
                    }
                }
                return (t5) linkedHashMap.get(str2);
        }
    }

    @Override // q1.b0
    public void b(Object obj, Object obj2, Object obj3) throws Exception {
        switch (this.f1125g) {
            case 0:
                ha.c cVar = (ha.c) obj2;
                ((String) obj).getClass();
                cVar.getClass();
                cVar.close();
                break;
            case 1:
                xc.f fVar = (xc.f) obj2;
                ((xc.i) ((ub.a) this.f1126h).f40981b).e((xc.b) obj, fVar.f44227a, fVar.f44228b, fVar.f44229c);
                break;
            default:
                super.b(obj, obj2, obj3);
                break;
        }
    }

    @Override // q1.b0
    public int g(Object obj, Object obj2) {
        switch (this.f1125g) {
            case 1:
                return ((xc.f) obj2).f44229c;
            default:
                return super.g(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i11, ub.a aVar) {
        super(i11);
        this.f1126h = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar) {
        super(25);
        this.f1126h = kVar;
    }
}
