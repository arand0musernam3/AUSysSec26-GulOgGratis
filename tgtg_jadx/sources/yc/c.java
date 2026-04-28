package yc;

import android.graphics.Bitmap;
import ed.k;
import java.util.Date;
import kotlin.text.StringsKt;
import q90.g0;
import q90.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f45832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f45833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Date f45834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Date f45836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f45837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Date f45838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f45839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f45840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f45841j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f45842k;

    public c(g0 g0Var, b bVar) {
        int i11;
        this.f45832a = g0Var;
        this.f45833b = bVar;
        this.f45842k = -1;
        if (bVar != null) {
            this.f45839h = bVar.f45828c;
            this.f45840i = bVar.f45829d;
            t tVar = bVar.f45831f;
            int size = tVar.size();
            for (int i12 = 0; i12 < size; i12++) {
                String strD = tVar.d(i12);
                if (strD.equalsIgnoreCase("Date")) {
                    String strB = tVar.b("Date");
                    this.f45834c = strB != null ? v90.c.a(strB) : null;
                    this.f45835d = tVar.g(i12);
                } else if (strD.equalsIgnoreCase("Expires")) {
                    String strB2 = tVar.b("Expires");
                    this.f45838g = strB2 != null ? v90.c.a(strB2) : null;
                } else if (strD.equalsIgnoreCase("Last-Modified")) {
                    String strB3 = tVar.b("Last-Modified");
                    this.f45836e = strB3 != null ? v90.c.a(strB3) : null;
                    this.f45837f = tVar.g(i12);
                } else if (strD.equalsIgnoreCase("ETag")) {
                    this.f45841j = tVar.g(i12);
                } else if (strD.equalsIgnoreCase("Age")) {
                    String strG = tVar.g(i12);
                    Bitmap.Config[] configArr = k.f15927a;
                    Long lD0 = StringsKt.d0(strG);
                    if (lD0 != null) {
                        long jLongValue = lD0.longValue();
                        i11 = jLongValue > 2147483647L ? Integer.MAX_VALUE : jLongValue < 0 ? 0 : (int) jLongValue;
                    } else {
                        i11 = -1;
                    }
                    this.f45842k = i11;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, u70.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yc.d a() {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.c.a():yc.d");
    }
}
