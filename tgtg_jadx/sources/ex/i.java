package ex;

import a3.f1;
import a3.f2;
import a3.h2;
import a3.i0;
import a3.i1;
import a3.j2;
import a3.n0;
import a3.p0;
import a3.q0;
import a3.r0;
import a3.s0;
import a3.s2;
import a3.t0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.DashPathEffect;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import b2.l;
import b4.q;
import b4.t;
import bg.x0;
import c5.t1;
import c5.x1;
import cg.z;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.user.requests.DietaryPreferences;
import com.app.tgtg.model.remote.user.requests.UserGender;
import d2.m2;
import d2.p;
import d2.u;
import g3.d5;
import g3.ga;
import g3.r9;
import g3.x5;
import i4.g0;
import ib.w;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.net.ProtocolException;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.text.y;
import l8.r;
import lv.v;
import m2.b2;
import m3.b1;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import o30.e0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q90.f0;
import w.a0;
import w4.h0;
import xg.b0;
import z4.u0;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f16537a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f16538b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f16539c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f16540d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f16541e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f16542f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f16543g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f16544h = 0;

    public static boolean A(char c3) {
        return c3 >= 128 && c3 <= 255;
    }

    public static boolean B(char c3) {
        if (c3 == '\r' || c3 == '*' || c3 == '>' || c3 == ' ') {
            return true;
        }
        if (c3 < '0' || c3 > '9') {
            return c3 >= 'A' && c3 <= 'Z';
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0193, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a9, code lost:
    
        return 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b3, code lost:
    
        return 3;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int C(int r20, int r21, java.lang.CharSequence r22) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ex.i.C(int, int, java.lang.CharSequence):int");
    }

    public static a3.j D(String str) throws ProtocolException {
        f0 f0Var;
        int i11;
        String strSubstring;
        if (y.p(str, "HTTP/1.", false)) {
            i11 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                f0Var = f0.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                f0Var = f0.HTTP_1_1;
            }
        } else if (y.p(str, "ICY ", false)) {
            f0Var = f0.HTTP_1_0;
            i11 = 4;
        } else {
            if (!y.p(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            f0Var = f0.HTTP_1_1;
            i11 = 12;
        }
        int i12 = i11 + 3;
        if (str.length() < i12) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        Integer intOrNull = StringsKt.toIntOrNull(str.substring(i11, i12));
        if (intOrNull == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = intOrNull.intValue();
        if (str.length() <= i12) {
            strSubstring = "";
        } else {
            if (str.charAt(i12) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i11 + 4);
        }
        return new a3.j(f0Var, iIntValue, strSubstring);
    }

    public static final void E(float[] fArr, float[] fArr2, int i11, float[] fArr3) {
        if (i11 == 0) {
            y4.a.a("At least one point must be provided");
        }
        int i12 = 2 >= i11 ? i11 - 1 : 2;
        int i13 = i12 + 1;
        float[][] fArr4 = new float[i13][];
        for (int i14 = 0; i14 < i13; i14++) {
            fArr4[i14] = new float[i11];
        }
        for (int i15 = 0; i15 < i11; i15++) {
            fArr4[0][i15] = 1.0f;
            for (int i16 = 1; i16 < i13; i16++) {
                fArr4[i16][i15] = fArr4[i16 - 1][i15] * fArr[i15];
            }
        }
        float[][] fArr5 = new float[i13][];
        for (int i17 = 0; i17 < i13; i17++) {
            fArr5[i17] = new float[i11];
        }
        float[][] fArr6 = new float[i13][];
        for (int i18 = 0; i18 < i13; i18++) {
            fArr6[i18] = new float[i13];
        }
        int i19 = 0;
        while (i19 < i13) {
            float[] fArr7 = fArr5[i19];
            float[] fArr8 = fArr4[i19];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i11);
            for (int i21 = 0; i21 < i19; i21++) {
                float[] fArr9 = fArr5[i21];
                float fQ = q(fArr7, fArr9);
                for (int i22 = 0; i22 < i11; i22++) {
                    fArr7[i22] = fArr7[i22] - (fArr9[i22] * fQ);
                }
            }
            float fSqrt = (float) Math.sqrt(q(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f11 = 1.0f / fSqrt;
            for (int i23 = 0; i23 < i11; i23++) {
                fArr7[i23] = fArr7[i23] * f11;
            }
            float[] fArr10 = fArr6[i19];
            int i24 = 0;
            while (i24 < i13) {
                fArr10[i24] = i24 < i19 ? 0.0f : q(fArr7, fArr4[i24]);
                i24++;
            }
            i19++;
        }
        for (int i25 = i12; -1 < i25; i25--) {
            float fQ2 = q(fArr5[i25], fArr2);
            float[] fArr11 = fArr6[i25];
            int i26 = i25 + 1;
            if (i26 <= i12) {
                int i27 = i12;
                while (true) {
                    fQ2 -= fArr11[i27] * fArr3[i27];
                    if (i27 != i26) {
                        i27--;
                    }
                }
            }
            fArr3[i25] = fQ2 / fArr11[i25];
        }
    }

    public static TypedValue F(Context context, int i11) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i11, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean G(Context context, int i11, boolean z11) {
        TypedValue typedValueF = F(context, i11);
        return (typedValueF == null || typedValueF.type != 18) ? z11 : typedValueF.data != 0;
    }

    public static int H(Context context) {
        TypedValue typedValueF = F(context, R.attr.minTouchTargetSize);
        return (int) ((typedValueF == null || typedValueF.type != 5) ? context.getResources().getDimension(R.dimen.mtrl_min_touch_target_size) : typedValueF.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static TypedValue I(Context context, String str, int i11) {
        TypedValue typedValueF = F(context, i11);
        if (typedValueF != null) {
            return typedValueF;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i11)));
    }

    public static void J(Activity activity) {
        View viewU;
        int iHashCode = activity.hashCode();
        HashMap map = rx.e.f38258d;
        HashMap map2 = null;
        if (!yx.a.f46339a.contains(rx.e.class)) {
            try {
                map2 = rx.e.f38258d;
            } catch (Throwable th2) {
                yx.a.a(rx.e.class, th2);
            }
        }
        Integer numValueOf = Integer.valueOf(iHashCode);
        Object eVar = map2.get(numValueOf);
        if (eVar == null) {
            eVar = new rx.e(activity);
            map2.put(numValueOf, eVar);
        }
        rx.e eVar2 = (rx.e) eVar;
        Set set = yx.a.f46339a;
        if (set.contains(rx.e.class)) {
            return;
        }
        try {
        } catch (Throwable th3) {
            yx.a.a(rx.e.class, th3);
        }
        if (set.contains(eVar2)) {
            return;
        }
        try {
            if (!eVar2.f38261c.getAndSet(true) && (viewU = nx.d.u((Activity) eVar2.f38259a.get())) != null) {
                ViewTreeObserver viewTreeObserver = viewU.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalLayoutListener(eVar2);
                    eVar2.a();
                    return;
                }
                return;
                yx.a.a(rx.e.class, th3);
            }
        } catch (Throwable th4) {
            yx.a.a(eVar2, th4);
        }
    }

    public static void K(Activity activity) {
        View viewU;
        int iHashCode = activity.hashCode();
        HashMap map = rx.e.f38258d;
        HashMap map2 = null;
        if (!yx.a.f46339a.contains(rx.e.class)) {
            try {
                map2 = rx.e.f38258d;
            } catch (Throwable th2) {
                yx.a.a(rx.e.class, th2);
            }
        }
        rx.e eVar = (rx.e) map2.remove(Integer.valueOf(iHashCode));
        if (eVar != null) {
            Set set = yx.a.f46339a;
            if (set.contains(rx.e.class)) {
                return;
            }
            try {
                if (!set.contains(eVar)) {
                    try {
                        if (eVar.f38261c.getAndSet(false) && (viewU = nx.d.u((Activity) eVar.f38259a.get())) != null) {
                            ViewTreeObserver viewTreeObserver = viewU.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnGlobalLayoutListener(eVar);
                            }
                        }
                    } catch (Throwable th3) {
                        yx.a.a(eVar, th3);
                    }
                }
            } catch (Throwable th4) {
                yx.a.a(rx.e.class, th4);
            }
        }
    }

    public static byte[] L(ib.h hVar) {
        hVar.getClass();
        HashMap map = hVar.f23727a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    M(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } catch (IOException e5) {
            w.d().c(ib.i.f23739a, "Error in Data#toByteArray: ", e5);
            return new byte[0];
        }
    }

    public static final void M(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        int i11;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                j4.d.t(Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName(), "Unsupported value type ");
                return;
            }
            Object[] objArr = (Object[]) obj;
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(objArr.getClass());
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean[].class))) {
                i11 = 8;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte[].class))) {
                i11 = 9;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer[].class))) {
                i11 = 10;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long[].class))) {
                i11 = 11;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float[].class))) {
                i11 = 12;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double[].class))) {
                i11 = 13;
            } else {
                if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String[].class))) {
                    j4.d.t(Reflection.getOrCreateKotlinClass(objArr.getClass()).getQualifiedName(), "Unsupported value type ");
                    return;
                }
                i11 = 14;
            }
            dataOutputStream.writeByte(i11);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i11 == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i11 == 9) {
                    Byte b8 = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b8 != null ? b8.byteValue() : (byte) 0);
                } else if (i11 == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i11 == 11) {
                    Long l = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i11 == 12) {
                    Float f11 = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f11 != null ? f11.floatValue() : 0.0f);
                } else if (i11 == 13) {
                    Double d3 = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d3 != null ? d3.doubleValue() : 0.0d);
                } else if (i11 == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static final Object N(Object obj) {
        if (obj instanceof Map) {
            return O((Map) obj);
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(N(it.next()));
            }
            return jSONArray;
        }
        if (!(obj instanceof Object[])) {
            return obj;
        }
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = ArrayIteratorKt.iterator((Object[]) obj);
        while (it2.hasNext()) {
            jSONArray2.put(N(it2.next()));
        }
        return jSONArray2;
    }

    public static final JSONObject O(Map map) throws JSONException {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = key instanceof String ? (String) key : null;
            if (str != null) {
                jSONObject.put(str, N(entry.getValue()));
            }
        }
        return jSONObject;
    }

    public static final LinkedHashMap P(JSONObject jSONObject) {
        jSONObject.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.getClass();
            linkedHashMap.put(next, v(jSONObject.get(next)));
        }
        return linkedHashMap;
    }

    public static int Q(int i11) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i12 = 0; i12 < 6; i12++) {
            int i13 = iArr[i12];
            int i14 = i13 - 1;
            if (i13 == 0) {
                throw null;
            }
            if (i14 == i11) {
                return i13;
            }
        }
        return 1;
    }

    public static final void a(ir.h hVar, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, n nVar, int i11) {
        s sVar;
        function0.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        function14.getClass();
        function15.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(1264147124);
        int i12 = i11 | (sVar2.h(hVar) ? 4 : 2) | (sVar2.h(function0) ? 32 : 16) | (sVar2.h(function1) ? 256 : 128) | (sVar2.h(function12) ? NewHope.SENDB_BYTES : 1024) | (sVar2.h(function13) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar2.h(function14) ? 131072 : 65536) | (sVar2.h(function15) ? 1048576 : 524288);
        if (sVar2.R(i12 & 1, (599187 & i12) != 599186)) {
            d5 d5VarC = ga.c(sVar2);
            Throwable th2 = (Throwable) m3.i.n(hVar.f24129f, sVar2, 0).getValue();
            String str = (String) m3.i.n(hVar.f24131h, sVar2, 0).getValue();
            String str2 = (String) m3.i.n(hVar.f24133j, sVar2, 0).getValue();
            boolean zBooleanValue = ((Boolean) m3.i.n(hVar.l, sVar2, 0).getValue()).booleanValue();
            String str3 = (String) m3.i.n(hVar.f24136n, sVar2, 0).getValue();
            String str4 = (String) m3.i.n(hVar.f24138p, sVar2, 0).getValue();
            UserGender userGender = (UserGender) m3.i.n(hVar.f24140r, sVar2, 0).getValue();
            DietaryPreferences dietaryPreferences = (DietaryPreferences) m3.i.n(hVar.f24142t, sVar2, 0).getValue();
            String str5 = (String) m3.i.n(hVar.f24146x, sVar2, 0).getValue();
            List list = (List) m3.i.n(hVar.f24144v, sVar2, 0).getValue();
            androidx.lifecycle.w wVar = androidx.lifecycle.w.ON_RESUME;
            boolean zH = sVar2.h(hVar);
            Object objM = sVar2.M();
            if (zH || objM == m.f29332a) {
                objM = new b2(hVar, 19);
                sVar2.k0(objM);
            }
            w8.e.a(wVar, null, (Function0) objM, sVar2, 6);
            t tVarA = v4.f.a(m2.f13850c, d5VarC.f18456c, null);
            u3.d dVarE = u3.e.e(575235704, sVar2, new z(20, function0));
            oo.k kVar = new oo.k(th2, str, function13, str2, zBooleanValue, str3, str4, hVar, str5, function1, userGender, dietaryPreferences, function14, list, function15, function12);
            sVar = sVar2;
            x5.a(tVarA, dVarE, null, null, null, 0, 0L, 0L, null, u3.e.e(-1101107069, sVar, kVar), sVar, 805306416, 508);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new jh.a(hVar, function0, function1, function12, function13, function14, function15, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(kotlin.jvm.functions.Function0 r18, d6.a0 r19, u3.d r20, m3.n r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ex.i.b(kotlin.jvm.functions.Function0, d6.a0, u3.d, m3.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(int r34, java.lang.Integer r35, java.lang.String r36, i80.n r37, m3.n r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ex.i.c(int, java.lang.Integer, java.lang.String, i80.n, m3.n, int, int):void");
    }

    public static final void d(int i11, t tVar, List list, Function1 function1, n nVar) {
        list.getClass();
        function1.getClass();
        s sVar = (s) nVar;
        sVar.c0(-187670878);
        int i12 = (sVar.h(list) ? 4 : 2) | i11 | (sVar.h(function1) ? 32 : 16) | (sVar.f(tVar) ? 256 : 128);
        int i13 = 0;
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            float f11 = lv.t.f28257k;
            float f12 = lv.t.f28254h;
            t tVarD = d2.c.D(tVar, f12, 0.0f, f12, f11, 2);
            d2.b bVar = d2.i.f13801a;
            d2.y yVarA = d2.w.a(d2.i.g(lv.t.f28252f), b4.d.f5694m, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            sVar.a0(-635174331);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                al.h hVar2 = (al.h) it.next();
                boolean zD = ((i12 & 112) == 32) | sVar.d(hVar2.ordinal());
                Object objM = sVar.M();
                if (zD || objM == m.f29332a) {
                    objM = new bh.b(function1, hVar2, i13);
                    sVar.k0(objM);
                }
                a.a.k(hVar2, (Function0) objM, null, sVar, 0);
            }
            sVar.q(false);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new x0(list, function1, tVar, i11);
        }
    }

    public static final void e(t tVar, b0 b0Var, se.b bVar, n nVar, int i11) {
        t tVar2;
        b0Var.getClass();
        bVar.getClass();
        s sVar = (s) nVar;
        sVar.c0(1828872950);
        int i12 = i11 | (sVar.f(bVar) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 129) != 128)) {
            t tVarJ = v1.n.j(m2.f13850c, lv.s.f28245z, g0.f23254b);
            float f11 = lv.t.f28256j;
            t tVarD = d2.c.D(tVarJ, 0.0f, f11, 0.0f, 0.0f, 13);
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            b4.i iVar = b4.d.f5695n;
            q qVar = q.f5711a;
            t tVarD2 = m2.d(qVar, 1.0f);
            b4.k kVar = b4.d.f5684b;
            u uVar = u.f13938a;
            t tVarA = uVar.a(tVarD2, kVar);
            d2.y yVarA = d2.w.a(d2.i.f13803c, iVar, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarA, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            r9.d(o30.f0.U(sVar, R.string.landing_sign_in_header_uppercase), d2.c.D(qVar, 0.0f, f11, 0.0f, 0.0f, 13), lv.s.f28215a, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, m5.u0.a(v.f28264c, 0L, 0L, null, null, b0.a0.F((float) 0.02d, 8589934592L), null, 0, 0L, null, null, 16777087), sVar, 432, 0, 130040);
            sVar = sVar;
            n4.b bVarZ = o00.x0.z(2131231897, sVar, 0);
            t tVarD3 = d2.c.D(m2.d(qVar, 1.0f), 0.0f, e0.s(sVar, R.dimen.spacing_8), 0.0f, 0.0f, 13);
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = a0.g(sVar);
            }
            l lVar = (l) objM;
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objM2 = sVar.M();
            if (z11 || objM2 == fVar) {
                objM2 = new aa.e(bVar, 16);
                sVar.k0(objM2);
            }
            v1.n.d(bVarZ, null, androidx.compose.foundation.b.b(tVarD3, lVar, null, false, null, null, (Function0) objM2, 28), null, z4.l.f47169d, 0.0f, null, sVar, 24632, 104);
            sVar.q(true);
            v70.e eVarB = c0.b();
            eVarB.add(al.h.Google);
            eVarB.add(al.h.Facebook);
            eVarB.add(al.h.Email);
            eVarB.add(al.h.Other);
            v70.e eVarA = c0.a(eVarB);
            boolean z12 = i13 == 256;
            Object objM3 = sVar.M();
            if (z12 || objM3 == fVar) {
                objM3 = new a3.x0(bVar, 25);
                sVar.k0(objM3);
            }
            d(0, d2.c.D(uVar.a(qVar, b4.d.f5690h), 0.0f, 0.0f, 0.0f, lv.t.f28253g, 7), eVarA, (Function1) objM3, sVar);
            sVar.q(true);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bh.a(tVar2, b0Var, bVar, i11, 1);
        }
    }

    public static final void f(t tVar, i0 i0Var, Function1 function1, u3.d dVar, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(-917932944);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i13 = i12 | (sVar.f(i0Var) ? 32 : 16);
        if ((i11 & 3072) == 0) {
            i13 |= sVar.h(dVar) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i13 & 1, (i13 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = new a3.c0(1);
                sVar.k0(objM);
            }
            s2 s2Var = (s2) y3.j.d(objArr, s2.l, (Function0) objM, sVar, MLKEMEngine.KyberPolyBytes);
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new j2(s2Var);
                sVar.k0(objM2);
            }
            j2 j2Var = (j2) objM2;
            t1 t1Var = (t1) sVar.j(x1.f7414f);
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = m3.i.o(kotlin.coroutines.g.f26549a, sVar);
                sVar.k0(objM3);
            }
            v80.b0 b0Var = (v80.b0) objM3;
            j2Var.f406e = (r4.a) sVar.j(x1.l);
            boolean zF = sVar.f(b0Var) | sVar.f(t1Var);
            Object objM4 = sVar.M();
            if (zF || objM4 == fVar) {
                objM4 = new a3.p(1, b0Var, t1Var);
                sVar.k0(objM4);
            }
            j2Var.f407f = (Function1) objM4;
            j2Var.f405d = new a3.p(2, j2Var, function1);
            j2Var.l(i0Var);
            sVar.a0(-82280708);
            j2Var.f423w = a3.e0.b(a3.g0.StaticText, null, sVar, 54);
            j2Var.f422v = b0Var;
            sVar.q(false);
            j2Var.h();
            n0 n0Var = new n0(j2Var, 3);
            Unit unit = Unit.f26487a;
            h2 h2Var = new h2(0, j2Var, n0Var);
            t tVarA = q.f5711a;
            t tVarD = u4.c.d(h0.a(v1.n.n(g4.d.i(g4.d.d(z4.c0.o(h0.a(tVarA, unit, h2Var), new s0(j2Var, 4)), j2Var.f409h), new s0(j2Var, 5)), true, null), 8675309, new i1(new s0(j2Var, 6), 0)), new f2(j2Var, 0));
            if (j2Var.e() != null && j2Var.g()) {
                i0 i0VarF = j2Var.f();
                if (!(i0VarF != null ? Intrinsics.areEqual(i0VarF.f385a, i0VarF.f386b) : true) && v1.i1.a()) {
                    tVarA = b4.a.a(tVarA, c5.m2.f7291a, new a3.m2(j2Var, 0));
                }
            }
            jf.e.m(tVar.then(s2.h.a(tVarD.then(tVarA), new f1(j2Var, 1))), u3.e.e(-1799563674, sVar, new r0(j2Var, s2Var, dVar)), sVar, 48);
            boolean zH = sVar.h(j2Var);
            Object objM5 = sVar.M();
            if (zH || objM5 == fVar) {
                objM5 = new s0(j2Var, 0);
                sVar.k0(objM5);
            }
            m3.i.d(j2Var, (Function1) objM5, sVar);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new t0(tVar, i0Var, i11, function1, dVar, 0);
        }
    }

    public static final void g(t tVar, u3.d dVar, n nVar, int i11, int i12) {
        int i13;
        u3.d dVar2;
        s sVar = (s) nVar;
        sVar.c0(1949207773);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else {
            i13 = (sVar.f(tVar) ? 4 : 2) | i11;
        }
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            if (i14 != 0) {
                tVar = q.f5711a;
            }
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(null);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            i0 i0Var = (i0) b1Var.getValue();
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new p0(b1Var, 0);
                sVar.k0(objM2);
            }
            dVar2 = dVar;
            f(tVar, i0Var, (Function1) objM2, dVar2, sVar, (i13 & 14) | 3456);
        } else {
            dVar2 = dVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new q0(tVar, dVar2, i11, i12);
        }
    }

    public static final void h(t tVar, long j9, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(41818284);
        int i12 = 0;
        if (sVar.R(i11 & 1, (i11 & 19) != 18)) {
            i4.i iVar = new i4.i(new DashPathEffect(new float[]{13.0f, 13.0f}, 0.0f));
            boolean zH = sVar.h(iVar);
            Object objM = sVar.M();
            if (zH || objM == m.f29332a) {
                objM = new fg.p(i12, j9, iVar);
                sVar.k0(objM);
            }
            v1.n.c(tVar, (Function1) objM, sVar, 6);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new fg.q(tVar, j9, i11);
        }
    }

    public static final void i(t tVar, Function2 function2, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(1090521195);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function2) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            Object objM = sVar.M();
            if (objM == m.f29332a) {
                objM = d6.g.f14464a;
                sVar.k0(objM);
            }
            u0 u0Var = (u0) objM;
            int i13 = ((i12 << 3) & 112) | ((i12 >> 3) & 14) | MLKEMEngine.KyberPolyBytes;
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            int i14 = ((i13 << 6) & 896) | 6;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0Var, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            a0.w((i14 >> 6) & 14, function2, sVar, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new d6.h(tVar, function2, i11);
        }
    }

    public static final void j(x0.e eVar, w4.v vVar, long j9) {
        x4.b bVar = (x4.b) eVar.f43625b;
        bVar.getClass();
        x4.e eVar2 = bVar.f43825b;
        x4.e eVar3 = bVar.f43824a;
        boolean zB = w4.u.b(vVar);
        long j11 = vVar.f43179b;
        if (zB) {
            x4.a[] aVarArr = eVar3.f43830d;
            x.m(aVarArr, 0, aVarArr.length, null);
            eVar3.f43831e = 0;
            x4.a[] aVarArr2 = eVar2.f43830d;
            x.m(aVarArr2, 0, aVarArr2.length, null);
            eVar2.f43831e = 0;
            bVar.f43826c = 0L;
        }
        if (!w4.u.d(vVar)) {
            List list = vVar.f43188k;
            if (list == null) {
                list = kotlin.collections.n0.f26529a;
            }
            int i11 = 0;
            for (int size = list.size(); i11 < size; size = size) {
                w4.b bVar2 = (w4.b) list.get(i11);
                bVar.a(bVar2.f43099a, h4.b.f(bVar2.f43101c, j9));
                i11++;
            }
            bVar.a(j11, h4.b.f(vVar.l, j9));
        }
        if (w4.u.d(vVar) && j11 - bVar.f43826c > 40) {
            x4.a[] aVarArr3 = eVar3.f43830d;
            x.m(aVarArr3, 0, aVarArr3.length, null);
            eVar3.f43831e = 0;
            x4.a[] aVarArr4 = eVar2.f43830d;
            x.m(aVarArr4, 0, aVarArr4.length, null);
            eVar2.f43831e = 0;
            bVar.f43826c = 0L;
        }
        bVar.f43826c = j11;
    }

    public static ox.e k(JSONObject jSONObject) {
        float[] fArr;
        float[] fArr2;
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("use_case");
            String string2 = jSONObject.getString("asset_uri");
            String strOptString = jSONObject.optString("rules_uri", null);
            int i11 = jSONObject.getInt("version_id");
            ox.g gVar = ox.g.f33790a;
            JSONArray jSONArray = jSONObject.getJSONArray("thresholds");
            Set set = yx.a.f46339a;
            if (set.contains(ox.g.class)) {
                fArr2 = null;
            } else {
                try {
                    if (set.contains(gVar) || jSONArray == null) {
                        fArr = null;
                        fArr2 = fArr;
                    } else {
                        try {
                            fArr = new float[jSONArray.length()];
                            int length = jSONArray.length();
                            for (int i12 = 0; i12 < length; i12++) {
                                try {
                                    String string3 = jSONArray.getString(i12);
                                    string3.getClass();
                                    fArr[i12] = Float.parseFloat(string3);
                                } catch (JSONException unused) {
                                }
                            }
                        } catch (Throwable th2) {
                            yx.a.a(gVar, th2);
                            fArr = null;
                        }
                        fArr2 = fArr;
                    }
                } catch (Throwable th3) {
                    yx.a.a(ox.g.class, th3);
                    fArr2 = null;
                }
            }
            string.getClass();
            string2.getClass();
            return new ox.e(string, string2, strOptString, i11, fArr2);
        } catch (Exception unused2) {
            return null;
        }
    }

    public static void l(Object obj, Object obj2) {
        if (obj == null) {
            c50.w.l(j4.s.j(obj2, "null key in entry: null="));
        } else {
            if (obj2 != null) {
                return;
            }
            c50.w.l(org.bouncycastle.jcajce.provider.asymmetric.a.c(obj, "null value in entry: ", "=null"));
        }
    }

    public static void m(int i11, String str) {
        if (i11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i11);
    }

    public static l8.s n(Context context) {
        ProviderInfo providerInfo;
        e7.d dVar;
        ApplicationInfo applicationInfo;
        l20.c cVar = Build.VERSION.SDK_INT >= 28 ? new l8.c(1) : new l20.c(1);
        PackageManager packageManager = context.getPackageManager();
        pd.g.m(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            dVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrR = cVar.r(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrR) {
                    arrayList.add(signature.toByteArray());
                }
                dVar = new e7.d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e5) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e5);
                dVar = null;
            }
        }
        if (dVar == null) {
            return null;
        }
        return new l8.s(new r(context, dVar));
    }

    public static final LinkedHashMap o(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put((String) entry.getKey(), p(entry.getValue()));
        }
        return linkedHashMap2;
    }

    public static final Object p(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), p(entry.getValue()));
            }
            return linkedHashMap;
        }
        if (!(obj instanceof Collection)) {
            return obj;
        }
        ArrayList arrayList = new ArrayList(((Collection) obj).size());
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(p(it.next()));
        }
        return arrayList;
    }

    public static final float q(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < length; i11++) {
            f11 += fArr[i11] * fArr2[i11];
        }
        return f11;
    }

    public static void r(ox.e eVar, ArrayList arrayList) {
        File[] fileArrListFiles;
        String str = eVar.f33782a;
        int i11 = eVar.f33785d;
        File fileA = ox.i.a();
        if (fileA != null && (fileArrListFiles = fileA.listFiles()) != null && fileArrListFiles.length != 0) {
            String str2 = str + '_' + i11;
            for (File file : fileArrListFiles) {
                String name = file.getName();
                name.getClass();
                if (y.p(name, str, false) && !y.p(name, str2, false)) {
                    file.delete();
                }
            }
        }
        String str3 = str + '_' + i11;
        String str4 = eVar.f33783b;
        mp.a aVar = new mp.a(arrayList, 4);
        File file2 = new File(ox.i.a(), str3);
        if (str4 == null || file2.exists()) {
            aVar.b(file2);
        } else {
            new nx.l(str4, file2, aVar).execute(new String[0]);
        }
    }

    public static int s(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < 6; i12++) {
            int iCeil = (int) Math.ceil(fArr[i12]);
            iArr[i12] = iCeil;
            if (i11 > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i11 = iCeil;
            }
            if (i11 == iCeil) {
                bArr[i12] = (byte) (bArr[i12] + 1);
            }
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ib.h t(byte[] r7) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ex.i.t(byte[]):ib.h");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable u(DataInputStream dataInputStream, byte b8) throws IOException {
        if (b8 == 0) {
            return null;
        }
        if (b8 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b8 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b8 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b8 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b8 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b8 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b8 == 7) {
            return dataInputStream.readUTF();
        }
        int i11 = 0;
        if (b8 == 8) {
            int i12 = dataInputStream.readInt();
            ?? r02 = new Boolean[i12];
            while (i11 < i12) {
                r02[i11] = Boolean.valueOf(dataInputStream.readBoolean());
                i11++;
            }
            return r02;
        }
        if (b8 == 9) {
            int i13 = dataInputStream.readInt();
            ?? r03 = new Byte[i13];
            while (i11 < i13) {
                r03[i11] = Byte.valueOf(dataInputStream.readByte());
                i11++;
            }
            return r03;
        }
        if (b8 == 10) {
            int i14 = dataInputStream.readInt();
            ?? r04 = new Integer[i14];
            while (i11 < i14) {
                r04[i11] = Integer.valueOf(dataInputStream.readInt());
                i11++;
            }
            return r04;
        }
        if (b8 == 11) {
            int i15 = dataInputStream.readInt();
            ?? r05 = new Long[i15];
            while (i11 < i15) {
                r05[i11] = Long.valueOf(dataInputStream.readLong());
                i11++;
            }
            return r05;
        }
        if (b8 == 12) {
            int i16 = dataInputStream.readInt();
            ?? r06 = new Float[i16];
            while (i11 < i16) {
                r06[i11] = Float.valueOf(dataInputStream.readFloat());
                i11++;
            }
            return r06;
        }
        if (b8 == 13) {
            int i17 = dataInputStream.readInt();
            ?? r07 = new Double[i17];
            while (i11 < i17) {
                r07[i11] = Double.valueOf(dataInputStream.readDouble());
                i11++;
            }
            return r07;
        }
        if (b8 != 14) {
            com.braze.h2.b(j4.s.f(b8, "Unsupported type "));
            return null;
        }
        int i18 = dataInputStream.readInt();
        ?? r12 = new String[i18];
        while (i11 < i18) {
            String utf = dataInputStream.readUTF();
            if (Intrinsics.areEqual(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                utf = null;
            }
            r12[i11] = utf;
            i11++;
        }
        return r12;
    }

    public static final Object v(Object obj) {
        if (obj instanceof JSONObject) {
            return P((JSONObject) obj);
        }
        if (!(obj instanceof JSONArray)) {
            if (obj instanceof BigDecimal) {
                return Double.valueOf(((BigDecimal) obj).doubleValue());
            }
            if (Intrinsics.areEqual(obj, JSONObject.NULL)) {
                return null;
            }
            return obj;
        }
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            arrayList.add(v(jSONArray.get(i11)));
        }
        return arrayList;
    }

    public static String w(File file) {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith(ExpiryDateInput.SEPARATOR) ? canonicalPath.concat(ExpiryDateInput.SEPARATOR) : canonicalPath;
    }

    public static String x(String str) {
        String str2 = null;
        if (str != null) {
            String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
            if (strGuessContentTypeFromName == null) {
                int iLastIndexOf = str.lastIndexOf(46);
                if (iLastIndexOf != -1) {
                    String lowerCase = str.substring(iLastIndexOf + 1).toLowerCase();
                    lowerCase.getClass();
                    switch (lowerCase) {
                        case "gz":
                        case "tgz":
                            str2 = "application/gzip";
                            break;
                        case "js":
                        case "mjs":
                            str2 = "text/javascript";
                            break;
                        case "bmp":
                            str2 = "image/bmp";
                            break;
                        case "css":
                            str2 = "text/css";
                            break;
                        case "gif":
                            str2 = "image/gif";
                            break;
                        case "htm":
                        case "html":
                        case "shtm":
                        case "ehtml":
                        case "shtml":
                            str2 = ArticleContentView.TYPE_TEXT_HTML;
                            break;
                        case "ico":
                            str2 = "image/x-icon";
                            break;
                        case "jpg":
                        case "pjp":
                        case "jfif":
                        case "jpeg":
                        case "pjpeg":
                            str2 = "image/jpeg";
                            break;
                        case "m4a":
                            str2 = "audio/x-m4a";
                            break;
                        case "m4v":
                        case "mp4":
                            str2 = "video/mp4";
                            break;
                        case "mht":
                        case "mhtml":
                            str2 = "multipart/related";
                            break;
                        case "mp3":
                            str2 = "audio/mpeg";
                            break;
                        case "mpg":
                        case "mpeg":
                            str2 = "video/mpeg";
                            break;
                        case "oga":
                        case "ogg":
                        case "opus":
                            str2 = "audio/ogg";
                            break;
                        case "ogm":
                        case "ogv":
                            str2 = "video/ogg";
                            break;
                        case "pdf":
                            str2 = "application/pdf";
                            break;
                        case "png":
                            str2 = "image/png";
                            break;
                        case "svg":
                        case "svgz":
                            str2 = "image/svg+xml";
                            break;
                        case "tif":
                        case "tiff":
                            str2 = "image/tiff";
                            break;
                        case "wav":
                            str2 = "audio/wav";
                            break;
                        case "xht":
                        case "xhtm":
                        case "xhtml":
                            str2 = "application/xhtml+xml";
                            break;
                        case "xml":
                            str2 = "text/xml";
                            break;
                        case "zip":
                            str2 = "application/zip";
                            break;
                        case "apng":
                            str2 = "image/apng";
                            break;
                        case "flac":
                            str2 = "audio/flac";
                            break;
                        case "json":
                            str2 = "application/json";
                            break;
                        case "wasm":
                            str2 = "application/wasm";
                            break;
                        case "webm":
                            str2 = "video/webm";
                            break;
                        case "webp":
                            str2 = "image/webp";
                            break;
                        case "woff":
                            str2 = "application/font-woff";
                            break;
                    }
                }
            } else {
                str2 = strGuessContentTypeFromName;
            }
        }
        return str2 == null ? "text/plain" : str2;
    }

    public static void y(char c3) {
        String hexString = Integer.toHexString(c3);
        throw new IllegalArgumentException("Illegal character: " + c3 + " (0x" + "0000".substring(0, 4 - hexString.length()).concat(hexString) + ')');
    }

    public static boolean z(char c3) {
        return c3 >= '0' && c3 <= '9';
    }
}
