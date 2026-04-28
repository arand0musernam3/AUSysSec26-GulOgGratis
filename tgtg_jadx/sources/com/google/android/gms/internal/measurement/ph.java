package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ph extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f11763b;

    public ph(la laVar, la laVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, laVar);
        d(linkedHashMap, laVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((tg) entry.getKey()).f11909c) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.f11763b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void d(LinkedHashMap linkedHashMap, la laVar) {
        for (int i11 = 0; i11 < laVar.a(); i11++) {
            tg tgVarI = laVar.i(i11);
            Object obj = linkedHashMap.get(tgVarI);
            boolean z11 = tgVarI.f11909c;
            Class cls = tgVarI.f11908b;
            if (z11) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(tgVarI, arrayList);
                }
                arrayList.add(cls.cast(laVar.j(i11)));
            } else {
                linkedHashMap.put(tgVarI, cls.cast(laVar.j(i11)));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final void a(lh lhVar, gh ghVar) {
        for (Map.Entry entry : this.f11763b.entrySet()) {
            tg tgVar = (tg) entry.getKey();
            Object value = entry.getValue();
            if (tgVar.f11909c) {
                lhVar.b(tgVar, ((List) value).iterator(), ghVar);
            } else {
                lhVar.a(tgVar, value, ghVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final int b() {
        return this.f11763b.size();
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final Set c() {
        return this.f11763b.keySet();
    }
}
