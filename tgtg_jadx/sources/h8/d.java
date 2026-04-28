package h8;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.l;
import androidx.datastore.preferences.protobuf.z;
import com.braze.h2;
import cp.i;
import d8.c0;
import d8.g1;
import d8.x0;
import d8.y;
import g3.j5;
import g8.j;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f21664a = new d();

    public static c d(e8.a aVar, a90.d dVar, Function0 function0) {
        n0 n0Var = n0.f26529a;
        n0Var.getClass();
        j5 j5Var = new j5(2, function0);
        return new c(new c(new y(new c0(f21664a, new i(13), j5Var), kotlin.collections.c0.c(new d8.c(n0Var, (x70.c) null, 0)), aVar, dVar)));
    }

    @Override // d8.x0
    public Object a() {
        return w0.e.o();
    }

    @Override // d8.x0
    public Unit b(Object obj, g1 g1Var) throws IOException {
        z zVarA;
        Map mapA = ((g) obj).a();
        g8.c cVarN = g8.e.n();
        for (Map.Entry entry : mapA.entrySet()) {
            e eVar = (e) entry.getKey();
            Object value = entry.getValue();
            String str = eVar.f21665a;
            if (value instanceof Boolean) {
                g8.h hVarD = j.D();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                hVarD.c();
                j.q((j) hVarD.f3058b, zBooleanValue);
                zVarA = hVarD.a();
            } else if (value instanceof Float) {
                g8.h hVarD2 = j.D();
                float fFloatValue = ((Number) value).floatValue();
                hVarD2.c();
                j.r((j) hVarD2.f3058b, fFloatValue);
                zVarA = hVarD2.a();
            } else if (value instanceof Double) {
                g8.h hVarD3 = j.D();
                double dDoubleValue = ((Number) value).doubleValue();
                hVarD3.c();
                j.o((j) hVarD3.f3058b, dDoubleValue);
                zVarA = hVarD3.a();
            } else if (value instanceof Integer) {
                g8.h hVarD4 = j.D();
                int iIntValue = ((Number) value).intValue();
                hVarD4.c();
                j.s((j) hVarD4.f3058b, iIntValue);
                zVarA = hVarD4.a();
            } else if (value instanceof Long) {
                g8.h hVarD5 = j.D();
                long jLongValue = ((Number) value).longValue();
                hVarD5.c();
                j.l((j) hVarD5.f3058b, jLongValue);
                zVarA = hVarD5.a();
            } else if (value instanceof String) {
                g8.h hVarD6 = j.D();
                hVarD6.c();
                j.m((j) hVarD6.f3058b, (String) value);
                zVarA = hVarD6.a();
            } else if (value instanceof Set) {
                g8.h hVarD7 = j.D();
                g8.f fVarO = g8.g.o();
                fVarO.c();
                g8.g.l((g8.g) fVarO.f3058b, (Set) value);
                hVarD7.c();
                j.n((j) hVarD7.f3058b, (g8.g) fVarO.a());
                zVarA = hVarD7.a();
            } else {
                if (!(value instanceof byte[])) {
                    h2.b(e0.f.j(value, "PreferencesSerializer does not support type: "));
                    return null;
                }
                g8.h hVarD8 = j.D();
                byte[] bArr = (byte[]) value;
                androidx.datastore.preferences.protobuf.f fVarD = androidx.datastore.preferences.protobuf.f.d(0, bArr.length, bArr);
                hVarD8.c();
                j.p((j) hVarD8.f3058b, fVarD);
                zVarA = hVarD8.a();
            }
            cVarN.getClass();
            str.getClass();
            cVarN.c();
            g8.e.l((g8.e) cVarN.f3058b).put(str, (j) zVarA);
        }
        g8.e eVar2 = (g8.e) cVarN.a();
        int iA = eVar2.a(null);
        Logger logger = l.f3001f;
        if (iA > 4096) {
            iA = 4096;
        }
        l lVar = new l(g1Var, iA);
        eVar2.b(lVar);
        if (lVar.f3006d > 0) {
            lVar.k();
        }
        return Unit.f26487a;
    }

    @Override // d8.x0
    public Object c(FileInputStream fileInputStream) throws CorruptionException {
        byte[] bArr;
        try {
            g8.e eVarO = g8.e.o(fileInputStream);
            a aVar = new a(false);
            f[] fVarArr = (f[]) Arrays.copyOf(new f[0], 0);
            aVar.d();
            if (fVarArr.length > 0) {
                f fVar = fVarArr[0];
                throw null;
            }
            Map mapM = eVarO.m();
            mapM.getClass();
            for (Map.Entry entry : mapM.entrySet()) {
                String str = (String) entry.getKey();
                j jVar = (j) entry.getValue();
                str.getClass();
                jVar.getClass();
                g8.i iVarC = jVar.C();
                switch (iVarC == null ? -1 : h.$EnumSwitchMapping$0[iVarC.ordinal()]) {
                    case -1:
                        throw new CorruptionException("Value case is null.", null);
                    case 0:
                    default:
                        e40.a.f();
                        return null;
                    case 1:
                        aVar.g(new e(str), Boolean.valueOf(jVar.t()));
                        break;
                    case 2:
                        aVar.g(new e(str), Float.valueOf(jVar.x()));
                        break;
                    case 3:
                        aVar.g(new e(str), Double.valueOf(jVar.w()));
                        break;
                    case 4:
                        aVar.g(new e(str), Integer.valueOf(jVar.y()));
                        break;
                    case 5:
                        aVar.g(new e(str), Long.valueOf(jVar.z()));
                        break;
                    case 6:
                        aVar.g(new e(str), jVar.A());
                        break;
                    case 7:
                        e eVar = new e(str);
                        a0 a0VarN = jVar.B().n();
                        a0VarN.getClass();
                        aVar.g(eVar, CollectionsKt.v0(a0VarN));
                        break;
                    case 8:
                        e eVar2 = new e(str);
                        androidx.datastore.preferences.protobuf.f fVarU = jVar.u();
                        int size = fVarU.size();
                        if (size == 0) {
                            bArr = b0.f2931b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            fVarU.e(size, bArr2);
                            bArr = bArr2;
                        }
                        aVar.g(eVar2, bArr);
                        break;
                    case 9:
                        throw new CorruptionException("Value not set.", null);
                }
            }
            return new a(new LinkedHashMap(aVar.a()), true);
        } catch (InvalidProtocolBufferException e5) {
            throw new CorruptionException("Unable to parse preferences proto.", e5);
        }
    }
}
