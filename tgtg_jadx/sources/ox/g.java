package ox;

import android.os.Bundle;
import android.text.TextUtils;
import ax.h0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.s0;
import kotlin.ranges.IntRange;
import n80.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.faye.internal.Bayeux;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f33790a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f33791b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f33792c = d0.h("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f33793d = d0.h("none", "address", "health");

    public static final File d(d dVar) {
        if (!yx.a.f46339a.contains(g.class)) {
            try {
                dVar.getClass();
                e eVar = (e) f33791b.get(dVar.c());
                if (eVar != null) {
                    return eVar.f33787f;
                }
            } catch (Throwable th2) {
                yx.a.a(g.class, th2);
                return null;
            }
        }
        return null;
    }

    public static final String[] f(d dVar, float[][] fArr, String[] strArr) {
        b bVar;
        if (!yx.a.f46339a.contains(g.class)) {
            try {
                dVar.getClass();
                e eVar = (e) f33791b.get(dVar.c());
                if (eVar != null && (bVar = eVar.f33788g) != null) {
                    float[] fArr2 = eVar.f33786e;
                    int length = strArr.length;
                    int length2 = fArr[0].length;
                    a aVar = new a(new int[]{length, length2});
                    for (int i11 = 0; i11 < length; i11++) {
                        System.arraycopy(fArr[i11], 0, aVar.f33769c, i11 * length2, length2);
                    }
                    a aVarA = bVar.a(aVar, strArr, dVar.a());
                    if (aVarA != null && fArr2 != null && aVarA.f33769c.length != 0 && fArr2.length != 0) {
                        int i12 = f.$EnumSwitchMapping$0[dVar.ordinal()];
                        g gVar = f33790a;
                        if (i12 == 1) {
                            return gVar.h(aVarA, fArr2);
                        }
                        if (i12 == 2) {
                            return gVar.g(aVarA, fArr2);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } catch (Throwable th2) {
                yx.a.a(g.class, th2);
                return null;
            }
        }
        return null;
    }

    public final void a(JSONObject jSONObject) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                try {
                    e eVarK = ex.i.k(jSONObject.getJSONObject(itKeys.next()));
                    if (eVarK != null) {
                        f33791b.put(eVarK.f33782a, eVarK);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[Catch: all -> 0x008f, TryCatch #2 {all -> 0x008f, blocks: (B:5:0x000a, B:6:0x001d, B:8:0x0023, B:10:0x0042, B:12:0x0052, B:24:0x0082, B:23:0x007e, B:27:0x0091, B:29:0x009d, B:31:0x00ad, B:34:0x00bf, B:36:0x00c5, B:15:0x005b, B:19:0x006d), top: B:42:0x000a, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox.g.b():void");
    }

    public final JSONObject c() {
        if (!yx.a.f46339a.contains(this)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("fields", TextUtils.join(MessageLogView.COMMA_SEPARATOR, new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
                String str = h0.f4915j;
                h0 h0VarY = qb.e.y(null, "app/model_asset", null);
                h0VarY.f4920d = bundle;
                JSONObject jSONObject = h0VarY.c().f4942b;
                if (jSONObject != null) {
                    return e(jSONObject);
                }
            } catch (Throwable th2) {
                yx.a.a(this, th2);
                return null;
            }
        }
        return null;
    }

    public final JSONObject e(JSONObject jSONObject) {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray(Bayeux.KEY_DATA);
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i11);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    public final String[] g(a aVar, float[] fArr) {
        if (!yx.a.f46339a.contains(this)) {
            try {
                int[] iArr = aVar.f33767a;
                int i11 = iArr[0];
                int i12 = iArr[1];
                float[] fArr2 = aVar.f33769c;
                if (i12 == fArr.length) {
                    IntRange intRangeJ = p.j(0, i11);
                    ArrayList arrayList = new ArrayList(e0.o(intRangeJ, 10));
                    Iterator it = intRangeJ.iterator();
                    while (((n80.h) it).f30715c) {
                        int iNextInt = ((s0) it).nextInt();
                        Object obj = "none";
                        int length = fArr.length;
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < length) {
                            int i15 = i14 + 1;
                            if (fArr2[(iNextInt * i12) + i14] >= fArr[i13]) {
                                obj = f33793d.get(i14);
                            }
                            i13++;
                            i14 = i15;
                        }
                        arrayList.add((String) obj);
                    }
                    return (String[]) arrayList.toArray(new String[0]);
                }
            } catch (Throwable th2) {
                yx.a.a(this, th2);
                return null;
            }
        }
        return null;
    }

    public final String[] h(a aVar, float[] fArr) {
        if (!yx.a.f46339a.contains(this)) {
            try {
                int[] iArr = aVar.f33767a;
                int i11 = iArr[0];
                int i12 = iArr[1];
                float[] fArr2 = aVar.f33769c;
                if (i12 == fArr.length) {
                    IntRange intRangeJ = p.j(0, i11);
                    ArrayList arrayList = new ArrayList(e0.o(intRangeJ, 10));
                    Iterator it = intRangeJ.iterator();
                    while (((n80.h) it).f30715c) {
                        int iNextInt = ((s0) it).nextInt();
                        Object obj = "other";
                        int length = fArr.length;
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < length) {
                            int i15 = i14 + 1;
                            if (fArr2[(iNextInt * i12) + i14] >= fArr[i13]) {
                                obj = f33792c.get(i14);
                            }
                            i13++;
                            i14 = i15;
                        }
                        arrayList.add((String) obj);
                    }
                    return (String[]) arrayList.toArray(new String[0]);
                }
            } catch (Throwable th2) {
                yx.a.a(this, th2);
                return null;
            }
        }
        return null;
    }
}
