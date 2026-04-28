package g40;

import a40.b0;
import a40.d0;
import a40.i;
import a40.v;
import a60.y;
import android.content.Context;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import b4.t;
import b40.f;
import b5.g;
import c40.d;
import c40.e;
import c40.h;
import c40.p;
import c40.q;
import c50.w;
import cn.x;
import com.app.tgtg.R;
import com.google.android.gms.internal.measurement.ye;
import com.google.android.gms.tasks.Tasks;
import cz.j;
import d10.o;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import d40.c1;
import d40.c2;
import d40.d1;
import d40.f0;
import d40.f1;
import d40.g1;
import d40.j2;
import d40.o0;
import d40.p0;
import d40.q0;
import d40.t0;
import d40.v0;
import d40.z0;
import dn.k;
import g3.r9;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import kotlin.jvm.functions.Function2;
import m0.c0;
import m3.n;
import m3.s;
import m3.w1;
import o00.x0;
import s1.r0;
import t1.u1;
import v2.c;
import w.a0;
import w2.z;
import x60.l;
import x60.m;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f20000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f20001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f20002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f20003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f20004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f20005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f20006g;

    public b(String str, b bVar, f fVar) {
        this.f20003d = new q(this, false);
        this.f20004e = new q(this, true);
        this.f20005f = new y(1);
        this.f20006g = new AtomicMarkableReference(null, false);
        this.f20000a = str;
        this.f20001b = new h(bVar);
        this.f20002c = fVar;
    }

    public static p0 b(p0 p0Var, c40.f fVar, b bVar, Map map) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        Map mapUnmodifiableMap3;
        o0 o0VarA = p0Var.a();
        String strB = ((d) fVar.f7066b).b();
        if (strB != null) {
            o0VarA.f14301e = new c1(strB);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        boolean zIsEmpty = map.isEmpty();
        q qVar = (q) bVar.f20003d;
        if (zIsEmpty) {
            e eVar = (e) ((AtomicMarkableReference) qVar.f7093c).getReference();
            synchronized (eVar) {
                mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(eVar.f7061a));
            }
        } else {
            e eVar2 = (e) ((AtomicMarkableReference) qVar.f7093c).getReference();
            synchronized (eVar2) {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(eVar2.f7061a));
            }
            HashMap map2 = new HashMap(mapUnmodifiableMap);
            int i11 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strA = e.a(1024, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strA)) {
                    map2.put(strA, e.a(1024, (String) entry.getValue()));
                } else {
                    i11++;
                }
            }
            if (i11 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i11 + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
        }
        List listI = i(mapUnmodifiableMap2);
        e eVar3 = (e) ((AtomicMarkableReference) ((q) bVar.f20004e).f7093c).getReference();
        synchronized (eVar3) {
            mapUnmodifiableMap3 = Collections.unmodifiableMap(new HashMap(eVar3.f7061a));
        }
        List listI2 = i(mapUnmodifiableMap3);
        if (!listI.isEmpty() || !listI2.isEmpty()) {
            q0 q0Var = (q0) p0Var.f14310c;
            o0VarA.f14299c = new q0(q0Var.f14320a, listI, listI2, q0Var.f14323d, q0Var.f14324e, q0Var.f14325f, q0Var.f14326g);
        }
        return o0VarA.a();
    }

    public static j2 c(p0 p0Var, b bVar) {
        List listUnmodifiableList;
        y yVar = (y) bVar.f20005f;
        synchronized (yVar) {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList(yVar.f940a));
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < listUnmodifiableList.size(); i11++) {
            p pVar = (p) listUnmodifiableList.get(i11);
            pVar.getClass();
            d1 d1Var = new d1();
            c40.b bVar2 = (c40.b) pVar;
            String str = bVar2.f7056e;
            if (str == null) {
                w.l("Null variantId");
                return null;
            }
            String str2 = bVar2.f7053b;
            if (str2 == null) {
                w.l("Null rolloutId");
                return null;
            }
            d1Var.f14135a = new f1(str2, str);
            String str3 = bVar2.f7054c;
            if (str3 == null) {
                w.l("Null parameterKey");
                return null;
            }
            d1Var.f14136b = str3;
            d1Var.f14137c = bVar2.f7055d;
            d1Var.f14138d = bVar2.f7057f;
            d1Var.f14139e = (byte) (d1Var.f14139e | 1);
            arrayList.add(d1Var.a());
        }
        if (arrayList.isEmpty()) {
            return p0Var;
        }
        o0 o0VarA = p0Var.a();
        o0VarA.f14302f = new g1(arrayList);
        return o0VarA.a();
    }

    public static String f(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bArr = new byte[8192];
            } finally {
            }
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
        while (true) {
            int i11 = bufferedInputStream.read(bArr);
            if (i11 == -1) {
                String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                byteArrayOutputStream.close();
                bufferedInputStream.close();
                return string;
            }
            byteArrayOutputStream.write(bArr, 0, i11);
            bufferedInputStream.close();
            throw th2;
        }
    }

    public static b g(Context context, b0 b0Var, b bVar, a40.a aVar, c40.f fVar, b bVar2, k kVar, j jVar, z zVar, a40.k kVar2, f fVar2) {
        v vVar = new v(context, b0Var, aVar, kVar, jVar);
        a aVar2 = new a(bVar, jVar, kVar2);
        e40.c cVar = h40.a.f21393b;
        wy.p.b(context);
        return new b(vVar, aVar2, new h40.a(new h40.c(wy.p.a().c(new uy.a(h40.a.f21394c, h40.a.f21395d)).a("FIREBASE_CRASHLYTICS_REPORT", new ty.c("json"), h40.a.f21396e), jVar.h(), zVar)), fVar, bVar2, b0Var, fVar2);
    }

    public static List i(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                w.l("Null key");
                return null;
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                w.l("Null value");
                return null;
            }
            arrayList.add(new f0(str, str2));
        }
        Collections.sort(arrayList, new i(1));
        return Collections.unmodifiableList(arrayList);
    }

    public static synchronized void k(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean l(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                l(file2);
            }
        }
        return file.delete();
    }

    public static List m(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r4v23, types: [boolean] */
    @Override // v2.c
    public void a(u3.d dVar, n nVar, int i11) {
        Function2 function2;
        b4.q qVar;
        boolean z11;
        int i12;
        l lVar;
        m mVar = (m) this.f20000a;
        s sVar = (s) nVar;
        sVar.c0(-1163756443);
        int i13 = i11 | (sVar.f(this) ? 32 : 16);
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            float f11 = mVar.f44017n;
            float f12 = mVar.l;
            b4.q qVar2 = b4.q.f5711a;
            t tVarZ = d2.c.z(qVar2, f11);
            b4.j jVar = b4.d.f5693k;
            l lVar2 = (l) this.f20001b;
            v2.h hVar = (v2.h) this.f20002c;
            x60.h hVar2 = (x60.h) this.f20003d;
            x60.j jVar2 = (x60.j) this.f20004e;
            g4.l lVar3 = (g4.l) this.f20005f;
            Function2 function22 = (Function2) this.f20006g;
            d2.b bVar = d2.i.f13801a;
            i2 i2VarA = h2.a(bVar, jVar, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarZ, sVar);
            b5.j.R.getClass();
            b5.h hVar3 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar3);
            } else {
                sVar.n0();
            }
            g gVar = b5.i.f5843f;
            m3.i.C(i2VarA, gVar, sVar);
            g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar, dVar2);
            g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            t tVarE = m2.e(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), lVar2.f43995g);
            i2 i2VarA2 = h2.a(bVar, jVar, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarE, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar3);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA2, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC2, gVar4, sVar);
            g3.i2.a(x0.z(R.drawable.ic_magnifying_glass, sVar, 0), "", m2.m(qVar2, lVar2.f44002o), hVar2.K, sVar, 56, 0);
            d2.c.f(m2.m(qVar2, f12), sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            u0 u0VarD = d2.p.d(b4.d.f5686d, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = b4.a.c(n1Var, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar3);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC3, gVar4, sVar);
            if (hVar.b().f41928c.length() == 0) {
                sVar.a0(-252370841);
                i12 = 0;
                lVar = lVar2;
                qVar = qVar2;
                z11 = true;
                r9.d(o30.f0.U(sVar, R.string.mnu_checkout_address_search_hint), null, hVar2.K, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar2.f43958g, sVar, 0, 0, 131066);
                sVar = sVar;
                sVar.q(false);
            } else {
                qVar = qVar2;
                z11 = true;
                i12 = 0;
                lVar = lVar2;
                sVar.a0(-252095189);
                sVar.q(false);
            }
            function2 = dVar;
            function2.invoke(sVar, 6);
            sVar.q(z11);
            sVar.q(z11);
            d2.c.f(m2.m(qVar, f12), sVar);
            s sVar2 = sVar;
            s1.y.e(hVar.b().f41928c.length() > 0 ? z11 : i12, null, r0.f(new u1(300, i12, null, 6), 0.0f, 6), r0.g(new u1(300, i12, null, 6), 0.0f, 6), null, u3.e.e(-491685719, sVar, new x(9, lVar, hVar, lVar3, function22)), sVar2, 1600518, 18);
            sVar = sVar2;
            sVar.q(z11);
        } else {
            function2 = dVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.i(this, function2, i11, 28);
        }
    }

    public s0.n d() {
        String strConcat = ((Size) this.f20000a) == null ? " resolution" : "";
        if (((Size) this.f20001b) == null) {
            strConcat = strConcat.concat(" originalConfiguredResolution");
        }
        if (((c0) this.f20002c) == null) {
            strConcat = strConcat.concat(" dynamicRange");
        }
        if (((Integer) this.f20003d) == null) {
            strConcat = strConcat.concat(" sessionType");
        }
        if (((Range) this.f20004e) == null) {
            strConcat = strConcat.concat(" expectedFrameRateRange");
        }
        if (((Boolean) this.f20006g) == null) {
            strConcat = strConcat.concat(" zslDisabled");
        }
        if (strConcat.isEmpty()) {
            return new s0.n((Size) this.f20000a, (Size) this.f20001b, (c0) this.f20002c, ((Integer) this.f20003d).intValue(), (Range) this.f20004e, (s0.u0) this.f20005f, ((Boolean) this.f20006g).booleanValue());
        }
        com.braze.h2.b("Missing required properties:".concat(strConcat));
        return null;
    }

    public void e(String str) {
        File file = new File((File) this.f20001b, str);
        if (file.exists() && l(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public File h(String str, String str2) {
        File file = new File((File) this.f20003d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void j(Throwable th2, Thread thread, String str, final c40.c cVar, boolean z11) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        byte b8;
        final boolean zEquals = str.equals("crash");
        v vVar = (v) this.f20000a;
        long j9 = cVar.f7059b;
        Context context = vVar.f793a;
        int i11 = context.getResources().getConfiguration().orientation;
        k kVar = vVar.f796d;
        Stack stack = new Stack();
        for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        com.google.firebase.messaging.a0 a0Var = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            a0Var = new com.google.firebase.messaging.a0(11, th3.getLocalizedMessage(), th3.getClass().getName(), kVar.f(th3.getStackTrace()), a0Var);
        }
        com.google.firebase.messaging.a0 a0Var2 = a0Var;
        o0 o0Var = new o0();
        o0Var.f14298b = str;
        o0Var.f14297a = j9;
        o0Var.f14303g = (byte) (o0Var.f14303g | 1);
        c2 c2VarB = x30.c.f43821a.b(context);
        int i12 = ((z0) c2VarB).f14409c;
        Boolean boolValueOf = i12 > 0 ? Boolean.valueOf(i12 != 100) : null;
        ArrayList arrayListA = x30.c.a(context);
        byte b11 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) a0Var2.f12781d;
        String name = thread.getName();
        if (name == null) {
            w.l("Null name");
            return;
        }
        byte b12 = (byte) 1;
        List listD = v.d(stackTraceElementArr, 4);
        if (listD == null) {
            w.l("Null frames");
            return;
        }
        if (b12 != 1) {
            StringBuilder sb2 = new StringBuilder();
            if (b12 == 0) {
                sb2.append(" importance");
            }
            com.braze.h2.b(a0.q("Missing required properties:", sb2));
            return;
        }
        arrayList.add(new v0(name, listD, 4));
        if (z11) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                Thread key = next.getKey();
                if (key.equals(thread)) {
                    it = it2;
                    b8 = b12;
                } else {
                    StackTraceElement[] stackTraceElementArrF = kVar.f(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        w.l("Null name");
                        return;
                    }
                    it = it2;
                    List listD2 = v.d(stackTraceElementArrF, 0);
                    if (listD2 == null) {
                        w.l("Null frames");
                        return;
                    }
                    if (b12 != 1) {
                        byte b13 = b12;
                        StringBuilder sb3 = new StringBuilder();
                        if (b13 == 0) {
                            sb3.append(" importance");
                        }
                        com.braze.h2.b(a0.q("Missing required properties:", sb3));
                        return;
                    }
                    b8 = b12;
                    arrayList.add(new v0(name2, listD2, 0));
                }
                it2 = it;
                b12 = b8;
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        t0 t0VarC = v.c(a0Var2, 0);
        d40.u0 u0VarE = v.e();
        List listA = vVar.a();
        if (listA == null) {
            w.l("Null binaries");
            return;
        }
        d40.r0 r0Var = new d40.r0(listUnmodifiableList, t0VarC, null, u0VarE, listA);
        if (b11 != 1) {
            StringBuilder sb4 = new StringBuilder();
            if (b11 == 0) {
                sb4.append(" uiOrientation");
            }
            com.braze.h2.b(a0.q("Missing required properties:", sb4));
            return;
        }
        o0Var.f14299c = new q0(r0Var, null, null, boolValueOf, c2VarB, arrayListA, i11);
        o0Var.f14300d = vVar.b(i11);
        p0 p0VarA = o0Var.a();
        Map map = cVar.f7060c;
        c40.f fVar = (c40.f) this.f20003d;
        b bVar = (b) this.f20004e;
        final j2 j2VarC = c(b(p0VarA, fVar, bVar, map), bVar);
        if (z11) {
            ((a) this.f20001b).d(j2VarC, cVar.f7058a, zEquals);
        } else {
            ((f) this.f20006g).f5743b.a(new Runnable() { // from class: a40.c0
                @Override // java.lang.Runnable
                public final void run() {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                    }
                    ((g40.a) this.f714a.f20001b).d(j2VarC, cVar.f7058a, zEquals);
                }
            });
        }
    }

    public o n(String str, Executor executor) {
        a40.b bVar;
        d10.g gVar;
        ArrayList<File> arrayListB = ((a) this.f20001b).b();
        ArrayList<a40.b> arrayList = new ArrayList();
        for (File file : arrayListB) {
            try {
                e40.c cVar = a.f19993g;
                String strE = a.e(file);
                cVar.getClass();
                arrayList.add(new a40.b(e40.c.i(strE), file.getName(), file));
            } catch (IOException e5) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e5);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (a40.b bVar2 : arrayList) {
            if (str == null || str.equals(bVar2.f701b)) {
                h40.a aVar = (h40.a) this.f20002c;
                d40.b0 b0Var = bVar2.f700a;
                if (b0Var.f14087f == null || b0Var.f14088g == null) {
                    a40.a0 a0VarB = ((b0) this.f20005f).b(true);
                    d40.b0 b0Var2 = bVar2.f700a;
                    String str2 = a0VarB.f698a;
                    d40.a0 a0VarA = b0Var2.a();
                    a0VarA.f14058e = str2;
                    d40.b0 b0VarA = a0VarA.a();
                    String str3 = a0VarB.f699b;
                    d40.a0 a0VarA2 = b0VarA.a();
                    a0VarA2.f14059f = str3;
                    bVar = new a40.b(a0VarA2.a(), bVar2.f701b, bVar2.f702c);
                } else {
                    bVar = bVar2;
                }
                boolean z11 = str != null;
                h40.c cVar2 = aVar.f21397a;
                synchronized (cVar2.f21407f) {
                    try {
                        gVar = new d10.g();
                        if (z11) {
                            ((AtomicInteger) cVar2.f21410i.f43083b).getAndIncrement();
                            if (cVar2.f21407f.size() < cVar2.f21406e) {
                                x30.b bVar3 = x30.b.f43820a;
                                bVar3.b("Enqueueing report: " + bVar.f701b);
                                bVar3.b("Queue size: " + cVar2.f21407f.size());
                                cVar2.f21408g.execute(new ye(2, cVar2, bVar, gVar, false));
                                bVar3.b("Closing task for report: " + bVar.f701b);
                                gVar.d(bVar);
                            } else {
                                cVar2.a();
                                String str4 = "Dropping report due to queue being full: " + bVar.f701b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) cVar2.f21410i.f43084c).getAndIncrement();
                                gVar.d(bVar);
                            }
                        } else {
                            cVar2.b(bVar, gVar);
                        }
                    } finally {
                    }
                }
                arrayList2.add(gVar.f13697a.i(executor, new d0()));
            }
        }
        return Tasks.e(arrayList2);
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.f20000a = obj;
        this.f20001b = obj2;
        this.f20002c = obj3;
        this.f20003d = obj4;
        this.f20004e = obj5;
        this.f20005f = obj6;
        this.f20006g = obj7;
    }
}
