package bx;

import android.content.Context;
import android.os.Bundle;
import ax.h0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tx.c f6754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f6756c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f6757d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6758e;

    public x(tx.c cVar, String str) {
        this.f6754a = cVar;
        this.f6755b = str;
    }

    public final synchronized void a(g gVar) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            gVar.getClass();
            if (this.f6756c.size() + this.f6757d.size() >= 1000) {
                this.f6758e++;
            } else {
                this.f6756c.add(gVar);
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final synchronized void b(boolean z11) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        if (!z11) {
            this.f6757d.clear();
            this.f6758e = 0;
            return;
        }
        try {
            this.f6756c.addAll(this.f6757d);
            this.f6757d.clear();
            this.f6758e = 0;
            return;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return;
        }
    }

    public final synchronized List c() {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = this.f6756c;
            this.f6756c = new ArrayList();
            return arrayList;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    public final int d(h0 h0Var, Context context, boolean z11, boolean z12) {
        Throwable th2;
        Throwable th3;
        if (yx.a.f46339a.contains(this)) {
            return 0;
        }
        try {
            context.getClass();
            try {
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        synchronized (this) {
            try {
                int i11 = this.f6758e;
                gx.b.b(this.f6756c);
                this.f6757d.addAll(this.f6756c);
                this.f6756c.clear();
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                for (g gVar : this.f6757d) {
                    try {
                        if (z11 || !gVar.f6720c) {
                            jSONArray.put(gVar.f6718a);
                            jSONArray2.put(gVar.f6719b);
                        }
                    } catch (Throwable th6) {
                        th3 = th6;
                        throw th3;
                    }
                }
                if (jSONArray.length() != 0) {
                    e(h0Var, context, i11, jSONArray, jSONArray2, z12);
                    return jSONArray.length();
                }
                try {
                    return 0;
                } catch (Throwable th7) {
                    th2 = th7;
                }
            } catch (Throwable th8) {
                th3 = th8;
            }
            th2 = th;
            yx.a.a(this, th2);
            return 0;
        }
    }

    public final void e(h0 h0Var, Context context, int i11, JSONArray jSONArray, JSONArray jSONArray2, boolean z11) {
        JSONObject jSONObject;
        try {
            if (yx.a.f46339a.contains(this)) {
                return;
            }
            try {
                jSONObject = nx.f.a(nx.e.CUSTOM_APP_EVENTS, this.f6754a, this.f6755b, z11, context);
                if (this.f6758e > 0) {
                    jSONObject.put("num_skipped_events", i11);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            h0Var.f4919c = jSONObject;
            Bundle bundle = h0Var.f4920d;
            String string = jSONArray.toString();
            string.getClass();
            bundle.putString("custom_events", string);
            if (tx.w.b(tx.t.IapLoggingLib5To7)) {
                bundle.putString("operational_parameters", jSONArray2.toString());
            }
            h0Var.f4921e = string;
            h0Var.f4920d = bundle;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
