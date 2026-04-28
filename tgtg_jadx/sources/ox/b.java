package ox;

import com.braze.h2;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.x0;
import kotlin.collections.y;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final HashMap f33770m = x0.d(new Pair("embedding.weight", "embed.weight"), new Pair("dense1.weight", "fc1.weight"), new Pair("dense2.weight", "fc2.weight"), new Pair("dense3.weight", "fc3.weight"), new Pair("dense1.bias", "fc1.bias"), new Pair("dense2.bias", "fc2.bias"), new Pair("dense3.bias", "fc3.bias"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f33771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f33772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f33773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f33774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f33775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f33776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f33777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f33778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f33779i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f33780j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f33781k;
    public final HashMap l;

    public b(HashMap map) {
        Object obj = map.get("embed.weight");
        if (obj == null) {
            h2.b("Required value was null.");
            throw null;
        }
        this.f33771a = (a) obj;
        Object obj2 = map.get("convs.0.weight");
        if (obj2 == null) {
            h2.b("Required value was null.");
            throw null;
        }
        this.f33772b = h.U((a) obj2);
        Object obj3 = map.get("convs.1.weight");
        if (obj3 == null) {
            h2.b("Required value was null.");
            throw null;
        }
        this.f33773c = h.U((a) obj3);
        Object obj4 = map.get("convs.2.weight");
        if (obj4 == null) {
            h2.b("Required value was null.");
            throw null;
        }
        this.f33774d = h.U((a) obj4);
        Object obj5 = map.get("convs.0.bias");
        if (obj5 == null) {
            h2.b("Required value was null.");
            throw null;
        }
        this.f33775e = (a) obj5;
        Object obj6 = map.get("convs.1.bias");
        if (obj6 == null) {
            h2.b("Required value was null.");
            throw null;
        }
        this.f33776f = (a) obj6;
        Object obj7 = map.get("convs.2.bias");
        if (obj7 == null) {
            h2.b("Required value was null.");
            throw null;
        }
        this.f33777g = (a) obj7;
        Object obj8 = map.get("fc1.weight");
        if (obj8 == null) {
            h2.b("Required value was null.");
            throw null;
        }
        this.f33778h = h.T((a) obj8);
        Object obj9 = map.get("fc2.weight");
        if (obj9 == null) {
            h2.b("Required value was null.");
            throw null;
        }
        this.f33779i = h.T((a) obj9);
        Object obj10 = map.get("fc1.bias");
        if (obj10 == null) {
            h2.b("Required value was null.");
            throw null;
        }
        this.f33780j = (a) obj10;
        Object obj11 = map.get("fc2.bias");
        if (obj11 == null) {
            h2.b("Required value was null.");
            throw null;
        }
        this.f33781k = (a) obj11;
        this.l = new HashMap();
        for (String str : y.W(new String[]{d.MTML_INTEGRITY_DETECT.a(), d.MTML_APP_EVENT_PREDICTION.a()})) {
            String strL = k.l(str, ".weight");
            String strL2 = k.l(str, ".bias");
            a aVar = (a) map.get(strL);
            a aVar2 = (a) map.get(strL2);
            if (aVar != null) {
                this.l.put(strL, h.T(aVar));
            }
            if (aVar2 != null) {
                this.l.put(strL2, aVar2);
            }
        }
    }

    public final a a(a aVar, String[] strArr, String str) {
        HashMap map = this.l;
        if (!yx.a.f46339a.contains(this)) {
            try {
                a aVarS = h.s(h.v(strArr, this.f33771a), this.f33772b);
                h.l(aVarS, this.f33775e);
                h.O(aVarS);
                a aVarS2 = h.s(aVarS, this.f33773c);
                h.l(aVarS2, this.f33776f);
                h.O(aVarS2);
                a aVarK = h.K(aVarS2, 2);
                a aVarS3 = h.s(aVarK, this.f33774d);
                h.l(aVarS3, this.f33777g);
                h.O(aVarS3);
                a aVarK2 = h.K(aVarS, aVarS.f33767a[1]);
                a aVarK3 = h.K(aVarK, aVarK.f33767a[1]);
                a aVarK4 = h.K(aVarS3, aVarS3.f33767a[1]);
                h.x(aVarK2);
                h.x(aVarK3);
                h.x(aVarK4);
                a aVarT = h.t(h.r(new a[]{aVarK2, aVarK3, aVarK4, aVar}), this.f33778h, this.f33780j);
                h.O(aVarT);
                a aVarT2 = h.t(aVarT, this.f33779i, this.f33781k);
                h.O(aVarT2);
                a aVar2 = (a) map.get(str.concat(".weight"));
                a aVar3 = (a) map.get(str.concat(".bias"));
                if (aVar2 != null && aVar3 != null) {
                    a aVarT3 = h.t(aVarT2, aVar2, aVar3);
                    h.S(aVarT3);
                    return aVarT3;
                }
            } catch (Throwable th2) {
                yx.a.a(this, th2);
                return null;
            }
        }
        return null;
    }
}
