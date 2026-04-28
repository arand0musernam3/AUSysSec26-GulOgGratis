package zc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f47491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorSpace f47492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ad.h f47493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ad.g f47494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f47495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f47496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f47497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f47498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q90.t f47499j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s f47500k;
    public final p l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f47501m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f47502n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f47503o;

    public n(Context context, Bitmap.Config config, ColorSpace colorSpace, ad.h hVar, ad.g gVar, boolean z11, boolean z12, boolean z13, String str, q90.t tVar, s sVar, p pVar, b bVar, b bVar2, b bVar3) {
        this.f47490a = context;
        this.f47491b = config;
        this.f47492c = colorSpace;
        this.f47493d = hVar;
        this.f47494e = gVar;
        this.f47495f = z11;
        this.f47496g = z12;
        this.f47497h = z13;
        this.f47498i = str;
        this.f47499j = tVar;
        this.f47500k = sVar;
        this.l = pVar;
        this.f47501m = bVar;
        this.f47502n = bVar2;
        this.f47503o = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f47490a, nVar.f47490a) && this.f47491b == nVar.f47491b && Intrinsics.areEqual(this.f47492c, nVar.f47492c) && Intrinsics.areEqual(this.f47493d, nVar.f47493d) && this.f47494e == nVar.f47494e && this.f47495f == nVar.f47495f && this.f47496g == nVar.f47496g && this.f47497h == nVar.f47497h && Intrinsics.areEqual(this.f47498i, nVar.f47498i) && Intrinsics.areEqual(this.f47499j, nVar.f47499j) && Intrinsics.areEqual(this.f47500k, nVar.f47500k) && Intrinsics.areEqual(this.l, nVar.l) && this.f47501m == nVar.f47501m && this.f47502n == nVar.f47502n && this.f47503o == nVar.f47503o;
    }

    public final int hashCode() {
        int iHashCode = (this.f47491b.hashCode() + (this.f47490a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f47492c;
        int iE = r8.k.e(r8.k.e(r8.k.e((this.f47494e.hashCode() + ((this.f47493d.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f47495f), 31, this.f47496g), 31, this.f47497h);
        String str = this.f47498i;
        return this.f47503o.hashCode() + ((this.f47502n.hashCode() + ((this.f47501m.hashCode() + a0.f(this.l.f47507a, a0.f(this.f47500k.f47516a, (((iE + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f47499j.f36614a)) * 31, 31), 31)) * 31)) * 31);
    }
}
