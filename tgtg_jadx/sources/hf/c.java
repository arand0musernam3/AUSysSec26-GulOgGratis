package hf;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import ky.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ye.b f22012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f22013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ub.a f22014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f22015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f22016f;

    public c(ye.b bVar, ye.g gVar, int i11) {
        this.f22011a = i11;
        gVar.getClass();
        switch (i11) {
            case 1:
                this.f22012b = bVar;
                ArrayList arrayList = new ArrayList();
                this.f22016f = arrayList;
                StringBuilder sb2 = new StringBuilder("amplitude-android-");
                String str = gVar.f45890e;
                sb2.append(str);
                this.f22013c = a(gVar, "amplitude-disk-queue", sb2.toString());
                this.f22015e = a(gVar, "amplitude-identify-intercept-disk-queue", "amplitude-identify-intercept-" + str);
                File dir = gVar.f45887b.getDir("amplitude-kotlin-" + str, 0);
                String str2 = gVar.f45890e;
                String str3 = gVar.f45886a;
                p pVar = gVar.f45899o;
                kf.b bVarV = gVar.f45892g.v(bVar);
                String strK = e0.f.k("amplitude-identity-", str);
                dir.getClass();
                xf.b bVar2 = new xf.b(str2, str3, pVar, dir, strK, bVarV);
                arrayList.add(dir);
                this.f22014d = new ub.a(bVar2);
                break;
            default:
                this.f22012b = bVar;
                ArrayList arrayList2 = new ArrayList();
                this.f22016f = arrayList2;
                String str4 = gVar.f45886a;
                this.f22013c = a(gVar, "amplitude-disk-queue", "amplitude-android-".concat(str4));
                this.f22015e = a(gVar, "amplitude-identify-intercept-disk-queue", "amplitude-identify-intercept-".concat(str4));
                Context context = gVar.f45887b;
                StringBuilder sb3 = new StringBuilder("amplitude-kotlin-");
                String str5 = gVar.f45890e;
                sb3.append(str5);
                File dir2 = context.getDir(sb3.toString(), 0);
                String str6 = gVar.f45890e;
                p pVar2 = gVar.f45899o;
                kf.b bVarV2 = gVar.f45892g.v(bVar);
                String strK2 = e0.f.k("amplitude-identity-", str5);
                dir2.getClass();
                xf.b bVar3 = new xf.b(str6, str4, pVar2, dir2, strK2, bVarV2);
                arrayList2.add(dir2);
                this.f22014d = new ub.a(bVar3);
                break;
        }
    }

    public final g a(ye.g gVar, String str, String str2) {
        switch (this.f22011a) {
            case 0:
                File dir = gVar.f45887b.getDir(str, 0);
                dir.getClass();
                this.f22016f.add(dir);
                SharedPreferences sharedPreferences = gVar.f45887b.getSharedPreferences(str2, 0);
                String str3 = gVar.f45886a;
                se.d dVar = gVar.f45892g;
                ye.b bVar = this.f22012b;
                kf.b bVarV = dVar.v(bVar);
                sharedPreferences.getClass();
                return new g(str3, bVarV, sharedPreferences, dir, bVar.f45863m, new e.b(this, 9));
            default:
                File dir2 = gVar.f45887b.getDir(str, 0);
                dir2.getClass();
                this.f22016f.add(dir2);
                SharedPreferences sharedPreferences2 = gVar.f45887b.getSharedPreferences(str2, 0);
                String str4 = gVar.f45890e;
                se.d dVar2 = gVar.f45892g;
                ye.b bVar2 = this.f22012b;
                kf.b bVarV2 = dVar2.v(bVar2);
                sharedPreferences2.getClass();
                return new g(str4, bVarV2, sharedPreferences2, dir2, bVar2.f45863m, new e.b(this, 10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(z70.c r10) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.c.b(z70.c):java.lang.Object");
    }
}
