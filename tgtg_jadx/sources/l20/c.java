package l20;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CaptureResult;
import android.view.View;
import com.braze.h2;
import com.google.android.gms.internal.measurement.l3;
import com.google.android.gms.tasks.Task;
import com.google.android.material.tabs.TabLayout;
import e20.i0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.n0;
import kotlin.collections.x0;
import m0.i1;
import m0.m1;
import org.json.JSONArray;
import org.json.JSONObject;
import qz.r;
import s0.g0;
import s0.k2;
import s0.s;
import s0.u;
import s0.x;
import s0.y;
import y00.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class c implements d10.b, y8.b, m7.e, r, y, t50.b, s.a, n50.d, y00.f, w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c f26793b = new c(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c f26794c = new c(28);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c f26795d = new c(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26796a;

    public /* synthetic */ c(int i11) {
        this.f26796a = i11;
    }

    public static RectF m(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.F || !(view instanceof s20.j)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        s20.j jVar = (s20.j) view;
        int contentWidth = jVar.getContentWidth();
        int contentHeight = jVar.getContentHeight();
        int iG = (int) i0.g(jVar.getContext(), 24);
        if (contentWidth < iG) {
            contentWidth = iG;
        }
        int right = (jVar.getRight() + jVar.getLeft()) / 2;
        int bottom = (jVar.getBottom() + jVar.getTop()) / 2;
        int i11 = contentWidth / 2;
        return new RectF(right - i11, bottom - (contentHeight / 2), i11 + right, (right / 2) + bottom);
    }

    public static String n(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0) {
            h2.b("StringBuilder must not be empty");
            return null;
        }
        int iCharAt = (sb2.charAt(0) << 18) + ((length >= 2 ? sb2.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? sb2.charAt(2) : (char) 0) << 6) + (length >= 4 ? sb2.charAt(3) : (char) 0);
        char c3 = (char) ((iCharAt >> 16) & 255);
        char c7 = (char) ((iCharAt >> 8) & 255);
        char c8 = (char) (iCharAt & 255);
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append(c3);
        if (length >= 2) {
            sb3.append(c7);
        }
        if (length >= 3) {
            sb3.append(c8);
        }
        return sb3.toString();
    }

    public static rc.g o(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new rc.g(httpURLConnection, 1);
    }

    public static tx.n q() {
        return new tx.n(null, x0.d(new Pair(2, null), new Pair(4, null), new Pair(9, null), new Pair(17, null), new Pair(341, null)), x0.d(new Pair(102, null), new Pair(190, null), new Pair(412, null)), null, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean s(n8.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l20.c.s(n8.b, android.text.Editable, int, int, boolean):boolean");
    }

    public static HashMap u(JSONObject jSONObject) {
        int iOptInt;
        HashSet hashSet;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            return null;
        }
        HashMap map = new HashMap();
        int length = jSONArrayOptJSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
            if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("code")) != 0) {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("subcodes");
                if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet();
                    int length2 = jSONArrayOptJSONArray2.length();
                    for (int i12 = 0; i12 < length2; i12++) {
                        int iOptInt2 = jSONArrayOptJSONArray2.optInt(i12);
                        if (iOptInt2 != 0) {
                            hashSet.add(Integer.valueOf(iOptInt2));
                        }
                    }
                }
                map.put(Integer.valueOf(iOptInt), hashSet);
            }
        }
        return map;
    }

    public static o0.c v(df.g gVar, g0 g0Var) {
        q0.f fVarS;
        m1.a aVar = new m1.a(g0Var);
        Set set = (Set) gVar.f14897e;
        wd.a.p("ResolvedFeatureGroup", "resolveFeatureGroup: sessionConfig = " + gVar + ", lensFacing = " + g0Var.k());
        List list = (List) gVar.f14898f;
        if (set.isEmpty() && list.isEmpty()) {
            return null;
        }
        List list2 = (List) gVar.f14899g;
        if (set.isEmpty() && list.isEmpty()) {
            i4.a.f("Must have at least one required or preferred feature");
            return null;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                m1 m1Var = (m1) it.next();
                o0.g.Companion.getClass();
                if (o0.e.a(m1Var) == o0.g.UNDEFINED) {
                    fVarS = new q0.d(m1Var);
                    break;
                }
            } else {
                Iterator it2 = set.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        q0.e eVarT = m1.a.t((n0.b) it2.next(), list2);
                        if (eVarT != null) {
                            fVarS = eVarT;
                            break;
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            q0.e eVarT2 = m1.a.t((n0.b) obj, list2);
                            if (eVarT2 != null) {
                                wd.a.p("DefaultFeatureGroupResolver", "resolveFeatureGroup: filtered out preferred feature due to " + eVarT2);
                            } else {
                                eVarT2 = null;
                            }
                            if (eVarT2 == null) {
                                arrayList.add(obj);
                            }
                        }
                        wd.a.p("DefaultFeatureGroupResolver", "resolveFeatureGroup: filteredPreferredFeatures = " + arrayList);
                        fVarS = aVar.s(gVar, arrayList, 0, n0.f26529a);
                    }
                }
            }
        }
        if (fVarS instanceof q0.b) {
            o0.c cVar = ((q0.b) fVarS).f35700a;
            wd.a.p("ResolvedFeatureGroup", "resolvedFeatureGroup = " + cVar);
            return cVar;
        }
        if (fVarS instanceof q0.c) {
            i4.a.f("Feature group is not supported");
            return null;
        }
        if (fVarS instanceof q0.d) {
            i1.g(((q0.d) fVarS).f35702a, " is not supported");
            return null;
        }
        if (!(fVarS instanceof q0.e)) {
            e40.a.f();
            return null;
        }
        q0.e eVar = (q0.e) fVarS;
        throw new IllegalArgumentException(eVar.f35703a + " must be added for " + eVar.f35704b);
    }

    @Override // y00.w
    public Object a() {
        return new Boolean(((Boolean) l3.f11588a.get()).booleanValue());
    }

    @Override // s0.y
    public k2 b() {
        return k2.f38372b;
    }

    @Override // s0.y
    public x c() {
        return x.UNKNOWN;
    }

    @Override // y00.f
    public /* synthetic */ String e(String str, String str2) {
        return null;
    }

    @Override // s0.y
    public s0.w f() {
        return s0.w.UNKNOWN;
    }

    @Override // d10.b
    public /* synthetic */ Object g(Task task) {
        return null;
    }

    @Override // s0.y
    public long getTimestamp() {
        return -1L;
    }

    @Override // s0.y
    public s h() {
        return s.UNKNOWN;
    }

    @Override // s0.y
    public CaptureResult i() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        ex.i.y(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    @Override // t50.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(t50.c r12) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l20.c.j(t50.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:321:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x00aa A[SYNTHETIC] */
    @Override // n50.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q50.b k(java.lang.String r27, n50.a r28, java.util.EnumMap r29) throws com.google.zxing.WriterException {
        /*
            Method dump skipped, instruction units count: 1960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l20.c.k(java.lang.String, n50.a, java.util.EnumMap):q50.b");
    }

    @Override // s0.y
    public u l() {
        return u.UNKNOWN;
    }

    public synchronized tx.n p() {
        tx.n nVar;
        try {
            if (tx.n.f40531e == null) {
                tx.n.f40531e = q();
            }
            nVar = tx.n.f40531e;
            nVar.getClass();
        } catch (Throwable th2) {
            throw th2;
        }
        return nVar;
    }

    public Signature[] r(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean t(CharSequence charSequence) {
        return false;
    }

    public void w(TabLayout tabLayout, View view, View view2, float f11, Drawable drawable) {
        RectF rectFM = m(tabLayout, view);
        RectF rectFM2 = m(tabLayout, view2);
        drawable.setBounds(k10.a.c((int) rectFM.left, f11, (int) rectFM2.left), drawable.getBounds().top, k10.a.c((int) rectFM.right, f11, (int) rectFM2.right), drawable.getBounds().bottom);
    }

    @Override // s.a
    /* JADX INFO: renamed from: apply */
    public Object mo962apply(Object obj) {
        return obj;
    }
}
