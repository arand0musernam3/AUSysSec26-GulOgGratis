package u6;

import a40.s;
import a40.t;
import a40.u;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import androidx.profileinstaller.ProfileInstallReceiver;
import bg.c0;
import com.app.tgtg.feature.tabprofile.storelogin.ui.RecommendStoreFragment;
import com.braze.h2;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.ranges.IntRange;
import l8.m;
import n80.p;
import org.json.JSONException;
import org.json.JSONObject;
import s0.r1;
import u70.l;
import u70.o;
import u70.q;
import v80.k;
import x0.g;
import y00.l4;
import y00.q4;
import y00.t2;
import y00.y0;
import z1.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements w9.c, x0.a, q4, y0, y30.b, z30.a, a30.c, c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f40820a;

    public f(int i11) {
        switch (i11) {
            case 1:
                this.f40820a = new ConcurrentHashMap();
                break;
            case 10:
                this.f40820a = new LinkedHashMap();
                break;
            case 12:
                r1 r1Var = y.c.f44524a;
                this.f40820a = (SmallDisplaySizeQuirk) y.c.a().b(SmallDisplaySizeQuirk.class);
                break;
            case 13:
                this.f40820a = new o3.e(new x[16], 0);
                break;
            default:
                this.f40820a = l.b(new tr.e(this));
                break;
        }
    }

    public static String l(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // a30.c
    public Object a() {
        return ((m) this.f40820a).f27469a;
    }

    @Override // x0.a
    public ListenableFuture apply(Object obj) {
        return g.c(((s.a) this.f40820a).mo962apply(obj));
    }

    @Override // y00.q4
    public void b(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        t2 t2Var = (t2) this.f40820a;
        if (zIsEmpty) {
            t2Var.t("auto", "_err", bundle);
        } else {
            t2Var.getClass();
            h2.b("Unexpected call on client side");
        }
    }

    @Override // y00.y0
    public /* synthetic */ void c(String str, int i11, Throwable th2, byte[] bArr, Map map) {
        ((l4) this.f40820a).B(str, i11, th2, bArr, map);
    }

    @Override // z30.a
    public void d(t tVar) {
        this.f40820a = tVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    public void e(ba.a aVar) {
        aVar.getClass();
        int i11 = aVar.f6074a;
        int i12 = aVar.f6075b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f40820a;
        Integer numValueOf = Integer.valueOf(i11);
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i12))) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i12)) + " with " + aVar);
        }
        treeMap2.put(Integer.valueOf(i12), aVar);
    }

    @Override // w9.c
    public void f() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // w9.c
    public void g(int i11, Object obj) {
        String str;
        switch (i11) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i11 == 6 || i11 == 7 || i11 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f40820a).setResultCode(i11);
    }

    @Override // bg.c0
    public void h(String str) {
        str.getClass();
        RecommendStoreFragment recommendStoreFragment = (RecommendStoreFragment) this.f40820a;
        recommendStoreFragment.u().f48069h = str;
        RecommendStoreFragment.t(recommendStoreFragment);
    }

    @Override // y30.b
    public void i(Bundle bundle, String str) {
        t tVar = (t) this.f40820a;
        if (tVar != null) {
            try {
                String str2 = "$A$:" + l(bundle, str);
                u uVar = tVar.f776a;
                uVar.f790o.f5742a.a(new s(uVar, System.currentTimeMillis() - uVar.f780d, str2, 0));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    public void j(CancellationException cancellationException) {
        o3.e eVar = (o3.e) this.f40820a;
        int i11 = eVar.f31832c;
        k[] kVarArr = new k[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            kVarArr[i12] = ((x) eVar.f31830a[i12]).f46760b;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            kVarArr[i13].j(cancellationException);
        }
        if (eVar.f31832c == 0) {
            return;
        }
        c2.a.c("uncancelled requests present");
    }

    public void k() {
        o3.e eVar = (o3.e) this.f40820a;
        IntRange intRangeJ = p.j(0, eVar.f31832c);
        int i11 = intRangeJ.f26553a;
        int i12 = intRangeJ.f26554b;
        if (i11 <= i12) {
            while (true) {
                v80.l lVar = ((x) eVar.f31830a[i11]).f46760b;
                Unit unit = Unit.f26487a;
                o oVar = q.f40850b;
                lVar.resumeWith(unit);
                if (i11 == i12) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        eVar.g();
    }

    public /* synthetic */ f(Object obj) {
        this.f40820a = obj;
    }
}
