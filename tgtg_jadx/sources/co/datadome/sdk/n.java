package co.datadome.sdk;

import co.datadome.sdk.DataDomeSDK;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class n implements q90.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q90.p f8673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DataDomeSDK.Builder f8674b;

    @Override // q90.p
    public final void b(q90.v vVar, List list) {
        v.a("saveFromResponse cookies: " + list);
        this.f8673a.b(vVar, list);
    }

    @Override // q90.p
    public final List c(q90.v vVar) {
        List listC = this.f8673a.c(vVar);
        String strJ = this.f8674b.j();
        Pattern pattern = q90.o.f36554k;
        q90.o oVarB = q90.n.b(vVar, strJ);
        if (oVarB != null) {
            ArrayList arrayList = new ArrayList(listC);
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                if (((q90.o) arrayList.get(i11)).f36557a.equals("datadome")) {
                    v.a("removing old DataDome cookie " + ((q90.o) arrayList.get(i11)).f36558b + " from DataDomeCookieJar");
                    arrayList.remove(i11);
                    break;
                }
                i11++;
            }
            arrayList.add(oVarB);
            listC = arrayList;
        }
        v.a("loadForRequest cookies: " + listC);
        return listC;
    }
}
