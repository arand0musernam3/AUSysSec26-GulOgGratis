package cy;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends g0 {

    @NotNull
    public static final Parcelable.Creator<p> CREATOR = new b(5);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13552e;

    public p(Parcel parcel) {
        super(0, parcel);
        this.f13552e = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // cy.c0
    public final String e() {
        return this.f13552e;
    }

    @Override // cy.c0
    public final int k(r rVar) {
        rVar.getClass();
        boolean z11 = ax.a0.f4862o && tx.j.b() != null && rVar.f13553a.a();
        String strT = b0.z.t();
        d().e();
        String str = rVar.f13556d;
        Set set = rVar.f13554b;
        boolean zA = rVar.a();
        e eVar = rVar.f13555c;
        if (eVar == null) {
            eVar = e.NONE;
        }
        e eVar2 = eVar;
        String strC = c(rVar.f13559g);
        String str2 = rVar.f13562j;
        String str3 = rVar.l;
        boolean z12 = rVar.f13564m;
        boolean z13 = rVar.f13566o;
        boolean z14 = rVar.f13567p;
        String str4 = rVar.f13568q;
        a aVar = rVar.f13571t;
        if (aVar != null) {
            aVar.name();
        }
        String str5 = rVar.f13557e;
        String str6 = rVar.f13558f;
        tx.h0 h0Var = tx.h0.f40515a;
        ArrayList<Intent> arrayList = null;
        if (!yx.a.f46339a.contains(tx.h0.class)) {
            try {
                str.getClass();
                set.getClass();
                eVar2.getClass();
                str2.getClass();
                ArrayList arrayList2 = tx.h0.f40516b;
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    boolean z15 = z13;
                    String str7 = str4;
                    String str8 = str5;
                    boolean z16 = z14;
                    boolean z17 = z12;
                    Intent intentC = tx.h0.f40515a.c((tx.g0) it.next(), str, set, strT, zA, eVar2, strC, str2, z11, str3, z17, f0.FACEBOOK, z15, z16, str7, str8, str6);
                    if (intentC != null) {
                        arrayList3.add(intentC);
                    }
                    z12 = z17;
                    z13 = z15;
                    z14 = z16;
                    str4 = str7;
                    str5 = str8;
                }
                arrayList = arrayList3;
            } catch (Throwable th2) {
                yx.a.a(tx.h0.class, th2);
            }
        }
        a("e2e", strT);
        int i11 = 0;
        for (Intent intent : arrayList) {
            i11++;
            tx.h.Login.a();
            if (t(intent)) {
                return i11;
            }
        }
        return 0;
    }

    public p(u uVar) {
        super(uVar);
        this.f13552e = "katana_proxy_auth";
    }
}
