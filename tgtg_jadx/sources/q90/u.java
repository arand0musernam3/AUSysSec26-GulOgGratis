package q90;

import com.braze.h2;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36615a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f36618d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f36621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f36622h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36616b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f36617c = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36619e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f36620f = kotlin.collections.d0.j("");

    public static ArrayList g(String str) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 <= str.length()) {
            int iF = StringsKt.F(str, '&', i11, false, 4);
            if (iF == -1) {
                iF = str.length();
            }
            int iF2 = StringsKt.F(str, '=', i11, false, 4);
            if (iF2 == -1 || iF2 > iF) {
                arrayList.add(str.substring(i11, iF));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i11, iF2));
                arrayList.add(str.substring(iF2 + 1, iF));
            }
            i11 = iF + 1;
        }
        return arrayList;
    }

    public final void a(String str, String str2) {
        str.getClass();
        if (this.f36621g == null) {
            this.f36621g = new ArrayList();
        }
        ArrayList arrayList = this.f36621g;
        arrayList.getClass();
        arrayList.add(fa0.a.a(str, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 0, 91));
        ArrayList arrayList2 = this.f36621g;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? fa0.a.a(str2, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 0, 91) : null);
    }

    public final v b() {
        ArrayList arrayList;
        String str = this.f36615a;
        if (str == null) {
            h2.b("scheme == null");
            return null;
        }
        String strD = fa0.a.d(0, 0, 7, this.f36616b);
        String strD2 = fa0.a.d(0, 0, 7, this.f36617c);
        String str2 = this.f36618d;
        if (str2 == null) {
            h2.b("host == null");
            return null;
        }
        int iC = c();
        ArrayList arrayList2 = this.f36620f;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.e0.o(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(fa0.a.d(0, 0, 7, (String) it.next()));
        }
        ArrayList<String> arrayList4 = this.f36621g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(kotlin.collections.e0.o(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? fa0.a.d(0, 0, 3, str3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f36622h;
        return new v(str, strD, strD2, str2, iC, arrayList3, arrayList, str4 != null ? fa0.a.d(0, 0, 7, str4) : null, toString());
    }

    public final int c() {
        int i11 = this.f36619e;
        if (i11 != -1) {
            return i11;
        }
        String str = this.f36615a;
        str.getClass();
        str.getClass();
        if (Intrinsics.areEqual(str, "http")) {
            return 80;
        }
        return Intrinsics.areEqual(str, "https") ? 443 : -1;
    }

    public final void d(String str) {
        str.getClass();
        String strB = r90.d.b(fa0.a.d(0, 0, 7, str));
        if (strB != null) {
            this.f36618d = strB;
        } else {
            i4.a.f("unexpected host: ".concat(str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(q90.v r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q90.u.e(q90.v, java.lang.String):void");
    }

    public final void f(int i11) {
        if (1 > i11 || i11 >= 65536) {
            i4.a.i(j4.s.f(i11, "unexpected port: "));
        } else {
            this.f36619e = i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q90.u.toString():java.lang.String");
    }
}
