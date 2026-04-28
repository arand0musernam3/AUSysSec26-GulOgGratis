package he;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import q1.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f21928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f21929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f21930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f21931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f21932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l1 f21933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q1.z f21934i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f21935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f21936k;
    public float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f21937m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f21938n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21939o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f21926a = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f21927b = new HashSet();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21940p = 0;

    public final void a(String str) {
        ve.c.b(str);
        this.f21927b.add(str);
    }

    public final float b() {
        return (long) (((this.f21937m - this.l) / this.f21938n) * 1000.0f);
    }

    public final Map c() {
        float fC = ve.k.c();
        if (fC != this.f21930e) {
            for (Map.Entry entry : this.f21929d.entrySet()) {
                HashMap map = this.f21929d;
                String str = (String) entry.getKey();
                b0 b0Var = (b0) entry.getValue();
                float f11 = this.f21930e / fC;
                int i11 = (int) (b0Var.f21866a * f11);
                int i12 = (int) (b0Var.f21867b * f11);
                b0 b0Var2 = new b0(i11, i12, b0Var.f21868c, b0Var.f21869d, b0Var.f21870e);
                Bitmap bitmap = b0Var.f21871f;
                if (bitmap != null) {
                    b0Var2.f21871f = Bitmap.createScaledBitmap(bitmap, i11, i12, true);
                }
                map.put(str, b0Var2);
            }
        }
        this.f21930e = fC;
        return this.f21929d;
    }

    public final oe.i d(String str) {
        int size = this.f21932g.size();
        for (int i11 = 0; i11 < size; i11++) {
            oe.i iVar = (oe.i) this.f21932g.get(i11);
            String str2 = iVar.f32478a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return iVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f21935j.iterator();
        while (it.hasNext()) {
            sb2.append(((re.h) it.next()).a("\t"));
        }
        return sb2.toString();
    }
}
