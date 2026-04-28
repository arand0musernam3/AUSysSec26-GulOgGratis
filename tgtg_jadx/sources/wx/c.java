package wx;

import a40.h;
import a40.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.collections.s0;
import n80.p;
import org.json.JSONArray;
import tx.n0;
import vx.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f43540a = new AtomicBoolean(false);

    public static final void a() {
        File[] fileArrListFiles;
        if (yx.a.f46339a.contains(c.class)) {
            return;
        }
        try {
            if (n0.v()) {
                return;
            }
            File fileT = p30.b.t();
            if (fileT == null) {
                fileArrListFiles = new File[0];
            } else {
                fileArrListFiles = fileT.listFiles(new h(6));
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
            }
            ArrayList arrayList = new ArrayList(fileArrListFiles.length);
            for (File file : fileArrListFiles) {
                arrayList.add(ox.h.J(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((d) obj).a()) {
                    arrayList2.add(obj);
                }
            }
            List listL0 = CollectionsKt.l0(arrayList2, new i(15));
            JSONArray jSONArray = new JSONArray();
            Iterator it = p.j(0, Math.min(listL0.size(), 5)).iterator();
            while (((n80.h) it).f30715c) {
                jSONArray.put(listL0.get(((s0) it).nextInt()));
            }
            p30.b.D("anr_reports", jSONArray, new b(listL0, 0));
        } catch (Throwable th2) {
            yx.a.a(c.class, th2);
        }
    }
}
