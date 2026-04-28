package jy;

import android.os.Build;
import d40.t1;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0.e f25451b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(a0.e eVar, int i11) {
        super(0);
        this.f25450a = i11;
        this.f25451b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f25450a) {
            case 0:
                ((se.d) this.f25451b.f60k).r("accessibility_enabled").getClass();
                return new b();
            case 1:
                ((se.d) this.f25451b.f60k).o("adb_enabled").getClass();
                return new c();
            case 2:
                ((se.d) this.f25451b.f60k).s("alarm_alert").getClass();
                return new d();
            case 3:
                Object objH = t1.H(3000L, new ky.n((ky.o) this.f25451b.f59j, 0));
                kotlin.collections.n0 n0Var = kotlin.collections.n0.f26529a;
                if (objH instanceof u70.p) {
                    objH = n0Var;
                }
                return new f((List) objH);
            case 4:
                Object objH2 = t1.H(1000L, new ky.f((j30.g) this.f25451b.l, 0));
                String[] strArr = new String[0];
                if (objH2 instanceof u70.p) {
                    objH2 = strArr;
                }
                return new g(kotlin.collections.y.T((String[]) objH2));
            case 5:
                Object objH3 = t1.H(1000L, new ky.a((ky.b) this.f25451b.f54e, 1));
                if (objH3 instanceof u70.p) {
                    objH3 = "";
                }
                ((String) objH3).getClass();
                return new h();
            case 6:
                Object objH4 = t1.H(1000L, new ky.a((ky.b) this.f25451b.f54e, 1));
                if (objH4 instanceof u70.p) {
                    objH4 = "";
                }
                ((String) objH4).getClass();
                return new i();
            case 7:
                Object objH5 = t1.H(1000L, new ky.a((ky.b) this.f25451b.f54e, 0));
                if (objH5 instanceof u70.p) {
                    objH5 = "";
                }
                ((String) objH5).getClass();
                return new j();
            case 8:
                Object objH6 = t1.H(1000L, new ky.e((n20.f) this.f25451b.f55f, 11));
                kotlin.collections.n0 n0Var2 = kotlin.collections.n0.f26529a;
                if (objH6 instanceof u70.p) {
                    objH6 = n0Var2;
                }
                return new k((List) objH6);
            case 9:
                Object objH7 = t1.H(1000L, new defpackage.a((lz.i) this.f25451b.f57h, 28));
                List list = kotlin.collections.n0.f26529a;
                if (objH7 instanceof u70.p) {
                    objH7 = list;
                }
                List list2 = (List) objH7;
                if (list2 != null) {
                    list = list2;
                }
                return new l(list);
            case 10:
                ((se.d) this.f25451b.f60k).o("data_roaming").getClass();
                return new n();
            case 11:
                ((se.d) this.f25451b.f60k).s("date_format").getClass();
                return new o();
            case 12:
                ((se.d) this.f25451b.f60k).r("default_input_method").getClass();
                return new p();
            case 13:
                ((se.d) this.f25451b.f60k).o("development_settings_enabled").getClass();
                return new r();
            case 14:
                Object objH8 = t1.H(1000L, new ky.g((k8.d) this.f25451b.f58i, 0));
                if (objH8 instanceof u70.p) {
                    objH8 = "";
                }
                ((String) objH8).getClass();
                return new s();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((se.d) this.f25451b.f60k).s("end_button_behavior").getClass();
                return new t();
            case 16:
                Object objH9 = t1.H(1000L, new defpackage.a((jb.b) this.f25451b.f61m, 29));
                ky.h hVar = ky.h.UNKNOWN;
                if (objH9 instanceof u70.p) {
                    objH9 = hVar;
                }
                ((ky.h) objH9).a().getClass();
                return new u();
            case 17:
                ((se.d) this.f25451b.f60k).s("font_scale").getClass();
                return new z();
            case 18:
                Object objH10 = t1.H(1000L, new ky.i((se.d) this.f25451b.f56g, 0));
                if (objH10 instanceof u70.p) {
                    objH10 = "";
                }
                ((String) objH10).getClass();
                return new a0();
            case 19:
                ((se.d) this.f25451b.f60k).o("http_proxy").getClass();
                return new b0();
            case 20:
                Object objH11 = t1.H(1000L, new ky.i((jd.f) this.f25451b.f53d, 1));
                kotlin.collections.n0 n0Var3 = kotlin.collections.n0.f26529a;
                if (objH11 instanceof u70.p) {
                    objH11 = n0Var3;
                }
                return new c0((List) objH11);
            case 21:
                Object objH12 = t1.H(1000L, new ky.i((jd.f) this.f25451b.f53d, 1));
                kotlin.collections.n0 n0Var4 = kotlin.collections.n0.f26529a;
                if (objH12 instanceof u70.p) {
                    objH12 = n0Var4;
                }
                return new d0((List) objH12);
            case 22:
                Object objH13 = t1.H(1000L, new ky.g((k8.d) this.f25451b.f58i, 1));
                Boolean bool = Boolean.FALSE;
                if (objH13 instanceof u70.p) {
                    objH13 = bool;
                }
                ((Boolean) objH13).getClass();
                return new e0();
            case 23:
                Object objH14 = t1.H(1000L, new ky.e((qb.e) this.f25451b.f50a, 12));
                kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
                o0Var.getClass();
                if (objH14 instanceof u70.p) {
                    objH14 = o0Var;
                }
                ((Map) objH14).getClass();
                return new i0();
            case 24:
                Object objH15 = t1.H(1000L, new ky.e((qb.e) this.f25451b.f50a, 13));
                ky.d dVar = ky.d.f26688c;
                if (objH15 instanceof u70.p) {
                    objH15 = dVar;
                }
                ky.d dVar2 = (ky.d) objH15;
                dVar2.getClass();
                j0 j0Var = new j0();
                List list3 = dVar2.f26689a;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list3) {
                    Set set = j0.f25442d;
                    String lowerCase = ((String) ((Pair) obj).f26485a).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (!set.contains(lowerCase)) {
                        arrayList.add(obj);
                    }
                }
                List<List> list4 = dVar2.f26690b;
                ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.o(list4, 10));
                for (List list5 : list4) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list5) {
                        Set set2 = j0.f25443e;
                        String lowerCase2 = ((String) ((Pair) obj2).f26485a).toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        if (!set2.contains(lowerCase2)) {
                            arrayList3.add(obj2);
                        }
                    }
                    arrayList2.add(arrayList3);
                }
                new ky.d(arrayList, arrayList2);
                return j0Var;
            case 25:
                Object objH16 = t1.H(1000L, new ky.f((j30.g) this.f25451b.l, 1));
                if (objH16 instanceof u70.p) {
                    objH16 = "";
                }
                ((String) objH16).getClass();
                return new k0();
            case 26:
                Object objH17 = t1.H(1000L, new ky.f((j30.g) this.f25451b.l, 2));
                if (objH17 instanceof u70.p) {
                    objH17 = "";
                }
                ((String) objH17).getClass();
                return new l0();
            case 27:
                (Build.VERSION.SDK_INT >= 28 ? ((se.d) this.f25451b.f60k).r("rtt_calling_mode") : "").getClass();
                return new m0();
            case 28:
                ((se.d) this.f25451b.f60k).s("screen_off_timeout").getClass();
                return new n0();
            default:
                Object objH18 = t1.H(1000L, new ky.i((jb.b) this.f25451b.f52c, 2));
                kotlin.collections.n0 n0Var5 = kotlin.collections.n0.f26529a;
                if (objH18 instanceof u70.p) {
                    objH18 = n0Var5;
                }
                return new q0((List) objH18);
        }
    }
}
