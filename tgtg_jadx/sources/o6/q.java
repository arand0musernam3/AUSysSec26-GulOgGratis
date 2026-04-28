package o6;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f32022f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f32023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f32026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32027e;

    public final void a(ArrayList arrayList) {
        int size = this.f32023a.size();
        if (this.f32027e != -1 && size > 0) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                q qVar = (q) arrayList.get(i11);
                if (this.f32027e == qVar.f32024b) {
                    c(this.f32025c, qVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(g6.c cVar, int i11) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f32023a;
        if (arrayList.size() == 0) {
            return 0;
        }
        n6.h hVar = (n6.h) ((n6.g) arrayList.get(0)).W;
        cVar.t();
        hVar.c(cVar, false);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ((n6.g) arrayList.get(i12)).c(cVar, false);
        }
        if (i11 == 0 && hVar.E0 > 0) {
            n6.n.a(hVar, cVar, arrayList, 0);
        }
        if (i11 == 1 && hVar.F0 > 0) {
            n6.n.a(hVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e5) {
            System.err.println(e5.toString() + "\n" + Arrays.toString(e5.getStackTrace()).replace("[", "   at ").replace(MessageLogView.COMMA_SEPARATOR, "\n   at").replace("]", ""));
        }
        this.f32026d = new ArrayList();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            n6.g gVar = (n6.g) arrayList.get(i13);
            ky.p pVar = new ky.p(7);
            new WeakReference(gVar);
            g6.c.n(gVar.K);
            g6.c.n(gVar.L);
            g6.c.n(gVar.M);
            g6.c.n(gVar.N);
            g6.c.n(gVar.O);
            this.f32026d.add(pVar);
        }
        if (i11 == 0) {
            iN = g6.c.n(hVar.K);
            iN2 = g6.c.n(hVar.M);
            cVar.t();
        } else {
            iN = g6.c.n(hVar.L);
            iN2 = g6.c.n(hVar.N);
            cVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i11, q qVar) {
        int i12 = qVar.f32024b;
        for (n6.g gVar : this.f32023a) {
            ArrayList arrayList = qVar.f32023a;
            if (!arrayList.contains(gVar)) {
                arrayList.add(gVar);
            }
            if (i11 == 0) {
                gVar.t0 = i12;
            } else {
                gVar.f30613u0 = i12;
            }
        }
        this.f32027e = i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i11 = this.f32025c;
        sb2.append(i11 == 0 ? "Horizontal" : i11 == 1 ? "Vertical" : i11 == 2 ? "Both" : "Unknown");
        sb2.append(" [");
        String strI = r8.k.i(this.f32024b, "] <", sb2);
        for (n6.g gVar : this.f32023a) {
            StringBuilder sbR = e0.f.r(strI, " ");
            sbR.append(gVar.f30596l0);
            strI = sbR.toString();
        }
        return strI.concat(" >");
    }
}
