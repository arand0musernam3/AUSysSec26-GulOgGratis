package jb;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import ib.g0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import m2.c2;
import o00.x0;
import v80.f0;
import v80.j1;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qb.o f24866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f24867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sb.a f24869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ib.b f24870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ib.y f24871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f24872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WorkDatabase f24873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qb.w f24874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qb.b f24875j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f24876k;
    public final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j1 f24877m;

    public d0(g40.b bVar) {
        qb.o oVar = (qb.o) bVar.f20004e;
        this.f24866a = oVar;
        this.f24867b = (Context) bVar.f20006g;
        String str = oVar.f36828a;
        this.f24868c = str;
        this.f24869d = (sb.a) bVar.f20001b;
        ib.b bVar2 = (ib.b) bVar.f20000a;
        this.f24870e = bVar2;
        this.f24871f = bVar2.f23695d;
        this.f24872g = (f) bVar.f20002c;
        WorkDatabase workDatabase = (WorkDatabase) bVar.f20003d;
        this.f24873h = workDatabase;
        this.f24874i = workDatabase.x();
        this.f24875j = workDatabase.s();
        ArrayList arrayList = (ArrayList) bVar.f20005f;
        this.f24876k = arrayList;
        this.l = r8.k.p(e0.f.s("Work [ id=", str, ", tags={ "), CollectionsKt.U(arrayList, MessageLogView.COMMA_SEPARATOR, null, null, null, 62), " } ]");
        this.f24877m = f0.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0290  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(final jb.d0 r22, z70.c r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.d0.a(jb.d0, z70.c):java.lang.Object");
    }

    public final void b(int i11) {
        g0 g0Var = g0.ENQUEUED;
        qb.w wVar = this.f24874i;
        String str = this.f24868c;
        wVar.j(g0Var, str);
        this.f24871f.getClass();
        wVar.i(System.currentTimeMillis(), str);
        wVar.h(this.f24866a.f36848v, str);
        wVar.g(-1L, str);
        wVar.k(i11, str);
    }

    public final void c() {
        this.f24871f.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        qb.w wVar = this.f24874i;
        String str = this.f24868c;
        wVar.i(jCurrentTimeMillis, str);
        wVar.j(g0.ENQUEUED, str);
        y9.v vVar = wVar.f36870a;
        ((Number) x0.A(vVar, false, true, new qb.s(str, 2))).intValue();
        wVar.h(this.f24866a.f36848v, str);
        x0.A(vVar, false, true, new qb.s(str, 3));
        wVar.g(-1L, str);
    }

    public final void d(ib.u uVar) {
        uVar.getClass();
        String str = this.f24868c;
        ArrayList arrayListJ = kotlin.collections.d0.j(str);
        while (true) {
            boolean zIsEmpty = arrayListJ.isEmpty();
            qb.w wVar = this.f24874i;
            if (zIsEmpty) {
                ib.h hVar = ((ib.r) uVar).f23758a;
                hVar.getClass();
                wVar.h(this.f24866a.f36848v, str);
                x0.A(wVar.f36870a, false, true, new c2(22, hVar, str));
                return;
            }
            String str2 = (String) i0.x(arrayListJ);
            if (wVar.d(str2) != g0.CANCELLED) {
                wVar.j(g0.FAILED, str2);
            }
            arrayListJ.addAll(this.f24875j.a(str2));
        }
    }
}
