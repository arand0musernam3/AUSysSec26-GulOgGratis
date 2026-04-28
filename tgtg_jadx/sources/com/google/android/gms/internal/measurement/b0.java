package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends androidx.datastore.preferences.protobuf.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f11266d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dh f11267c;

    static {
        EnumMap enumMap = new EnumMap(dh.class);
        for (dh dhVar : dh.values()) {
            b0[] b0VarArr = new b0[10];
            for (int i11 = 0; i11 < 10; i11++) {
                b0VarArr[i11] = new b0(i11, dhVar, eh.f11395e);
            }
            enumMap.put(dhVar, b0VarArr);
        }
        f11266d = Collections.unmodifiableMap(enumMap);
    }

    public b0(int i11, dh dhVar, eh ehVar) {
        super(ehVar, i11);
        g1.c(dhVar, "format char");
        this.f11267c = dhVar;
        if (ehVar.a()) {
            return;
        }
        int iC = dhVar.c();
        iC = ehVar.c() ? iC & 65503 : iC;
        StringBuilder sb2 = new StringBuilder("%");
        ehVar.d(sb2);
        sb2.append((char) iC);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void z(wf wfVar, Object obj) {
        wfVar.e(obj, this.f11267c, (eh) this.f2988b);
    }
}
