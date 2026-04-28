package oe;

import java.util.ArrayList;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f32468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f32469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f32470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f32471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f32472e;

    public e(ArrayList arrayList, char c3, double d3, String str, String str2) {
        this.f32468a = arrayList;
        this.f32469b = c3;
        this.f32470c = d3;
        this.f32471d = str;
        this.f32472e = str2;
    }

    public static int a(char c3, String str, String str2) {
        return str2.hashCode() + l1.b(c3 * 31, 31, str);
    }

    public final int hashCode() {
        return a(this.f32469b, this.f32472e, this.f32471d);
    }
}
