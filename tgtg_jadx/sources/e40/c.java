package e40;

import android.util.JsonReader;
import d40.a2;
import d40.b0;
import d40.b1;
import d40.b2;
import d40.c0;
import d40.c1;
import d40.c2;
import d40.d0;
import d40.d2;
import d40.e;
import d40.e0;
import d40.e1;
import d40.e2;
import d40.f0;
import d40.f1;
import d40.f2;
import d40.g;
import d40.g0;
import d40.g1;
import d40.g2;
import d40.h;
import d40.h0;
import d40.h2;
import d40.i;
import d40.i1;
import d40.i2;
import d40.j;
import d40.j0;
import d40.j1;
import d40.j2;
import d40.k;
import d40.k0;
import d40.k2;
import d40.l;
import d40.l0;
import d40.l2;
import d40.m;
import d40.m2;
import d40.n;
import d40.n0;
import d40.n2;
import d40.o;
import d40.o1;
import d40.p;
import d40.p0;
import d40.p1;
import d40.q;
import d40.q0;
import d40.q1;
import d40.r;
import d40.r0;
import d40.r1;
import d40.s;
import d40.s0;
import d40.s1;
import d40.t;
import d40.t0;
import d40.t1;
import d40.u;
import d40.u0;
import d40.u1;
import d40.v;
import d40.v0;
import d40.v1;
import d40.w;
import d40.w0;
import d40.w1;
import d40.x;
import d40.x0;
import d40.x1;
import d40.y;
import d40.y0;
import d40.y1;
import d40.z;
import d40.z0;
import d40.z1;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jd.f;
import o40.d;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f15747a;

    static {
        d dVar = new d();
        d40.d dVar2 = d40.d.f14114a;
        dVar.a(n2.class, dVar2);
        dVar.a(b0.class, dVar2);
        j jVar = j.f14202a;
        dVar.a(m2.class, jVar);
        dVar.a(j0.class, jVar);
        g gVar = g.f14157a;
        dVar.a(u1.class, gVar);
        dVar.a(k0.class, gVar);
        h hVar = h.f14168a;
        dVar.a(t1.class, hVar);
        dVar.a(l0.class, hVar);
        z zVar = z.f14405a;
        dVar.a(l2.class, zVar);
        dVar.a(j1.class, zVar);
        y yVar = y.f14395a;
        dVar.a(k2.class, yVar);
        dVar.a(i1.class, yVar);
        i iVar = i.f14176a;
        dVar.a(v1.class, iVar);
        dVar.a(n0.class, iVar);
        t tVar = t.f14348a;
        dVar.a(j2.class, tVar);
        dVar.a(p0.class, tVar);
        k kVar = k.f14226a;
        dVar.a(d2.class, kVar);
        dVar.a(q0.class, kVar);
        m mVar = m.f14254a;
        dVar.a(b2.class, mVar);
        dVar.a(r0.class, mVar);
        p pVar = p.f14304a;
        dVar.a(a2.class, pVar);
        dVar.a(v0.class, pVar);
        q qVar = q.f14314a;
        dVar.a(z1.class, qVar);
        dVar.a(x0.class, qVar);
        n nVar = n.f14276a;
        dVar.a(x1.class, nVar);
        dVar.a(t0.class, nVar);
        d40.b bVar = d40.b.f14073a;
        dVar.a(p1.class, bVar);
        dVar.a(d0.class, bVar);
        d40.a aVar = d40.a.f14050a;
        dVar.a(o1.class, aVar);
        dVar.a(e0.class, aVar);
        o oVar = o.f14293a;
        dVar.a(y1.class, oVar);
        dVar.a(u0.class, oVar);
        l lVar = l.f14243a;
        dVar.a(w1.class, lVar);
        dVar.a(s0.class, lVar);
        d40.c cVar = d40.c.f14100a;
        dVar.a(q1.class, cVar);
        dVar.a(f0.class, cVar);
        r rVar = r.f14327a;
        dVar.a(c2.class, rVar);
        dVar.a(z0.class, rVar);
        s sVar = s.f14337a;
        dVar.a(e2.class, sVar);
        dVar.a(b1.class, sVar);
        u uVar = u.f14366a;
        dVar.a(f2.class, uVar);
        dVar.a(c1.class, uVar);
        x xVar = x.f14388a;
        dVar.a(i2.class, xVar);
        dVar.a(g1.class, xVar);
        v vVar = v.f14371a;
        dVar.a(h2.class, vVar);
        dVar.a(e1.class, vVar);
        w wVar = w.f14379a;
        dVar.a(g2.class, wVar);
        dVar.a(f1.class, wVar);
        e eVar = e.f14140a;
        dVar.a(s1.class, eVar);
        dVar.a(g0.class, eVar);
        d40.f fVar = d40.f.f14150a;
        dVar.a(r1.class, fVar);
        dVar.a(h0.class, fVar);
        dVar.f31981d = true;
        f15747a = new f(dVar, 14);
    }

    public static x0 a(JsonReader jsonReader) throws IOException {
        w0 w0Var = new w0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    w0Var.f14385d = jsonReader.nextLong();
                    w0Var.f14387f = (byte) (w0Var.f14387f | 2);
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        c50.w.l("Null symbol");
                        return null;
                    }
                    w0Var.f14383b = strNextString;
                    break;
                    break;
                case "pc":
                    w0Var.f14382a = jsonReader.nextLong();
                    w0Var.f14387f = (byte) (w0Var.f14387f | 1);
                    break;
                case "file":
                    w0Var.f14384c = jsonReader.nextString();
                    break;
                case "importance":
                    w0Var.f14386e = jsonReader.nextInt();
                    w0Var.f14387f = (byte) (w0Var.f14387f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return w0Var.a();
    }

    public static f0 b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    c50.w.l("Null key");
                    return null;
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    c50.w.l("Null value");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null) {
            return new f0(strNextString, strNextString2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (strNextString == null) {
            sb2.append(" key");
        }
        if (strNextString2 == null) {
            sb2.append(" value");
        }
        com.braze.h2.b(a0.q("Missing required properties:", sb2));
        return null;
    }

    public static d0 c(JsonReader jsonReader) throws IOException {
        c0 c0Var = new c0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    c0Var.f14111i = d(jsonReader, new c50.w(27));
                    break;
                case "pid":
                    c0Var.f14103a = jsonReader.nextInt();
                    c0Var.f14112j = (byte) (c0Var.f14112j | 1);
                    break;
                case "pss":
                    c0Var.f14107e = jsonReader.nextLong();
                    c0Var.f14112j = (byte) (c0Var.f14112j | 8);
                    break;
                case "rss":
                    c0Var.f14108f = jsonReader.nextLong();
                    c0Var.f14112j = (byte) (c0Var.f14112j | 16);
                    break;
                case "timestamp":
                    c0Var.f14109g = jsonReader.nextLong();
                    c0Var.f14112j = (byte) (c0Var.f14112j | 32);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        c50.w.l("Null processName");
                        return null;
                    }
                    c0Var.f14104b = strNextString;
                    break;
                    break;
                case "reasonCode":
                    c0Var.f14105c = jsonReader.nextInt();
                    c0Var.f14112j = (byte) (c0Var.f14112j | 2);
                    break;
                case "traceFile":
                    c0Var.f14110h = jsonReader.nextString();
                    break;
                case "importance":
                    c0Var.f14106d = jsonReader.nextInt();
                    c0Var.f14112j = (byte) (c0Var.f14112j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0Var.a();
    }

    public static List d(JsonReader jsonReader, b bVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(bVar.c(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x028e, code lost:
    
        r0 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0293, code lost:
    
        if (r5 != 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0295, code lost:
    
        r0.append(" name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x029a, code lost:
    
        if (r6 != 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x029c, code lost:
    
        r0.append(" code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02a3, code lost:
    
        if ((r4 & 1) != 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02a5, code lost:
    
        r0.append(" address");
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02aa, code lost:
    
        com.braze.h2.b(w.a0.q("Missing required properties:", r0));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [d40.t0] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [d40.p1] */
    /* JADX WARN: Type inference failed for: r24v2, types: [d40.d0] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [d40.u0] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static d40.p0 e(android.util.JsonReader r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.c.e(android.util.JsonReader):d40.p0");
    }

    public static t0 f(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        byte b8 = 0;
        int iNextInt = 0;
        String strNextString = null;
        String strNextString2 = null;
        List listD = null;
        t0 t0VarF = null;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b8 == 1 && strNextString != null && listD != null) {
                    return new t0(strNextString, strNextString2, listD, t0VarF, iNextInt);
                }
                StringBuilder sb2 = new StringBuilder();
                if (strNextString == null) {
                    sb2.append(" type");
                }
                if (listD == null) {
                    sb2.append(" frames");
                }
                if ((b8 & 1) == 0) {
                    sb2.append(" overflowCount");
                }
                com.braze.h2.b(a0.q("Missing required properties:", sb2));
                return null;
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    listD = d(jsonReader, new a(2));
                    if (listD == null) {
                        c50.w.l("Null frames");
                        return null;
                    }
                    break;
                    break;
                case "reason":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "type":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        c50.w.l("Null type");
                        return null;
                    }
                    break;
                    break;
                case "causedBy":
                    t0VarF = f(jsonReader);
                    break;
                case "overflowCount":
                    iNextInt = jsonReader.nextInt();
                    b8 = (byte) (b8 | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    public static z0 g(JsonReader jsonReader) throws IOException {
        y0 y0Var = new y0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    y0Var.f14401b = jsonReader.nextInt();
                    y0Var.f14404e = (byte) (y0Var.f14404e | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        c50.w.l("Null processName");
                        return null;
                    }
                    y0Var.f14400a = strNextString;
                    break;
                    break;
                case "defaultProcess":
                    y0Var.f14403d = jsonReader.nextBoolean();
                    y0Var.f14404e = (byte) (y0Var.f14404e | 4);
                    break;
                case "importance":
                    y0Var.f14402c = jsonReader.nextInt();
                    y0Var.f14404e = (byte) (y0Var.f14404e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return y0Var.a();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static d40.b0 h(android.util.JsonReader r30) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.c.h(android.util.JsonReader):d40.b0");
    }

    public static b0 i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                b0 b0VarH = h(jsonReader);
                jsonReader.close();
                return b0VarH;
            } finally {
            }
        } catch (IllegalStateException e5) {
            throw new IOException(e5);
        }
    }
}
