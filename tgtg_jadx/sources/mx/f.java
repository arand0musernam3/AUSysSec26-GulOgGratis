package mx;

import android.os.Bundle;
import ax.a0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import tx.c0;
import tx.z;
import u70.l;
import u70.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f30246b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static HashSet f30248d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f30245a = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f30247c = l.b(e.f30244a);

    public static final void b(Bundle bundle) {
        if (yx.a.f46339a.contains(f.class)) {
            return;
        }
        try {
            if (f30246b && bundle != null && !bundle.isEmpty() && f30248d != null) {
                ArrayList<String> arrayList = new ArrayList();
                Set<String> setKeySet = bundle.keySet();
                setKeySet.getClass();
                for (String str : setKeySet) {
                    HashSet hashSet = f30248d;
                    hashSet.getClass();
                    if (!hashSet.contains(str)) {
                        str.getClass();
                        arrayList.add(str);
                    }
                }
                boolean z11 = false;
                for (String str2 : arrayList) {
                    if (bundle.containsKey(str2)) {
                        bundle.remove(str2);
                        z11 = true;
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cd", z11);
                bundle.putString("pm_metadata", jSONObject.toString());
                bundle.putString("pm", "1");
            }
        } catch (Throwable th2) {
            yx.a.a(f.class, th2);
        }
    }

    public final void a() {
        HashSet hashSet;
        Set set = yx.a.f46339a;
        if (set.contains(this)) {
            return;
        }
        try {
            z zVarK = c0.k(a0.b(), false);
            if (zVarK == null) {
                return;
            }
            JSONArray jSONArray = zVarK.f40596o;
            HashSet hashSet2 = null;
            if (set.contains(this) || jSONArray == null) {
                hashSet = null;
            } else {
                try {
                    if (jSONArray.length() != 0) {
                        hashSet = new HashSet();
                        int length = jSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            String string = jSONArray.getString(i11);
                            string.getClass();
                            hashSet.add(string);
                        }
                    }
                } catch (Throwable th2) {
                    yx.a.a(this, th2);
                }
                hashSet = null;
            }
            if (hashSet == null) {
                if (!yx.a.f46339a.contains(this)) {
                    try {
                        hashSet2 = (HashSet) f30247c.getValue();
                    } catch (Throwable th3) {
                        yx.a.a(this, th3);
                    }
                }
                hashSet = hashSet2;
            }
            f30248d = hashSet;
        } catch (Throwable th4) {
            yx.a.a(this, th4);
        }
    }

    public final boolean c(Bundle bundle) {
        if (yx.a.f46339a.contains(this) || bundle == null) {
            return false;
        }
        try {
            if (bundle.containsKey("pm")) {
                if (Intrinsics.areEqual(bundle.get("pm"), "1")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return false;
        }
    }
}
