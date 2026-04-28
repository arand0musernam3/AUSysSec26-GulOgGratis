package r40;

import android.content.Context;
import cg.k;
import h2.b1;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o00.h0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h8.e f37622b = new h8.e("fire-global");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h8.e f37623c = new h8.e("fire-count");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h8.e f37624d = new h8.e("last-used-date");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k40.b f37625a;

    public h(Context context, String str) {
        this.f37625a = new k40.b(context, "FirebaseHeartBeat".concat(str));
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strB = b(System.currentTimeMillis());
            k40.b bVar = this.f37625a;
            bVar.getClass();
            for (Map.Entry entry : ((Map) f0.E(kotlin.coroutines.g.f26549a, new b1(bVar, null, 8))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strB);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(((h8.e) entry.getKey()).f21665a, new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f37625a.a(new k(jCurrentTimeMillis, 8));
            }
            return arrayList;
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized String b(long j9) {
        return new Date(j9).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized h8.e c(h8.a aVar, String str) {
        for (Map.Entry entry : aVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        String str2 = ((h8.e) entry.getKey()).f21665a;
                        str2.getClass();
                        return new h8.e(str2);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void d(h8.a aVar, String str) {
        try {
            h8.e eVarC = c(aVar, str);
            if (eVarC == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) h0.x(aVar, eVarC, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                aVar.e(eVarC);
            } else {
                aVar.g(eVarC, hashSet);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean e(h8.e eVar, long j9) {
        x70.c cVar;
        kotlin.coroutines.g gVar;
        long jLongValue;
        k40.b bVar = this.f37625a;
        bVar.getClass();
        eVar.getClass();
        cVar = null;
        gf.g gVar2 = new gf.g(bVar, eVar, cVar, 19);
        gVar = kotlin.coroutines.g.f26549a;
        jLongValue = ((Long) f0.E(gVar, gVar2)).longValue();
        synchronized (this) {
        }
        if (b(jLongValue).equals(b(j9))) {
            return false;
        }
        k40.b bVar2 = this.f37625a;
        Long lValueOf = Long.valueOf(j9);
        bVar2.getClass();
        return true;
    }
}
