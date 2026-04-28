package fr;

import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import ao.g3;
import ao.r1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import u70.l;
import u70.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfr/i;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f17887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g3 f17888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rg.d f17889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r1 f17890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final er.a f17891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f17892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f17893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f17894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f17895i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f17896j;

    public i(c1 c1Var, g3 g3Var, rg.d dVar, r1 r1Var, er.a aVar) {
        c1Var.getClass();
        g3Var.getClass();
        dVar.getClass();
        r1Var.getClass();
        aVar.getClass();
        this.f17887a = c1Var;
        this.f17888b = g3Var;
        this.f17889c = dVar;
        this.f17890d = r1Var;
        this.f17891e = aVar;
        this.f17892f = l.b(new eu.a(10));
        this.f17893g = l.b(new eu.a(11));
        this.f17894h = l.b(new eu.a(12));
        this.f17895i = l.b(new eu.a(13));
    }

    public final boolean a() {
        String str = (String) this.f17887a.a("ACTION");
        if (Intrinsics.areEqual(str, a.DELETE_ACCOUNT.toString())) {
            return true;
        }
        Intrinsics.areEqual(str, a.SEND_DATA.toString());
        return false;
    }
}
