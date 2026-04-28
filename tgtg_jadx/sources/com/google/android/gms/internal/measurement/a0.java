package com.google.android.gms.internal.measurement;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends androidx.datastore.preferences.protobuf.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f11237c;

    public a0(eh ehVar, int i11, z zVar) {
        super(ehVar, i11);
        this.f11237c = zVar;
        StringBuilder sb2 = new StringBuilder("%");
        ehVar.d(sb2);
        sb2.append(true != ehVar.c() ? 't' : 'T');
        sb2.append(zVar.c());
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void z(wf wfVar, Object obj) {
        eh ehVar = (eh) this.f2988b;
        StringBuilder sb2 = (StringBuilder) wfVar.f12017g;
        boolean z11 = obj instanceof Date;
        z zVar = this.f11237c;
        if (z11 || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb3 = new StringBuilder("%");
            ehVar.d(sb3);
            sb3.append(true != ehVar.c() ? 't' : 'T');
            sb3.append(zVar.c());
            sb2.append(String.format(hh.f11480a, sb3.toString(), obj));
            return;
        }
        char c3 = zVar.c();
        StringBuilder sb4 = new StringBuilder(String.valueOf(c3).length() + 2);
        sb4.append("%t");
        sb4.append(c3);
        wf.i(sb2, obj, sb4.toString());
    }
}
