package x90;

import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d[] f44113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f44114b;

    static {
        d dVar = new d(d.f44094i, "");
        ia0.j jVar = d.f44091f;
        d dVar2 = new d(jVar, "GET");
        d dVar3 = new d(jVar, "POST");
        ia0.j jVar2 = d.f44092g;
        d dVar4 = new d(jVar2, ExpiryDateInput.SEPARATOR);
        d dVar5 = new d(jVar2, "/index.html");
        ia0.j jVar3 = d.f44093h;
        d dVar6 = new d(jVar3, "http");
        d dVar7 = new d(jVar3, "https");
        ia0.j jVar4 = d.f44090e;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, new d(jVar4, "200"), new d(jVar4, "204"), new d(jVar4, "206"), new d(jVar4, "304"), new d(jVar4, "400"), new d(jVar4, "404"), new d(jVar4, "500"), new d("accept-charset", ""), new d("accept-encoding", "gzip, deflate"), new d("accept-language", ""), new d("accept-ranges", ""), new d("accept", ""), new d("access-control-allow-origin", ""), new d("age", ""), new d("allow", ""), new d("authorization", ""), new d("cache-control", ""), new d("content-disposition", ""), new d("content-encoding", ""), new d("content-language", ""), new d("content-length", ""), new d("content-location", ""), new d("content-range", ""), new d("content-type", ""), new d("cookie", ""), new d("date", ""), new d("etag", ""), new d("expect", ""), new d("expires", ""), new d("from", ""), new d("host", ""), new d("if-match", ""), new d("if-modified-since", ""), new d("if-none-match", ""), new d("if-range", ""), new d("if-unmodified-since", ""), new d("last-modified", ""), new d("link", ""), new d("location", ""), new d("max-forwards", ""), new d("proxy-authenticate", ""), new d("proxy-authorization", ""), new d("range", ""), new d("referer", ""), new d("refresh", ""), new d("retry-after", ""), new d("server", ""), new d("set-cookie", ""), new d("strict-transport-security", ""), new d("transfer-encoding", ""), new d("user-agent", ""), new d("vary", ""), new d("via", ""), new d("www-authenticate", "")};
        f44113a = dVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i11 = 0; i11 < 61; i11++) {
            if (!linkedHashMap.containsKey(dVarArr[i11].f44095a)) {
                linkedHashMap.put(dVarArr[i11].f44095a, Integer.valueOf(i11));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        f44114b = mapUnmodifiableMap;
    }

    public static void a(ia0.j jVar) throws IOException {
        jVar.getClass();
        int iE = jVar.e();
        for (int i11 = 0; i11 < iE; i11++) {
            byte bJ = jVar.j(i11);
            if (65 <= bJ && bJ < 91) {
                i4.a.k("PROTOCOL_ERROR response malformed: mixed case name: ".concat(jVar.s()));
                return;
            }
        }
    }
}
