package com.google.android.gms.internal.measurement;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends v2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Level f11737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f11738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lh f11739d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str) {
        super(str);
        Level level = Level.ALL;
        Set set = q.f11764f;
        this.f11737b = level;
        this.f11738c = q.f11764f;
        this.f11739d = q.f11765g;
    }

    @Override // com.google.android.gms.internal.measurement.v2
    public final boolean e(Level level) {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.v2
    public final void f(jg jgVar) {
        String strA = (String) jgVar.d().k(bh.f11295a);
        if (strA == null) {
            strA = (String) this.f11956a;
        }
        if (strA == null) {
            qg qgVar = jgVar.f11532d;
            if (qgVar == null) {
                com.braze.h2.b("cannot request log site information prior to postProcess()");
                return;
            }
            strA = qgVar.a();
            int iIndexOf = strA.indexOf(36, strA.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strA = strA.substring(0, iIndexOf);
            }
        }
        q.m(jgVar, h.b(strA), this.f11737b, this.f11738c, this.f11739d);
    }
}
