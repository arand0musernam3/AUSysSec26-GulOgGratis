package com.braze.triggers.conditions.logical;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends b {
    public a(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        Iterator it = this.f10821a.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (!((com.braze.triggers.conditions.c) it.next()).a(bVar)) {
                return false;
            }
            z11 = true;
        }
        return z11;
    }
}
